package com.revenuecat.purchases.google;

import ae.r;
import com.android.billingclient.api.h;
import com.revenuecat.purchases.models.GoogleInstallmentsInfo;
import com.revenuecat.purchases.models.GoogleSubscriptionOption;
import java.util.ArrayList;
import java.util.List;
import nd.c0;
import nd.v;

/* JADX INFO: loaded from: classes2.dex */
public final class SubscriptionOptionConversionsKt {
    private static final GoogleInstallmentsInfo getInstallmentsInfo(h.a aVar) {
        return new GoogleInstallmentsInfo(aVar.a(), aVar.b());
    }

    public static final String getSubscriptionBillingPeriod(h.e eVar) {
        r.f(eVar, "<this>");
        List<h.c> listA = eVar.f().a();
        r.e(listA, "this.pricingPhases.pricingPhaseList");
        h.c cVar = (h.c) c0.k0(listA);
        if (cVar != null) {
            return cVar.b();
        }
        return null;
    }

    public static final boolean isBasePlan(h.e eVar) {
        r.f(eVar, "<this>");
        return eVar.f().a().size() == 1;
    }

    public static final GoogleSubscriptionOption toSubscriptionOption(h.e eVar, String str, h hVar) {
        r.f(eVar, "<this>");
        r.f(str, "productId");
        r.f(hVar, "productDetails");
        List<h.c> listA = eVar.f().a();
        r.e(listA, "pricingPhases.pricingPhaseList");
        ArrayList arrayList = new ArrayList(v.x(listA, 10));
        for (h.c cVar : listA) {
            r.e(cVar, "it");
            arrayList.add(PricingPhaseConversionsKt.toRevenueCatPricingPhase(cVar));
        }
        String strA = eVar.a();
        r.e(strA, "basePlanId");
        String strC = eVar.c();
        List<String> listD = eVar.d();
        r.e(listD, "offerTags");
        String strE = eVar.e();
        r.e(strE, "offerToken");
        h.a aVarB = eVar.b();
        return new GoogleSubscriptionOption(str, strA, strC, arrayList, listD, hVar, strE, null, aVarB != null ? getInstallmentsInfo(aVarB) : null);
    }
}
