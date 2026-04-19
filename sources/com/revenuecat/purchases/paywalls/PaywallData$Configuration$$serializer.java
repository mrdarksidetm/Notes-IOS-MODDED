package com.revenuecat.purchases.paywalls;

import ae.r;
import af.a1;
import af.c0;
import af.h;
import af.j1;
import af.n1;
import com.revenuecat.purchases.paywalls.PaywallData;
import com.revenuecat.purchases.utils.serializers.OptionalURLSerializer;
import java.net.URL;
import java.util.List;
import java.util.Map;
import we.b;
import we.j;
import xe.a;
import ye.f;
import ze.c;
import ze.d;
import ze.e;

/* JADX INFO: loaded from: classes2.dex */
public final class PaywallData$Configuration$$serializer implements c0<PaywallData.Configuration> {
    public static final PaywallData$Configuration$$serializer INSTANCE;
    private static final /* synthetic */ a1 descriptor;

    static {
        PaywallData$Configuration$$serializer paywallData$Configuration$$serializer = new PaywallData$Configuration$$serializer();
        INSTANCE = paywallData$Configuration$$serializer;
        a1 a1Var = new a1("com.revenuecat.purchases.paywalls.PaywallData.Configuration", paywallData$Configuration$$serializer, 13);
        a1Var.l("packages", true);
        a1Var.l("default_package", true);
        a1Var.l("images_webp", true);
        a1Var.l("images", true);
        a1Var.l("images_by_tier", true);
        a1Var.l("blurred_background_image", true);
        a1Var.l("display_restore_purchases", true);
        a1Var.l("tos_url", true);
        a1Var.l("privacy_url", true);
        a1Var.l("colors", false);
        a1Var.l("colors_by_tier", true);
        a1Var.l("tiers", true);
        a1Var.l("default_tier", true);
        descriptor = a1Var;
    }

    private PaywallData$Configuration$$serializer() {
    }

    @Override // af.c0
    public b<?>[] childSerializers() {
        b<?>[] bVarArr = PaywallData.Configuration.$childSerializers;
        n1 n1Var = n1.f790a;
        PaywallData$Configuration$Images$$serializer paywallData$Configuration$Images$$serializer = PaywallData$Configuration$Images$$serializer.INSTANCE;
        h hVar = h.f763a;
        OptionalURLSerializer optionalURLSerializer = OptionalURLSerializer.INSTANCE;
        return new b[]{bVarArr[0], a.p(n1Var), a.p(paywallData$Configuration$Images$$serializer), a.p(paywallData$Configuration$Images$$serializer), a.p(bVarArr[4]), hVar, hVar, a.p(optionalURLSerializer), a.p(optionalURLSerializer), PaywallData$Configuration$ColorInformation$$serializer.INSTANCE, a.p(bVarArr[10]), a.p(bVarArr[11]), a.p(n1Var)};
    }

    @Override // we.a
    public PaywallData.Configuration deserialize(e eVar) {
        Object objL;
        Object objL2;
        Object obj;
        int i10;
        Object objK;
        Object objL3;
        boolean z10;
        Object objL4;
        boolean z11;
        Object objL5;
        Object objL6;
        Object objL7;
        Object objL8;
        Object objL9;
        boolean z12;
        Object obj2;
        boolean z13;
        r.f(eVar, "decoder");
        f descriptor2 = getDescriptor();
        c cVarC = eVar.c(descriptor2);
        b[] bVarArr = PaywallData.Configuration.$childSerializers;
        int i11 = 0;
        if (cVarC.x()) {
            Object objK2 = cVarC.k(descriptor2, 0, bVarArr[0], null);
            n1 n1Var = n1.f790a;
            objL9 = cVarC.l(descriptor2, 1, n1Var, null);
            PaywallData$Configuration$Images$$serializer paywallData$Configuration$Images$$serializer = PaywallData$Configuration$Images$$serializer.INSTANCE;
            objL8 = cVarC.l(descriptor2, 2, paywallData$Configuration$Images$$serializer, null);
            objL7 = cVarC.l(descriptor2, 3, paywallData$Configuration$Images$$serializer, null);
            objL6 = cVarC.l(descriptor2, 4, bVarArr[4], null);
            boolean zG = cVarC.g(descriptor2, 5);
            boolean zG2 = cVarC.g(descriptor2, 6);
            OptionalURLSerializer optionalURLSerializer = OptionalURLSerializer.INSTANCE;
            Object objL10 = cVarC.l(descriptor2, 7, optionalURLSerializer, null);
            objL5 = cVarC.l(descriptor2, 8, optionalURLSerializer, null);
            objK = cVarC.k(descriptor2, 9, PaywallData$Configuration$ColorInformation$$serializer.INSTANCE, null);
            Object objL11 = cVarC.l(descriptor2, 10, bVarArr[10], null);
            objL3 = cVarC.l(descriptor2, 11, bVarArr[11], null);
            objL4 = cVarC.l(descriptor2, 12, n1Var, null);
            objL2 = objL10;
            z11 = zG2;
            z10 = zG;
            objL = objL11;
            obj = objK2;
            i10 = 8191;
        } else {
            boolean zG3 = false;
            Object objL12 = null;
            objL = null;
            Object objK3 = null;
            Object objL13 = null;
            Object objL14 = null;
            Object objL15 = null;
            Object objL16 = null;
            objL2 = null;
            Object objK4 = null;
            Object objL17 = null;
            boolean z14 = true;
            Object objL18 = null;
            boolean zG4 = false;
            while (z14) {
                int iZ = cVarC.z(descriptor2);
                switch (iZ) {
                    case -1:
                        z12 = zG4;
                        obj2 = objL17;
                        z14 = false;
                        bVarArr = bVarArr;
                        objL17 = obj2;
                        zG4 = z12;
                        break;
                    case 0:
                        z12 = zG4;
                        obj2 = objL17;
                        objK4 = cVarC.k(descriptor2, 0, bVarArr[0], objK4);
                        i11 |= 1;
                        bVarArr = bVarArr;
                        objL12 = objL12;
                        objL17 = obj2;
                        zG4 = z12;
                        break;
                    case 1:
                        i11 |= 2;
                        objL12 = objL12;
                        zG4 = zG4;
                        objL17 = cVarC.l(descriptor2, 1, n1.f790a, objL17);
                        break;
                    case 2:
                        z13 = zG4;
                        objL18 = cVarC.l(descriptor2, 2, PaywallData$Configuration$Images$$serializer.INSTANCE, objL18);
                        i11 |= 4;
                        zG4 = z13;
                        break;
                    case 3:
                        z13 = zG4;
                        objL16 = cVarC.l(descriptor2, 3, PaywallData$Configuration$Images$$serializer.INSTANCE, objL16);
                        i11 |= 8;
                        zG4 = z13;
                        break;
                    case 4:
                        z13 = zG4;
                        objL14 = cVarC.l(descriptor2, 4, bVarArr[4], objL14);
                        i11 |= 16;
                        zG4 = z13;
                        break;
                    case 5:
                        z13 = zG4;
                        i11 |= 32;
                        zG3 = cVarC.g(descriptor2, 5);
                        zG4 = z13;
                        break;
                    case 6:
                        i11 |= 64;
                        zG4 = cVarC.g(descriptor2, 6);
                        break;
                    case 7:
                        z13 = zG4;
                        objL2 = cVarC.l(descriptor2, 7, OptionalURLSerializer.INSTANCE, objL2);
                        i11 |= 128;
                        zG4 = z13;
                        break;
                    case 8:
                        z13 = zG4;
                        objL13 = cVarC.l(descriptor2, 8, OptionalURLSerializer.INSTANCE, objL13);
                        i11 |= 256;
                        zG4 = z13;
                        break;
                    case 9:
                        z13 = zG4;
                        objK3 = cVarC.k(descriptor2, 9, PaywallData$Configuration$ColorInformation$$serializer.INSTANCE, objK3);
                        i11 |= 512;
                        zG4 = z13;
                        break;
                    case 10:
                        z13 = zG4;
                        objL = cVarC.l(descriptor2, 10, bVarArr[10], objL);
                        i11 |= 1024;
                        zG4 = z13;
                        break;
                    case 11:
                        z13 = zG4;
                        objL15 = cVarC.l(descriptor2, 11, bVarArr[11], objL15);
                        i11 |= 2048;
                        zG4 = z13;
                        break;
                    case 12:
                        z12 = zG4;
                        objL12 = cVarC.l(descriptor2, 12, n1.f790a, objL12);
                        i11 |= 4096;
                        zG4 = z12;
                        break;
                    default:
                        throw new j(iZ);
                }
            }
            boolean z15 = zG4;
            Object obj3 = objL17;
            Object obj4 = objL12;
            obj = objK4;
            i10 = i11;
            objK = objK3;
            objL3 = objL15;
            z10 = zG3;
            objL4 = obj4;
            z11 = z15;
            objL5 = objL13;
            objL6 = objL14;
            objL7 = objL16;
            objL8 = objL18;
            objL9 = obj3;
        }
        cVarC.d(descriptor2);
        return new PaywallData.Configuration(i10, (List) obj, (String) objL9, (PaywallData.Configuration.Images) objL8, (PaywallData.Configuration.Images) objL7, (Map) objL6, z10, z11, (URL) objL2, (URL) objL5, (PaywallData.Configuration.ColorInformation) objK, (Map) objL, (List) objL3, (String) objL4, (j1) null);
    }

    @Override // we.b, we.h, we.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // we.h
    public void serialize(ze.f fVar, PaywallData.Configuration configuration) {
        r.f(fVar, "encoder");
        r.f(configuration, "value");
        f descriptor2 = getDescriptor();
        d dVarC = fVar.c(descriptor2);
        PaywallData.Configuration.write$Self(configuration, dVarC, descriptor2);
        dVarC.d(descriptor2);
    }

    @Override // af.c0
    public b<?>[] typeParametersSerializers() {
        return c0.a.a(this);
    }
}
