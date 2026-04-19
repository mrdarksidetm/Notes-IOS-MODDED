package com.revenuecat.purchases.ui.revenuecatui.data.testdata.templates;

import ae.j;
import ae.r;
import com.revenuecat.purchases.PackageType;
import com.revenuecat.purchases.paywalls.PaywallColor;
import com.revenuecat.purchases.paywalls.PaywallData;
import com.revenuecat.purchases.ui.revenuecatui.data.testdata.TestData;
import java.net.URL;
import java.util.List;
import java.util.Map;
import md.x;
import nd.q0;
import nd.r0;
import nd.t;
import nd.u;

/* JADX INFO: loaded from: classes2.dex */
public final class Template7CustomPackagesTestDataKt {
    public static final PaywallData getTemplate7CustomPackages(TestData testData) {
        r.f(testData, "<this>");
        List listM = u.m();
        Map mapH = r0.h(x.a("basic", new PaywallData.Configuration.Images("954459_1703109702.png", (String) null, (String) null, 6, (j) null)), x.a("premium", new PaywallData.Configuration.Images("954459_1701267532.jpeg", (String) null, (String) null, 6, (j) null)));
        PackageType packageType = PackageType.ANNUAL;
        String identifier = packageType.getIdentifier();
        r.c(identifier);
        PackageType packageType2 = PackageType.MONTHLY;
        String identifier2 = packageType2.getIdentifier();
        r.c(identifier2);
        PackageType packageType3 = PackageType.SIX_MONTH;
        String identifier3 = packageType3.getIdentifier();
        r.c(identifier3);
        List listP = u.p(identifier, identifier2, identifier3);
        String identifier4 = packageType.getIdentifier();
        r.c(identifier4);
        String identifier5 = PackageType.LIFETIME.getIdentifier();
        r.c(identifier5);
        List listD = t.d(identifier5);
        String identifier6 = PackageType.THREE_MONTH.getIdentifier();
        r.c(identifier6);
        PaywallData.Configuration configuration = new PaywallData.Configuration(listM, (String) null, (PaywallData.Configuration.Images) null, (PaywallData.Configuration.Images) null, mapH, false, true, new URL("https://revenuecat.com/tos"), new URL("https://revenuecat.com/privacy"), new PaywallData.Configuration.ColorInformation(new PaywallData.Configuration.Colors(new PaywallColor("#FFFFFF"), new PaywallColor("#000000"), (PaywallColor) null, (PaywallColor) null, new PaywallColor("#45c186"), new PaywallColor("#ffffff"), (PaywallColor) null, (PaywallColor) null, (PaywallColor) null, (PaywallColor) null, (PaywallColor) null, (PaywallColor) null, (PaywallColor) null, (PaywallColor) null, (PaywallColor) null, 32716, (j) null), (PaywallData.Configuration.Colors) null, 2, (j) null), r0.h(x.a("basic", new PaywallData.Configuration.ColorInformation(new PaywallData.Configuration.Colors(new PaywallColor("#FFFFFF"), new PaywallColor("#000000"), new PaywallColor("#ffffff"), new PaywallColor("#30A0F8AA"), new PaywallColor("#3fc1f7"), new PaywallColor("#ffffff"), (PaywallColor) null, new PaywallColor("#2d7fc1"), new PaywallColor("#7676801F"), new PaywallColor("#100031"), (PaywallColor) null, new PaywallColor("#eeeef0"), new PaywallColor("#000000"), new PaywallColor("#2d7fc1"), new PaywallColor("#000000"), 1088, (j) null), (PaywallData.Configuration.Colors) null, 2, (j) null)), x.a("premium", new PaywallData.Configuration.ColorInformation(new PaywallData.Configuration.Colors(new PaywallColor("#FFFFFF"), new PaywallColor("#000000"), new PaywallColor("#ffffff"), new PaywallColor("#30A0F8AA"), new PaywallColor("#94d269"), new PaywallColor("#ffffff"), (PaywallColor) null, new PaywallColor("#76c343"), new PaywallColor("#7676801F"), new PaywallColor("#213711"), (PaywallColor) null, new PaywallColor("#eeeef0"), new PaywallColor("#000000"), new PaywallColor("#76c343"), new PaywallColor("#000000"), 1088, (j) null), (PaywallData.Configuration.Colors) null, 2, (j) null))), u.p(new PaywallData.Configuration.Tier("basic", listP, identifier4), new PaywallData.Configuration.Tier("premium", listD, identifier6)), (String) null, 4142, (j) null);
        TestData.Constants constants = TestData.Constants.INSTANCE;
        URL assetBaseURL = constants.getAssetBaseURL();
        Map mapC = q0.c(x.a("en_US", new PaywallData.LocalizedConfiguration("Get started with our Basic plan", (String) null, "{{ price_per_period }}", (String) null, (String) null, "{{ total_price_and_per_month }}", (String) null, (String) null, "{{ sub_period }}", (List) null, (String) null, (Map) null, 3802, (j) null)));
        List listD2 = t.d(new PaywallData.LocalizedConfiguration.Feature("Access to all 150 of our cinematic LUTs", (String) null, "tick", 2, (j) null));
        String identifier7 = packageType2.getIdentifier();
        r.c(identifier7);
        String identifier8 = packageType.getIdentifier();
        r.c(identifier8);
        String identifier9 = packageType3.getIdentifier();
        r.c(identifier9);
        return new PaywallData("7", configuration, assetBaseURL, 0, mapC, q0.c(x.a("en_US", r0.h(x.a("basic", new PaywallData.LocalizedConfiguration("Get started with our Basic plan", (String) null, "Subscribe for {{ price_per_period }}", "Start your {{ sub_offer_duration }} free trial", (String) null, "{{ total_price_and_per_month }}", "{{ total_price_and_per_month }} after {{ sub_offer_duration }} trial", (String) null, "{{ sub_period }}", listD2, "Basic", r0.h(x.a(identifier7, new PaywallData.LocalizedConfiguration.OfferOverride("{{ sub_period }}", "{{ total_price_and_per_month }}", (String) null, (String) null, (String) null, 12, (j) null)), x.a(identifier8, new PaywallData.LocalizedConfiguration.OfferOverride("NAME OVERRIDE {{ sub_period }}", "DETAIL OVERRIDE {{ total_price_and_per_month }}", (String) null, (String) null, (String) null, 12, (j) null)), x.a(identifier9, new PaywallData.LocalizedConfiguration.OfferOverride("NAME OVERRIDE {{ sub_period }}", "DETAIL OVERRIDE {{ total_price_and_per_month }}", (String) null, (String) null, "BADGE OVERRIDE {{ sub_relative_discount }}", 12, (j) null))), 146, (j) null)), x.a("premium", new PaywallData.LocalizedConfiguration("Master the art of video editing", (String) null, "Subscribe for {{ price_per_period }}", "Start your {{ sub_offer_duration }} free trial", (String) null, "{{ total_price_and_per_month }}", "{{ total_price_and_per_month }} after {{ sub_offer_duration }} trial", (String) null, "{{ sub_period }}", u.p(new PaywallData.LocalizedConfiguration.Feature("Access to all 150 of our cinematic LUTs", (String) null, "tick", 2, (j) null), new PaywallData.LocalizedConfiguration.Feature("Custom design tools and transition effects", (String) null, "tick", 2, (j) null), new PaywallData.LocalizedConfiguration.Feature("100+ exclusive templates", (String) null, "tick", 2, (j) null)), "Premium", (Map) null, 2194, (j) null))))), constants.getZeroDecimalPlaceCountries(), (String) null, 136, (j) null);
    }
}
