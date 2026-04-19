package nd;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public class r0 extends q0 {
    public static <K, V> Map<K, V> e() {
        f0 f0Var = f0.f16118a;
        ae.r.d(f0Var, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return f0Var;
    }

    public static <K, V> V f(Map<K, ? extends V> map, K k10) {
        ae.r.f(map, "<this>");
        return (V) p0.a(map, k10);
    }

    public static <K, V> HashMap<K, V> g(md.s<? extends K, ? extends V>... sVarArr) {
        ae.r.f(sVarArr, "pairs");
        HashMap<K, V> map = new HashMap<>(q0.b(sVarArr.length));
        o(map, sVarArr);
        return map;
    }

    public static <K, V> Map<K, V> h(md.s<? extends K, ? extends V>... sVarArr) {
        ae.r.f(sVarArr, "pairs");
        return sVarArr.length > 0 ? u(sVarArr, new LinkedHashMap(q0.b(sVarArr.length))) : e();
    }

    public static <K, V> Map<K, V> i(Map<? extends K, ? extends V> map, Iterable<? extends K> iterable) {
        ae.r.f(map, "<this>");
        ae.r.f(iterable, "keys");
        Map mapV = v(map);
        z.I(mapV.keySet(), iterable);
        return k(mapV);
    }

    public static <K, V> Map<K, V> j(md.s<? extends K, ? extends V>... sVarArr) {
        ae.r.f(sVarArr, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(sVarArr.length));
        o(linkedHashMap, sVarArr);
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> k(Map<K, ? extends V> map) {
        ae.r.f(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? map : q0.d(map) : e();
    }

    public static <K, V> Map<K, V> l(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2) {
        ae.r.f(map, "<this>");
        ae.r.f(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static final <K, V> void m(Map<? super K, ? super V> map, ie.g<? extends md.s<? extends K, ? extends V>> gVar) {
        ae.r.f(map, "<this>");
        ae.r.f(gVar, "pairs");
        for (md.s<? extends K, ? extends V> sVar : gVar) {
            map.put(sVar.a(), sVar.b());
        }
    }

    public static <K, V> void n(Map<? super K, ? super V> map, Iterable<? extends md.s<? extends K, ? extends V>> iterable) {
        ae.r.f(map, "<this>");
        ae.r.f(iterable, "pairs");
        for (md.s<? extends K, ? extends V> sVar : iterable) {
            map.put(sVar.a(), sVar.b());
        }
    }

    public static final <K, V> void o(Map<? super K, ? super V> map, md.s<? extends K, ? extends V>[] sVarArr) {
        ae.r.f(map, "<this>");
        ae.r.f(sVarArr, "pairs");
        for (md.s<? extends K, ? extends V> sVar : sVarArr) {
            map.put(sVar.a(), sVar.b());
        }
    }

    public static <K, V> Map<K, V> p(ie.g<? extends md.s<? extends K, ? extends V>> gVar) {
        ae.r.f(gVar, "<this>");
        return k(q(gVar, new LinkedHashMap()));
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M q(ie.g<? extends md.s<? extends K, ? extends V>> gVar, M m10) {
        ae.r.f(gVar, "<this>");
        ae.r.f(m10, "destination");
        m(m10, gVar);
        return m10;
    }

    public static <K, V> Map<K, V> r(Iterable<? extends md.s<? extends K, ? extends V>> iterable) {
        ae.r.f(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return k(s(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return e();
        }
        if (size != 1) {
            return s(iterable, new LinkedHashMap(q0.b(collection.size())));
        }
        return q0.c(iterable instanceof List ? (md.s<? extends K, ? extends V>) ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M s(Iterable<? extends md.s<? extends K, ? extends V>> iterable, M m10) {
        ae.r.f(iterable, "<this>");
        ae.r.f(m10, "destination");
        n(m10, iterable);
        return m10;
    }

    public static <K, V> Map<K, V> t(Map<? extends K, ? extends V> map) {
        ae.r.f(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? v(map) : q0.d(map) : e();
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M u(md.s<? extends K, ? extends V>[] sVarArr, M m10) {
        ae.r.f(sVarArr, "<this>");
        ae.r.f(m10, "destination");
        o(m10, sVarArr);
        return m10;
    }

    public static <K, V> Map<K, V> v(Map<? extends K, ? extends V> map) {
        ae.r.f(map, "<this>");
        return new LinkedHashMap(map);
    }
}
