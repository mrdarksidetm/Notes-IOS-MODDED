package com.revenuecat.purchases.paywalls;

import ae.r;
import af.a1;
import af.c0;
import af.j1;
import com.revenuecat.purchases.paywalls.PaywallData;
import we.b;
import we.j;
import xe.a;
import ye.f;
import ze.c;
import ze.d;
import ze.e;

/* JADX INFO: loaded from: classes2.dex */
public final class PaywallData$Configuration$ColorInformation$$serializer implements c0<PaywallData.Configuration.ColorInformation> {
    public static final PaywallData$Configuration$ColorInformation$$serializer INSTANCE;
    private static final /* synthetic */ a1 descriptor;

    static {
        PaywallData$Configuration$ColorInformation$$serializer paywallData$Configuration$ColorInformation$$serializer = new PaywallData$Configuration$ColorInformation$$serializer();
        INSTANCE = paywallData$Configuration$ColorInformation$$serializer;
        a1 a1Var = new a1("com.revenuecat.purchases.paywalls.PaywallData.Configuration.ColorInformation", paywallData$Configuration$ColorInformation$$serializer, 2);
        a1Var.l("light", false);
        a1Var.l("dark", true);
        descriptor = a1Var;
    }

    private PaywallData$Configuration$ColorInformation$$serializer() {
    }

    @Override // af.c0
    public b<?>[] childSerializers() {
        PaywallData$Configuration$Colors$$serializer paywallData$Configuration$Colors$$serializer = PaywallData$Configuration$Colors$$serializer.INSTANCE;
        return new b[]{paywallData$Configuration$Colors$$serializer, a.p(paywallData$Configuration$Colors$$serializer)};
    }

    @Override // we.a
    public PaywallData.Configuration.ColorInformation deserialize(e eVar) {
        Object objL;
        Object objK;
        int i10;
        r.f(eVar, "decoder");
        f descriptor2 = getDescriptor();
        c cVarC = eVar.c(descriptor2);
        if (cVarC.x()) {
            PaywallData$Configuration$Colors$$serializer paywallData$Configuration$Colors$$serializer = PaywallData$Configuration$Colors$$serializer.INSTANCE;
            objK = cVarC.k(descriptor2, 0, paywallData$Configuration$Colors$$serializer, null);
            objL = cVarC.l(descriptor2, 1, paywallData$Configuration$Colors$$serializer, null);
            i10 = 3;
        } else {
            objL = null;
            Object objK2 = null;
            int i11 = 0;
            boolean z10 = true;
            while (z10) {
                int iZ = cVarC.z(descriptor2);
                if (iZ == -1) {
                    z10 = false;
                } else if (iZ == 0) {
                    objK2 = cVarC.k(descriptor2, 0, PaywallData$Configuration$Colors$$serializer.INSTANCE, objK2);
                    i11 |= 1;
                } else {
                    if (iZ != 1) {
                        throw new j(iZ);
                    }
                    objL = cVarC.l(descriptor2, 1, PaywallData$Configuration$Colors$$serializer.INSTANCE, objL);
                    i11 |= 2;
                }
            }
            objK = objK2;
            i10 = i11;
        }
        cVarC.d(descriptor2);
        return new PaywallData.Configuration.ColorInformation(i10, (PaywallData.Configuration.Colors) objK, (PaywallData.Configuration.Colors) objL, (j1) null);
    }

    @Override // we.b, we.h, we.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // we.h
    public void serialize(ze.f fVar, PaywallData.Configuration.ColorInformation colorInformation) {
        r.f(fVar, "encoder");
        r.f(colorInformation, "value");
        f descriptor2 = getDescriptor();
        d dVarC = fVar.c(descriptor2);
        PaywallData.Configuration.ColorInformation.write$Self(colorInformation, dVarC, descriptor2);
        dVarC.d(descriptor2);
    }

    @Override // af.c0
    public b<?>[] typeParametersSerializers() {
        return c0.a.a(this);
    }
}
