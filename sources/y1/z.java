package y1;

import k1.f;

/* JADX INFO: loaded from: classes.dex */
public final class z implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a2.p0 f23359a;

    public z(a2.p0 p0Var) {
        this.f23359a = p0Var;
    }

    private final long c() {
        a2.p0 p0VarA = a0.a(this.f23359a);
        r rVarZ1 = p0VarA.z1();
        f.a aVar = k1.f.f14338b;
        return k1.f.s(L(rVarZ1, aVar.c()), b().L(p0VarA.A1(), aVar.c()));
    }

    @Override // y1.r
    public k1.h A(r rVar, boolean z10) {
        return b().A(rVar, z10);
    }

    @Override // y1.r
    public long L(r rVar, long j10) {
        if (!(rVar instanceof z)) {
            a2.p0 p0VarA = a0.a(this.f23359a);
            return k1.f.t(L(p0VarA.C1(), j10), p0VarA.A1().U1().L(rVar, k1.f.f14338b.c()));
        }
        a2.p0 p0Var = ((z) rVar).f23359a;
        p0Var.A1().s2();
        a2.p0 p0VarZ1 = b().Q1(p0Var.A1()).Z1();
        if (p0VarZ1 != null) {
            long jG1 = p0Var.G1(p0VarZ1);
            long jA = w2.o.a(ce.c.d(k1.f.o(j10)), ce.c.d(k1.f.p(j10)));
            long jA2 = w2.o.a(w2.n.j(jG1) + w2.n.j(jA), w2.n.k(jG1) + w2.n.k(jA));
            long jG12 = this.f23359a.G1(p0VarZ1);
            long jA3 = w2.o.a(w2.n.j(jA2) - w2.n.j(jG12), w2.n.k(jA2) - w2.n.k(jG12));
            return k1.g.a(w2.n.j(jA3), w2.n.k(jA3));
        }
        a2.p0 p0VarA2 = a0.a(p0Var);
        long jG13 = p0Var.G1(p0VarA2);
        long jW0 = p0VarA2.W0();
        long jA4 = w2.o.a(w2.n.j(jG13) + w2.n.j(jW0), w2.n.k(jG13) + w2.n.k(jW0));
        long jA5 = w2.o.a(ce.c.d(k1.f.o(j10)), ce.c.d(k1.f.p(j10)));
        long jA6 = w2.o.a(w2.n.j(jA4) + w2.n.j(jA5), w2.n.k(jA4) + w2.n.k(jA5));
        a2.p0 p0Var2 = this.f23359a;
        long jG14 = p0Var2.G1(a0.a(p0Var2));
        long jW02 = a0.a(p0Var2).W0();
        long jA7 = w2.o.a(w2.n.j(jG14) + w2.n.j(jW02), w2.n.k(jG14) + w2.n.k(jW02));
        long jA8 = w2.o.a(w2.n.j(jA6) - w2.n.j(jA7), w2.n.k(jA6) - w2.n.k(jA7));
        a2.u0 u0VarF2 = a0.a(this.f23359a).A1().f2();
        ae.r.c(u0VarF2);
        a2.u0 u0VarF22 = p0VarA2.A1().f2();
        ae.r.c(u0VarF22);
        return u0VarF2.L(u0VarF22, k1.g.a(w2.n.j(jA8), w2.n.k(jA8)));
    }

    @Override // y1.r
    public r S() {
        a2.p0 p0VarZ1;
        if (!v()) {
            throw new IllegalStateException("LayoutCoordinate operations are only valid when isAttached is true".toString());
        }
        a2.u0 u0VarF2 = b().Y1().i0().f2();
        if (u0VarF2 == null || (p0VarZ1 = u0VarF2.Z1()) == null) {
            return null;
        }
        return p0VarZ1.z1();
    }

    @Override // y1.r
    public long U(long j10) {
        return b().U(k1.f.t(j10, c()));
    }

    @Override // y1.r
    public long a() {
        a2.p0 p0Var = this.f23359a;
        return w2.q.a(p0Var.q0(), p0Var.d0());
    }

    public final a2.u0 b() {
        return this.f23359a.A1();
    }

    @Override // y1.r
    public long p(long j10) {
        return b().p(k1.f.t(j10, c()));
    }

    @Override // y1.r
    public boolean v() {
        return b().v();
    }
}
