package cf;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
final class o0 extends d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ArrayList<bf.h> f6973f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(bf.a aVar, zd.l<? super bf.h, md.i0> lVar) {
        super(aVar, lVar, null);
        ae.r.f(aVar, "json");
        ae.r.f(lVar, "nodeConsumer");
        this.f6973f = new ArrayList<>();
    }

    @Override // cf.d, af.s0
    protected String a0(ye.f fVar, int i10) {
        ae.r.f(fVar, "descriptor");
        return String.valueOf(i10);
    }

    @Override // cf.d
    public bf.h q0() {
        return new bf.b(this.f6973f);
    }

    @Override // cf.d
    public void u0(String str, bf.h hVar) {
        ae.r.f(str, SubscriberAttributeKt.JSON_NAME_KEY);
        ae.r.f(hVar, "element");
        this.f6973f.add(Integer.parseInt(str), hVar);
    }
}
