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
import nd.t;

/* JADX INFO: loaded from: classes2.dex */
public final class Template1TestDataKt {
    public static final PaywallData getTemplate1(TestData testData) {
        r.f(testData, "<this>");
        String id2 = PaywallTemplate.TEMPLATE_1.getId();
        PackageType packageType = PackageType.MONTHLY;
        String identifier = packageType.getIdentifier();
        r.c(identifier);
        List listD = t.d(identifier);
        String identifier2 = packageType.getIdentifier();
        r.c(identifier2);
        TestData.Constants constants = TestData.Constants.INSTANCE;
        return new PaywallData(id2, new PaywallData.Configuration(listD, identifier2, constants.getImages(), (Map) null, new PaywallData.Configuration.ColorInformation(new PaywallData.Configuration.Colors(new PaywallColor("#FFFFFF"), new PaywallColor("#000000"), (PaywallColor) null, (PaywallColor) null, new PaywallColor("#5CD27A"), new PaywallColor("#FFFFFF"), (PaywallColor) null, new PaywallColor("#BC66FF"), (PaywallColor) null, (PaywallColor) null, (PaywallColor) null, (PaywallColor) null, (PaywallColor) null, (PaywallColor) null, (PaywallColor) null, 32588, (j) null), new PaywallData.Configuration.Colors(new PaywallColor("#000000"), new PaywallColor("#FFFFFF"), (PaywallColor) null, (PaywallColor) null, new PaywallColor("#ACD27A"), new PaywallColor("#000000"), (PaywallColor) null, new PaywallColor("#B022BB"), (PaywallColor) null, (PaywallColor) null, (PaywallColor) null, (PaywallColor) null, (PaywallColor) null, (PaywallColor) null, (PaywallColor) null, 32588, (j) null)), (Map) null, (List) null, true, true, new URL("https://revenuecat.com/tos"), (URL) null, 1128, (j) null), constants.getAssetBaseURL(), 0, q0.c(x.a("en_US", new PaywallData.LocalizedConfiguration("Ignite your _child_'s curiosity", "Get access to **all our educational content** trusted by thousands of parents.", "Subscribe for _only_ {{ sub_price_per_month }}", "Purchase for _only_ {{ sub_price_per_month }} per month", (String) null, "*Just* {{ sub_price_per_month }} per month", "Start your {{ sub_offer_duration }} trial, then {{ sub_price_per_month }} per month", (String) null, (String) null, (List) null, (String) null, (Map) null, 3984, (j) null))), (Map) null, constants.getZeroDecimalPlaceCountries(), (String) null, 168, (j) null);
    }
}
