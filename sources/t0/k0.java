package t0;

/* JADX INFO: loaded from: classes.dex */
public final class k0<T> extends a2<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e3<T> f20812b;

    public k0(e3<T> e3Var, zd.a<? extends T> aVar) {
        super(aVar);
        this.f20812b = e3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // t0.u
    public p3<T> b(T t10, p3<? extends T> p3Var) {
        if (p3Var == 0 || !(p3Var instanceof k1)) {
            return f3.i(t10, this.f20812b);
        }
        ((k1) p3Var).setValue(t10);
        return p3Var;
    }
}
