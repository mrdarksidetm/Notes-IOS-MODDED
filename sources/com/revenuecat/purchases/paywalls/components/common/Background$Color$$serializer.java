package com.revenuecat.purchases.paywalls.components.common;

import ae.r;
import af.a1;
import af.c0;
import af.j1;
import com.revenuecat.purchases.paywalls.components.common.Background;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer;
import we.b;
import we.j;
import ye.f;
import ze.c;
import ze.d;
import ze.e;

/* JADX INFO: loaded from: classes2.dex */
public final class Background$Color$$serializer implements c0<Background.Color> {
    public static final Background$Color$$serializer INSTANCE;
    private static final /* synthetic */ a1 descriptor;

    static {
        Background$Color$$serializer background$Color$$serializer = new Background$Color$$serializer();
        INSTANCE = background$Color$$serializer;
        a1 a1Var = new a1("color", background$Color$$serializer, 1);
        a1Var.l("value", false);
        descriptor = a1Var;
    }

    private Background$Color$$serializer() {
    }

    @Override // af.c0
    public b<?>[] childSerializers() {
        return new b[]{ColorScheme$$serializer.INSTANCE};
    }

    @Override // we.a
    public Background.Color deserialize(e eVar) {
        Object objK;
        r.f(eVar, "decoder");
        f descriptor2 = getDescriptor();
        c cVarC = eVar.c(descriptor2);
        j1 j1Var = null;
        int i10 = 1;
        if (cVarC.x()) {
            objK = cVarC.k(descriptor2, 0, ColorScheme$$serializer.INSTANCE, null);
        } else {
            objK = null;
            int i11 = 0;
            while (i10 != 0) {
                int iZ = cVarC.z(descriptor2);
                if (iZ == -1) {
                    i10 = 0;
                } else {
                    if (iZ != 0) {
                        throw new j(iZ);
                    }
                    objK = cVarC.k(descriptor2, 0, ColorScheme$$serializer.INSTANCE, objK);
                    i11 |= 1;
                }
            }
            i10 = i11;
        }
        cVarC.d(descriptor2);
        return new Background.Color(i10, (ColorScheme) objK, j1Var);
    }

    @Override // we.b, we.h, we.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // we.h
    public void serialize(ze.f fVar, Background.Color color) {
        r.f(fVar, "encoder");
        r.f(color, "value");
        f descriptor2 = getDescriptor();
        d dVarC = fVar.c(descriptor2);
        dVarC.E(descriptor2, 0, ColorScheme$$serializer.INSTANCE, color.value);
        dVarC.d(descriptor2);
    }

    @Override // af.c0
    public b<?>[] typeParametersSerializers() {
        return c0.a.a(this);
    }
}
