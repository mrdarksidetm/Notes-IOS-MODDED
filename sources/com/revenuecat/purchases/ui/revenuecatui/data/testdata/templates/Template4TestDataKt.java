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
public final class Template4TestDataKt {
    public static final PaywallData getTemplate4(TestData testData) {
        r.f(testData, "<this>");
        String id2 = PaywallTemplate.TEMPLATE_4.getId();
        String identifier = PackageType.MONTHLY.getIdentifier();
        r.c(identifier);
        PackageType packageType = PackageType.SIX_MONTH;
        String identifier2 = packageType.getIdentifier();
        r.c(identifier2);
        String identifier3 = PackageType.ANNUAL.getIdentifier();
        r.c(identifier3);
        String identifier4 = PackageType.WEEKLY.getIdentifier();
        r.c(identifier4);
        List listP = u.p(identifier, identifier2, identifier3, identifier4);
        String identifier5 = packageType.getIdentifier();
        r.c(identifier5);
        PaywallData.Configuration configuration = new PaywallData.Configuration(listP, identifier5, new PaywallData.Configuration.Images((String) null, "300883_1690710097.jpg", (String) null, 5, (j) null), (Map) null, new PaywallData.Configuration.ColorInformation(new PaywallData.Configuration.Colors(new PaywallColor("#FFFFFF"), new PaywallColor("#111111"), new PaywallColor("#333333"), new PaywallColor("#999999"), new PaywallColor("#06357D"), new PaywallColor("#FFFFFF"), (PaywallColor) null, new PaywallColor("#D4B5FC"), new PaywallColor("#DFDFDF"), (PaywallColor) null, (PaywallColor) null, (PaywallColor) null, (PaywallColor) null, (PaywallColor) null, (PaywallColor) null, 32320, (j) null), (PaywallData.Configuration.Colors) null, 2, (j) null), (Map) null, (List) null, false, true, new URL("https://revenuecat.com/tos"), new URL("https://revenuecat.com/privacy"), 232, (j) null);
        Map mapC = q0.c(x.a("en_US", new PaywallData.LocalizedConfiguration("Get _unlimited_ access", (String) null, "Continue", (String) null, (String) null, "Cancel anytime", "Includes {{ sub_offer_duration }} **free** trial", (String) null, "{{ sub_duration_in_months }}", (List) null, (String) null, (Map) null, 3738, (j) null)));
        TestData.Constants constants = TestData.Constants.INSTANCE;
        return new PaywallData(id2, configuration, constants.getAssetBaseURL(), 0, mapC, (Map) null, constants.getZeroDecimalPlaceCountries(), (String) null, 168, (j) null);
    }
}
