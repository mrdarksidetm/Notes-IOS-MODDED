package com.revenuecat.purchases.paywalls.components.common;

import ae.r;
import af.a1;
import af.c0;
import af.j1;
import com.revenuecat.purchases.paywalls.components.StackComponent;
import com.revenuecat.purchases.paywalls.components.StackComponent$$serializer;
import com.revenuecat.purchases.paywalls.components.StickyFooterComponent;
import com.revenuecat.purchases.paywalls.components.StickyFooterComponent$$serializer;
import we.b;
import we.j;
import xe.a;
import ye.f;
import ze.c;
import ze.d;
import ze.e;

/* JADX INFO: loaded from: classes2.dex */
public final class PaywallComponentsConfig$$serializer implements c0<PaywallComponentsConfig> {
    public static final PaywallComponentsConfig$$serializer INSTANCE;
    private static final /* synthetic */ a1 descriptor;

    static {
        PaywallComponentsConfig$$serializer paywallComponentsConfig$$serializer = new PaywallComponentsConfig$$serializer();
        INSTANCE = paywallComponentsConfig$$serializer;
        a1 a1Var = new a1("com.revenuecat.purchases.paywalls.components.common.PaywallComponentsConfig", paywallComponentsConfig$$serializer, 3);
        a1Var.l("stack", false);
        a1Var.l("background", false);
        a1Var.l("sticky_footer", true);
        descriptor = a1Var;
    }

    private PaywallComponentsConfig$$serializer() {
    }

    @Override // af.c0
    public b<?>[] childSerializers() {
        return new b[]{StackComponent$$serializer.INSTANCE, PaywallComponentsConfig.$childSerializers[1], a.p(StickyFooterComponent$$serializer.INSTANCE)};
    }

    @Override // we.a
    public PaywallComponentsConfig deserialize(e eVar) {
        Object objK;
        Object objK2;
        Object objL;
        int i10;
        r.f(eVar, "decoder");
        f descriptor2 = getDescriptor();
        c cVarC = eVar.c(descriptor2);
        b[] bVarArr = PaywallComponentsConfig.$childSerializers;
        Object objK3 = null;
        if (cVarC.x()) {
            objK2 = cVarC.k(descriptor2, 0, StackComponent$$serializer.INSTANCE, null);
            objK = cVarC.k(descriptor2, 1, bVarArr[1], null);
            objL = cVarC.l(descriptor2, 2, StickyFooterComponent$$serializer.INSTANCE, null);
            i10 = 7;
        } else {
            Object objK4 = null;
            Object objL2 = null;
            int i11 = 0;
            boolean z10 = true;
            while (z10) {
                int iZ = cVarC.z(descriptor2);
                if (iZ == -1) {
                    z10 = false;
                } else if (iZ == 0) {
                    objK3 = cVarC.k(descriptor2, 0, StackComponent$$serializer.INSTANCE, objK3);
                    i11 |= 1;
                } else if (iZ == 1) {
                    objK4 = cVarC.k(descriptor2, 1, bVarArr[1], objK4);
                    i11 |= 2;
                } else {
                    if (iZ != 2) {
                        throw new j(iZ);
                    }
                    objL2 = cVarC.l(descriptor2, 2, StickyFooterComponent$$serializer.INSTANCE, objL2);
                    i11 |= 4;
                }
            }
            objK = objK4;
            objK2 = objK3;
            objL = objL2;
            i10 = i11;
        }
        cVarC.d(descriptor2);
        return new PaywallComponentsConfig(i10, (StackComponent) objK2, (Background) objK, (StickyFooterComponent) objL, (j1) null);
    }

    @Override // we.b, we.h, we.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // we.h
    public void serialize(ze.f fVar, PaywallComponentsConfig paywallComponentsConfig) {
        r.f(fVar, "encoder");
        r.f(paywallComponentsConfig, "value");
        f descriptor2 = getDescriptor();
        d dVarC = fVar.c(descriptor2);
        PaywallComponentsConfig.write$Self(paywallComponentsConfig, dVarC, descriptor2);
        dVarC.d(descriptor2);
    }

    @Override // af.c0
    public b<?>[] typeParametersSerializers() {
        return c0.a.a(this);
    }
}
