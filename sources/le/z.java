package le;

/* JADX INFO: loaded from: classes2.dex */
public final class z {
    public static final <T> x<T> a(a2 a2Var) {
        return new y(a2Var);
    }

    public static /* synthetic */ x b(a2 a2Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            a2Var = null;
        }
        return a(a2Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> boolean c(x<T> xVar, Object obj) {
        Throwable thE = md.t.e(obj);
        return thE == null ? xVar.L(obj) : xVar.a(thE);
    }
}
