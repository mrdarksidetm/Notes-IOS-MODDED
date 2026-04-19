package com.revenuecat.purchases.paywalls;

import ae.r;
import af.a1;
import af.c0;
import af.j1;
import com.revenuecat.purchases.paywalls.PaywallData;
import we.b;
import we.j;
import xe.a;
import ye.f;
import ze.c;
import ze.d;
import ze.e;

/* JADX INFO: loaded from: classes2.dex */
public final class PaywallData$Configuration$Images$$serializer implements c0<PaywallData.Configuration.Images> {
    public static final PaywallData$Configuration$Images$$serializer INSTANCE;
    private static final /* synthetic */ a1 descriptor;

    static {
        PaywallData$Configuration$Images$$serializer paywallData$Configuration$Images$$serializer = new PaywallData$Configuration$Images$$serializer();
        INSTANCE = paywallData$Configuration$Images$$serializer;
        a1 a1Var = new a1("com.revenuecat.purchases.paywalls.PaywallData.Configuration.Images", paywallData$Configuration$Images$$serializer, 3);
        a1Var.l("header", true);
        a1Var.l("background", true);
        a1Var.l("icon", true);
        descriptor = a1Var;
    }

    private PaywallData$Configuration$Images$$serializer() {
    }

    @Override // af.c0
    public b<?>[] childSerializers() {
        EmptyStringToNullSerializer emptyStringToNullSerializer = EmptyStringToNullSerializer.INSTANCE;
        return new b[]{a.p(emptyStringToNullSerializer), a.p(emptyStringToNullSerializer), a.p(emptyStringToNullSerializer)};
    }

    @Override // we.a
    public PaywallData.Configuration.Images deserialize(e eVar) {
        Object objL;
        int i10;
        Object objL2;
        Object objL3;
        r.f(eVar, "decoder");
        f descriptor2 = getDescriptor();
        c cVarC = eVar.c(descriptor2);
        if (cVarC.x()) {
            EmptyStringToNullSerializer emptyStringToNullSerializer = EmptyStringToNullSerializer.INSTANCE;
            objL = cVarC.l(descriptor2, 0, emptyStringToNullSerializer, null);
            objL2 = cVarC.l(descriptor2, 1, emptyStringToNullSerializer, null);
            objL3 = cVarC.l(descriptor2, 2, emptyStringToNullSerializer, null);
            i10 = 7;
        } else {
            Object objL4 = null;
            Object objL5 = null;
            Object objL6 = null;
            int i11 = 0;
            boolean z10 = true;
            while (z10) {
                int iZ = cVarC.z(descriptor2);
                if (iZ == -1) {
                    z10 = false;
                } else if (iZ == 0) {
                    objL4 = cVarC.l(descriptor2, 0, EmptyStringToNullSerializer.INSTANCE, objL4);
                    i11 |= 1;
                } else if (iZ == 1) {
                    objL5 = cVarC.l(descriptor2, 1, EmptyStringToNullSerializer.INSTANCE, objL5);
                    i11 |= 2;
                } else {
                    if (iZ != 2) {
                        throw new j(iZ);
                    }
                    objL6 = cVarC.l(descriptor2, 2, EmptyStringToNullSerializer.INSTANCE, objL6);
                    i11 |= 4;
                }
            }
            objL = objL4;
            i10 = i11;
            objL2 = objL5;
            objL3 = objL6;
        }
        cVarC.d(descriptor2);
        return new PaywallData.Configuration.Images(i10, (String) objL, (String) objL2, (String) objL3, (j1) null);
    }

    @Override // we.b, we.h, we.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // we.h
    public void serialize(ze.f fVar, PaywallData.Configuration.Images images) {
        r.f(fVar, "encoder");
        r.f(images, "value");
        f descriptor2 = getDescriptor();
        d dVarC = fVar.c(descriptor2);
        PaywallData.Configuration.Images.write$Self(images, dVarC, descriptor2);
        dVarC.d(descriptor2);
    }

    @Override // af.c0
    public b<?>[] typeParametersSerializers() {
        return c0.a.a(this);
    }
}
