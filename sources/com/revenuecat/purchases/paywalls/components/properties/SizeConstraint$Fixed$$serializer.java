package com.revenuecat.purchases.paywalls.components.properties;

import ae.r;
import af.a1;
import af.c0;
import af.j1;
import af.v1;
import com.revenuecat.purchases.paywalls.components.properties.SizeConstraint;
import md.a0;
import we.b;
import we.j;
import ye.f;
import ze.c;
import ze.d;
import ze.e;

/* JADX INFO: loaded from: classes2.dex */
public final class SizeConstraint$Fixed$$serializer implements c0<SizeConstraint.Fixed> {
    public static final SizeConstraint$Fixed$$serializer INSTANCE;
    private static final /* synthetic */ a1 descriptor;

    static {
        SizeConstraint$Fixed$$serializer sizeConstraint$Fixed$$serializer = new SizeConstraint$Fixed$$serializer();
        INSTANCE = sizeConstraint$Fixed$$serializer;
        a1 a1Var = new a1("fixed", sizeConstraint$Fixed$$serializer, 1);
        a1Var.l("value", false);
        descriptor = a1Var;
    }

    private SizeConstraint$Fixed$$serializer() {
    }

    @Override // af.c0
    public b<?>[] childSerializers() {
        return new b[]{v1.f840a};
    }

    @Override // we.a
    public SizeConstraint.Fixed deserialize(e eVar) {
        Object objK;
        r.f(eVar, "decoder");
        f descriptor2 = getDescriptor();
        c cVarC = eVar.c(descriptor2);
        j1 j1Var = null;
        byte b10 = 0;
        int i10 = 1;
        if (cVarC.x()) {
            objK = cVarC.k(descriptor2, 0, v1.f840a, null);
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
                    objK = cVarC.k(descriptor2, 0, v1.f840a, objK);
                    i11 |= 1;
                }
            }
            i10 = i11;
        }
        cVarC.d(descriptor2);
        return new SizeConstraint.Fixed(i10, (a0) objK, j1Var, b10 == true ? 1 : 0);
    }

    @Override // we.b, we.h, we.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // we.h
    public void serialize(ze.f fVar, SizeConstraint.Fixed fixed) {
        r.f(fVar, "encoder");
        r.f(fixed, "value");
        f descriptor2 = getDescriptor();
        d dVarC = fVar.c(descriptor2);
        dVarC.E(descriptor2, 0, v1.f840a, a0.a(fixed.value));
        dVarC.d(descriptor2);
    }

    @Override // af.c0
    public b<?>[] typeParametersSerializers() {
        return c0.a.a(this);
    }
}
