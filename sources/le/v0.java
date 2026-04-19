package le;

/* JADX INFO: loaded from: classes2.dex */
class v0<T> extends a<T> implements u0<T> {
    public v0(qd.g gVar, boolean z10) {
        super(gVar, true, z10);
    }

    static /* synthetic */ <T> Object S0(v0<T> v0Var, qd.d<? super T> dVar) throws Throwable {
        Object objZ = v0Var.z(dVar);
        rd.d.e();
        return objZ;
    }

    @Override // le.u0
    public Object await(qd.d<? super T> dVar) {
        return S0(this, dVar);
    }

    @Override // le.u0
    public T getCompleted() {
        return (T) W();
    }
}
