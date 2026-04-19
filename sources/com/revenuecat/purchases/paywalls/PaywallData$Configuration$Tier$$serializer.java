package com.revenuecat.purchases.paywalls;

import ae.r;
import af.a1;
import af.c0;
import af.n1;
import com.revenuecat.purchases.paywalls.PaywallData;
import java.util.List;
import we.b;
import we.j;
import ye.f;
import ze.c;
import ze.d;
import ze.e;

/* JADX INFO: loaded from: classes2.dex */
public final class PaywallData$Configuration$Tier$$serializer implements c0<PaywallData.Configuration.Tier> {
    public static final PaywallData$Configuration$Tier$$serializer INSTANCE;
    private static final /* synthetic */ a1 descriptor;

    static {
        PaywallData$Configuration$Tier$$serializer paywallData$Configuration$Tier$$serializer = new PaywallData$Configuration$Tier$$serializer();
        INSTANCE = paywallData$Configuration$Tier$$serializer;
        a1 a1Var = new a1("com.revenuecat.purchases.paywalls.PaywallData.Configuration.Tier", paywallData$Configuration$Tier$$serializer, 3);
        a1Var.l("id", false);
        a1Var.l("packages", false);
        a1Var.l("default_package", false);
        descriptor = a1Var;
    }

    private PaywallData$Configuration$Tier$$serializer() {
    }

    @Override // af.c0
    public b<?>[] childSerializers() {
        b<?>[] bVarArr = PaywallData.Configuration.Tier.$childSerializers;
        n1 n1Var = n1.f790a;
        return new b[]{n1Var, bVarArr[1], n1Var};
    }

    @Override // we.a
    public PaywallData.Configuration.Tier deserialize(e eVar) {
        Object objK;
        String str;
        String strM;
        int i10;
        r.f(eVar, "decoder");
        f descriptor2 = getDescriptor();
        c cVarC = eVar.c(descriptor2);
        b[] bVarArr = PaywallData.Configuration.Tier.$childSerializers;
        String strM2 = null;
        if (cVarC.x()) {
            String strM3 = cVarC.m(descriptor2, 0);
            objK = cVarC.k(descriptor2, 1, bVarArr[1], null);
            strM = cVarC.m(descriptor2, 2);
            i10 = 7;
            str = strM3;
        } else {
            Object objK2 = null;
            String strM4 = null;
            int i11 = 0;
            boolean z10 = true;
            while (z10) {
                int iZ = cVarC.z(descriptor2);
                if (iZ == -1) {
                    z10 = false;
                } else if (iZ == 0) {
                    strM2 = cVarC.m(descriptor2, 0);
                    i11 |= 1;
                } else if (iZ == 1) {
                    objK2 = cVarC.k(descriptor2, 1, bVarArr[1], objK2);
                    i11 |= 2;
                } else {
                    if (iZ != 2) {
                        throw new j(iZ);
                    }
                    strM4 = cVarC.m(descriptor2, 2);
                    i11 |= 4;
                }
            }
            objK = objK2;
            str = strM2;
            strM = strM4;
            i10 = i11;
        }
        cVarC.d(descriptor2);
        return new PaywallData.Configuration.Tier(i10, str, (List) objK, strM, null);
    }

    @Override // we.b, we.h, we.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // we.h
    public void serialize(ze.f fVar, PaywallData.Configuration.Tier tier) {
        r.f(fVar, "encoder");
        r.f(tier, "value");
        f descriptor2 = getDescriptor();
        d dVarC = fVar.c(descriptor2);
        PaywallData.Configuration.Tier.write$Self(tier, dVarC, descriptor2);
        dVarC.d(descriptor2);
    }

    @Override // af.c0
    public b<?>[] typeParametersSerializers() {
        return c0.a.a(this);
    }
}
