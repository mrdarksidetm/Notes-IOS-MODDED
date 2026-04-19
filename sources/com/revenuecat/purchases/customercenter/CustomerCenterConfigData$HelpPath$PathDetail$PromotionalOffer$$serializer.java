package com.revenuecat.purchases.customercenter;

import ae.r;
import af.a1;
import af.c0;
import af.h;
import af.n1;
import com.amazon.a.a.o.b;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import we.j;
import ye.f;
import ze.c;
import ze.d;
import ze.e;

/* JADX INFO: loaded from: classes2.dex */
public final class CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer implements c0<CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer> {
    public static final CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer INSTANCE;
    private static final /* synthetic */ a1 descriptor;

    static {
        CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer customerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer = new CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer();
        INSTANCE = customerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer;
        a1 a1Var = new a1("com.revenuecat.purchases.customercenter.CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer", customerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer, 4);
        a1Var.l("android_offer_id", false);
        a1Var.l("eligible", false);
        a1Var.l(b.S, false);
        a1Var.l("subtitle", false);
        descriptor = a1Var;
    }

    private CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer() {
    }

    @Override // af.c0
    public we.b<?>[] childSerializers() {
        n1 n1Var = n1.f790a;
        return new we.b[]{n1Var, h.f763a, n1Var, n1Var};
    }

    @Override // we.a
    public CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer deserialize(e eVar) {
        String str;
        String strM;
        String str2;
        boolean z10;
        int i10;
        r.f(eVar, "decoder");
        f descriptor2 = getDescriptor();
        c cVarC = eVar.c(descriptor2);
        if (cVarC.x()) {
            String strM2 = cVarC.m(descriptor2, 0);
            boolean zG = cVarC.g(descriptor2, 1);
            String strM3 = cVarC.m(descriptor2, 2);
            str = strM2;
            strM = cVarC.m(descriptor2, 3);
            str2 = strM3;
            z10 = zG;
            i10 = 15;
        } else {
            String strM4 = null;
            String strM5 = null;
            String strM6 = null;
            boolean zG2 = false;
            int i11 = 0;
            boolean z11 = true;
            while (z11) {
                int iZ = cVarC.z(descriptor2);
                if (iZ == -1) {
                    z11 = false;
                } else if (iZ == 0) {
                    strM4 = cVarC.m(descriptor2, 0);
                    i11 |= 1;
                } else if (iZ == 1) {
                    zG2 = cVarC.g(descriptor2, 1);
                    i11 |= 2;
                } else if (iZ == 2) {
                    strM6 = cVarC.m(descriptor2, 2);
                    i11 |= 4;
                } else {
                    if (iZ != 3) {
                        throw new j(iZ);
                    }
                    strM5 = cVarC.m(descriptor2, 3);
                    i11 |= 8;
                }
            }
            str = strM4;
            strM = strM5;
            str2 = strM6;
            z10 = zG2;
            i10 = i11;
        }
        cVarC.d(descriptor2);
        return new CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer(i10, str, z10, str2, strM, null);
    }

    @Override // we.b, we.h, we.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // we.h
    public void serialize(ze.f fVar, CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer promotionalOffer) {
        r.f(fVar, "encoder");
        r.f(promotionalOffer, "value");
        f descriptor2 = getDescriptor();
        d dVarC = fVar.c(descriptor2);
        CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer.write$Self(promotionalOffer, dVarC, descriptor2);
        dVarC.d(descriptor2);
    }

    @Override // af.c0
    public we.b<?>[] typeParametersSerializers() {
        return c0.a.a(this);
    }
}
