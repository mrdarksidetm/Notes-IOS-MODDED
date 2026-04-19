package com.revenuecat.purchases.hybridcommon.mappers;

import ae.r;
import com.revenuecat.purchases.utils.Iso8601Utils;
import ie.g;
import ie.m;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import md.s;
import md.x;
import nd.o;
import nd.p;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class MappersHelpersKt {
    public static final JSONObject convertToJson(Map<String, ?> map) throws JSONException {
        List listE0;
        r.f(map, "<this>");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                value = JSONObject.NULL;
            } else if (value instanceof Map) {
                r.d(value, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, *>");
                value = convertToJson((Map) value);
            } else {
                if (value instanceof List) {
                    listE0 = (List) value;
                } else if (value instanceof Object[]) {
                    listE0 = p.E0((Object[]) value);
                }
                value = convertToJsonArray(listE0);
            }
            jSONObject.put(key, value);
        }
        return jSONObject;
    }

    public static final JSONArray convertToJsonArray(List<?> list) throws JSONException {
        List listC;
        r.f(list, "<this>");
        JSONArray jSONArray = new JSONArray();
        for (Object objConvertToJsonArray : list) {
            if (objConvertToJsonArray == null) {
                objConvertToJsonArray = JSONObject.NULL;
            } else if (objConvertToJsonArray instanceof Map) {
                r.d(objConvertToJsonArray, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, *>");
                objConvertToJsonArray = convertToJson((Map) objConvertToJsonArray);
            } else {
                if (objConvertToJsonArray instanceof Object[]) {
                    listC = o.c((Object[]) objConvertToJsonArray);
                } else if (objConvertToJsonArray instanceof List) {
                    listC = (List) objConvertToJsonArray;
                }
                objConvertToJsonArray = convertToJsonArray(listC);
            }
            jSONArray.put(objConvertToJsonArray);
        }
        return jSONArray;
    }

    public static final Map<String, String> convertToMap(JSONObject jSONObject) {
        r.f(jSONObject, "<this>");
        Iterator<String> itKeys = jSONObject.keys();
        r.e(itKeys, "this.keys()");
        g<String> gVarC = m.c(itKeys);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : gVarC) {
            s sVarA = x.a(str, jSONObject.isNull(str) ? null : jSONObject.getString(str));
            linkedHashMap.put(sVarA.c(), sVarA.d());
        }
        return linkedHashMap;
    }

    public static final String formatUsingDeviceLocale(String str, long j10) {
        r.f(str, "priceCurrencyCode");
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
        currencyInstance.setCurrency(Currency.getInstance(str));
        String str2 = currencyInstance.format(j10);
        r.e(str2, "getCurrencyInstance().ap…ode)\n    }.format(number)");
        return str2;
    }

    public static final String toIso8601(Date date) {
        r.f(date, "<this>");
        String str = Iso8601Utils.format(date);
        r.e(str, "format(this)");
        return str;
    }

    public static final long toMillis(Date date) {
        r.f(date, "<this>");
        return date.getTime();
    }
}
