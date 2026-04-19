package com.revenuecat.purchases.paywalls.components.properties;

import ae.r;
import af.a1;
import af.c0;
import com.revenuecat.purchases.paywalls.components.properties.Dimension;
import we.b;
import we.j;
import ye.f;
import ze.c;
import ze.d;
import ze.e;

/* JADX INFO: loaded from: classes2.dex */
public final class Dimension$Vertical$$serializer implements c0<Dimension.Vertical> {
    public static final Dimension$Vertical$$serializer INSTANCE;
    private static final /* synthetic */ a1 descriptor;

    static {
        Dimension$Vertical$$serializer dimension$Vertical$$serializer = new Dimension$Vertical$$serializer();
        INSTANCE = dimension$Vertical$$serializer;
        a1 a1Var = new a1("vertical", dimension$Vertical$$serializer, 2);
        a1Var.l("alignment", false);
        a1Var.l("distribution", false);
        descriptor = a1Var;
    }

    private Dimension$Vertical$$serializer() {
    }

    @Override // af.c0
    public b<?>[] childSerializers() {
        b<?>[] bVarArr = Dimension.Vertical.$childSerializers;
        return new b[]{bVarArr[0], bVarArr[1]};
    }

    @Override // we.a
    public Dimension.Vertical deserialize(e eVar) {
        Object objK;
        Object objK2;
        int i10;
        r.f(eVar, "decoder");
        f descriptor2 = getDescriptor();
        c cVarC = eVar.c(descriptor2);
        b[] bVarArr = Dimension.Vertical.$childSerializers;
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
        return new Dimension.Vertical(i10, (HorizontalAlignment) objK2, (FlexDistribution) objK, null);
    }

    @Override // we.b, we.h, we.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // we.h
    public void serialize(ze.f fVar, Dimension.Vertical vertical) {
        r.f(fVar, "encoder");
        r.f(vertical, "value");
        f descriptor2 = getDescriptor();
        d dVarC = fVar.c(descriptor2);
        Dimension.Vertical.write$Self(vertical, dVarC, descriptor2);
        dVarC.d(descriptor2);
    }

    @Override // af.c0
    public b<?>[] typeParametersSerializers() {
        return c0.a.a(this);
    }
}
