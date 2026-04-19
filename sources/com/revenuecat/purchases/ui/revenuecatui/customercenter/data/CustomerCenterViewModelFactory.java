package com.revenuecat.purchases.ui.revenuecatui.customercenter.data;

import ae.r;
import androidx.lifecycle.w;
import androidx.lifecycle.y;
import com.revenuecat.purchases.ui.revenuecatui.data.PurchasesType;
import q4.a;

/* JADX INFO: loaded from: classes2.dex */
public final class CustomerCenterViewModelFactory extends y.c {
    private final PurchasesType purchases;

    public CustomerCenterViewModelFactory(PurchasesType purchasesType) {
        r.f(purchasesType, "purchases");
        this.purchases = purchasesType;
    }

    @Override // androidx.lifecycle.y.c, androidx.lifecycle.y.b
    public <T extends w> T create(Class<T> cls) {
        r.f(cls, "modelClass");
        return new CustomerCenterViewModelImpl(this.purchases);
    }

    @Override // androidx.lifecycle.y.b
    public /* bridge */ /* synthetic */ w create(Class cls, a aVar) {
        return super.create(cls, aVar);
    }
}
