package com.revenuecat.purchases.hybridcommon.mappers;

import ae.r;
import com.revenuecat.purchases.EntitlementInfo;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import java.util.Date;
import java.util.Map;
import md.s;
import md.x;
import nd.r0;

/* JADX INFO: loaded from: classes2.dex */
public final class EntitlementInfoMapperKt {
    public static final Map<String, Object> map(EntitlementInfo entitlementInfo) {
        r.f(entitlementInfo, "<this>");
        s[] sVarArr = new s[20];
        sVarArr[0] = x.a("identifier", entitlementInfo.getIdentifier());
        sVarArr[1] = x.a("isActive", Boolean.valueOf(entitlementInfo.isActive()));
        sVarArr[2] = x.a("willRenew", Boolean.valueOf(entitlementInfo.getWillRenew()));
        sVarArr[3] = x.a("periodType", entitlementInfo.getPeriodType().name());
        sVarArr[4] = x.a("latestPurchaseDateMillis", Long.valueOf(MappersHelpersKt.toMillis(entitlementInfo.getLatestPurchaseDate())));
        sVarArr[5] = x.a("latestPurchaseDate", MappersHelpersKt.toIso8601(entitlementInfo.getLatestPurchaseDate()));
        sVarArr[6] = x.a("originalPurchaseDateMillis", Long.valueOf(MappersHelpersKt.toMillis(entitlementInfo.getOriginalPurchaseDate())));
        sVarArr[7] = x.a("originalPurchaseDate", MappersHelpersKt.toIso8601(entitlementInfo.getOriginalPurchaseDate()));
        Date expirationDate = entitlementInfo.getExpirationDate();
        sVarArr[8] = x.a("expirationDateMillis", expirationDate != null ? Long.valueOf(MappersHelpersKt.toMillis(expirationDate)) : null);
        Date expirationDate2 = entitlementInfo.getExpirationDate();
        sVarArr[9] = x.a("expirationDate", expirationDate2 != null ? MappersHelpersKt.toIso8601(expirationDate2) : null);
        sVarArr[10] = x.a(ProductResponseJsonKeys.STORE, entitlementInfo.getStore().name());
        sVarArr[11] = x.a("productIdentifier", entitlementInfo.getProductIdentifier());
        sVarArr[12] = x.a("productPlanIdentifier", entitlementInfo.getProductPlanIdentifier());
        sVarArr[13] = x.a("isSandbox", Boolean.valueOf(entitlementInfo.isSandbox()));
        Date unsubscribeDetectedAt = entitlementInfo.getUnsubscribeDetectedAt();
        sVarArr[14] = x.a("unsubscribeDetectedAt", unsubscribeDetectedAt != null ? MappersHelpersKt.toIso8601(unsubscribeDetectedAt) : null);
        Date unsubscribeDetectedAt2 = entitlementInfo.getUnsubscribeDetectedAt();
        sVarArr[15] = x.a("unsubscribeDetectedAtMillis", unsubscribeDetectedAt2 != null ? Long.valueOf(MappersHelpersKt.toMillis(unsubscribeDetectedAt2)) : null);
        Date billingIssueDetectedAt = entitlementInfo.getBillingIssueDetectedAt();
        sVarArr[16] = x.a("billingIssueDetectedAt", billingIssueDetectedAt != null ? MappersHelpersKt.toIso8601(billingIssueDetectedAt) : null);
        Date billingIssueDetectedAt2 = entitlementInfo.getBillingIssueDetectedAt();
        sVarArr[17] = x.a("billingIssueDetectedAtMillis", billingIssueDetectedAt2 != null ? Long.valueOf(MappersHelpersKt.toMillis(billingIssueDetectedAt2)) : null);
        sVarArr[18] = x.a("ownershipType", entitlementInfo.getOwnershipType().name());
        sVarArr[19] = x.a("verification", entitlementInfo.getVerification().name());
        return r0.h(sVarArr);
    }
}
