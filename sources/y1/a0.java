package y1;

/* JADX INFO: loaded from: classes.dex */
public final class a0 {
    public static final a2.p0 a(a2.p0 p0Var) {
        a2.f0 f0VarB1 = p0Var.B1();
        while (true) {
            a2.f0 f0VarK0 = f0VarB1.k0();
            if ((f0VarK0 != null ? f0VarK0.Y() : null) == null) {
                a2.p0 p0VarZ1 = f0VarB1.i0().Z1();
                ae.r.c(p0VarZ1);
                return p0VarZ1;
            }
            a2.f0 f0VarK02 = f0VarB1.k0();
            a2.f0 f0VarY = f0VarK02 != null ? f0VarK02.Y() : null;
            ae.r.c(f0VarY);
            boolean zK0 = f0VarY.K0();
            f0VarB1 = f0VarB1.k0();
            ae.r.c(f0VarB1);
            if (!zK0) {
                f0VarB1 = f0VarB1.Y();
                ae.r.c(f0VarB1);
            }
        }
    }
}
