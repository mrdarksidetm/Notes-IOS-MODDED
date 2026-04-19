package com.revenuecat.purchases.customercenter;

import ae.r;
import af.a1;
import af.c0;
import we.b;
import we.j;
import ye.f;
import ze.c;
import ze.d;
import ze.e;

/* JADX INFO: loaded from: classes2.dex */
public final class CustomerCenterRoot$$serializer implements c0<CustomerCenterRoot> {
    public static final CustomerCenterRoot$$serializer INSTANCE;
    private static final /* synthetic */ a1 descriptor;

    static {
        CustomerCenterRoot$$serializer customerCenterRoot$$serializer = new CustomerCenterRoot$$serializer();
        INSTANCE = customerCenterRoot$$serializer;
        a1 a1Var = new a1("com.revenuecat.purchases.customercenter.CustomerCenterRoot", customerCenterRoot$$serializer, 1);
        a1Var.l("customer_center", false);
        descriptor = a1Var;
    }

    private CustomerCenterRoot$$serializer() {
    }

    @Override // af.c0
    public b<?>[] childSerializers() {
        return new b[]{CustomerCenterConfigData$$serializer.INSTANCE};
    }

    @Override // we.a
    public CustomerCenterRoot deserialize(e eVar) {
        Object objK;
        r.f(eVar, "decoder");
        f descriptor2 = getDescriptor();
        c cVarC = eVar.c(descriptor2);
        int i10 = 1;
        if (cVarC.x()) {
            objK = cVarC.k(descriptor2, 0, CustomerCenterConfigData$$serializer.INSTANCE, null);
        } else {
            objK = null;
            int i11 = 0;
            while (i10 != 0) {
                int iZ = cVarC.z(descriptor2);
                if (iZ == -1) {
                    i10 = 0;
                } else {
                    if (iZ != 0) {
                        throw new j(iZ);
                    }
                    objK = cVarC.k(descriptor2, 0, CustomerCenterConfigData$$serializer.INSTANCE, objK);
                    i11 |= 1;
                }
            }
            i10 = i11;
        }
        cVarC.d(descriptor2);
        return new CustomerCenterRoot(i10, (CustomerCenterConfigData) objK, null);
    }

    @Override // we.b, we.h, we.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // we.h
    public void serialize(ze.f fVar, CustomerCenterRoot customerCenterRoot) {
        r.f(fVar, "encoder");
        r.f(customerCenterRoot, "value");
        f descriptor2 = getDescriptor();
        d dVarC = fVar.c(descriptor2);
        dVarC.E(descriptor2, 0, CustomerCenterConfigData$$serializer.INSTANCE, customerCenterRoot.customerCenter);
        dVarC.d(descriptor2);
    }

    @Override // af.c0
    public b<?>[] typeParametersSerializers() {
        return c0.a.a(this);
    }
}
