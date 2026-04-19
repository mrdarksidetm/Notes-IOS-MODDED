package com.revenuecat.purchases.paywalls.components;

import ae.r;
import af.a1;
import af.c0;
import af.h;
import af.n1;
import com.revenuecat.purchases.paywalls.components.common.LocalizationKey;
import com.revenuecat.purchases.paywalls.components.common.LocalizationKey$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.FontSize;
import com.revenuecat.purchases.paywalls.components.properties.FontWeight;
import com.revenuecat.purchases.paywalls.components.properties.HorizontalAlignment;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Size;
import com.revenuecat.purchases.paywalls.components.properties.Size$$serializer;
import we.b;
import we.j;
import xe.a;
import ye.f;
import ze.c;
import ze.d;
import ze.e;

/* JADX INFO: loaded from: classes2.dex */
public final class PartialTextComponent$$serializer implements c0<PartialTextComponent> {
    public static final PartialTextComponent$$serializer INSTANCE;
    private static final /* synthetic */ a1 descriptor;

    static {
        PartialTextComponent$$serializer partialTextComponent$$serializer = new PartialTextComponent$$serializer();
        INSTANCE = partialTextComponent$$serializer;
        a1 a1Var = new a1("com.revenuecat.purchases.paywalls.components.PartialTextComponent", partialTextComponent$$serializer, 11);
        a1Var.l("visible", true);
        a1Var.l("text_lid", true);
        a1Var.l("color", true);
        a1Var.l("background_color", true);
        a1Var.l("font_name", true);
        a1Var.l("font_weight", true);
        a1Var.l("font_size", true);
        a1Var.l("horizontal_alignment", true);
        a1Var.l("size", true);
        a1Var.l("padding", true);
        a1Var.l("margin", true);
        descriptor = a1Var;
    }

    private PartialTextComponent$$serializer() {
    }

    @Override // af.c0
    public b<?>[] childSerializers() {
        b[] bVarArr = PartialTextComponent.$childSerializers;
        ColorScheme$$serializer colorScheme$$serializer = ColorScheme$$serializer.INSTANCE;
        Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
        return new b[]{a.p(h.f763a), a.p(LocalizationKey$$serializer.INSTANCE), a.p(colorScheme$$serializer), a.p(colorScheme$$serializer), a.p(n1.f790a), a.p(bVarArr[5]), a.p(bVarArr[6]), a.p(bVarArr[7]), a.p(Size$$serializer.INSTANCE), a.p(padding$$serializer), a.p(padding$$serializer)};
    }

    @Override // we.a
    public PartialTextComponent deserialize(e eVar) {
        Object objL;
        int i10;
        Object objL2;
        Object objL3;
        Object objL4;
        Object objL5;
        Object objL6;
        Object objL7;
        Object objL8;
        Object objL9;
        Object objL10;
        Object obj;
        b[] bVarArr;
        Object obj2;
        r.f(eVar, "decoder");
        f descriptor2 = getDescriptor();
        c cVarC = eVar.c(descriptor2);
        b[] bVarArr2 = PartialTextComponent.$childSerializers;
        int i11 = 10;
        int i12 = 9;
        int i13 = 8;
        int i14 = 7;
        Object objL11 = null;
        if (cVarC.x()) {
            objL3 = cVarC.l(descriptor2, 0, h.f763a, null);
            objL6 = cVarC.l(descriptor2, 1, LocalizationKey$$serializer.INSTANCE, null);
            ColorScheme$$serializer colorScheme$$serializer = ColorScheme$$serializer.INSTANCE;
            objL10 = cVarC.l(descriptor2, 2, colorScheme$$serializer, null);
            objL9 = cVarC.l(descriptor2, 3, colorScheme$$serializer, null);
            objL4 = cVarC.l(descriptor2, 4, n1.f790a, null);
            Object objL12 = cVarC.l(descriptor2, 5, bVarArr2[5], null);
            Object objL13 = cVarC.l(descriptor2, 6, bVarArr2[6], null);
            objL7 = cVarC.l(descriptor2, 7, bVarArr2[7], null);
            objL8 = cVarC.l(descriptor2, 8, Size$$serializer.INSTANCE, null);
            Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
            objL2 = cVarC.l(descriptor2, 9, padding$$serializer, null);
            objL5 = cVarC.l(descriptor2, 10, padding$$serializer, null);
            i10 = 2047;
            obj = objL12;
            objL = objL13;
        } else {
            int i15 = 0;
            boolean z10 = true;
            Object objL14 = null;
            Object objL15 = null;
            Object objL16 = null;
            objL = null;
            Object objL17 = null;
            Object objL18 = null;
            Object objL19 = null;
            Object objL20 = null;
            Object objL21 = null;
            Object objL22 = null;
            while (z10) {
                int iZ = cVarC.z(descriptor2);
                switch (iZ) {
                    case -1:
                        z10 = false;
                        objL14 = objL14;
                        bVarArr2 = bVarArr2;
                        i11 = 10;
                        i13 = 8;
                        i14 = 7;
                        break;
                    case 0:
                        bVarArr = bVarArr2;
                        obj2 = objL14;
                        objL11 = cVarC.l(descriptor2, 0, h.f763a, objL11);
                        i15 |= 1;
                        objL14 = obj2;
                        bVarArr2 = bVarArr;
                        i11 = 10;
                        i12 = 9;
                        i13 = 8;
                        i14 = 7;
                        break;
                    case 1:
                        bVarArr = bVarArr2;
                        obj2 = objL14;
                        objL22 = cVarC.l(descriptor2, 1, LocalizationKey$$serializer.INSTANCE, objL22);
                        i15 |= 2;
                        objL14 = obj2;
                        bVarArr2 = bVarArr;
                        i11 = 10;
                        i12 = 9;
                        i13 = 8;
                        i14 = 7;
                        break;
                    case 2:
                        bVarArr = bVarArr2;
                        objL20 = cVarC.l(descriptor2, 2, ColorScheme$$serializer.INSTANCE, objL20);
                        i15 |= 4;
                        bVarArr2 = bVarArr;
                        i11 = 10;
                        i12 = 9;
                        i13 = 8;
                        i14 = 7;
                        break;
                    case 3:
                        objL16 = cVarC.l(descriptor2, 3, ColorScheme$$serializer.INSTANCE, objL16);
                        i15 |= 8;
                        i11 = 10;
                        i12 = 9;
                        i13 = 8;
                        i14 = 7;
                        break;
                    case 4:
                        i15 |= 16;
                        objL19 = cVarC.l(descriptor2, 4, n1.f790a, objL19);
                        i11 = 10;
                        i12 = 9;
                        i13 = 8;
                        i14 = 7;
                        break;
                    case 5:
                        objL21 = cVarC.l(descriptor2, 5, bVarArr2[5], objL21);
                        i15 |= 32;
                        i11 = 10;
                        i12 = 9;
                        i13 = 8;
                        break;
                    case 6:
                        objL = cVarC.l(descriptor2, 6, bVarArr2[6], objL);
                        i15 |= 64;
                        i11 = 10;
                        break;
                    case 7:
                        objL14 = cVarC.l(descriptor2, i14, bVarArr2[i14], objL14);
                        i15 |= 128;
                        break;
                    case 8:
                        objL15 = cVarC.l(descriptor2, i13, Size$$serializer.INSTANCE, objL15);
                        i15 |= 256;
                        break;
                    case 9:
                        objL18 = cVarC.l(descriptor2, i12, Padding$$serializer.INSTANCE, objL18);
                        i15 |= 512;
                        break;
                    case 10:
                        objL17 = cVarC.l(descriptor2, i11, Padding$$serializer.INSTANCE, objL17);
                        i15 |= 1024;
                        break;
                    default:
                        throw new j(iZ);
                }
            }
            Object obj3 = objL14;
            i10 = i15;
            objL2 = objL18;
            objL3 = objL11;
            objL4 = objL19;
            objL5 = objL17;
            objL6 = objL22;
            objL7 = obj3;
            objL8 = objL15;
            objL9 = objL16;
            objL10 = objL20;
            obj = objL21;
        }
        cVarC.d(descriptor2);
        LocalizationKey localizationKey = (LocalizationKey) objL6;
        return new PartialTextComponent(i10, (Boolean) objL3, localizationKey != null ? localizationKey.m67unboximpl() : null, (ColorScheme) objL10, (ColorScheme) objL9, (String) objL4, (FontWeight) obj, (FontSize) objL, (HorizontalAlignment) objL7, (Size) objL8, (Padding) objL2, (Padding) objL5, null, null);
    }

    @Override // we.b, we.h, we.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // we.h
    public void serialize(ze.f fVar, PartialTextComponent partialTextComponent) {
        r.f(fVar, "encoder");
        r.f(partialTextComponent, "value");
        f descriptor2 = getDescriptor();
        d dVarC = fVar.c(descriptor2);
        PartialTextComponent.write$Self(partialTextComponent, dVarC, descriptor2);
        dVarC.d(descriptor2);
    }

    @Override // af.c0
    public b<?>[] typeParametersSerializers() {
        return c0.a.a(this);
    }
}
