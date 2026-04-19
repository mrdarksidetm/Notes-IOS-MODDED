package q4;

import ae.j;
import ae.r;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import q4.a;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a {
    public b() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public b(a aVar) {
        r.f(aVar, "initialExtras");
        b().putAll(aVar.b());
    }

    public /* synthetic */ b(a aVar, int i10, j jVar) {
        this((i10 & 1) != 0 ? a.C0398a.f18979b : aVar);
    }

    @Override // q4.a
    public <T> T a(a.b<T> bVar) {
        r.f(bVar, SubscriberAttributeKt.JSON_NAME_KEY);
        return (T) b().get(bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> void c(a.b<T> bVar, T t10) {
        r.f(bVar, SubscriberAttributeKt.JSON_NAME_KEY);
        b().put(bVar, t10);
    }
}
