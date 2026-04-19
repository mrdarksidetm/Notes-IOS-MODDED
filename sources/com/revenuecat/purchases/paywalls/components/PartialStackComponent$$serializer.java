package com.revenuecat.purchases.paywalls.components;

import ae.r;
import af.a1;
import af.b0;
import af.c0;
import af.h;
import af.j1;
import com.revenuecat.purchases.paywalls.components.properties.Border;
import com.revenuecat.purchases.paywalls.components.properties.Border$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Dimension;
import com.revenuecat.purchases.paywalls.components.properties.Padding;
import com.revenuecat.purchases.paywalls.components.properties.Padding$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Shadow;
import com.revenuecat.purchases.paywalls.components.properties.Shadow$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.Shape;
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
public final class PartialStackComponent$$serializer implements c0<PartialStackComponent> {
    public static final PartialStackComponent$$serializer INSTANCE;
    private static final /* synthetic */ a1 descriptor;

    static {
        PartialStackComponent$$serializer partialStackComponent$$serializer = new PartialStackComponent$$serializer();
        INSTANCE = partialStackComponent$$serializer;
        a1 a1Var = new a1("com.revenuecat.purchases.paywalls.components.PartialStackComponent", partialStackComponent$$serializer, 10);
        a1Var.l("visible", true);
        a1Var.l("dimension", true);
        a1Var.l("size", true);
        a1Var.l("spacing", true);
        a1Var.l("background_color", true);
        a1Var.l("padding", true);
        a1Var.l("margin", true);
        a1Var.l("shape", true);
        a1Var.l("border", true);
        a1Var.l("shadow", true);
        descriptor = a1Var;
    }

    private PartialStackComponent$$serializer() {
    }

    @Override // af.c0
    public b<?>[] childSerializers() {
        b[] bVarArr = PartialStackComponent.$childSerializers;
        Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
        return new b[]{a.p(h.f763a), a.p(bVarArr[1]), a.p(Size$$serializer.INSTANCE), a.p(b0.f743a), a.p(ColorScheme$$serializer.INSTANCE), a.p(padding$$serializer), a.p(padding$$serializer), a.p(bVarArr[7]), a.p(Border$$serializer.INSTANCE), a.p(Shadow$$serializer.INSTANCE)};
    }

    @Override // we.a
    public PartialStackComponent deserialize(e eVar) {
        Object objL;
        Object objL2;
        Object objL3;
        Object objL4;
        Object objL5;
        Object objL6;
        Object objL7;
        Object objL8;
        Object objL9;
        int i10;
        Object objL10;
        Object obj;
        r.f(eVar, "decoder");
        f descriptor2 = getDescriptor();
        c cVarC = eVar.c(descriptor2);
        b[] bVarArr = PartialStackComponent.$childSerializers;
        int i11 = 9;
        Object objL11 = null;
        if (cVarC.x()) {
            objL10 = cVarC.l(descriptor2, 0, h.f763a, null);
            Object objL12 = cVarC.l(descriptor2, 1, bVarArr[1], null);
            objL7 = cVarC.l(descriptor2, 2, Size$$serializer.INSTANCE, null);
            objL8 = cVarC.l(descriptor2, 3, b0.f743a, null);
            objL5 = cVarC.l(descriptor2, 4, ColorScheme$$serializer.INSTANCE, null);
            Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
            objL3 = cVarC.l(descriptor2, 5, padding$$serializer, null);
            objL4 = cVarC.l(descriptor2, 6, padding$$serializer, null);
            objL2 = cVarC.l(descriptor2, 7, bVarArr[7], null);
            objL9 = cVarC.l(descriptor2, 8, Border$$serializer.INSTANCE, null);
            objL6 = cVarC.l(descriptor2, 9, Shadow$$serializer.INSTANCE, null);
            objL = objL12;
            i10 = 1023;
        } else {
            int i12 = 0;
            boolean z10 = true;
            Object objL13 = null;
            Object objL14 = null;
            Object objL15 = null;
            Object objL16 = null;
            Object objL17 = null;
            Object objL18 = null;
            Object objL19 = null;
            Object objL20 = null;
            objL = null;
            while (z10) {
                int iZ = cVarC.z(descriptor2);
                switch (iZ) {
                    case -1:
                        z10 = false;
                        i11 = 9;
                        break;
                    case 0:
                        obj = objL13;
                        objL11 = cVarC.l(descriptor2, 0, h.f763a, objL11);
                        i12 |= 1;
                        objL13 = obj;
                        i11 = 9;
                        break;
                    case 1:
                        obj = objL13;
                        objL = cVarC.l(descriptor2, 1, bVarArr[1], objL);
                        i12 |= 2;
                        objL13 = obj;
                        i11 = 9;
                        break;
                    case 2:
                        obj = objL13;
                        objL19 = cVarC.l(descriptor2, 2, Size$$serializer.INSTANCE, objL19);
                        i12 |= 4;
                        objL13 = obj;
                        i11 = 9;
                        break;
                    case 3:
                        obj = objL13;
                        objL20 = cVarC.l(descriptor2, 3, b0.f743a, objL20);
                        i12 |= 8;
                        objL13 = obj;
                        i11 = 9;
                        break;
                    case 4:
                        obj = objL13;
                        objL17 = cVarC.l(descriptor2, 4, ColorScheme$$serializer.INSTANCE, objL17);
                        i12 |= 16;
                        objL13 = obj;
                        i11 = 9;
                        break;
                    case 5:
                        obj = objL13;
                        objL15 = cVarC.l(descriptor2, 5, Padding$$serializer.INSTANCE, objL15);
                        i12 |= 32;
                        objL13 = obj;
                        i11 = 9;
                        break;
                    case 6:
                        obj = objL13;
                        objL16 = cVarC.l(descriptor2, 6, Padding$$serializer.INSTANCE, objL16);
                        i12 |= 64;
                        objL13 = obj;
                        i11 = 9;
                        break;
                    case 7:
                        objL14 = cVarC.l(descriptor2, 7, bVarArr[7], objL14);
                        i12 |= 128;
                        i11 = 9;
                        break;
                    case 8:
                        objL13 = cVarC.l(descriptor2, 8, Border$$serializer.INSTANCE, objL13);
                        i12 |= 256;
                        i11 = 9;
                        break;
                    case 9:
                        objL18 = cVarC.l(descriptor2, i11, Shadow$$serializer.INSTANCE, objL18);
                        i12 |= 512;
                        break;
                    default:
                        throw new j(iZ);
                }
            }
            Object obj2 = objL13;
            objL2 = objL14;
            objL3 = objL15;
            objL4 = objL16;
            objL5 = objL17;
            objL6 = objL18;
            objL7 = objL19;
            objL8 = objL20;
            objL9 = obj2;
            i10 = i12;
            objL10 = objL11;
        }
        cVarC.d(descriptor2);
        return new PartialStackComponent(i10, (Boolean) objL10, (Dimension) objL, (Size) objL7, (Float) objL8, (ColorScheme) objL5, (Padding) objL3, (Padding) objL4, (Shape) objL2, (Border) objL9, (Shadow) objL6, (j1) null);
    }

    @Override // we.b, we.h, we.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // we.h
    public void serialize(ze.f fVar, PartialStackComponent partialStackComponent) {
        r.f(fVar, "encoder");
        r.f(partialStackComponent, "value");
        f descriptor2 = getDescriptor();
        d dVarC = fVar.c(descriptor2);
        PartialStackComponent.write$Self(partialStackComponent, dVarC, descriptor2);
        dVarC.d(descriptor2);
    }

    @Override // af.c0
    public b<?>[] typeParametersSerializers() {
        return c0.a.a(this);
    }
}
