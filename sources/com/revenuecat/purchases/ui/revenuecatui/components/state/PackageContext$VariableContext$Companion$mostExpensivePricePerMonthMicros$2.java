package com.revenuecat.purchases.ui.revenuecatui.components.state;

import ae.r;
import ae.s;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.StoreProduct;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
final class PackageContext$VariableContext$Companion$mostExpensivePricePerMonthMicros$2 extends s implements l<StoreProduct, Price> {
    public static final PackageContext$VariableContext$Companion$mostExpensivePricePerMonthMicros$2 INSTANCE = new PackageContext$VariableContext$Companion$mostExpensivePricePerMonthMicros$2();

    PackageContext$VariableContext$Companion$mostExpensivePricePerMonthMicros$2() {
        super(1);
    }

    @Override // zd.l
    public final Price invoke(StoreProduct storeProduct) {
        r.f(storeProduct, "product");
        return StoreProduct.DefaultImpls.pricePerMonth$default(storeProduct, null, 1, null);
    }
}
