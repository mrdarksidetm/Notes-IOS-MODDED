package v1;

/* JADX INFO: loaded from: classes.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a2.f0 f21924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f21925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c0 f21926c = new c0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a2.t f21927d = new a2.t();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f21928e;

    public f0(a2.f0 f0Var) {
        this.f21924a = f0Var;
        this.f21925b = new g(f0Var.i());
    }

    public final int a(d0 d0Var, n0 n0Var, boolean z10) {
        boolean z11;
        if (this.f21928e) {
            return g0.a(false, false);
        }
        boolean z12 = true;
        try {
            this.f21928e = true;
            h hVarB = this.f21926c.b(d0Var, n0Var);
            int iM = hVarB.a().m();
            for (int i10 = 0; i10 < iM; i10++) {
                b0 b0VarN = hVarB.a().n(i10);
                if (!b0VarN.j() && !b0VarN.m()) {
                }
                z11 = false;
                break;
            }
            z11 = true;
            int iM2 = hVarB.a().m();
            for (int i11 = 0; i11 < iM2; i11++) {
                b0 b0VarN2 = hVarB.a().n(i11);
                if (z11 || q.b(b0VarN2)) {
                    a2.f0.u0(this.f21924a, b0VarN2.i(), this.f21927d, m0.g(b0VarN2.o(), m0.f21952a.d()), false, 8, null);
                    if (!this.f21927d.isEmpty()) {
                        this.f21925b.a(b0VarN2.g(), this.f21927d);
                        this.f21927d.clear();
                    }
                }
            }
            this.f21925b.d();
            boolean zB = this.f21925b.b(hVarB, z10);
            if (hVarB.c()) {
                z12 = false;
            } else {
                int iM3 = hVarB.a().m();
                for (int i12 = 0; i12 < iM3; i12++) {
                    b0 b0VarN3 = hVarB.a().n(i12);
                    if (q.j(b0VarN3) && b0VarN3.q()) {
                        break;
                    }
                }
                z12 = false;
            }
            return g0.a(zB, z12);
        } finally {
            this.f21928e = false;
        }
    }

    public final void b() {
        if (this.f21928e) {
            return;
        }
        this.f21926c.a();
        this.f21925b.c();
    }
}
