package com.revenuecat.purchases.paywalls.events;

import ae.r;
import af.a1;
import af.c0;
import com.revenuecat.purchases.paywalls.events.PaywallEvent;
import we.b;
import we.j;
import ye.f;
import ze.c;
import ze.d;
import ze.e;

/* JADX INFO: loaded from: classes2.dex */
public final class PaywallEvent$$serializer implements c0<PaywallEvent> {
    public static final PaywallEvent$$serializer INSTANCE;
    private static final /* synthetic */ a1 descriptor;

    static {
        PaywallEvent$$serializer paywallEvent$$serializer = new PaywallEvent$$serializer();
        INSTANCE = paywallEvent$$serializer;
        a1 a1Var = new a1("com.revenuecat.purchases.paywalls.events.PaywallEvent", paywallEvent$$serializer, 3);
        a1Var.l("creationData", false);
        a1Var.l("data", false);
        a1Var.l("type", false);
        descriptor = a1Var;
    }

    private PaywallEvent$$serializer() {
    }

    @Override // af.c0
    public b<?>[] childSerializers() {
        return new b[]{PaywallEvent$CreationData$$serializer.INSTANCE, PaywallEvent$Data$$serializer.INSTANCE, PaywallEvent.$childSerializers[2]};
    }

    @Override // we.a
    public PaywallEvent deserialize(e eVar) {
        Object objK;
        Object objK2;
        int i10;
        Object objK3;
        r.f(eVar, "decoder");
        f descriptor2 = getDescriptor();
        c cVarC = eVar.c(descriptor2);
        b[] bVarArr = PaywallEvent.$childSerializers;
        if (cVarC.x()) {
            objK = cVarC.k(descriptor2, 0, PaywallEvent$CreationData$$serializer.INSTANCE, null);
            Object objK4 = cVarC.k(descriptor2, 1, PaywallEvent$Data$$serializer.INSTANCE, null);
            objK3 = cVarC.k(descriptor2, 2, bVarArr[2], null);
            objK2 = objK4;
            i10 = 7;
        } else {
            objK = null;
            objK2 = null;
            Object objK5 = null;
            int i11 = 0;
            boolean z10 = true;
            while (z10) {
                int iZ = cVarC.z(descriptor2);
                if (iZ == -1) {
                    z10 = false;
                } else if (iZ == 0) {
                    objK = cVarC.k(descriptor2, 0, PaywallEvent$CreationData$$serializer.INSTANCE, objK);
                    i11 |= 1;
                } else if (iZ == 1) {
                    objK2 = cVarC.k(descriptor2, 1, PaywallEvent$Data$$serializer.INSTANCE, objK2);
                    i11 |= 2;
                } else {
                    if (iZ != 2) {
                        throw new j(iZ);
                    }
                    objK5 = cVarC.k(descriptor2, 2, bVarArr[2], objK5);
                    i11 |= 4;
                }
            }
            i10 = i11;
            objK3 = objK5;
        }
        cVarC.d(descriptor2);
        return new PaywallEvent(i10, (PaywallEvent.CreationData) objK, (PaywallEvent.Data) objK2, (PaywallEventType) objK3, null);
    }

    @Override // we.b, we.h, we.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // we.h
    public void serialize(ze.f fVar, PaywallEvent paywallEvent) {
        r.f(fVar, "encoder");
        r.f(paywallEvent, "value");
        f descriptor2 = getDescriptor();
        d dVarC = fVar.c(descriptor2);
        PaywallEvent.write$Self(paywallEvent, dVarC, descriptor2);
        dVarC.d(descriptor2);
    }

    @Override // af.c0
    public b<?>[] typeParametersSerializers() {
        return c0.a.a(this);
    }
}
