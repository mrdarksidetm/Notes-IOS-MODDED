package com.revenuecat.purchases.utils.serializers;

import ae.r;
import java.util.UUID;
import we.b;
import ye.e;
import ye.f;
import ye.i;

/* JADX INFO: loaded from: classes2.dex */
public final class UUIDSerializer implements b<UUID> {
    public static final UUIDSerializer INSTANCE = new UUIDSerializer();
    private static final f descriptor = i.a("UUID", e.i.f23987a);

    private UUIDSerializer() {
    }

    @Override // we.a
    public UUID deserialize(ze.e eVar) {
        r.f(eVar, "decoder");
        UUID uuidFromString = UUID.fromString(eVar.s());
        r.e(uuidFromString, "fromString(decoder.decodeString())");
        return uuidFromString;
    }

    @Override // we.b, we.h, we.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // we.h
    public void serialize(ze.f fVar, UUID uuid) {
        r.f(fVar, "encoder");
        r.f(uuid, "value");
        String string = uuid.toString();
        r.e(string, "value.toString()");
        fVar.F(string);
    }
}
