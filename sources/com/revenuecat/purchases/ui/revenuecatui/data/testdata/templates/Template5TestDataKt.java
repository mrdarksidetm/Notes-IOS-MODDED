package com.revenuecat.purchases.ui.revenuecatui.data.testdata.templates;

import ae.j;
import ae.r;
import com.revenuecat.purchases.PackageType;
import com.revenuecat.purchases.paywalls.PaywallColor;
import com.revenuecat.purchases.paywalls.PaywallData;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.PaywallTemplate;
import com.revenuecat.purchases.ui.revenuecatui.data.testdata.TestData;
import java.net.URL;
import java.util.List;
import java.util.Map;
import md.x;
import nd.q0;
import nd.u;

/* JADX INFO: loaded from: classes2.dex */
public final class Template5TestDataKt {
    public static final PaywallData getTemplate5(TestData testData) {
        r.f(testData, "<this>");
        String id2 = PaywallTemplate.TEMPLATE_5.getId();
        PackageType packageType = PackageType.ANNUAL;
        String identifier = packageType.getIdentifier();
        r.c(identifier);
        String identifier2 = PackageType.MONTHLY.getIdentifier();
        r.c(identifier2);
        List listP = u.p(identifier, identifier2);
        String identifier3 = packageType.getIdentifier();
        r.c(identifier3);
        PaywallData.Configuration configuration = new PaywallData.Configuration(listP, identifier3, new PaywallData.Configuration.Images("954459_1692992845.png", (String) null, (String) null, 6, (j) null), (Map) null, new PaywallData.Configuration.ColorInformation(new PaywallData.Configuration.Colors(new PaywallColor("#FFFFFF"), new PaywallColor("#000000"), new PaywallColor("#adf5c5"), new PaywallColor("#b15d5d"), new PaywallColor("#45c186"), new PaywallColor("#ffffff"), (PaywallColor) null, new PaywallColor("#b24010"), new PaywallColor("#027424"), new PaywallColor("#D1D1D1"), (PaywallColor) null, (PaywallColor) null, (PaywallColor) null, (PaywallColor) null, (PaywallColor) null, 31808, (j) null), (PaywallData.Configuration.Colors) null, 2, (j) null), (Map) null, (List) null, false, true, (URL) null, new URL("https://revenuecat.com/privacy"), 744, (j) null);
        Map mapC = q0.c(x.a("en_US", new PaywallData.LocalizedConfiguration("Spice Up Your Kitchen - Go Pro for Exclusive Benefits!", (String) null, "Continue", "Start your Free Trial", (String) null, "{{ total_price_and_per_month }}", "Free for {{ sub_offer_duration }}, then {{ total_price_and_per_month }}", (String) null, "{{ sub_period }}", u.p(new PaywallData.LocalizedConfiguration.Feature("Unique gourmet recipes", (String) null, "tick", 2, (j) null), new PaywallData.LocalizedConfiguration.Feature("Advanced nutritional recipes", (String) null, "apple", 2, (j) null), new PaywallData.LocalizedConfiguration.Feature("Personalized support from our Chef", (String) null, "warning", 2, (j) null), new PaywallData.LocalizedConfiguration.Feature("Unlimited receipt collections", (String) null, "bookmark", 2, (j) null)), (String) null, (Map) null, 3218, (j) null)));
        TestData.Constants constants = TestData.Constants.INSTANCE;
        return new PaywallData(id2, configuration, constants.getAssetBaseURL(), 0, mapC, (Map) null, constants.getZeroDecimalPlaceCountries(), (String) null, 168, (j) null);
    }
}
