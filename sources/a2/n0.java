package a2;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class n0 extends a {
    public n0(b bVar) {
        super(bVar, null);
    }

    @Override // a2.a
    protected long d(u0 u0Var, long j10) {
        p0 p0VarZ1 = u0Var.Z1();
        ae.r.c(p0VarZ1);
        long jW0 = p0VarZ1.W0();
        return k1.f.t(k1.g.a(w2.n.j(jW0), w2.n.k(jW0)), j10);
    }

    @Override // a2.a
    protected Map<y1.a, Integer> e(u0 u0Var) {
        p0 p0VarZ1 = u0Var.Z1();
        ae.r.c(p0VarZ1);
        return p0VarZ1.N0().d();
    }

    @Override // a2.a
    protected int i(u0 u0Var, y1.a aVar) {
        p0 p0VarZ1 = u0Var.Z1();
        ae.r.c(p0VarZ1);
        return p0VarZ1.E0(aVar);
    }
}
