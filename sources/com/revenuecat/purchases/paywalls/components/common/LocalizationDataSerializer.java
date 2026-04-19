package com.revenuecat.purchases.paywalls.components.common;

import ae.r;
import com.revenuecat.purchases.paywalls.components.common.LocalizationData;
import we.b;
import we.g;
import ye.d;
import ye.f;
import ye.i;
import ze.e;

/* JADX INFO: loaded from: classes2.dex */
final class LocalizationDataSerializer implements b<LocalizationData> {
    public static final LocalizationDataSerializer INSTANCE = new LocalizationDataSerializer();
    private static final f descriptor = i.c("LocalizationData", d.a.f23978a, new f[0], null, 8, null);

    private LocalizationDataSerializer() {
    }

    public static /* synthetic */ void getDescriptor$annotations() {
    }

    @Override // we.a
    public LocalizationData deserialize(e eVar) {
        r.f(eVar, "decoder");
        try {
            return (LocalizationData) eVar.v(LocalizationData.Text.Companion.serializer());
        } catch (g unused) {
            return (LocalizationData) eVar.v(LocalizationData.Image.Companion.serializer());
        }
    }

    @Override // we.b, we.h, we.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // we.h
    public void serialize(ze.f fVar, LocalizationData localizationData) {
        r.f(fVar, "encoder");
        r.f(localizationData, "value");
        throw new IllegalStateException("Serialization is not implemented as it is not (yet) needed.".toString());
    }
}
