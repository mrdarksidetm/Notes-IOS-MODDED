package com.revenuecat.purchases.paywalls.components.common;

import ae.j;
import ae.r;
import af.j1;
import af.k0;
import af.z0;
import com.revenuecat.purchases.InternalRevenueCatAPI;
import com.revenuecat.purchases.utils.serializers.URLSerializer;
import java.net.URL;
import java.util.Map;
import we.b;
import ye.f;
import ze.d;

/* JADX INFO: loaded from: classes2.dex */
@InternalRevenueCatAPI
public final class PaywallComponentsData {
    private final URL assetBaseURL;
    private final ComponentsConfig componentsConfig;
    private final Map<LocaleId, Map<LocalizationKey, LocalizationData>> componentsLocalizations;
    private final String defaultLocaleIdentifier;
    private final int revision;
    private final String templateName;
    public static final Companion Companion = new Companion(null);
    private static final b<Object>[] $childSerializers = {null, null, null, new k0(LocaleId$$serializer.INSTANCE, new k0(LocalizationKey$$serializer.INSTANCE, LocalizationDataSerializer.INSTANCE)), null, null};

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final b<PaywallComponentsData> serializer() {
            return PaywallComponentsData$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private PaywallComponentsData(int i10, String str, URL url, ComponentsConfig componentsConfig, Map<LocaleId, ? extends Map<LocalizationKey, ? extends LocalizationData>> map, String str2, int i11, j1 j1Var) {
        if (31 != (i10 & 31)) {
            z0.a(i10, 31, PaywallComponentsData$$serializer.INSTANCE.getDescriptor());
        }
        this.templateName = str;
        this.assetBaseURL = url;
        this.componentsConfig = componentsConfig;
        this.componentsLocalizations = map;
        this.defaultLocaleIdentifier = str2;
        if ((i10 & 32) == 0) {
            this.revision = 0;
        } else {
            this.revision = i11;
        }
    }

    public /* synthetic */ PaywallComponentsData(int i10, String str, URL url, ComponentsConfig componentsConfig, Map map, String str2, int i11, j1 j1Var, j jVar) {
        this(i10, str, url, componentsConfig, (Map<LocaleId, ? extends Map<LocalizationKey, ? extends LocalizationData>>) map, str2, i11, j1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private PaywallComponentsData(String str, URL url, ComponentsConfig componentsConfig, Map<LocaleId, ? extends Map<LocalizationKey, ? extends LocalizationData>> map, String str2, int i10) {
        r.f(str, "templateName");
        r.f(url, "assetBaseURL");
        r.f(componentsConfig, "componentsConfig");
        r.f(map, "componentsLocalizations");
        r.f(str2, "defaultLocaleIdentifier");
        this.templateName = str;
        this.assetBaseURL = url;
        this.componentsConfig = componentsConfig;
        this.componentsLocalizations = map;
        this.defaultLocaleIdentifier = str2;
        this.revision = i10;
    }

    public /* synthetic */ PaywallComponentsData(String str, URL url, ComponentsConfig componentsConfig, Map map, String str2, int i10, int i11, j jVar) {
        this(str, url, componentsConfig, map, str2, (i11 & 32) != 0 ? 0 : i10, null);
    }

    public /* synthetic */ PaywallComponentsData(String str, URL url, ComponentsConfig componentsConfig, Map map, String str2, int i10, j jVar) {
        this(str, url, componentsConfig, map, str2, i10);
    }

    public static /* synthetic */ void getAssetBaseURL$annotations() {
    }

    public static /* synthetic */ void getComponentsConfig$annotations() {
    }

    public static /* synthetic */ void getComponentsLocalizations$annotations() {
    }

    /* JADX INFO: renamed from: getDefaultLocaleIdentifier-uqtKvyA$annotations, reason: not valid java name */
    public static /* synthetic */ void m70getDefaultLocaleIdentifieruqtKvyA$annotations() {
    }

    public static /* synthetic */ void getTemplateName$annotations() {
    }

    public static final /* synthetic */ void write$Self(PaywallComponentsData paywallComponentsData, d dVar, f fVar) {
        b<Object>[] bVarArr = $childSerializers;
        dVar.w(fVar, 0, paywallComponentsData.templateName);
        dVar.E(fVar, 1, URLSerializer.INSTANCE, paywallComponentsData.assetBaseURL);
        dVar.E(fVar, 2, ComponentsConfig$$serializer.INSTANCE, paywallComponentsData.componentsConfig);
        dVar.E(fVar, 3, bVarArr[3], paywallComponentsData.componentsLocalizations);
        dVar.E(fVar, 4, LocaleId$$serializer.INSTANCE, LocaleId.m34boximpl(paywallComponentsData.defaultLocaleIdentifier));
        if (dVar.r(fVar, 5) || paywallComponentsData.revision != 0) {
            dVar.y(fVar, 5, paywallComponentsData.revision);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaywallComponentsData)) {
            return false;
        }
        PaywallComponentsData paywallComponentsData = (PaywallComponentsData) obj;
        return r.b(this.templateName, paywallComponentsData.templateName) && r.b(this.assetBaseURL, paywallComponentsData.assetBaseURL) && r.b(this.componentsConfig, paywallComponentsData.componentsConfig) && r.b(this.componentsLocalizations, paywallComponentsData.componentsLocalizations) && LocaleId.m37equalsimpl0(this.defaultLocaleIdentifier, paywallComponentsData.defaultLocaleIdentifier) && this.revision == paywallComponentsData.revision;
    }

    public final /* synthetic */ URL getAssetBaseURL() {
        return this.assetBaseURL;
    }

    public final /* synthetic */ ComponentsConfig getComponentsConfig() {
        return this.componentsConfig;
    }

    public final /* synthetic */ Map getComponentsLocalizations() {
        return this.componentsLocalizations;
    }

    /* JADX INFO: renamed from: getDefaultLocaleIdentifier-uqtKvyA, reason: not valid java name */
    public final /* synthetic */ String m71getDefaultLocaleIdentifieruqtKvyA() {
        return this.defaultLocaleIdentifier;
    }

    public final /* synthetic */ int getRevision() {
        return this.revision;
    }

    public final /* synthetic */ String getTemplateName() {
        return this.templateName;
    }

    public int hashCode() {
        return (((((((((this.templateName.hashCode() * 31) + this.assetBaseURL.hashCode()) * 31) + this.componentsConfig.hashCode()) * 31) + this.componentsLocalizations.hashCode()) * 31) + LocaleId.m38hashCodeimpl(this.defaultLocaleIdentifier)) * 31) + Integer.hashCode(this.revision);
    }

    public String toString() {
        return "PaywallComponentsData(templateName=" + this.templateName + ", assetBaseURL=" + this.assetBaseURL + ", componentsConfig=" + this.componentsConfig + ", componentsLocalizations=" + this.componentsLocalizations + ", defaultLocaleIdentifier=" + ((Object) LocaleId.m39toStringimpl(this.defaultLocaleIdentifier)) + ", revision=" + this.revision + ')';
    }
}
