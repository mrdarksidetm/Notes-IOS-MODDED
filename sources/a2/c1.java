package a2;

import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class c1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f53c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f54d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v0.d<f0> f55a = new v0.d<>(new f0[16], 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private f0[] f56b;

    public static final class a {

        /* JADX INFO: renamed from: a2.c1$a$a, reason: collision with other inner class name */
        private static final class C0002a implements Comparator<f0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0002a f57a = new C0002a();

            private C0002a() {
            }

            @Override // java.util.Comparator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(f0 f0Var, f0 f0Var2) {
                int iG = ae.r.g(f0Var2.J(), f0Var.J());
                return iG != 0 ? iG : ae.r.g(f0Var.hashCode(), f0Var2.hashCode());
            }
        }

        private a() {
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }
    }

    private final void b(f0 f0Var) {
        f0Var.z();
        int i10 = 0;
        f0Var.s1(false);
        v0.d<f0> dVarS0 = f0Var.s0();
        int iO = dVarS0.o();
        if (iO > 0) {
            f0[] f0VarArrN = dVarS0.n();
            do {
                b(f0VarArrN[i10]);
                i10++;
            } while (i10 < iO);
        }
    }

    public final void a() {
        this.f55a.C(a.C0002a.f57a);
        int iO = this.f55a.o();
        f0[] f0VarArr = this.f56b;
        if (f0VarArr == null || f0VarArr.length < iO) {
            f0VarArr = new f0[Math.max(16, this.f55a.o())];
        }
        this.f56b = null;
        for (int i10 = 0; i10 < iO; i10++) {
            f0VarArr[i10] = this.f55a.n()[i10];
        }
        this.f55a.i();
        while (true) {
            iO--;
            if (-1 >= iO) {
                this.f56b = f0VarArr;
                return;
            }
            f0 f0Var = f0VarArr[iO];
            ae.r.c(f0Var);
            if (f0Var.g0()) {
                b(f0Var);
            }
        }
    }

    public final boolean c() {
        return this.f55a.s();
    }

    public final void d(f0 f0Var) {
        this.f55a.b(f0Var);
        f0Var.s1(true);
    }

    public final void e(f0 f0Var) {
        this.f55a.i();
        this.f55a.b(f0Var);
        f0Var.s1(true);
    }
}
