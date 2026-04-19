package com.revenuecat.purchases.customercenter;

import ae.r;
import af.a1;
import af.c0;
import af.j1;
import af.n1;
import com.amazon.a.a.o.b;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer;
import java.util.List;
import we.j;
import xe.a;
import ye.f;
import ze.c;
import ze.d;
import ze.e;

/* JADX INFO: loaded from: classes2.dex */
public final class CustomerCenterConfigData$Screen$$serializer implements c0<CustomerCenterConfigData.Screen> {
    public static final CustomerCenterConfigData$Screen$$serializer INSTANCE;
    private static final /* synthetic */ a1 descriptor;

    static {
        CustomerCenterConfigData$Screen$$serializer customerCenterConfigData$Screen$$serializer = new CustomerCenterConfigData$Screen$$serializer();
        INSTANCE = customerCenterConfigData$Screen$$serializer;
        a1 a1Var = new a1("com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Screen", customerCenterConfigData$Screen$$serializer, 4);
        a1Var.l("type", false);
        a1Var.l(b.S, false);
        a1Var.l("subtitle", true);
        a1Var.l("paths", false);
        descriptor = a1Var;
    }

    private CustomerCenterConfigData$Screen$$serializer() {
    }

    @Override // af.c0
    public we.b<?>[] childSerializers() {
        return new we.b[]{CustomerCenterConfigData.Screen.$childSerializers[0], n1.f790a, a.p(EmptyStringToNullSerializer.INSTANCE), HelpPathsSerializer.INSTANCE};
    }

    @Override // we.a
    public CustomerCenterConfigData.Screen deserialize(e eVar) {
        Object objK;
        Object objK2;
        int i10;
        String str;
        Object objL;
        r.f(eVar, "decoder");
        f descriptor2 = getDescriptor();
        c cVarC = eVar.c(descriptor2);
        we.b[] bVarArr = CustomerCenterConfigData.Screen.$childSerializers;
        if (cVarC.x()) {
            objK2 = cVarC.k(descriptor2, 0, bVarArr[0], null);
            String strM = cVarC.m(descriptor2, 1);
            objL = cVarC.l(descriptor2, 2, EmptyStringToNullSerializer.INSTANCE, null);
            objK = cVarC.k(descriptor2, 3, HelpPathsSerializer.INSTANCE, null);
            i10 = 15;
            str = strM;
        } else {
            Object objK3 = null;
            String strM2 = null;
            Object objL2 = null;
            objK = null;
            boolean z10 = true;
            int i11 = 0;
            while (z10) {
                int iZ = cVarC.z(descriptor2);
                if (iZ == -1) {
                    z10 = false;
                } else if (iZ == 0) {
                    objK3 = cVarC.k(descriptor2, 0, bVarArr[0], objK3);
                    i11 |= 1;
                } else if (iZ == 1) {
                    strM2 = cVarC.m(descriptor2, 1);
                    i11 |= 2;
                } else if (iZ == 2) {
                    objL2 = cVarC.l(descriptor2, 2, EmptyStringToNullSerializer.INSTANCE, objL2);
                    i11 |= 4;
                } else {
                    if (iZ != 3) {
                        throw new j(iZ);
                    }
                    objK = cVarC.k(descriptor2, 3, HelpPathsSerializer.INSTANCE, objK);
                    i11 |= 8;
                }
            }
            objK2 = objK3;
            i10 = i11;
            str = strM2;
            objL = objL2;
        }
        cVarC.d(descriptor2);
        return new CustomerCenterConfigData.Screen(i10, (CustomerCenterConfigData.Screen.ScreenType) objK2, str, (String) objL, (List) objK, (j1) null);
    }

    @Override // we.b, we.h, we.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // we.h
    public void serialize(ze.f fVar, CustomerCenterConfigData.Screen screen) {
        r.f(fVar, "encoder");
        r.f(screen, "value");
        f descriptor2 = getDescriptor();
        d dVarC = fVar.c(descriptor2);
        CustomerCenterConfigData.Screen.write$Self(screen, dVarC, descriptor2);
        dVarC.d(descriptor2);
    }

    @Override // af.c0
    public we.b<?>[] typeParametersSerializers() {
        return c0.a.a(this);
    }
}
