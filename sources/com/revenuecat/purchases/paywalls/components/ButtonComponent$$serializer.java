package com.revenuecat.purchases.paywalls.components;

import ae.r;
import af.a1;
import af.c0;
import com.revenuecat.purchases.paywalls.components.ButtonComponent;
import we.b;
import we.j;
import ye.f;
import ze.c;
import ze.d;
import ze.e;

/* JADX INFO: loaded from: classes2.dex */
public final class ButtonComponent$$serializer implements c0<ButtonComponent> {
    public static final ButtonComponent$$serializer INSTANCE;
    private static final /* synthetic */ a1 descriptor;

    static {
        ButtonComponent$$serializer buttonComponent$$serializer = new ButtonComponent$$serializer();
        INSTANCE = buttonComponent$$serializer;
        a1 a1Var = new a1("button", buttonComponent$$serializer, 2);
        a1Var.l("action", false);
        a1Var.l("stack", false);
        descriptor = a1Var;
    }

    private ButtonComponent$$serializer() {
    }

    @Override // af.c0
    public b<?>[] childSerializers() {
        return new b[]{ActionSerializer.INSTANCE, StackComponent$$serializer.INSTANCE};
    }

    @Override // we.a
    public ButtonComponent deserialize(e eVar) {
        Object objK;
        Object objK2;
        int i10;
        r.f(eVar, "decoder");
        f descriptor2 = getDescriptor();
        c cVarC = eVar.c(descriptor2);
        if (cVarC.x()) {
            objK = cVarC.k(descriptor2, 0, ActionSerializer.INSTANCE, null);
            objK2 = cVarC.k(descriptor2, 1, StackComponent$$serializer.INSTANCE, null);
            i10 = 3;
        } else {
            objK = null;
            Object objK3 = null;
            int i11 = 0;
            boolean z10 = true;
            while (z10) {
                int iZ = cVarC.z(descriptor2);
                if (iZ == -1) {
                    z10 = false;
                } else if (iZ == 0) {
                    objK = cVarC.k(descriptor2, 0, ActionSerializer.INSTANCE, objK);
                    i11 |= 1;
                } else {
                    if (iZ != 1) {
                        throw new j(iZ);
                    }
                    objK3 = cVarC.k(descriptor2, 1, StackComponent$$serializer.INSTANCE, objK3);
                    i11 |= 2;
                }
            }
            objK2 = objK3;
            i10 = i11;
        }
        cVarC.d(descriptor2);
        return new ButtonComponent(i10, (ButtonComponent.Action) objK, (StackComponent) objK2, null);
    }

    @Override // we.b, we.h, we.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // we.h
    public void serialize(ze.f fVar, ButtonComponent buttonComponent) {
        r.f(fVar, "encoder");
        r.f(buttonComponent, "value");
        f descriptor2 = getDescriptor();
        d dVarC = fVar.c(descriptor2);
        ButtonComponent.write$Self(buttonComponent, dVarC, descriptor2);
        dVarC.d(descriptor2);
    }

    @Override // af.c0
    public b<?>[] typeParametersSerializers() {
        return c0.a.a(this);
    }
}
