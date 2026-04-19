package com.revenuecat.purchases.common.offlineentitlements;

import ae.j;
import ae.r;
import com.revenuecat.purchases.utils.JSONObjectExtensionsKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import nd.q0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class ProductEntitlementMapping {
    private static final String BASE_PLAN_ID_KEY = "base_plan_id";
    public static final Companion Companion = new Companion(null);
    private static final String ENTITLEMENTS_KEY = "entitlements";
    private static final String PRODUCT_ENTITLEMENT_MAPPING_KEY = "product_entitlement_mapping";
    private static final String PRODUCT_ID_KEY = "product_identifier";
    private final Map<String, Mapping> mappings;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final ProductEntitlementMapping fromJson(JSONObject jSONObject) throws JSONException {
            r.f(jSONObject, "json");
            JSONObject jSONObject2 = jSONObject.getJSONObject(ProductEntitlementMapping.PRODUCT_ENTITLEMENT_MAPPING_KEY);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<String> itKeys = jSONObject2.keys();
            r.e(itKeys, "productsObject.keys()");
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JSONObject jSONObject3 = jSONObject2.getJSONObject(next);
                String string = jSONObject3.getString("product_identifier");
                r.e(jSONObject3, "productObject");
                String strOptNullableString = JSONObjectExtensionsKt.optNullableString(jSONObject3, ProductEntitlementMapping.BASE_PLAN_ID_KEY);
                JSONArray jSONArray = jSONObject3.getJSONArray("entitlements");
                ArrayList arrayList = new ArrayList();
                int length = jSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    String string2 = jSONArray.getString(i10);
                    r.e(string2, "entitlementsArray.getString(entitlementIndex)");
                    arrayList.add(string2);
                }
                r.e(next, "mappingIdentifier");
                r.e(string, "productIdentifier");
                linkedHashMap.put(next, new Mapping(string, strOptNullableString, arrayList));
            }
            return new ProductEntitlementMapping(linkedHashMap);
        }
    }

    public static final class Mapping {
        private final String basePlanId;
        private final List<String> entitlements;
        private final String productIdentifier;

        public Mapping(String str, String str2, List<String> list) {
            r.f(str, "productIdentifier");
            r.f(list, "entitlements");
            this.productIdentifier = str;
            this.basePlanId = str2;
            this.entitlements = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Mapping copy$default(Mapping mapping, String str, String str2, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = mapping.productIdentifier;
            }
            if ((i10 & 2) != 0) {
                str2 = mapping.basePlanId;
            }
            if ((i10 & 4) != 0) {
                list = mapping.entitlements;
            }
            return mapping.copy(str, str2, list);
        }

        public final String component1() {
            return this.productIdentifier;
        }

        public final String component2() {
            return this.basePlanId;
        }

        public final List<String> component3() {
            return this.entitlements;
        }

        public final Mapping copy(String str, String str2, List<String> list) {
            r.f(str, "productIdentifier");
            r.f(list, "entitlements");
            return new Mapping(str, str2, list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Mapping)) {
                return false;
            }
            Mapping mapping = (Mapping) obj;
            return r.b(this.productIdentifier, mapping.productIdentifier) && r.b(this.basePlanId, mapping.basePlanId) && r.b(this.entitlements, mapping.entitlements);
        }

        public final String getBasePlanId() {
            return this.basePlanId;
        }

        public final List<String> getEntitlements() {
            return this.entitlements;
        }

        public final String getProductIdentifier() {
            return this.productIdentifier;
        }

        public int hashCode() {
            int iHashCode = this.productIdentifier.hashCode() * 31;
            String str = this.basePlanId;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.entitlements.hashCode();
        }

        public String toString() {
            return "Mapping(productIdentifier=" + this.productIdentifier + ", basePlanId=" + this.basePlanId + ", entitlements=" + this.entitlements + ')';
        }
    }

    public ProductEntitlementMapping(Map<String, Mapping> map) {
        r.f(map, "mappings");
        this.mappings = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProductEntitlementMapping copy$default(ProductEntitlementMapping productEntitlementMapping, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = productEntitlementMapping.mappings;
        }
        return productEntitlementMapping.copy(map);
    }

    public final Map<String, Mapping> component1() {
        return this.mappings;
    }

    public final ProductEntitlementMapping copy(Map<String, Mapping> map) {
        r.f(map, "mappings");
        return new ProductEntitlementMapping(map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProductEntitlementMapping) && r.b(this.mappings, ((ProductEntitlementMapping) obj).mappings);
    }

    public final Map<String, Mapping> getMappings() {
        return this.mappings;
    }

    public int hashCode() {
        return this.mappings.hashCode();
    }

    public final JSONObject toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Map<String, Mapping> map = this.mappings;
        LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Mapping mapping = (Mapping) entry.getValue();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("product_identifier", mapping.getProductIdentifier());
            String basePlanId = mapping.getBasePlanId();
            if (basePlanId != null) {
                jSONObject2.put(BASE_PLAN_ID_KEY, basePlanId);
            }
            jSONObject2.put("entitlements", new JSONArray((Collection) mapping.getEntitlements()));
            linkedHashMap.put(key, jSONObject2);
        }
        jSONObject.put(PRODUCT_ENTITLEMENT_MAPPING_KEY, new JSONObject(linkedHashMap));
        return jSONObject;
    }

    public String toString() {
        return "ProductEntitlementMapping(mappings=" + this.mappings + ')';
    }
}
