package com.revenuecat.purchases.hybridcommon.mappers;

import ae.r;
import com.amazon.a.a.o.b;
import com.revenuecat.purchases.models.StoreTransaction;
import java.util.Date;
import java.util.Map;
import md.x;
import nd.c0;
import nd.r0;

/* JADX INFO: loaded from: classes2.dex */
public final class StoreTransactionMapperKt {
    public static final Map<String, Object> map(StoreTransaction storeTransaction) {
        r.f(storeTransaction, "<this>");
        return r0.h(x.a("transactionIdentifier", storeTransaction.getOrderId()), x.a("productIdentifier", c0.Y(storeTransaction.getProductIds())), x.a("purchaseDateMillis", Long.valueOf(storeTransaction.getPurchaseTime())), x.a(b.Q, MappersHelpersKt.toIso8601(new Date(storeTransaction.getPurchaseTime()))));
    }
}
