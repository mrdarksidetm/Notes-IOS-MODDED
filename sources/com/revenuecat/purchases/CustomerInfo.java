package com.revenuecat.purchases;

import ae.r;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.revenuecat.purchases.common.responses.CustomerInfoResponseJsonKeys;
import com.revenuecat.purchases.models.RawDataContainer;
import com.revenuecat.purchases.models.Transaction;
import com.revenuecat.purchases.utils.DateHelper;
import com.revenuecat.purchases.utils.JSONObjectParceler;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import md.l;
import md.n;
import md.x;
import nd.q0;
import nd.r0;
import nd.v;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class CustomerInfo implements Parcelable, RawDataContainer<JSONObject> {
    public static final Parcelable.Creator<CustomerInfo> CREATOR = new Creator();
    private final l activeSubscriptions$delegate;
    private final Map<String, Date> allExpirationDatesByProduct;
    private final Map<String, Date> allPurchaseDatesByProduct;
    private final l allPurchasedProductIds$delegate;
    private final l allPurchasedSkus$delegate;
    private final EntitlementInfos entitlements;
    private final Date firstSeen;
    private final JSONObject jsonObject;
    private final l latestExpirationDate$delegate;
    private final Uri managementURL;
    private final l nonSubscriptionTransactions$delegate;
    private final String originalAppUserId;
    private final Date originalPurchaseDate;
    private final Date requestDate;
    private final int schemaVersion;
    private final JSONObject subscriberJSONObject;

    public static final class Creator implements Parcelable.Creator<CustomerInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CustomerInfo createFromParcel(Parcel parcel) {
            r.f(parcel, "parcel");
            EntitlementInfos entitlementInfosCreateFromParcel = EntitlementInfos.CREATOR.createFromParcel(parcel);
            int i10 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i10);
            for (int i11 = 0; i11 != i10; i11++) {
                linkedHashMap.put(parcel.readString(), parcel.readSerializable());
            }
            int i12 = parcel.readInt();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(i12);
            for (int i13 = 0; i13 != i12; i13++) {
                linkedHashMap2.put(parcel.readString(), parcel.readSerializable());
            }
            return new CustomerInfo(entitlementInfosCreateFromParcel, linkedHashMap, linkedHashMap2, (Date) parcel.readSerializable(), parcel.readInt(), (Date) parcel.readSerializable(), parcel.readString(), (Uri) parcel.readParcelable(CustomerInfo.class.getClassLoader()), (Date) parcel.readSerializable(), JSONObjectParceler.INSTANCE.create(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CustomerInfo[] newArray(int i10) {
            return new CustomerInfo[i10];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CustomerInfo(EntitlementInfos entitlementInfos, Map<String, ? extends Date> map, Map<String, ? extends Date> map2, Date date, int i10, Date date2, String str, Uri uri, Date date3, JSONObject jSONObject) {
        r.f(entitlementInfos, CustomerInfoResponseJsonKeys.ENTITLEMENTS);
        r.f(map, "allExpirationDatesByProduct");
        r.f(map2, "allPurchaseDatesByProduct");
        r.f(date, "requestDate");
        r.f(date2, "firstSeen");
        r.f(str, "originalAppUserId");
        r.f(jSONObject, "jsonObject");
        this.entitlements = entitlementInfos;
        this.allExpirationDatesByProduct = map;
        this.allPurchaseDatesByProduct = map2;
        this.requestDate = date;
        this.schemaVersion = i10;
        this.firstSeen = date2;
        this.originalAppUserId = str;
        this.managementURL = uri;
        this.originalPurchaseDate = date3;
        this.jsonObject = jSONObject;
        this.activeSubscriptions$delegate = n.b(new CustomerInfo$activeSubscriptions$2(this));
        this.allPurchasedSkus$delegate = n.b(new CustomerInfo$allPurchasedSkus$2(this));
        this.allPurchasedProductIds$delegate = n.b(new CustomerInfo$allPurchasedProductIds$2(this));
        this.latestExpirationDate$delegate = n.b(new CustomerInfo$latestExpirationDate$2(this));
        this.nonSubscriptionTransactions$delegate = n.b(new CustomerInfo$nonSubscriptionTransactions$2(this));
        this.subscriberJSONObject = jSONObject.getJSONObject(CustomerInfoResponseJsonKeys.SUBSCRIBER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Set<String> activeIdentifiers(Map<String, ? extends Date> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ? extends Date> entry : map.entrySet()) {
            if (DateHelper.Companion.m283isDateActiveSxA4cEA$default(DateHelper.Companion, entry.getValue(), this.requestDate, 0L, 4, null).isActive()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap.keySet();
    }

    private final JSONObject component10() {
        return this.jsonObject;
    }

    public static /* synthetic */ void getActiveSubscriptions$annotations() {
    }

    public static /* synthetic */ void getAllPurchasedProductIds$annotations() {
    }

    public static /* synthetic */ void getAllPurchasedSkus$annotations() {
    }

    public static /* synthetic */ void getLatestExpirationDate$annotations() {
    }

    public static /* synthetic */ void getNonSubscriptionTransactions$annotations() {
    }

    public static /* synthetic */ void getRawData$annotations() {
    }

    private static /* synthetic */ void getSubscriberJSONObject$annotations() {
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

    public final Date component4() {
        return this.requestDate;
    }

    public final int component5() {
        return this.schemaVersion;
    }

    public final Date component6() {
        return this.firstSeen;
    }

    public final String component7() {
        return this.originalAppUserId;
    }

    public final Uri component8() {
        return this.managementURL;
    }

    public final Date component9() {
        return this.originalPurchaseDate;
    }

    public final CustomerInfo copy(EntitlementInfos entitlementInfos, Map<String, ? extends Date> map, Map<String, ? extends Date> map2, Date date, int i10, Date date2, String str, Uri uri, Date date3, JSONObject jSONObject) {
        r.f(entitlementInfos, CustomerInfoResponseJsonKeys.ENTITLEMENTS);
        r.f(map, "allExpirationDatesByProduct");
        r.f(map2, "allPurchaseDatesByProduct");
        r.f(date, "requestDate");
        r.f(date2, "firstSeen");
        r.f(str, "originalAppUserId");
        r.f(jSONObject, "jsonObject");
        return new CustomerInfo(entitlementInfos, map, map2, date, i10, date2, str, uri, date3, jSONObject);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return (obj instanceof CustomerInfo) && r.b(new ComparableData(this), new ComparableData((CustomerInfo) obj));
    }

    public final Set<String> getActiveSubscriptions() {
        return (Set) this.activeSubscriptions$delegate.getValue();
    }

    public final Map<String, Date> getAllExpirationDatesByProduct() {
        return this.allExpirationDatesByProduct;
    }

    public final Map<String, Date> getAllPurchaseDatesByProduct() {
        return this.allPurchaseDatesByProduct;
    }

    public final Set<String> getAllPurchasedProductIds() {
        return (Set) this.allPurchasedProductIds$delegate.getValue();
    }

    public final Set<String> getAllPurchasedSkus() {
        return (Set) this.allPurchasedSkus$delegate.getValue();
    }

    public final EntitlementInfos getEntitlements() {
        return this.entitlements;
    }

    public final Date getExpirationDateForEntitlement(String str) {
        r.f(str, "entitlement");
        EntitlementInfo entitlementInfo = this.entitlements.getAll().get(str);
        if (entitlementInfo != null) {
            return entitlementInfo.getExpirationDate();
        }
        return null;
    }

    public final Date getExpirationDateForProductId(String str) {
        r.f(str, "productId");
        return this.allExpirationDatesByProduct.get(str);
    }

    public final Date getExpirationDateForSku(String str) {
        r.f(str, "sku");
        return this.allExpirationDatesByProduct.get(str);
    }

    public final Date getFirstSeen() {
        return this.firstSeen;
    }

    public final Date getLatestExpirationDate() {
        return (Date) this.latestExpirationDate$delegate.getValue();
    }

    public final Uri getManagementURL() {
        return this.managementURL;
    }

    public final List<Transaction> getNonSubscriptionTransactions() {
        return (List) this.nonSubscriptionTransactions$delegate.getValue();
    }

    public final String getOriginalAppUserId() {
        return this.originalAppUserId;
    }

    public final Date getOriginalPurchaseDate() {
        return this.originalPurchaseDate;
    }

    public final Date getPurchaseDateForEntitlement(String str) {
        r.f(str, "entitlement");
        EntitlementInfo entitlementInfo = this.entitlements.getAll().get(str);
        if (entitlementInfo != null) {
            return entitlementInfo.getLatestPurchaseDate();
        }
        return null;
    }

    public final Date getPurchaseDateForProductId(String str) {
        r.f(str, "productId");
        return this.allPurchaseDatesByProduct.get(str);
    }

    public final Date getPurchaseDateForSku(String str) {
        r.f(str, "sku");
        return this.allPurchaseDatesByProduct.get(str);
    }

    @Override // com.revenuecat.purchases.models.RawDataContainer
    public JSONObject getRawData() {
        return this.jsonObject;
    }

    public final Date getRequestDate() {
        return this.requestDate;
    }

    public final int getSchemaVersion() {
        return this.schemaVersion;
    }

    public int hashCode() {
        return new ComparableData(this).hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("<CustomerInfo\n latestExpirationDate: ");
        sb2.append(getLatestExpirationDate());
        sb2.append("\nactiveSubscriptions:  ");
        Set<String> activeSubscriptions = getActiveSubscriptions();
        ArrayList arrayList = new ArrayList(v.x(activeSubscriptions, 10));
        for (String str : activeSubscriptions) {
            arrayList.add(x.a(str, q0.c(x.a("expiresDate", getExpirationDateForProductId(str)))));
        }
        sb2.append(r0.r(arrayList));
        sb2.append(",\nactiveEntitlements: ");
        Map<String, EntitlementInfo> active = this.entitlements.getActive();
        ArrayList arrayList2 = new ArrayList(active.size());
        Iterator<Map.Entry<String, EntitlementInfo>> it = active.entrySet().iterator();
        while (it.hasNext()) {
            arrayList2.add(it.next().toString());
        }
        sb2.append(arrayList2);
        sb2.append(",\nentitlements: ");
        Map<String, EntitlementInfo> all = this.entitlements.getAll();
        ArrayList arrayList3 = new ArrayList(all.size());
        Iterator<Map.Entry<String, EntitlementInfo>> it2 = all.entrySet().iterator();
        while (it2.hasNext()) {
            arrayList3.add(it2.next().toString());
        }
        sb2.append(arrayList3);
        sb2.append(",\nnonSubscriptionTransactions: ");
        sb2.append(getNonSubscriptionTransactions());
        sb2.append(",\nrequestDate: ");
        sb2.append(this.requestDate);
        sb2.append("\n>");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        r.f(parcel, "out");
        this.entitlements.writeToParcel(parcel, i10);
        Map<String, Date> map = this.allExpirationDatesByProduct;
        parcel.writeInt(map.size());
        for (Map.Entry<String, Date> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeSerializable(entry.getValue());
        }
        Map<String, Date> map2 = this.allPurchaseDatesByProduct;
        parcel.writeInt(map2.size());
        for (Map.Entry<String, Date> entry2 : map2.entrySet()) {
            parcel.writeString(entry2.getKey());
            parcel.writeSerializable(entry2.getValue());
        }
        parcel.writeSerializable(this.requestDate);
        parcel.writeInt(this.schemaVersion);
        parcel.writeSerializable(this.firstSeen);
        parcel.writeString(this.originalAppUserId);
        parcel.writeParcelable(this.managementURL, i10);
        parcel.writeSerializable(this.originalPurchaseDate);
        JSONObjectParceler.INSTANCE.write(this.jsonObject, parcel, i10);
    }
}
