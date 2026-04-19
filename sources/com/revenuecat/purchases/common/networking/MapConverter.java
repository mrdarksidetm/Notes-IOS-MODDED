package com.revenuecat.purchases.common.networking;

import ae.r;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import md.x;
import nd.q0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
public final class MapConverter {
    private final /* synthetic */ <T> Object tryCast(Object obj, l<? super T, ? extends Object> lVar) {
        r.j(3, "T");
        return obj instanceof Object ? lVar.invoke(obj) : obj;
    }

    public final JSONObject convertToJSON$purchases_defaultsRelease(Map<String, ? extends Object> map) throws JSONException {
        r.f(map, "inputMap");
        LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof List) {
                Iterable iterable = (Iterable) value;
                boolean z10 = true;
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    Iterator it2 = iterable.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        if (!(it2.next() instanceof String)) {
                            z10 = false;
                            break;
                        }
                    }
                }
                if (z10) {
                    value = new JSONObject(q0.c(x.a("temp_key", new JSONArray((Collection) value)))).getJSONArray("temp_key");
                }
            } else if (value instanceof Map) {
                value = convertToJSON$purchases_defaultsRelease((Map) value);
            }
            linkedHashMap.put(key, value);
        }
        return createJSONObject$purchases_defaultsRelease(linkedHashMap);
    }

    public final JSONObject createJSONObject$purchases_defaultsRelease(Map<String, ? extends Object> map) {
        r.f(map, "inputMap");
        return new JSONObject(map);
    }
}
