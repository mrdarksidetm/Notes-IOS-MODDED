package com.revenuecat.purchases.amazon;

import ae.r;
import com.revenuecat.purchases.models.StoreProduct;

/* JADX INFO: loaded from: classes2.dex */
public final class AmazonStoreProductKt {
    public static final AmazonStoreProduct getAmazonProduct(StoreProduct storeProduct) {
        r.f(storeProduct, "<this>");
        if (storeProduct instanceof AmazonStoreProduct) {
            return (AmazonStoreProduct) storeProduct;
        }
        return null;
    }
}
