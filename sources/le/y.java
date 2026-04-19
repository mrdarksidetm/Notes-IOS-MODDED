package le;

/* JADX INFO: loaded from: classes2.dex */
final class y<T> extends i2 implements x<T> {
    public y(a2 a2Var) {
        super(true);
        i0(a2Var);
    }

    @Override // le.x
    public boolean L(T t10) {
        return n0(t10);
    }

    @Override // le.x
    public boolean a(Throwable th) {
        return n0(new c0(th, false, 2, null));
    }

    @Override // le.u0
    public Object await(qd.d<? super T> dVar) throws Throwable {
        Object objZ = z(dVar);
        rd.d.e();
        return objZ;
    }

    @Override // le.i2
    public boolean c0() {
        return true;
    }

    @Override // le.u0
    public T getCompleted() {
        return (T) W();
    }

    @Override // le.u0
    public te.c<T> getOnAwait() {
        te.c<T> cVar = (te.c<T>) b0();
        ae.r.d(cVar, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectClause1<T of kotlinx.coroutines.CompletableDeferredImpl>");
        return cVar;
    }
}
