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
public final class CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$Option$$serializer implements c0<CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey.Option> {
    public static final CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$Option$$serializer INSTANCE;
    private static final /* synthetic */ a1 descriptor;

    static {
        CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$Option$$serializer customerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$Option$$serializer = new CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$Option$$serializer();
        INSTANCE = customerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$Option$$serializer;
        a1 a1Var = new a1("com.revenuecat.purchases.customercenter.CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey.Option", customerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$Option$$serializer, 3);
        a1Var.l("id", false);
        a1Var.l(b.S, false);
        a1Var.l("promotional_offer", true);
        descriptor = a1Var;
    }

    private CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$Option$$serializer() {
    }

    @Override // af.c0
    public we.b<?>[] childSerializers() {
        n1 n1Var = n1.f790a;
        return new we.b[]{n1Var, n1Var, a.p(CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer.INSTANCE)};
    }

    @Override // we.a
    public CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey.Option deserialize(e eVar) {
        String str;
        String str2;
        Object objL;
        int i10;
        r.f(eVar, "decoder");
        f descriptor2 = getDescriptor();
        c cVarC = eVar.c(descriptor2);
        String strM = null;
        if (cVarC.x()) {
            String strM2 = cVarC.m(descriptor2, 0);
            String strM3 = cVarC.m(descriptor2, 1);
            objL = cVarC.l(descriptor2, 2, CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer.INSTANCE, null);
            str2 = strM2;
            i10 = 7;
            str = strM3;
        } else {
            String strM4 = null;
            Object objL2 = null;
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
                    strM4 = cVarC.m(descriptor2, 1);
                    i11 |= 2;
                } else {
                    if (iZ != 2) {
                        throw new j(iZ);
                    }
                    objL2 = cVarC.l(descriptor2, 2, CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer.INSTANCE, objL2);
                    i11 |= 4;
                }
            }
            str = strM4;
            str2 = strM;
            objL = objL2;
            i10 = i11;
        }
        cVarC.d(descriptor2);
        return new CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey.Option(i10, str2, str, (CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer) objL, (j1) null);
    }

    @Override // we.b, we.h, we.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // we.h
    public void serialize(ze.f fVar, CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey.Option option) {
        r.f(fVar, "encoder");
        r.f(option, "value");
        f descriptor2 = getDescriptor();
        d dVarC = fVar.c(descriptor2);
        CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey.Option.write$Self(option, dVarC, descriptor2);
        dVarC.d(descriptor2);
    }

    @Override // af.c0
    public we.b<?>[] typeParametersSerializers() {
        return c0.a.a(this);
    }
}
