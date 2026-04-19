package com.revenuecat.purchases.hybridcommon.mappers;

import ae.r;
import com.amazon.a.a.o.b;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.amazon.AmazonStoreProduct;
import com.revenuecat.purchases.models.InstallmentsInfo;
import com.revenuecat.purchases.models.OfferPaymentMode;
import com.revenuecat.purchases.models.Period;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.PricingPhase;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.models.SubscriptionOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import md.q;
import md.s;
import md.x;
import nd.q0;
import nd.r0;
import nd.v;

/* JADX INFO: loaded from: classes2.dex */
public final class StoreProductMapperKt {
    private static final int DAYS_PER_WEEK = 7;
    private static final double MICROS_CONVERSION_METRIC = 1000000.0d;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ProductType.values().length];
            try {
                iArr[ProductType.INAPP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProductType.SUBS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProductType.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Period.Unit.values().length];
            try {
                iArr2[Period.Unit.DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[Period.Unit.WEEK.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[Period.Unit.MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[Period.Unit.YEAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[Period.Unit.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final Integer getGoogleFreeTrialCycles(StoreProduct storeProduct) {
        PricingPhase freePhase;
        r.f(storeProduct, "<this>");
        SubscriptionOption defaultOption = storeProduct.getDefaultOption();
        if (defaultOption == null || (freePhase = defaultOption.getFreePhase()) == null) {
            return null;
        }
        return freePhase.getBillingCycleCount();
    }

    public static final Period getGoogleFreeTrialPeriod(StoreProduct storeProduct) {
        PricingPhase freePhase;
        r.f(storeProduct, "<this>");
        SubscriptionOption defaultOption = storeProduct.getDefaultOption();
        if (defaultOption == null || (freePhase = defaultOption.getFreePhase()) == null) {
            return null;
        }
        return freePhase.getBillingPeriod();
    }

    private static final PricingPhase getGoogleIntroductoryPhase(StoreProduct storeProduct) {
        SubscriptionOption defaultOption = storeProduct.getDefaultOption();
        if (defaultOption != null) {
            return defaultOption.getIntroPhase();
        }
        return null;
    }

    public static final String getGoogleIntroductoryPrice(StoreProduct storeProduct) {
        Price price;
        r.f(storeProduct, "<this>");
        PricingPhase googleIntroductoryPhase = getGoogleIntroductoryPhase(storeProduct);
        if (googleIntroductoryPhase == null || (price = googleIntroductoryPhase.getPrice()) == null) {
            return null;
        }
        return price.getFormatted();
    }

    public static final long getGoogleIntroductoryPriceAmountMicros(StoreProduct storeProduct) {
        Price price;
        r.f(storeProduct, "<this>");
        PricingPhase googleIntroductoryPhase = getGoogleIntroductoryPhase(storeProduct);
        if (googleIntroductoryPhase == null || (price = googleIntroductoryPhase.getPrice()) == null) {
            return 0L;
        }
        return price.getAmountMicros();
    }

    public static final int getGoogleIntroductoryPriceCycles(StoreProduct storeProduct) {
        Integer billingCycleCount;
        r.f(storeProduct, "<this>");
        PricingPhase googleIntroductoryPhase = getGoogleIntroductoryPhase(storeProduct);
        if (googleIntroductoryPhase == null || (billingCycleCount = googleIntroductoryPhase.getBillingCycleCount()) == null) {
            return 0;
        }
        return billingCycleCount.intValue();
    }

    public static final Period getGoogleIntroductoryPricePeriod(StoreProduct storeProduct) {
        r.f(storeProduct, "<this>");
        PricingPhase googleIntroductoryPhase = getGoogleIntroductoryPhase(storeProduct);
        if (googleIntroductoryPhase != null) {
            return googleIntroductoryPhase.getBillingPeriod();
        }
        return null;
    }

    public static final long getPriceAmountMicros(StoreProduct storeProduct) {
        r.f(storeProduct, "<this>");
        return storeProduct.getPrice().getAmountMicros();
    }

    public static final String getPriceCurrencyCode(StoreProduct storeProduct) {
        r.f(storeProduct, "<this>");
        return storeProduct.getPrice().getCurrencyCode();
    }

    public static final String getPriceString(StoreProduct storeProduct) {
        r.f(storeProduct, "<this>");
        return storeProduct.getPrice().getFormatted();
    }

    public static final List<Map<String, Object>> map(List<? extends StoreProduct> list) {
        r.f(list, "<this>");
        ArrayList arrayList = new ArrayList(v.x(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(map((StoreProduct) it.next()));
        }
        return arrayList;
    }

    private static final Map<String, Object> map(InstallmentsInfo installmentsInfo) {
        return r0.h(x.a("commitmentPaymentsCount", Integer.valueOf(installmentsInfo.getCommitmentPaymentsCount())), x.a("renewalCommitmentPaymentsCount", Integer.valueOf(installmentsInfo.getRenewalCommitmentPaymentsCount())));
    }

    public static final Map<String, Object> map(StoreProduct storeProduct) {
        ArrayList arrayList;
        r.f(storeProduct, "<this>");
        s[] sVarArr = new s[21];
        sVarArr[0] = x.a("identifier", storeProduct.getId());
        sVarArr[1] = x.a(b.f7429c, storeProduct.getDescription());
        sVarArr[2] = x.a(b.S, storeProduct.getTitle());
        sVarArr[3] = x.a(b.f7450x, Double.valueOf(getPriceAmountMicros(storeProduct) / MICROS_CONVERSION_METRIC));
        sVarArr[4] = x.a("priceString", getPriceString(storeProduct));
        sVarArr[5] = x.a("currencyCode", getPriceCurrencyCode(storeProduct));
        sVarArr[6] = x.a("introPrice", mapIntroPrice(storeProduct));
        sVarArr[7] = x.a("discounts", null);
        Price pricePricePerWeek$default = StoreProduct.DefaultImpls.pricePerWeek$default(storeProduct, null, 1, null);
        sVarArr[8] = x.a("pricePerWeek", pricePricePerWeek$default != null ? Long.valueOf(pricePricePerWeek$default.getAmountMicros()) : null);
        Price pricePricePerMonth$default = StoreProduct.DefaultImpls.pricePerMonth$default(storeProduct, null, 1, null);
        sVarArr[9] = x.a("pricePerMonth", pricePricePerMonth$default != null ? Long.valueOf(pricePricePerMonth$default.getAmountMicros()) : null);
        Price pricePricePerYear$default = StoreProduct.DefaultImpls.pricePerYear$default(storeProduct, null, 1, null);
        sVarArr[10] = x.a("pricePerYear", pricePricePerYear$default != null ? Long.valueOf(pricePricePerYear$default.getAmountMicros()) : null);
        Price pricePricePerWeek$default2 = StoreProduct.DefaultImpls.pricePerWeek$default(storeProduct, null, 1, null);
        sVarArr[11] = x.a("pricePerWeekString", pricePricePerWeek$default2 != null ? pricePricePerWeek$default2.getFormatted() : null);
        Price pricePricePerMonth$default2 = StoreProduct.DefaultImpls.pricePerMonth$default(storeProduct, null, 1, null);
        sVarArr[12] = x.a("pricePerMonthString", pricePricePerMonth$default2 != null ? pricePricePerMonth$default2.getFormatted() : null);
        Price pricePricePerYear$default2 = StoreProduct.DefaultImpls.pricePerYear$default(storeProduct, null, 1, null);
        sVarArr[13] = x.a("pricePerYearString", pricePricePerYear$default2 != null ? pricePricePerYear$default2.getFormatted() : null);
        sVarArr[14] = x.a("productCategory", mapProductCategory(storeProduct).getValue());
        sVarArr[15] = x.a("productType", mapProductType(storeProduct));
        Period period = storeProduct.getPeriod();
        sVarArr[16] = x.a(b.f7441o, period != null ? period.getIso8601() : null);
        SubscriptionOption defaultOption = storeProduct.getDefaultOption();
        sVarArr[17] = x.a("defaultOption", defaultOption != null ? mapSubscriptionOption(defaultOption, storeProduct) : null);
        SubscriptionOptions subscriptionOptions = storeProduct.getSubscriptionOptions();
        if (subscriptionOptions != null) {
            arrayList = new ArrayList(v.x(subscriptionOptions, 10));
            Iterator<SubscriptionOption> it = subscriptionOptions.iterator();
            while (it.hasNext()) {
                arrayList.add(mapSubscriptionOption(it.next(), storeProduct));
            }
        } else {
            arrayList = null;
        }
        sVarArr[18] = x.a("subscriptionOptions", arrayList);
        PresentedOfferingContext presentedOfferingContext = storeProduct.getPresentedOfferingContext();
        sVarArr[19] = x.a("presentedOfferingIdentifier", presentedOfferingContext != null ? presentedOfferingContext.getOfferingIdentifier() : null);
        PresentedOfferingContext presentedOfferingContext2 = storeProduct.getPresentedOfferingContext();
        sVarArr[20] = x.a("presentedOfferingContext", presentedOfferingContext2 != null ? OfferingsMapperKt.map(presentedOfferingContext2) : null);
        return r0.h(sVarArr);
    }

    public static final Map<String, Object> mapIntroPrice(StoreProduct storeProduct) {
        Period googleIntroductoryPricePeriod;
        Map<String, Object> mapMapPeriodForStoreProduct;
        Map mapH;
        Map<String, Object> mapMapPeriodForStoreProduct2;
        r.f(storeProduct, "<this>");
        if (storeProduct instanceof AmazonStoreProduct) {
            AmazonStoreProduct amazonStoreProduct = (AmazonStoreProduct) storeProduct;
            Period freeTrialPeriod = amazonStoreProduct.getFreeTrialPeriod();
            if (freeTrialPeriod != null && (mapMapPeriodForStoreProduct2 = mapPeriodForStoreProduct(freeTrialPeriod)) != null) {
                s[] sVarArr = new s[4];
                sVarArr[0] = x.a(b.f7450x, 0);
                sVarArr[1] = x.a("priceString", MappersHelpersKt.formatUsingDeviceLocale(getPriceCurrencyCode(storeProduct), 0L));
                Period freeTrialPeriod2 = amazonStoreProduct.getFreeTrialPeriod();
                sVarArr[2] = x.a("period", freeTrialPeriod2 != null ? freeTrialPeriod2.getIso8601() : null);
                sVarArr[3] = x.a("cycles", 1);
                return r0.l(r0.h(sVarArr), mapMapPeriodForStoreProduct2);
            }
        } else if (getGoogleFreeTrialPeriod(storeProduct) != null) {
            Period googleFreeTrialPeriod = getGoogleFreeTrialPeriod(storeProduct);
            if (googleFreeTrialPeriod != null && (mapMapPeriodForStoreProduct = mapPeriodForStoreProduct(googleFreeTrialPeriod)) != null) {
                s[] sVarArr2 = new s[4];
                sVarArr2[0] = x.a(b.f7450x, 0);
                sVarArr2[1] = x.a("priceString", MappersHelpersKt.formatUsingDeviceLocale(getPriceCurrencyCode(storeProduct), 0L));
                Period googleFreeTrialPeriod2 = getGoogleFreeTrialPeriod(storeProduct);
                sVarArr2[2] = x.a("period", googleFreeTrialPeriod2 != null ? googleFreeTrialPeriod2.getIso8601() : null);
                Integer googleFreeTrialCycles = getGoogleFreeTrialCycles(storeProduct);
                sVarArr2[3] = x.a("cycles", Integer.valueOf(googleFreeTrialCycles != null ? googleFreeTrialCycles.intValue() : 1));
                mapH = r0.h(sVarArr2);
                return r0.l(mapH, mapMapPeriodForStoreProduct);
            }
        } else if (getGoogleIntroductoryPrice(storeProduct) != null && (googleIntroductoryPricePeriod = getGoogleIntroductoryPricePeriod(storeProduct)) != null && (mapMapPeriodForStoreProduct = mapPeriodForStoreProduct(googleIntroductoryPricePeriod)) != null) {
            s[] sVarArr3 = new s[4];
            sVarArr3[0] = x.a(b.f7450x, Double.valueOf(getGoogleIntroductoryPriceAmountMicros(storeProduct) / MICROS_CONVERSION_METRIC));
            sVarArr3[1] = x.a("priceString", getGoogleIntroductoryPrice(storeProduct));
            Period googleIntroductoryPricePeriod2 = getGoogleIntroductoryPricePeriod(storeProduct);
            sVarArr3[2] = x.a("period", googleIntroductoryPricePeriod2 != null ? googleIntroductoryPricePeriod2.getIso8601() : null);
            sVarArr3[3] = x.a("cycles", Integer.valueOf(getGoogleIntroductoryPriceCycles(storeProduct)));
            mapH = r0.h(sVarArr3);
            return r0.l(mapH, mapMapPeriodForStoreProduct);
        }
        return null;
    }

    private static final Map<String, Object> mapPeriod(Period period) {
        Map mapH;
        int i10 = WhenMappings.$EnumSwitchMapping$1[period.getUnit().ordinal()];
        if (i10 == 1) {
            mapH = r0.h(x.a("unit", "DAY"), x.a("value", Integer.valueOf(period.getValue())));
        } else if (i10 == 2) {
            mapH = r0.h(x.a("unit", "DAY"), x.a("value", Integer.valueOf(period.getValue() * 7)));
        } else if (i10 == 3) {
            mapH = r0.h(x.a("unit", "MONTH"), x.a("value", Integer.valueOf(period.getValue())));
        } else if (i10 == 4) {
            mapH = r0.h(x.a("unit", "YEAR"), x.a("value", Integer.valueOf(period.getValue())));
        } else {
            if (i10 != 5) {
                throw new q();
            }
            mapH = r0.h(x.a("unit", "DAY"), x.a("value", 0));
        }
        return r0.l(mapH, q0.c(x.a("iso8601", period.getIso8601())));
    }

    private static final Map<String, Object> mapPeriodForStoreProduct(Period period) {
        int i10 = WhenMappings.$EnumSwitchMapping$1[period.getUnit().ordinal()];
        if (i10 == 1) {
            return r0.h(x.a("periodUnit", "DAY"), x.a("periodNumberOfUnits", Integer.valueOf(period.getValue())));
        }
        if (i10 == 2) {
            return r0.h(x.a("periodUnit", "DAY"), x.a("periodNumberOfUnits", Integer.valueOf(period.getValue() * 7)));
        }
        if (i10 == 3) {
            return r0.h(x.a("periodUnit", "MONTH"), x.a("periodNumberOfUnits", Integer.valueOf(period.getValue())));
        }
        if (i10 == 4) {
            return r0.h(x.a("periodUnit", "YEAR"), x.a("periodNumberOfUnits", Integer.valueOf(period.getValue())));
        }
        if (i10 == 5) {
            return r0.h(x.a("periodUnit", "DAY"), x.a("periodNumberOfUnits", 0));
        }
        throw new q();
    }

    private static final Map<String, Object> mapPrice(Price price) {
        return r0.h(x.a("formatted", price.getFormatted()), x.a("amountMicros", Long.valueOf(price.getAmountMicros())), x.a("currencyCode", price.getCurrencyCode()));
    }

    private static final Map<String, Object> mapPricingPhase(PricingPhase pricingPhase) {
        s[] sVarArr = new s[5];
        Period billingPeriod = pricingPhase.getBillingPeriod();
        sVarArr[0] = x.a("billingPeriod", billingPeriod != null ? mapPeriod(billingPeriod) : null);
        sVarArr[1] = x.a("recurrenceMode", pricingPhase.getRecurrenceMode().getIdentifier());
        sVarArr[2] = x.a("billingCycleCount", pricingPhase.getBillingCycleCount());
        sVarArr[3] = x.a(b.f7450x, mapPrice(pricingPhase.getPrice()));
        OfferPaymentMode offerPaymentMode = pricingPhase.getOfferPaymentMode();
        sVarArr[4] = x.a("offerPaymentMode", offerPaymentMode != null ? offerPaymentMode.toString() : null);
        return r0.h(sVarArr);
    }

    public static final MappedProductCategory mapProductCategory(StoreProduct storeProduct) {
        r.f(storeProduct, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$0[storeProduct.getType().ordinal()];
        if (i10 == 1) {
            return MappedProductCategory.NON_SUBSCRIPTION;
        }
        if (i10 == 2) {
            return MappedProductCategory.SUBSCRIPTION;
        }
        if (i10 == 3) {
            return MappedProductCategory.UNKNOWN;
        }
        throw new q();
    }

    public static final String mapProductType(StoreProduct storeProduct) {
        r.f(storeProduct, "<this>");
        int i10 = WhenMappings.$EnumSwitchMapping$0[storeProduct.getType().ordinal()];
        if (i10 == 1) {
            return "CONSUMABLE";
        }
        if (i10 == 2) {
            SubscriptionOption defaultOption = storeProduct.getDefaultOption();
            return defaultOption != null && defaultOption.isPrepaid() ? "PREPAID_SUBSCRIPTION" : "AUTO_RENEWABLE_SUBSCRIPTION";
        }
        if (i10 == 3) {
            return "UNKNOWN";
        }
        throw new q();
    }

    private static final Map<String, Object> mapSubscriptionOption(SubscriptionOption subscriptionOption, StoreProduct storeProduct) {
        s[] sVarArr = new s[14];
        sVarArr[0] = x.a("id", subscriptionOption.getId());
        sVarArr[1] = x.a("storeProductId", storeProduct.getId());
        sVarArr[2] = x.a("productId", storeProduct.getPurchasingData().getProductId());
        List<PricingPhase> pricingPhases = subscriptionOption.getPricingPhases();
        ArrayList arrayList = new ArrayList(v.x(pricingPhases, 10));
        Iterator<T> it = pricingPhases.iterator();
        while (it.hasNext()) {
            arrayList.add(mapPricingPhase((PricingPhase) it.next()));
        }
        sVarArr[3] = x.a("pricingPhases", arrayList);
        sVarArr[4] = x.a("tags", subscriptionOption.getTags());
        sVarArr[5] = x.a("isBasePlan", Boolean.valueOf(subscriptionOption.isBasePlan()));
        Period billingPeriod = subscriptionOption.getBillingPeriod();
        sVarArr[6] = x.a("billingPeriod", billingPeriod != null ? mapPeriod(billingPeriod) : null);
        sVarArr[7] = x.a("isPrepaid", Boolean.valueOf(subscriptionOption.isPrepaid()));
        PricingPhase fullPricePhase = subscriptionOption.getFullPricePhase();
        sVarArr[8] = x.a("fullPricePhase", fullPricePhase != null ? mapPricingPhase(fullPricePhase) : null);
        PricingPhase freePhase = subscriptionOption.getFreePhase();
        sVarArr[9] = x.a("freePhase", freePhase != null ? mapPricingPhase(freePhase) : null);
        PricingPhase introPhase = subscriptionOption.getIntroPhase();
        sVarArr[10] = x.a("introPhase", introPhase != null ? mapPricingPhase(introPhase) : null);
        PresentedOfferingContext presentedOfferingContext = subscriptionOption.getPresentedOfferingContext();
        sVarArr[11] = x.a("presentedOfferingIdentifier", presentedOfferingContext != null ? presentedOfferingContext.getOfferingIdentifier() : null);
        PresentedOfferingContext presentedOfferingContext2 = subscriptionOption.getPresentedOfferingContext();
        sVarArr[12] = x.a("presentedOfferingContext", presentedOfferingContext2 != null ? OfferingsMapperKt.map(presentedOfferingContext2) : null);
        InstallmentsInfo installmentsInfo = subscriptionOption.getInstallmentsInfo();
        sVarArr[13] = x.a("installmentsInfo", installmentsInfo != null ? map(installmentsInfo) : null);
        return r0.h(sVarArr);
    }
}
