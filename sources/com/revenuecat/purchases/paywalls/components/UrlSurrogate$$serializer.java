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
public final class UrlSurrogate$$serializer implements c0<UrlSurrogate> {
    public static final UrlSurrogate$$serializer INSTANCE;
    private static final /* synthetic */ a1 descriptor;

    static {
        UrlSurrogate$$serializer urlSurrogate$$serializer = new UrlSurrogate$$serializer();
        INSTANCE = urlSurrogate$$serializer;
        a1 a1Var = new a1("com.revenuecat.purchases.paywalls.components.UrlSurrogate", urlSurrogate$$serializer, 2);
        a1Var.l("url_lid", false);
        a1Var.l("method", false);
        descriptor = a1Var;
    }

    private UrlSurrogate$$serializer() {
    }

    @Override // af.c0
    public b<?>[] childSerializers() {
        return new b[]{n1.f790a, UrlSurrogate.$childSerializers[1]};
    }

    @Override // we.a
    public UrlSurrogate deserialize(e eVar) {
        Object objK;
        String strM;
        int i10;
        r.f(eVar, "decoder");
        f descriptor2 = getDescriptor();
        c cVarC = eVar.c(descriptor2);
        b[] bVarArr = UrlSurrogate.$childSerializers;
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
        return new UrlSurrogate(i10, strM, (ButtonComponent.UrlMethod) objK, null);
    }

    @Override // we.b, we.h, we.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // we.h
    public void serialize(ze.f fVar, UrlSurrogate urlSurrogate) {
        r.f(fVar, "encoder");
        r.f(urlSurrogate, "value");
        f descriptor2 = getDescriptor();
        d dVarC = fVar.c(descriptor2);
        UrlSurrogate.write$Self(urlSurrogate, dVarC, descriptor2);
        dVarC.d(descriptor2);
    }

    @Override // af.c0
    public b<?>[] typeParametersSerializers() {
        return c0.a.a(this);
    }
}
