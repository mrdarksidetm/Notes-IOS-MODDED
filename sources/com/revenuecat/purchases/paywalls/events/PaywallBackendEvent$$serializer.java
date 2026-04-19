package com.revenuecat.purchases.paywalls.events;

import ae.r;
import af.a1;
import af.c0;
import af.h;
import af.h0;
import af.n1;
import af.o0;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import we.b;
import we.j;
import ye.f;
import ze.c;
import ze.d;
import ze.e;

/* JADX INFO: loaded from: classes2.dex */
public final class PaywallBackendEvent$$serializer implements c0<PaywallBackendEvent> {
    public static final PaywallBackendEvent$$serializer INSTANCE;
    private static final /* synthetic */ a1 descriptor;

    static {
        PaywallBackendEvent$$serializer paywallBackendEvent$$serializer = new PaywallBackendEvent$$serializer();
        INSTANCE = paywallBackendEvent$$serializer;
        a1 a1Var = new a1("com.revenuecat.purchases.paywalls.events.PaywallBackendEvent", paywallBackendEvent$$serializer, 11);
        a1Var.l("id", false);
        a1Var.l(DiagnosticsEntry.VERSION_KEY, false);
        a1Var.l("type", false);
        a1Var.l("app_user_id", false);
        a1Var.l("session_id", false);
        a1Var.l("offering_id", false);
        a1Var.l("paywall_revision", false);
        a1Var.l(DiagnosticsEntry.TIMESTAMP_KEY, false);
        a1Var.l("display_mode", false);
        a1Var.l("dark_mode", false);
        a1Var.l("locale", false);
        descriptor = a1Var;
    }

    private PaywallBackendEvent$$serializer() {
    }

    @Override // af.c0
    public b<?>[] childSerializers() {
        n1 n1Var = n1.f790a;
        h0 h0Var = h0.f765a;
        return new b[]{n1Var, h0Var, n1Var, n1Var, n1Var, n1Var, h0Var, o0.f794a, n1Var, h.f763a, n1Var};
    }

    @Override // we.a
    public PaywallBackendEvent deserialize(e eVar) {
        String strM;
        boolean z10;
        String str;
        int i10;
        String str2;
        int i11;
        long j10;
        int i12;
        String str3;
        String str4;
        String str5;
        String str6;
        r.f(eVar, "decoder");
        f descriptor2 = getDescriptor();
        c cVarC = eVar.c(descriptor2);
        int i13 = 0;
        if (cVarC.x()) {
            String strM2 = cVarC.m(descriptor2, 0);
            int iO = cVarC.o(descriptor2, 1);
            String strM3 = cVarC.m(descriptor2, 2);
            String strM4 = cVarC.m(descriptor2, 3);
            String strM5 = cVarC.m(descriptor2, 4);
            String strM6 = cVarC.m(descriptor2, 5);
            int iO2 = cVarC.o(descriptor2, 6);
            long jT = cVarC.t(descriptor2, 7);
            String strM7 = cVarC.m(descriptor2, 8);
            boolean zG = cVarC.g(descriptor2, 9);
            str = strM2;
            strM = cVarC.m(descriptor2, 10);
            z10 = zG;
            str2 = strM7;
            i12 = iO2;
            str4 = strM6;
            str5 = strM4;
            str6 = strM5;
            str3 = strM3;
            i11 = iO;
            j10 = jT;
            i10 = 2047;
        } else {
            String strM8 = null;
            String strM9 = null;
            String strM10 = null;
            String strM11 = null;
            String strM12 = null;
            String strM13 = null;
            boolean z11 = true;
            int iO3 = 0;
            int iO4 = 0;
            long jT2 = 0;
            String strM14 = null;
            boolean zG2 = false;
            while (z11) {
                int iZ = cVarC.z(descriptor2);
                switch (iZ) {
                    case -1:
                        z11 = false;
                        break;
                    case 0:
                        i13 |= 1;
                        strM8 = cVarC.m(descriptor2, 0);
                        continue;
                    case 1:
                        iO4 = cVarC.o(descriptor2, 1);
                        i13 |= 2;
                        continue;
                    case 2:
                        strM13 = cVarC.m(descriptor2, 2);
                        i13 |= 4;
                        break;
                    case 3:
                        strM11 = cVarC.m(descriptor2, 3);
                        i13 |= 8;
                        break;
                    case 4:
                        strM12 = cVarC.m(descriptor2, 4);
                        i13 |= 16;
                        break;
                    case 5:
                        strM10 = cVarC.m(descriptor2, 5);
                        i13 |= 32;
                        break;
                    case 6:
                        iO3 = cVarC.o(descriptor2, 6);
                        i13 |= 64;
                        break;
                    case 7:
                        jT2 = cVarC.t(descriptor2, 7);
                        i13 |= 128;
                        break;
                    case 8:
                        strM9 = cVarC.m(descriptor2, 8);
                        i13 |= 256;
                        break;
                    case 9:
                        zG2 = cVarC.g(descriptor2, 9);
                        i13 |= 512;
                        break;
                    case 10:
                        strM14 = cVarC.m(descriptor2, 10);
                        i13 |= 1024;
                        break;
                    default:
                        throw new j(iZ);
                }
            }
            strM = strM14;
            z10 = zG2;
            str = strM8;
            i10 = i13;
            str2 = strM9;
            i11 = iO4;
            j10 = jT2;
            String str7 = strM13;
            i12 = iO3;
            str3 = str7;
            String str8 = strM12;
            str4 = strM10;
            str5 = strM11;
            str6 = str8;
        }
        cVarC.d(descriptor2);
        return new PaywallBackendEvent(i10, str, i11, str3, str5, str6, str4, i12, j10, str2, z10, strM, null);
    }

    @Override // we.b, we.h, we.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // we.h
    public void serialize(ze.f fVar, PaywallBackendEvent paywallBackendEvent) {
        r.f(fVar, "encoder");
        r.f(paywallBackendEvent, "value");
        f descriptor2 = getDescriptor();
        d dVarC = fVar.c(descriptor2);
        PaywallBackendEvent.write$Self(paywallBackendEvent, dVarC, descriptor2);
        dVarC.d(descriptor2);
    }

    @Override // af.c0
    public b<?>[] typeParametersSerializers() {
        return c0.a.a(this);
    }
}
