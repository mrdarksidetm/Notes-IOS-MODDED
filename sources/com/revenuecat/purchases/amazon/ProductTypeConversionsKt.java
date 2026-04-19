package com.revenuecat.purchases.amazon;

import ae.r;
import com.amazon.device.iap.model.ProductType;
import md.q;

/* JADX INFO: loaded from: classes2.dex */
public final class ProductTypeConversionsKt {

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProductType.values().length];
            try {
                iArr[ProductType.CONSUMABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProductType.ENTITLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProductType.SUBSCRIPTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final com.revenuecat.purchases.ProductType toRevenueCatProductType(ProductType productType) {
        r.f(productType, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$0[productType.ordinal()];
        if (i10 == 1 || i10 == 2) {
            return com.revenuecat.purchases.ProductType.INAPP;
        }
        if (i10 == 3) {
            return com.revenuecat.purchases.ProductType.SUBS;
        }
        throw new q();
    }
}
