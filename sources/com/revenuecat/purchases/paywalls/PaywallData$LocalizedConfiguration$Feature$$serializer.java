package com.revenuecat.purchases.paywalls;

import ae.r;
import af.a1;
import af.c0;
import af.j1;
import af.n1;
import com.amazon.a.a.o.b;
import com.revenuecat.purchases.paywalls.PaywallData;
import we.j;
import xe.a;
import ye.f;
import ze.c;
import ze.d;
import ze.e;

/* JADX INFO: loaded from: classes2.dex */
public final class PaywallData$LocalizedConfiguration$Feature$$serializer implements c0<PaywallData.LocalizedConfiguration.Feature> {
    public static final PaywallData$LocalizedConfiguration$Feature$$serializer INSTANCE;
    private static final /* synthetic */ a1 descriptor;

    static {
        PaywallData$LocalizedConfiguration$Feature$$serializer paywallData$LocalizedConfiguration$Feature$$serializer = new PaywallData$LocalizedConfiguration$Feature$$serializer();
        INSTANCE = paywallData$LocalizedConfiguration$Feature$$serializer;
        a1 a1Var = new a1("com.revenuecat.purchases.paywalls.PaywallData.LocalizedConfiguration.Feature", paywallData$LocalizedConfiguration$Feature$$serializer, 3);
        a1Var.l(b.S, false);
        a1Var.l("content", true);
        a1Var.l("icon_id", true);
        descriptor = a1Var;
    }

    private PaywallData$LocalizedConfiguration$Feature$$serializer() {
    }

    @Override // af.c0
    public we.b<?>[] childSerializers() {
        n1 n1Var = n1.f790a;
        return new we.b[]{n1Var, a.p(n1Var), a.p(n1Var)};
    }

    @Override // we.a
    public PaywallData.LocalizedConfiguration.Feature deserialize(e eVar) {
        Object objL;
        String str;
        Object objL2;
        int i10;
        r.f(eVar, "decoder");
        f descriptor2 = getDescriptor();
        c cVarC = eVar.c(descriptor2);
        String strM = null;
        if (cVarC.x()) {
            String strM2 = cVarC.m(descriptor2, 0);
            n1 n1Var = n1.f790a;
            objL = cVarC.l(descriptor2, 1, n1Var, null);
            objL2 = cVarC.l(descriptor2, 2, n1Var, null);
            str = strM2;
            i10 = 7;
        } else {
            Object objL3 = null;
            Object objL4 = null;
            int i11 = 0;
            boolean z10 = true;
            while (z10) {
                int iZ = cVarC.z(descriptor2);
                if (iZ == -1) {
                    z10 = false;
                } else if (iZ == 0) {
                    strM = cVarC.m(descriptor2, 0);
                    i11 |= 1;
                } else if (iZ == 1) {
                    objL3 = cVarC.l(descriptor2, 1, n1.f790a, objL3);
                    i11 |= 2;
                } else {
                    if (iZ != 2) {
                        throw new j(iZ);
                    }
                    objL4 = cVarC.l(descriptor2, 2, n1.f790a, objL4);
                    i11 |= 4;
                }
            }
            objL = objL3;
            str = strM;
            objL2 = objL4;
            i10 = i11;
        }
        cVarC.d(descriptor2);
        return new PaywallData.LocalizedConfiguration.Feature(i10, str, (String) objL, (String) objL2, (j1) null);
    }

    @Override // we.b, we.h, we.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // we.h
    public void serialize(ze.f fVar, PaywallData.LocalizedConfiguration.Feature feature) {
        r.f(fVar, "encoder");
        r.f(feature, "value");
        f descriptor2 = getDescriptor();
        d dVarC = fVar.c(descriptor2);
        PaywallData.LocalizedConfiguration.Feature.write$Self(feature, dVarC, descriptor2);
        dVarC.d(descriptor2);
    }

    @Override // af.c0
    public we.b<?>[] typeParametersSerializers() {
        return c0.a.a(this);
    }
}
