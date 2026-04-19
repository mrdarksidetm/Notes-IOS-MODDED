package com.revenuecat.purchases.common.offerings;

import ae.r;
import ae.s;
import com.revenuecat.purchases.Offerings;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.OfferingParser;
import com.revenuecat.purchases.common.offerings.OfferingsFactory;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.strings.OfferingStrings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import je.v;
import md.i0;
import nd.c0;
import nd.r0;
import nd.z0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import we.g;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
public final class OfferingsFactory {
    private final BillingAbstract billing;
    private final Dispatcher dispatcher;
    private final OfferingParser offeringParser;

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offerings.OfferingsFactory$createOfferings$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements l<Map<String, ? extends List<? extends StoreProduct>>, i0> {
        final /* synthetic */ Set<String> $allRequestedProductIdentifiers;
        final /* synthetic */ JSONObject $offeringsJSON;
        final /* synthetic */ l<PurchasesError, i0> $onError;
        final /* synthetic */ l<Offerings, i0> $onSuccess;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Set<String> set, JSONObject jSONObject, l<? super PurchasesError, i0> lVar, l<? super Offerings, i0> lVar2) {
            super(1);
            this.$allRequestedProductIdentifiers = set;
            this.$offeringsJSON = jSONObject;
            this.$onError = lVar;
            this.$onSuccess = lVar2;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(Map<String, ? extends List<? extends StoreProduct>> map) throws Exception {
            invoke2(map);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Map<String, ? extends List<? extends StoreProduct>> map) throws Exception {
            r.f(map, "productsById");
            try {
                OfferingsFactory.this.logMissingProducts(this.$allRequestedProductIdentifiers, map);
                Offerings offeringsCreateOfferings = OfferingsFactory.this.offeringParser.createOfferings(this.$offeringsJSON, map);
                if (offeringsCreateOfferings.getAll().isEmpty()) {
                    this.$onError.invoke(new PurchasesError(PurchasesErrorCode.ConfigurationError, OfferingStrings.CONFIGURATION_ERROR_PRODUCTS_NOT_FOUND));
                } else {
                    String str = String.format(OfferingStrings.CREATED_OFFERINGS, Arrays.copyOf(new Object[]{offeringsCreateOfferings}, 1));
                    r.e(str, "format(this, *args)");
                    LogUtilsKt.verboseLog(str);
                    this.$onSuccess.invoke(offeringsCreateOfferings);
                }
            } catch (Exception e10) {
                if (!(e10 instanceof JSONException ? true : e10 instanceof g)) {
                    throw e10;
                }
                LogIntent logIntent = LogIntent.RC_ERROR;
                String str2 = String.format(OfferingStrings.JSON_EXCEPTION_ERROR, Arrays.copyOf(new Object[]{e10.getLocalizedMessage()}, 1));
                r.e(str2, "format(this, *args)");
                LogWrapperKt.log(logIntent, str2);
                this.$onError.invoke(new PurchasesError(PurchasesErrorCode.UnexpectedBackendResponseError, e10.getLocalizedMessage()));
            }
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offerings.OfferingsFactory$createOfferings$2, reason: invalid class name */
    static final class AnonymousClass2 extends s implements l<PurchasesError, i0> {
        final /* synthetic */ l<PurchasesError, i0> $onError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(l<? super PurchasesError, i0> lVar) {
            super(1);
            this.$onError = lVar;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError purchasesError) {
            r.f(purchasesError, "error");
            this.$onError.invoke(purchasesError);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offerings.OfferingsFactory$getStoreProductsById$1, reason: invalid class name and case insensitive filesystem */
    static final class C05591 extends s implements l<List<? extends StoreProduct>, i0> {
        final /* synthetic */ l<Map<String, ? extends List<? extends StoreProduct>>, i0> $onCompleted;
        final /* synthetic */ l<PurchasesError, i0> $onError;
        final /* synthetic */ Set<String> $productIds;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C05591(Set<String> set, l<? super Map<String, ? extends List<? extends StoreProduct>>, i0> lVar, l<? super PurchasesError, i0> lVar2) {
            super(1);
            this.$productIds = set;
            this.$onCompleted = lVar;
            this.$onError = lVar2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$1(List list, Set set, OfferingsFactory offeringsFactory, l lVar, l lVar2) {
            r.f(list, "$subscriptionProducts");
            r.f(set, "$productIds");
            r.f(offeringsFactory, "this$0");
            r.f(lVar, "$onCompleted");
            r.f(lVar2, "$onError");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : list) {
                String productId = ((StoreProduct) obj).getPurchasingData().getProductId();
                Object arrayList = linkedHashMap.get(productId);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(productId, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            Map mapV = r0.v(linkedHashMap);
            Set<String> setE = z0.e(set, mapV.keySet());
            if (!setE.isEmpty()) {
                offeringsFactory.billing.queryProductDetailsAsync(ProductType.INAPP, setE, new OfferingsFactory$getStoreProductsById$1$1$1(offeringsFactory, mapV, lVar), new OfferingsFactory$getStoreProductsById$1$1$2(lVar2));
            } else {
                lVar.invoke(mapV);
            }
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(List<? extends StoreProduct> list) {
            invoke2(list);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(final List<? extends StoreProduct> list) {
            r.f(list, "subscriptionProducts");
            Dispatcher dispatcher = OfferingsFactory.this.dispatcher;
            final Set<String> set = this.$productIds;
            final OfferingsFactory offeringsFactory = OfferingsFactory.this;
            final l<Map<String, ? extends List<? extends StoreProduct>>, i0> lVar = this.$onCompleted;
            final l<PurchasesError, i0> lVar2 = this.$onError;
            Dispatcher.enqueue$default(dispatcher, new Runnable() { // from class: com.revenuecat.purchases.common.offerings.a
                @Override // java.lang.Runnable
                public final void run() {
                    OfferingsFactory.C05591.invoke$lambda$1(list, set, offeringsFactory, lVar, lVar2);
                }
            }, null, 2, null);
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offerings.OfferingsFactory$getStoreProductsById$2, reason: invalid class name and case insensitive filesystem */
    static final class C05602 extends s implements l<PurchasesError, i0> {
        final /* synthetic */ l<PurchasesError, i0> $onError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C05602(l<? super PurchasesError, i0> lVar) {
            super(1);
            this.$onError = lVar;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(PurchasesError purchasesError) {
            invoke2(purchasesError);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PurchasesError purchasesError) {
            r.f(purchasesError, "it");
            this.$onError.invoke(purchasesError);
        }
    }

    public OfferingsFactory(BillingAbstract billingAbstract, OfferingParser offeringParser, Dispatcher dispatcher) {
        r.f(billingAbstract, "billing");
        r.f(offeringParser, "offeringParser");
        r.f(dispatcher, "dispatcher");
        this.billing = billingAbstract;
        this.offeringParser = offeringParser;
        this.dispatcher = dispatcher;
    }

    private final Set<String> extractProductIdentifiers(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = jSONObject.getJSONArray("offerings");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONArray jSONArray2 = jSONArray.getJSONObject(i10).getJSONArray("packages");
            int length2 = jSONArray2.length();
            for (int i11 = 0; i11 < length2; i11++) {
                String strOptString = jSONArray2.getJSONObject(i11).optString("platform_product_identifier");
                r.e(strOptString, "it");
                if (!(!v.v(strOptString))) {
                    strOptString = null;
                }
                if (strOptString != null) {
                    linkedHashSet.add(strOptString);
                }
            }
        }
        return linkedHashSet;
    }

    private final void getStoreProductsById(Set<String> set, l<? super Map<String, ? extends List<? extends StoreProduct>>, i0> lVar, l<? super PurchasesError, i0> lVar2) {
        this.billing.queryProductDetailsAsync(ProductType.SUBS, set, new C05591(set, lVar, lVar2), new C05602(lVar2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final i0 logMissingProducts(Set<String> set, Map<String, ? extends List<? extends StoreProduct>> map) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (!map.containsKey((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList.isEmpty() ^ true ? arrayList : null;
        if (arrayList2 == null) {
            return null;
        }
        LogIntent logIntent = LogIntent.GOOGLE_WARNING;
        String str = String.format(OfferingStrings.CANNOT_FIND_PRODUCT_CONFIGURATION_ERROR, Arrays.copyOf(new Object[]{c0.h0(arrayList2, ", ", null, null, 0, null, null, 62, null)}, 1));
        r.e(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        return i0.f15558a;
    }

    public final void createOfferings(JSONObject jSONObject, l<? super PurchasesError, i0> lVar, l<? super Offerings, i0> lVar2) {
        r.f(jSONObject, "offeringsJSON");
        r.f(lVar, "onError");
        r.f(lVar2, "onSuccess");
        try {
            Set<String> setExtractProductIdentifiers = extractProductIdentifiers(jSONObject);
            if (setExtractProductIdentifiers.isEmpty()) {
                lVar.invoke(new PurchasesError(PurchasesErrorCode.ConfigurationError, OfferingStrings.CONFIGURATION_ERROR_NO_PRODUCTS_FOR_OFFERINGS));
            } else {
                getStoreProductsById(setExtractProductIdentifiers, new AnonymousClass1(setExtractProductIdentifiers, jSONObject, lVar, lVar2), new AnonymousClass2(lVar));
            }
        } catch (JSONException e10) {
            LogIntent logIntent = LogIntent.RC_ERROR;
            String str = String.format(OfferingStrings.JSON_EXCEPTION_ERROR, Arrays.copyOf(new Object[]{e10.getLocalizedMessage()}, 1));
            r.e(str, "format(this, *args)");
            LogWrapperKt.log(logIntent, str);
            lVar.invoke(new PurchasesError(PurchasesErrorCode.UnexpectedBackendResponseError, e10.getLocalizedMessage()));
        }
    }
}
