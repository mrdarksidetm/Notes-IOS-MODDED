package com.revenuecat.purchases.paywalls.components.common;

import ae.r;
import af.a1;
import af.c0;
import af.h0;
import af.n1;
import com.revenuecat.purchases.utils.serializers.URLSerializer;
import java.net.URL;
import java.util.Map;
import we.b;
import we.j;
import ye.f;
import ze.c;
import ze.d;
import ze.e;

/* JADX INFO: loaded from: classes2.dex */
public final class PaywallComponentsData$$serializer implements c0<PaywallComponentsData> {
    public static final PaywallComponentsData$$serializer INSTANCE;
    private static final /* synthetic */ a1 descriptor;

    static {
        PaywallComponentsData$$serializer paywallComponentsData$$serializer = new PaywallComponentsData$$serializer();
        INSTANCE = paywallComponentsData$$serializer;
        a1 a1Var = new a1("com.revenuecat.purchases.paywalls.components.common.PaywallComponentsData", paywallComponentsData$$serializer, 6);
        a1Var.l("template_name", false);
        a1Var.l("asset_base_url", false);
        a1Var.l("components_config", false);
        a1Var.l("components_localizations", false);
        a1Var.l("default_locale", false);
        a1Var.l("revision", true);
        descriptor = a1Var;
    }

    private PaywallComponentsData$$serializer() {
    }

    @Override // af.c0
    public b<?>[] childSerializers() {
        return new b[]{n1.f790a, URLSerializer.INSTANCE, ComponentsConfig$$serializer.INSTANCE, PaywallComponentsData.$childSerializers[3], LocaleId$$serializer.INSTANCE, h0.f765a};
    }

    @Override // we.a
    public PaywallComponentsData deserialize(e eVar) {
        Object objK;
        Object objK2;
        Object objK3;
        String str;
        int iO;
        Object objK4;
        int i10;
        r.f(eVar, "decoder");
        f descriptor2 = getDescriptor();
        c cVarC = eVar.c(descriptor2);
        b[] bVarArr = PaywallComponentsData.$childSerializers;
        Object objK5 = null;
        if (cVarC.x()) {
            String strM = cVarC.m(descriptor2, 0);
            objK3 = cVarC.k(descriptor2, 1, URLSerializer.INSTANCE, null);
            objK4 = cVarC.k(descriptor2, 2, ComponentsConfig$$serializer.INSTANCE, null);
            objK2 = cVarC.k(descriptor2, 3, bVarArr[3], null);
            Object objK6 = cVarC.k(descriptor2, 4, LocaleId$$serializer.INSTANCE, null);
            iO = cVarC.o(descriptor2, 5);
            objK = objK6;
            i10 = 63;
            str = strM;
        } else {
            boolean z10 = true;
            int iO2 = 0;
            int i11 = 0;
            Object objK7 = null;
            String strM2 = null;
            objK = null;
            Object objK8 = null;
            while (z10) {
                int iZ = cVarC.z(descriptor2);
                switch (iZ) {
                    case -1:
                        z10 = false;
                        continue;
                    case 0:
                        strM2 = cVarC.m(descriptor2, 0);
                        i11 |= 1;
                        continue;
                    case 1:
                        objK5 = cVarC.k(descriptor2, 1, URLSerializer.INSTANCE, objK5);
                        i11 |= 2;
                        break;
                    case 2:
                        objK8 = cVarC.k(descriptor2, 2, ComponentsConfig$$serializer.INSTANCE, objK8);
                        i11 |= 4;
                        break;
                    case 3:
                        objK7 = cVarC.k(descriptor2, 3, bVarArr[3], objK7);
                        i11 |= 8;
                        break;
                    case 4:
                        objK = cVarC.k(descriptor2, 4, LocaleId$$serializer.INSTANCE, objK);
                        i11 |= 16;
                        break;
                    case 5:
                        iO2 = cVarC.o(descriptor2, 5);
                        i11 |= 32;
                        break;
                    default:
                        throw new j(iZ);
                }
            }
            objK2 = objK7;
            objK3 = objK5;
            str = strM2;
            iO = iO2;
            objK4 = objK8;
            i10 = i11;
        }
        cVarC.d(descriptor2);
        LocaleId localeId = (LocaleId) objK;
        return new PaywallComponentsData(i10, str, (URL) objK3, (ComponentsConfig) objK4, (Map) objK2, localeId != null ? localeId.m40unboximpl() : null, iO, null, null);
    }

    @Override // we.b, we.h, we.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // we.h
    public void serialize(ze.f fVar, PaywallComponentsData paywallComponentsData) {
        r.f(fVar, "encoder");
        r.f(paywallComponentsData, "value");
        f descriptor2 = getDescriptor();
        d dVarC = fVar.c(descriptor2);
        PaywallComponentsData.write$Self(paywallComponentsData, dVarC, descriptor2);
        dVarC.d(descriptor2);
    }

    @Override // af.c0
    public b<?>[] typeParametersSerializers() {
        return c0.a.a(this);
    }
}
