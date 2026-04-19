package com.revenuecat.purchases.ui.revenuecatui.data.processed;

import ae.r;
import ae.s;
import com.amazon.a.a.o.b;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Logger;
import ie.o;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import je.h;
import je.j;
import je.w;
import md.l;
import md.n;
import md.q;
import nd.c0;

/* JADX INFO: loaded from: classes2.dex */
public final class VariableProcessor {
    public static final VariableProcessor INSTANCE = new VariableProcessor();
    private static final j REGEX = new j("\\{\\{\\s[a-zA-Z0-9_]+\\s\\}\\}");

    public static final class PackageContext {
        public static final int $stable = 0;
        private final Double discountRelativeToMostExpensivePerMonth;
        private final boolean showZeroDecimalPlacePrices;

        public PackageContext(Double d10, boolean z10) {
            this.discountRelativeToMostExpensivePerMonth = d10;
            this.showZeroDecimalPlacePrices = z10;
        }

        public /* synthetic */ PackageContext(Double d10, boolean z10, int i10, ae.j jVar) {
            this(d10, (i10 & 2) != 0 ? false : z10);
        }

        public static /* synthetic */ PackageContext copy$default(PackageContext packageContext, Double d10, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                d10 = packageContext.discountRelativeToMostExpensivePerMonth;
            }
            if ((i10 & 2) != 0) {
                z10 = packageContext.showZeroDecimalPlacePrices;
            }
            return packageContext.copy(d10, z10);
        }

        public final Double component1() {
            return this.discountRelativeToMostExpensivePerMonth;
        }

        public final boolean component2() {
            return this.showZeroDecimalPlacePrices;
        }

        public final PackageContext copy(Double d10, boolean z10) {
            return new PackageContext(d10, z10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PackageContext)) {
                return false;
            }
            PackageContext packageContext = (PackageContext) obj;
            return r.b(this.discountRelativeToMostExpensivePerMonth, packageContext.discountRelativeToMostExpensivePerMonth) && this.showZeroDecimalPlacePrices == packageContext.showZeroDecimalPlacePrices;
        }

        public final Double getDiscountRelativeToMostExpensivePerMonth() {
            return this.discountRelativeToMostExpensivePerMonth;
        }

        public final boolean getShowZeroDecimalPlacePrices() {
            return this.showZeroDecimalPlacePrices;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3 */
        public int hashCode() {
            Double d10 = this.discountRelativeToMostExpensivePerMonth;
            int iHashCode = (d10 == null ? 0 : d10.hashCode()) * 31;
            boolean z10 = this.showZeroDecimalPlacePrices;
            ?? r12 = z10;
            if (z10) {
                r12 = 1;
            }
            return iHashCode + r12;
        }

        public String toString() {
            return "PackageContext(discountRelativeToMostExpensivePerMonth=" + this.discountRelativeToMostExpensivePerMonth + ", showZeroDecimalPlacePrices=" + this.showZeroDecimalPlacePrices + ')';
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    enum VariableName {
        APP_NAME("app_name"),
        PRICE(b.f7450x),
        PRICE_PER_PERIOD("price_per_period"),
        PRICE_PER_PERIOD_FULL("price_per_period_full"),
        TOTAL_PRICE_AND_PER_MONTH("total_price_and_per_month"),
        TOTAL_PRICE_AND_PER_MONTH_FULL("total_price_and_per_month_full"),
        PRODUCT_NAME("product_name"),
        SUB_PERIOD("sub_period"),
        SUB_PERIOD_LENGTH("sub_period_length"),
        SUB_PERIOD_ABBREVIATED("sub_period_abbreviated"),
        SUB_PRICE_PER_WEEK("sub_price_per_week"),
        SUB_PRICE_PER_MONTH("sub_price_per_month"),
        SUB_DURATION("sub_duration"),
        SUB_DURATION_IN_MONTHS("sub_duration_in_months"),
        SUB_OFFER_DURATION("sub_offer_duration"),
        SUB_OFFER_DURATION_2("sub_offer_duration_2"),
        SUB_OFFER_PRICE("sub_offer_price"),
        SUB_OFFER_PRICE_2("sub_offer_price_2"),
        SUB_RELATIVE_DISCOUNT("sub_relative_discount");

        private final String identifier;
        public static final Companion Companion = new Companion(null);
        private static final l<Map<String, VariableName>> valueMap$delegate = n.b(VariableProcessor$VariableName$Companion$valueMap$2.INSTANCE);

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(ae.j jVar) {
                this();
            }

            private final Map<String, VariableName> getValueMap() {
                return (Map) VariableName.valueMap$delegate.getValue();
            }

            public final VariableName valueOfIdentifier(String str) {
                r.f(str, "identifier");
                return getValueMap().get(str);
            }
        }

        VariableName(String str) {
            this.identifier = str;
        }

        public final String getIdentifier() {
            return this.identifier;
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VariableName.values().length];
            try {
                iArr[VariableName.APP_NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VariableName.PRICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VariableName.PRICE_PER_PERIOD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VariableName.PRICE_PER_PERIOD_FULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VariableName.TOTAL_PRICE_AND_PER_MONTH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[VariableName.TOTAL_PRICE_AND_PER_MONTH_FULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[VariableName.PRODUCT_NAME.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[VariableName.SUB_PERIOD.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[VariableName.SUB_PERIOD_LENGTH.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[VariableName.SUB_PERIOD_ABBREVIATED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[VariableName.SUB_PRICE_PER_WEEK.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[VariableName.SUB_PRICE_PER_MONTH.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[VariableName.SUB_DURATION.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[VariableName.SUB_DURATION_IN_MONTHS.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[VariableName.SUB_OFFER_DURATION.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[VariableName.SUB_OFFER_DURATION_2.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[VariableName.SUB_OFFER_PRICE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[VariableName.SUB_OFFER_PRICE_2.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[VariableName.SUB_RELATIVE_DISCOUNT.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.data.processed.VariableProcessor$validateVariables$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements zd.l<String, String> {
        final /* synthetic */ List<String> $errors;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(List<String> list) {
            super(1);
            this.$errors = list;
        }

        @Override // zd.l
        public final String invoke(String str) {
            r.f(str, "variable");
            if (VariableName.Companion.valueOfIdentifier(str) != null) {
                return null;
            }
            this.$errors.add(str);
            return null;
        }
    }

    private VariableProcessor() {
    }

    private final String handleVariablesAndReplace(String str, zd.l<? super String, String> lVar) {
        for (h hVar : c0.p0(o.v(j.c(REGEX, str, 0, 2, null)))) {
            String value = hVar.getValue();
            String strSubstring = value.substring(2, value.length() - 2);
            r.e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            String strInvoke = lVar.invoke(w.W0(strSubstring).toString());
            if (strInvoke != null) {
                str = w.w0(str, hVar.c(), strInvoke).toString();
            }
        }
        return str;
    }

    private final String processVariable(VariableName variableName, VariableDataProvider variableDataProvider, PackageContext packageContext, Package r52, Locale locale) {
        switch (WhenMappings.$EnumSwitchMapping$0[variableName.ordinal()]) {
            case 1:
                return variableDataProvider.getApplicationName();
            case 2:
                return variableDataProvider.localizedPrice(r52, locale, packageContext.getShowZeroDecimalPlacePrices());
            case 3:
                return variableDataProvider.localizedPricePerPeriod(r52, locale, packageContext.getShowZeroDecimalPlacePrices());
            case 4:
                return variableDataProvider.localizedPricePerPeriodFull(r52, locale, packageContext.getShowZeroDecimalPlacePrices());
            case 5:
                return variableDataProvider.localizedPriceAndPerMonth(r52, locale, packageContext.getShowZeroDecimalPlacePrices());
            case 6:
                return variableDataProvider.localizedPriceAndPerMonthFull(r52, locale, packageContext.getShowZeroDecimalPlacePrices());
            case 7:
                return variableDataProvider.productName(r52);
            case 8:
                return variableDataProvider.periodName(r52);
            case 9:
                return variableDataProvider.periodLength(r52, locale);
            case 10:
                return variableDataProvider.periodNameAbbreviation(r52, locale);
            case 11:
                return variableDataProvider.localizedPricePerWeek(r52, locale, packageContext.getShowZeroDecimalPlacePrices());
            case 12:
                return variableDataProvider.localizedPricePerMonth(r52, locale, packageContext.getShowZeroDecimalPlacePrices());
            case 13:
                return variableDataProvider.subscriptionDuration(r52, locale);
            case 14:
                return variableDataProvider.subscriptionDurationInMonths(r52, locale);
            case 15:
                return variableDataProvider.firstIntroductoryOfferDuration(r52, locale);
            case 16:
                return variableDataProvider.secondIntroductoryOfferDuration(r52, locale);
            case 17:
                return variableDataProvider.localizedFirstIntroductoryOfferPrice(r52, locale, packageContext.getShowZeroDecimalPlacePrices());
            case 18:
                return variableDataProvider.localizedSecondIntroductoryOfferPrice(r52, locale, packageContext.getShowZeroDecimalPlacePrices());
            case 19:
                return variableDataProvider.localizedRelativeDiscount(packageContext.getDiscountRelativeToMostExpensivePerMonth());
            default:
                throw new q();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String variableValue(VariableDataProvider variableDataProvider, PackageContext packageContext, String str, Package r11, Locale locale) {
        VariableName variableNameValueOfIdentifier = VariableName.Companion.valueOfIdentifier(str);
        if (variableNameValueOfIdentifier == null) {
            Logger.INSTANCE.e("Unknown variable: " + str);
            return null;
        }
        String strProcessVariable = processVariable(variableNameValueOfIdentifier, variableDataProvider, packageContext, r11, locale);
        if (strProcessVariable != null) {
            return strProcessVariable;
        }
        Logger.INSTANCE.w("Could not process value for variable '" + str + "' for package '" + r11.getIdentifier() + "'. Please check that the product for that package matches the requirements for that variable. Defaulting to empty string.");
        return "";
    }

    public final String processVariables(VariableDataProvider variableDataProvider, PackageContext packageContext, String str, Package r52, Locale locale) {
        r.f(variableDataProvider, "variableDataProvider");
        r.f(packageContext, "context");
        r.f(str, "originalString");
        r.f(r52, "rcPackage");
        r.f(locale, "locale");
        return handleVariablesAndReplace(str, new VariableProcessor$processVariables$resultString$1(variableDataProvider, packageContext, r52, locale));
    }

    public final Set<String> validateVariables(String str) {
        r.f(str, "originalString");
        ArrayList arrayList = new ArrayList();
        handleVariablesAndReplace(str, new AnonymousClass1(arrayList));
        return c0.H0(arrayList);
    }
}
