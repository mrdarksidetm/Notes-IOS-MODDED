package com.revenuecat.purchases.paywalls.components;

import ae.r;
import af.a1;
import af.c0;
import af.n1;
import com.revenuecat.purchases.paywalls.components.common.ComponentOverrides;
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
public final class TextComponent$$serializer implements c0<TextComponent> {
    public static final TextComponent$$serializer INSTANCE;
    private static final /* synthetic */ a1 descriptor;

    static {
        TextComponent$$serializer textComponent$$serializer = new TextComponent$$serializer();
        INSTANCE = textComponent$$serializer;
        a1 a1Var = new a1("text", textComponent$$serializer, 11);
        a1Var.l("text_lid", false);
        a1Var.l("color", false);
        a1Var.l("background_color", true);
        a1Var.l("font_name", true);
        a1Var.l("font_weight", true);
        a1Var.l("font_size", true);
        a1Var.l("horizontal_alignment", true);
        a1Var.l("size", true);
        a1Var.l("padding", true);
        a1Var.l("margin", true);
        a1Var.l("overrides", true);
        descriptor = a1Var;
    }

    private TextComponent$$serializer() {
    }

    @Override // af.c0
    public b<?>[] childSerializers() {
        b<?>[] bVarArr = TextComponent.$childSerializers;
        ColorScheme$$serializer colorScheme$$serializer = ColorScheme$$serializer.INSTANCE;
        Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
        return new b[]{LocalizationKey$$serializer.INSTANCE, colorScheme$$serializer, a.p(colorScheme$$serializer), a.p(n1.f790a), bVarArr[4], bVarArr[5], bVarArr[6], Size$$serializer.INSTANCE, padding$$serializer, padding$$serializer, a.p(bVarArr[10])};
    }

    @Override // we.a
    public TextComponent deserialize(e eVar) {
        Object objK;
        Object objK2;
        int i10;
        Object objK3;
        Object objK4;
        Object obj;
        Object objK5;
        Object objL;
        Object objL2;
        Object objK6;
        Object objK7;
        Object objL3;
        b[] bVarArr;
        Object obj2;
        r.f(eVar, "decoder");
        f descriptor2 = getDescriptor();
        c cVarC = eVar.c(descriptor2);
        b[] bVarArr2 = TextComponent.$childSerializers;
        int i11 = 9;
        int i12 = 7;
        int i13 = 8;
        int i14 = 10;
        Object objK8 = null;
        if (cVarC.x()) {
            objK3 = cVarC.k(descriptor2, 0, LocalizationKey$$serializer.INSTANCE, null);
            ColorScheme$$serializer colorScheme$$serializer = ColorScheme$$serializer.INSTANCE;
            objK7 = cVarC.k(descriptor2, 1, colorScheme$$serializer, null);
            objL2 = cVarC.l(descriptor2, 2, colorScheme$$serializer, null);
            objL = cVarC.l(descriptor2, 3, n1.f790a, null);
            objK4 = cVarC.k(descriptor2, 4, bVarArr2[4], null);
            Object objK9 = cVarC.k(descriptor2, 5, bVarArr2[5], null);
            Object objK10 = cVarC.k(descriptor2, 6, bVarArr2[6], null);
            objK6 = cVarC.k(descriptor2, 7, Size$$serializer.INSTANCE, null);
            Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
            objK5 = cVarC.k(descriptor2, 8, padding$$serializer, null);
            objK2 = cVarC.k(descriptor2, 9, padding$$serializer, null);
            objL3 = cVarC.l(descriptor2, 10, bVarArr2[10], null);
            i10 = 2047;
            obj = objK9;
            objK = objK10;
        } else {
            int i15 = 0;
            boolean z10 = true;
            Object objL4 = null;
            Object objK11 = null;
            Object objL5 = null;
            objK = null;
            Object objK12 = null;
            Object objK13 = null;
            Object objL6 = null;
            Object objK14 = null;
            Object objK15 = null;
            Object objK16 = null;
            while (z10) {
                int iZ = cVarC.z(descriptor2);
                switch (iZ) {
                    case -1:
                        z10 = false;
                        objL4 = objL4;
                        bVarArr2 = bVarArr2;
                        i12 = 7;
                        i13 = 8;
                        i14 = 10;
                        break;
                    case 0:
                        bVarArr = bVarArr2;
                        obj2 = objL4;
                        objK8 = cVarC.k(descriptor2, 0, LocalizationKey$$serializer.INSTANCE, objK8);
                        i15 |= 1;
                        objL4 = obj2;
                        bVarArr2 = bVarArr;
                        i11 = 9;
                        i12 = 7;
                        i13 = 8;
                        i14 = 10;
                        break;
                    case 1:
                        bVarArr = bVarArr2;
                        obj2 = objL4;
                        objK16 = cVarC.k(descriptor2, 1, ColorScheme$$serializer.INSTANCE, objK16);
                        i15 |= 2;
                        objL4 = obj2;
                        bVarArr2 = bVarArr;
                        i11 = 9;
                        i12 = 7;
                        i13 = 8;
                        i14 = 10;
                        break;
                    case 2:
                        bVarArr = bVarArr2;
                        objL6 = cVarC.l(descriptor2, 2, ColorScheme$$serializer.INSTANCE, objL6);
                        i15 |= 4;
                        bVarArr2 = bVarArr;
                        i11 = 9;
                        i12 = 7;
                        i13 = 8;
                        i14 = 10;
                        break;
                    case 3:
                        objL5 = cVarC.l(descriptor2, 3, n1.f790a, objL5);
                        i15 |= 8;
                        i11 = 9;
                        i12 = 7;
                        i13 = 8;
                        i14 = 10;
                        break;
                    case 4:
                        objK15 = cVarC.k(descriptor2, 4, bVarArr2[4], objK15);
                        i15 |= 16;
                        i11 = 9;
                        i12 = 7;
                        i13 = 8;
                        i14 = 10;
                        break;
                    case 5:
                        objK14 = cVarC.k(descriptor2, 5, bVarArr2[5], objK14);
                        i15 |= 32;
                        i11 = 9;
                        i12 = 7;
                        i13 = 8;
                        break;
                    case 6:
                        objK = cVarC.k(descriptor2, 6, bVarArr2[6], objK);
                        i15 |= 64;
                        i11 = 9;
                        break;
                    case 7:
                        objK13 = cVarC.k(descriptor2, i12, Size$$serializer.INSTANCE, objK13);
                        i15 |= 128;
                        break;
                    case 8:
                        objK11 = cVarC.k(descriptor2, i13, Padding$$serializer.INSTANCE, objK11);
                        i15 |= 256;
                        break;
                    case 9:
                        objK12 = cVarC.k(descriptor2, i11, Padding$$serializer.INSTANCE, objK12);
                        i15 |= 512;
                        break;
                    case 10:
                        objL4 = cVarC.l(descriptor2, i14, bVarArr2[i14], objL4);
                        i15 |= 1024;
                        break;
                    default:
                        throw new j(iZ);
                }
            }
            Object obj3 = objL4;
            objK2 = objK12;
            i10 = i15;
            objK3 = objK8;
            objK4 = objK15;
            obj = objK14;
            objK5 = objK11;
            objL = objL5;
            objL2 = objL6;
            objK6 = objK13;
            objK7 = objK16;
            objL3 = obj3;
        }
        cVarC.d(descriptor2);
        LocalizationKey localizationKey = (LocalizationKey) objK3;
        return new TextComponent(i10, localizationKey != null ? localizationKey.m67unboximpl() : null, (ColorScheme) objK7, (ColorScheme) objL2, (String) objL, (FontWeight) objK4, (FontSize) obj, (HorizontalAlignment) objK, (Size) objK6, (Padding) objK5, (Padding) objK2, (ComponentOverrides) objL3, null, null);
    }

    @Override // we.b, we.h, we.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // we.h
    public void serialize(ze.f fVar, TextComponent textComponent) {
        r.f(fVar, "encoder");
        r.f(textComponent, "value");
        f descriptor2 = getDescriptor();
        d dVarC = fVar.c(descriptor2);
        TextComponent.write$Self(textComponent, dVarC, descriptor2);
        dVarC.d(descriptor2);
    }

    @Override // af.c0
    public b<?>[] typeParametersSerializers() {
        return c0.a.a(this);
    }
}
