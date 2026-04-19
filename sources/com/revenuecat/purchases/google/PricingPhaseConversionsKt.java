package com.revenuecat.purchases.google;

import ae.r;
import com.android.billingclient.api.h;
import com.revenuecat.purchases.models.Period;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.PricingPhase;
import com.revenuecat.purchases.models.RecurrenceMode;
import com.revenuecat.purchases.models.RecurrenceModeKt;

/* JADX INFO: loaded from: classes2.dex */
public final class PricingPhaseConversionsKt {
    public static final PricingPhase toRevenueCatPricingPhase(h.c cVar) {
        r.f(cVar, "<this>");
        Period.Factory factory = Period.Factory;
        String strB = cVar.b();
        r.e(strB, "billingPeriod");
        Period periodCreate = factory.create(strB);
        RecurrenceMode recurrenceMode = RecurrenceModeKt.toRecurrenceMode(Integer.valueOf(cVar.f()));
        Integer numValueOf = Integer.valueOf(cVar.a());
        String strC = cVar.c();
        r.e(strC, "formattedPrice");
        long jD = cVar.d();
        String strE = cVar.e();
        r.e(strE, "priceCurrencyCode");
        return new PricingPhase(periodCreate, recurrenceMode, numValueOf, new Price(strC, jD, strE));
    }
}
