package com.revenuecat.purchases.paywalls.components;

import ae.r;
import af.a1;
import af.c0;
import af.n1;
import com.revenuecat.purchases.paywalls.components.ButtonComponent;
import we.b;
import we.j;
import ye.f;
import ze.c;
import ze.d;
import ze.e;

/* JADX INFO: loaded from: classes2.dex */
public final class ButtonComponent$Destination$Terms$$serializer implements c0<ButtonComponent.Destination.Terms> {
    public static final ButtonComponent$Destination$Terms$$serializer INSTANCE;
    private static final /* synthetic */ a1 descriptor;

    static {
        ButtonComponent$Destination$Terms$$serializer buttonComponent$Destination$Terms$$serializer = new ButtonComponent$Destination$Terms$$serializer();
        INSTANCE = buttonComponent$Destination$Terms$$serializer;
        a1 a1Var = new a1("com.revenuecat.purchases.paywalls.components.ButtonComponent.Destination.Terms", buttonComponent$Destination$Terms$$serializer, 2);
        a1Var.l("urlLid", false);
        a1Var.l("method", false);
        descriptor = a1Var;
    }

    private ButtonComponent$Destination$Terms$$serializer() {
    }

    @Override // af.c0
    public b<?>[] childSerializers() {
        return new b[]{n1.f790a, ButtonComponent.Destination.Terms.$childSerializers[1]};
    }

    @Override // we.a
    public ButtonComponent.Destination.Terms deserialize(e eVar) {
        Object objK;
        String strM;
        int i10;
        r.f(eVar, "decoder");
        f descriptor2 = getDescriptor();
        c cVarC = eVar.c(descriptor2);
        b[] bVarArr = ButtonComponent.Destination.Terms.$childSerializers;
        if (cVarC.x()) {
            strM = cVarC.m(descriptor2, 0);
            objK = cVarC.k(descriptor2, 1, bVarArr[1], null);
            i10 = 3;
        } else {
            Object objK2 = null;
            String strM2 = null;
            int i11 = 0;
            boolean z10 = true;
            while (z10) {
                int iZ = cVarC.z(descriptor2);
                if (iZ == -1) {
                    z10 = false;
                } else if (iZ == 0) {
                    strM2 = cVarC.m(descriptor2, 0);
                    i11 |= 1;
                } else {
                    if (iZ != 1) {
                        throw new j(iZ);
                    }
                    objK2 = cVarC.k(descriptor2, 1, bVarArr[1], objK2);
                    i11 |= 2;
                }
            }
            objK = objK2;
            strM = strM2;
            i10 = i11;
        }
        cVarC.d(descriptor2);
        return new ButtonComponent.Destination.Terms(i10, strM, (ButtonComponent.UrlMethod) objK, null);
    }

    @Override // we.b, we.h, we.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // we.h
    public void serialize(ze.f fVar, ButtonComponent.Destination.Terms terms) {
        r.f(fVar, "encoder");
        r.f(terms, "value");
        f descriptor2 = getDescriptor();
        d dVarC = fVar.c(descriptor2);
        ButtonComponent.Destination.Terms.write$Self(terms, dVarC, descriptor2);
        dVarC.d(descriptor2);
    }

    @Override // af.c0
    public b<?>[] typeParametersSerializers() {
        return c0.a.a(this);
    }
}
