package com.revenuecat.purchases.customercenter;

import ae.r;
import af.a1;
import af.c0;
import af.j1;
import af.n1;
import com.amazon.a.a.o.b;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import we.j;
import xe.a;
import ye.f;
import ze.c;
import ze.d;
import ze.e;

/* JADX INFO: loaded from: classes2.dex */
public final class CustomerCenterConfigData$HelpPath$$serializer implements c0<CustomerCenterConfigData.HelpPath> {
    public static final CustomerCenterConfigData$HelpPath$$serializer INSTANCE;
    private static final /* synthetic */ a1 descriptor;

    static {
        CustomerCenterConfigData$HelpPath$$serializer customerCenterConfigData$HelpPath$$serializer = new CustomerCenterConfigData$HelpPath$$serializer();
        INSTANCE = customerCenterConfigData$HelpPath$$serializer;
        a1 a1Var = new a1("com.revenuecat.purchases.customercenter.CustomerCenterConfigData.HelpPath", customerCenterConfigData$HelpPath$$serializer, 5);
        a1Var.l("id", false);
        a1Var.l(b.S, false);
        a1Var.l("type", false);
        a1Var.l("promotional_offer", true);
        a1Var.l("feedback_survey", true);
        descriptor = a1Var;
    }

    private CustomerCenterConfigData$HelpPath$$serializer() {
    }

    @Override // af.c0
    public we.b<?>[] childSerializers() {
        we.b<?>[] bVarArr = CustomerCenterConfigData.HelpPath.$childSerializers;
        n1 n1Var = n1.f790a;
        return new we.b[]{n1Var, n1Var, bVarArr[2], a.p(CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer.INSTANCE), a.p(CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$$serializer.INSTANCE)};
    }

    @Override // we.a
    public CustomerCenterConfigData.HelpPath deserialize(e eVar) {
        Object objL;
        Object objL2;
        String str;
        int i10;
        String strM;
        Object objK;
        r.f(eVar, "decoder");
        f descriptor2 = getDescriptor();
        c cVarC = eVar.c(descriptor2);
        we.b[] bVarArr = CustomerCenterConfigData.HelpPath.$childSerializers;
        if (cVarC.x()) {
            String strM2 = cVarC.m(descriptor2, 0);
            strM = cVarC.m(descriptor2, 1);
            objK = cVarC.k(descriptor2, 2, bVarArr[2], null);
            objL = cVarC.l(descriptor2, 3, CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer.INSTANCE, null);
            objL2 = cVarC.l(descriptor2, 4, CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$$serializer.INSTANCE, null);
            i10 = 31;
            str = strM2;
        } else {
            String strM3 = null;
            String strM4 = null;
            Object objK2 = null;
            objL = null;
            objL2 = null;
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
                    objK2 = cVarC.k(descriptor2, 2, bVarArr[2], objK2);
                    i11 |= 4;
                } else if (iZ == 3) {
                    objL = cVarC.l(descriptor2, 3, CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer.INSTANCE, objL);
                    i11 |= 8;
                } else {
                    if (iZ != 4) {
                        throw new j(iZ);
                    }
                    objL2 = cVarC.l(descriptor2, 4, CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$$serializer.INSTANCE, objL2);
                    i11 |= 16;
                }
            }
            str = strM3;
            i10 = i11;
            strM = strM4;
            objK = objK2;
        }
        cVarC.d(descriptor2);
        return new CustomerCenterConfigData.HelpPath(i10, str, strM, (CustomerCenterConfigData.HelpPath.PathType) objK, (CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer) objL, (CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey) objL2, (j1) null);
    }

    @Override // we.b, we.h, we.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // we.h
    public void serialize(ze.f fVar, CustomerCenterConfigData.HelpPath helpPath) {
        r.f(fVar, "encoder");
        r.f(helpPath, "value");
        f descriptor2 = getDescriptor();
        d dVarC = fVar.c(descriptor2);
        CustomerCenterConfigData.HelpPath.write$Self(helpPath, dVarC, descriptor2);
        dVarC.d(descriptor2);
    }

    @Override // af.c0
    public we.b<?>[] typeParametersSerializers() {
        return c0.a.a(this);
    }
}
