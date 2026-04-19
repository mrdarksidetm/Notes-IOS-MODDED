package com.revenuecat.purchases.ui.revenuecatui.data;

import ae.j;
import ae.r;
import com.revenuecat.purchases.CacheFetchPolicy;
import com.revenuecat.purchases.CoroutinesExtensionsCommonKt;
import com.revenuecat.purchases.CoroutinesExtensionsKt;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.Offerings;
import com.revenuecat.purchases.PurchaseParams;
import com.revenuecat.purchases.PurchaseResult;
import com.revenuecat.purchases.Purchases;
import com.revenuecat.purchases.PurchasesAreCompletedBy;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.paywalls.events.PaywallEvent;
import qd.d;

/* JADX INFO: loaded from: classes2.dex */
public final class PurchasesImpl implements PurchasesType {
    private final Purchases purchases;

    public PurchasesImpl() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public PurchasesImpl(Purchases purchases) {
        r.f(purchases, "purchases");
        this.purchases = purchases;
    }

    public /* synthetic */ PurchasesImpl(Purchases purchases, int i10, j jVar) {
        this((i10 & 1) != 0 ? Purchases.Companion.getSharedInstance() : purchases);
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PurchasesType
    public Object awaitCustomerCenterConfigData(d<? super CustomerCenterConfigData> dVar) {
        return CoroutinesExtensionsKt.awaitCustomerCenterConfigData(this.purchases, dVar);
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PurchasesType
    public Object awaitCustomerInfo(CacheFetchPolicy cacheFetchPolicy, d<? super CustomerInfo> dVar) {
        return CoroutinesExtensionsKt.awaitCustomerInfo(this.purchases, cacheFetchPolicy, dVar);
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PurchasesType
    public Object awaitOfferings(d<? super Offerings> dVar) {
        return CoroutinesExtensionsCommonKt.awaitOfferings(this.purchases, dVar);
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PurchasesType
    public Object awaitPurchase(PurchaseParams.Builder builder, d<? super PurchaseResult> dVar) {
        return CoroutinesExtensionsCommonKt.awaitPurchase(this.purchases, builder.build(), dVar);
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PurchasesType
    public Object awaitRestore(d<? super CustomerInfo> dVar) {
        return CoroutinesExtensionsCommonKt.awaitRestore(this.purchases, dVar);
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PurchasesType
    public PurchasesAreCompletedBy getPurchasesAreCompletedBy() {
        return this.purchases.getPurchasesAreCompletedBy();
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PurchasesType
    public String getStorefrontCountryCode() {
        return this.purchases.getStorefrontCountryCode();
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PurchasesType
    public void syncPurchases() {
        Purchases.syncPurchases$default(this.purchases, null, 1, null);
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.data.PurchasesType
    public void track(PaywallEvent paywallEvent) {
        r.f(paywallEvent, "event");
        this.purchases.track(paywallEvent);
    }
}
