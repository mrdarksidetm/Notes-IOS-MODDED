package com.revenuecat.purchases;

import java.util.List;
import qd.d;
import qd.i;
import rd.c;
import sd.f;

/* JADX INFO: loaded from: classes2.dex */
public final class CoroutinesExtensionsCommonKt {
    public static final /* synthetic */ Object awaitGetProducts(Purchases purchases, List list, ProductType productType, d dVar) {
        i iVar = new i(c.c(dVar));
        ListenerConversionsCommonKt.getProductsWith(purchases, list, productType, new CoroutinesExtensionsCommonKt$awaitGetProducts$2$2(iVar), new CoroutinesExtensionsCommonKt$awaitGetProducts$2$1(iVar));
        Object objA = iVar.a();
        if (objA == rd.d.e()) {
            f.c(dVar);
        }
        return objA;
    }

    public static /* synthetic */ Object awaitGetProducts$default(Purchases purchases, List list, ProductType productType, d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            productType = null;
        }
        return awaitGetProducts(purchases, list, productType, dVar);
    }

    public static final /* synthetic */ Object awaitOfferings(Purchases purchases, d dVar) {
        i iVar = new i(c.c(dVar));
        ListenerConversionsCommonKt.getOfferingsWith(purchases, new CoroutinesExtensionsCommonKt$awaitOfferings$2$2(iVar), new CoroutinesExtensionsCommonKt$awaitOfferings$2$1(iVar));
        Object objA = iVar.a();
        if (objA == rd.d.e()) {
            f.c(dVar);
        }
        return objA;
    }

    public static final /* synthetic */ Object awaitPurchase(Purchases purchases, PurchaseParams purchaseParams, d dVar) {
        i iVar = new i(c.c(dVar));
        purchases.purchase(purchaseParams, ListenerConversionsCommonKt.purchaseCompletedCallback(new CoroutinesExtensionsCommonKt$awaitPurchase$2$1(iVar), new CoroutinesExtensionsCommonKt$awaitPurchase$2$2(iVar)));
        Object objA = iVar.a();
        if (objA == rd.d.e()) {
            f.c(dVar);
        }
        return objA;
    }

    public static final /* synthetic */ Object awaitRestore(Purchases purchases, d dVar) {
        i iVar = new i(c.c(dVar));
        ListenerConversionsCommonKt.restorePurchasesWith(purchases, new CoroutinesExtensionsCommonKt$awaitRestore$2$1(iVar), new CoroutinesExtensionsCommonKt$awaitRestore$2$2(iVar));
        Object objA = iVar.a();
        if (objA == rd.d.e()) {
            f.c(dVar);
        }
        return objA;
    }
}
