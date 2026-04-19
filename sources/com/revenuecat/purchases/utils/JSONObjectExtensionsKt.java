package com.revenuecat.purchases.utils;

import ae.r;
import ae.s;
import ie.m;
import ie.o;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import md.x;
import nd.q0;
import nd.r0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
public final class JSONObjectExtensionsKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.revenuecat.purchases.utils.JSONObjectExtensionsKt$toMap$1, reason: invalid class name */
    static final class AnonymousClass1<T> extends s implements l<String, md.s<? extends String, ? extends T>> {
        final /* synthetic */ boolean $deep;
        final /* synthetic */ JSONObject $this_toMap;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(boolean z10, JSONObject jSONObject) {
            super(1);
            this.$deep = z10;
            this.$this_toMap = jSONObject;
        }

        @Override // zd.l
        public final md.s<String, T> invoke(String str) throws JSONException {
            Object list;
            if (this.$deep) {
                list = this.$this_toMap.get(str);
                if (list instanceof JSONObject) {
                    list = JSONObjectExtensionsKt.toMap((JSONObject) list, true);
                } else if (list instanceof JSONArray) {
                    list = JSONArrayExtensionsKt.toList((JSONArray) list);
                }
            } else {
                list = this.$this_toMap.get(str);
            }
            return x.a(str, list);
        }
    }

    public static final Date getDate(JSONObject jSONObject, String str) {
        r.f(jSONObject, "<this>");
        r.f(str, "jsonKey");
        Date date = Iso8601Utils.parse(jSONObject.getString(str));
        r.e(date, "parse(getString(jsonKey))");
        return date;
    }

    public static final Integer getNullableInt(JSONObject jSONObject, String str) {
        r.f(jSONObject, "<this>");
        r.f(str, "name");
        if (jSONObject.isNull(str)) {
            jSONObject = null;
        }
        if (jSONObject != null) {
            return Integer.valueOf(jSONObject.getInt(str));
        }
        return null;
    }

    public static final String getNullableString(JSONObject jSONObject, String str) {
        r.f(jSONObject, "<this>");
        r.f(str, "name");
        if (jSONObject.isNull(str)) {
            jSONObject = null;
        }
        if (jSONObject != null) {
            return jSONObject.getString(str);
        }
        return null;
    }

    public static final Date optDate(JSONObject jSONObject, String str) {
        r.f(jSONObject, "<this>");
        r.f(str, "jsonKey");
        if (jSONObject.isNull(str)) {
            jSONObject = null;
        }
        if (jSONObject != null) {
            return getDate(jSONObject, str);
        }
        return null;
    }

    public static final Integer optNullableInt(JSONObject jSONObject, String str) {
        r.f(jSONObject, "<this>");
        r.f(str, "name");
        if (!jSONObject.has(str)) {
            jSONObject = null;
        }
        if (jSONObject != null) {
            return getNullableInt(jSONObject, str);
        }
        return null;
    }

    public static final String optNullableString(JSONObject jSONObject, String str) {
        r.f(jSONObject, "<this>");
        r.f(str, "name");
        if (!jSONObject.has(str)) {
            jSONObject = null;
        }
        if (jSONObject != null) {
            return getNullableString(jSONObject, str);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> replaceJsonNullWithKotlinNull(Map<K, ? extends V> map) {
        r.f(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Map) {
                r.d(value, "null cannot be cast to non-null type kotlin.collections.Map<K of com.revenuecat.purchases.utils.JSONObjectExtensionsKt.replaceJsonNullWithKotlinNull$lambda$5, V of com.revenuecat.purchases.utils.JSONObjectExtensionsKt.replaceJsonNullWithKotlinNull$lambda$5?>");
                value = replaceJsonNullWithKotlinNull((Map) value);
            } else if (value instanceof List) {
                r.d(value, "null cannot be cast to non-null type kotlin.collections.List<V of com.revenuecat.purchases.utils.JSONObjectExtensionsKt.replaceJsonNullWithKotlinNull$lambda$5?>");
                value = JSONArrayExtensionsKt.replaceJsonNullWithKotlinNull((List) value);
            } else if (r.b(value, JSONObject.NULL)) {
                value = null;
            }
            linkedHashMap.put(key, value);
        }
        return linkedHashMap;
    }

    public static final <T> Map<String, T> toMap(JSONObject jSONObject, boolean z10) {
        r.f(jSONObject, "<this>");
        Iterator<String> itKeys = jSONObject.keys();
        r.e(itKeys, "this.keys()");
        return r0.p(o.s(m.c(itKeys), new AnonymousClass1(z10, jSONObject)));
    }

    public static /* synthetic */ Map toMap$default(JSONObject jSONObject, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return toMap(jSONObject, z10);
    }
}
