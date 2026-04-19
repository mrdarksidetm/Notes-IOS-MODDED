package s6;

import android.content.Context;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import u6.c;

/* JADX INFO: loaded from: classes.dex */
public class d3 extends u6.c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f20047l = f1.a("7F06");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f20048m = f1.b(f1.c("5A2B0161BD2C5D488A13"));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f20049h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ScheduledExecutorService f20050i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ScheduledFuture<?> f20051j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final u6.k f20052k;

    public d3(h3 h3Var, u6.k kVar) {
        super(h3Var);
        this.f20049h = System.currentTimeMillis();
        this.f20052k = kVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ n0 B(String str) {
        t(f1.a("523C0A6BBC37464E8A2749552568"), str);
        return new n0(false, true, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void D(final String str) {
        synchronized (this) {
            A(b(new c.a() { // from class: s6.b3
                @Override // u6.c.a
                public final n0 run() {
                    return this.f20014a.B(str);
                }
            }));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ n0 F() {
        return new n0(E(), true, true);
    }

    public final void A(n0 n0Var) {
        i(f1.a("5A2B0161BD2C5D488A13"), n0Var);
        if (n0Var.d()) {
            c(f1.b(f1.c("5A2B0161BD2C5D488A13")), this.f20052k.a().i());
        }
        n0Var.c();
    }

    public final void C() {
        synchronized (this) {
            A(b(new c.a() { // from class: s6.c3
                @Override // u6.c.a
                public final n0 run() {
                    return this.f20028a.F();
                }
            }));
        }
    }

    public final boolean E() {
        long j10 = this.f20049h;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (j10 > jCurrentTimeMillis) {
            f1.a("7F06");
            f1.b(f1.c("632D026D9A3A4142C41D4E472468527CB1"));
            return true;
        }
        if (jCurrentTimeMillis - j10 <= 10000) {
            return true;
        }
        t(f1.a("542B0278A62D4A4F903C585523791E37FE16"), f1.b(f1.c("7F06304686177067AB217370")));
        return false;
    }

    public void G() {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
        this.f20050i = scheduledExecutorServiceNewScheduledThreadPool;
        this.f20051j = scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(new Runnable() { // from class: s6.z2
            @Override // java.lang.Runnable
            public final void run() {
                this.f20423a.C();
            }
        }, 15L, 10L, TimeUnit.SECONDS);
    }

    public void H() {
        ScheduledFuture<?> scheduledFuture = this.f20051j;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f20051j = null;
        }
        ScheduledExecutorService scheduledExecutorService = this.f20050i;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
        }
    }

    @Override // s6.j1
    public void a(Context context) {
    }

    @Override // s6.j1
    public boolean c() {
        return false;
    }

    public void y() {
        this.f20049h = System.currentTimeMillis();
    }

    public void z(final String str) {
        if (str == null) {
            return;
        }
        new Thread(new Runnable() { // from class: s6.a3
            @Override // java.lang.Runnable
            public final void run() {
                this.f19993a.D(str);
            }
        }).start();
    }
}
