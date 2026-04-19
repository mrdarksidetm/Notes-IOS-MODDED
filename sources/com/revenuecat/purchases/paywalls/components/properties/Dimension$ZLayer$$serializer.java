package com.revenuecat.purchases.paywalls.components.properties;

import ae.r;
import af.a1;
import af.c0;
import com.revenuecat.purchases.paywalls.components.properties.Dimension;
import we.b;
import we.j;
import ye.f;
import ze.c;
import ze.d;
import ze.e;

/* JADX INFO: loaded from: classes2.dex */
public final class Dimension$ZLayer$$serializer implements c0<Dimension.ZLayer> {
    public static final Dimension$ZLayer$$serializer INSTANCE;
    private static final /* synthetic */ a1 descriptor;

    static {
        Dimension$ZLayer$$serializer dimension$ZLayer$$serializer = new Dimension$ZLayer$$serializer();
        INSTANCE = dimension$ZLayer$$serializer;
        a1 a1Var = new a1("zlayer", dimension$ZLayer$$serializer, 1);
        a1Var.l("alignment", false);
        descriptor = a1Var;
    }

    private Dimension$ZLayer$$serializer() {
    }

    @Override // af.c0
    public b<?>[] childSerializers() {
        return new b[]{Dimension.ZLayer.$childSerializers[0]};
    }

    @Override // we.a
    public Dimension.ZLayer deserialize(e eVar) {
        Object objK;
        r.f(eVar, "decoder");
        f descriptor2 = getDescriptor();
        c cVarC = eVar.c(descriptor2);
        b[] bVarArr = Dimension.ZLayer.$childSerializers;
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
        return new Dimension.ZLayer(i10, (TwoDimensionalAlignment) objK, null);
    }

    @Override // we.b, we.h, we.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // we.h
    public void serialize(ze.f fVar, Dimension.ZLayer zLayer) {
        r.f(fVar, "encoder");
        r.f(zLayer, "value");
        f descriptor2 = getDescriptor();
        d dVarC = fVar.c(descriptor2);
        dVarC.E(descriptor2, 0, Dimension.ZLayer.$childSerializers[0], zLayer.alignment);
        dVarC.d(descriptor2);
    }

    @Override // af.c0
    public b<?>[] typeParametersSerializers() {
        return c0.a.a(this);
    }
}
