package com.revenuecat.purchases.customercenter;

import ae.r;
import af.a1;
import af.c0;
import af.j1;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer;
import java.util.Map;
import we.b;
import we.j;
import xe.a;
import ye.f;
import ze.c;
import ze.d;
import ze.e;

/* JADX INFO: loaded from: classes2.dex */
public final class CustomerCenterConfigData$$serializer implements c0<CustomerCenterConfigData> {
    public static final CustomerCenterConfigData$$serializer INSTANCE;
    private static final /* synthetic */ a1 descriptor;

    static {
        CustomerCenterConfigData$$serializer customerCenterConfigData$$serializer = new CustomerCenterConfigData$$serializer();
        INSTANCE = customerCenterConfigData$$serializer;
        a1 a1Var = new a1("com.revenuecat.purchases.customercenter.CustomerCenterConfigData", customerCenterConfigData$$serializer, 5);
        a1Var.l("screens", false);
        a1Var.l("appearance", false);
        a1Var.l("localization", false);
        a1Var.l("support", false);
        a1Var.l("last_published_app_version", true);
        descriptor = a1Var;
    }

    private CustomerCenterConfigData$$serializer() {
    }

    @Override // af.c0
    public b<?>[] childSerializers() {
        return new b[]{ScreenMapSerializer.INSTANCE, CustomerCenterConfigData$Appearance$$serializer.INSTANCE, CustomerCenterConfigData$Localization$$serializer.INSTANCE, CustomerCenterConfigData$Support$$serializer.INSTANCE, a.p(EmptyStringToNullSerializer.INSTANCE)};
    }

    @Override // we.a
    public CustomerCenterConfigData deserialize(e eVar) {
        Object objK;
        int i10;
        Object objK2;
        Object objK3;
        Object objK4;
        Object objL;
        r.f(eVar, "decoder");
        f descriptor2 = getDescriptor();
        c cVarC = eVar.c(descriptor2);
        if (cVarC.x()) {
            objK = cVarC.k(descriptor2, 0, ScreenMapSerializer.INSTANCE, null);
            objK2 = cVarC.k(descriptor2, 1, CustomerCenterConfigData$Appearance$$serializer.INSTANCE, null);
            objK3 = cVarC.k(descriptor2, 2, CustomerCenterConfigData$Localization$$serializer.INSTANCE, null);
            objK4 = cVarC.k(descriptor2, 3, CustomerCenterConfigData$Support$$serializer.INSTANCE, null);
            objL = cVarC.l(descriptor2, 4, EmptyStringToNullSerializer.INSTANCE, null);
            i10 = 31;
        } else {
            objK = null;
            Object objK5 = null;
            Object objK6 = null;
            Object objK7 = null;
            Object objL2 = null;
            boolean z10 = true;
            int i11 = 0;
            while (z10) {
                int iZ = cVarC.z(descriptor2);
                if (iZ == -1) {
                    z10 = false;
                } else if (iZ == 0) {
                    objK = cVarC.k(descriptor2, 0, ScreenMapSerializer.INSTANCE, objK);
                    i11 |= 1;
                } else if (iZ == 1) {
                    objK5 = cVarC.k(descriptor2, 1, CustomerCenterConfigData$Appearance$$serializer.INSTANCE, objK5);
                    i11 |= 2;
                } else if (iZ == 2) {
                    objK6 = cVarC.k(descriptor2, 2, CustomerCenterConfigData$Localization$$serializer.INSTANCE, objK6);
                    i11 |= 4;
                } else if (iZ == 3) {
                    objK7 = cVarC.k(descriptor2, 3, CustomerCenterConfigData$Support$$serializer.INSTANCE, objK7);
                    i11 |= 8;
                } else {
                    if (iZ != 4) {
                        throw new j(iZ);
                    }
                    objL2 = cVarC.l(descriptor2, 4, EmptyStringToNullSerializer.INSTANCE, objL2);
                    i11 |= 16;
                }
            }
            i10 = i11;
            objK2 = objK5;
            objK3 = objK6;
            objK4 = objK7;
            objL = objL2;
        }
        cVarC.d(descriptor2);
        return new CustomerCenterConfigData(i10, (Map) objK, (CustomerCenterConfigData.Appearance) objK2, (CustomerCenterConfigData.Localization) objK3, (CustomerCenterConfigData.Support) objK4, (String) objL, (j1) null);
    }

    @Override // we.b, we.h, we.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // we.h
    public void serialize(ze.f fVar, CustomerCenterConfigData customerCenterConfigData) {
        r.f(fVar, "encoder");
        r.f(customerCenterConfigData, "value");
        f descriptor2 = getDescriptor();
        d dVarC = fVar.c(descriptor2);
        CustomerCenterConfigData.write$Self(customerCenterConfigData, dVarC, descriptor2);
        dVarC.d(descriptor2);
    }

    @Override // af.c0
    public b<?>[] typeParametersSerializers() {
        return c0.a.a(this);
    }
}
