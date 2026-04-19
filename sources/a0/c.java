package a0;

import ae.r;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class c<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedHashMap<K, V> f17a;

    public c(int i10, float f10) {
        this.f17a = new LinkedHashMap<>(i10, f10, true);
    }

    public final V a(K k10) {
        r.f(k10, SubscriberAttributeKt.JSON_NAME_KEY);
        return this.f17a.get(k10);
    }

    public final Set<Map.Entry<K, V>> b() {
        Set<Map.Entry<K, V>> setEntrySet = this.f17a.entrySet();
        r.e(setEntrySet, "map.entries");
        return setEntrySet;
    }

    public final boolean c() {
        return this.f17a.isEmpty();
    }

    public final V d(K k10, V v10) {
        r.f(k10, SubscriberAttributeKt.JSON_NAME_KEY);
        r.f(v10, "value");
        return this.f17a.put(k10, v10);
    }

    public final V e(K k10) {
        r.f(k10, SubscriberAttributeKt.JSON_NAME_KEY);
        return this.f17a.remove(k10);
    }
}
