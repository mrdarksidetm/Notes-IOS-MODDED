package com.revenuecat.purchases.common.caching;

import ae.j;
import ae.r;
import android.content.SharedPreferences;
import com.amazon.a.a.o.c.a.b;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.VerificationResult;
import com.revenuecat.purchases.common.CustomerInfoFactory;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.UtilsKt;
import com.revenuecat.purchases.common.offlineentitlements.ProductEntitlementMapping;
import com.revenuecat.purchases.interfaces.StorefrontProvider;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.strings.BillingStrings;
import com.revenuecat.purchases.strings.OfflineEntitlementsStrings;
import com.revenuecat.purchases.strings.ReceiptStrings;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import je.v;
import md.l;
import md.n;
import nd.c0;
import nd.r0;
import nd.y0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class DeviceCache implements StorefrontProvider {
    private static final String CUSTOMER_INFO_REQUEST_DATE_KEY = "customer_info_request_date";
    private static final String CUSTOMER_INFO_SCHEMA_VERSION_KEY = "schema_version";
    private static final String CUSTOMER_INFO_VERIFICATION_RESULT_KEY = "verification_result";
    public static final Companion Companion = new Companion(null);
    private final String apiKey;
    private final l apiKeyPrefix$delegate;
    private final l appUserIDCacheKey$delegate;
    private final String attributionCacheKey;
    private final l customerInfoCachesLastUpdatedCacheBaseKey$delegate;
    private final DateProvider dateProvider;
    private final l legacyAppUserIDCacheKey$delegate;
    private final l offeringsResponseCacheKey$delegate;
    private final SharedPreferences preferences;
    private final l productEntitlementMappingCacheKey$delegate;
    private final l productEntitlementMappingLastUpdatedCacheKey$delegate;
    private final l storefrontCacheKey$delegate;
    private final l tokensCacheKey$delegate;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }
    }

    public DeviceCache(SharedPreferences sharedPreferences, String str, DateProvider dateProvider) {
        r.f(sharedPreferences, "preferences");
        r.f(str, "apiKey");
        r.f(dateProvider, "dateProvider");
        this.preferences = sharedPreferences;
        this.apiKey = str;
        this.dateProvider = dateProvider;
        this.apiKeyPrefix$delegate = n.b(new DeviceCache$apiKeyPrefix$2(this));
        this.legacyAppUserIDCacheKey$delegate = n.b(new DeviceCache$legacyAppUserIDCacheKey$2(this));
        this.appUserIDCacheKey$delegate = n.b(new DeviceCache$appUserIDCacheKey$2(this));
        this.attributionCacheKey = "com.revenuecat.purchases..attribution";
        this.tokensCacheKey$delegate = n.b(new DeviceCache$tokensCacheKey$2(this));
        this.storefrontCacheKey$delegate = n.b(DeviceCache$storefrontCacheKey$2.INSTANCE);
        this.productEntitlementMappingCacheKey$delegate = n.b(new DeviceCache$productEntitlementMappingCacheKey$2(this));
        this.productEntitlementMappingLastUpdatedCacheKey$delegate = n.b(new DeviceCache$productEntitlementMappingLastUpdatedCacheKey$2(this));
        this.customerInfoCachesLastUpdatedCacheBaseKey$delegate = n.b(new DeviceCache$customerInfoCachesLastUpdatedCacheBaseKey$2(this));
        this.offeringsResponseCacheKey$delegate = n.b(new DeviceCache$offeringsResponseCacheKey$2(this));
    }

    public /* synthetic */ DeviceCache(SharedPreferences sharedPreferences, String str, DateProvider dateProvider, int i10, j jVar) {
        this(sharedPreferences, str, (i10 & 4) != 0 ? new DefaultDateProvider() : dateProvider);
    }

    private final SharedPreferences.Editor clearAppUserID(SharedPreferences.Editor editor) {
        editor.remove(getAppUserIDCacheKey());
        editor.remove(getLegacyAppUserIDCacheKey());
        return editor;
    }

    private final SharedPreferences.Editor clearCustomerInfo(SharedPreferences.Editor editor) {
        String cachedAppUserID = getCachedAppUserID();
        if (cachedAppUserID != null) {
            editor.remove(customerInfoCacheKey(cachedAppUserID));
        }
        String legacyCachedAppUserID = getLegacyCachedAppUserID();
        if (legacyCachedAppUserID != null) {
            editor.remove(customerInfoCacheKey(legacyCachedAppUserID));
        }
        return editor;
    }

    private final SharedPreferences.Editor clearCustomerInfoCacheTimestamp(SharedPreferences.Editor editor, String str) {
        editor.remove(customerInfoLastUpdatedCacheKey(str));
        return editor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getApiKeyPrefix() {
        return (String) this.apiKeyPrefix$delegate.getValue();
    }

    private final synchronized Date getCustomerInfoCachesLastUpdated(String str) {
        return new Date(this.preferences.getLong(customerInfoLastUpdatedCacheKey(str), 0L));
    }

    private final String getCustomerInfoCachesLastUpdatedCacheBaseKey() {
        return (String) this.customerInfoCachesLastUpdatedCacheBaseKey$delegate.getValue();
    }

    private final String getOfferingsResponseCacheKey() {
        return (String) this.offeringsResponseCacheKey$delegate.getValue();
    }

    private final String getProductEntitlementMappingCacheKey() {
        return (String) this.productEntitlementMappingCacheKey$delegate.getValue();
    }

    private final Date getProductEntitlementMappingLastUpdated() {
        if (this.preferences.contains(getProductEntitlementMappingLastUpdatedCacheKey())) {
            return new Date(this.preferences.getLong(getProductEntitlementMappingLastUpdatedCacheKey(), -1L));
        }
        return null;
    }

    private final String getProductEntitlementMappingLastUpdatedCacheKey() {
        return (String) this.productEntitlementMappingLastUpdatedCacheKey$delegate.getValue();
    }

    private final void setProductEntitlementMappingCacheTimestamp(Date date) {
        this.preferences.edit().putLong(getProductEntitlementMappingLastUpdatedCacheKey(), date.getTime()).apply();
    }

    private final synchronized void setSavedTokenHashes(Set<String> set) {
        LogIntent logIntent = LogIntent.DEBUG;
        String str = String.format(ReceiptStrings.SAVING_TOKENS, Arrays.copyOf(new Object[]{set}, 1));
        r.e(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        this.preferences.edit().putStringSet(getTokensCacheKey(), set).apply();
    }

    public final synchronized void addSuccessfullyPostedToken(String str) {
        r.f(str, "token");
        LogIntent logIntent = LogIntent.DEBUG;
        String str2 = String.format(ReceiptStrings.SAVING_TOKENS_WITH_HASH, Arrays.copyOf(new Object[]{str, UtilsKt.sha1(str)}, 2));
        r.e(str2, "format(this, *args)");
        LogWrapperKt.log(logIntent, str2);
        Set<String> previouslySentHashedTokens = getPreviouslySentHashedTokens();
        String str3 = String.format(ReceiptStrings.TOKENS_IN_CACHE, Arrays.copyOf(new Object[]{previouslySentHashedTokens}, 1));
        r.e(str3, "format(this, *args)");
        LogWrapperKt.log(logIntent, str3);
        Set<String> setG0 = c0.G0(previouslySentHashedTokens);
        setG0.add(UtilsKt.sha1(str));
        setSavedTokenHashes(setG0);
    }

    public final synchronized SharedPreferences.Editor cacheAppUserID(String str, SharedPreferences.Editor editor) {
        SharedPreferences.Editor editorPutString;
        r.f(str, "appUserID");
        r.f(editor, "cacheEditor");
        editorPutString = editor.putString(getAppUserIDCacheKey(), str);
        r.e(editorPutString, "cacheEditor.putString(ap…serIDCacheKey, appUserID)");
        return editorPutString;
    }

    public final synchronized void cacheAppUserID(String str) {
        r.f(str, "appUserID");
        SharedPreferences.Editor editorEdit = this.preferences.edit();
        r.e(editorEdit, "preferences.edit()");
        cacheAppUserID(str, editorEdit).apply();
    }

    public final synchronized void cacheCustomerInfo(String str, CustomerInfo customerInfo) {
        r.f(str, "appUserID");
        r.f(customerInfo, "info");
        JSONObject rawData = customerInfo.getRawData();
        rawData.put(CUSTOMER_INFO_SCHEMA_VERSION_KEY, 3);
        rawData.put("verification_result", customerInfo.getEntitlements().getVerification().name());
        rawData.put(CUSTOMER_INFO_REQUEST_DATE_KEY, customerInfo.getRequestDate().getTime());
        this.preferences.edit().putString(customerInfoCacheKey(str), rawData.toString()).apply();
        setCustomerInfoCacheTimestampToNow(str);
    }

    public final synchronized void cacheOfferingsResponse(JSONObject jSONObject) {
        r.f(jSONObject, "offeringsResponse");
        this.preferences.edit().putString(getOfferingsResponseCacheKey(), jSONObject.toString()).apply();
    }

    public final synchronized void cacheProductEntitlementMapping(ProductEntitlementMapping productEntitlementMapping) {
        r.f(productEntitlementMapping, "productEntitlementMapping");
        this.preferences.edit().putString(getProductEntitlementMappingCacheKey(), productEntitlementMapping.toJson().toString()).apply();
        setProductEntitlementMappingCacheTimestampToNow();
    }

    public final synchronized void cleanPreviouslySentTokens(Set<String> set) {
        r.f(set, "hashedTokens");
        LogWrapperKt.log(LogIntent.DEBUG, ReceiptStrings.CLEANING_PREV_SENT_HASHED_TOKEN);
        setSavedTokenHashes(c0.d0(set, getPreviouslySentHashedTokens()));
    }

    public final synchronized void cleanupOldAttributionData() {
        SharedPreferences.Editor editorEdit = this.preferences.edit();
        for (String str : this.preferences.getAll().keySet()) {
            if (str != null && v.G(str, this.attributionCacheKey, false, 2, null)) {
                editorEdit.remove(str);
            }
        }
        editorEdit.apply();
    }

    public final synchronized void clearCachesForAppUserID(String str) {
        r.f(str, "appUserID");
        SharedPreferences.Editor editorEdit = this.preferences.edit();
        r.e(editorEdit, "preferences.edit()");
        clearCustomerInfoCacheTimestamp(clearAppUserID(clearCustomerInfo(editorEdit)), str).apply();
    }

    public final synchronized void clearCustomerInfoCache(String str) {
        r.f(str, "appUserID");
        SharedPreferences.Editor editorEdit = this.preferences.edit();
        r.e(editorEdit, "editor");
        clearCustomerInfoCache(str, editorEdit);
        editorEdit.apply();
    }

    public final synchronized void clearCustomerInfoCache(String str, SharedPreferences.Editor editor) {
        r.f(str, "appUserID");
        r.f(editor, "editor");
        clearCustomerInfoCacheTimestamp(editor, str);
        editor.remove(customerInfoCacheKey(str));
    }

    public final synchronized void clearCustomerInfoCacheTimestamp(String str) {
        r.f(str, "appUserID");
        SharedPreferences.Editor editorEdit = this.preferences.edit();
        r.e(editorEdit, "preferences.edit()");
        clearCustomerInfoCacheTimestamp(editorEdit, str).apply();
    }

    public final synchronized void clearOfferingsResponseCache() {
        this.preferences.edit().remove(getOfferingsResponseCacheKey()).apply();
    }

    public final String customerInfoCacheKey(String str) {
        r.f(str, "appUserID");
        return getLegacyAppUserIDCacheKey() + b.f7490a + str;
    }

    public final String customerInfoLastUpdatedCacheKey(String str) {
        r.f(str, "appUserID");
        return getCustomerInfoCachesLastUpdatedCacheBaseKey() + b.f7490a + str;
    }

    public final Set<String> findKeysThatStartWith(String str) {
        r.f(str, "cacheKey");
        try {
            Map<String, ?> all = this.preferences.getAll();
            if (all != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, ?> entry : all.entrySet()) {
                    String key = entry.getKey();
                    r.e(key, "it");
                    if (v.G(key, str, false, 2, null)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                Set<String> setKeySet = linkedHashMap.keySet();
                if (setKeySet != null) {
                    return setKeySet;
                }
            }
            return y0.b();
        } catch (NullPointerException unused) {
            return y0.b();
        }
    }

    public final synchronized List<StoreTransaction> getActivePurchasesNotInCache(Map<String, StoreTransaction> map) {
        r.f(map, "hashedTokens");
        return c0.C0(r0.i(map, getPreviouslySentHashedTokens()).values());
    }

    public final String getAppUserIDCacheKey() {
        return (String) this.appUserIDCacheKey$delegate.getValue();
    }

    public final String getAttributionCacheKey$purchases_defaultsRelease() {
        return this.attributionCacheKey;
    }

    public final synchronized String getCachedAppUserID() {
        return this.preferences.getString(getAppUserIDCacheKey(), null);
    }

    public final CustomerInfo getCachedCustomerInfo(String str) {
        r.f(str, "appUserID");
        String string = this.preferences.getString(customerInfoCacheKey(str), null);
        if (string == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(string);
            int iOptInt = jSONObject.optInt(CUSTOMER_INFO_SCHEMA_VERSION_KEY);
            String string2 = jSONObject.has("verification_result") ? jSONObject.getString("verification_result") : "NOT_REQUESTED";
            Long lValueOf = Long.valueOf(jSONObject.optLong(CUSTOMER_INFO_REQUEST_DATE_KEY));
            if (!(lValueOf.longValue() > 0)) {
                lValueOf = null;
            }
            Date date = lValueOf != null ? new Date(lValueOf.longValue()) : null;
            jSONObject.remove("verification_result");
            jSONObject.remove(CUSTOMER_INFO_REQUEST_DATE_KEY);
            r.e(string2, "verificationResultString");
            VerificationResult verificationResultValueOf = VerificationResult.valueOf(string2);
            if (iOptInt == 3) {
                return CustomerInfoFactory.INSTANCE.buildCustomerInfo(jSONObject, date, verificationResultValueOf);
            }
            return null;
        } catch (JSONException unused) {
            return null;
        }
    }

    public JSONObject getJSONObjectOrNull(String str) {
        r.f(str, SubscriberAttributeKt.JSON_NAME_KEY);
        String string = this.preferences.getString(str, null);
        if (string == null) {
            return null;
        }
        try {
            return new JSONObject(string);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final String getLegacyAppUserIDCacheKey() {
        return (String) this.legacyAppUserIDCacheKey$delegate.getValue();
    }

    public final synchronized String getLegacyCachedAppUserID() {
        return this.preferences.getString(getLegacyAppUserIDCacheKey(), null);
    }

    public final synchronized JSONObject getOfferingsResponseCache() {
        return getJSONObjectOrNull(getOfferingsResponseCacheKey());
    }

    public final synchronized Set<String> getPreviouslySentHashedTokens() {
        Set<String> setB;
        try {
            Set<String> stringSet = this.preferences.getStringSet(getTokensCacheKey(), y0.b());
            if (stringSet == null || (setB = c0.H0(stringSet)) == null) {
                setB = y0.b();
            }
            LogIntent logIntent = LogIntent.DEBUG;
            String str = String.format(ReceiptStrings.TOKENS_ALREADY_POSTED, Arrays.copyOf(new Object[]{setB}, 1));
            r.e(str, "format(this, *args)");
            LogWrapperKt.log(logIntent, str);
        } catch (ClassCastException unused) {
            setB = y0.b();
        }
        return setB;
    }

    public final synchronized ProductEntitlementMapping getProductEntitlementMapping() {
        ProductEntitlementMapping productEntitlementMappingFromJson = null;
        String string = this.preferences.getString(getProductEntitlementMappingCacheKey(), null);
        if (string == null) {
            return null;
        }
        try {
            productEntitlementMappingFromJson = ProductEntitlementMapping.Companion.fromJson(new JSONObject(string));
        } catch (JSONException e10) {
            String str = String.format(OfflineEntitlementsStrings.ERROR_PARSING_PRODUCT_ENTITLEMENT_MAPPING, Arrays.copyOf(new Object[]{string}, 1));
            r.e(str, "format(this, *args)");
            LogUtilsKt.errorLog(str, e10);
            this.preferences.edit().remove(getProductEntitlementMappingCacheKey()).apply();
        }
        return productEntitlementMappingFromJson;
    }

    @Override // com.revenuecat.purchases.interfaces.StorefrontProvider
    public synchronized String getStorefront() {
        String string;
        string = this.preferences.getString(getStorefrontCacheKey(), null);
        if (string == null) {
            LogUtilsKt.debugLog(BillingStrings.BILLING_STOREFRONT_NULL_FROM_CACHE);
        }
        return string;
    }

    public final String getStorefrontCacheKey() {
        return (String) this.storefrontCacheKey$delegate.getValue();
    }

    public final String getTokensCacheKey() {
        return (String) this.tokensCacheKey$delegate.getValue();
    }

    public final synchronized boolean isCustomerInfoCacheStale(String str, boolean z10) {
        r.f(str, "appUserID");
        return DateExtensionsKt.isCacheStale(getCustomerInfoCachesLastUpdated(str), z10, this.dateProvider);
    }

    public final synchronized boolean isProductEntitlementMappingCacheStale() {
        return DateExtensionsKt.m18isCacheStale8Mi8wO0(getProductEntitlementMappingLastUpdated(), DeviceCacheKt.PRODUCT_ENTITLEMENT_MAPPING_CACHE_REFRESH_PERIOD, this.dateProvider);
    }

    public final String newKey(String str) {
        r.f(str, SubscriberAttributeKt.JSON_NAME_KEY);
        return getApiKeyPrefix() + b.f7490a + str;
    }

    public void putString(String str, String str2) {
        r.f(str, "cacheKey");
        r.f(str2, "value");
        this.preferences.edit().putString(str, str2).apply();
    }

    public final void remove(String str) {
        r.f(str, "cacheKey");
        this.preferences.edit().remove(str).apply();
    }

    public final synchronized void setCustomerInfoCacheTimestamp(String str, Date date) {
        r.f(str, "appUserID");
        r.f(date, "date");
        this.preferences.edit().putLong(customerInfoLastUpdatedCacheKey(str), date.getTime()).apply();
    }

    public final synchronized void setCustomerInfoCacheTimestampToNow(String str) {
        r.f(str, "appUserID");
        setCustomerInfoCacheTimestamp(str, this.dateProvider.getNow());
    }

    public final synchronized void setProductEntitlementMappingCacheTimestampToNow() {
        setProductEntitlementMappingCacheTimestamp(this.dateProvider.getNow());
    }

    public final synchronized void setStorefront(String str) {
        r.f(str, "countryCode");
        String str2 = String.format(BillingStrings.BILLING_STOREFRONT_CACHING, Arrays.copyOf(new Object[]{str}, 1));
        r.e(str2, "format(this, *args)");
        LogUtilsKt.verboseLog(str2);
        this.preferences.edit().putString(getStorefrontCacheKey(), str).apply();
    }

    public final SharedPreferences.Editor startEditing() {
        SharedPreferences.Editor editorEdit = this.preferences.edit();
        r.e(editorEdit, "preferences.edit()");
        return editorEdit;
    }
}
