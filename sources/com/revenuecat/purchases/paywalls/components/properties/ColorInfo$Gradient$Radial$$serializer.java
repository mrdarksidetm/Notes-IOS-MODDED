package com.revenuecat.purchases.paywalls.components.properties;

import ae.r;
import af.a1;
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
public final class ColorInfo$Gradient$Radial$$serializer implements c0<ColorInfo.Gradient.Radial> {
    public static final ColorInfo$Gradient$Radial$$serializer INSTANCE;
    private static final /* synthetic */ a1 descriptor;

    static {
        ColorInfo$Gradient$Radial$$serializer colorInfo$Gradient$Radial$$serializer = new ColorInfo$Gradient$Radial$$serializer();
        INSTANCE = colorInfo$Gradient$Radial$$serializer;
        a1 a1Var = new a1("radial", colorInfo$Gradient$Radial$$serializer, 1);
        a1Var.l("points", false);
        descriptor = a1Var;
    }

    private ColorInfo$Gradient$Radial$$serializer() {
    }

    @Override // af.c0
    public b<?>[] childSerializers() {
        return new b[]{ColorInfo.Gradient.Radial.$childSerializers[0]};
    }

    @Override // we.a
    public ColorInfo.Gradient.Radial deserialize(e eVar) {
        Object objK;
        r.f(eVar, "decoder");
        f descriptor2 = getDescriptor();
        c cVarC = eVar.c(descriptor2);
        b[] bVarArr = ColorInfo.Gradient.Radial.$childSerializers;
        j1 j1Var = null;
        int i10 = 1;
        if (cVarC.x()) {
            objK = cVarC.k(descriptor2, 0, bVarArr[0], null);
        } else {
            Object objK2 = null;
            int i11 = 0;
            while (i10 != 0) {
                int iZ = cVarC.z(descriptor2);
                if (iZ == -1) {
                    i10 = 0;
                } else {
                    if (iZ != 0) {
                        throw new j(iZ);
                    }
                    objK2 = cVarC.k(descriptor2, 0, bVarArr[0], objK2);
                    i11 |= 1;
                }
            }
            objK = objK2;
            i10 = i11;
        }
        cVarC.d(descriptor2);
        return new ColorInfo.Gradient.Radial(i10, (List) objK, j1Var);
    }

    @Override // we.b, we.h, we.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // we.h
    public void serialize(ze.f fVar, ColorInfo.Gradient.Radial radial) {
        r.f(fVar, "encoder");
        r.f(radial, "value");
        f descriptor2 = getDescriptor();
        d dVarC = fVar.c(descriptor2);
        dVarC.E(descriptor2, 0, ColorInfo.Gradient.Radial.$childSerializers[0], radial.points);
        dVarC.d(descriptor2);
    }

    @Override // af.c0
    public b<?>[] typeParametersSerializers() {
        return c0.a.a(this);
    }
}
