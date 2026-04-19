package com.revenuecat.purchases.subscriberattributes.caching;

import ae.r;
import android.content.SharedPreferences;
import com.amazon.a.a.o.c.a.b;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttribute;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributesFactoriesKt;
import ge.o;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import je.w;
import md.s;
import md.x;
import nd.q0;
import nd.r0;
import nd.v;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class SubscriberAttributesMigrationExtensionsKt {
    public static final synchronized Map<String, Map<String, SubscriberAttribute>> getAllLegacyStoredSubscriberAttributes(SubscriberAttributesCache subscriberAttributesCache) {
        LinkedHashMap linkedHashMap;
        Map<String, SubscriberAttribute> mapE;
        r.f(subscriberAttributesCache, "<this>");
        String strLegacySubscriberAttributesCacheKey = legacySubscriberAttributesCacheKey(subscriberAttributesCache, "");
        Set<String> setFindKeysThatStartWith = subscriberAttributesCache.getDeviceCache$purchases_defaultsRelease().findKeysThatStartWith(strLegacySubscriberAttributesCacheKey);
        linkedHashMap = new LinkedHashMap(o.d(q0.b(v.x(setFindKeysThatStartWith, 10)), 16));
        for (String str : setFindKeysThatStartWith) {
            String str2 = (String) w.C0(str, new String[]{strLegacySubscriberAttributesCacheKey}, false, 0, 6, null).get(1);
            JSONObject jSONObjectOrNull = subscriberAttributesCache.getDeviceCache$purchases_defaultsRelease().getJSONObjectOrNull(str);
            if (jSONObjectOrNull == null || (mapE = SubscriberAttributesFactoriesKt.buildLegacySubscriberAttributes(jSONObjectOrNull)) == null) {
                mapE = r0.e();
            }
            s sVarA = x.a(str2, mapE);
            linkedHashMap.put(sVarA.c(), sVarA.d());
        }
        return linkedHashMap;
    }

    public static final String legacySubscriberAttributesCacheKey(SubscriberAttributesCache subscriberAttributesCache, String str) {
        r.f(subscriberAttributesCache, "<this>");
        r.f(str, "appUserID");
        return subscriberAttributesCache.getSubscriberAttributesCacheKey$purchases_defaultsRelease() + b.f7490a + str;
    }

    public static final synchronized void migrateSubscriberAttributes(SubscriberAttributesCache subscriberAttributesCache, Map<String, ? extends Map<String, SubscriberAttribute>> map, SharedPreferences.Editor editor) {
        r.f(subscriberAttributesCache, "<this>");
        r.f(map, "legacySubscriberAttributesForAppUserID");
        r.f(editor, "cacheEditor");
        Map<String, Map<String, SubscriberAttribute>> allStoredSubscriberAttributes = subscriberAttributesCache.getAllStoredSubscriberAttributes();
        Map mapV = r0.v(allStoredSubscriberAttributes);
        for (Map.Entry<String, ? extends Map<String, SubscriberAttribute>> entry : map.entrySet()) {
            String key = entry.getKey();
            Map<String, SubscriberAttribute> value = entry.getValue();
            Map<String, SubscriberAttribute> mapE = allStoredSubscriberAttributes.get(key);
            if (mapE == null) {
                mapE = r0.e();
            }
            mapV.put(key, r0.l(value, mapE));
            editor.remove(legacySubscriberAttributesCacheKey(subscriberAttributesCache, key));
        }
        editor.putString(subscriberAttributesCache.getSubscriberAttributesCacheKey$purchases_defaultsRelease(), CachingHelpersKt.toJSONObject(mapV).toString());
    }

    public static final synchronized void migrateSubscriberAttributesIfNeeded(SubscriberAttributesCache subscriberAttributesCache, SharedPreferences.Editor editor) {
        r.f(subscriberAttributesCache, "<this>");
        r.f(editor, "cacheEditor");
        Map<String, Map<String, SubscriberAttribute>> allLegacyStoredSubscriberAttributes = getAllLegacyStoredSubscriberAttributes(subscriberAttributesCache);
        if (!(!allLegacyStoredSubscriberAttributes.isEmpty())) {
            allLegacyStoredSubscriberAttributes = null;
        }
        if (allLegacyStoredSubscriberAttributes != null) {
            migrateSubscriberAttributes(subscriberAttributesCache, allLegacyStoredSubscriberAttributes, editor);
        }
    }
}
