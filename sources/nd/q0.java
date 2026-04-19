package nd;

import com.google.android.gms.common.api.a;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public class q0 extends p0 {
    public static int b(int i10) {
        return i10 < 0 ? i10 : i10 < 3 ? i10 + 1 : i10 < 1073741824 ? (int) ((i10 / 0.75f) + 1.0f) : a.e.API_PRIORITY_OTHER;
    }

    public static <K, V> Map<K, V> c(md.s<? extends K, ? extends V> sVar) {
        ae.r.f(sVar, "pair");
        Map<K, V> mapSingletonMap = Collections.singletonMap(sVar.c(), sVar.d());
        ae.r.e(mapSingletonMap, "singletonMap(...)");
        return mapSingletonMap;
    }

    public static final <K, V> Map<K, V> d(Map<? extends K, ? extends V> map) {
        ae.r.f(map, "<this>");
        Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
        Map<K, V> mapSingletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        ae.r.e(mapSingletonMap, "with(...)");
        return mapSingletonMap;
    }
}
