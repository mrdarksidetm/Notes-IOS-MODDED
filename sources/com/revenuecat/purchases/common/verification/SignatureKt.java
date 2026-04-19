package com.revenuecat.purchases.common.verification;

import com.revenuecat.purchases.common.verification.Signature;
import nd.o;

/* JADX INFO: loaded from: classes2.dex */
public final class SignatureKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final byte[] copyOf(byte[] bArr, Signature.Component component) {
        return o.m(bArr, component.getStartByte(), component.getEndByte());
    }
}
