package com.revenuecat.purchases.customercenter;

import ae.r;
import af.a1;
import af.c0;
import af.j1;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer;
import we.b;
import we.j;
import xe.a;
import ye.f;
import ze.c;
import ze.d;
import ze.e;

/* JADX INFO: loaded from: classes2.dex */
public final class CustomerCenterConfigData$Support$$serializer implements c0<CustomerCenterConfigData.Support> {
    public static final CustomerCenterConfigData$Support$$serializer INSTANCE;
    private static final /* synthetic */ a1 descriptor;

    static {
        CustomerCenterConfigData$Support$$serializer customerCenterConfigData$Support$$serializer = new CustomerCenterConfigData$Support$$serializer();
        INSTANCE = customerCenterConfigData$Support$$serializer;
        a1 a1Var = new a1("com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Support", customerCenterConfigData$Support$$serializer, 1);
        a1Var.l("email", true);
        descriptor = a1Var;
    }

    private CustomerCenterConfigData$Support$$serializer() {
    }

    @Override // af.c0
    public b<?>[] childSerializers() {
        return new b[]{a.p(EmptyStringToNullSerializer.INSTANCE)};
    }

    @Override // we.a
    public CustomerCenterConfigData.Support deserialize(e eVar) {
        Object objL;
        r.f(eVar, "decoder");
        f descriptor2 = getDescriptor();
        c cVarC = eVar.c(descriptor2);
        int i10 = 1;
        if (cVarC.x()) {
            objL = cVarC.l(descriptor2, 0, EmptyStringToNullSerializer.INSTANCE, null);
        } else {
            objL = null;
            int i11 = 0;
            while (i10 != 0) {
                int iZ = cVarC.z(descriptor2);
                if (iZ == -1) {
                    i10 = 0;
                } else {
                    if (iZ != 0) {
                        throw new j(iZ);
                    }
                    objL = cVarC.l(descriptor2, 0, EmptyStringToNullSerializer.INSTANCE, objL);
                    i11 |= 1;
                }
            }
            i10 = i11;
        }
        cVarC.d(descriptor2);
        return new CustomerCenterConfigData.Support(i10, (String) objL, (j1) null);
    }

    @Override // we.b, we.h, we.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // we.h
    public void serialize(ze.f fVar, CustomerCenterConfigData.Support support) {
        r.f(fVar, "encoder");
        r.f(support, "value");
        f descriptor2 = getDescriptor();
        d dVarC = fVar.c(descriptor2);
        CustomerCenterConfigData.Support.write$Self(support, dVarC, descriptor2);
        dVarC.d(descriptor2);
    }

    @Override // af.c0
    public b<?>[] typeParametersSerializers() {
        return c0.a.a(this);
    }
}
