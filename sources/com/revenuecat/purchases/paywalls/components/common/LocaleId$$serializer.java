package com.revenuecat.purchases.paywalls.components.common;

import ae.r;
import af.c0;
import af.d0;
import af.n1;
import we.b;
import ye.f;
import ze.e;

/* JADX INFO: loaded from: classes2.dex */
public final class LocaleId$$serializer implements c0<LocaleId> {
    public static final LocaleId$$serializer INSTANCE;
    private static final /* synthetic */ d0 descriptor;

    static {
        LocaleId$$serializer localeId$$serializer = new LocaleId$$serializer();
        INSTANCE = localeId$$serializer;
        d0 d0Var = new d0("com.revenuecat.purchases.paywalls.components.common.LocaleId", localeId$$serializer);
        d0Var.l("value", false);
        descriptor = d0Var;
    }

    private LocaleId$$serializer() {
    }

    @Override // af.c0
    public b<?>[] childSerializers() {
        return new b[]{n1.f790a};
    }

    @Override // we.a
    public /* bridge */ /* synthetic */ Object deserialize(e eVar) {
        return LocaleId.m34boximpl(m41deserialize8pYHj4M(eVar));
    }

    /* JADX INFO: renamed from: deserialize-8pYHj4M, reason: not valid java name */
    public String m41deserialize8pYHj4M(e eVar) {
        r.f(eVar, "decoder");
        return LocaleId.m35constructorimpl(eVar.F(getDescriptor()).s());
    }

    @Override // we.b, we.h, we.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // we.h
    public /* bridge */ /* synthetic */ void serialize(ze.f fVar, Object obj) {
        m42serialize64pKzr8(fVar, ((LocaleId) obj).m40unboximpl());
    }

    /* JADX INFO: renamed from: serialize-64pKzr8, reason: not valid java name */
    public void m42serialize64pKzr8(ze.f fVar, String str) {
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
