package qd;

import ae.r;
import ae.s;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import qd.e;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
public interface g {

    public static final class a {

        /* JADX INFO: renamed from: qd.g$a$a, reason: collision with other inner class name */
        static final class C0399a extends s implements p<g, b, g> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0399a f19039a = new C0399a();

            C0399a() {
                super(2);
            }

            @Override // zd.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final g invoke(g gVar, b bVar) {
                qd.c cVar;
                r.f(gVar, "acc");
                r.f(bVar, "element");
                g gVarMinusKey = gVar.minusKey(bVar.getKey());
                h hVar = h.f19040a;
                if (gVarMinusKey == hVar) {
                    return bVar;
                }
                e.b bVar2 = e.U;
                e eVar = (e) gVarMinusKey.get(bVar2);
                if (eVar == null) {
                    cVar = new qd.c(gVarMinusKey, bVar);
                } else {
                    g gVarMinusKey2 = gVarMinusKey.minusKey(bVar2);
                    if (gVarMinusKey2 == hVar) {
                        return new qd.c(bVar, eVar);
                    }
                    cVar = new qd.c(new qd.c(gVarMinusKey2, bVar), eVar);
                }
                return cVar;
            }
        }

        public static g a(g gVar, g gVar2) {
            r.f(gVar2, "context");
            return gVar2 == h.f19040a ? gVar : (g) gVar2.fold(gVar, C0399a.f19039a);
        }
    }

    public interface b extends g {

        public static final class a {
            public static <R> R a(b bVar, R r10, p<? super R, ? super b, ? extends R> pVar) {
                r.f(pVar, "operation");
                return pVar.invoke(r10, bVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static <E extends b> E b(b bVar, c<E> cVar) {
                r.f(cVar, SubscriberAttributeKt.JSON_NAME_KEY);
                if (!r.b(bVar.getKey(), cVar)) {
                    return null;
                }
                r.d(bVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                return bVar;
            }

            public static g c(b bVar, c<?> cVar) {
                r.f(cVar, SubscriberAttributeKt.JSON_NAME_KEY);
                return r.b(bVar.getKey(), cVar) ? h.f19040a : bVar;
            }

            public static g d(b bVar, g gVar) {
                r.f(gVar, "context");
                return a.a(bVar, gVar);
            }
        }

        @Override // qd.g
        <R> R fold(R r10, p<? super R, ? super b, ? extends R> pVar);

        @Override // qd.g
        <E extends b> E get(c<E> cVar);

        c<?> getKey();

        @Override // qd.g
        g minusKey(c<?> cVar);
    }

    public interface c<E extends b> {
    }

    <R> R fold(R r10, p<? super R, ? super b, ? extends R> pVar);

    <E extends b> E get(c<E> cVar);

    g minusKey(c<?> cVar);

    g plus(g gVar);
}
