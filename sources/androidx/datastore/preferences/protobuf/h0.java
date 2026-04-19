package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.y;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class h0<K, V> extends LinkedHashMap<K, V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final h0 f3609b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f3610a;

    static {
        h0 h0Var = new h0();
        f3609b = h0Var;
        h0Var.m();
    }

    private h0() {
        this.f3610a = true;
    }

    private h0(Map<K, V> map) {
        super(map);
        this.f3610a = true;
    }

    static <K, V> int c(Map<K, V> map) {
        int iD = 0;
        for (Map.Entry<K, V> entry : map.entrySet()) {
            iD += d(entry.getValue()) ^ d(entry.getKey());
        }
        return iD;
    }

    private static int d(Object obj) {
        if (obj instanceof byte[]) {
            return y.d((byte[]) obj);
        }
        if (obj instanceof y.c) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    private static void e(Map<?, ?> map) {
        for (Object obj : map.keySet()) {
            y.a(obj);
            y.a(map.get(obj));
        }
    }

    public static <K, V> h0<K, V> f() {
        return f3609b;
    }

    private void g() {
        if (!j()) {
            throw new UnsupportedOperationException();
        }
    }

    private static boolean h(Object obj, Object obj2) {
        return ((obj instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) obj, (byte[]) obj2) : obj.equals(obj2);
    }

    static <K, V> boolean i(Map<K, V> map, Map<K, V> map2) {
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey()) || !h(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        g();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        return (obj instanceof Map) && i(this, (Map) obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return c(this);
    }

    public boolean j() {
        return this.f3610a;
    }

    public void m() {
        this.f3610a = false;
    }

    public void n(h0<K, V> h0Var) {
        g();
        if (h0Var.isEmpty()) {
            return;
        }
        putAll(h0Var);
    }

    public h0<K, V> p() {
        return isEmpty() ? new h0<>() : new h0<>(this);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V put(K k10, V v10) {
        g();
        y.a(k10);
        y.a(v10);
        return (V) super.put(k10, v10);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        g();
        e(map);
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        g();
        return (V) super.remove(obj);
    }
}
