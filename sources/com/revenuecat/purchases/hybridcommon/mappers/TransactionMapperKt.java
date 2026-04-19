package com.revenuecat.purchases.hybridcommon.mappers;

import ae.r;
import com.amazon.a.a.o.b;
import com.revenuecat.purchases.models.Transaction;
import java.util.Map;
import md.x;
import nd.r0;

/* JADX INFO: loaded from: classes2.dex */
public final class TransactionMapperKt {
    public static final Map<String, Object> map(Transaction transaction) {
        r.f(transaction, "<this>");
        return r0.h(x.a("transactionIdentifier", transaction.getTransactionIdentifier()), x.a("revenueCatId", transaction.getTransactionIdentifier()), x.a("productIdentifier", transaction.getProductIdentifier()), x.a("productId", transaction.getProductIdentifier()), x.a("purchaseDateMillis", Long.valueOf(MappersHelpersKt.toMillis(transaction.getPurchaseDate()))), x.a(b.Q, MappersHelpersKt.toIso8601(transaction.getPurchaseDate())));
    }
}
