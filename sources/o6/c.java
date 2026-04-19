package o6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import nd.c0;
import nd.r0;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static final <T> List<T> a(List<? extends T> list) {
        int size = list.size();
        return size != 0 ? size != 1 ? Collections.unmodifiableList(new ArrayList(list)) : Collections.singletonList(c0.Y(list)) : nd.u.m();
    }

    public static final <K, V> Map<K, V> b(Map<K, ? extends V> map) {
        int size = map.size();
        if (size == 0) {
            return r0.e();
        }
        if (size != 1) {
            return Collections.unmodifiableMap(new LinkedHashMap(map));
        }
        Map.Entry entry = (Map.Entry) c0.X(map.entrySet());
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }
}
