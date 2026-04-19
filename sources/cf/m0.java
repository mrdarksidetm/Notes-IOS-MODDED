package cf;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
class m0 extends d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map<String, bf.h> f6968f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(bf.a aVar, zd.l<? super bf.h, md.i0> lVar) {
        super(aVar, lVar, null);
        ae.r.f(aVar, "json");
        ae.r.f(lVar, "nodeConsumer");
        this.f6968f = new LinkedHashMap();
    }

    @Override // af.p1, ze.d
    public <T> void k(ye.f fVar, int i10, we.h<? super T> hVar, T t10) {
        ae.r.f(fVar, "descriptor");
        ae.r.f(hVar, "serializer");
        if (t10 != null || this.f6931d.f()) {
            super.k(fVar, i10, hVar, t10);
        }
    }

    @Override // cf.d
    public bf.h q0() {
        return new bf.u(this.f6968f);
    }

    @Override // cf.d
    public void u0(String str, bf.h hVar) {
        ae.r.f(str, SubscriberAttributeKt.JSON_NAME_KEY);
        ae.r.f(hVar, "element");
        this.f6968f.put(str, hVar);
    }

    protected final Map<String, bf.h> v0() {
        return this.f6968f;
    }
}
