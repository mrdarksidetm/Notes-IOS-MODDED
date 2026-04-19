package oe;

/* JADX INFO: loaded from: classes2.dex */
final class u<T> extends a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zd.p<f<? super T>, qd.d<? super md.i0>, Object> f16580a;

    /* JADX WARN: Multi-variable type inference failed */
    public u(zd.p<? super f<? super T>, ? super qd.d<? super md.i0>, ? extends Object> pVar) {
        this.f16580a = pVar;
    }

    @Override // oe.a
    public Object d(f<? super T> fVar, qd.d<? super md.i0> dVar) {
        Object objInvoke = this.f16580a.invoke(fVar, dVar);
        return objInvoke == rd.d.e() ? objInvoke : md.i0.f15558a;
    }
}
