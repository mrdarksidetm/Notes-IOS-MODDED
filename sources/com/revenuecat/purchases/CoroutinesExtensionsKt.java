package com.revenuecat.purchases;

import ae.r;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import com.revenuecat.purchases.interfaces.GetCustomerCenterConfigCallback;
import md.t;
import md.u;
import qd.d;
import qd.i;
import rd.c;
import sd.f;

/* JADX INFO: loaded from: classes2.dex */
public final class CoroutinesExtensionsKt {
    @ExperimentalPreviewRevenueCatPurchasesAPI
    public static final /* synthetic */ Object awaitCustomerCenterConfigData(Purchases purchases, d dVar) {
        final i iVar = new i(c.c(dVar));
        purchases.getCustomerCenterConfigData$purchases_defaultsRelease(new GetCustomerCenterConfigCallback() { // from class: com.revenuecat.purchases.CoroutinesExtensionsKt$awaitCustomerCenterConfigData$2$1
            @Override // com.revenuecat.purchases.interfaces.GetCustomerCenterConfigCallback
            public void onError(PurchasesError purchasesError) {
                r.f(purchasesError, "error");
                d<CustomerCenterConfigData> dVar2 = iVar;
                t.a aVar = t.f15576b;
                dVar2.resumeWith(t.b(u.a(new PurchasesException(purchasesError))));
            }

            @Override // com.revenuecat.purchases.interfaces.GetCustomerCenterConfigCallback
            public void onSuccess(CustomerCenterConfigData customerCenterConfigData) {
                r.f(customerCenterConfigData, "customerCenterConfig");
                iVar.resumeWith(t.b(customerCenterConfigData));
            }
        });
        Object objA = iVar.a();
        if (objA == rd.d.e()) {
            f.c(dVar);
        }
        return objA;
    }

    public static final /* synthetic */ Object awaitCustomerInfo(Purchases purchases, CacheFetchPolicy cacheFetchPolicy, d dVar) {
        i iVar = new i(c.c(dVar));
        ListenerConversionsKt.getCustomerInfoWith(purchases, cacheFetchPolicy, new CoroutinesExtensionsKt$awaitCustomerInfo$2$2(iVar), new CoroutinesExtensionsKt$awaitCustomerInfo$2$1(iVar));
        Object objA = iVar.a();
        if (objA == rd.d.e()) {
            f.c(dVar);
        }
        return objA;
    }

    public static /* synthetic */ Object awaitCustomerInfo$default(Purchases purchases, CacheFetchPolicy cacheFetchPolicy, d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cacheFetchPolicy = CacheFetchPolicy.Companion.m12default();
        }
        return awaitCustomerInfo(purchases, cacheFetchPolicy, dVar);
    }

    public static final /* synthetic */ Object awaitLogIn(Purchases purchases, String str, d dVar) {
        i iVar = new i(c.c(dVar));
        ListenerConversionsKt.logInWith(purchases, str, new CoroutinesExtensionsKt$awaitLogIn$2$1(iVar), new CoroutinesExtensionsKt$awaitLogIn$2$2(iVar));
        Object objA = iVar.a();
        if (objA == rd.d.e()) {
            f.c(dVar);
        }
        return objA;
    }

    public static final /* synthetic */ Object awaitLogOut(Purchases purchases, d dVar) {
        i iVar = new i(c.c(dVar));
        ListenerConversionsKt.logOutWith(purchases, new CoroutinesExtensionsKt$awaitLogOut$2$1(iVar), new CoroutinesExtensionsKt$awaitLogOut$2$2(iVar));
        Object objA = iVar.a();
        if (objA == rd.d.e()) {
            f.c(dVar);
        }
        return objA;
    }

    public static final /* synthetic */ Object awaitSyncAttributesAndOfferingsIfNeeded(Purchases purchases, d dVar) {
        i iVar = new i(c.c(dVar));
        ListenerConversionsKt.syncAttributesAndOfferingsIfNeededWith(purchases, new CoroutinesExtensionsKt$awaitSyncAttributesAndOfferingsIfNeeded$2$2(iVar), new CoroutinesExtensionsKt$awaitSyncAttributesAndOfferingsIfNeeded$2$1(iVar));
        Object objA = iVar.a();
        if (objA == rd.d.e()) {
            f.c(dVar);
        }
        return objA;
    }

    public static final /* synthetic */ Object awaitSyncPurchases(Purchases purchases, d dVar) {
        i iVar = new i(c.c(dVar));
        ListenerConversionsKt.syncPurchasesWith(purchases, new CoroutinesExtensionsKt$awaitSyncPurchases$2$2(iVar), new CoroutinesExtensionsKt$awaitSyncPurchases$2$1(iVar));
        Object objA = iVar.a();
        if (objA == rd.d.e()) {
            f.c(dVar);
        }
        return objA;
    }

    public static final /* synthetic */ Object getAmazonLWAConsentStatus(Purchases purchases, d dVar) {
        i iVar = new i(c.c(dVar));
        ListenerConversionsKt.getAmazonLWAConsentStatusWith(purchases, new CoroutinesExtensionsKt$getAmazonLWAConsentStatus$2$2(iVar), new CoroutinesExtensionsKt$getAmazonLWAConsentStatus$2$1(iVar));
        Object objA = iVar.a();
        if (objA == rd.d.e()) {
            f.c(dVar);
        }
        return objA;
    }
}
