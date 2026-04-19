package com.revenuecat.purchases.google;

import ae.r;
import com.amazon.a.a.o.c.a.b;
import com.android.billingclient.api.e;

/* JADX INFO: loaded from: classes2.dex */
public final class BillingResultExtensionsKt {
    public static final boolean isSuccessful(e eVar) {
        r.f(eVar, "<this>");
        return eVar.b() == 0;
    }

    public static final String toHumanReadableDescription(e eVar) {
        r.f(eVar, "<this>");
        return "DebugMessage: " + eVar.a() + ". ErrorCode: " + ErrorsKt.getBillingResponseCodeName(eVar.b()) + b.f7490a;
    }
}
