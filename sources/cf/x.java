package cf;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class x {
    public static final <K, V> Map<K, V> a(int i10) {
        return new ConcurrentHashMap(i10);
    }
}
