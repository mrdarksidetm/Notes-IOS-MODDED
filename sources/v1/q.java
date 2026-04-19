package v1;

/* JADX INFO: loaded from: classes.dex */
public final class q {
    public static final boolean a(b0 b0Var) {
        return (b0Var.q() || b0Var.m() || !b0Var.j()) ? false : true;
    }

    public static final boolean b(b0 b0Var) {
        return !b0Var.m() && b0Var.j();
    }

    public static final boolean c(b0 b0Var) {
        return (b0Var.q() || !b0Var.m() || b0Var.j()) ? false : true;
    }

    public static final boolean d(b0 b0Var) {
        return b0Var.m() && !b0Var.j();
    }

    public static final boolean e(b0 b0Var, long j10) {
        long jI = b0Var.i();
        float fO = k1.f.o(jI);
        float fP = k1.f.p(jI);
        return fO < 0.0f || fO > ((float) w2.p.g(j10)) || fP < 0.0f || fP > ((float) w2.p.f(j10));
    }

    public static final boolean f(b0 b0Var, long j10, long j11) {
        if (!m0.g(b0Var.o(), m0.f21952a.d())) {
            return e(b0Var, j10);
        }
        long jI = b0Var.i();
        float fO = k1.f.o(jI);
        float fP = k1.f.p(jI);
        return fO < (-k1.l.i(j11)) || fO > ((float) w2.p.g(j10)) + k1.l.i(j11) || fP < (-k1.l.g(j11)) || fP > ((float) w2.p.f(j10)) + k1.l.g(j11);
    }

    public static final long g(b0 b0Var) {
        return i(b0Var, false);
    }

    public static final long h(b0 b0Var) {
        return i(b0Var, true);
    }

    private static final long i(b0 b0Var, boolean z10) {
        long jS = k1.f.s(b0Var.i(), b0Var.l());
        return (z10 || !b0Var.q()) ? jS : k1.f.f14338b.c();
    }

    public static final boolean j(b0 b0Var) {
        return !k1.f.l(i(b0Var, true), k1.f.f14338b.c());
    }
}
