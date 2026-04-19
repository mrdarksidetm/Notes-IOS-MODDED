package com.revenuecat.purchases.paywalls;

import ae.r;
import af.a1;
import af.c0;
import af.j1;
import com.revenuecat.purchases.paywalls.PaywallColor;
import com.revenuecat.purchases.paywalls.PaywallData;
import we.b;
import we.j;
import xe.a;
import ye.f;
import ze.c;
import ze.d;
import ze.e;

/* JADX INFO: loaded from: classes2.dex */
public final class PaywallData$Configuration$Colors$$serializer implements c0<PaywallData.Configuration.Colors> {
    public static final PaywallData$Configuration$Colors$$serializer INSTANCE;
    private static final /* synthetic */ a1 descriptor;

    static {
        PaywallData$Configuration$Colors$$serializer paywallData$Configuration$Colors$$serializer = new PaywallData$Configuration$Colors$$serializer();
        INSTANCE = paywallData$Configuration$Colors$$serializer;
        a1 a1Var = new a1("com.revenuecat.purchases.paywalls.PaywallData.Configuration.Colors", paywallData$Configuration$Colors$$serializer, 15);
        a1Var.l("background", false);
        a1Var.l("text_1", false);
        a1Var.l("text_2", true);
        a1Var.l("text_3", true);
        a1Var.l("call_to_action_background", false);
        a1Var.l("call_to_action_foreground", false);
        a1Var.l("call_to_action_secondary_background", true);
        a1Var.l("accent_1", true);
        a1Var.l("accent_2", true);
        a1Var.l("accent_3", true);
        a1Var.l("close_button", true);
        a1Var.l("tier_control_background", true);
        a1Var.l("tier_control_foreground", true);
        a1Var.l("tier_control_selected_background", true);
        a1Var.l("tier_control_selected_foreground", true);
        descriptor = a1Var;
    }

    private PaywallData$Configuration$Colors$$serializer() {
    }

    @Override // af.c0
    public b<?>[] childSerializers() {
        PaywallColor.Serializer serializer = PaywallColor.Serializer.INSTANCE;
        return new b[]{serializer, serializer, a.p(serializer), a.p(serializer), serializer, serializer, a.p(serializer), a.p(serializer), a.p(serializer), a.p(serializer), a.p(serializer), a.p(serializer), a.p(serializer), a.p(serializer), a.p(serializer)};
    }

    @Override // we.a
    public PaywallData.Configuration.Colors deserialize(e eVar) {
        Object objL;
        Object obj;
        Object obj2;
        int i10;
        Object objL2;
        Object obj3;
        Object obj4;
        Object objL3;
        Object obj5;
        Object obj6;
        Object obj7;
        Object objL4;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        Object obj12;
        Object obj13;
        Object obj14;
        Object obj15;
        Object obj16;
        r.f(eVar, "decoder");
        f descriptor2 = getDescriptor();
        c cVarC = eVar.c(descriptor2);
        if (cVarC.x()) {
            PaywallColor.Serializer serializer = PaywallColor.Serializer.INSTANCE;
            Object objK = cVarC.k(descriptor2, 0, serializer, null);
            Object objK2 = cVarC.k(descriptor2, 1, serializer, null);
            Object objL5 = cVarC.l(descriptor2, 2, serializer, null);
            Object objL6 = cVarC.l(descriptor2, 3, serializer, null);
            Object objK3 = cVarC.k(descriptor2, 4, serializer, null);
            Object objK4 = cVarC.k(descriptor2, 5, serializer, null);
            Object objL7 = cVarC.l(descriptor2, 6, serializer, null);
            Object objL8 = cVarC.l(descriptor2, 7, serializer, null);
            objL4 = cVarC.l(descriptor2, 8, serializer, null);
            Object objL9 = cVarC.l(descriptor2, 9, serializer, null);
            Object objL10 = cVarC.l(descriptor2, 10, serializer, null);
            Object objL11 = cVarC.l(descriptor2, 11, serializer, null);
            obj4 = objK;
            objL2 = cVarC.l(descriptor2, 12, serializer, null);
            Object objL12 = cVarC.l(descriptor2, 13, serializer, null);
            objL3 = cVarC.l(descriptor2, 14, serializer, null);
            obj2 = objL5;
            obj = objL12;
            obj5 = objL11;
            obj6 = objL10;
            obj3 = objK2;
            i10 = 32767;
            obj11 = objL9;
            obj7 = objL6;
            obj9 = objL8;
            obj8 = objK3;
            objL = objL7;
            obj10 = objK4;
        } else {
            boolean z10 = true;
            Object objL13 = null;
            Object objL14 = null;
            Object objL15 = null;
            Object objL16 = null;
            Object objL17 = null;
            Object objL18 = null;
            objL = null;
            Object objK5 = null;
            Object objL19 = null;
            Object objK6 = null;
            Object objL20 = null;
            Object objK7 = null;
            Object objL21 = null;
            Object objK8 = null;
            int i11 = 0;
            Object objL22 = null;
            while (z10) {
                int iZ = cVarC.z(descriptor2);
                switch (iZ) {
                    case -1:
                        obj12 = objL22;
                        obj13 = objK8;
                        obj14 = objL13;
                        z10 = false;
                        objL22 = obj12;
                        objL13 = obj14;
                        objK8 = obj13;
                        break;
                    case 0:
                        obj12 = objL22;
                        Object obj17 = objK8;
                        obj14 = objL13;
                        obj13 = obj17;
                        objK7 = cVarC.k(descriptor2, 0, PaywallColor.Serializer.INSTANCE, objK7);
                        i11 |= 1;
                        objL22 = obj12;
                        objL13 = obj14;
                        objK8 = obj13;
                        break;
                    case 1:
                        i11 |= 2;
                        objL22 = objL22;
                        objL13 = objL13;
                        objK8 = cVarC.k(descriptor2, 1, PaywallColor.Serializer.INSTANCE, objK8);
                        break;
                    case 2:
                        i11 |= 4;
                        objL13 = cVarC.l(descriptor2, 2, PaywallColor.Serializer.INSTANCE, objL13);
                        objL22 = objL22;
                        objL21 = objL21;
                        break;
                    case 3:
                        obj15 = objL22;
                        obj16 = objL13;
                        objL20 = cVarC.l(descriptor2, 3, PaywallColor.Serializer.INSTANCE, objL20);
                        i11 |= 8;
                        objL22 = obj15;
                        objL13 = obj16;
                        break;
                    case 4:
                        obj15 = objL22;
                        obj16 = objL13;
                        objK5 = cVarC.k(descriptor2, 4, PaywallColor.Serializer.INSTANCE, objK5);
                        i11 |= 16;
                        objL22 = obj15;
                        objL13 = obj16;
                        break;
                    case 5:
                        obj15 = objL22;
                        obj16 = objL13;
                        objK6 = cVarC.k(descriptor2, 5, PaywallColor.Serializer.INSTANCE, objK6);
                        i11 |= 32;
                        objL22 = obj15;
                        objL13 = obj16;
                        break;
                    case 6:
                        obj15 = objL22;
                        obj16 = objL13;
                        objL = cVarC.l(descriptor2, 6, PaywallColor.Serializer.INSTANCE, objL);
                        i11 |= 64;
                        objL22 = obj15;
                        objL13 = obj16;
                        break;
                    case 7:
                        obj15 = objL22;
                        obj16 = objL13;
                        objL18 = cVarC.l(descriptor2, 7, PaywallColor.Serializer.INSTANCE, objL18);
                        i11 |= 128;
                        objL22 = obj15;
                        objL13 = obj16;
                        break;
                    case 8:
                        obj15 = objL22;
                        obj16 = objL13;
                        objL17 = cVarC.l(descriptor2, 8, PaywallColor.Serializer.INSTANCE, objL17);
                        i11 |= 256;
                        objL22 = obj15;
                        objL13 = obj16;
                        break;
                    case 9:
                        obj15 = objL22;
                        obj16 = objL13;
                        objL19 = cVarC.l(descriptor2, 9, PaywallColor.Serializer.INSTANCE, objL19);
                        i11 |= 512;
                        objL22 = obj15;
                        objL13 = obj16;
                        break;
                    case 10:
                        obj15 = objL22;
                        obj16 = objL13;
                        objL16 = cVarC.l(descriptor2, 10, PaywallColor.Serializer.INSTANCE, objL16);
                        i11 |= 1024;
                        objL22 = obj15;
                        objL13 = obj16;
                        break;
                    case 11:
                        obj15 = objL22;
                        obj16 = objL13;
                        objL15 = cVarC.l(descriptor2, 11, PaywallColor.Serializer.INSTANCE, objL15);
                        i11 |= 2048;
                        objL22 = obj15;
                        objL13 = obj16;
                        break;
                    case 12:
                        obj15 = objL22;
                        obj16 = objL13;
                        objL14 = cVarC.l(descriptor2, 12, PaywallColor.Serializer.INSTANCE, objL14);
                        i11 |= 4096;
                        objL22 = obj15;
                        objL13 = obj16;
                        break;
                    case 13:
                        obj16 = objL13;
                        obj15 = objL22;
                        objL21 = cVarC.l(descriptor2, 13, PaywallColor.Serializer.INSTANCE, objL21);
                        i11 |= 8192;
                        objL22 = obj15;
                        objL13 = obj16;
                        break;
                    case 14:
                        objL22 = cVarC.l(descriptor2, 14, PaywallColor.Serializer.INSTANCE, objL22);
                        i11 |= 16384;
                        objL13 = objL13;
                        break;
                    default:
                        throw new j(iZ);
                }
            }
            obj = objL21;
            Object obj18 = objK8;
            obj2 = objL13;
            i10 = i11;
            objL2 = objL14;
            obj3 = obj18;
            obj4 = objK7;
            objL3 = objL22;
            obj5 = objL15;
            Object obj19 = objL20;
            obj6 = objL16;
            obj7 = obj19;
            Object obj20 = objL19;
            objL4 = objL17;
            obj8 = objK5;
            obj9 = objL18;
            obj10 = objK6;
            obj11 = obj20;
        }
        cVarC.d(descriptor2);
        return new PaywallData.Configuration.Colors(i10, (PaywallColor) obj4, (PaywallColor) obj3, (PaywallColor) obj2, (PaywallColor) obj7, (PaywallColor) obj8, (PaywallColor) obj10, (PaywallColor) objL, (PaywallColor) obj9, (PaywallColor) objL4, (PaywallColor) obj11, (PaywallColor) obj6, (PaywallColor) obj5, (PaywallColor) objL2, (PaywallColor) obj, (PaywallColor) objL3, (j1) null);
    }

    @Override // we.b, we.h, we.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // we.h
    public void serialize(ze.f fVar, PaywallData.Configuration.Colors colors) {
        r.f(fVar, "encoder");
        r.f(colors, "value");
        f descriptor2 = getDescriptor();
        d dVarC = fVar.c(descriptor2);
        PaywallData.Configuration.Colors.write$Self(colors, dVarC, descriptor2);
        dVarC.d(descriptor2);
    }

    @Override // af.c0
    public b<?>[] typeParametersSerializers() {
        return c0.a.a(this);
    }
}
