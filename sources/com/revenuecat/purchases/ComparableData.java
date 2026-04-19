package com.revenuecat.purchases;

import ae.r;
import com.revenuecat.purchases.common.responses.CustomerInfoResponseJsonKeys;
import java.util.Date;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class ComparableData {
    private final Map<String, Date> allExpirationDatesByProduct;
    private final Map<String, Date> allPurchaseDatesByProduct;
    private final EntitlementInfos entitlements;
    private final Date firstSeen;
    private final String originalAppUserId;
    private final Date originalPurchaseDate;
    private final int schemaVersion;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ComparableData(CustomerInfo customerInfo) {
        this(customerInfo.getEntitlements(), customerInfo.getAllExpirationDatesByProduct(), customerInfo.getAllPurchaseDatesByProduct(), customerInfo.getSchemaVersion(), customerInfo.getFirstSeen(), customerInfo.getOriginalAppUserId(), customerInfo.getOriginalPurchaseDate());
        r.f(customerInfo, "customerInfo");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ComparableData(EntitlementInfos entitlementInfos, Map<String, ? extends Date> map, Map<String, ? extends Date> map2, int i10, Date date, String str, Date date2) {
        r.f(entitlementInfos, CustomerInfoResponseJsonKeys.ENTITLEMENTS);
        r.f(map, "allExpirationDatesByProduct");
        r.f(map2, "allPurchaseDatesByProduct");
        r.f(date, "firstSeen");
        r.f(str, "originalAppUserId");
        this.entitlements = entitlementInfos;
        this.allExpirationDatesByProduct = map;
        this.allPurchaseDatesByProduct = map2;
        this.schemaVersion = i10;
        this.firstSeen = date;
        this.originalAppUserId = str;
        this.originalPurchaseDate = date2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ComparableData copy$default(ComparableData comparableData, EntitlementInfos entitlementInfos, Map map, Map map2, int i10, Date date, String str, Date date2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            entitlementInfos = comparableData.entitlements;
        }
        if ((i11 & 2) != 0) {
            map = comparableData.allExpirationDatesByProduct;
        }
        Map map3 = map;
        if ((i11 & 4) != 0) {
            map2 = comparableData.allPurchaseDatesByProduct;
        }
        Map map4 = map2;
        if ((i11 & 8) != 0) {
            i10 = comparableData.schemaVersion;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            date = comparableData.firstSeen;
        }
        Date date3 = date;
        if ((i11 & 32) != 0) {
            str = comparableData.originalAppUserId;
        }
        String str2 = str;
        if ((i11 & 64) != 0) {
            date2 = comparableData.originalPurchaseDate;
        }
        return comparableData.copy(entitlementInfos, map3, map4, i12, date3, str2, date2);
    }

    public final EntitlementInfos component1() {
        return this.entitlements;
    }

    public final Map<String, Date> component2() {
        return this.allExpirationDatesByProduct;
    }

    public final Map<String, Date> component3() {
        return this.allPurchaseDatesByProduct;
    }

    public final int component4() {
        return this.schemaVersion;
    }

    public final Date component5() {
        return this.firstSeen;
    }

    public final String component6() {
        return this.originalAppUserId;
    }

    public final Date component7() {
        return this.originalPurchaseDate;
    }

    public final ComparableData copy(EntitlementInfos entitlementInfos, Map<String, ? extends Date> map, Map<String, ? extends Date> map2, int i10, Date date, String str, Date date2) {
        r.f(entitlementInfos, CustomerInfoResponseJsonKeys.ENTITLEMENTS);
        r.f(map, "allExpirationDatesByProduct");
        r.f(map2, "allPurchaseDatesByProduct");
        r.f(date, "firstSeen");
        r.f(str, "originalAppUserId");
        return new ComparableData(entitlementInfos, map, map2, i10, date, str, date2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComparableData)) {
            return false;
        }
        ComparableData comparableData = (ComparableData) obj;
        return r.b(this.entitlements, comparableData.entitlements) && r.b(this.allExpirationDatesByProduct, comparableData.allExpirationDatesByProduct) && r.b(this.allPurchaseDatesByProduct, comparableData.allPurchaseDatesByProduct) && this.schemaVersion == comparableData.schemaVersion && r.b(this.firstSeen, comparableData.firstSeen) && r.b(this.originalAppUserId, comparableData.originalAppUserId) && r.b(this.originalPurchaseDate, comparableData.originalPurchaseDate);
    }

    public final Map<String, Date> getAllExpirationDatesByProduct() {
        return this.allExpirationDatesByProduct;
    }

    public final Map<String, Date> getAllPurchaseDatesByProduct() {
        return this.allPurchaseDatesByProduct;
    }

    public final EntitlementInfos getEntitlements() {
        return this.entitlements;
    }

    public final Date getFirstSeen() {
        return this.firstSeen;
    }

    public final String getOriginalAppUserId() {
        return this.originalAppUserId;
    }

    public final Date getOriginalPurchaseDate() {
        return this.originalPurchaseDate;
    }

    public final int getSchemaVersion() {
        return this.schemaVersion;
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.entitlements.hashCode() * 31) + this.allExpirationDatesByProduct.hashCode()) * 31) + this.allPurchaseDatesByProduct.hashCode()) * 31) + Integer.hashCode(this.schemaVersion)) * 31) + this.firstSeen.hashCode()) * 31) + this.originalAppUserId.hashCode()) * 31;
        Date date = this.originalPurchaseDate;
        return iHashCode + (date == null ? 0 : date.hashCode());
    }

    public String toString() {
        return "ComparableData(entitlements=" + this.entitlements + ", allExpirationDatesByProduct=" + this.allExpirationDatesByProduct + ", allPurchaseDatesByProduct=" + this.allPurchaseDatesByProduct + ", schemaVersion=" + this.schemaVersion + ", firstSeen=" + this.firstSeen + ", originalAppUserId=" + this.originalAppUserId + ", originalPurchaseDate=" + this.originalPurchaseDate + ')';
    }
}
