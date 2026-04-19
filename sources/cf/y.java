package cf;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<ye.f, Map<a<Object>, Object>> f7018a = x.a(16);

    public static final class a<T> {
    }

    public final <T> T a(ye.f fVar, a<T> aVar) {
        ae.r.f(fVar, "descriptor");
        ae.r.f(aVar, SubscriberAttributeKt.JSON_NAME_KEY);
        Map<a<Object>, Object> map = this.f7018a.get(fVar);
        Object obj = map != null ? map.get(aVar) : null;
        if (obj == null) {
            return null;
        }
        return (T) obj;
    }

    public final <T> T b(ye.f fVar, a<T> aVar, zd.a<? extends T> aVar2) {
        ae.r.f(fVar, "descriptor");
        ae.r.f(aVar, SubscriberAttributeKt.JSON_NAME_KEY);
        ae.r.f(aVar2, "defaultValue");
        T t10 = (T) a(fVar, aVar);
        if (t10 != null) {
            return t10;
        }
        T tInvoke = aVar2.invoke();
        c(fVar, aVar, tInvoke);
        return tInvoke;
    }

    public final <T> void c(ye.f fVar, a<T> aVar, T t10) {
        ae.r.f(fVar, "descriptor");
        ae.r.f(aVar, SubscriberAttributeKt.JSON_NAME_KEY);
        ae.r.f(t10, "value");
        Map<ye.f, Map<a<Object>, Object>> map = this.f7018a;
        Map<a<Object>, Object> mapA = map.get(fVar);
        if (mapA == null) {
            mapA = x.a(2);
            map.put(fVar, mapA);
        }
        mapA.put(aVar, t10);
    }
}
