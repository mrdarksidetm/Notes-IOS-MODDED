package com.revenuecat.purchases.paywalls.components.properties;

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
public final class ThemeImageUrls$$serializer implements c0<ThemeImageUrls> {
    public static final ThemeImageUrls$$serializer INSTANCE;
    private static final /* synthetic */ a1 descriptor;

    static {
        ThemeImageUrls$$serializer themeImageUrls$$serializer = new ThemeImageUrls$$serializer();
        INSTANCE = themeImageUrls$$serializer;
        a1 a1Var = new a1("com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls", themeImageUrls$$serializer, 2);
        a1Var.l("light", false);
        a1Var.l("dark", true);
        descriptor = a1Var;
    }

    private ThemeImageUrls$$serializer() {
    }

    @Override // af.c0
    public b<?>[] childSerializers() {
        ImageUrls$$serializer imageUrls$$serializer = ImageUrls$$serializer.INSTANCE;
        return new b[]{imageUrls$$serializer, a.p(imageUrls$$serializer)};
    }

    @Override // we.a
    public ThemeImageUrls deserialize(e eVar) {
        Object objL;
        Object objK;
        int i10;
        r.f(eVar, "decoder");
        f descriptor2 = getDescriptor();
        c cVarC = eVar.c(descriptor2);
        if (cVarC.x()) {
            ImageUrls$$serializer imageUrls$$serializer = ImageUrls$$serializer.INSTANCE;
            objK = cVarC.k(descriptor2, 0, imageUrls$$serializer, null);
            objL = cVarC.l(descriptor2, 1, imageUrls$$serializer, null);
            i10 = 3;
        } else {
            objL = null;
            Object objK2 = null;
            int i11 = 0;
            boolean z10 = true;
            while (z10) {
                int iZ = cVarC.z(descriptor2);
                if (iZ == -1) {
                    z10 = false;
                } else if (iZ == 0) {
                    objK2 = cVarC.k(descriptor2, 0, ImageUrls$$serializer.INSTANCE, objK2);
                    i11 |= 1;
                } else {
                    if (iZ != 1) {
                        throw new j(iZ);
                    }
                    objL = cVarC.l(descriptor2, 1, ImageUrls$$serializer.INSTANCE, objL);
                    i11 |= 2;
                }
            }
            objK = objK2;
            i10 = i11;
        }
        cVarC.d(descriptor2);
        return new ThemeImageUrls(i10, (ImageUrls) objK, (ImageUrls) objL, (j1) null);
    }

    @Override // we.b, we.h, we.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // we.h
    public void serialize(ze.f fVar, ThemeImageUrls themeImageUrls) {
        r.f(fVar, "encoder");
        r.f(themeImageUrls, "value");
        f descriptor2 = getDescriptor();
        d dVarC = fVar.c(descriptor2);
        ThemeImageUrls.write$Self(themeImageUrls, dVarC, descriptor2);
        dVarC.d(descriptor2);
    }

    @Override // af.c0
    public b<?>[] typeParametersSerializers() {
        return c0.a.a(this);
    }
}
