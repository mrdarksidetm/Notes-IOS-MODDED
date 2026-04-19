package com.revenuecat.purchases.paywalls.components.properties;

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
public final class Size$$serializer implements c0<Size> {
    public static final Size$$serializer INSTANCE;
    private static final /* synthetic */ a1 descriptor;

    static {
        Size$$serializer size$$serializer = new Size$$serializer();
        INSTANCE = size$$serializer;
        a1 a1Var = new a1("com.revenuecat.purchases.paywalls.components.properties.Size", size$$serializer, 2);
        a1Var.l("width", false);
        a1Var.l("height", false);
        descriptor = a1Var;
    }

    private Size$$serializer() {
    }

    @Override // af.c0
    public b<?>[] childSerializers() {
        b<?>[] bVarArr = Size.$childSerializers;
        return new b[]{bVarArr[0], bVarArr[1]};
    }

    @Override // we.a
    public Size deserialize(e eVar) {
        Object objK;
        Object objK2;
        int i10;
        r.f(eVar, "decoder");
        f descriptor2 = getDescriptor();
        c cVarC = eVar.c(descriptor2);
        b[] bVarArr = Size.$childSerializers;
        if (cVarC.x()) {
            objK2 = cVarC.k(descriptor2, 0, bVarArr[0], null);
            objK = cVarC.k(descriptor2, 1, bVarArr[1], null);
            i10 = 3;
        } else {
            Object objK3 = null;
            Object objK4 = null;
            int i11 = 0;
            boolean z10 = true;
            while (z10) {
                int iZ = cVarC.z(descriptor2);
                if (iZ == -1) {
                    z10 = false;
                } else if (iZ == 0) {
                    objK4 = cVarC.k(descriptor2, 0, bVarArr[0], objK4);
                    i11 |= 1;
                } else {
                    if (iZ != 1) {
                        throw new j(iZ);
                    }
                    objK3 = cVarC.k(descriptor2, 1, bVarArr[1], objK3);
                    i11 |= 2;
                }
            }
            objK = objK3;
            objK2 = objK4;
            i10 = i11;
        }
        cVarC.d(descriptor2);
        return new Size(i10, (SizeConstraint) objK2, (SizeConstraint) objK, null);
    }

    @Override // we.b, we.h, we.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // we.h
    public void serialize(ze.f fVar, Size size) {
        r.f(fVar, "encoder");
        r.f(size, "value");
        f descriptor2 = getDescriptor();
        d dVarC = fVar.c(descriptor2);
        Size.write$Self(size, dVarC, descriptor2);
        dVarC.d(descriptor2);
    }

    @Override // af.c0
    public b<?>[] typeParametersSerializers() {
        return c0.a.a(this);
    }
}
