package com.revenuecat.purchases.common;

import ae.r;
import com.revenuecat.purchases.EntitlementInfo;
import com.revenuecat.purchases.EntitlementInfos;
import com.revenuecat.purchases.OwnershipType;
import com.revenuecat.purchases.PeriodType;
import com.revenuecat.purchases.Store;
import com.revenuecat.purchases.VerificationResult;
import com.revenuecat.purchases.common.responses.CustomerInfoResponseJsonKeys;
import com.revenuecat.purchases.common.responses.EntitlementsResponseJsonKeys;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import com.revenuecat.purchases.strings.PurchaseStrings;
import com.revenuecat.purchases.utils.DateActive;
import com.revenuecat.purchases.utils.DateHelper;
import com.revenuecat.purchases.utils.JSONObjectExtensionsKt;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class EntitlementInfoFactoriesKt {
    public static final EntitlementInfo buildEntitlementInfo(JSONObject jSONObject, String str, JSONObject jSONObject2, Date date, VerificationResult verificationResult) throws JSONException {
        r.f(jSONObject, "<this>");
        r.f(str, "identifier");
        r.f(jSONObject2, "productData");
        r.f(date, "requestDate");
        r.f(verificationResult, "verificationResult");
        Date dateOptDate = JSONObjectExtensionsKt.optDate(jSONObject, "expires_date");
        Date dateOptDate2 = JSONObjectExtensionsKt.optDate(jSONObject2, ProductResponseJsonKeys.UNSUBSCRIBE_DETECTED_AT);
        Date dateOptDate3 = JSONObjectExtensionsKt.optDate(jSONObject2, ProductResponseJsonKeys.BILLING_ISSUES_DETECTED_AT);
        Store store = getStore(jSONObject2, ProductResponseJsonKeys.STORE);
        boolean zIsDateActive = isDateActive(str, dateOptDate, date);
        boolean willRenew = getWillRenew(store, dateOptDate, dateOptDate2, dateOptDate3);
        PeriodType periodTypeOptPeriodType = optPeriodType(jSONObject2, ProductResponseJsonKeys.PERIOD_TYPE);
        Date date2 = JSONObjectExtensionsKt.getDate(jSONObject, "purchase_date");
        Date date3 = JSONObjectExtensionsKt.getDate(jSONObject2, "original_purchase_date");
        String string = jSONObject.getString(EntitlementsResponseJsonKeys.PRODUCT_IDENTIFIER);
        r.e(string, "getString(EntitlementsRe…nKeys.PRODUCT_IDENTIFIER)");
        return new EntitlementInfo(str, zIsDateActive, willRenew, periodTypeOptPeriodType, date2, date3, dateOptDate, store, string, JSONObjectExtensionsKt.optNullableString(jSONObject, "product_plan_identifier"), jSONObject2.getBoolean(ProductResponseJsonKeys.IS_SANDBOX), dateOptDate2, dateOptDate3, optOwnershipType(jSONObject2, ProductResponseJsonKeys.OWNERSHIP_TYPE), jSONObject, verificationResult);
    }

    public static final EntitlementInfos buildEntitlementInfos(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, Date date, VerificationResult verificationResult) {
        JSONObject jSONObject4;
        String str;
        r.f(jSONObject, "<this>");
        r.f(jSONObject2, CustomerInfoResponseJsonKeys.SUBSCRIPTIONS);
        r.f(jSONObject3, "nonSubscriptionsLatestPurchases");
        r.f(date, "requestDate");
        r.f(verificationResult, "verificationResult");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = jSONObject.keys();
        r.e(itKeys, "keys()");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            JSONObject jSONObject5 = jSONObject.getJSONObject(next);
            String strOptString = jSONObject5.optString(EntitlementsResponseJsonKeys.PRODUCT_IDENTIFIER);
            r.e(strOptString, "it");
            if (!(strOptString.length() > 0)) {
                strOptString = null;
            }
            if (strOptString != null) {
                if (jSONObject2.has(strOptString)) {
                    r.e(next, "entitlementId");
                    r.e(jSONObject5, "entitlement");
                    jSONObject4 = jSONObject2.getJSONObject(strOptString);
                    str = "subscriptions.getJSONObject(productIdentifier)";
                } else if (jSONObject3.has(strOptString)) {
                    r.e(next, "entitlementId");
                    r.e(jSONObject5, "entitlement");
                    jSONObject4 = jSONObject3.getJSONObject(strOptString);
                    str = "nonSubscriptionsLatestPu…Object(productIdentifier)";
                }
                r.e(jSONObject4, str);
                linkedHashMap.put(next, buildEntitlementInfo(jSONObject5, next, jSONObject4, date, verificationResult));
            }
        }
        return new EntitlementInfos(linkedHashMap, verificationResult);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Store getStore(JSONObject jSONObject, String str) throws JSONException {
        r.f(jSONObject, "<this>");
        r.f(str, "name");
        String string = jSONObject.getString(str);
        if (string != null) {
            switch (string.hashCode()) {
                case -1820761141:
                    if (string.equals("external")) {
                        return Store.EXTERNAL;
                    }
                    break;
                case -1523640723:
                    if (string.equals("rc_billing")) {
                        return Store.RC_BILLING;
                    }
                    break;
                case -1414265340:
                    if (string.equals("amazon")) {
                        return Store.AMAZON;
                    }
                    break;
                case -891985843:
                    if (string.equals("stripe")) {
                        return Store.STRIPE;
                    }
                    break;
                case 564036179:
                    if (string.equals("mac_app_store")) {
                        return Store.MAC_APP_STORE;
                    }
                    break;
                case 756050958:
                    if (string.equals("promotional")) {
                        return Store.PROMOTIONAL;
                    }
                    break;
                case 1842542915:
                    if (string.equals("app_store")) {
                        return Store.APP_STORE;
                    }
                    break;
                case 1925951510:
                    if (string.equals("play_store")) {
                        return Store.PLAY_STORE;
                    }
                    break;
            }
        }
        return Store.UNKNOWN_STORE;
    }

    private static final boolean getWillRenew(Store store, Date date, Date date2, Date date3) {
        return ((store == Store.PROMOTIONAL) || (date == null) || (date2 != null) || (date3 != null)) ? false : true;
    }

    private static final boolean isDateActive(String str, Date date, Date date2) {
        DateActive dateActiveM283isDateActiveSxA4cEA$default = DateHelper.Companion.m283isDateActiveSxA4cEA$default(DateHelper.Companion, date, date2, 0L, 4, null);
        if (!dateActiveM283isDateActiveSxA4cEA$default.isActive() && !dateActiveM283isDateActiveSxA4cEA$default.getInGracePeriod()) {
            String str2 = String.format(PurchaseStrings.ENTITLEMENT_EXPIRED_OUTSIDE_GRACE_PERIOD, Arrays.copyOf(new Object[]{str, date, date2}, 3));
            r.e(str2, "format(this, *args)");
            LogUtilsKt.warnLog(str2);
        }
        return dateActiveM283isDateActiveSxA4cEA$default.isActive();
    }

    public static final OwnershipType optOwnershipType(JSONObject jSONObject, String str) {
        r.f(jSONObject, "<this>");
        r.f(str, "name");
        String strOptString = jSONObject.optString(str);
        return r.b(strOptString, "PURCHASED") ? OwnershipType.PURCHASED : r.b(strOptString, "FAMILY_SHARED") ? OwnershipType.FAMILY_SHARED : OwnershipType.UNKNOWN;
    }

    public static final PeriodType optPeriodType(JSONObject jSONObject, String str) {
        r.f(jSONObject, "<this>");
        r.f(str, "name");
        String strOptString = jSONObject.optString(str);
        if (strOptString != null) {
            int iHashCode = strOptString.hashCode();
            if (iHashCode == -1039745817) {
                strOptString.equals("normal");
            } else if (iHashCode != 100361836) {
                if (iHashCode == 110628630 && strOptString.equals("trial")) {
                    return PeriodType.TRIAL;
                }
            } else if (strOptString.equals("intro")) {
                return PeriodType.INTRO;
            }
        }
        return PeriodType.NORMAL;
    }
}
