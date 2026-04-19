package com.revenuecat.purchases.paywalls;

import ae.r;
import af.a1;
import af.c0;
import af.h0;
import af.j1;
import af.n1;
import com.revenuecat.purchases.paywalls.PaywallData;
import com.revenuecat.purchases.utils.serializers.GoogleListSerializer;
import com.revenuecat.purchases.utils.serializers.URLSerializer;
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
public final class PaywallData$$serializer implements c0<PaywallData> {
    public static final PaywallData$$serializer INSTANCE;
    private static final /* synthetic */ a1 descriptor;

    static {
        PaywallData$$serializer paywallData$$serializer = new PaywallData$$serializer();
        INSTANCE = paywallData$$serializer;
        a1 a1Var = new a1("com.revenuecat.purchases.paywalls.PaywallData", paywallData$$serializer, 8);
        a1Var.l("template_name", false);
        a1Var.l("config", false);
        a1Var.l("asset_base_url", false);
        a1Var.l("revision", true);
        a1Var.l("localized_strings", false);
        a1Var.l("localized_strings_by_tier", true);
        a1Var.l("zero_decimal_place_countries", true);
        a1Var.l("default_locale", true);
        descriptor = a1Var;
    }

    private PaywallData$$serializer() {
    }

    @Override // af.c0
    public b<?>[] childSerializers() {
        b<?>[] bVarArr = PaywallData.$childSerializers;
        n1 n1Var = n1.f790a;
        return new b[]{n1Var, PaywallData$Configuration$$serializer.INSTANCE, URLSerializer.INSTANCE, h0.f765a, bVarArr[4], bVarArr[5], GoogleListSerializer.INSTANCE, a.p(n1Var)};
    }

    @Override // we.a
    public PaywallData deserialize(e eVar) {
        Object objL;
        Object objK;
        Object objK2;
        int i10;
        Object objK3;
        Object objK4;
        int i11;
        String str;
        Object objK5;
        r.f(eVar, "decoder");
        f descriptor2 = getDescriptor();
        c cVarC = eVar.c(descriptor2);
        b[] bVarArr = PaywallData.$childSerializers;
        int i12 = 7;
        int i13 = 6;
        if (cVarC.x()) {
            String strM = cVarC.m(descriptor2, 0);
            objK5 = cVarC.k(descriptor2, 1, PaywallData$Configuration$$serializer.INSTANCE, null);
            Object objK6 = cVarC.k(descriptor2, 2, URLSerializer.INSTANCE, null);
            int iO = cVarC.o(descriptor2, 3);
            objK4 = cVarC.k(descriptor2, 4, bVarArr[4], null);
            objK3 = cVarC.k(descriptor2, 5, bVarArr[5], null);
            objK2 = objK6;
            objK = cVarC.k(descriptor2, 6, GoogleListSerializer.INSTANCE, null);
            str = strM;
            objL = cVarC.l(descriptor2, 7, n1.f790a, null);
            i11 = 255;
            i10 = iO;
        } else {
            boolean z10 = true;
            int iO2 = 0;
            objL = null;
            objK = null;
            Object objK7 = null;
            String strM2 = null;
            Object objK8 = null;
            objK2 = null;
            Object objK9 = null;
            int i14 = 0;
            while (z10) {
                int iZ = cVarC.z(descriptor2);
                switch (iZ) {
                    case -1:
                        z10 = false;
                        i12 = 7;
                        break;
                    case 0:
                        strM2 = cVarC.m(descriptor2, 0);
                        i14 |= 1;
                        i12 = 7;
                        i13 = 6;
                        break;
                    case 1:
                        objK8 = cVarC.k(descriptor2, 1, PaywallData$Configuration$$serializer.INSTANCE, objK8);
                        i14 |= 2;
                        i12 = 7;
                        i13 = 6;
                        break;
                    case 2:
                        objK2 = cVarC.k(descriptor2, 2, URLSerializer.INSTANCE, objK2);
                        i14 |= 4;
                        i12 = 7;
                        i13 = 6;
                        break;
                    case 3:
                        iO2 = cVarC.o(descriptor2, 3);
                        i14 |= 8;
                        i12 = 7;
                        break;
                    case 4:
                        objK9 = cVarC.k(descriptor2, 4, bVarArr[4], objK9);
                        i14 |= 16;
                        i12 = 7;
                        break;
                    case 5:
                        objK7 = cVarC.k(descriptor2, 5, bVarArr[5], objK7);
                        i14 |= 32;
                        break;
                    case 6:
                        objK = cVarC.k(descriptor2, i13, GoogleListSerializer.INSTANCE, objK);
                        i14 |= 64;
                        break;
                    case 7:
                        objL = cVarC.l(descriptor2, i12, n1.f790a, objL);
                        i14 |= 128;
                        break;
                    default:
                        throw new j(iZ);
                }
            }
            i10 = iO2;
            objK3 = objK7;
            objK4 = objK9;
            i11 = i14;
            str = strM2;
            objK5 = objK8;
        }
        cVarC.d(descriptor2);
        return new PaywallData(i11, str, (PaywallData.Configuration) objK5, (URL) objK2, i10, (Map) objK4, (Map) objK3, (List) objK, (String) objL, (j1) null);
    }

    @Override // we.b, we.h, we.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // we.h
    public void serialize(ze.f fVar, PaywallData paywallData) {
        r.f(fVar, "encoder");
        r.f(paywallData, "value");
        f descriptor2 = getDescriptor();
        d dVarC = fVar.c(descriptor2);
        PaywallData.write$Self(paywallData, dVarC, descriptor2);
        dVarC.d(descriptor2);
    }

    @Override // af.c0
    public b<?>[] typeParametersSerializers() {
        return c0.a.a(this);
    }
}
