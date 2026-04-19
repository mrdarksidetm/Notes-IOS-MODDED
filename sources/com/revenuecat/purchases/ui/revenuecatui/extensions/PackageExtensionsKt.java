package com.revenuecat.purchases.ui.revenuecatui.extensions;

import ae.r;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.models.Period;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.ui.revenuecatui.composables.IntroOfferEligibility;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;

/* JADX INFO: loaded from: classes2.dex */
public final class PackageExtensionsKt {
    public static final IntroOfferEligibility getIntroEligibility(Package r12) {
        r.f(r12, "<this>");
        SubscriptionOption defaultOption = r12.getProduct().getDefaultOption();
        if (defaultOption != null) {
            IntroOfferEligibility introOfferEligibility = defaultOption.isBasePlan() ? IntroOfferEligibility.INELIGIBLE : ((defaultOption.getFreePhase() == null || defaultOption.getIntroPhase() != null) && (defaultOption.getFreePhase() != null || defaultOption.getIntroPhase() == null)) ? IntroOfferEligibility.MULTIPLE_OFFERS_ELIGIBLE : IntroOfferEligibility.SINGLE_OFFER_ELIGIBLE;
            if (introOfferEligibility != null) {
                return introOfferEligibility;
            }
        }
        return IntroOfferEligibility.INELIGIBLE;
    }

    public static final IntroOfferEligibility getIntroEligibility(TemplateConfiguration.PackageInfo packageInfo) {
        r.f(packageInfo, "<this>");
        return getIntroEligibility(packageInfo.getRcPackage());
    }

    public static final boolean isMonthly(Package r42) {
        r.f(r42, "<this>");
        Period period = r42.getProduct().getPeriod();
        return period != null && period.getUnit() == Period.Unit.MONTH && period.getValue() == 1;
    }

    public static final boolean isSubscription(Package r12) {
        r.f(r12, "<this>");
        return r12.getProduct().getType() == ProductType.SUBS;
    }
}
