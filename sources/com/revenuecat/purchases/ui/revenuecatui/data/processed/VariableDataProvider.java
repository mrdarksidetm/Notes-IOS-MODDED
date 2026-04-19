package com.revenuecat.purchases.ui.revenuecatui.data.processed;

import ae.j;
import ae.r;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.PackageType;
import com.revenuecat.purchases.models.Period;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.PricingPhase;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.ui.revenuecatui.extensions.PackageExtensionsKt;
import com.revenuecat.purchases.ui.revenuecatui.extensions.PeriodExtensionsKt;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResourceProvider;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class VariableDataProvider {
    private final boolean preview;
    private final ResourceProvider resourceProvider;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PackageType.values().length];
            try {
                iArr[PackageType.LIFETIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PackageType.ANNUAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PackageType.SIX_MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PackageType.THREE_MONTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PackageType.TWO_MONTH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PackageType.MONTHLY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PackageType.WEEKLY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PackageType.UNKNOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[PackageType.CUSTOM.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public VariableDataProvider(ResourceProvider resourceProvider, boolean z10) {
        r.f(resourceProvider, "resourceProvider");
        this.resourceProvider = resourceProvider;
        this.preview = z10;
    }

    public /* synthetic */ VariableDataProvider(ResourceProvider resourceProvider, boolean z10, int i10, j jVar) {
        this(resourceProvider, (i10 & 2) != 0 ? false : z10);
    }

    private final PricingPhase getFirstIntroOfferToApply(Package r22) {
        PricingPhase freePhase;
        SubscriptionOption defaultOption = r22.getProduct().getDefaultOption();
        if (defaultOption != null && (freePhase = defaultOption.getFreePhase()) != null) {
            return freePhase;
        }
        if (defaultOption != null) {
            return defaultOption.getIntroPhase();
        }
        return null;
    }

    private final PricingPhase getSecondIntroOfferToApply(Package r32) {
        SubscriptionOption defaultOption = r32.getProduct().getDefaultOption();
        if ((defaultOption != null ? defaultOption.getFreePhase() : null) != null) {
            return defaultOption.getIntroPhase();
        }
        return null;
    }

    public final String firstIntroductoryOfferDuration(Package r32, Locale locale) {
        Period billingPeriod;
        r.f(r32, "rcPackage");
        r.f(locale, "locale");
        PricingPhase firstIntroOfferToApply = getFirstIntroOfferToApply(r32);
        if (firstIntroOfferToApply == null || (billingPeriod = firstIntroOfferToApply.getBillingPeriod()) == null) {
            return null;
        }
        return PeriodExtensionsKt.localizedPeriod$default(billingPeriod, locale, null, 2, null);
    }

    public final String getApplicationName() {
        return !this.preview ? this.resourceProvider.getApplicationName() : "Application Name";
    }

    public final String localizedFirstIntroductoryOfferPrice(Package r22, Locale locale, boolean z10) {
        Price price;
        r.f(r22, "rcPackage");
        r.f(locale, "locale");
        PricingPhase firstIntroOfferToApply = getFirstIntroOfferToApply(r22);
        if (firstIntroOfferToApply == null || (price = firstIntroOfferToApply.getPrice()) == null) {
            return null;
        }
        return (z10 && VariableDataProviderKt.endsIn00Cents(price)) ? VariableDataProviderKt.getTruncatedFormatted(price, locale) : price.getFormatted();
    }

    public final String localizedPrice(Package r22, Locale locale, boolean z10) {
        r.f(r22, "rcPackage");
        r.f(locale, "locale");
        return (z10 && VariableDataProviderKt.endsIn00Cents(r22.getProduct().getPrice())) ? VariableDataProviderKt.getTruncatedFormatted(r22.getProduct().getPrice(), locale) : r22.getProduct().getPrice().getFormatted();
    }

    public final String localizedPriceAndPerMonth(Package r52, Locale locale, boolean z10) {
        r.f(r52, "rcPackage");
        r.f(locale, "locale");
        if (!PackageExtensionsKt.isSubscription(r52) || PackageExtensionsKt.isMonthly(r52)) {
            return localizedPricePerPeriod(r52, locale, z10);
        }
        String strLocalizedAbbreviatedPeriod = PeriodExtensionsKt.localizedAbbreviatedPeriod(new Period(1, Period.Unit.MONTH, "P1M"), locale);
        return localizedPricePerPeriod(r52, locale, z10) + " (" + localizedPricePerMonth(r52, locale, z10) + '/' + strLocalizedAbbreviatedPeriod + ')';
    }

    public final String localizedPriceAndPerMonthFull(Package r52, Locale locale, boolean z10) {
        r.f(r52, "rcPackage");
        r.f(locale, "locale");
        if (!PackageExtensionsKt.isSubscription(r52) || PackageExtensionsKt.isMonthly(r52)) {
            return localizedPricePerPeriodFull(r52, locale, z10);
        }
        String strLocalizedUnitPeriod = PeriodExtensionsKt.localizedUnitPeriod(new Period(1, Period.Unit.MONTH, "P1M"), locale);
        return localizedPricePerPeriodFull(r52, locale, z10) + " (" + localizedPricePerMonth(r52, locale, z10) + '/' + strLocalizedUnitPeriod + ')';
    }

    public final String localizedPricePerMonth(Package r22, Locale locale, boolean z10) {
        r.f(r22, "rcPackage");
        r.f(locale, "locale");
        Price pricePricePerMonth = r22.getProduct().pricePerMonth(locale);
        if (pricePricePerMonth == null) {
            return null;
        }
        return (z10 && VariableDataProviderKt.endsIn00Cents(pricePricePerMonth)) ? VariableDataProviderKt.getTruncatedFormatted(pricePricePerMonth, locale) : pricePricePerMonth.getFormatted();
    }

    public final String localizedPricePerPeriod(Package r22, Locale locale, boolean z10) {
        r.f(r22, "rcPackage");
        r.f(locale, "locale");
        String strLocalizedPrice = localizedPrice(r22, locale, z10);
        Period period = r22.getProduct().getPeriod();
        if (period == null) {
            return strLocalizedPrice;
        }
        String str = strLocalizedPrice + '/' + PeriodExtensionsKt.localizedAbbreviatedPeriod(period, locale);
        return str == null ? strLocalizedPrice : str;
    }

    public final String localizedPricePerPeriodFull(Package r22, Locale locale, boolean z10) {
        r.f(r22, "rcPackage");
        r.f(locale, "locale");
        String strLocalizedPrice = localizedPrice(r22, locale, z10);
        Period period = r22.getProduct().getPeriod();
        if (period == null) {
            return strLocalizedPrice;
        }
        String str = strLocalizedPrice + '/' + PeriodExtensionsKt.localizedUnitPeriod(period, locale);
        return str == null ? strLocalizedPrice : str;
    }

    public final String localizedPricePerWeek(Package r22, Locale locale, boolean z10) {
        r.f(r22, "rcPackage");
        r.f(locale, "locale");
        Price pricePricePerWeek = r22.getProduct().pricePerWeek(locale);
        if (pricePricePerWeek == null) {
            return null;
        }
        return (z10 && VariableDataProviderKt.endsIn00Cents(pricePricePerWeek)) ? VariableDataProviderKt.getTruncatedFormatted(pricePricePerWeek, locale) : pricePricePerWeek.getFormatted();
    }

    public final String localizedRelativeDiscount(Double d10) {
        return VariableDataProviderKt.localizedDiscount(this.resourceProvider, d10);
    }

    public final String localizedSecondIntroductoryOfferPrice(Package r22, Locale locale, boolean z10) {
        Price price;
        r.f(r22, "rcPackage");
        r.f(locale, "locale");
        PricingPhase secondIntroOfferToApply = getSecondIntroOfferToApply(r22);
        if (secondIntroOfferToApply == null || (price = secondIntroOfferToApply.getPrice()) == null) {
            return null;
        }
        return (z10 && VariableDataProviderKt.endsIn00Cents(price)) ? VariableDataProviderKt.getTruncatedFormatted(price, locale) : price.getFormatted();
    }

    public final String periodLength(Package r22, Locale locale) {
        r.f(r22, "rcPackage");
        r.f(locale, "locale");
        Period period = r22.getProduct().getPeriod();
        if (period != null) {
            return PeriodExtensionsKt.localizedUnitPeriod(period, locale);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String periodName(com.revenuecat.purchases.Package r3) {
        /*
            r2 = this;
            java.lang.String r0 = "rcPackage"
            ae.r.f(r3, r0)
            com.revenuecat.purchases.PackageType r0 = r3.getPackageType()
            com.revenuecat.purchases.PackageType r1 = com.revenuecat.purchases.PackageType.CUSTOM
            if (r0 == r1) goto L56
            com.revenuecat.purchases.PackageType r0 = r3.getPackageType()
            com.revenuecat.purchases.PackageType r1 = com.revenuecat.purchases.PackageType.UNKNOWN
            if (r0 != r1) goto L16
            goto L56
        L16:
            com.revenuecat.purchases.PackageType r3 = r3.getPackageType()
            int[] r0 = com.revenuecat.purchases.ui.revenuecatui.data.processed.VariableDataProvider.WhenMappings.$EnumSwitchMapping$0
            int r3 = r3.ordinal()
            r3 = r0[r3]
            r0 = 0
            switch(r3) {
                case 1: goto L40;
                case 2: goto L3d;
                case 3: goto L3a;
                case 4: goto L37;
                case 5: goto L34;
                case 6: goto L31;
                case 7: goto L2e;
                case 8: goto L2c;
                case 9: goto L2c;
                default: goto L26;
            }
        L26:
            md.q r3 = new md.q
            r3.<init>()
            throw r3
        L2c:
            r3 = r0
            goto L46
        L2e:
            int r3 = com.revenuecat.purchases.ui.revenuecatui.R.string.weekly
            goto L42
        L31:
            int r3 = com.revenuecat.purchases.ui.revenuecatui.R.string.monthly
            goto L42
        L34:
            int r3 = com.revenuecat.purchases.ui.revenuecatui.R.string.bimonthly
            goto L42
        L37:
            int r3 = com.revenuecat.purchases.ui.revenuecatui.R.string.quarter
            goto L42
        L3a:
            int r3 = com.revenuecat.purchases.ui.revenuecatui.R.string.semester
            goto L42
        L3d:
            int r3 = com.revenuecat.purchases.ui.revenuecatui.R.string.annual
            goto L42
        L40:
            int r3 = com.revenuecat.purchases.ui.revenuecatui.R.string.lifetime
        L42:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
        L46:
            if (r3 == 0) goto L55
            int r3 = r3.intValue()
            com.revenuecat.purchases.ui.revenuecatui.helpers.ResourceProvider r0 = r2.resourceProvider
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r0 = r0.getString(r3, r1)
        L55:
            return r0
        L56:
            java.lang.String r3 = r3.getIdentifier()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.data.processed.VariableDataProvider.periodName(com.revenuecat.purchases.Package):java.lang.String");
    }

    public final String periodNameAbbreviation(Package r22, Locale locale) {
        r.f(r22, "rcPackage");
        r.f(locale, "locale");
        Period period = r22.getProduct().getPeriod();
        if (period != null) {
            return PeriodExtensionsKt.localizedAbbreviatedPeriod(period, locale);
        }
        return null;
    }

    public final String productName(Package r22) {
        r.f(r22, "rcPackage");
        return r22.getProduct().getName();
    }

    public final String secondIntroductoryOfferDuration(Package r32, Locale locale) {
        Period billingPeriod;
        r.f(r32, "rcPackage");
        r.f(locale, "locale");
        PricingPhase secondIntroOfferToApply = getSecondIntroOfferToApply(r32);
        if (secondIntroOfferToApply == null || (billingPeriod = secondIntroOfferToApply.getBillingPeriod()) == null) {
            return null;
        }
        return PeriodExtensionsKt.localizedPeriod$default(billingPeriod, locale, null, 2, null);
    }

    public final String subscriptionDuration(Package r42, Locale locale) {
        String strLocalizedPeriod$default;
        r.f(r42, "rcPackage");
        r.f(locale, "locale");
        Period period = r42.getProduct().getPeriod();
        return (period == null || (strLocalizedPeriod$default = PeriodExtensionsKt.localizedPeriod$default(period, locale, null, 2, null)) == null) ? periodName(r42) : strLocalizedPeriod$default;
    }

    public final String subscriptionDurationInMonths(Package r42, Locale locale) {
        Period periodNormalizedMonths;
        String strLocalizedPeriod$default;
        r.f(r42, "rcPackage");
        r.f(locale, "locale");
        Period period = r42.getProduct().getPeriod();
        return (period == null || (periodNormalizedMonths = VariableDataProviderKt.normalizedMonths(period)) == null || (strLocalizedPeriod$default = PeriodExtensionsKt.localizedPeriod$default(periodNormalizedMonths, locale, null, 2, null)) == null) ? periodName(r42) : strLocalizedPeriod$default;
    }
}
