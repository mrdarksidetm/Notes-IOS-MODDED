package d1;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class e0<K, V> extends d0<K, V> implements Iterator<K>, be.a {
    public e0(x<K, V> xVar, Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        super(xVar, it);
    }

    @Override // java.util.Iterator
    public K next() {
        Map.Entry<K, V> entryI = i();
        if (entryI == null) {
            throw new IllegalStateException();
        }
        e();
        return entryI.getKey();
    }
}
