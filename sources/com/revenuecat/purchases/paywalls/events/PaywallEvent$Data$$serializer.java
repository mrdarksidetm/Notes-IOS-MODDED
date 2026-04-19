package com.revenuecat.purchases.paywalls.events;

import ae.r;
import af.a1;
import af.c0;
import af.h;
import af.h0;
import af.n1;
import com.revenuecat.purchases.paywalls.events.PaywallEvent;
import com.revenuecat.purchases.utils.serializers.UUIDSerializer;
import java.util.UUID;
import we.b;
import we.j;
import ye.f;
import ze.c;
import ze.d;
import ze.e;

/* JADX INFO: loaded from: classes2.dex */
public final class PaywallEvent$Data$$serializer implements c0<PaywallEvent.Data> {
    public static final PaywallEvent$Data$$serializer INSTANCE;
    private static final /* synthetic */ a1 descriptor;

    static {
        PaywallEvent$Data$$serializer paywallEvent$Data$$serializer = new PaywallEvent$Data$$serializer();
        INSTANCE = paywallEvent$Data$$serializer;
        a1 a1Var = new a1("com.revenuecat.purchases.paywalls.events.PaywallEvent.Data", paywallEvent$Data$$serializer, 6);
        a1Var.l("offeringIdentifier", false);
        a1Var.l("paywallRevision", false);
        a1Var.l("sessionIdentifier", false);
        a1Var.l("displayMode", false);
        a1Var.l("localeIdentifier", false);
        a1Var.l("darkMode", false);
        descriptor = a1Var;
    }

    private PaywallEvent$Data$$serializer() {
    }

    @Override // af.c0
    public b<?>[] childSerializers() {
        n1 n1Var = n1.f790a;
        return new b[]{n1Var, h0.f765a, UUIDSerializer.INSTANCE, n1Var, n1Var, h.f763a};
    }

    @Override // we.a
    public PaywallEvent.Data deserialize(e eVar) {
        boolean zG;
        Object objK;
        String str;
        String str2;
        int i10;
        int i11;
        String str3;
        r.f(eVar, "decoder");
        f descriptor2 = getDescriptor();
        c cVarC = eVar.c(descriptor2);
        if (cVarC.x()) {
            String strM = cVarC.m(descriptor2, 0);
            int iO = cVarC.o(descriptor2, 1);
            objK = cVarC.k(descriptor2, 2, UUIDSerializer.INSTANCE, null);
            String strM2 = cVarC.m(descriptor2, 3);
            String strM3 = cVarC.m(descriptor2, 4);
            str3 = strM;
            zG = cVarC.g(descriptor2, 5);
            str = strM2;
            str2 = strM3;
            i11 = 63;
            i10 = iO;
        } else {
            String strM4 = null;
            Object objK2 = null;
            String strM5 = null;
            String strM6 = null;
            boolean z10 = true;
            boolean zG2 = false;
            int i12 = 0;
            int iO2 = 0;
            while (z10) {
                int iZ = cVarC.z(descriptor2);
                switch (iZ) {
                    case -1:
                        z10 = false;
                        continue;
                    case 0:
                        strM4 = cVarC.m(descriptor2, 0);
                        i12 |= 1;
                        continue;
                    case 1:
                        iO2 = cVarC.o(descriptor2, 1);
                        i12 |= 2;
                        break;
                    case 2:
                        objK2 = cVarC.k(descriptor2, 2, UUIDSerializer.INSTANCE, objK2);
                        i12 |= 4;
                        break;
                    case 3:
                        strM5 = cVarC.m(descriptor2, 3);
                        i12 |= 8;
                        break;
                    case 4:
                        strM6 = cVarC.m(descriptor2, 4);
                        i12 |= 16;
                        break;
                    case 5:
                        zG2 = cVarC.g(descriptor2, 5);
                        i12 |= 32;
                        break;
                    default:
                        throw new j(iZ);
                }
            }
            zG = zG2;
            objK = objK2;
            str = strM5;
            str2 = strM6;
            i10 = iO2;
            i11 = i12;
            str3 = strM4;
        }
        cVarC.d(descriptor2);
        return new PaywallEvent.Data(i11, str3, i10, (UUID) objK, str, str2, zG, null);
    }

    @Override // we.b, we.h, we.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // we.h
    public void serialize(ze.f fVar, PaywallEvent.Data data) {
        r.f(fVar, "encoder");
        r.f(data, "value");
        f descriptor2 = getDescriptor();
        d dVarC = fVar.c(descriptor2);
        PaywallEvent.Data.write$Self(data, dVarC, descriptor2);
        dVarC.d(descriptor2);
    }

    @Override // af.c0
    public b<?>[] typeParametersSerializers() {
        return c0.a.a(this);
    }
}
