package oe;

import le.a2;

/* JADX INFO: loaded from: classes2.dex */
final class t<T> implements f0<T>, e, pe.m<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a2 f16578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ f0<T> f16579b;

    /* JADX WARN: Multi-variable type inference failed */
    public t(f0<? extends T> f0Var, a2 a2Var) {
        this.f16578a = a2Var;
        this.f16579b = f0Var;
    }

    @Override // oe.v, oe.e
    public Object a(f<? super T> fVar, qd.d<?> dVar) {
        return this.f16579b.a(fVar, dVar);
    }

    @Override // pe.m
    public e<T> c(qd.g gVar, int i10, ne.a aVar) {
        return h0.d(this, gVar, i10, aVar);
    }

    @Override // oe.f0
    public T getValue() {
        return this.f16579b.getValue();
    }
}
