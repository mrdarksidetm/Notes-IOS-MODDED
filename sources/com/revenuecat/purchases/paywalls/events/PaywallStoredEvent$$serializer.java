package com.revenuecat.purchases.paywalls.events;

import ae.r;
import af.a1;
import af.c0;
import af.n1;
import we.b;
import we.j;
import ye.f;
import ze.c;
import ze.d;
import ze.e;

/* JADX INFO: loaded from: classes2.dex */
public final class PaywallStoredEvent$$serializer implements c0<PaywallStoredEvent> {
    public static final PaywallStoredEvent$$serializer INSTANCE;
    private static final /* synthetic */ a1 descriptor;

    static {
        PaywallStoredEvent$$serializer paywallStoredEvent$$serializer = new PaywallStoredEvent$$serializer();
        INSTANCE = paywallStoredEvent$$serializer;
        a1 a1Var = new a1("com.revenuecat.purchases.paywalls.events.PaywallStoredEvent", paywallStoredEvent$$serializer, 2);
        a1Var.l("event", false);
        a1Var.l("userID", false);
        descriptor = a1Var;
    }

    private PaywallStoredEvent$$serializer() {
    }

    @Override // af.c0
    public b<?>[] childSerializers() {
        return new b[]{PaywallEvent$$serializer.INSTANCE, n1.f790a};
    }

    @Override // we.a
    public PaywallStoredEvent deserialize(e eVar) {
        Object objK;
        String strM;
        int i10;
        r.f(eVar, "decoder");
        f descriptor2 = getDescriptor();
        c cVarC = eVar.c(descriptor2);
        if (cVarC.x()) {
            objK = cVarC.k(descriptor2, 0, PaywallEvent$$serializer.INSTANCE, null);
            strM = cVarC.m(descriptor2, 1);
            i10 = 3;
        } else {
            objK = null;
            String strM2 = null;
            int i11 = 0;
            boolean z10 = true;
            while (z10) {
                int iZ = cVarC.z(descriptor2);
                if (iZ == -1) {
                    z10 = false;
                } else if (iZ == 0) {
                    objK = cVarC.k(descriptor2, 0, PaywallEvent$$serializer.INSTANCE, objK);
                    i11 |= 1;
                } else {
                    if (iZ != 1) {
                        throw new j(iZ);
                    }
                    strM2 = cVarC.m(descriptor2, 1);
                    i11 |= 2;
                }
            }
            strM = strM2;
            i10 = i11;
        }
        cVarC.d(descriptor2);
        return new PaywallStoredEvent(i10, (PaywallEvent) objK, strM, null);
    }

    @Override // we.b, we.h, we.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // we.h
    public void serialize(ze.f fVar, PaywallStoredEvent paywallStoredEvent) {
        r.f(fVar, "encoder");
        r.f(paywallStoredEvent, "value");
        f descriptor2 = getDescriptor();
        d dVarC = fVar.c(descriptor2);
        PaywallStoredEvent.write$Self(paywallStoredEvent, dVarC, descriptor2);
        dVarC.d(descriptor2);
    }

    @Override // af.c0
    public b<?>[] typeParametersSerializers() {
        return c0.a.a(this);
    }
}
