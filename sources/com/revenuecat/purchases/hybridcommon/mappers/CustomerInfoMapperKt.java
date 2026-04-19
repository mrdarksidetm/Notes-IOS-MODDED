package com.revenuecat.purchases.hybridcommon.mappers;

import ae.r;
import android.net.Uri;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.common.responses.CustomerInfoResponseJsonKeys;
import com.revenuecat.purchases.models.Transaction;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import md.s;
import md.x;
import nd.c0;
import nd.q0;
import nd.r0;
import nd.v;

/* JADX INFO: loaded from: classes2.dex */
public final class CustomerInfoMapperKt {
    public static final Map<String, Object> map(CustomerInfo customerInfo) {
        r.f(customerInfo, "<this>");
        s[] sVarArr = new s[19];
        sVarArr[0] = x.a(CustomerInfoResponseJsonKeys.ENTITLEMENTS, EntitlementInfosMapperKt.map(customerInfo.getEntitlements()));
        sVarArr[1] = x.a("activeSubscriptions", c0.C0(customerInfo.getActiveSubscriptions()));
        sVarArr[2] = x.a("allPurchasedProductIdentifiers", c0.C0(customerInfo.getAllPurchasedProductIds()));
        Date latestExpirationDate = customerInfo.getLatestExpirationDate();
        sVarArr[3] = x.a("latestExpirationDate", latestExpirationDate != null ? MappersHelpersKt.toIso8601(latestExpirationDate) : null);
        Date latestExpirationDate2 = customerInfo.getLatestExpirationDate();
        sVarArr[4] = x.a("latestExpirationDateMillis", latestExpirationDate2 != null ? Long.valueOf(MappersHelpersKt.toMillis(latestExpirationDate2)) : null);
        sVarArr[5] = x.a("firstSeen", MappersHelpersKt.toIso8601(customerInfo.getFirstSeen()));
        sVarArr[6] = x.a("firstSeenMillis", Long.valueOf(MappersHelpersKt.toMillis(customerInfo.getFirstSeen())));
        sVarArr[7] = x.a("originalAppUserId", customerInfo.getOriginalAppUserId());
        sVarArr[8] = x.a("requestDate", MappersHelpersKt.toIso8601(customerInfo.getRequestDate()));
        sVarArr[9] = x.a("requestDateMillis", Long.valueOf(MappersHelpersKt.toMillis(customerInfo.getRequestDate())));
        Map<String, Date> allExpirationDatesByProduct = customerInfo.getAllExpirationDatesByProduct();
        LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(allExpirationDatesByProduct.size()));
        Iterator<T> it = allExpirationDatesByProduct.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Date date = (Date) entry.getValue();
            linkedHashMap.put(key, date != null ? MappersHelpersKt.toIso8601(date) : null);
        }
        sVarArr[10] = x.a("allExpirationDates", linkedHashMap);
        Map<String, Date> allExpirationDatesByProduct2 = customerInfo.getAllExpirationDatesByProduct();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(q0.b(allExpirationDatesByProduct2.size()));
        Iterator<T> it2 = allExpirationDatesByProduct2.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it2.next();
            Object key2 = entry2.getKey();
            Date date2 = (Date) entry2.getValue();
            linkedHashMap2.put(key2, date2 != null ? Long.valueOf(MappersHelpersKt.toMillis(date2)) : null);
        }
        sVarArr[11] = x.a("allExpirationDatesMillis", linkedHashMap2);
        Map<String, Date> allPurchaseDatesByProduct = customerInfo.getAllPurchaseDatesByProduct();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(q0.b(allPurchaseDatesByProduct.size()));
        Iterator<T> it3 = allPurchaseDatesByProduct.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry entry3 = (Map.Entry) it3.next();
            Object key3 = entry3.getKey();
            Date date3 = (Date) entry3.getValue();
            linkedHashMap3.put(key3, date3 != null ? MappersHelpersKt.toIso8601(date3) : null);
        }
        sVarArr[12] = x.a("allPurchaseDates", linkedHashMap3);
        Map<String, Date> allPurchaseDatesByProduct2 = customerInfo.getAllPurchaseDatesByProduct();
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(q0.b(allPurchaseDatesByProduct2.size()));
        Iterator<T> it4 = allPurchaseDatesByProduct2.entrySet().iterator();
        while (it4.hasNext()) {
            Map.Entry entry4 = (Map.Entry) it4.next();
            Object key4 = entry4.getKey();
            Date date4 = (Date) entry4.getValue();
            linkedHashMap4.put(key4, date4 != null ? Long.valueOf(MappersHelpersKt.toMillis(date4)) : null);
        }
        sVarArr[13] = x.a("allPurchaseDatesMillis", linkedHashMap4);
        sVarArr[14] = x.a("originalApplicationVersion", null);
        Uri managementURL = customerInfo.getManagementURL();
        sVarArr[15] = x.a("managementURL", managementURL != null ? managementURL.toString() : null);
        Date originalPurchaseDate = customerInfo.getOriginalPurchaseDate();
        sVarArr[16] = x.a("originalPurchaseDate", originalPurchaseDate != null ? MappersHelpersKt.toIso8601(originalPurchaseDate) : null);
        Date originalPurchaseDate2 = customerInfo.getOriginalPurchaseDate();
        sVarArr[17] = x.a("originalPurchaseDateMillis", originalPurchaseDate2 != null ? Long.valueOf(MappersHelpersKt.toMillis(originalPurchaseDate2)) : null);
        List<Transaction> nonSubscriptionTransactions = customerInfo.getNonSubscriptionTransactions();
        ArrayList arrayList = new ArrayList(v.x(nonSubscriptionTransactions, 10));
        Iterator<T> it5 = nonSubscriptionTransactions.iterator();
        while (it5.hasNext()) {
            arrayList.add(TransactionMapperKt.map((Transaction) it5.next()));
        }
        sVarArr[18] = x.a("nonSubscriptionTransactions", arrayList);
        return r0.h(sVarArr);
    }
}
