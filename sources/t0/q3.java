package t0;

/* JADX INFO: loaded from: classes.dex */
public final class q3<T> extends a2<T> {
    public q3(zd.a<? extends T> aVar) {
        super(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // t0.u
    public p3<T> b(T t10, p3<? extends T> p3Var) {
        return (p3Var == 0 || !ae.r.b(p3Var.getValue(), t10)) ? new r3(t10) : p3Var;
    }
}
