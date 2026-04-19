package oe;

/* JADX INFO: loaded from: classes2.dex */
class c<T> extends pe.e<T> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final zd.p<ne.r<? super T>, qd.d<? super md.i0>, Object> f16470d;

    /* JADX WARN: Multi-variable type inference failed */
    public c(zd.p<? super ne.r<? super T>, ? super qd.d<? super md.i0>, ? extends Object> pVar, qd.g gVar, int i10, ne.a aVar) {
        super(gVar, i10, aVar);
        this.f16470d = pVar;
    }

    static /* synthetic */ <T> Object p(c<T> cVar, ne.r<? super T> rVar, qd.d<? super md.i0> dVar) {
        Object objInvoke = ((c) cVar).f16470d.invoke(rVar, dVar);
        return objInvoke == rd.d.e() ? objInvoke : md.i0.f15558a;
    }

    @Override // pe.e
    protected Object g(ne.r<? super T> rVar, qd.d<? super md.i0> dVar) {
        return p(this, rVar, dVar);
    }

    @Override // pe.e
    public String toString() {
        return "block[" + this.f16470d + "] -> " + super.toString();
    }
}
