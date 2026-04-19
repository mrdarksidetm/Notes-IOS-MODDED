package com.revenuecat.purchases.utils;

import ae.j;
import ae.r;

/* JADX INFO: loaded from: classes2.dex */
public class SerializationException extends RuntimeException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SerializationException(String str, Throwable th) {
        super(str, th);
        r.f(str, "message");
    }

    public /* synthetic */ SerializationException(String str, Throwable th, int i10, j jVar) {
        this(str, (i10 & 2) != 0 ? null : th);
    }
}
