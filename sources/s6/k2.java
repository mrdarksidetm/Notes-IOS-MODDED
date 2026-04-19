package s6;

import a7.d;
import android.content.Context;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class k2 implements f2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f20169e = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static volatile k2 f20170f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a7.b f20171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f20172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CountDownLatch f20173c = new CountDownLatch(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ExecutorService f20174d;

    public static final class a {
        public final k2 a(Context context) {
            ae.r.f(context, f1.a("542B017CAC3B5B"));
            k2 k2Var = k2.f20170f;
            if (k2Var == null) {
                synchronized (this) {
                    k2Var = k2.f20170f;
                    if (k2Var == null) {
                        k2Var = new k2(context);
                        k2.f20170f = k2Var;
                    }
                }
            }
            return k2Var;
        }
    }

    public static final class b extends ae.s implements zd.l<a7.b, md.i0> {
        public b() {
            super(1);
        }

        public final void a(a7.b bVar) {
            ae.r.f(bVar, f1.a("45211C7DA537"));
            k2.this.f20171a = bVar;
            k2.this.f20173c.countDown();
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ md.i0 invoke(a7.b bVar) {
            a(bVar);
            return md.i0.f15558a;
        }
    }

    public k2(final Context context) {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.f20174d = executorServiceNewSingleThreadExecutor;
        executorServiceNewSingleThreadExecutor.execute(new Runnable() { // from class: s6.j2
            @Override // java.lang.Runnable
            public final void run() {
                k2.c(context, this);
            }
        });
    }

    public static final void c(Context context, k2 k2Var) {
        ae.r.f(context, f1.a("13270066BD265755"));
        ae.r.f(k2Var, f1.b(f1.c("432C067BED73")));
        try {
            try {
                a7.d dVarA = a7.e.a(context);
                k2Var.b(dVarA);
                k2Var.e(dVarA);
            } catch (Exception unused) {
                f1.b(f1.c("73211961AA266645811A495D37641920EC"));
                f1.b(f1.c("622A0E6AA5260F558B545A51252D1A3BF1054F5D6C023B6644BC693A6198FF7B562A0C6DE7"));
                long j10 = 0;
                long count = k2Var.f20173c.getCount();
                if (0 <= count) {
                    while (true) {
                        k2Var.f20173c.countDown();
                        if (j10 == count) {
                            break;
                        } else {
                            j10++;
                        }
                    }
                }
            }
        } finally {
            k2Var.f20174d.shutdown();
        }
    }

    @Override // s6.f2
    public String a() throws InterruptedException {
        if (this.f20171a == null) {
            this.f20173c.await();
        }
        a7.b bVar = this.f20171a;
        if (bVar != null) {
            return bVar.a();
        }
        return null;
    }

    @Override // s6.f2
    public String b() throws InterruptedException {
        if (this.f20171a == null) {
            this.f20173c.await();
        }
        a7.b bVar = this.f20171a;
        if (bVar != null) {
            return bVar.b();
        }
        return null;
    }

    public final void b(a7.d dVar) {
        dVar.b(d.b.V_3, new b());
    }

    @Override // s6.f2
    public String c() throws InterruptedException {
        if (this.f20172b == null) {
            this.f20173c.await();
        }
        return this.f20172b;
    }

    public final void e(a7.d dVar) {
        d7.w wVarF = dVar.f();
        ArrayList arrayListG = nd.u.g(wVarF.K(), wVarF.L(), wVarF.X(), wVarF.W(), wVarF.M(), wVarF.S(), wVarF.I(), wVarF.u(), wVarF.v(), wVarF.H(), wVarF.o(), wVarF.y(), wVarF.w(), wVarF.s(), wVarF.Q(), wVarF.J(), wVarF.D(), wVarF.R(), wVarF.x(), wVarF.q(), wVarF.C(), wVarF.Z(), wVarF.a0(), wVarF.p(), wVarF.A(), wVarF.Y(), wVarF.r(), wVarF.z(), wVarF.E(), wVarF.G(), wVarF.P(), wVarF.U(), wVarF.b0(), wVarF.F(), wVarF.O(), wVarF.t(), wVarF.N(), wVarF.V(), wVarF.B());
        arrayListG.add(wVarF.T());
        this.f20172b = a7.d.e(dVar, arrayListG, null, 2, null);
        this.f20173c.countDown();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f1.a("15200A7EA0204A688056074F5B2D5C72BF420A0D7D1E367A5FB07F536CD4B62D"));
        sb2.append(a() == null ? f1.b(f1.c("1A")) : a());
        sb2.append(f1.b(f1.c("15686528E9630F01C456505135641D16ED0F08153E")));
        sb2.append(b() == null ? f1.b(f1.c("1A")) : b());
        sb2.append(f1.b(f1.c("15686528E9630F01C4565B5D3F6A1920EF1043416826612A0AFB")));
        sb2.append(c() == null ? f1.b(f1.c("1A")) : c());
        sb2.append(f1.b(f1.c("154E")));
        String string = sb2.toString();
        ae.r.e(string, f1.b(f1.c("55310664AD265D0F901B6E4023641235B74B")));
        return string;
    }
}
