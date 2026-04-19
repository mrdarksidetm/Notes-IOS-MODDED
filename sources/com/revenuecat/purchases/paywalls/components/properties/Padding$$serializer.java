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
public final class Padding$$serializer implements c0<Padding> {
    public static final Padding$$serializer INSTANCE;
    private static final /* synthetic */ a1 descriptor;

    static {
        Padding$$serializer padding$$serializer = new Padding$$serializer();
        INSTANCE = padding$$serializer;
        a1 a1Var = new a1("com.revenuecat.purchases.paywalls.components.properties.Padding", padding$$serializer, 4);
        a1Var.l("top", false);
        a1Var.l("bottom", false);
        a1Var.l("leading", false);
        a1Var.l("trailing", false);
        descriptor = a1Var;
    }

    private Padding$$serializer() {
    }

    @Override // af.c0
    public b<?>[] childSerializers() {
        t tVar = t.f820a;
        return new b[]{tVar, tVar, tVar, tVar};
    }

    @Override // we.a
    public Padding deserialize(e eVar) {
        int i10;
        double dY;
        double d10;
        double d11;
        double d12;
        r.f(eVar, "decoder");
        f descriptor2 = getDescriptor();
        c cVarC = eVar.c(descriptor2);
        if (cVarC.x()) {
            double dY2 = cVarC.y(descriptor2, 0);
            double dY3 = cVarC.y(descriptor2, 1);
            double dY4 = cVarC.y(descriptor2, 2);
            dY = cVarC.y(descriptor2, 3);
            i10 = 15;
            d10 = dY3;
            d11 = dY2;
            d12 = dY4;
        } else {
            double dY5 = 0.0d;
            int i11 = 0;
            boolean z10 = true;
            double dY6 = 0.0d;
            double dY7 = 0.0d;
            double dY8 = 0.0d;
            while (z10) {
                int iZ = cVarC.z(descriptor2);
                if (iZ == -1) {
                    z10 = false;
                } else if (iZ == 0) {
                    dY7 = cVarC.y(descriptor2, 0);
                    i11 |= 1;
                } else if (iZ == 1) {
                    dY6 = cVarC.y(descriptor2, 1);
                    i11 |= 2;
                } else if (iZ == 2) {
                    dY8 = cVarC.y(descriptor2, 2);
                    i11 |= 4;
                } else {
                    if (iZ != 3) {
                        throw new j(iZ);
                    }
                    dY5 = cVarC.y(descriptor2, 3);
                    i11 |= 8;
                }
            }
            i10 = i11;
            dY = dY5;
            d10 = dY6;
            d11 = dY7;
            d12 = dY8;
        }
        cVarC.d(descriptor2);
        return new Padding(i10, d11, d10, d12, dY, null);
    }

    @Override // we.b, we.h, we.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // we.h
    public void serialize(ze.f fVar, Padding padding) {
        r.f(fVar, "encoder");
        r.f(padding, "value");
        f descriptor2 = getDescriptor();
        d dVarC = fVar.c(descriptor2);
        Padding.write$Self(padding, dVarC, descriptor2);
        dVarC.d(descriptor2);
    }

    @Override // af.c0
    public b<?>[] typeParametersSerializers() {
        return c0.a.a(this);
    }
}
