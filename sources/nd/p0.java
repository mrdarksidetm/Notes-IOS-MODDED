package nd;

import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
class p0 {
    public static final <K, V> V a(Map<K, ? extends V> map, K k10) {
        ae.r.f(map, "<this>");
        if (map instanceof n0) {
            return (V) ((n0) map).b(k10);
        }
        V v10 = map.get(k10);
        if (v10 != null || map.containsKey(k10)) {
            return v10;
        }
        throw new NoSuchElementException("Key " + k10 + " is missing in the map.");
    }
}
