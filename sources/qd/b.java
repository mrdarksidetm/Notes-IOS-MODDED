package qd;

import ae.r;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import qd.g;
import qd.g.b;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b<B extends g.b, E extends B> implements g.c<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l<g.b, E> f19033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g.c<?> f19034b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [qd.g$c<?>] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, zd.l<? super qd.g$b, ? extends E extends B>, zd.l<qd.g$b, E extends B>] */
    public b(g.c<B> cVar, l<? super g.b, ? extends E> lVar) {
        r.f(cVar, "baseKey");
        r.f(lVar, "safeCast");
        this.f19033a = lVar;
        this.f19034b = cVar instanceof b ? (g.c<B>) ((b) cVar).f19034b : cVar;
    }

    public final boolean a(g.c<?> cVar) {
        r.f(cVar, SubscriberAttributeKt.JSON_NAME_KEY);
        return cVar == this || this.f19034b == cVar;
    }

    /* JADX WARN: Incorrect return type in method signature: (Lqd/g$b;)TE; */
    public final g.b b(g.b bVar) {
        r.f(bVar, "element");
        return (g.b) this.f19033a.invoke(bVar);
    }
}
