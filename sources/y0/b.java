package y0;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class b<K, V> implements Map.Entry<K, V>, be.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final K f23152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final V f23153b;

    public b(K k10, V v10) {
        this.f23152a = k10;
        this.f23153b = v10;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
        return entry != null && ae.r.b(entry.getKey(), getKey()) && ae.r.b(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public K getKey() {
        return this.f23152a;
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return this.f23153b;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        K key = getKey();
        int iHashCode = key != null ? key.hashCode() : 0;
        V value = getValue();
        return iHashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public V setValue(V v10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getKey());
        sb2.append('=');
        sb2.append(getValue());
        return sb2.toString();
    }
}
