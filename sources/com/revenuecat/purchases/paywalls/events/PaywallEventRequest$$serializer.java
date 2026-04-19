package com.revenuecat.purchases.paywalls.events;

import ae.r;
import af.a1;
import af.c0;
import java.util.List;
import we.b;
import we.j;
import ye.f;
import ze.c;
import ze.d;
import ze.e;

/* JADX INFO: loaded from: classes2.dex */
public final class PaywallEventRequest$$serializer implements c0<PaywallEventRequest> {
    public static final PaywallEventRequest$$serializer INSTANCE;
    private static final /* synthetic */ a1 descriptor;

    static {
        PaywallEventRequest$$serializer paywallEventRequest$$serializer = new PaywallEventRequest$$serializer();
        INSTANCE = paywallEventRequest$$serializer;
        a1 a1Var = new a1("com.revenuecat.purchases.paywalls.events.PaywallEventRequest", paywallEventRequest$$serializer, 1);
        a1Var.l("events", false);
        descriptor = a1Var;
    }

    private PaywallEventRequest$$serializer() {
    }

    @Override // af.c0
    public b<?>[] childSerializers() {
        return new b[]{PaywallEventRequest.$childSerializers[0]};
    }

    @Override // we.a
    public PaywallEventRequest deserialize(e eVar) {
        Object objK;
        r.f(eVar, "decoder");
        f descriptor2 = getDescriptor();
        c cVarC = eVar.c(descriptor2);
        b[] bVarArr = PaywallEventRequest.$childSerializers;
        int i10 = 1;
        if (cVarC.x()) {
            objK = cVarC.k(descriptor2, 0, bVarArr[0], null);
        } else {
            Object objK2 = null;
            int i11 = 0;
            while (i10 != 0) {
                int iZ = cVarC.z(descriptor2);
                if (iZ == -1) {
                    i10 = 0;
                } else {
                    if (iZ != 0) {
                        throw new j(iZ);
                    }
                    objK2 = cVarC.k(descriptor2, 0, bVarArr[0], objK2);
                    i11 |= 1;
                }
            }
            objK = objK2;
            i10 = i11;
        }
        cVarC.d(descriptor2);
        return new PaywallEventRequest(i10, (List) objK, null);
    }

    @Override // we.b, we.h, we.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // we.h
    public void serialize(ze.f fVar, PaywallEventRequest paywallEventRequest) {
        r.f(fVar, "encoder");
        r.f(paywallEventRequest, "value");
        f descriptor2 = getDescriptor();
        d dVarC = fVar.c(descriptor2);
        dVarC.E(descriptor2, 0, PaywallEventRequest.$childSerializers[0], paywallEventRequest.events);
        dVarC.d(descriptor2);
    }

    @Override // af.c0
    public b<?>[] typeParametersSerializers() {
        return c0.a.a(this);
    }
}
