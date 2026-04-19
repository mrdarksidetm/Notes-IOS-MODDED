package com.revenuecat.purchases.ui.revenuecatui.components.state;

import ae.r;
import ae.s;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.models.StoreProduct;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
final class PackageContext$VariableContext$Companion$mostExpensivePricePerMonthMicros$1 extends s implements l<Package, StoreProduct> {
    public static final PackageContext$VariableContext$Companion$mostExpensivePricePerMonthMicros$1 INSTANCE = new PackageContext$VariableContext$Companion$mostExpensivePricePerMonthMicros$1();

    PackageContext$VariableContext$Companion$mostExpensivePricePerMonthMicros$1() {
        super(1);
    }

    @Override // zd.l
    public final StoreProduct invoke(Package r22) {
        r.f(r22, "pkg");
        return r22.getProduct();
    }
}
