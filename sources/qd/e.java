package qd;

import ae.r;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import qd.g;

/* JADX INFO: loaded from: classes2.dex */
public interface e extends g.b {
    public static final b U = b.f19038a;

    public static final class a {
        public static <E extends g.b> E a(e eVar, g.c<E> cVar) {
            r.f(cVar, SubscriberAttributeKt.JSON_NAME_KEY);
            if (!(cVar instanceof qd.b)) {
                if (e.U != cVar) {
                    return null;
                }
                r.d(eVar, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return eVar;
            }
            qd.b bVar = (qd.b) cVar;
            if (!bVar.a(eVar.getKey())) {
                return null;
            }
            E e10 = (E) bVar.b(eVar);
            if (e10 instanceof g.b) {
                return e10;
            }
            return null;
        }

        public static g b(e eVar, g.c<?> cVar) {
            r.f(cVar, SubscriberAttributeKt.JSON_NAME_KEY);
            if (!(cVar instanceof qd.b)) {
                return e.U == cVar ? h.f19040a : eVar;
            }
            qd.b bVar = (qd.b) cVar;
            return (!bVar.a(eVar.getKey()) || bVar.b(eVar) == null) ? eVar : h.f19040a;
        }
    }

    public static final class b implements g.c<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ b f19038a = new b();

        private b() {
        }
    }

    void E(d<?> dVar);

    <T> d<T> y(d<? super T> dVar);
}
