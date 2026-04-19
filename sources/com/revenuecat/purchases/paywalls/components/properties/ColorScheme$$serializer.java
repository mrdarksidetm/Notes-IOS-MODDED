package com.revenuecat.purchases.paywalls.components.properties;

import ae.r;
import af.a1;
import af.c0;
import af.j1;
import we.b;
import we.j;
import xe.a;
import ye.f;
import ze.c;
import ze.d;
import ze.e;

/* JADX INFO: loaded from: classes2.dex */
public final class ColorScheme$$serializer implements c0<ColorScheme> {
    public static final ColorScheme$$serializer INSTANCE;
    private static final /* synthetic */ a1 descriptor;

    static {
        ColorScheme$$serializer colorScheme$$serializer = new ColorScheme$$serializer();
        INSTANCE = colorScheme$$serializer;
        a1 a1Var = new a1("com.revenuecat.purchases.paywalls.components.properties.ColorScheme", colorScheme$$serializer, 2);
        a1Var.l("light", false);
        a1Var.l("dark", true);
        descriptor = a1Var;
    }

    private ColorScheme$$serializer() {
    }

    @Override // af.c0
    public b<?>[] childSerializers() {
        b<?>[] bVarArr = ColorScheme.$childSerializers;
        return new b[]{bVarArr[0], a.p(bVarArr[1])};
    }

    @Override // we.a
    public ColorScheme deserialize(e eVar) {
        Object objL;
        Object objK;
        int i10;
        r.f(eVar, "decoder");
        f descriptor2 = getDescriptor();
        c cVarC = eVar.c(descriptor2);
        b[] bVarArr = ColorScheme.$childSerializers;
        j1 j1Var = null;
        if (cVarC.x()) {
            objK = cVarC.k(descriptor2, 0, bVarArr[0], null);
            objL = cVarC.l(descriptor2, 1, bVarArr[1], null);
            i10 = 3;
        } else {
            Object objL2 = null;
            Object objK2 = null;
            int i11 = 0;
            boolean z10 = true;
            while (z10) {
                int iZ = cVarC.z(descriptor2);
                if (iZ == -1) {
                    z10 = false;
                } else if (iZ == 0) {
                    objK2 = cVarC.k(descriptor2, 0, bVarArr[0], objK2);
                    i11 |= 1;
                } else {
                    if (iZ != 1) {
                        throw new j(iZ);
                    }
                    objL2 = cVarC.l(descriptor2, 1, bVarArr[1], objL2);
                    i11 |= 2;
                }
            }
            objL = objL2;
            objK = objK2;
            i10 = i11;
        }
        cVarC.d(descriptor2);
        return new ColorScheme(i10, (ColorInfo) objK, (ColorInfo) objL, j1Var);
    }

    @Override // we.b, we.h, we.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // we.h
    public void serialize(ze.f fVar, ColorScheme colorScheme) {
        r.f(fVar, "encoder");
        r.f(colorScheme, "value");
        f descriptor2 = getDescriptor();
        d dVarC = fVar.c(descriptor2);
        ColorScheme.write$Self(colorScheme, dVarC, descriptor2);
        dVarC.d(descriptor2);
    }

    @Override // af.c0
    public b<?>[] typeParametersSerializers() {
        return c0.a.a(this);
    }
}
