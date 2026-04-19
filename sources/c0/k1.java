package c0;

import c0.q;

/* JADX INFO: loaded from: classes.dex */
final class k1<T, V extends q> implements j1<T, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zd.l<T, V> f6093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zd.l<V, T> f6094b;

    /* JADX WARN: Multi-variable type inference failed */
    public k1(zd.l<? super T, ? extends V> lVar, zd.l<? super V, ? extends T> lVar2) {
        this.f6093a = lVar;
        this.f6094b = lVar2;
    }

    @Override // c0.j1
    public zd.l<T, V> a() {
        return this.f6093a;
    }

    @Override // c0.j1
    public zd.l<V, T> b() {
        return this.f6094b;
    }
}
