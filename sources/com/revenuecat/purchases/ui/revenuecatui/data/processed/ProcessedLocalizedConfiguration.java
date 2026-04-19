package com.revenuecat.purchases.ui.revenuecatui.data.processed;

import ae.j;
import ae.r;
import com.amazon.a.a.o.b;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.paywalls.PaywallData;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.VariableProcessor;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import nd.u;
import nd.v;

/* JADX INFO: loaded from: classes2.dex */
public final class ProcessedLocalizedConfiguration {
    public static final Companion Companion = new Companion(null);
    private final String callToAction;
    private final String callToActionWithIntroOffer;
    private final String callToActionWithMultipleIntroOffers;
    private final List<PaywallData.LocalizedConfiguration.Feature> features;
    private final String offerBadge;
    private final String offerDetails;
    private final String offerDetailsWithIntroOffer;
    private final String offerDetailsWithMultipleIntroOffers;
    private final String offerName;
    private final String subtitle;
    private final String tierName;
    private final String title;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        private static final String create$processVariables(String str, VariableDataProvider variableDataProvider, VariableProcessor.PackageContext packageContext, Package r92, Locale locale) {
            return VariableProcessor.INSTANCE.processVariables(variableDataProvider, packageContext, str, r92, locale);
        }

        public final ProcessedLocalizedConfiguration create(VariableDataProvider variableDataProvider, VariableProcessor.PackageContext packageContext, PaywallData.LocalizedConfiguration localizedConfiguration, Package r29, Locale locale) {
            String str;
            String offerDetails;
            String offerDetailsWithIntroOffer;
            String offerDetailsWithMultipleIntroOffers;
            String offerName;
            String offerBadge;
            r.f(variableDataProvider, "variableDataProvider");
            r.f(packageContext, "context");
            r.f(localizedConfiguration, "localizedConfiguration");
            r.f(r29, "rcPackage");
            r.f(locale, "locale");
            PaywallData.LocalizedConfiguration.OfferOverride offerOverride = localizedConfiguration.getOfferOverrides().get(r29.getIdentifier());
            if (offerOverride == null || (offerBadge = offerOverride.getOfferBadge()) == null || (strLocalizedRelativeDiscount = create$processVariables(offerBadge, variableDataProvider, packageContext, r29, locale)) == null) {
                Double discountRelativeToMostExpensivePerMonth = packageContext.getDiscountRelativeToMostExpensivePerMonth();
                if (discountRelativeToMostExpensivePerMonth != null) {
                    String strLocalizedRelativeDiscount = variableDataProvider.localizedRelativeDiscount(Double.valueOf(discountRelativeToMostExpensivePerMonth.doubleValue()));
                    str = strLocalizedRelativeDiscount;
                } else {
                    str = null;
                }
            } else {
                str = strLocalizedRelativeDiscount;
            }
            String strCreate$processVariables = create$processVariables(localizedConfiguration.getTitle(), variableDataProvider, packageContext, r29, locale);
            String subtitle = localizedConfiguration.getSubtitle();
            String strCreate$processVariables2 = subtitle != null ? create$processVariables(subtitle, variableDataProvider, packageContext, r29, locale) : null;
            String strCreate$processVariables3 = create$processVariables(localizedConfiguration.getCallToAction(), variableDataProvider, packageContext, r29, locale);
            String callToActionWithIntroOffer = localizedConfiguration.getCallToActionWithIntroOffer();
            String strCreate$processVariables4 = callToActionWithIntroOffer != null ? create$processVariables(callToActionWithIntroOffer, variableDataProvider, packageContext, r29, locale) : null;
            String callToActionWithMultipleIntroOffers = localizedConfiguration.getCallToActionWithMultipleIntroOffers();
            String strCreate$processVariables5 = callToActionWithMultipleIntroOffers != null ? create$processVariables(callToActionWithMultipleIntroOffers, variableDataProvider, packageContext, r29, locale) : null;
            if (offerOverride == null || (offerDetails = offerOverride.getOfferDetails()) == null) {
                offerDetails = localizedConfiguration.getOfferDetails();
            }
            String strCreate$processVariables6 = offerDetails != null ? create$processVariables(offerDetails, variableDataProvider, packageContext, r29, locale) : null;
            if (offerOverride == null || (offerDetailsWithIntroOffer = offerOverride.getOfferDetailsWithIntroOffer()) == null) {
                offerDetailsWithIntroOffer = localizedConfiguration.getOfferDetailsWithIntroOffer();
            }
            String strCreate$processVariables7 = offerDetailsWithIntroOffer != null ? create$processVariables(offerDetailsWithIntroOffer, variableDataProvider, packageContext, r29, locale) : null;
            if (offerOverride == null || (offerDetailsWithMultipleIntroOffers = offerOverride.getOfferDetailsWithMultipleIntroOffers()) == null) {
                offerDetailsWithMultipleIntroOffers = localizedConfiguration.getOfferDetailsWithMultipleIntroOffers();
            }
            String strCreate$processVariables8 = offerDetailsWithMultipleIntroOffers != null ? create$processVariables(offerDetailsWithMultipleIntroOffers, variableDataProvider, packageContext, r29, locale) : null;
            if (offerOverride == null || (offerName = offerOverride.getOfferName()) == null) {
                offerName = localizedConfiguration.getOfferName();
            }
            String strCreate$processVariables9 = offerName != null ? create$processVariables(offerName, variableDataProvider, packageContext, r29, locale) : null;
            List<PaywallData.LocalizedConfiguration.Feature> features = localizedConfiguration.getFeatures();
            ArrayList arrayList = new ArrayList(v.x(features, 10));
            for (PaywallData.LocalizedConfiguration.Feature feature : features) {
                String strCreate$processVariables10 = create$processVariables(feature.getTitle(), variableDataProvider, packageContext, r29, locale);
                String content = feature.getContent();
                arrayList.add(PaywallData.LocalizedConfiguration.Feature.copy$default(feature, strCreate$processVariables10, content != null ? create$processVariables(content, variableDataProvider, packageContext, r29, locale) : null, null, 4, null));
            }
            return new ProcessedLocalizedConfiguration(strCreate$processVariables, strCreate$processVariables2, strCreate$processVariables3, strCreate$processVariables4, strCreate$processVariables5, strCreate$processVariables6, strCreate$processVariables7, strCreate$processVariables8, strCreate$processVariables9, str, arrayList, localizedConfiguration.getTierName());
        }
    }

    public ProcessedLocalizedConfiguration(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, List<PaywallData.LocalizedConfiguration.Feature> list, String str11) {
        r.f(str, b.S);
        r.f(str3, "callToAction");
        r.f(list, "features");
        this.title = str;
        this.subtitle = str2;
        this.callToAction = str3;
        this.callToActionWithIntroOffer = str4;
        this.callToActionWithMultipleIntroOffers = str5;
        this.offerDetails = str6;
        this.offerDetailsWithIntroOffer = str7;
        this.offerDetailsWithMultipleIntroOffers = str8;
        this.offerName = str9;
        this.offerBadge = str10;
        this.features = list;
        this.tierName = str11;
    }

    public /* synthetic */ ProcessedLocalizedConfiguration(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, List list, String str11, int i10, j jVar) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, (i10 & 1024) != 0 ? u.m() : list, str11);
    }

    public final String component1() {
        return this.title;
    }

    public final String component10() {
        return this.offerBadge;
    }

    public final List<PaywallData.LocalizedConfiguration.Feature> component11() {
        return this.features;
    }

    public final String component12() {
        return this.tierName;
    }

    public final String component2() {
        return this.subtitle;
    }

    public final String component3() {
        return this.callToAction;
    }

    public final String component4() {
        return this.callToActionWithIntroOffer;
    }

    public final String component5() {
        return this.callToActionWithMultipleIntroOffers;
    }

    public final String component6() {
        return this.offerDetails;
    }

    public final String component7() {
        return this.offerDetailsWithIntroOffer;
    }

    public final String component8() {
        return this.offerDetailsWithMultipleIntroOffers;
    }

    public final String component9() {
        return this.offerName;
    }

    public final ProcessedLocalizedConfiguration copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, List<PaywallData.LocalizedConfiguration.Feature> list, String str11) {
        r.f(str, b.S);
        r.f(str3, "callToAction");
        r.f(list, "features");
        return new ProcessedLocalizedConfiguration(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, list, str11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProcessedLocalizedConfiguration)) {
            return false;
        }
        ProcessedLocalizedConfiguration processedLocalizedConfiguration = (ProcessedLocalizedConfiguration) obj;
        return r.b(this.title, processedLocalizedConfiguration.title) && r.b(this.subtitle, processedLocalizedConfiguration.subtitle) && r.b(this.callToAction, processedLocalizedConfiguration.callToAction) && r.b(this.callToActionWithIntroOffer, processedLocalizedConfiguration.callToActionWithIntroOffer) && r.b(this.callToActionWithMultipleIntroOffers, processedLocalizedConfiguration.callToActionWithMultipleIntroOffers) && r.b(this.offerDetails, processedLocalizedConfiguration.offerDetails) && r.b(this.offerDetailsWithIntroOffer, processedLocalizedConfiguration.offerDetailsWithIntroOffer) && r.b(this.offerDetailsWithMultipleIntroOffers, processedLocalizedConfiguration.offerDetailsWithMultipleIntroOffers) && r.b(this.offerName, processedLocalizedConfiguration.offerName) && r.b(this.offerBadge, processedLocalizedConfiguration.offerBadge) && r.b(this.features, processedLocalizedConfiguration.features) && r.b(this.tierName, processedLocalizedConfiguration.tierName);
    }

    public final String getCallToAction() {
        return this.callToAction;
    }

    public final String getCallToActionWithIntroOffer() {
        return this.callToActionWithIntroOffer;
    }

    public final String getCallToActionWithMultipleIntroOffers() {
        return this.callToActionWithMultipleIntroOffers;
    }

    public final List<PaywallData.LocalizedConfiguration.Feature> getFeatures() {
        return this.features;
    }

    public final String getOfferBadge() {
        return this.offerBadge;
    }

    public final String getOfferDetails() {
        return this.offerDetails;
    }

    public final String getOfferDetailsWithIntroOffer() {
        return this.offerDetailsWithIntroOffer;
    }

    public final String getOfferDetailsWithMultipleIntroOffers() {
        return this.offerDetailsWithMultipleIntroOffers;
    }

    public final String getOfferName() {
        return this.offerName;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTierName() {
        return this.tierName;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.callToAction.hashCode()) * 31;
        String str2 = this.callToActionWithIntroOffer;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.callToActionWithMultipleIntroOffers;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.offerDetails;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.offerDetailsWithIntroOffer;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.offerDetailsWithMultipleIntroOffers;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.offerName;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.offerBadge;
        int iHashCode9 = (((iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31) + this.features.hashCode()) * 31;
        String str9 = this.tierName;
        return iHashCode9 + (str9 != null ? str9.hashCode() : 0);
    }

    public String toString() {
        return "ProcessedLocalizedConfiguration(title=" + this.title + ", subtitle=" + this.subtitle + ", callToAction=" + this.callToAction + ", callToActionWithIntroOffer=" + this.callToActionWithIntroOffer + ", callToActionWithMultipleIntroOffers=" + this.callToActionWithMultipleIntroOffers + ", offerDetails=" + this.offerDetails + ", offerDetailsWithIntroOffer=" + this.offerDetailsWithIntroOffer + ", offerDetailsWithMultipleIntroOffers=" + this.offerDetailsWithMultipleIntroOffers + ", offerName=" + this.offerName + ", offerBadge=" + this.offerBadge + ", features=" + this.features + ", tierName=" + this.tierName + ')';
    }
}
