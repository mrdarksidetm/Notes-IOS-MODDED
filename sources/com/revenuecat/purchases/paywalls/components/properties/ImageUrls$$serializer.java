package com.revenuecat.purchases.paywalls.components.properties;

import ae.r;
import af.a1;
import af.c0;
import af.v1;
import com.revenuecat.purchases.utils.serializers.URLSerializer;
import java.net.URL;
import md.a0;
import we.b;
import we.j;
import ye.f;
import ze.c;
import ze.d;
import ze.e;

/* JADX INFO: loaded from: classes2.dex */
public final class ImageUrls$$serializer implements c0<ImageUrls> {
    public static final ImageUrls$$serializer INSTANCE;
    private static final /* synthetic */ a1 descriptor;

    static {
        ImageUrls$$serializer imageUrls$$serializer = new ImageUrls$$serializer();
        INSTANCE = imageUrls$$serializer;
        a1 a1Var = new a1("com.revenuecat.purchases.paywalls.components.properties.ImageUrls", imageUrls$$serializer, 5);
        a1Var.l("original", false);
        a1Var.l("webp", false);
        a1Var.l("webp_low_res", false);
        a1Var.l("width", false);
        a1Var.l("height", false);
        descriptor = a1Var;
    }

    private ImageUrls$$serializer() {
    }

    @Override // af.c0
    public b<?>[] childSerializers() {
        URLSerializer uRLSerializer = URLSerializer.INSTANCE;
        v1 v1Var = v1.f840a;
        return new b[]{uRLSerializer, uRLSerializer, uRLSerializer, v1Var, v1Var};
    }

    @Override // we.a
    public ImageUrls deserialize(e eVar) {
        int i10;
        Object objK;
        Object objK2;
        Object objK3;
        Object objK4;
        r.f(eVar, "decoder");
        f descriptor2 = getDescriptor();
        c cVarC = eVar.c(descriptor2);
        Object objK5 = null;
        if (cVarC.x()) {
            URLSerializer uRLSerializer = URLSerializer.INSTANCE;
            Object objK6 = cVarC.k(descriptor2, 0, uRLSerializer, null);
            objK = cVarC.k(descriptor2, 1, uRLSerializer, null);
            objK2 = cVarC.k(descriptor2, 2, uRLSerializer, null);
            v1 v1Var = v1.f840a;
            objK3 = cVarC.k(descriptor2, 3, v1Var, null);
            objK4 = cVarC.k(descriptor2, 4, v1Var, null);
            objK5 = objK6;
            i10 = 31;
        } else {
            int i11 = 0;
            Object objK7 = null;
            Object objK8 = null;
            Object objK9 = null;
            Object objK10 = null;
            boolean z10 = true;
            while (z10) {
                int iZ = cVarC.z(descriptor2);
                if (iZ == -1) {
                    z10 = false;
                } else if (iZ == 0) {
                    objK5 = cVarC.k(descriptor2, 0, URLSerializer.INSTANCE, objK5);
                    i11 |= 1;
                } else if (iZ == 1) {
                    objK7 = cVarC.k(descriptor2, 1, URLSerializer.INSTANCE, objK7);
                    i11 |= 2;
                } else if (iZ == 2) {
                    objK8 = cVarC.k(descriptor2, 2, URLSerializer.INSTANCE, objK8);
                    i11 |= 4;
                } else if (iZ == 3) {
                    objK9 = cVarC.k(descriptor2, 3, v1.f840a, objK9);
                    i11 |= 8;
                } else {
                    if (iZ != 4) {
                        throw new j(iZ);
                    }
                    objK10 = cVarC.k(descriptor2, 4, v1.f840a, objK10);
                    i11 |= 16;
                }
            }
            i10 = i11;
            objK = objK7;
            objK2 = objK8;
            objK3 = objK9;
            objK4 = objK10;
        }
        cVarC.d(descriptor2);
        return new ImageUrls(i10, (URL) objK5, (URL) objK, (URL) objK2, (a0) objK3, (a0) objK4, null, null);
    }

    @Override // we.b, we.h, we.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // we.h
    public void serialize(ze.f fVar, ImageUrls imageUrls) {
        r.f(fVar, "encoder");
        r.f(imageUrls, "value");
        f descriptor2 = getDescriptor();
        d dVarC = fVar.c(descriptor2);
        ImageUrls.write$Self(imageUrls, dVarC, descriptor2);
        dVarC.d(descriptor2);
    }

    @Override // af.c0
    public b<?>[] typeParametersSerializers() {
        return c0.a.a(this);
    }
}
