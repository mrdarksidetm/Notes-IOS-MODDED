package com.revenuecat.purchases.utils;

import ae.r;
import com.revenuecat.purchases.models.Period;
import com.revenuecat.purchases.models.Price;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class PriceExtensionsKt {
    private static final double MICRO_MULTIPLIER = 1000000.0d;

    public static final Price pricePerMonth(Price price, Period period, Locale locale) {
        r.f(price, "<this>");
        r.f(period, "billingPeriod");
        r.f(locale, "locale");
        return pricePerPeriod(price, period.getValueInMonths(), locale);
    }

    private static final Price pricePerPeriod(Price price, double d10, Locale locale) {
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(locale);
        currencyInstance.setCurrency(Currency.getInstance(price.getCurrencyCode()));
        double amountMicros = price.getAmountMicros() / d10;
        String str = currencyInstance.format(amountMicros / MICRO_MULTIPLIER);
        r.e(str, "formatted");
        return new Price(str, (long) amountMicros, price.getCurrencyCode());
    }

    public static final Price pricePerWeek(Price price, Period period, Locale locale) {
        r.f(price, "<this>");
        r.f(period, "billingPeriod");
        r.f(locale, "locale");
        return pricePerPeriod(price, period.getValueInWeeks$purchases_defaultsRelease(), locale);
    }

    public static final Price pricePerYear(Price price, Period period, Locale locale) {
        r.f(price, "<this>");
        r.f(period, "billingPeriod");
        r.f(locale, "locale");
        return pricePerPeriod(price, period.getValueInYears$purchases_defaultsRelease(), locale);
    }
}
