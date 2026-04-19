package y0;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class l<K, V> extends nd.e<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f<K, V> f23177a;

    public l(f<K, V> fVar) {
        this.f23177a = fVar;
    }

    @Override // nd.e
    public int a() {
        return this.f23177a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f23177a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f23177a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<V> iterator() {
        return new m(this.f23177a);
    }
}
