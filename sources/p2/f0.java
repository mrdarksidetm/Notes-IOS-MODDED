package p2;

/* JADX INFO: loaded from: classes.dex */
public final class f0 {
    public static final i2.d a(e0 e0Var) {
        return e0Var.a().o(e0Var.c());
    }

    public static final i2.d b(e0 e0Var, int i10) {
        return e0Var.a().subSequence(i2.e0.i(e0Var.c()), Math.min(i2.e0.i(e0Var.c()) + i10, e0Var.d().length()));
    }

    public static final i2.d c(e0 e0Var, int i10) {
        return e0Var.a().subSequence(Math.max(0, i2.e0.j(e0Var.c()) - i10), i2.e0.j(e0Var.c()));
    }
}
