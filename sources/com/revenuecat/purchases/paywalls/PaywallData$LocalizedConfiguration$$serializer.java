package com.revenuecat.purchases.paywalls;

import ae.r;
import af.a1;
import af.c0;
import af.j1;
import af.n1;
import com.amazon.a.a.o.b;
import com.revenuecat.purchases.paywalls.PaywallData;
import java.util.List;
import java.util.Map;
import we.j;
import xe.a;
import ye.f;
import ze.c;
import ze.d;
import ze.e;

/* JADX INFO: loaded from: classes2.dex */
public final class PaywallData$LocalizedConfiguration$$serializer implements c0<PaywallData.LocalizedConfiguration> {
    public static final PaywallData$LocalizedConfiguration$$serializer INSTANCE;
    private static final /* synthetic */ a1 descriptor;

    static {
        PaywallData$LocalizedConfiguration$$serializer paywallData$LocalizedConfiguration$$serializer = new PaywallData$LocalizedConfiguration$$serializer();
        INSTANCE = paywallData$LocalizedConfiguration$$serializer;
        a1 a1Var = new a1("com.revenuecat.purchases.paywalls.PaywallData.LocalizedConfiguration", paywallData$LocalizedConfiguration$$serializer, 12);
        a1Var.l(b.S, false);
        a1Var.l("subtitle", true);
        a1Var.l("call_to_action", false);
        a1Var.l("call_to_action_with_intro_offer", true);
        a1Var.l("call_to_action_with_multiple_intro_offers", true);
        a1Var.l("offer_details", true);
        a1Var.l("offer_details_with_intro_offer", true);
        a1Var.l("offer_details_with_multiple_intro_offers", true);
        a1Var.l("offer_name", true);
        a1Var.l("features", true);
        a1Var.l("tier_name", true);
        a1Var.l("offer_overrides", true);
        descriptor = a1Var;
    }

    private PaywallData$LocalizedConfiguration$$serializer() {
    }

    @Override // af.c0
    public we.b<?>[] childSerializers() {
        we.b<?>[] bVarArr = PaywallData.LocalizedConfiguration.$childSerializers;
        n1 n1Var = n1.f790a;
        EmptyStringToNullSerializer emptyStringToNullSerializer = EmptyStringToNullSerializer.INSTANCE;
        return new we.b[]{n1Var, a.p(emptyStringToNullSerializer), n1Var, a.p(emptyStringToNullSerializer), a.p(emptyStringToNullSerializer), a.p(emptyStringToNullSerializer), a.p(emptyStringToNullSerializer), a.p(emptyStringToNullSerializer), a.p(emptyStringToNullSerializer), bVarArr[9], a.p(emptyStringToNullSerializer), bVarArr[11]};
    }

    @Override // we.a
    public PaywallData.LocalizedConfiguration deserialize(e eVar) {
        Object objL;
        Object objL2;
        Object objL3;
        Object objL4;
        String strM;
        Object objL5;
        Object objL6;
        Object objK;
        int i10;
        Object objK2;
        String str;
        Object obj;
        Object objL7;
        we.b[] bVarArr;
        r.f(eVar, "decoder");
        f descriptor2 = getDescriptor();
        c cVarC = eVar.c(descriptor2);
        we.b[] bVarArr2 = PaywallData.LocalizedConfiguration.$childSerializers;
        if (cVarC.x()) {
            String strM2 = cVarC.m(descriptor2, 0);
            EmptyStringToNullSerializer emptyStringToNullSerializer = EmptyStringToNullSerializer.INSTANCE;
            Object objL8 = cVarC.l(descriptor2, 1, emptyStringToNullSerializer, null);
            String strM3 = cVarC.m(descriptor2, 2);
            Object objL9 = cVarC.l(descriptor2, 3, emptyStringToNullSerializer, null);
            Object objL10 = cVarC.l(descriptor2, 4, emptyStringToNullSerializer, null);
            Object objL11 = cVarC.l(descriptor2, 5, emptyStringToNullSerializer, null);
            objL7 = cVarC.l(descriptor2, 6, emptyStringToNullSerializer, null);
            Object objL12 = cVarC.l(descriptor2, 7, emptyStringToNullSerializer, null);
            Object objL13 = cVarC.l(descriptor2, 8, emptyStringToNullSerializer, null);
            objK = cVarC.k(descriptor2, 9, bVarArr2[9], null);
            Object objL14 = cVarC.l(descriptor2, 10, emptyStringToNullSerializer, null);
            objK2 = cVarC.k(descriptor2, 11, bVarArr2[11], null);
            strM = strM3;
            objL6 = objL8;
            objL5 = objL9;
            objL4 = objL10;
            objL2 = objL11;
            obj = objL13;
            objL3 = objL14;
            objL = objL12;
            i10 = 4095;
            str = strM2;
        } else {
            int i11 = 11;
            Object objK3 = null;
            Object objL15 = null;
            objL = null;
            objL2 = null;
            objL3 = null;
            Object objL16 = null;
            objL4 = null;
            Object objK4 = null;
            String strM4 = null;
            strM = null;
            boolean z10 = true;
            objL5 = null;
            int i12 = 0;
            objL6 = null;
            while (z10) {
                int iZ = cVarC.z(descriptor2);
                switch (iZ) {
                    case -1:
                        z10 = false;
                        bVarArr2 = bVarArr2;
                        break;
                    case 0:
                        bVarArr = bVarArr2;
                        strM4 = cVarC.m(descriptor2, 0);
                        i12 |= 1;
                        bVarArr2 = bVarArr;
                        i11 = 11;
                        break;
                    case 1:
                        bVarArr = bVarArr2;
                        objL6 = cVarC.l(descriptor2, 1, EmptyStringToNullSerializer.INSTANCE, objL6);
                        i12 |= 2;
                        bVarArr2 = bVarArr;
                        i11 = 11;
                        break;
                    case 2:
                        bVarArr = bVarArr2;
                        strM = cVarC.m(descriptor2, 2);
                        i12 |= 4;
                        bVarArr2 = bVarArr;
                        i11 = 11;
                        break;
                    case 3:
                        bVarArr = bVarArr2;
                        objL5 = cVarC.l(descriptor2, 3, EmptyStringToNullSerializer.INSTANCE, objL5);
                        i12 |= 8;
                        bVarArr2 = bVarArr;
                        i11 = 11;
                        break;
                    case 4:
                        bVarArr = bVarArr2;
                        objL4 = cVarC.l(descriptor2, 4, EmptyStringToNullSerializer.INSTANCE, objL4);
                        i12 |= 16;
                        bVarArr2 = bVarArr;
                        i11 = 11;
                        break;
                    case 5:
                        bVarArr = bVarArr2;
                        objL2 = cVarC.l(descriptor2, 5, EmptyStringToNullSerializer.INSTANCE, objL2);
                        i12 |= 32;
                        bVarArr2 = bVarArr;
                        i11 = 11;
                        break;
                    case 6:
                        bVarArr = bVarArr2;
                        objL16 = cVarC.l(descriptor2, 6, EmptyStringToNullSerializer.INSTANCE, objL16);
                        i12 |= 64;
                        bVarArr2 = bVarArr;
                        i11 = 11;
                        break;
                    case 7:
                        bVarArr = bVarArr2;
                        objL = cVarC.l(descriptor2, 7, EmptyStringToNullSerializer.INSTANCE, objL);
                        i12 |= 128;
                        bVarArr2 = bVarArr;
                        i11 = 11;
                        break;
                    case 8:
                        bVarArr = bVarArr2;
                        objL15 = cVarC.l(descriptor2, 8, EmptyStringToNullSerializer.INSTANCE, objL15);
                        i12 |= 256;
                        bVarArr2 = bVarArr;
                        i11 = 11;
                        break;
                    case 9:
                        objK3 = cVarC.k(descriptor2, 9, bVarArr2[9], objK3);
                        i12 |= 512;
                        i11 = 11;
                        break;
                    case 10:
                        objL3 = cVarC.l(descriptor2, 10, EmptyStringToNullSerializer.INSTANCE, objL3);
                        i12 |= 1024;
                        i11 = 11;
                        break;
                    case 11:
                        objK4 = cVarC.k(descriptor2, i11, bVarArr2[i11], objK4);
                        i12 |= 2048;
                        break;
                    default:
                        throw new j(iZ);
                }
            }
            objK = objK3;
            i10 = i12;
            objK2 = objK4;
            str = strM4;
            Object obj2 = objL16;
            obj = objL15;
            objL7 = obj2;
        }
        cVarC.d(descriptor2);
        return new PaywallData.LocalizedConfiguration(i10, str, (String) objL6, strM, (String) objL5, (String) objL4, (String) objL2, (String) objL7, (String) objL, (String) obj, (List) objK, (String) objL3, (Map) objK2, (j1) null);
    }

    @Override // we.b, we.h, we.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // we.h
    public void serialize(ze.f fVar, PaywallData.LocalizedConfiguration localizedConfiguration) {
        r.f(fVar, "encoder");
        r.f(localizedConfiguration, "value");
        f descriptor2 = getDescriptor();
        d dVarC = fVar.c(descriptor2);
        PaywallData.LocalizedConfiguration.write$Self(localizedConfiguration, dVarC, descriptor2);
        dVarC.d(descriptor2);
    }

    @Override // af.c0
    public we.b<?>[] typeParametersSerializers() {
        return c0.a.a(this);
    }
}
