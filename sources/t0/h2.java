package t0;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f20780a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f20781b = new Object();

    public static final <K, V> boolean a(Map<K, List<V>> map, K k10, V v10) {
        List<V> arrayList = map.get(k10);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            map.put(k10, arrayList);
        }
        return arrayList.add(v10);
    }

    public static final <K, V> V b(Map<K, List<V>> map, K k10) {
        List<V> list = map.get(k10);
        if (list == null) {
            return null;
        }
        V v10 = (V) nd.z.K(list);
        if (!list.isEmpty()) {
            return v10;
        }
        map.remove(k10);
        return v10;
    }
}
