package com.revenuecat.purchases.ui.revenuecatui.data.testdata.templates;

import ae.j;
import ae.r;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import com.revenuecat.purchases.PackageType;
import com.revenuecat.purchases.paywalls.PaywallColor;
import com.revenuecat.purchases.paywalls.PaywallData;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.PaywallTemplate;
import com.revenuecat.purchases.ui.revenuecatui.data.testdata.TestData;
import java.net.URL;
import java.util.List;
import java.util.Map;
import md.x;
import nd.r0;
import nd.u;

/* JADX INFO: loaded from: classes2.dex */
public final class Template2TestDataKt {
    public static final PaywallData getTemplate2(TestData testData) {
        r.f(testData, "<this>");
        String id2 = PaywallTemplate.TEMPLATE_2.getId();
        String identifier = PackageType.ANNUAL.getIdentifier();
        r.c(identifier);
        PackageType packageType = PackageType.MONTHLY;
        String identifier2 = packageType.getIdentifier();
        r.c(identifier2);
        String identifier3 = PackageType.LIFETIME.getIdentifier();
        r.c(identifier3);
        List listP = u.p(identifier, identifier2, identifier3);
        String identifier4 = packageType.getIdentifier();
        r.c(identifier4);
        TestData.Constants constants = TestData.Constants.INSTANCE;
        return new PaywallData(id2, new PaywallData.Configuration(listP, identifier4, constants.getImages(), (Map) null, new PaywallData.Configuration.ColorInformation(new PaywallData.Configuration.Colors(new PaywallColor("#FFFFFF"), new PaywallColor("#000000"), (PaywallColor) null, (PaywallColor) null, new PaywallColor("#EC807C"), new PaywallColor("#FFFFFF"), new PaywallColor("#FC609C"), new PaywallColor("#BC66FF"), new PaywallColor("#222222"), (PaywallColor) null, (PaywallColor) null, (PaywallColor) null, (PaywallColor) null, (PaywallColor) null, (PaywallColor) null, 32268, (j) null), (PaywallData.Configuration.Colors) null, 2, (j) null), (Map) null, (List) null, true, true, new URL("https://revenuecat.com/tos"), new URL("https://revenuecat.com/privacy"), R.styleable.AppCompatTheme_textAppearanceListItemSecondary, (j) null), constants.getAssetBaseURL(), 0, r0.h(x.a("en_US", new PaywallData.LocalizedConfiguration("Call to **action** for _better_ conversion.", "**Lorem ipsum** is simply ~dummy~ text of the _printing_ and *typesetting* industry.", "Subscribe for {{ price_per_period }}", "Start your {{ sub_offer_duration }} free trial", (String) null, "{{ total_price_and_per_month }}", "{{ total_price_and_per_month }} after {{ sub_offer_duration }} trial", (String) null, "{{ sub_period }}", (List) null, (String) null, (Map) null, 3728, (j) null)), x.a("es_ES", new PaywallData.LocalizedConfiguration("Título en español", "Un lorem ipsum en español que es más largo para mostrar un subtítulo multilinea.", "Suscribete for {{ price_per_period }}", "Empieza tu prueba gratuita de {{ sub_offer_duration }}", (String) null, "{{ total_price_and_per_month }}", "{{ total_price_and_per_month }} con {{ sub_offer_duration }} de prueba", (String) null, "{{ sub_period }}", (List) null, (String) null, (Map) null, 3728, (j) null))), (Map) null, constants.getZeroDecimalPlaceCountries(), (String) null, 168, (j) null);
    }
}
