package io.objectbox.converter;

import id.a;
import id.b;
import id.c;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public class StringMapConverter implements PropertyConverter<Map<String, String>, byte[]> {
    private static final AtomicReference<c> cachedBuilder = new AtomicReference<>();

    @Override // io.objectbox.converter.PropertyConverter
    public byte[] convertToDatabaseValue(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        c andSet = cachedBuilder.getAndSet(null);
        if (andSet == null) {
            andSet = new c(new a(512), 3);
        }
        int iX = andSet.x();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getKey() == null || entry.getValue() == null) {
                throw new IllegalArgumentException("Map keys or values must not be null");
            }
            andSet.w(entry.getKey(), entry.getValue());
        }
        andSet.f(null, iX);
        ByteBuffer byteBufferH = andSet.h();
        byte[] bArr = new byte[byteBufferH.limit()];
        byteBufferH.get(bArr);
        if (byteBufferH.limit() <= 262144) {
            andSet.c();
            cachedBuilder.getAndSet(andSet);
        }
        return bArr;
    }

    @Override // io.objectbox.converter.PropertyConverter
    public Map<String, String> convertToEntityProperty(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        b.e eVarH = b.g(new a(bArr, bArr.length)).h();
        int iB = eVarH.b();
        b.d dVarF = eVarH.f();
        b.k kVarG = eVarH.g();
        HashMap map = new HashMap((int) ((((double) iB) / 0.75d) + 1.0d));
        for (int i10 = 0; i10 < iB; i10++) {
            map.put(dVarF.a(i10).toString(), kVarG.d(i10).i());
        }
        return map;
    }
}
