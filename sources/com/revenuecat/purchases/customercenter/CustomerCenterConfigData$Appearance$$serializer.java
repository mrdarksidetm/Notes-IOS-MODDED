package com.revenuecat.purchases.customercenter;

import ae.r;
import af.a1;
import af.c0;
import af.j1;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import we.b;
import we.j;
import xe.a;
import ye.f;
import ze.c;
import ze.d;
import ze.e;

/* JADX INFO: loaded from: classes2.dex */
public final class CustomerCenterConfigData$Appearance$$serializer implements c0<CustomerCenterConfigData.Appearance> {
    public static final CustomerCenterConfigData$Appearance$$serializer INSTANCE;
    private static final /* synthetic */ a1 descriptor;

    static {
        CustomerCenterConfigData$Appearance$$serializer customerCenterConfigData$Appearance$$serializer = new CustomerCenterConfigData$Appearance$$serializer();
        INSTANCE = customerCenterConfigData$Appearance$$serializer;
        a1 a1Var = new a1("com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Appearance", customerCenterConfigData$Appearance$$serializer, 2);
        a1Var.l("light", true);
        a1Var.l("dark", true);
        descriptor = a1Var;
    }

    private CustomerCenterConfigData$Appearance$$serializer() {
    }

    @Override // af.c0
    public b<?>[] childSerializers() {
        CustomerCenterConfigData$Appearance$ColorInformation$$serializer customerCenterConfigData$Appearance$ColorInformation$$serializer = CustomerCenterConfigData$Appearance$ColorInformation$$serializer.INSTANCE;
        return new b[]{a.p(customerCenterConfigData$Appearance$ColorInformation$$serializer), a.p(customerCenterConfigData$Appearance$ColorInformation$$serializer)};
    }

    @Override // we.a
    public CustomerCenterConfigData.Appearance deserialize(e eVar) {
        Object objL;
        Object objL2;
        int i10;
        r.f(eVar, "decoder");
        f descriptor2 = getDescriptor();
        c cVarC = eVar.c(descriptor2);
        if (cVarC.x()) {
            CustomerCenterConfigData$Appearance$ColorInformation$$serializer customerCenterConfigData$Appearance$ColorInformation$$serializer = CustomerCenterConfigData$Appearance$ColorInformation$$serializer.INSTANCE;
            objL2 = cVarC.l(descriptor2, 0, customerCenterConfigData$Appearance$ColorInformation$$serializer, null);
            objL = cVarC.l(descriptor2, 1, customerCenterConfigData$Appearance$ColorInformation$$serializer, null);
            i10 = 3;
        } else {
            objL = null;
            Object objL3 = null;
            int i11 = 0;
            boolean z10 = true;
            while (z10) {
                int iZ = cVarC.z(descriptor2);
                if (iZ == -1) {
                    z10 = false;
                } else if (iZ == 0) {
                    objL3 = cVarC.l(descriptor2, 0, CustomerCenterConfigData$Appearance$ColorInformation$$serializer.INSTANCE, objL3);
                    i11 |= 1;
                } else {
                    if (iZ != 1) {
                        throw new j(iZ);
                    }
                    objL = cVarC.l(descriptor2, 1, CustomerCenterConfigData$Appearance$ColorInformation$$serializer.INSTANCE, objL);
                    i11 |= 2;
                }
            }
            objL2 = objL3;
            i10 = i11;
        }
        cVarC.d(descriptor2);
        return new CustomerCenterConfigData.Appearance(i10, (CustomerCenterConfigData.Appearance.ColorInformation) objL2, (CustomerCenterConfigData.Appearance.ColorInformation) objL, (j1) null);
    }

    @Override // we.b, we.h, we.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // we.h
    public void serialize(ze.f fVar, CustomerCenterConfigData.Appearance appearance) {
        r.f(fVar, "encoder");
        r.f(appearance, "value");
        f descriptor2 = getDescriptor();
        d dVarC = fVar.c(descriptor2);
        CustomerCenterConfigData.Appearance.write$Self(appearance, dVarC, descriptor2);
        dVarC.d(descriptor2);
    }

    @Override // af.c0
    public b<?>[] typeParametersSerializers() {
        return c0.a.a(this);
    }
}
