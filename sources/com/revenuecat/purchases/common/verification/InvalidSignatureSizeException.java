package com.revenuecat.purchases.common.verification;

import ae.r;

/* JADX INFO: loaded from: classes2.dex */
public final class InvalidSignatureSizeException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvalidSignatureSizeException(String str) {
        super(str);
        r.f(str, "message");
    }
}
