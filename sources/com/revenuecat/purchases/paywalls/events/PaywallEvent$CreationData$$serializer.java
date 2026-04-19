package com.revenuecat.purchases.paywalls.events;

import ae.r;
import af.a1;
import af.c0;
import com.revenuecat.purchases.paywalls.events.PaywallEvent;
import com.revenuecat.purchases.utils.serializers.DateSerializer;
import com.revenuecat.purchases.utils.serializers.UUIDSerializer;
import java.util.Date;
import java.util.UUID;
import we.b;
import we.j;
import ye.f;
import ze.c;
import ze.d;
import ze.e;

/* JADX INFO: loaded from: classes2.dex */
public final class PaywallEvent$CreationData$$serializer implements c0<PaywallEvent.CreationData> {
    public static final PaywallEvent$CreationData$$serializer INSTANCE;
    private static final /* synthetic */ a1 descriptor;

    static {
        PaywallEvent$CreationData$$serializer paywallEvent$CreationData$$serializer = new PaywallEvent$CreationData$$serializer();
        INSTANCE = paywallEvent$CreationData$$serializer;
        a1 a1Var = new a1("com.revenuecat.purchases.paywalls.events.PaywallEvent.CreationData", paywallEvent$CreationData$$serializer, 2);
        a1Var.l("id", false);
        a1Var.l("date", false);
        descriptor = a1Var;
    }

    private PaywallEvent$CreationData$$serializer() {
    }

    @Override // af.c0
    public b<?>[] childSerializers() {
        return new b[]{UUIDSerializer.INSTANCE, DateSerializer.INSTANCE};
    }

    @Override // we.a
    public PaywallEvent.CreationData deserialize(e eVar) {
        Object objK;
        Object objK2;
        int i10;
        r.f(eVar, "decoder");
        f descriptor2 = getDescriptor();
        c cVarC = eVar.c(descriptor2);
        if (cVarC.x()) {
            objK = cVarC.k(descriptor2, 0, UUIDSerializer.INSTANCE, null);
            objK2 = cVarC.k(descriptor2, 1, DateSerializer.INSTANCE, null);
            i10 = 3;
        } else {
            objK = null;
            Object objK3 = null;
            int i11 = 0;
            boolean z10 = true;
            while (z10) {
                int iZ = cVarC.z(descriptor2);
                if (iZ == -1) {
                    z10 = false;
                } else if (iZ == 0) {
                    objK = cVarC.k(descriptor2, 0, UUIDSerializer.INSTANCE, objK);
                    i11 |= 1;
                } else {
                    if (iZ != 1) {
                        throw new j(iZ);
                    }
                    objK3 = cVarC.k(descriptor2, 1, DateSerializer.INSTANCE, objK3);
                    i11 |= 2;
                }
            }
            objK2 = objK3;
            i10 = i11;
        }
        cVarC.d(descriptor2);
        return new PaywallEvent.CreationData(i10, (UUID) objK, (Date) objK2, null);
    }

    @Override // we.b, we.h, we.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // we.h
    public void serialize(ze.f fVar, PaywallEvent.CreationData creationData) {
        r.f(fVar, "encoder");
        r.f(creationData, "value");
        f descriptor2 = getDescriptor();
        d dVarC = fVar.c(descriptor2);
        PaywallEvent.CreationData.write$Self(creationData, dVarC, descriptor2);
        dVarC.d(descriptor2);
    }

    @Override // af.c0
    public b<?>[] typeParametersSerializers() {
        return c0.a.a(this);
    }
}
