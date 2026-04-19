package com.revenuecat.purchases.amazon;

import ae.r;
import com.revenuecat.purchases.common.OfferingParser;
import com.revenuecat.purchases.models.StoreProduct;
import java.util.List;
import java.util.Map;
import nd.c0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class AmazonOfferingParser extends OfferingParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f9088a = 0;

    @Override // com.revenuecat.purchases.common.OfferingParser
    protected StoreProduct findMatchingProduct(Map<String, ? extends List<? extends StoreProduct>> map, JSONObject jSONObject) {
        r.f(map, "productsById");
        r.f(jSONObject, "packageJson");
        List<? extends StoreProduct> list = map.get(jSONObject.getString("platform_product_identifier"));
        if (list != null) {
            return (StoreProduct) c0.a0(list);
        }
        return null;
    }
}
