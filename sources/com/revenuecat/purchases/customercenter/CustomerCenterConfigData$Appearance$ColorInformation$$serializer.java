package com.revenuecat.purchases.customercenter;

import ae.r;
import af.a1;
import af.c0;
import af.j1;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.paywalls.PaywallColor;
import we.b;
import we.j;
import xe.a;
import ye.f;
import ze.c;
import ze.d;
import ze.e;

/* JADX INFO: loaded from: classes2.dex */
public final class CustomerCenterConfigData$Appearance$ColorInformation$$serializer implements c0<CustomerCenterConfigData.Appearance.ColorInformation> {
    public static final CustomerCenterConfigData$Appearance$ColorInformation$$serializer INSTANCE;
    private static final /* synthetic */ a1 descriptor;

    static {
        CustomerCenterConfigData$Appearance$ColorInformation$$serializer customerCenterConfigData$Appearance$ColorInformation$$serializer = new CustomerCenterConfigData$Appearance$ColorInformation$$serializer();
        INSTANCE = customerCenterConfigData$Appearance$ColorInformation$$serializer;
        a1 a1Var = new a1("com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Appearance.ColorInformation", customerCenterConfigData$Appearance$ColorInformation$$serializer, 5);
        a1Var.l("accent_color", true);
        a1Var.l("text_color", true);
        a1Var.l("background_color", true);
        a1Var.l("button_text_color", true);
        a1Var.l("button_background_color", true);
        descriptor = a1Var;
    }

    private CustomerCenterConfigData$Appearance$ColorInformation$$serializer() {
    }

    @Override // af.c0
    public b<?>[] childSerializers() {
        PaywallColor.Serializer serializer = PaywallColor.Serializer.INSTANCE;
        return new b[]{a.p(serializer), a.p(serializer), a.p(serializer), a.p(serializer), a.p(serializer)};
    }

    @Override // we.a
    public CustomerCenterConfigData.Appearance.ColorInformation deserialize(e eVar) {
        Object objL;
        int i10;
        Object objL2;
        Object objL3;
        Object objL4;
        Object objL5;
        r.f(eVar, "decoder");
        f descriptor2 = getDescriptor();
        c cVarC = eVar.c(descriptor2);
        Object objL6 = null;
        if (cVarC.x()) {
            PaywallColor.Serializer serializer = PaywallColor.Serializer.INSTANCE;
            objL2 = cVarC.l(descriptor2, 0, serializer, null);
            objL3 = cVarC.l(descriptor2, 1, serializer, null);
            Object objL7 = cVarC.l(descriptor2, 2, serializer, null);
            objL4 = cVarC.l(descriptor2, 3, serializer, null);
            objL5 = cVarC.l(descriptor2, 4, serializer, null);
            objL = objL7;
            i10 = 31;
        } else {
            int i11 = 0;
            Object objL8 = null;
            objL = null;
            Object objL9 = null;
            Object objL10 = null;
            boolean z10 = true;
            while (z10) {
                int iZ = cVarC.z(descriptor2);
                if (iZ == -1) {
                    z10 = false;
                } else if (iZ == 0) {
                    objL6 = cVarC.l(descriptor2, 0, PaywallColor.Serializer.INSTANCE, objL6);
                    i11 |= 1;
                } else if (iZ == 1) {
                    objL8 = cVarC.l(descriptor2, 1, PaywallColor.Serializer.INSTANCE, objL8);
                    i11 |= 2;
                } else if (iZ == 2) {
                    objL = cVarC.l(descriptor2, 2, PaywallColor.Serializer.INSTANCE, objL);
                    i11 |= 4;
                } else if (iZ == 3) {
                    objL9 = cVarC.l(descriptor2, 3, PaywallColor.Serializer.INSTANCE, objL9);
                    i11 |= 8;
                } else {
                    if (iZ != 4) {
                        throw new j(iZ);
                    }
                    objL10 = cVarC.l(descriptor2, 4, PaywallColor.Serializer.INSTANCE, objL10);
                    i11 |= 16;
                }
            }
            i10 = i11;
            objL2 = objL6;
            objL3 = objL8;
            objL4 = objL9;
            objL5 = objL10;
        }
        cVarC.d(descriptor2);
        return new CustomerCenterConfigData.Appearance.ColorInformation(i10, (PaywallColor) objL2, (PaywallColor) objL3, (PaywallColor) objL, (PaywallColor) objL4, (PaywallColor) objL5, (j1) null);
    }

    @Override // we.b, we.h, we.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // we.h
    public void serialize(ze.f fVar, CustomerCenterConfigData.Appearance.ColorInformation colorInformation) {
        r.f(fVar, "encoder");
        r.f(colorInformation, "value");
        f descriptor2 = getDescriptor();
        d dVarC = fVar.c(descriptor2);
        CustomerCenterConfigData.Appearance.ColorInformation.write$Self(colorInformation, dVarC, descriptor2);
        dVarC.d(descriptor2);
    }

    @Override // af.c0
    public b<?>[] typeParametersSerializers() {
        return c0.a.a(this);
    }
}
