package com.revenuecat.purchases.common;

import ae.q;
import ae.r;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes2.dex */
public final class IntExtensionsKt {
    public static final int fromLittleEndianBytes(q qVar, byte[] bArr) {
        r.f(qVar, "<this>");
        r.f(bArr, "byteArray");
        return ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).getInt();
    }
}
