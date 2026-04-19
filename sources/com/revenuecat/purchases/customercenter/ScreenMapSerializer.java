package com.revenuecat.purchases.customercenter;

import ae.r;
import bf.g;
import bf.h;
import bf.i;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.customercenter.CustomerCenterConfigData;
import java.util.LinkedHashMap;
import java.util.Map;
import we.b;
import xe.a;
import ye.f;
import ze.e;

/* JADX INFO: loaded from: classes2.dex */
public final class ScreenMapSerializer implements b<Map<CustomerCenterConfigData.Screen.ScreenType, ? extends CustomerCenterConfigData.Screen>> {
    public static final ScreenMapSerializer INSTANCE = new ScreenMapSerializer();
    private static final f descriptor = a.i(CustomerCenterConfigData.Screen.ScreenType.Companion.serializer(), CustomerCenterConfigData.Screen.Companion.serializer()).getDescriptor();

    private ScreenMapSerializer() {
    }

    @Override // we.a
    public Map<CustomerCenterConfigData.Screen.ScreenType, CustomerCenterConfigData.Screen> deserialize(e eVar) {
        r.f(eVar, "decoder");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        g gVar = eVar instanceof g ? (g) eVar : null;
        if (gVar == null) {
            throw new IllegalStateException("Can be deserialized only by JSON".toString());
        }
        for (Map.Entry<String, h> entry : i.n(gVar.p()).entrySet()) {
            String key = entry.getKey();
            try {
                linkedHashMap.put(CustomerCenterConfigData.Screen.ScreenType.valueOf(key), gVar.b().c(CustomerCenterConfigData.Screen.Companion.serializer(), entry.getValue()));
            } catch (IllegalArgumentException unused) {
                LogUtilsKt.debugLog("Unknown CustomerCenter ScreenType: " + key + ". Ignoring.");
            }
        }
        return linkedHashMap;
    }

    @Override // we.b, we.h, we.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // we.h
    public void serialize(ze.f fVar, Map<CustomerCenterConfigData.Screen.ScreenType, CustomerCenterConfigData.Screen> map) {
        r.f(fVar, "encoder");
        r.f(map, "value");
        a.i(CustomerCenterConfigData.Screen.ScreenType.Companion.serializer(), CustomerCenterConfigData.Screen.Companion.serializer()).serialize(fVar, map);
    }
}
