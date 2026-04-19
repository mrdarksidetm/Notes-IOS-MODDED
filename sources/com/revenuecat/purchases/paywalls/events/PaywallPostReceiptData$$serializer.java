package com.revenuecat.purchases.paywalls.events;

import ae.r;
import af.a1;
import af.c0;
import af.h;
import af.h0;
import af.n1;
import we.b;
import we.j;
import ye.f;
import ze.c;
import ze.d;
import ze.e;

/* JADX INFO: loaded from: classes2.dex */
public final class PaywallPostReceiptData$$serializer implements c0<PaywallPostReceiptData> {
    public static final PaywallPostReceiptData$$serializer INSTANCE;
    private static final /* synthetic */ a1 descriptor;

    static {
        PaywallPostReceiptData$$serializer paywallPostReceiptData$$serializer = new PaywallPostReceiptData$$serializer();
        INSTANCE = paywallPostReceiptData$$serializer;
        a1 a1Var = new a1("com.revenuecat.purchases.paywalls.events.PaywallPostReceiptData", paywallPostReceiptData$$serializer, 6);
        a1Var.l("session_id", false);
        a1Var.l("revision", false);
        a1Var.l("display_mode", false);
        a1Var.l("dark_mode", false);
        a1Var.l("locale", false);
        a1Var.l("offering_id", false);
        descriptor = a1Var;
    }

    private PaywallPostReceiptData$$serializer() {
    }

    @Override // af.c0
    public b<?>[] childSerializers() {
        n1 n1Var = n1.f790a;
        return new b[]{n1Var, h0.f765a, n1Var, h.f763a, n1Var, n1Var};
    }

    @Override // we.a
    public PaywallPostReceiptData deserialize(e eVar) {
        String strM;
        String str;
        String str2;
        boolean z10;
        int i10;
        String str3;
        int i11;
        r.f(eVar, "decoder");
        f descriptor2 = getDescriptor();
        c cVarC = eVar.c(descriptor2);
        if (cVarC.x()) {
            String strM2 = cVarC.m(descriptor2, 0);
            int iO = cVarC.o(descriptor2, 1);
            String strM3 = cVarC.m(descriptor2, 2);
            boolean zG = cVarC.g(descriptor2, 3);
            String strM4 = cVarC.m(descriptor2, 4);
            str2 = strM2;
            strM = cVarC.m(descriptor2, 5);
            z10 = zG;
            str = strM4;
            str3 = strM3;
            i11 = iO;
            i10 = 63;
        } else {
            String strM5 = null;
            String strM6 = null;
            String strM7 = null;
            String strM8 = null;
            boolean z11 = true;
            boolean zG2 = false;
            int iO2 = 0;
            int i12 = 0;
            while (z11) {
                int iZ = cVarC.z(descriptor2);
                switch (iZ) {
                    case -1:
                        z11 = false;
                        continue;
                    case 0:
                        strM5 = cVarC.m(descriptor2, 0);
                        i12 |= 1;
                        continue;
                    case 1:
                        iO2 = cVarC.o(descriptor2, 1);
                        i12 |= 2;
                        break;
                    case 2:
                        strM8 = cVarC.m(descriptor2, 2);
                        i12 |= 4;
                        break;
                    case 3:
                        zG2 = cVarC.g(descriptor2, 3);
                        i12 |= 8;
                        break;
                    case 4:
                        strM7 = cVarC.m(descriptor2, 4);
                        i12 |= 16;
                        break;
                    case 5:
                        strM6 = cVarC.m(descriptor2, 5);
                        i12 |= 32;
                        break;
                    default:
                        throw new j(iZ);
                }
            }
            strM = strM6;
            str = strM7;
            str2 = strM5;
            int i13 = i12;
            z10 = zG2;
            i10 = i13;
            int i14 = iO2;
            str3 = strM8;
            i11 = i14;
        }
        cVarC.d(descriptor2);
        return new PaywallPostReceiptData(i10, str2, i11, str3, z10, str, strM, null);
    }

    @Override // we.b, we.h, we.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // we.h
    public void serialize(ze.f fVar, PaywallPostReceiptData paywallPostReceiptData) {
        r.f(fVar, "encoder");
        r.f(paywallPostReceiptData, "value");
        f descriptor2 = getDescriptor();
        d dVarC = fVar.c(descriptor2);
        PaywallPostReceiptData.write$Self(paywallPostReceiptData, dVarC, descriptor2);
        dVarC.d(descriptor2);
    }

    @Override // af.c0
    public b<?>[] typeParametersSerializers() {
        return c0.a.a(this);
    }
}
