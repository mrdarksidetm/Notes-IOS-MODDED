package d1;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
abstract class s<K, V, E> implements Set<E>, be.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x<K, V> f9421a;

    public s(x<K, V> xVar) {
        this.f9421a = xVar;
    }

    public final x<K, V> a() {
        return this.f9421a;
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.f9421a.clear();
    }

    public int d() {
        return this.f9421a.size();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f9421a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return d();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return ae.i.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) ae.i.b(this, tArr);
    }
}
