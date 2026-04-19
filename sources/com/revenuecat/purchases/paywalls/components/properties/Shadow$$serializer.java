package com.revenuecat.purchases.paywalls.components.properties;

import ae.r;
import af.a1;
import af.c0;
import af.t;
import we.b;
import we.j;
import ye.f;
import ze.c;
import ze.d;
import ze.e;

/* JADX INFO: loaded from: classes2.dex */
public final class Shadow$$serializer implements c0<Shadow> {
    public static final Shadow$$serializer INSTANCE;
    private static final /* synthetic */ a1 descriptor;

    static {
        Shadow$$serializer shadow$$serializer = new Shadow$$serializer();
        INSTANCE = shadow$$serializer;
        a1 a1Var = new a1("com.revenuecat.purchases.paywalls.components.properties.Shadow", shadow$$serializer, 4);
        a1Var.l("color", false);
        a1Var.l("radius", false);
        a1Var.l("x", false);
        a1Var.l("y", false);
        descriptor = a1Var;
    }

    private Shadow$$serializer() {
    }

    @Override // af.c0
    public b<?>[] childSerializers() {
        t tVar = t.f820a;
        return new b[]{ColorScheme$$serializer.INSTANCE, tVar, tVar, tVar};
    }

    @Override // we.a
    public Shadow deserialize(e eVar) {
        int i10;
        Object objK;
        double d10;
        double dY;
        double d11;
        r.f(eVar, "decoder");
        f descriptor2 = getDescriptor();
        c cVarC = eVar.c(descriptor2);
        Object objK2 = null;
        if (cVarC.x()) {
            objK = cVarC.k(descriptor2, 0, ColorScheme$$serializer.INSTANCE, null);
            double dY2 = cVarC.y(descriptor2, 1);
            double dY3 = cVarC.y(descriptor2, 2);
            dY = cVarC.y(descriptor2, 3);
            i10 = 15;
            d11 = dY3;
            d10 = dY2;
        } else {
            double dY4 = 0.0d;
            int i11 = 0;
            boolean z10 = true;
            double dY5 = 0.0d;
            double dY6 = 0.0d;
            while (z10) {
                int iZ = cVarC.z(descriptor2);
                if (iZ == -1) {
                    z10 = false;
                } else if (iZ == 0) {
                    objK2 = cVarC.k(descriptor2, 0, ColorScheme$$serializer.INSTANCE, objK2);
                    i11 |= 1;
                } else if (iZ == 1) {
                    dY5 = cVarC.y(descriptor2, 1);
                    i11 |= 2;
                } else if (iZ == 2) {
                    dY6 = cVarC.y(descriptor2, 2);
                    i11 |= 4;
                } else {
                    if (iZ != 3) {
                        throw new j(iZ);
                    }
                    dY4 = cVarC.y(descriptor2, 3);
                    i11 |= 8;
                }
            }
            i10 = i11;
            objK = objK2;
            d10 = dY5;
            dY = dY4;
            d11 = dY6;
        }
        cVarC.d(descriptor2);
        return new Shadow(i10, (ColorScheme) objK, d10, d11, dY, null);
    }

    @Override // we.b, we.h, we.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // we.h
    public void serialize(ze.f fVar, Shadow shadow) {
        r.f(fVar, "encoder");
        r.f(shadow, "value");
        f descriptor2 = getDescriptor();
        d dVarC = fVar.c(descriptor2);
        Shadow.write$Self(shadow, dVarC, descriptor2);
        dVarC.d(descriptor2);
    }

    @Override // af.c0
    public b<?>[] typeParametersSerializers() {
        return c0.a.a(this);
    }
}
