package com.revenuecat.purchases.paywalls.components.properties;

import ae.r;
import af.a1;
import af.b0;
import af.c0;
import com.revenuecat.purchases.paywalls.components.properties.ColorInfo;
import we.b;
import we.j;
import ye.f;
import ze.c;
import ze.d;
import ze.e;

/* JADX INFO: loaded from: classes2.dex */
public final class ColorInfo$Gradient$Point$$serializer implements c0<ColorInfo.Gradient.Point> {
    public static final ColorInfo$Gradient$Point$$serializer INSTANCE;
    private static final /* synthetic */ a1 descriptor;

    static {
        ColorInfo$Gradient$Point$$serializer colorInfo$Gradient$Point$$serializer = new ColorInfo$Gradient$Point$$serializer();
        INSTANCE = colorInfo$Gradient$Point$$serializer;
        a1 a1Var = new a1("com.revenuecat.purchases.paywalls.components.properties.ColorInfo.Gradient.Point", colorInfo$Gradient$Point$$serializer, 2);
        a1Var.l("color", false);
        a1Var.l("percent", false);
        descriptor = a1Var;
    }

    private ColorInfo$Gradient$Point$$serializer() {
    }

    @Override // af.c0
    public b<?>[] childSerializers() {
        return new b[]{RgbaStringArgbColorIntDeserializer.INSTANCE, b0.f743a};
    }

    @Override // we.a
    public ColorInfo.Gradient.Point deserialize(e eVar) {
        int iIntValue;
        float fJ;
        int i10;
        r.f(eVar, "decoder");
        f descriptor2 = getDescriptor();
        c cVarC = eVar.c(descriptor2);
        if (cVarC.x()) {
            iIntValue = ((Number) cVarC.k(descriptor2, 0, RgbaStringArgbColorIntDeserializer.INSTANCE, 0)).intValue();
            fJ = cVarC.j(descriptor2, 1);
            i10 = 3;
        } else {
            float fJ2 = 0.0f;
            iIntValue = 0;
            int i11 = 0;
            boolean z10 = true;
            while (z10) {
                int iZ = cVarC.z(descriptor2);
                if (iZ == -1) {
                    z10 = false;
                } else if (iZ == 0) {
                    iIntValue = ((Number) cVarC.k(descriptor2, 0, RgbaStringArgbColorIntDeserializer.INSTANCE, Integer.valueOf(iIntValue))).intValue();
                    i11 |= 1;
                } else {
                    if (iZ != 1) {
                        throw new j(iZ);
                    }
                    fJ2 = cVarC.j(descriptor2, 1);
                    i11 |= 2;
                }
            }
            fJ = fJ2;
            i10 = i11;
        }
        cVarC.d(descriptor2);
        return new ColorInfo.Gradient.Point(i10, iIntValue, fJ, null);
    }

    @Override // we.b, we.h, we.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // we.h
    public void serialize(ze.f fVar, ColorInfo.Gradient.Point point) {
        r.f(fVar, "encoder");
        r.f(point, "value");
        f descriptor2 = getDescriptor();
        d dVarC = fVar.c(descriptor2);
        ColorInfo.Gradient.Point.write$Self(point, dVarC, descriptor2);
        dVarC.d(descriptor2);
    }

    @Override // af.c0
    public b<?>[] typeParametersSerializers() {
        return c0.a.a(this);
    }
}
