package pe;

import md.i0;

/* JADX INFO: loaded from: classes2.dex */
public final class t<T> implements oe.f<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ne.u<T> f18368a;

    /* JADX WARN: Multi-variable type inference failed */
    public t(ne.u<? super T> uVar) {
        this.f18368a = uVar;
    }

    @Override // oe.f
    public Object b(T t10, qd.d<? super i0> dVar) {
        Object objB = this.f18368a.b(t10, dVar);
        return objB == rd.d.e() ? objB : i0.f15558a;
    }
}
