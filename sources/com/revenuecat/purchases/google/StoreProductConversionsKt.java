package com.revenuecat.purchases.google;

import ae.r;
import com.amazon.a.a.o.b;
import com.android.billingclient.api.h;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.models.GoogleStoreProduct;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.PricingPhase;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.models.SubscriptionOptions;
import com.revenuecat.purchases.strings.PurchaseStrings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import nd.r0;
import nd.u;
import nd.v;

/* JADX INFO: loaded from: classes2.dex */
public final class StoreProductConversionsKt {
    private static final Price createOneTimeProductPrice(h hVar) {
        h.b bVarC;
        if (ProductTypeConversionsKt.toRevenueCatProductType(hVar.e()) != ProductType.INAPP || (bVarC = hVar.c()) == null) {
            return null;
        }
        String strA = bVarC.a();
        r.e(strA, "it.formattedPrice");
        long jB = bVarC.b();
        String strC = bVarC.c();
        r.e(strC, "it.priceCurrencyCode");
        return new Price(strA, jB, strC);
    }

    public static final StoreProduct toInAppStoreProduct(h hVar) {
        r.f(hVar, "<this>");
        return toStoreProduct(hVar, u.m());
    }

    public static final GoogleStoreProduct toStoreProduct(h hVar, List<h.e> list) {
        SubscriptionOptions subscriptionOptions;
        Price price;
        PricingPhase fullPricePhase;
        r.f(hVar, "<this>");
        r.f(list, "offerDetails");
        if (ProductTypeConversionsKt.toRevenueCatProductType(hVar.e()) == ProductType.SUBS) {
            ArrayList arrayList = new ArrayList(v.x(list, 10));
            for (h.e eVar : list) {
                String strD = hVar.d();
                r.e(strD, "productId");
                arrayList.add(SubscriptionOptionConversionsKt.toSubscriptionOption(eVar, strD, hVar));
            }
            subscriptionOptions = new SubscriptionOptions(arrayList);
        } else {
            subscriptionOptions = null;
        }
        SubscriptionOption basePlan = subscriptionOptions != null ? subscriptionOptions.getBasePlan() : null;
        Price price2 = (basePlan == null || (fullPricePhase = basePlan.getFullPricePhase()) == null) ? null : fullPricePhase.getPrice();
        Price priceCreateOneTimeProductPrice = createOneTimeProductPrice(hVar);
        if (priceCreateOneTimeProductPrice != null) {
            price = priceCreateOneTimeProductPrice;
        } else {
            if (price2 == null) {
                return null;
            }
            price = price2;
        }
        String strD2 = hVar.d();
        r.e(strD2, "productId");
        String id2 = basePlan != null ? basePlan.getId() : null;
        ProductType revenueCatProductType = ProductTypeConversionsKt.toRevenueCatProductType(hVar.e());
        String strB = hVar.b();
        r.e(strB, "name");
        String strG = hVar.g();
        r.e(strG, b.S);
        String strA = hVar.a();
        r.e(strA, b.f7429c);
        return new GoogleStoreProduct(strD2, id2, revenueCatProductType, price, strB, strG, strA, basePlan != null ? basePlan.getBillingPeriod() : null, subscriptionOptions, subscriptionOptions != null ? subscriptionOptions.getDefaultOffer() : null, hVar, (PresentedOfferingContext) null);
    }

    public static final List<StoreProduct> toStoreProducts(List<h> list) {
        List listM;
        Map mapE;
        r.f(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (h hVar : list) {
            List<h.e> listF = hVar.f();
            if (listF != null) {
                r.e(listF, "subscriptionOfferDetails");
                listM = new ArrayList();
                for (Object obj : listF) {
                    h.e eVar = (h.e) obj;
                    r.e(eVar, "it");
                    if (SubscriptionOptionConversionsKt.isBasePlan(eVar)) {
                        listM.add(obj);
                    }
                }
            } else {
                listM = u.m();
            }
            List<h.e> listF2 = hVar.f();
            if (listF2 != null) {
                r.e(listF2, "subscriptionOfferDetails");
                mapE = new LinkedHashMap();
                for (Object obj2 : listF2) {
                    String strA = ((h.e) obj2).a();
                    Object arrayList2 = mapE.get(strA);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        mapE.put(strA, arrayList2);
                    }
                    ((List) arrayList2).add(obj2);
                }
            } else {
                mapE = r0.e();
            }
            if (listM.isEmpty()) {
                listM = null;
            }
            if (listM != null) {
                Iterator it = listM.iterator();
                while (it.hasNext()) {
                    List listM2 = (List) mapE.get(((h.e) it.next()).a());
                    if (listM2 == null) {
                        listM2 = u.m();
                    }
                    GoogleStoreProduct storeProduct = toStoreProduct(hVar, listM2);
                    if (storeProduct != null) {
                        arrayList.add(storeProduct);
                    } else {
                        LogIntent logIntent = LogIntent.RC_ERROR;
                        String str = String.format(PurchaseStrings.INVALID_PRODUCT_NO_PRICE, Arrays.copyOf(new Object[]{hVar.d()}, 1));
                        r.e(str, "format(this, *args)");
                        LogWrapperKt.log(logIntent, str);
                    }
                }
            } else {
                StoreProduct inAppStoreProduct = toInAppStoreProduct(hVar);
                if (inAppStoreProduct != null) {
                    arrayList.add(inAppStoreProduct);
                } else {
                    LogIntent logIntent2 = LogIntent.RC_ERROR;
                    String str2 = String.format(PurchaseStrings.INVALID_PRODUCT_NO_PRICE, Arrays.copyOf(new Object[]{hVar.d()}, 1));
                    r.e(str2, "format(this, *args)");
                    LogWrapperKt.log(logIntent2, str2);
                }
            }
        }
        return arrayList;
    }
}
