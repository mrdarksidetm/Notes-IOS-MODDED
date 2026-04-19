package com.revenuecat.purchases.common;

import ae.j;
import ae.r;
import bf.a;
import bf.n;
import com.amazon.a.a.o.b;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.Package;
import com.revenuecat.purchases.PackageType;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.paywalls.PaywallData;
import com.revenuecat.purchases.utils.JSONObjectExtensionsKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import nd.r0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class OfferingParser {
    public static final Companion Companion = new Companion(null);
    private static final a json = n.b(null, OfferingParser$Companion$json$1.INSTANCE, 1, null);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public static /* synthetic */ void getJson$purchases_defaultsRelease$annotations() {
        }

        public final a getJson$purchases_defaultsRelease() {
            return OfferingParser.json;
        }
    }

    public final Offering createOffering(JSONObject jSONObject, Map<String, ? extends List<? extends StoreProduct>> map) throws JSONException {
        Map mapE;
        PaywallData paywallData;
        PaywallData paywallData2;
        r.f(jSONObject, "offeringJson");
        r.f(map, "productsById");
        String string = jSONObject.getString("identifier");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("metadata");
        if (jSONObjectOptJSONObject == null || (mapE = JSONObjectExtensionsKt.toMap(jSONObjectOptJSONObject, true)) == null) {
            mapE = r0.e();
        }
        Map map2 = mapE;
        JSONArray jSONArray = jSONObject.getJSONArray("packages");
        r.e(string, "offeringIdentifier");
        PresentedOfferingContext presentedOfferingContext = new PresentedOfferingContext(string);
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
            r.e(jSONObject2, "packageJson");
            Package packageCreatePackage = createPackage(jSONObject2, map, presentedOfferingContext);
            if (packageCreatePackage != null) {
                arrayList.add(packageCreatePackage);
            }
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("paywall");
        if (jSONObjectOptJSONObject2 != null) {
            try {
                a aVar = json;
                String string2 = jSONObjectOptJSONObject2.toString();
                r.e(string2, "it.toString()");
                aVar.a();
                paywallData = (PaywallData) aVar.d(PaywallData.Companion.serializer(), string2);
            } catch (Exception e10) {
                LogUtilsKt.errorLog("Error deserializing paywall data", e10);
                paywallData = null;
            }
            paywallData2 = paywallData;
        } else {
            paywallData2 = null;
        }
        if (!(!arrayList.isEmpty())) {
            return null;
        }
        String string3 = jSONObject.getString(b.f7429c);
        r.e(string3, "offeringJson.getString(\"description\")");
        return new Offering(string, string3, map2, arrayList, paywallData2);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.revenuecat.purchases.Offerings createOfferings(org.json.JSONObject r11, java.util.Map<java.lang.String, ? extends java.util.List<? extends com.revenuecat.purchases.models.StoreProduct>> r12) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.common.OfferingParser.createOfferings(org.json.JSONObject, java.util.Map):com.revenuecat.purchases.Offerings");
    }

    public final Package createPackage(JSONObject jSONObject, Map<String, ? extends List<? extends StoreProduct>> map, PresentedOfferingContext presentedOfferingContext) throws JSONException {
        r.f(jSONObject, "packageJson");
        r.f(map, "productsById");
        r.f(presentedOfferingContext, "presentedOfferingContext");
        String string = jSONObject.getString("identifier");
        StoreProduct storeProductFindMatchingProduct = findMatchingProduct(map, jSONObject);
        r.e(string, "packageIdentifier");
        PackageType packageType = OfferingParserKt.toPackageType(string);
        if (storeProductFindMatchingProduct != null) {
            return new Package(string, packageType, storeProductFindMatchingProduct.copyWithPresentedOfferingContext(presentedOfferingContext), presentedOfferingContext);
        }
        return null;
    }

    protected abstract StoreProduct findMatchingProduct(Map<String, ? extends List<? extends StoreProduct>> map, JSONObject jSONObject);
}
