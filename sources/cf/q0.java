package cf;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class q0 extends m0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f6978g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f6979h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(bf.a aVar, zd.l<? super bf.h, md.i0> lVar) {
        super(aVar, lVar);
        ae.r.f(aVar, "json");
        ae.r.f(lVar, "nodeConsumer");
        this.f6979h = true;
    }

    @Override // cf.m0, cf.d
    public bf.h q0() {
        return new bf.u(v0());
    }

    @Override // cf.m0, cf.d
    public void u0(String str, bf.h hVar) {
        boolean z10;
        ae.r.f(str, SubscriberAttributeKt.JSON_NAME_KEY);
        ae.r.f(hVar, "element");
        if (!this.f6979h) {
            Map<String, bf.h> mapV0 = v0();
            String str2 = this.f6978g;
            if (str2 == null) {
                ae.r.t("tag");
                str2 = null;
            }
            mapV0.put(str2, hVar);
            z10 = true;
        } else {
            if (!(hVar instanceof bf.w)) {
                if (hVar instanceof bf.u) {
                    throw e0.d(bf.v.f5848a.getDescriptor());
                }
                if (!(hVar instanceof bf.b)) {
                    throw new md.q();
                }
                throw e0.d(bf.c.f5797a.getDescriptor());
            }
            this.f6978g = ((bf.w) hVar).a();
            z10 = false;
        }
        this.f6979h = z10;
    }
}
