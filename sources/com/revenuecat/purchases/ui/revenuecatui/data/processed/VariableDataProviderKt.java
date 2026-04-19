package com.revenuecat.purchases.ui.revenuecatui.data.processed;

import ae.r;
import ce.c;
import com.revenuecat.purchases.models.Period;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.ui.revenuecatui.R;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import com.revenuecat.purchases.ui.revenuecatui.helpers.ResourceProvider;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class VariableDataProviderKt {
    private static final double MICRO_MULTIPLIER = 1000000.0d;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean endsIn00Cents(Price price) {
        double d10 = 100;
        return ((((double) Math.round((((double) price.getAmountMicros()) / MICRO_MULTIPLIER) * d10)) / 100.0d) * d10) % d10 == 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getTruncatedFormatted(Price price, Locale locale) {
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(locale);
        currencyInstance.setCurrency(Currency.getInstance(price.getCurrencyCode()));
        currencyInstance.setMaximumFractionDigits(0);
        String str = currencyInstance.format(price.getAmountMicros() / MICRO_MULTIPLIER);
        r.e(str, "numberFormat.format(amount)");
        return str;
    }

    static /* synthetic */ String getTruncatedFormatted$default(Price price, Locale locale, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            locale = Locale.getDefault();
            r.e(locale, "getDefault()");
        }
        return getTruncatedFormatted(price, locale);
    }

    public static final String localizedDiscount(TemplateConfiguration.PackageInfo packageInfo, ResourceProvider resourceProvider) {
        r.f(packageInfo, "<this>");
        r.f(resourceProvider, "resourceProvider");
        return localizedDiscount(resourceProvider, packageInfo.getDiscountRelativeToMostExpensivePerMonth());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String localizedDiscount(ResourceProvider resourceProvider, Double d10) {
        if (d10 == null) {
            return null;
        }
        return resourceProvider.getString(R.string.package_discount, Integer.valueOf(c.c(d10.doubleValue() * 100.0d)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Period normalizedMonths(Period period) {
        if (period.getUnit() != Period.Unit.YEAR) {
            return period;
        }
        int value = period.getValue() * 12;
        Period.Unit unit = Period.Unit.MONTH;
        StringBuilder sb2 = new StringBuilder();
        sb2.append('P');
        sb2.append(value);
        sb2.append('M');
        return new Period(value, unit, sb2.toString());
    }
}
