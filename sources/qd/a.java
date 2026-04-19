package qd;

import ae.r;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import qd.g;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a implements g.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g.c<?> f19032a;

    public a(g.c<?> cVar) {
        r.f(cVar, SubscriberAttributeKt.JSON_NAME_KEY);
        this.f19032a = cVar;
    }

    @Override // qd.g.b, qd.g
    public <R> R fold(R r10, p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) g.b.a.a(this, r10, pVar);
    }

    @Override // qd.g.b, qd.g
    public <E extends g.b> E get(g.c<E> cVar) {
        return (E) g.b.a.b(this, cVar);
    }

    @Override // qd.g.b
    public g.c<?> getKey() {
        return this.f19032a;
    }

    @Override // qd.g.b, qd.g
    public g minusKey(g.c<?> cVar) {
        return g.b.a.c(this, cVar);
    }

    @Override // qd.g
    public g plus(g gVar) {
        return g.b.a.d(this, gVar);
    }
}
