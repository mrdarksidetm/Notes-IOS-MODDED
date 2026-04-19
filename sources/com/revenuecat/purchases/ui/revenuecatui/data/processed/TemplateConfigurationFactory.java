package com.revenuecat.purchases.ui.revenuecatui.data.processed;

import ae.r;
import android.net.Uri;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.paywalls.PaywallData;
import com.revenuecat.purchases.ui.revenuecatui.PaywallMode;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import md.s;
import md.t;
import md.u;
import nd.q0;
import nd.r0;

/* JADX INFO: loaded from: classes2.dex */
public final class TemplateConfigurationFactory {
    public static final TemplateConfigurationFactory INSTANCE = new TemplateConfigurationFactory();

    private TemplateConfigurationFactory() {
    }

    private final Uri getUriFromImage(PaywallData paywallData, String str) {
        if (str != null) {
            return Uri.parse(paywallData.getAssetBaseURL().toString()).buildUpon().path(str).build();
        }
        return null;
    }

    /* JADX INFO: renamed from: create-eH_QyT8, reason: not valid java name */
    public final Object m234createeH_QyT8(VariableDataProvider variableDataProvider, PaywallMode paywallMode, PaywallData paywallData, List<Package> list, Set<String> set, Set<String> set2, PaywallTemplate paywallTemplate, String str) {
        Map mapE;
        r.f(variableDataProvider, "variableDataProvider");
        r.f(paywallMode, "mode");
        r.f(paywallData, "paywallData");
        r.f(list, "availablePackages");
        r.f(set, "activelySubscribedProductIdentifiers");
        r.f(set2, "nonSubscriptionProductIdentifiers");
        r.f(paywallTemplate, "template");
        PaywallData.Configuration.Images images = paywallData.getConfig().getImages();
        TemplateConfiguration.Images images2 = new TemplateConfiguration.Images(getUriFromImage(paywallData, images.getIcon()), getUriFromImage(paywallData, images.getBackground()), getUriFromImage(paywallData, images.getHeader()));
        Map<String, PaywallData.Configuration.Images> imagesByTier = paywallData.getConfig().getImagesByTier();
        if (imagesByTier != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(imagesByTier.size()));
            Iterator<T> it = imagesByTier.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                TemplateConfigurationFactory templateConfigurationFactory = INSTANCE;
                linkedHashMap.put(key, new TemplateConfiguration.Images(templateConfigurationFactory.getUriFromImage(paywallData, ((PaywallData.Configuration.Images) entry.getValue()).getIcon()), templateConfigurationFactory.getUriFromImage(paywallData, ((PaywallData.Configuration.Images) entry.getValue()).getBackground()), templateConfigurationFactory.getUriFromImage(paywallData, ((PaywallData.Configuration.Images) entry.getValue()).getHeader())));
            }
            mapE = linkedHashMap;
        } else {
            mapE = r0.e();
        }
        Object objM201createPackageConfigurationtZkwj4A = PackageConfigurationFactory.INSTANCE.m201createPackageConfigurationtZkwj4A(variableDataProvider, list, set, set2, paywallData.getConfig().getPackageIds(), paywallData.getConfig().getDefaultPackage(), paywallTemplate.getConfigurationType(), paywallData, str);
        Throwable thE = t.e(objM201createPackageConfigurationtZkwj4A);
        if (thE != null) {
            return t.b(u.a(thE));
        }
        s sVar = (s) objM201createPackageConfigurationtZkwj4A;
        return t.b(new TemplateConfiguration(paywallTemplate, paywallMode, (TemplateConfiguration.PackageConfiguration) sVar.b(), paywallData.getConfig(), images2, mapE, paywallData.getConfig().getColors(), (Locale) sVar.a()));
    }
}
