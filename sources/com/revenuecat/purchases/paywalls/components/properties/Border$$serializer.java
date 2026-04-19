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
public final class Border$$serializer implements c0<Border> {
    public static final Border$$serializer INSTANCE;
    private static final /* synthetic */ a1 descriptor;

    static {
        Border$$serializer border$$serializer = new Border$$serializer();
        INSTANCE = border$$serializer;
        a1 a1Var = new a1("com.revenuecat.purchases.paywalls.components.properties.Border", border$$serializer, 2);
        a1Var.l("color", false);
        a1Var.l("width", false);
        descriptor = a1Var;
    }

    private Border$$serializer() {
    }

    @Override // af.c0
    public b<?>[] childSerializers() {
        return new b[]{ColorScheme$$serializer.INSTANCE, t.f820a};
    }

    @Override // we.a
    public Border deserialize(e eVar) {
        double dY;
        Object objK;
        int i10;
        r.f(eVar, "decoder");
        f descriptor2 = getDescriptor();
        c cVarC = eVar.c(descriptor2);
        if (cVarC.x()) {
            objK = cVarC.k(descriptor2, 0, ColorScheme$$serializer.INSTANCE, null);
            i10 = 3;
            dY = cVarC.y(descriptor2, 1);
        } else {
            dY = 0.0d;
            boolean z10 = true;
            objK = null;
            i10 = 0;
            while (z10) {
                int iZ = cVarC.z(descriptor2);
                if (iZ == -1) {
                    z10 = false;
                } else if (iZ == 0) {
                    objK = cVarC.k(descriptor2, 0, ColorScheme$$serializer.INSTANCE, objK);
                    i10 |= 1;
                } else {
                    if (iZ != 1) {
                        throw new j(iZ);
                    }
                    dY = cVarC.y(descriptor2, 1);
                    i10 |= 2;
                }
            }
        }
        cVarC.d(descriptor2);
        return new Border(i10, (ColorScheme) objK, dY, null);
    }

    @Override // we.b, we.h, we.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // we.h
    public void serialize(ze.f fVar, Border border) {
        r.f(fVar, "encoder");
        r.f(border, "value");
        f descriptor2 = getDescriptor();
        d dVarC = fVar.c(descriptor2);
        Border.write$Self(border, dVarC, descriptor2);
        dVarC.d(descriptor2);
    }

    @Override // af.c0
    public b<?>[] typeParametersSerializers() {
        return c0.a.a(this);
    }
}
