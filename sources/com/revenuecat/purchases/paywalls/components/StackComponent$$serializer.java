package com.revenuecat.purchases.paywalls.components;

import ae.r;
import af.a1;
import af.b0;
import af.c0;
import af.j1;
import com.revenuecat.purchases.paywalls.components.common.ComponentOverrides;
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
import java.util.List;
import we.b;
import we.j;
import xe.a;
import ye.f;
import ze.c;
import ze.d;
import ze.e;

/* JADX INFO: loaded from: classes2.dex */
public final class StackComponent$$serializer implements c0<StackComponent> {
    public static final StackComponent$$serializer INSTANCE;
    private static final /* synthetic */ a1 descriptor;

    static {
        StackComponent$$serializer stackComponent$$serializer = new StackComponent$$serializer();
        INSTANCE = stackComponent$$serializer;
        a1 a1Var = new a1("stack", stackComponent$$serializer, 11);
        a1Var.l("components", false);
        a1Var.l("dimension", true);
        a1Var.l("size", true);
        a1Var.l("spacing", true);
        a1Var.l("background_color", true);
        a1Var.l("padding", true);
        a1Var.l("margin", true);
        a1Var.l("shape", true);
        a1Var.l("border", true);
        a1Var.l("shadow", true);
        a1Var.l("overrides", true);
        descriptor = a1Var;
    }

    private StackComponent$$serializer() {
    }

    @Override // af.c0
    public b<?>[] childSerializers() {
        b<?>[] bVarArr = StackComponent.$childSerializers;
        Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
        return new b[]{bVarArr[0], bVarArr[1], Size$$serializer.INSTANCE, a.p(b0.f743a), a.p(ColorScheme$$serializer.INSTANCE), padding$$serializer, padding$$serializer, a.p(bVarArr[7]), a.p(Border$$serializer.INSTANCE), a.p(Shadow$$serializer.INSTANCE), a.p(bVarArr[10])};
    }

    @Override // we.a
    public StackComponent deserialize(e eVar) {
        Object objK;
        Object obj;
        Object objK2;
        Object objL;
        Object objK3;
        Object objL2;
        Object objL3;
        int i10;
        Object objL4;
        Object objL5;
        Object objK4;
        Object objK5;
        Object obj2;
        r.f(eVar, "decoder");
        f descriptor2 = getDescriptor();
        c cVarC = eVar.c(descriptor2);
        b[] bVarArr = StackComponent.$childSerializers;
        int i11 = 10;
        Object objK6 = null;
        if (cVarC.x()) {
            objK5 = cVarC.k(descriptor2, 0, bVarArr[0], null);
            objK = cVarC.k(descriptor2, 1, bVarArr[1], null);
            objK4 = cVarC.k(descriptor2, 2, Size$$serializer.INSTANCE, null);
            objL5 = cVarC.l(descriptor2, 3, b0.f743a, null);
            objL4 = cVarC.l(descriptor2, 4, ColorScheme$$serializer.INSTANCE, null);
            Padding$$serializer padding$$serializer = Padding$$serializer.INSTANCE;
            objK3 = cVarC.k(descriptor2, 5, padding$$serializer, null);
            objK2 = cVarC.k(descriptor2, 6, padding$$serializer, null);
            Object objL6 = cVarC.l(descriptor2, 7, bVarArr[7], null);
            objL2 = cVarC.l(descriptor2, 8, Border$$serializer.INSTANCE, null);
            objL = cVarC.l(descriptor2, 9, Shadow$$serializer.INSTANCE, null);
            objL3 = cVarC.l(descriptor2, 10, bVarArr[10], null);
            i10 = 2047;
            obj = objL6;
        } else {
            int i12 = 0;
            boolean z10 = true;
            Object objL7 = null;
            Object objL8 = null;
            Object objK7 = null;
            Object objL9 = null;
            Object objL10 = null;
            Object objK8 = null;
            Object objL11 = null;
            Object objL12 = null;
            objK = null;
            Object objK9 = null;
            while (z10) {
                Object obj3 = objK6;
                int iZ = cVarC.z(descriptor2);
                switch (iZ) {
                    case -1:
                        objK6 = obj3;
                        z10 = false;
                        objL7 = objL7;
                        break;
                    case 0:
                        objK6 = cVarC.k(descriptor2, 0, bVarArr[0], obj3);
                        i12 |= 1;
                        objL7 = objL7;
                        i11 = 10;
                        break;
                    case 1:
                        obj2 = objL7;
                        objK = cVarC.k(descriptor2, 1, bVarArr[1], objK);
                        i12 |= 2;
                        objL7 = obj2;
                        objK6 = obj3;
                        i11 = 10;
                        break;
                    case 2:
                        obj2 = objL7;
                        objK9 = cVarC.k(descriptor2, 2, Size$$serializer.INSTANCE, objK9);
                        i12 |= 4;
                        objL7 = obj2;
                        objK6 = obj3;
                        i11 = 10;
                        break;
                    case 3:
                        obj2 = objL7;
                        objL11 = cVarC.l(descriptor2, 3, b0.f743a, objL11);
                        i12 |= 8;
                        objL7 = obj2;
                        objK6 = obj3;
                        i11 = 10;
                        break;
                    case 4:
                        obj2 = objL7;
                        objL9 = cVarC.l(descriptor2, 4, ColorScheme$$serializer.INSTANCE, objL9);
                        i12 |= 16;
                        objL7 = obj2;
                        objK6 = obj3;
                        i11 = 10;
                        break;
                    case 5:
                        obj2 = objL7;
                        objK8 = cVarC.k(descriptor2, 5, Padding$$serializer.INSTANCE, objK8);
                        i12 |= 32;
                        objL7 = obj2;
                        objK6 = obj3;
                        i11 = 10;
                        break;
                    case 6:
                        obj2 = objL7;
                        objK7 = cVarC.k(descriptor2, 6, Padding$$serializer.INSTANCE, objK7);
                        i12 |= 64;
                        objL7 = obj2;
                        objK6 = obj3;
                        i11 = 10;
                        break;
                    case 7:
                        objL8 = cVarC.l(descriptor2, 7, bVarArr[7], objL8);
                        i12 |= 128;
                        objK6 = obj3;
                        i11 = 10;
                        break;
                    case 8:
                        objL12 = cVarC.l(descriptor2, 8, Border$$serializer.INSTANCE, objL12);
                        i12 |= 256;
                        objK6 = obj3;
                        i11 = 10;
                        break;
                    case 9:
                        objL10 = cVarC.l(descriptor2, 9, Shadow$$serializer.INSTANCE, objL10);
                        i12 |= 512;
                        objK6 = obj3;
                        i11 = 10;
                        break;
                    case 10:
                        objL7 = cVarC.l(descriptor2, i11, bVarArr[i11], objL7);
                        i12 |= 1024;
                        objK6 = obj3;
                        break;
                    default:
                        throw new j(iZ);
                }
            }
            Object obj4 = objL7;
            obj = objL8;
            objK2 = objK7;
            objL = objL10;
            objK3 = objK8;
            objL2 = objL12;
            objL3 = obj4;
            i10 = i12;
            objL4 = objL9;
            objL5 = objL11;
            objK4 = objK9;
            objK5 = objK6;
        }
        cVarC.d(descriptor2);
        return new StackComponent(i10, (List) objK5, (Dimension) objK, (Size) objK4, (Float) objL5, (ColorScheme) objL4, (Padding) objK3, (Padding) objK2, (Shape) obj, (Border) objL2, (Shadow) objL, (ComponentOverrides) objL3, (j1) null);
    }

    @Override // we.b, we.h, we.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // we.h
    public void serialize(ze.f fVar, StackComponent stackComponent) {
        r.f(fVar, "encoder");
        r.f(stackComponent, "value");
        f descriptor2 = getDescriptor();
        d dVarC = fVar.c(descriptor2);
        StackComponent.write$Self(stackComponent, dVarC, descriptor2);
        dVarC.d(descriptor2);
    }

    @Override // af.c0
    public b<?>[] typeParametersSerializers() {
        return c0.a.a(this);
    }
}
