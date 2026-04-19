package com.revenuecat.purchases.deeplinks;

import ae.r;
import android.net.Uri;
import com.revenuecat.purchases.WebPurchaseRedemption;
import com.revenuecat.purchases.common.LogUtilsKt;
import je.v;

/* JADX INFO: loaded from: classes2.dex */
public final class DeepLinkParser {
    public static final DeepLinkParser INSTANCE = new DeepLinkParser();
    private static final String REDEEM_WEB_PURCHASE_HOST = "redeem_web_purchase";

    private DeepLinkParser() {
    }

    public final WebPurchaseRedemption parseWebPurchaseRedemption(Uri uri) {
        String str;
        r.f(uri, "data");
        if (r.b(uri.getHost(), REDEEM_WEB_PURCHASE_HOST)) {
            String queryParameter = uri.getQueryParameter("redemption_token");
            if (!(queryParameter == null || v.v(queryParameter))) {
                return new WebPurchaseRedemption(queryParameter);
            }
            str = "Redemption token is missing web redemption deep link. Ignoring.";
        } else {
            str = "Unrecognized deep link host: " + uri.getHost() + ". Ignoring";
        }
        LogUtilsKt.debugLog(str);
        return null;
    }
}
