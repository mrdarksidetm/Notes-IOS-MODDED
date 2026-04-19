package com.revenuecat.purchases.paywalls.components;

import ae.r;
import af.a1;
import af.c0;
import af.j1;
import we.b;
import we.j;
import xe.a;
import ye.f;
import ze.c;
import ze.d;
import ze.e;

/* JADX INFO: loaded from: classes2.dex */
public final class ActionSurrogate$$serializer implements c0<ActionSurrogate> {
    public static final ActionSurrogate$$serializer INSTANCE;
    private static final /* synthetic */ a1 descriptor;

    static {
        ActionSurrogate$$serializer actionSurrogate$$serializer = new ActionSurrogate$$serializer();
        INSTANCE = actionSurrogate$$serializer;
        a1 a1Var = new a1("com.revenuecat.purchases.paywalls.components.ActionSurrogate", actionSurrogate$$serializer, 3);
        a1Var.l("type", false);
        a1Var.l("destination", true);
        a1Var.l("url", true);
        descriptor = a1Var;
    }

    private ActionSurrogate$$serializer() {
    }

    @Override // af.c0
    public b<?>[] childSerializers() {
        b<?>[] bVarArr = ActionSurrogate.$childSerializers;
        return new b[]{bVarArr[0], a.p(bVarArr[1]), a.p(UrlSurrogate$$serializer.INSTANCE)};
    }

    @Override // we.a
    public ActionSurrogate deserialize(e eVar) {
        Object objL;
        Object objK;
        Object objL2;
        int i10;
        r.f(eVar, "decoder");
        f descriptor2 = getDescriptor();
        c cVarC = eVar.c(descriptor2);
        b[] bVarArr = ActionSurrogate.$childSerializers;
        Object objK2 = null;
        if (cVarC.x()) {
            objK = cVarC.k(descriptor2, 0, bVarArr[0], null);
            objL = cVarC.l(descriptor2, 1, bVarArr[1], null);
            objL2 = cVarC.l(descriptor2, 2, UrlSurrogate$$serializer.INSTANCE, null);
            i10 = 7;
        } else {
            Object objL3 = null;
            Object objL4 = null;
            int i11 = 0;
            boolean z10 = true;
            while (z10) {
                int iZ = cVarC.z(descriptor2);
                if (iZ == -1) {
                    z10 = false;
                } else if (iZ == 0) {
                    objK2 = cVarC.k(descriptor2, 0, bVarArr[0], objK2);
                    i11 |= 1;
                } else if (iZ == 1) {
                    objL3 = cVarC.l(descriptor2, 1, bVarArr[1], objL3);
                    i11 |= 2;
                } else {
                    if (iZ != 2) {
                        throw new j(iZ);
                    }
                    objL4 = cVarC.l(descriptor2, 2, UrlSurrogate$$serializer.INSTANCE, objL4);
                    i11 |= 4;
                }
            }
            objL = objL3;
            objK = objK2;
            objL2 = objL4;
            i10 = i11;
        }
        cVarC.d(descriptor2);
        return new ActionSurrogate(i10, (ActionTypeSurrogate) objK, (DestinationSurrogate) objL, (UrlSurrogate) objL2, (j1) null);
    }

    @Override // we.b, we.h, we.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // we.h
    public void serialize(ze.f fVar, ActionSurrogate actionSurrogate) {
        r.f(fVar, "encoder");
        r.f(actionSurrogate, "value");
        f descriptor2 = getDescriptor();
        d dVarC = fVar.c(descriptor2);
        ActionSurrogate.write$Self(actionSurrogate, dVarC, descriptor2);
        dVarC.d(descriptor2);
    }

    @Override // af.c0
    public b<?>[] typeParametersSerializers() {
        return c0.a.a(this);
    }
}
