package com.revenuecat.purchases.paywalls;

import ae.r;
import af.a1;
import af.c0;
import af.j1;
import af.n1;
import com.revenuecat.purchases.paywalls.PaywallData;
import we.b;
import we.j;
import xe.a;
import ye.f;
import ze.c;
import ze.d;
import ze.e;

/* JADX INFO: loaded from: classes2.dex */
public final class PaywallData$LocalizedConfiguration$OfferOverride$$serializer implements c0<PaywallData.LocalizedConfiguration.OfferOverride> {
    public static final PaywallData$LocalizedConfiguration$OfferOverride$$serializer INSTANCE;
    private static final /* synthetic */ a1 descriptor;

    static {
        PaywallData$LocalizedConfiguration$OfferOverride$$serializer paywallData$LocalizedConfiguration$OfferOverride$$serializer = new PaywallData$LocalizedConfiguration$OfferOverride$$serializer();
        INSTANCE = paywallData$LocalizedConfiguration$OfferOverride$$serializer;
        a1 a1Var = new a1("com.revenuecat.purchases.paywalls.PaywallData.LocalizedConfiguration.OfferOverride", paywallData$LocalizedConfiguration$OfferOverride$$serializer, 5);
        a1Var.l("offer_name", false);
        a1Var.l("offer_details", false);
        a1Var.l("offer_details_with_intro_offer", true);
        a1Var.l("offer_details_with_multiple_intro_offers", true);
        a1Var.l("offer_badge", true);
        descriptor = a1Var;
    }

    private PaywallData$LocalizedConfiguration$OfferOverride$$serializer() {
    }

    @Override // af.c0
    public b<?>[] childSerializers() {
        n1 n1Var = n1.f790a;
        EmptyStringToNullSerializer emptyStringToNullSerializer = EmptyStringToNullSerializer.INSTANCE;
        return new b[]{n1Var, n1Var, a.p(emptyStringToNullSerializer), a.p(emptyStringToNullSerializer), a.p(emptyStringToNullSerializer)};
    }

    @Override // we.a
    public PaywallData.LocalizedConfiguration.OfferOverride deserialize(e eVar) {
        String str;
        int i10;
        String str2;
        Object objL;
        Object objL2;
        Object objL3;
        r.f(eVar, "decoder");
        f descriptor2 = getDescriptor();
        c cVarC = eVar.c(descriptor2);
        if (cVarC.x()) {
            String strM = cVarC.m(descriptor2, 0);
            String strM2 = cVarC.m(descriptor2, 1);
            EmptyStringToNullSerializer emptyStringToNullSerializer = EmptyStringToNullSerializer.INSTANCE;
            objL = cVarC.l(descriptor2, 2, emptyStringToNullSerializer, null);
            objL2 = cVarC.l(descriptor2, 3, emptyStringToNullSerializer, null);
            objL3 = cVarC.l(descriptor2, 4, emptyStringToNullSerializer, null);
            str = strM;
            str2 = strM2;
            i10 = 31;
        } else {
            String strM3 = null;
            String strM4 = null;
            Object objL4 = null;
            Object objL5 = null;
            Object objL6 = null;
            boolean z10 = true;
            int i11 = 0;
            while (z10) {
                int iZ = cVarC.z(descriptor2);
                if (iZ == -1) {
                    z10 = false;
                } else if (iZ == 0) {
                    strM3 = cVarC.m(descriptor2, 0);
                    i11 |= 1;
                } else if (iZ == 1) {
                    strM4 = cVarC.m(descriptor2, 1);
                    i11 |= 2;
                } else if (iZ == 2) {
                    objL4 = cVarC.l(descriptor2, 2, EmptyStringToNullSerializer.INSTANCE, objL4);
                    i11 |= 4;
                } else if (iZ == 3) {
                    objL5 = cVarC.l(descriptor2, 3, EmptyStringToNullSerializer.INSTANCE, objL5);
                    i11 |= 8;
                } else {
                    if (iZ != 4) {
                        throw new j(iZ);
                    }
                    objL6 = cVarC.l(descriptor2, 4, EmptyStringToNullSerializer.INSTANCE, objL6);
                    i11 |= 16;
                }
            }
            str = strM3;
            i10 = i11;
            str2 = strM4;
            objL = objL4;
            objL2 = objL5;
            objL3 = objL6;
        }
        cVarC.d(descriptor2);
        return new PaywallData.LocalizedConfiguration.OfferOverride(i10, str, str2, (String) objL, (String) objL2, (String) objL3, (j1) null);
    }

    @Override // we.b, we.h, we.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // we.h
    public void serialize(ze.f fVar, PaywallData.LocalizedConfiguration.OfferOverride offerOverride) {
        r.f(fVar, "encoder");
        r.f(offerOverride, "value");
        f descriptor2 = getDescriptor();
        d dVarC = fVar.c(descriptor2);
        PaywallData.LocalizedConfiguration.OfferOverride.write$Self(offerOverride, dVarC, descriptor2);
        dVarC.d(descriptor2);
    }

    @Override // af.c0
    public b<?>[] typeParametersSerializers() {
        return c0.a.a(this);
    }
}
