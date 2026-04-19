package cf;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;

/* JADX INFO: loaded from: classes2.dex */
final class i0 extends d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private bf.h f6952f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(bf.a aVar, zd.l<? super bf.h, md.i0> lVar) {
        super(aVar, lVar, null);
        ae.r.f(aVar, "json");
        ae.r.f(lVar, "nodeConsumer");
        Y("primitive");
    }

    @Override // cf.d
    public bf.h q0() {
        bf.h hVar = this.f6952f;
        if (hVar != null) {
            return hVar;
        }
        throw new IllegalArgumentException("Primitive element has not been recorded. Is call to .encodeXxx is missing in serializer?".toString());
    }

    @Override // cf.d
    public void u0(String str, bf.h hVar) {
        ae.r.f(str, SubscriberAttributeKt.JSON_NAME_KEY);
        ae.r.f(hVar, "element");
        if (!(str == "primitive")) {
            throw new IllegalArgumentException("This output can only consume primitives with 'primitive' tag".toString());
        }
        if (!(this.f6952f == null)) {
            throw new IllegalArgumentException("Primitive element was already recorded. Does call to .encodeXxx happen more than once?".toString());
        }
        this.f6952f = hVar;
        r0().invoke(hVar);
    }
}
