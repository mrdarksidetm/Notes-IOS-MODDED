package com.revenuecat.purchases.common;

import ae.r;
import com.revenuecat.purchases.models.GoogleReplacementMode;
import com.revenuecat.purchases.models.PricingPhase;
import java.util.Map;
import md.q;
import md.x;
import nd.r0;

/* JADX INFO: loaded from: classes2.dex */
public final class BackendKt {
    public static final String ATTRIBUTES_ERROR_RESPONSE_KEY = "attributes_error_response";
    public static final String ATTRIBUTE_ERRORS_KEY = "attribute_errors";

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GoogleReplacementMode.values().length];
            try {
                iArr[GoogleReplacementMode.WITHOUT_PRORATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GoogleReplacementMode.WITH_TIME_PRORATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GoogleReplacementMode.CHARGE_FULL_PRICE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GoogleReplacementMode.CHARGE_PRORATED_PRICE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[GoogleReplacementMode.DEFERRED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ void CustomerCenterCallback$annotations() {
    }

    public static /* synthetic */ void RedeemWebPurchaseCallback$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LegacyProrationMode getAsLegacyProrationMode(GoogleReplacementMode googleReplacementMode) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[googleReplacementMode.ordinal()];
        if (i10 == 1) {
            return LegacyProrationMode.IMMEDIATE_WITHOUT_PRORATION;
        }
        if (i10 == 2) {
            return LegacyProrationMode.IMMEDIATE_WITH_TIME_PRORATION;
        }
        if (i10 == 3) {
            return LegacyProrationMode.IMMEDIATE_AND_CHARGE_FULL_PRICE;
        }
        if (i10 == 4) {
            return LegacyProrationMode.IMMEDIATE_AND_CHARGE_PRORATED_PRICE;
        }
        if (i10 == 5) {
            return LegacyProrationMode.DEFERRED;
        }
        throw new q();
    }

    public static final Map<String, Object> toMap(PricingPhase pricingPhase) {
        r.f(pricingPhase, "<this>");
        return r0.h(x.a("billingPeriod", pricingPhase.getBillingPeriod().getIso8601()), x.a("billingCycleCount", pricingPhase.getBillingCycleCount()), x.a("recurrenceMode", pricingPhase.getRecurrenceMode().getIdentifier()), x.a("formattedPrice", pricingPhase.getPrice().getFormatted()), x.a("priceAmountMicros", Long.valueOf(pricingPhase.getPrice().getAmountMicros())), x.a("priceCurrencyCode", pricingPhase.getPrice().getCurrencyCode()));
    }
}
