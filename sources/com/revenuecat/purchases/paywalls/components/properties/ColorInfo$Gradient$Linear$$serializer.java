package com.revenuecat.purchases.paywalls.components.properties;

import ae.r;
import af.a1;
import af.b0;
import af.c0;
import af.j1;
import com.revenuecat.purchases.paywalls.components.properties.ColorInfo;
import java.util.List;
import we.b;
import we.j;
import ye.f;
import ze.c;
import ze.d;
import ze.e;

/* JADX INFO: loaded from: classes2.dex */
public final class ColorInfo$Gradient$Linear$$serializer implements c0<ColorInfo.Gradient.Linear> {
    public static final ColorInfo$Gradient$Linear$$serializer INSTANCE;
    private static final /* synthetic */ a1 descriptor;

    static {
        ColorInfo$Gradient$Linear$$serializer colorInfo$Gradient$Linear$$serializer = new ColorInfo$Gradient$Linear$$serializer();
        INSTANCE = colorInfo$Gradient$Linear$$serializer;
        a1 a1Var = new a1("linear", colorInfo$Gradient$Linear$$serializer, 2);
        a1Var.l("degrees", false);
        a1Var.l("points", false);
        descriptor = a1Var;
    }

    private ColorInfo$Gradient$Linear$$serializer() {
    }

    @Override // af.c0
    public b<?>[] childSerializers() {
        return new b[]{b0.f743a, ColorInfo.Gradient.Linear.$childSerializers[1]};
    }

    @Override // we.a
    public ColorInfo.Gradient.Linear deserialize(e eVar) {
        Object objK;
        float fJ;
        int i10;
        r.f(eVar, "decoder");
        f descriptor2 = getDescriptor();
        c cVarC = eVar.c(descriptor2);
        b[] bVarArr = ColorInfo.Gradient.Linear.$childSerializers;
        j1 j1Var = null;
        if (cVarC.x()) {
            fJ = cVarC.j(descriptor2, 0);
            objK = cVarC.k(descriptor2, 1, bVarArr[1], null);
            i10 = 3;
        } else {
            float fJ2 = 0.0f;
            Object objK2 = null;
            int i11 = 0;
            boolean z10 = true;
            while (z10) {
                int iZ = cVarC.z(descriptor2);
                if (iZ == -1) {
                    z10 = false;
                } else if (iZ == 0) {
                    fJ2 = cVarC.j(descriptor2, 0);
                    i11 |= 1;
                } else {
                    if (iZ != 1) {
                        throw new j(iZ);
                    }
                    objK2 = cVarC.k(descriptor2, 1, bVarArr[1], objK2);
                    i11 |= 2;
                }
            }
            objK = objK2;
            fJ = fJ2;
            i10 = i11;
        }
        cVarC.d(descriptor2);
        return new ColorInfo.Gradient.Linear(i10, fJ, (List) objK, j1Var);
    }

    @Override // we.b, we.h, we.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // we.h
    public void serialize(ze.f fVar, ColorInfo.Gradient.Linear linear) {
        r.f(fVar, "encoder");
        r.f(linear, "value");
        f descriptor2 = getDescriptor();
        d dVarC = fVar.c(descriptor2);
        ColorInfo.Gradient.Linear.write$Self(linear, dVarC, descriptor2);
        dVarC.d(descriptor2);
    }

    @Override // af.c0
    public b<?>[] typeParametersSerializers() {
        return c0.a.a(this);
    }
}
