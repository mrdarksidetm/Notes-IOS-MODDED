package com.revenuecat.purchases;

import ae.r;
import ae.s;
import com.revenuecat.purchases.interfaces.GetStoreProductsCallback;
import com.revenuecat.purchases.models.StoreProduct;
import java.util.List;
import java.util.Set;
import md.i0;
import nd.c0;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
final class PurchasesOrchestrator$getProductsOfTypes$1$1 extends s implements l<List<? extends StoreProduct>, i0> {
    final /* synthetic */ GetStoreProductsCallback $callback;
    final /* synthetic */ List<StoreProduct> $collectedStoreProducts;
    final /* synthetic */ Set<String> $productIds;
    final /* synthetic */ Set<ProductType> $typesRemaining;
    final /* synthetic */ PurchasesOrchestrator this$0;

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$getProductsOfTypes$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements zd.a<i0> {
        final /* synthetic */ GetStoreProductsCallback $callback;
        final /* synthetic */ List<StoreProduct> $collectedStoreProducts;
        final /* synthetic */ Set<String> $productIds;
        final /* synthetic */ List<StoreProduct> $storeProducts;
        final /* synthetic */ Set<ProductType> $typesRemaining;
        final /* synthetic */ PurchasesOrchestrator this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(PurchasesOrchestrator purchasesOrchestrator, Set<String> set, Set<ProductType> set2, List<? extends StoreProduct> list, List<? extends StoreProduct> list2, GetStoreProductsCallback getStoreProductsCallback) {
            super(0);
            this.this$0 = purchasesOrchestrator;
            this.$productIds = set;
            this.$typesRemaining = set2;
            this.$collectedStoreProducts = list;
            this.$storeProducts = list2;
            this.$callback = getStoreProductsCallback;
        }

        @Override // zd.a
        public /* bridge */ /* synthetic */ i0 invoke() {
            invoke2();
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.this$0.getProductsOfTypes(this.$productIds, this.$typesRemaining, c0.n0(this.$collectedStoreProducts, this.$storeProducts), this.$callback);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PurchasesOrchestrator$getProductsOfTypes$1$1(PurchasesOrchestrator purchasesOrchestrator, Set<String> set, Set<ProductType> set2, List<? extends StoreProduct> list, GetStoreProductsCallback getStoreProductsCallback) {
        super(1);
        this.this$0 = purchasesOrchestrator;
        this.$productIds = set;
        this.$typesRemaining = set2;
        this.$collectedStoreProducts = list;
        this.$callback = getStoreProductsCallback;
    }

    @Override // zd.l
    public /* bridge */ /* synthetic */ i0 invoke(List<? extends StoreProduct> list) {
        invoke2(list);
        return i0.f15558a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(List<? extends StoreProduct> list) {
        r.f(list, "storeProducts");
        PurchasesOrchestrator purchasesOrchestrator = this.this$0;
        purchasesOrchestrator.dispatch(new AnonymousClass1(purchasesOrchestrator, this.$productIds, this.$typesRemaining, this.$collectedStoreProducts, list, this.$callback));
    }
}
