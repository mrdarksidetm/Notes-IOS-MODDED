package y0;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class v<K, V> extends u<K, V, Map.Entry<? extends K, ? extends V>> {
    @Override // java.util.Iterator
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public Map.Entry<K, V> next() {
        a1.a.a(g());
        o(f() + 2);
        return new b(e()[f() - 2], e()[f() - 1]);
    }
}
