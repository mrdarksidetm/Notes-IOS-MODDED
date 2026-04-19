package com.revenuecat.purchases.amazon;

import ae.r;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.utils.JSONObjectExtensionsKt;
import java.util.Arrays;
import java.util.Map;
import md.l;
import md.n;
import nd.r0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class AmazonCache {
    private final l amazonPostedTokensKey$delegate;
    private final DeviceCache deviceCache;

    public AmazonCache(DeviceCache deviceCache) {
        r.f(deviceCache, "deviceCache");
        this.deviceCache = deviceCache;
        this.amazonPostedTokensKey$delegate = n.b(new AmazonCache$amazonPostedTokensKey$2(this));
    }

    public final synchronized void addSuccessfullyPostedToken(String str) {
        r.f(str, "token");
        this.deviceCache.addSuccessfullyPostedToken(str);
    }

    public final synchronized void cacheSkusByToken(Map<String, String> map) {
        r.f(map, "receiptsToSkus");
        LogIntent logIntent = LogIntent.DEBUG;
        String str = String.format(AmazonStrings.CACHING_RECEIPT_TERM_SKUS, Arrays.copyOf(new Object[]{map}, 1));
        r.e(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        JSONObject jSONObject = new JSONObject(r0.l(getReceiptSkus(), map));
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("receiptsToSkus", jSONObject);
        DeviceCache deviceCache = this.deviceCache;
        String amazonPostedTokensKey$purchases_defaultsRelease = getAmazonPostedTokensKey$purchases_defaultsRelease();
        String string = jSONObject2.toString();
        r.e(string, "jsonToCache.toString()");
        deviceCache.putString(amazonPostedTokensKey$purchases_defaultsRelease, string);
    }

    public final String getAmazonPostedTokensKey$purchases_defaultsRelease() {
        return (String) this.amazonPostedTokensKey$delegate.getValue();
    }

    public final synchronized Map<String, String> getReceiptSkus() {
        Map<String, String> mapE;
        JSONObject jSONObjectOrNull = this.deviceCache.getJSONObjectOrNull(getAmazonPostedTokensKey$purchases_defaultsRelease());
        JSONObject jSONObject = jSONObjectOrNull != null ? jSONObjectOrNull.getJSONObject("receiptsToSkus") : null;
        if (jSONObject == null || (mapE = JSONObjectExtensionsKt.toMap$default(jSONObject, false, 1, null)) == null) {
            mapE = r0.e();
        }
        return mapE;
    }
}
