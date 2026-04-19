package com.revenuecat.purchases.common;

import ae.r;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.models.SubscriptionOptions;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import nd.c0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class GoogleOfferingParser extends OfferingParser {
    @Override // com.revenuecat.purchases.common.OfferingParser
    protected StoreProduct findMatchingProduct(Map<String, ? extends List<? extends StoreProduct>> map, JSONObject jSONObject) throws JSONException {
        SubscriptionOption basePlan;
        r.f(map, "productsById");
        r.f(jSONObject, "packageJson");
        String string = jSONObject.getString("platform_product_identifier");
        String strOptString = jSONObject.optString("platform_product_plan_identifier");
        r.e(strOptString, "it");
        Object obj = null;
        if (!(strOptString.length() > 0)) {
            strOptString = null;
        }
        List<? extends StoreProduct> list = map.get(string);
        if (strOptString == null) {
            if (!(list != null && list.size() == 1)) {
                list = null;
            }
            if (list == null) {
                return null;
            }
            if (!(list.get(0).getType() == ProductType.INAPP)) {
                list = null;
            }
            if (list != null) {
                return (StoreProduct) c0.a0(list);
            }
            return null;
        }
        if (list == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            SubscriptionOptions subscriptionOptions = ((StoreProduct) next).getSubscriptionOptions();
            if (r.b((subscriptionOptions == null || (basePlan = subscriptionOptions.getBasePlan()) == null) ? null : basePlan.getId(), strOptString)) {
                obj = next;
                break;
            }
        }
        return (StoreProduct) obj;
    }
}
