package com.revenuecat.purchases.paywalls.components;

import ae.r;
import af.a1;
import af.c0;
import com.revenuecat.purchases.paywalls.components.common.ComponentOverrides;
import com.revenuecat.purchases.paywalls.components.common.LocalizationKey;
import com.revenuecat.purchases.paywalls.components.common.LocalizationKey$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.FitMode;
import com.revenuecat.purchases.paywalls.components.properties.MaskShape;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.Size$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls;
import com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls$$serializer;
import we.b;
import we.j;
import xe.a;
import ye.f;
import ze.c;
import ze.d;
import ze.e;

/* JADX INFO: loaded from: classes2.dex */
public final class ImageComponent$$serializer implements c0<ImageComponent> {
    public static final ImageComponent$$serializer INSTANCE;
    private static final /* synthetic */ a1 descriptor;

    static {
        ImageComponent$$serializer imageComponent$$serializer = new ImageComponent$$serializer();
        INSTANCE = imageComponent$$serializer;
        a1 a1Var = new a1("image", imageComponent$$serializer, 7);
        a1Var.l("source", false);
        a1Var.l("size", true);
        a1Var.l("override_source_lid", true);
        a1Var.l("mask_shape", true);
        a1Var.l("color_overlay", true);
        a1Var.l("fit_mode", true);
        a1Var.l("overrides", true);
        descriptor = a1Var;
    }

    private ImageComponent$$serializer() {
    }

    @Override // af.c0
    public b<?>[] childSerializers() {
        b<?>[] bVarArr = ImageComponent.$childSerializers;
        return new b[]{ThemeImageUrls$$serializer.INSTANCE, Size$$serializer.INSTANCE, a.p(LocalizationKey$$serializer.INSTANCE), a.p(bVarArr[3]), a.p(ColorScheme$$serializer.INSTANCE), bVarArr[5], a.p(bVarArr[6])};
    }

    @Override // we.a
    public ImageComponent deserialize(e eVar) {
        Object objL;
        Object objL2;
        Object objK;
        Object objL3;
        int i10;
        Object objK2;
        Object objL4;
        r.f(eVar, "decoder");
        f descriptor2 = getDescriptor();
        c cVarC = eVar.c(descriptor2);
        b[] bVarArr = ImageComponent.$childSerializers;
        int i11 = 4;
        int i12 = 2;
        Object objK3 = null;
        if (cVarC.x()) {
            objK = cVarC.k(descriptor2, 0, ThemeImageUrls$$serializer.INSTANCE, null);
            objK2 = cVarC.k(descriptor2, 1, Size$$serializer.INSTANCE, null);
            objL3 = cVarC.l(descriptor2, 2, LocalizationKey$$serializer.INSTANCE, null);
            objL2 = cVarC.l(descriptor2, 3, bVarArr[3], null);
            objL4 = cVarC.l(descriptor2, 4, ColorScheme$$serializer.INSTANCE, null);
            Object objK4 = cVarC.k(descriptor2, 5, bVarArr[5], null);
            objL = cVarC.l(descriptor2, 6, bVarArr[6], null);
            objK3 = objK4;
            i10 = 127;
        } else {
            int i13 = 0;
            boolean z10 = true;
            Object objL5 = null;
            Object objL6 = null;
            Object objK5 = null;
            Object objL7 = null;
            Object objL8 = null;
            Object objK6 = null;
            while (z10) {
                int iZ = cVarC.z(descriptor2);
                switch (iZ) {
                    case -1:
                        z10 = false;
                        i11 = 4;
                        i12 = 2;
                        break;
                    case 0:
                        objK5 = cVarC.k(descriptor2, 0, ThemeImageUrls$$serializer.INSTANCE, objK5);
                        i13 |= 1;
                        i11 = 4;
                        i12 = 2;
                        break;
                    case 1:
                        i13 |= 2;
                        objK6 = cVarC.k(descriptor2, 1, Size$$serializer.INSTANCE, objK6);
                        i11 = 4;
                        i12 = 2;
                        break;
                    case 2:
                        objL8 = cVarC.l(descriptor2, i12, LocalizationKey$$serializer.INSTANCE, objL8);
                        i13 |= 4;
                        break;
                    case 3:
                        objL6 = cVarC.l(descriptor2, 3, bVarArr[3], objL6);
                        i13 |= 8;
                        break;
                    case 4:
                        objL7 = cVarC.l(descriptor2, i11, ColorScheme$$serializer.INSTANCE, objL7);
                        i13 |= 16;
                        break;
                    case 5:
                        objK3 = cVarC.k(descriptor2, 5, bVarArr[5], objK3);
                        i13 |= 32;
                        break;
                    case 6:
                        objL5 = cVarC.l(descriptor2, 6, bVarArr[6], objL5);
                        i13 |= 64;
                        break;
                    default:
                        throw new j(iZ);
                }
            }
            objL = objL5;
            objL2 = objL6;
            objK = objK5;
            objL3 = objL8;
            i10 = i13;
            objK2 = objK6;
            objL4 = objL7;
        }
        cVarC.d(descriptor2);
        LocalizationKey localizationKey = (LocalizationKey) objL3;
        return new ImageComponent(i10, (ThemeImageUrls) objK, (Size) objK2, localizationKey != null ? localizationKey.m67unboximpl() : null, (MaskShape) objL2, (ColorScheme) objL4, (FitMode) objK3, (ComponentOverrides) objL, null, null);
    }

    @Override // we.b, we.h, we.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // we.h
    public void serialize(ze.f fVar, ImageComponent imageComponent) {
        r.f(fVar, "encoder");
        r.f(imageComponent, "value");
        f descriptor2 = getDescriptor();
        d dVarC = fVar.c(descriptor2);
        ImageComponent.write$Self(imageComponent, dVarC, descriptor2);
        dVarC.d(descriptor2);
    }

    @Override // af.c0
    public b<?>[] typeParametersSerializers() {
        return c0.a.a(this);
    }
}
