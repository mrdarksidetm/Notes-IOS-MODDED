package com.revenuecat.purchases.subscriberattributes.caching;

import ae.r;
import android.content.SharedPreferences;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.strings.AttributionStrings;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttribute;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributesFactoriesKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import md.l;
import md.n;
import md.s;
import md.x;
import nd.c0;
import nd.q0;
import nd.r0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class SubscriberAttributesCache {
    private final DeviceCache deviceCache;
    private final l subscriberAttributesCacheKey$delegate;

    public SubscriberAttributesCache(DeviceCache deviceCache) {
        r.f(deviceCache, "deviceCache");
        this.deviceCache = deviceCache;
        this.subscriberAttributesCacheKey$delegate = n.b(new SubscriberAttributesCache$subscriberAttributesCacheKey$2(this));
    }

    private final synchronized void deleteSyncedSubscriberAttributesForOtherUsers(String str, SharedPreferences.Editor editor) {
        s sVarA;
        LogIntent logIntent = LogIntent.DEBUG;
        String str2 = String.format(AttributionStrings.DELETING_ATTRIBUTES_OTHER_USERS, Arrays.copyOf(new Object[]{str}, 1));
        r.e(str2, "format(this, *args)");
        LogWrapperKt.log(logIntent, str2);
        Map<String, Map<String, SubscriberAttribute>> allStoredSubscriberAttributes = getAllStoredSubscriberAttributes();
        ArrayList arrayList = new ArrayList(allStoredSubscriberAttributes.size());
        for (Map.Entry<String, Map<String, SubscriberAttribute>> entry : allStoredSubscriberAttributes.entrySet()) {
            String key = entry.getKey();
            Map<String, SubscriberAttribute> value = entry.getValue();
            if (r.b(str, key)) {
                sVarA = x.a(key, value);
            } else {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, SubscriberAttribute> entry2 : value.entrySet()) {
                    if (!entry2.getValue().isSynced()) {
                        linkedHashMap.put(entry2.getKey(), entry2.getValue());
                    }
                }
                sVarA = x.a(key, linkedHashMap);
            }
            arrayList.add(sVarA);
        }
        Map mapR = r0.r(arrayList);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry3 : mapR.entrySet()) {
            if (!((Map) entry3.getValue()).isEmpty()) {
                linkedHashMap2.put(entry3.getKey(), entry3.getValue());
            }
        }
        editor.putString(getSubscriberAttributesCacheKey$purchases_defaultsRelease(), CachingHelpersKt.toJSONObject(linkedHashMap2).toString());
    }

    private final Map<String, SubscriberAttribute> filterUnsynced(Map<String, SubscriberAttribute> map, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, SubscriberAttribute> entry : map.entrySet()) {
            if (true ^ entry.getValue().isSynced()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LogIntent logIntent = LogIntent.DEBUG;
        StringBuilder sb2 = new StringBuilder();
        String str2 = String.format(AttributionStrings.UNSYNCED_ATTRIBUTES_COUNT, Arrays.copyOf(new Object[]{Integer.valueOf(linkedHashMap.size()), str}, 2));
        r.e(str2, "format(this, *args)");
        sb2.append(str2);
        sb2.append(linkedHashMap.isEmpty() ^ true ? c0.h0(linkedHashMap.values(), "\n", null, null, 0, null, null, 62, null) : "");
        LogWrapperKt.log(logIntent, sb2.toString());
        return linkedHashMap;
    }

    private final void putAttributes(DeviceCache deviceCache, Map<String, ? extends Map<String, SubscriberAttribute>> map) {
        DeviceCache deviceCache2 = this.deviceCache;
        String subscriberAttributesCacheKey$purchases_defaultsRelease = getSubscriberAttributesCacheKey$purchases_defaultsRelease();
        String string = CachingHelpersKt.toJSONObject(map).toString();
        r.e(string, "updatedSubscriberAttribu…toJSONObject().toString()");
        deviceCache2.putString(subscriberAttributesCacheKey$purchases_defaultsRelease, string);
    }

    public final synchronized void cleanUpSubscriberAttributeCache(String str, SharedPreferences.Editor editor) {
        r.f(str, "currentAppUserID");
        r.f(editor, "cacheEditor");
        SubscriberAttributesMigrationExtensionsKt.migrateSubscriberAttributesIfNeeded(this, editor);
        deleteSyncedSubscriberAttributesForOtherUsers(str, editor);
    }

    public final synchronized void clearAllSubscriberAttributesFromUser(String str) {
        r.f(str, "appUserID");
        LogIntent logIntent = LogIntent.DEBUG;
        String str2 = String.format(AttributionStrings.DELETING_ATTRIBUTES, Arrays.copyOf(new Object[]{str}, 1));
        r.e(str2, "format(this, *args)");
        LogWrapperKt.log(logIntent, str2);
        Map mapV = r0.v(getAllStoredSubscriberAttributes());
        mapV.remove(str);
        putAttributes(this.deviceCache, r0.t(mapV));
    }

    public final synchronized void clearSubscriberAttributesIfSyncedForSubscriber(String str) {
        r.f(str, "appUserID");
        if (getUnsyncedSubscriberAttributes(str).isEmpty()) {
            clearAllSubscriberAttributesFromUser(str);
        }
    }

    public final synchronized Map<String, Map<String, SubscriberAttribute>> getAllStoredSubscriberAttributes() {
        Map<String, Map<String, SubscriberAttribute>> mapE;
        JSONObject jSONObjectOrNull = this.deviceCache.getJSONObjectOrNull(getSubscriberAttributesCacheKey$purchases_defaultsRelease());
        if (jSONObjectOrNull == null || (mapE = SubscriberAttributesFactoriesKt.buildSubscriberAttributesMapPerUser(jSONObjectOrNull)) == null) {
            mapE = r0.e();
        }
        return mapE;
    }

    public final synchronized Map<String, SubscriberAttribute> getAllStoredSubscriberAttributes(String str) {
        Map<String, SubscriberAttribute> mapE;
        r.f(str, "appUserID");
        mapE = getAllStoredSubscriberAttributes().get(str);
        if (mapE == null) {
            mapE = r0.e();
        }
        return mapE;
    }

    public final DeviceCache getDeviceCache$purchases_defaultsRelease() {
        return this.deviceCache;
    }

    public final String getSubscriberAttributesCacheKey$purchases_defaultsRelease() {
        return (String) this.subscriberAttributesCacheKey$delegate.getValue();
    }

    public final synchronized Map<String, Map<String, SubscriberAttribute>> getUnsyncedSubscriberAttributes() {
        LinkedHashMap linkedHashMap;
        Map<String, Map<String, SubscriberAttribute>> allStoredSubscriberAttributes = getAllStoredSubscriberAttributes();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(q0.b(allStoredSubscriberAttributes.size()));
        for (Object obj : allStoredSubscriberAttributes.entrySet()) {
            Object key = ((Map.Entry) obj).getKey();
            Map.Entry entry = (Map.Entry) obj;
            linkedHashMap2.put(key, filterUnsynced((Map) entry.getValue(), (String) entry.getKey()));
        }
        linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            if (!((Map) entry2.getValue()).isEmpty()) {
                linkedHashMap.put(entry2.getKey(), entry2.getValue());
            }
        }
        return linkedHashMap;
    }

    public final synchronized Map<String, SubscriberAttribute> getUnsyncedSubscriberAttributes(String str) {
        r.f(str, "appUserID");
        return filterUnsynced(getAllStoredSubscriberAttributes(str), str);
    }

    public final synchronized void setAttributes(String str, Map<String, SubscriberAttribute> map) {
        r.f(str, "appUserID");
        r.f(map, "attributesToBeSet");
        Map<String, Map<String, SubscriberAttribute>> allStoredSubscriberAttributes = getAllStoredSubscriberAttributes();
        Map<String, SubscriberAttribute> mapE = allStoredSubscriberAttributes.get(str);
        if (mapE == null) {
            mapE = r0.e();
        }
        putAttributes(this.deviceCache, r0.l(allStoredSubscriberAttributes, q0.c(x.a(str, r0.l(mapE, map)))));
    }
}
