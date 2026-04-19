package com.revenuecat.purchases.utils;

import ae.r;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import nd.v;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class JSONArrayExtensionsKt {
    public static final <T> List<T> replaceJsonNullWithKotlinNull(List<? extends T> list) {
        r.f(list, "<this>");
        ArrayList arrayList = new ArrayList(v.x(list, 10));
        for (T t10 : list) {
            if (t10 instanceof Map) {
                r.d(t10, "null cannot be cast to non-null type kotlin.collections.Map<T of com.revenuecat.purchases.utils.JSONArrayExtensionsKt.replaceJsonNullWithKotlinNull$lambda$0, T of com.revenuecat.purchases.utils.JSONArrayExtensionsKt.replaceJsonNullWithKotlinNull$lambda$0?>");
                t10 = (T) JSONObjectExtensionsKt.replaceJsonNullWithKotlinNull((Map) t10);
            } else if (t10 instanceof List) {
                r.d(t10, "null cannot be cast to non-null type kotlin.collections.List<T of com.revenuecat.purchases.utils.JSONArrayExtensionsKt.replaceJsonNullWithKotlinNull$lambda$0?>");
                t10 = (T) replaceJsonNullWithKotlinNull((List) t10);
            } else if (r.b(t10, JSONObject.NULL)) {
                t10 = (T) null;
            }
            arrayList.add(t10);
        }
        return arrayList;
    }

    public static final <T> List<T> toList(JSONArray jSONArray) {
        r.f(jSONArray, "<this>");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            Object list = jSONArray.get(i10);
            if (list instanceof JSONObject) {
                list = JSONObjectExtensionsKt.toMap((JSONObject) list, true);
            } else if (list instanceof JSONArray) {
                list = toList((JSONArray) list);
            }
            arrayList.add(list);
        }
        return arrayList;
    }
}
