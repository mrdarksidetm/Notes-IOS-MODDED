package com.revenuecat.purchases.paywalls.components;

import ae.r;
import af.a1;
import af.c0;
import af.j1;
import we.b;
import we.j;
import ye.f;
import ze.c;
import ze.d;
import ze.e;

/* JADX INFO: loaded from: classes2.dex */
public final class StickyFooterComponent$$serializer implements c0<StickyFooterComponent> {
    public static final StickyFooterComponent$$serializer INSTANCE;
    private static final /* synthetic */ a1 descriptor;

    static {
        StickyFooterComponent$$serializer stickyFooterComponent$$serializer = new StickyFooterComponent$$serializer();
        INSTANCE = stickyFooterComponent$$serializer;
        a1 a1Var = new a1("sticky_footer", stickyFooterComponent$$serializer, 1);
        a1Var.l("stack", false);
        descriptor = a1Var;
    }

    private StickyFooterComponent$$serializer() {
    }

    @Override // af.c0
    public b<?>[] childSerializers() {
        return new b[]{StackComponent$$serializer.INSTANCE};
    }

    @Override // we.a
    public StickyFooterComponent deserialize(e eVar) {
        Object objK;
        r.f(eVar, "decoder");
        f descriptor2 = getDescriptor();
        c cVarC = eVar.c(descriptor2);
        j1 j1Var = null;
        int i10 = 1;
        if (cVarC.x()) {
            objK = cVarC.k(descriptor2, 0, StackComponent$$serializer.INSTANCE, null);
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
                    objK = cVarC.k(descriptor2, 0, StackComponent$$serializer.INSTANCE, objK);
                    i11 |= 1;
                }
            }
            i10 = i11;
        }
        cVarC.d(descriptor2);
        return new StickyFooterComponent(i10, (StackComponent) objK, j1Var);
    }

    @Override // we.b, we.h, we.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // we.h
    public void serialize(ze.f fVar, StickyFooterComponent stickyFooterComponent) {
        r.f(fVar, "encoder");
        r.f(stickyFooterComponent, "value");
        f descriptor2 = getDescriptor();
        d dVarC = fVar.c(descriptor2);
        dVarC.E(descriptor2, 0, StackComponent$$serializer.INSTANCE, stickyFooterComponent.stack);
        dVarC.d(descriptor2);
    }

    @Override // af.c0
    public b<?>[] typeParametersSerializers() {
        return c0.a.a(this);
    }
}
