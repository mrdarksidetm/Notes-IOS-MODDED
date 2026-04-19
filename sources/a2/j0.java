package a2;

/* JADX INFO: loaded from: classes.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final w2.d f150a = w2.f.b(1.0f, 0.0f, 2, null);

    public static final e1 b(f0 f0Var) {
        e1 e1VarJ0 = f0Var.j0();
        if (e1VarJ0 != null) {
            return e1VarJ0;
        }
        throw new IllegalStateException("LayoutNode should be attached to an owner".toString());
    }
}
