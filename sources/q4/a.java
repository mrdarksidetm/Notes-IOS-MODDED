package q4;

import ae.r;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<b<?>, Object> f18978a = new LinkedHashMap();

    /* JADX INFO: renamed from: q4.a$a, reason: collision with other inner class name */
    public static final class C0398a extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C0398a f18979b = new C0398a();

        private C0398a() {
        }

        @Override // q4.a
        public <T> T a(b<T> bVar) {
            r.f(bVar, SubscriberAttributeKt.JSON_NAME_KEY);
            return null;
        }
    }

    public interface b<T> {
    }

    public abstract <T> T a(b<T> bVar);

    public final Map<b<?>, Object> b() {
        return this.f18978a;
    }
}
