package com.revenuecat.purchases.common.offerings;

import ae.r;
import ae.s;
import com.revenuecat.purchases.common.Dispatcher;
import com.revenuecat.purchases.models.StoreProduct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import md.i0;
import md.x;
import nd.r0;
import nd.t;
import nd.v;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
final class OfferingsFactory$getStoreProductsById$1$1$1 extends s implements l<List<? extends StoreProduct>, i0> {
    final /* synthetic */ l<Map<String, ? extends List<? extends StoreProduct>>, i0> $onCompleted;
    final /* synthetic */ Map<String, List<StoreProduct>> $productsById;
    final /* synthetic */ OfferingsFactory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    OfferingsFactory$getStoreProductsById$1$1$1(OfferingsFactory offeringsFactory, Map<String, List<StoreProduct>> map, l<? super Map<String, ? extends List<? extends StoreProduct>>, i0> lVar) {
        super(1);
        this.this$0 = offeringsFactory;
        this.$productsById = map;
        this.$onCompleted = lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$1(Map map, List list, l lVar) {
        r.f(map, "$productsById");
        r.f(list, "$inAppProducts");
        r.f(lVar, "$onCompleted");
        ArrayList arrayList = new ArrayList(v.x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            StoreProduct storeProduct = (StoreProduct) it.next();
            arrayList.add(x.a(storeProduct.getPurchasingData().getProductId(), t.d(storeProduct)));
        }
        r0.n(map, arrayList);
        lVar.invoke(map);
    }

    @Override // zd.l
    public /* bridge */ /* synthetic */ i0 invoke(List<? extends StoreProduct> list) {
        invoke2(list);
        return i0.f15558a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(final List<? extends StoreProduct> list) {
        r.f(list, "inAppProducts");
        Dispatcher dispatcher = this.this$0.dispatcher;
        final Map<String, List<StoreProduct>> map = this.$productsById;
        final l<Map<String, ? extends List<? extends StoreProduct>>, i0> lVar = this.$onCompleted;
        Dispatcher.enqueue$default(dispatcher, new Runnable() { // from class: com.revenuecat.purchases.common.offerings.b
            @Override // java.lang.Runnable
            public final void run() {
                OfferingsFactory$getStoreProductsById$1$1$1.invoke$lambda$1(map, list, lVar);
            }
        }, null, 2, null);
    }
}
