package com.revenuecat.purchases.common.offlineentitlements;

import ae.j;
import ae.r;
import ae.s;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.common.BillingAbstract;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.common.offlineentitlements.ProductEntitlementMapping;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.strings.OfflineEntitlementsStrings;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import md.i0;
import nd.c0;
import nd.u;
import nd.v;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
public final class PurchasedProductsFetcher {
    private final BillingAbstract billing;
    private final DateProvider dateProvider;
    private final DeviceCache deviceCache;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProductType.values().length];
            try {
                iArr[ProductType.SUBS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.revenuecat.purchases.common.offlineentitlements.PurchasedProductsFetcher$queryActiveProducts$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements l<Map<String, ? extends StoreTransaction>, i0> {
        final /* synthetic */ l<List<PurchasedProduct>, i0> $onSuccess;
        final /* synthetic */ ProductEntitlementMapping $productEntitlementMapping;
        final /* synthetic */ PurchasedProductsFetcher this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(l<? super List<PurchasedProduct>, i0> lVar, PurchasedProductsFetcher purchasedProductsFetcher, ProductEntitlementMapping productEntitlementMapping) {
            super(1);
            this.$onSuccess = lVar;
            this.this$0 = purchasedProductsFetcher;
            this.$productEntitlementMapping = productEntitlementMapping;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(Map<String, ? extends StoreTransaction> map) {
            invoke2((Map<String, StoreTransaction>) map);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Map<String, StoreTransaction> map) {
            r.f(map, "activePurchasesByHashedToken");
            List listC0 = c0.C0(map.values());
            PurchasedProductsFetcher purchasedProductsFetcher = this.this$0;
            ProductEntitlementMapping productEntitlementMapping = this.$productEntitlementMapping;
            ArrayList arrayList = new ArrayList(v.x(listC0, 10));
            Iterator it = listC0.iterator();
            while (it.hasNext()) {
                arrayList.add(purchasedProductsFetcher.createPurchasedProduct((StoreTransaction) it.next(), productEntitlementMapping));
            }
            this.$onSuccess.invoke(arrayList);
        }
    }

    public PurchasedProductsFetcher(DeviceCache deviceCache, BillingAbstract billingAbstract, DateProvider dateProvider) {
        r.f(deviceCache, "deviceCache");
        r.f(billingAbstract, "billing");
        r.f(dateProvider, "dateProvider");
        this.deviceCache = deviceCache;
        this.billing = billingAbstract;
        this.dateProvider = dateProvider;
    }

    public /* synthetic */ PurchasedProductsFetcher(DeviceCache deviceCache, BillingAbstract billingAbstract, DateProvider dateProvider, int i10, j jVar) {
        this(deviceCache, billingAbstract, (i10 & 4) != 0 ? new DefaultDateProvider() : dateProvider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PurchasedProduct createPurchasedProduct(StoreTransaction storeTransaction, ProductEntitlementMapping productEntitlementMapping) {
        List<String> listM;
        Date expirationDate = getExpirationDate(storeTransaction);
        String str = (String) c0.Y(storeTransaction.getProductIds());
        ProductEntitlementMapping.Mapping mapping = productEntitlementMapping.getMappings().get(str);
        String basePlanId = mapping != null ? mapping.getBasePlanId() : null;
        if (mapping == null || (listM = mapping.getEntitlements()) == null) {
            listM = u.m();
        }
        return new PurchasedProduct(str, basePlanId, storeTransaction, listM, expirationDate);
    }

    private final Date getExpirationDate(StoreTransaction storeTransaction) {
        if (WhenMappings.$EnumSwitchMapping$0[storeTransaction.getType().ordinal()] == 1) {
            return new Date(this.dateProvider.getNow().getTime() + TimeUnit.DAYS.toMillis(1L));
        }
        return null;
    }

    public final void queryActiveProducts(String str, l<? super List<PurchasedProduct>, i0> lVar, l<? super PurchasesError, i0> lVar2) {
        r.f(str, "appUserID");
        r.f(lVar, "onSuccess");
        r.f(lVar2, "onError");
        ProductEntitlementMapping productEntitlementMapping = this.deviceCache.getProductEntitlementMapping();
        if (productEntitlementMapping == null) {
            lVar2.invoke(new PurchasesError(PurchasesErrorCode.CustomerInfoError, OfflineEntitlementsStrings.PRODUCT_ENTITLEMENT_MAPPING_REQUIRED));
        } else {
            this.billing.queryPurchases(str, new AnonymousClass1(lVar, this, productEntitlementMapping), lVar2);
        }
    }
}
