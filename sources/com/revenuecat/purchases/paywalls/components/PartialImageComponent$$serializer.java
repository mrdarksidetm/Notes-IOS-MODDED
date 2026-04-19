package com.revenuecat.purchases.paywalls.components;

import ae.r;
import af.a1;
import af.c0;
import af.h;
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
public final class PartialImageComponent$$serializer implements c0<PartialImageComponent> {
    public static final PartialImageComponent$$serializer INSTANCE;
    private static final /* synthetic */ a1 descriptor;

    static {
        PartialImageComponent$$serializer partialImageComponent$$serializer = new PartialImageComponent$$serializer();
        INSTANCE = partialImageComponent$$serializer;
        a1 a1Var = new a1("com.revenuecat.purchases.paywalls.components.PartialImageComponent", partialImageComponent$$serializer, 7);
        a1Var.l("visible", true);
        a1Var.l("source", true);
        a1Var.l("size", true);
        a1Var.l("override_source_lid", true);
        a1Var.l("fit_mode", true);
        a1Var.l("mask_shape", true);
        a1Var.l("color_overlay", true);
        descriptor = a1Var;
    }

    private PartialImageComponent$$serializer() {
    }

    @Override // af.c0
    public b<?>[] childSerializers() {
        b[] bVarArr = PartialImageComponent.$childSerializers;
        return new b[]{a.p(h.f763a), a.p(ThemeImageUrls$$serializer.INSTANCE), a.p(Size$$serializer.INSTANCE), a.p(LocalizationKey$$serializer.INSTANCE), a.p(bVarArr[4]), a.p(bVarArr[5]), a.p(ColorScheme$$serializer.INSTANCE)};
    }

    @Override // we.a
    public PartialImageComponent deserialize(e eVar) {
        Object objL;
        Object objL2;
        Object objL3;
        Object objL4;
        Object objL5;
        Object objL6;
        int i10;
        r.f(eVar, "decoder");
        f descriptor2 = getDescriptor();
        c cVarC = eVar.c(descriptor2);
        b[] bVarArr = PartialImageComponent.$childSerializers;
        int i11 = 6;
        Object objL7 = null;
        if (cVarC.x()) {
            objL3 = cVarC.l(descriptor2, 0, h.f763a, null);
            Object objL8 = cVarC.l(descriptor2, 1, ThemeImageUrls$$serializer.INSTANCE, null);
            objL6 = cVarC.l(descriptor2, 2, Size$$serializer.INSTANCE, null);
            objL5 = cVarC.l(descriptor2, 3, LocalizationKey$$serializer.INSTANCE, null);
            objL2 = cVarC.l(descriptor2, 4, bVarArr[4], null);
            objL = cVarC.l(descriptor2, 5, bVarArr[5], null);
            objL4 = cVarC.l(descriptor2, 6, ColorScheme$$serializer.INSTANCE, null);
            objL7 = objL8;
            i10 = 127;
        } else {
            int i12 = 0;
            boolean z10 = true;
            Object objL9 = null;
            Object objL10 = null;
            Object objL11 = null;
            Object objL12 = null;
            Object objL13 = null;
            Object objL14 = null;
            while (z10) {
                int iZ = cVarC.z(descriptor2);
                switch (iZ) {
                    case -1:
                        z10 = false;
                        i11 = 6;
                        break;
                    case 0:
                        objL11 = cVarC.l(descriptor2, 0, h.f763a, objL11);
                        i12 |= 1;
                        i11 = 6;
                        break;
                    case 1:
                        objL7 = cVarC.l(descriptor2, 1, ThemeImageUrls$$serializer.INSTANCE, objL7);
                        i12 |= 2;
                        i11 = 6;
                        break;
                    case 2:
                        objL14 = cVarC.l(descriptor2, 2, Size$$serializer.INSTANCE, objL14);
                        i12 |= 4;
                        break;
                    case 3:
                        objL13 = cVarC.l(descriptor2, 3, LocalizationKey$$serializer.INSTANCE, objL13);
                        i12 |= 8;
                        break;
                    case 4:
                        objL10 = cVarC.l(descriptor2, 4, bVarArr[4], objL10);
                        i12 |= 16;
                        break;
                    case 5:
                        objL9 = cVarC.l(descriptor2, 5, bVarArr[5], objL9);
                        i12 |= 32;
                        break;
                    case 6:
                        objL12 = cVarC.l(descriptor2, i11, ColorScheme$$serializer.INSTANCE, objL12);
                        i12 |= 64;
                        break;
                    default:
                        throw new j(iZ);
                }
            }
            objL = objL9;
            objL2 = objL10;
            objL3 = objL11;
            objL4 = objL12;
            objL5 = objL13;
            objL6 = objL14;
            i10 = i12;
        }
        cVarC.d(descriptor2);
        LocalizationKey localizationKey = (LocalizationKey) objL5;
        return new PartialImageComponent(i10, (Boolean) objL3, (ThemeImageUrls) objL7, (Size) objL6, localizationKey != null ? localizationKey.m67unboximpl() : null, (FitMode) objL2, (MaskShape) objL, (ColorScheme) objL4, null, null);
    }

    @Override // we.b, we.h, we.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // we.h
    public void serialize(ze.f fVar, PartialImageComponent partialImageComponent) {
        r.f(fVar, "encoder");
        r.f(partialImageComponent, "value");
        f descriptor2 = getDescriptor();
        d dVarC = fVar.c(descriptor2);
        PartialImageComponent.write$Self(partialImageComponent, dVarC, descriptor2);
        dVarC.d(descriptor2);
    }

    @Override // af.c0
    public b<?>[] typeParametersSerializers() {
        return c0.a.a(this);
    }
}
