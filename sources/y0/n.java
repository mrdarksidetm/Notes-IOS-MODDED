package y0;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class n<K, V> extends nd.i<Map.Entry<? extends K, ? extends V>> implements w0.d<Map.Entry<? extends K, ? extends V>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d<K, V> f23178b;

    public n(d<K, V> dVar) {
        this.f23178b = dVar;
    }

    @Override // nd.a
    public int a() {
        return this.f23178b.size();
    }

    @Override // nd.a, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return d((Map.Entry) obj);
        }
        return false;
    }

    public boolean d(Map.Entry<? extends K, ? extends V> entry) {
        if (!(entry instanceof Map.Entry)) {
            return false;
        }
        V v10 = this.f23178b.get(entry.getKey());
        return v10 != null ? ae.r.b(v10, entry.getValue()) : entry.getValue() == null && this.f23178b.containsKey(entry.getKey());
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Map.Entry<K, V>> iterator() {
        return new o(this.f23178b.r());
    }
}
