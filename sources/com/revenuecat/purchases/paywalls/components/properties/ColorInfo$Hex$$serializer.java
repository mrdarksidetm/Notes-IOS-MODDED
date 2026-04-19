package com.revenuecat.purchases.paywalls.components.properties;

import ae.r;
import af.a1;
import af.c0;
import com.revenuecat.purchases.paywalls.components.properties.ColorInfo;
import we.b;
import we.j;
import ye.f;
import ze.c;
import ze.d;
import ze.e;

/* JADX INFO: loaded from: classes2.dex */
public final class ColorInfo$Hex$$serializer implements c0<ColorInfo.Hex> {
    public static final ColorInfo$Hex$$serializer INSTANCE;
    private static final /* synthetic */ a1 descriptor;

    static {
        ColorInfo$Hex$$serializer colorInfo$Hex$$serializer = new ColorInfo$Hex$$serializer();
        INSTANCE = colorInfo$Hex$$serializer;
        a1 a1Var = new a1("hex", colorInfo$Hex$$serializer, 1);
        a1Var.l("value", false);
        descriptor = a1Var;
    }

    private ColorInfo$Hex$$serializer() {
    }

    @Override // af.c0
    public b<?>[] childSerializers() {
        return new b[]{RgbaStringArgbColorIntDeserializer.INSTANCE};
    }

    @Override // we.a
    public ColorInfo.Hex deserialize(e eVar) {
        int iIntValue;
        r.f(eVar, "decoder");
        f descriptor2 = getDescriptor();
        c cVarC = eVar.c(descriptor2);
        int i10 = 1;
        if (cVarC.x()) {
            iIntValue = ((Number) cVarC.k(descriptor2, 0, RgbaStringArgbColorIntDeserializer.INSTANCE, 0)).intValue();
        } else {
            iIntValue = 0;
            int i11 = 0;
            while (i10 != 0) {
                int iZ = cVarC.z(descriptor2);
                if (iZ == -1) {
                    i10 = 0;
                } else {
                    if (iZ != 0) {
                        throw new j(iZ);
                    }
                    iIntValue = ((Number) cVarC.k(descriptor2, 0, RgbaStringArgbColorIntDeserializer.INSTANCE, Integer.valueOf(iIntValue))).intValue();
                    i11 |= 1;
                }
            }
            i10 = i11;
        }
        cVarC.d(descriptor2);
        return new ColorInfo.Hex(i10, iIntValue, null);
    }

    @Override // we.b, we.h, we.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // we.h
    public void serialize(ze.f fVar, ColorInfo.Hex hex) {
        r.f(fVar, "encoder");
        r.f(hex, "value");
        f descriptor2 = getDescriptor();
        d dVarC = fVar.c(descriptor2);
        dVarC.E(descriptor2, 0, RgbaStringArgbColorIntDeserializer.INSTANCE, Integer.valueOf(hex.value));
        dVarC.d(descriptor2);
    }

    @Override // af.c0
    public b<?>[] typeParametersSerializers() {
        return c0.a.a(this);
    }
}
