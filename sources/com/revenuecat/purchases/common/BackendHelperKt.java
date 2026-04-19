package com.revenuecat.purchases.common;

import ae.r;
import com.revenuecat.purchases.common.networking.HTTPResult;

/* JADX INFO: loaded from: classes2.dex */
public final class BackendHelperKt {
    public static final boolean isSuccessful(HTTPResult hTTPResult) {
        r.f(hTTPResult, "<this>");
        return hTTPResult.getResponseCode() < 300;
    }
}
