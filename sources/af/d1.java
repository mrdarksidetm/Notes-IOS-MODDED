package af;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d1<Array> {
    public static /* synthetic */ void c(d1 d1Var, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: ensureCapacity");
        }
        if ((i11 & 1) != 0) {
            i10 = d1Var.d() + 1;
        }
        d1Var.b(i10);
    }

    public abstract Array a();

    public abstract void b(int i10);

    public abstract int d();
}
