package y0;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class j<K, V> extends nd.h<K> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f<K, V> f23176a;

    public j(f<K, V> fVar) {
        this.f23176a = fVar;
    }

    @Override // nd.h
    public int a() {
        return this.f23176a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(K k10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f23176a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f23176a.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<K> iterator() {
        return new k(this.f23176a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (!this.f23176a.containsKey(obj)) {
            return false;
        }
        this.f23176a.remove(obj);
        return true;
    }
}
