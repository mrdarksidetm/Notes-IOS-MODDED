package com.revenuecat.purchases.paywalls.components.common;

import ae.r;
import af.c0;
import af.d0;
import af.n1;
import we.b;
import ye.f;
import ze.e;

/* JADX INFO: loaded from: classes2.dex */
public final class LocalizationKey$$serializer implements c0<LocalizationKey> {
    public static final LocalizationKey$$serializer INSTANCE;
    private static final /* synthetic */ d0 descriptor;

    static {
        LocalizationKey$$serializer localizationKey$$serializer = new LocalizationKey$$serializer();
        INSTANCE = localizationKey$$serializer;
        d0 d0Var = new d0("com.revenuecat.purchases.paywalls.components.common.LocalizationKey", localizationKey$$serializer);
        d0Var.l("value", false);
        descriptor = d0Var;
    }

    private LocalizationKey$$serializer() {
    }

    @Override // af.c0
    public b<?>[] childSerializers() {
        return new b[]{n1.f790a};
    }

    @Override // we.a
    public /* bridge */ /* synthetic */ Object deserialize(e eVar) {
        return LocalizationKey.m61boximpl(m68deserialize4Zn71J0(eVar));
    }

    /* JADX INFO: renamed from: deserialize-4Zn71J0, reason: not valid java name */
    public String m68deserialize4Zn71J0(e eVar) {
        r.f(eVar, "decoder");
        return LocalizationKey.m62constructorimpl(eVar.F(getDescriptor()).s());
    }

    @Override // we.b, we.h, we.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // we.h
    public /* bridge */ /* synthetic */ void serialize(ze.f fVar, Object obj) {
        m69serialize7v81vok(fVar, ((LocalizationKey) obj).m67unboximpl());
    }

    /* JADX INFO: renamed from: serialize-7v81vok, reason: not valid java name */
    public void m69serialize7v81vok(ze.f fVar, String str) {
        r.f(fVar, "encoder");
        r.f(str, "value");
        ze.f fVarZ = fVar.z(getDescriptor());
        if (fVarZ == null) {
            return;
        }
        fVarZ.F(str);
    }

    @Override // af.c0
    public b<?>[] typeParametersSerializers() {
        return c0.a.a(this);
    }
}
