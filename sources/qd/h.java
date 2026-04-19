package qd;

import ae.r;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.io.Serializable;
import qd.g;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements g, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f19040a = new h();

    private h() {
    }

    @Override // qd.g
    public <R> R fold(R r10, p<? super R, ? super g.b, ? extends R> pVar) {
        r.f(pVar, "operation");
        return r10;
    }

    @Override // qd.g
    public <E extends g.b> E get(g.c<E> cVar) {
        r.f(cVar, SubscriberAttributeKt.JSON_NAME_KEY);
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // qd.g
    public g minusKey(g.c<?> cVar) {
        r.f(cVar, SubscriberAttributeKt.JSON_NAME_KEY);
        return this;
    }

    @Override // qd.g
    public g plus(g gVar) {
        r.f(gVar, "context");
        return gVar;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
