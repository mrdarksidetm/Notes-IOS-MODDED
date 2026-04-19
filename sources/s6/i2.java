package s6;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.security.SecureRandom;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import u6.f;

/* JADX INFO: loaded from: classes.dex */
public class i2 implements f.b, f.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ScheduledExecutorService f20147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ScheduledFuture<?> f20148c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f20151f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecureRandom f20146a = new SecureRandom();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f20149d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Long f20150e = null;

    public i2(Context context) {
        this.f20151f = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        g();
        f();
    }

    @Override // u6.f.b
    public String a() {
        return c(Long.valueOf(System.currentTimeMillis()));
    }

    @Override // u6.f.b
    public void a(int i10) {
        int i11 = this.f20149d;
        if ((i11 & i10) == i10) {
            return;
        }
        this.f20149d = i11 + i10;
        Log.v(f1.b(f1.c("74280E66AE")), String.format(f1.a("71250664AC270F558B545C583D621F33EB070A4D6916346D42F9363A388EA93F067217"), Integer.valueOf(this.f20149d)));
        d(f1.b(f1.c("721C2A4BE96E0F")) + this.f20149d);
    }

    @Override // u6.f.b
    public String b() {
        StringBuilder sb2;
        String str;
        if (this.f20149d == 255) {
            sb2 = new StringBuilder();
            str = "732B016DE96E0F";
        } else {
            sb2 = new StringBuilder();
            str = "65310166A02D4801C954";
        }
        sb2.append(f1.a(str));
        sb2.append(this.f20149d);
        return sb2.toString();
    }

    public final String c(Long l10) {
        String str;
        if (this.f20150e == null) {
            str = "7E2A067CA02243489E1D5353";
        } else {
            long jLongValue = l10.longValue() - this.f20150e.longValue();
            str = jLongValue < 0 ? "632D026D9A3A4142A1064F5B23" : jLongValue < 10000 ? "76271B61BF26" : "792B1B5ABC2D41488A13";
        }
        return f1.a(str);
    }

    @Override // u6.f.a
    public void c() {
        Log.v(f1.b(f1.c("74280E66AE")), String.format(f1.a("71250664AC270F558B545C583D621F33EB070A4D6916346D42F9363A388EA93F067217"), Integer.valueOf(this.f20149d)));
        d(f1.b(f1.c("721C2A4BE96E0F")) + this.f20149d);
        f();
    }

    public final void d(String str) {
        if (this.f20151f != null) {
            Intent intent = new Intent(f1.a("03770B6AF9204D14D0435B03613F1F65FB5613172B43613151BB797E3B95B9370F7C0B31F1711F18D0425F04336B4F36A7521E4A2C44613D01ED232C6E95B53B"));
            intent.setPackage(this.f20151f.getPackageName());
            intent.putExtra(f1.b(f1.c("53251B69")), str);
            this.f20151f.sendBroadcast(intent);
        }
    }

    public final void f() {
        String strA;
        String strB;
        int iNextInt = this.f20146a.nextInt(4);
        if (iNextInt == 0) {
            strA = f1.a("643D1C7CAC2E");
            strB = f1.b(f1.c("76641D6DBA2C5A5387111D5230641037FB425E403C1333645CF978766785E9211764"));
        } else if (iNextInt == 1) {
            strA = f1.a("67251D6BAC2F");
            strB = f1.b(f1.c("723C1F6DAA37464F83545F5D3F691920BF005F5B3C173D7C10B76E7664D7AC2F"));
        } else if (iNextInt == 2) {
            Log.d(f1.a("643D1C7CAC2E"), f1.b(f1.c("722A1B7AB063414E90545B5B24631872BF")));
            d(f1.a("7F06"));
            this.f20150e = Long.valueOf(System.currentTimeMillis());
        } else if (iNextInt != 3) {
            strA = f1.a("643D1C7CAC2E");
            strB = f1.b(f1.c("792B4F7BAC31594887111D44246F103BEC0A4F4B3C163D7A0AF96E736599E86A1764"));
        } else {
            strA = f1.a("643D1C7CAC2E");
            strB = f1.b(f1.c("76641D6DBA2C5A5387111D5230641037FB425E403C1333645CF9537B7A92FB6E45212D7DAF254A53CA17515B22685272BF"));
        }
        Log.w(strA, strB);
        d(f1.a("7F06"));
        this.f20150e = Long.valueOf(System.currentTimeMillis());
    }

    public final void g() {
        try {
            Thread.sleep(this.f20146a.nextInt(3500) + 1000);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public void h() {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
        this.f20147b = scheduledExecutorServiceNewScheduledThreadPool;
        this.f20148c = scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(new Runnable() { // from class: s6.h2
            @Override // java.lang.Runnable
            public final void run() {
                this.f20128a.e();
            }
        }, 0L, 5L, TimeUnit.SECONDS);
    }
}
