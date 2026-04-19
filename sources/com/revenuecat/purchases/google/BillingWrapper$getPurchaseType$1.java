package com.revenuecat.purchases.google;

import ae.s;
import com.revenuecat.purchases.ProductType;
import md.i0;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
final class BillingWrapper$getPurchaseType$1 extends s implements l<Boolean, i0> {
    final /* synthetic */ l<ProductType, i0> $listener;
    final /* synthetic */ String $purchaseToken;
    final /* synthetic */ BillingWrapper this$0;

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$getPurchaseType$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements l<Boolean, i0> {
        final /* synthetic */ l<ProductType, i0> $listener;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(l<? super ProductType, i0> lVar) {
            super(1);
            this.$listener = lVar;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return i0.f15558a;
        }

        public final void invoke(boolean z10) {
            l<ProductType, i0> lVar;
            ProductType productType;
            if (z10) {
                lVar = this.$listener;
                productType = ProductType.INAPP;
            } else {
                lVar = this.$listener;
                productType = ProductType.UNKNOWN;
            }
            lVar.invoke(productType);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    BillingWrapper$getPurchaseType$1(l<? super ProductType, i0> lVar, BillingWrapper billingWrapper, String str) {
        super(1);
        this.$listener = lVar;
        this.this$0 = billingWrapper;
        this.$purchaseToken = str;
    }

    @Override // zd.l
    public /* bridge */ /* synthetic */ i0 invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return i0.f15558a;
    }

    public final void invoke(boolean z10) {
        if (z10) {
            this.$listener.invoke(ProductType.SUBS);
            return;
        }
        BillingWrapper billingWrapper = this.this$0;
        String str = this.$purchaseToken;
        l<ProductType, i0> lVar = this.$listener;
        billingWrapper.queryPurchaseType("inapp", str, lVar, new AnonymousClass1(lVar));
    }
}
