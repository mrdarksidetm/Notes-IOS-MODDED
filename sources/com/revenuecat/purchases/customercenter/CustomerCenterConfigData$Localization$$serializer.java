package com.revenuecat.purchases.customercenter;

import ae.r;
import af.a1;
import af.c0;
import af.n1;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import java.util.Map;
import we.b;
import we.j;
import ye.f;
import ze.c;
import ze.d;
import ze.e;

/* JADX INFO: loaded from: classes2.dex */
public final class CustomerCenterConfigData$Localization$$serializer implements c0<CustomerCenterConfigData.Localization> {
    public static final CustomerCenterConfigData$Localization$$serializer INSTANCE;
    private static final /* synthetic */ a1 descriptor;

    static {
        CustomerCenterConfigData$Localization$$serializer customerCenterConfigData$Localization$$serializer = new CustomerCenterConfigData$Localization$$serializer();
        INSTANCE = customerCenterConfigData$Localization$$serializer;
        a1 a1Var = new a1("com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Localization", customerCenterConfigData$Localization$$serializer, 2);
        a1Var.l("locale", false);
        a1Var.l("localized_strings", false);
        descriptor = a1Var;
    }

    private CustomerCenterConfigData$Localization$$serializer() {
    }

    @Override // af.c0
    public b<?>[] childSerializers() {
        return new b[]{n1.f790a, CustomerCenterConfigData.Localization.$childSerializers[1]};
    }

    @Override // we.a
    public CustomerCenterConfigData.Localization deserialize(e eVar) {
        Object objK;
        String strM;
        int i10;
        r.f(eVar, "decoder");
        f descriptor2 = getDescriptor();
        c cVarC = eVar.c(descriptor2);
        b[] bVarArr = CustomerCenterConfigData.Localization.$childSerializers;
        if (cVarC.x()) {
            strM = cVarC.m(descriptor2, 0);
            objK = cVarC.k(descriptor2, 1, bVarArr[1], null);
            i10 = 3;
        } else {
            Object objK2 = null;
            String strM2 = null;
            int i11 = 0;
            boolean z10 = true;
            while (z10) {
                int iZ = cVarC.z(descriptor2);
                if (iZ == -1) {
                    z10 = false;
                } else if (iZ == 0) {
                    strM2 = cVarC.m(descriptor2, 0);
                    i11 |= 1;
                } else {
                    if (iZ != 1) {
                        throw new j(iZ);
                    }
                    objK2 = cVarC.k(descriptor2, 1, bVarArr[1], objK2);
                    i11 |= 2;
                }
            }
            objK = objK2;
            strM = strM2;
            i10 = i11;
        }
        cVarC.d(descriptor2);
        return new CustomerCenterConfigData.Localization(i10, strM, (Map) objK, null);
    }

    @Override // we.b, we.h, we.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // we.h
    public void serialize(ze.f fVar, CustomerCenterConfigData.Localization localization) {
        r.f(fVar, "encoder");
        r.f(localization, "value");
        f descriptor2 = getDescriptor();
        d dVarC = fVar.c(descriptor2);
        CustomerCenterConfigData.Localization.write$Self(localization, dVarC, descriptor2);
        dVarC.d(descriptor2);
    }

    @Override // af.c0
    public b<?>[] typeParametersSerializers() {
        return c0.a.a(this);
    }
}
