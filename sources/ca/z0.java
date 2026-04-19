package ca;

import android.app.Application;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzag;
import com.google.android.gms.internal.p002firebaseauthapi.zzagm;
import com.google.android.gms.internal.p002firebaseauthapi.zzx;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaTasksClient;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class z0 implements Continuation<zzagm, Task<RecaptchaTasksClient>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f6783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ w0 f6784b;

    z0(w0 w0Var, String str) {
        this.f6783a = str;
        this.f6784b = w0Var;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Task<RecaptchaTasksClient> then(Task<zzagm> task) {
        if (!task.isSuccessful()) {
            return Tasks.forException(new x0((String) w8.m.k(((Exception) w8.m.k(task.getException())).getMessage())));
        }
        zzagm result = task.getResult();
        String strZza = result.zza();
        if (zzag.zzc(strZza)) {
            return Tasks.forException(new x0("No Recaptcha Enterprise siteKey configured for tenant/project " + this.f6783a));
        }
        List<String> listZza = zzx.zza('/').zza((CharSequence) strZza);
        String str = listZza.size() != 4 ? null : listZza.get(3);
        if (TextUtils.isEmpty(str)) {
            return Tasks.forException(new Exception("Invalid siteKey format " + strZza));
        }
        if (Log.isLoggable("RecaptchaHandler", 4)) {
            Log.i("RecaptchaHandler", "Successfully obtained site key for tenant " + this.f6783a);
        }
        w0 w0Var = this.f6784b;
        Task<RecaptchaTasksClient> taskA = w0Var.f6772f.a((Application) w0Var.f6770d.l(), str);
        w0.c(this.f6784b, result, taskA, this.f6783a);
        return taskA;
    }
}
