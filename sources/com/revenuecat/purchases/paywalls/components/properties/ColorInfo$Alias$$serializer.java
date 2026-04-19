package com.revenuecat.purchases.paywalls.components.properties;

import ae.r;
import af.a1;
import af.c0;
import af.j1;
import af.n1;
import com.revenuecat.purchases.paywalls.components.properties.ColorInfo;
import we.b;
import we.j;
import ye.f;
import ze.c;
import ze.d;
import ze.e;

/* JADX INFO: loaded from: classes2.dex */
public final class ColorInfo$Alias$$serializer implements c0<ColorInfo.Alias> {
    public static final ColorInfo$Alias$$serializer INSTANCE;
    private static final /* synthetic */ a1 descriptor;

    static {
        ColorInfo$Alias$$serializer colorInfo$Alias$$serializer = new ColorInfo$Alias$$serializer();
        INSTANCE = colorInfo$Alias$$serializer;
        a1 a1Var = new a1("alias", colorInfo$Alias$$serializer, 1);
        a1Var.l("value", false);
        descriptor = a1Var;
    }

    private ColorInfo$Alias$$serializer() {
    }

    @Override // af.c0
    public b<?>[] childSerializers() {
        return new b[]{n1.f790a};
    }

    @Override // we.a
    public ColorInfo.Alias deserialize(e eVar) {
        String strM;
        r.f(eVar, "decoder");
        f descriptor2 = getDescriptor();
        c cVarC = eVar.c(descriptor2);
        j1 j1Var = null;
        int i10 = 1;
        if (cVarC.x()) {
            strM = cVarC.m(descriptor2, 0);
        } else {
            strM = null;
            int i11 = 0;
            while (i10 != 0) {
                int iZ = cVarC.z(descriptor2);
                if (iZ == -1) {
                    i10 = 0;
                } else {
                    if (iZ != 0) {
                        throw new j(iZ);
                    }
                    strM = cVarC.m(descriptor2, 0);
                    i11 |= 1;
                }
            }
            i10 = i11;
        }
        cVarC.d(descriptor2);
        return new ColorInfo.Alias(i10, strM, j1Var);
    }

    @Override // we.b, we.h, we.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // we.h
    public void serialize(ze.f fVar, ColorInfo.Alias alias) {
        r.f(fVar, "encoder");
        r.f(alias, "value");
        f descriptor2 = getDescriptor();
        d dVarC = fVar.c(descriptor2);
        dVarC.w(descriptor2, 0, alias.value);
        dVarC.d(descriptor2);
    }

    @Override // af.c0
    public b<?>[] typeParametersSerializers() {
        return c0.a.a(this);
    }
}
