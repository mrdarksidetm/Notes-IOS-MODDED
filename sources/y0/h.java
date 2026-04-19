package y0;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class h<K, V> extends a<Map.Entry<K, V>, K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f<K, V> f23174a;

    public h(f<K, V> fVar) {
        this.f23174a = fVar;
    }

    @Override // nd.h
    public int a() {
        return this.f23174a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f23174a.clear();
    }

    @Override // y0.a
    public boolean f(Map.Entry<? extends K, ? extends V> entry) {
        V v10 = this.f23174a.get(entry.getKey());
        return v10 != null ? ae.r.b(v10, entry.getValue()) : entry.getValue() == null && this.f23174a.containsKey(entry.getKey());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Map.Entry<K, V>> iterator() {
        return new i(this.f23174a);
    }

    @Override // y0.a
    public boolean n(Map.Entry<? extends K, ? extends V> entry) {
        return this.f23174a.remove(entry.getKey(), entry.getValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public boolean add(Map.Entry<K, V> entry) {
        throw new UnsupportedOperationException();
    }
}
