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
public final class Dimension$Horizontal$$serializer implements c0<Dimension.Horizontal> {
    public static final Dimension$Horizontal$$serializer INSTANCE;
    private static final /* synthetic */ a1 descriptor;

    static {
        Dimension$Horizontal$$serializer dimension$Horizontal$$serializer = new Dimension$Horizontal$$serializer();
        INSTANCE = dimension$Horizontal$$serializer;
        a1 a1Var = new a1("horizontal", dimension$Horizontal$$serializer, 2);
        a1Var.l("alignment", false);
        a1Var.l("distribution", false);
        descriptor = a1Var;
    }

    private Dimension$Horizontal$$serializer() {
    }

    @Override // af.c0
    public b<?>[] childSerializers() {
        b<?>[] bVarArr = Dimension.Horizontal.$childSerializers;
        return new b[]{bVarArr[0], bVarArr[1]};
    }

    @Override // we.a
    public Dimension.Horizontal deserialize(e eVar) {
        Object objK;
        Object objK2;
        int i10;
        r.f(eVar, "decoder");
        f descriptor2 = getDescriptor();
        c cVarC = eVar.c(descriptor2);
        b[] bVarArr = Dimension.Horizontal.$childSerializers;
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
        return new Dimension.Horizontal(i10, (VerticalAlignment) objK2, (FlexDistribution) objK, null);
    }

    @Override // we.b, we.h, we.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // we.h
    public void serialize(ze.f fVar, Dimension.Horizontal horizontal) {
        r.f(fVar, "encoder");
        r.f(horizontal, "value");
        f descriptor2 = getDescriptor();
        d dVarC = fVar.c(descriptor2);
        Dimension.Horizontal.write$Self(horizontal, dVarC, descriptor2);
        dVarC.d(descriptor2);
    }

    @Override // af.c0
    public b<?>[] typeParametersSerializers() {
        return c0.a.a(this);
    }
}
