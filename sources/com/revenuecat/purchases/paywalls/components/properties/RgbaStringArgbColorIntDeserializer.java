package com.revenuecat.purchases.paywalls.components.properties;

import ae.q;
import ae.r;
import com.revenuecat.purchases.paywalls.ColorUtilsKt;
import we.b;
import xe.a;
import ye.f;
import ze.e;

/* JADX INFO: loaded from: classes2.dex */
final class RgbaStringArgbColorIntDeserializer implements b<Integer> {
    public static final RgbaStringArgbColorIntDeserializer INSTANCE = new RgbaStringArgbColorIntDeserializer();
    private static final f descriptor = a.v(q.f721a).getDescriptor();

    private RgbaStringArgbColorIntDeserializer() {
    }

    @Override // we.a
    public Integer deserialize(e eVar) {
        r.f(eVar, "decoder");
        return Integer.valueOf(ColorUtilsKt.parseRGBAColor(eVar.s()));
    }

    @Override // we.b, we.h, we.a
    public f getDescriptor() {
        return descriptor;
    }

    public void serialize(ze.f fVar, int i10) {
        r.f(fVar, "encoder");
        throw new IllegalStateException("Serialization is not implemented as it is not (yet) needed.".toString());
    }

    @Override // we.h
    public /* bridge */ /* synthetic */ void serialize(ze.f fVar, Object obj) {
        serialize(fVar, ((Number) obj).intValue());
    }
}
