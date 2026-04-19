package d8;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;

/* JADX INFO: loaded from: classes.dex */
public class d implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f9783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e8.d f9784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f9785c;

    public d(Context context, e8.d dVar, f fVar) {
        this.f9783a = context;
        this.f9784b = dVar;
        this.f9785c = fVar;
    }

    private boolean d(JobScheduler jobScheduler, int i10, int i11) {
        for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
            int i12 = jobInfo.getExtras().getInt("attemptNumber");
            if (jobInfo.getId() == i10) {
                return i12 >= i11;
            }
        }
        return false;
    }

    @Override // d8.x
    public void a(w7.o oVar, int i10) {
        b(oVar, i10, false);
    }

    @Override // d8.x
    public void b(w7.o oVar, int i10, boolean z10) {
        ComponentName componentName = new ComponentName(this.f9783a, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f9783a.getSystemService("jobscheduler");
        int iC = c(oVar);
        if (!z10 && d(jobScheduler, iC, i10)) {
            a8.a.b("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", oVar);
            return;
        }
        long jS = this.f9784b.S(oVar);
        JobInfo.Builder builderC = this.f9785c.c(new JobInfo.Builder(iC, componentName), oVar.d(), jS, i10);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i10);
        persistableBundle.putString("backendName", oVar.b());
        persistableBundle.putInt("priority", h8.a.a(oVar.d()));
        if (oVar.c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(oVar.c(), 0));
        }
        builderC.setExtras(persistableBundle);
        a8.a.c("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", oVar, Integer.valueOf(iC), Long.valueOf(this.f9785c.g(oVar.d(), jS, i10)), Long.valueOf(jS), Integer.valueOf(i10));
        jobScheduler.schedule(builderC.build());
    }

    int c(w7.o oVar) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f9783a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(oVar.b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(h8.a.a(oVar.d())).array());
        if (oVar.c() != null) {
            adler32.update(oVar.c());
        }
        return (int) adler32.getValue();
    }
}
