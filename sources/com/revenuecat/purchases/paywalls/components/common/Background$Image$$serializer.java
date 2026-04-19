package com.revenuecat.purchases.paywalls.components.common;

import ae.r;
import af.a1;
import af.c0;
import af.j1;
import com.revenuecat.purchases.paywalls.components.common.Background;
import com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls;
import com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls$$serializer;
import we.b;
import we.j;
import ye.f;
import ze.c;
import ze.d;
import ze.e;

/* JADX INFO: loaded from: classes2.dex */
public final class Background$Image$$serializer implements c0<Background.Image> {
    public static final Background$Image$$serializer INSTANCE;
    private static final /* synthetic */ a1 descriptor;

    static {
        Background$Image$$serializer background$Image$$serializer = new Background$Image$$serializer();
        INSTANCE = background$Image$$serializer;
        a1 a1Var = new a1("image", background$Image$$serializer, 1);
        a1Var.l("value", false);
        descriptor = a1Var;
    }

    private Background$Image$$serializer() {
    }

    @Override // af.c0
    public b<?>[] childSerializers() {
        return new b[]{ThemeImageUrls$$serializer.INSTANCE};
    }

    @Override // we.a
    public Background.Image deserialize(e eVar) {
        Object objK;
        r.f(eVar, "decoder");
        f descriptor2 = getDescriptor();
        c cVarC = eVar.c(descriptor2);
        j1 j1Var = null;
        int i10 = 1;
        if (cVarC.x()) {
            objK = cVarC.k(descriptor2, 0, ThemeImageUrls$$serializer.INSTANCE, null);
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
                    objK = cVarC.k(descriptor2, 0, ThemeImageUrls$$serializer.INSTANCE, objK);
                    i11 |= 1;
                }
            }
            i10 = i11;
        }
        cVarC.d(descriptor2);
        return new Background.Image(i10, (ThemeImageUrls) objK, j1Var);
    }

    @Override // we.b, we.h, we.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // we.h
    public void serialize(ze.f fVar, Background.Image image) {
        r.f(fVar, "encoder");
        r.f(image, "value");
        f descriptor2 = getDescriptor();
        d dVarC = fVar.c(descriptor2);
        dVarC.E(descriptor2, 0, ThemeImageUrls$$serializer.INSTANCE, image.value);
        dVarC.d(descriptor2);
    }

    @Override // af.c0
    public b<?>[] typeParametersSerializers() {
        return c0.a.a(this);
    }
}
