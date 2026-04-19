package com.revenuecat.purchases.models;

import com.revenuecat.purchases.PresentedOfferingContext;
import java.util.Iterator;
import java.util.List;
import nd.c0;

/* JADX INFO: loaded from: classes2.dex */
public interface SubscriptionOption {

    public static final class DefaultImpls {
        public static Period getBillingPeriod(SubscriptionOption subscriptionOption) {
            PricingPhase fullPricePhase = subscriptionOption.getFullPricePhase();
            if (fullPricePhase != null) {
                return fullPricePhase.getBillingPeriod();
            }
            return null;
        }

        public static PricingPhase getFreePhase(SubscriptionOption subscriptionOption) {
            Object next;
            Iterator it = c0.U(subscriptionOption.getPricingPhases(), 1).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((PricingPhase) next).getPrice().getAmountMicros() == 0) {
                    break;
                }
            }
            return (PricingPhase) next;
        }

        public static PricingPhase getFullPricePhase(SubscriptionOption subscriptionOption) {
            return (PricingPhase) c0.k0(subscriptionOption.getPricingPhases());
        }

        public static PricingPhase getIntroPhase(SubscriptionOption subscriptionOption) {
            Object next;
            Iterator it = c0.U(subscriptionOption.getPricingPhases(), 1).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((PricingPhase) next).getPrice().getAmountMicros() > 0) {
                    break;
                }
            }
            return (PricingPhase) next;
        }

        public static /* synthetic */ void getPresentedOfferingIdentifier$annotations() {
        }

        public static boolean isBasePlan(SubscriptionOption subscriptionOption) {
            return subscriptionOption.getPricingPhases().size() == 1;
        }

        public static boolean isPrepaid(SubscriptionOption subscriptionOption) {
            PricingPhase fullPricePhase = subscriptionOption.getFullPricePhase();
            return (fullPricePhase != null ? fullPricePhase.getRecurrenceMode() : null) == RecurrenceMode.NON_RECURRING;
        }
    }

    Period getBillingPeriod();

    PricingPhase getFreePhase();

    PricingPhase getFullPricePhase();

    String getId();

    InstallmentsInfo getInstallmentsInfo();

    PricingPhase getIntroPhase();

    PresentedOfferingContext getPresentedOfferingContext();

    String getPresentedOfferingIdentifier();

    List<PricingPhase> getPricingPhases();

    PurchasingData getPurchasingData();

    List<String> getTags();

    boolean isBasePlan();

    boolean isPrepaid();
}
