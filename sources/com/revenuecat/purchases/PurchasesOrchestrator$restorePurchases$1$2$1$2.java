package com.revenuecat.purchases;

import ae.r;
import ae.s;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.strings.RestoreStrings;
import java.util.Arrays;
import java.util.List;
import md.i0;
import nd.c0;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
final class PurchasesOrchestrator$restorePurchases$1$2$1$2 extends s implements p<StoreTransaction, PurchasesError, i0> {
    final /* synthetic */ ReceiveCustomerInfoCallback $callback;
    final /* synthetic */ StoreTransaction $purchase;
    final /* synthetic */ List<StoreTransaction> $sortedByTime;
    final /* synthetic */ PurchasesOrchestrator this$0;

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$restorePurchases$1$2$1$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements zd.a<i0> {
        final /* synthetic */ ReceiveCustomerInfoCallback $callback;
        final /* synthetic */ PurchasesError $error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ReceiveCustomerInfoCallback receiveCustomerInfoCallback, PurchasesError purchasesError) {
            super(0);
            this.$callback = receiveCustomerInfoCallback;
            this.$error = purchasesError;
        }

        @Override // zd.a
        public /* bridge */ /* synthetic */ i0 invoke() {
            invoke2();
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$callback.onError(this.$error);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PurchasesOrchestrator$restorePurchases$1$2$1$2(StoreTransaction storeTransaction, List<StoreTransaction> list, PurchasesOrchestrator purchasesOrchestrator, ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        super(2);
        this.$purchase = storeTransaction;
        this.$sortedByTime = list;
        this.this$0 = purchasesOrchestrator;
        this.$callback = receiveCustomerInfoCallback;
    }

    @Override // zd.p
    public /* bridge */ /* synthetic */ i0 invoke(StoreTransaction storeTransaction, PurchasesError purchasesError) {
        invoke2(storeTransaction, purchasesError);
        return i0.f15558a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(StoreTransaction storeTransaction, PurchasesError purchasesError) {
        r.f(storeTransaction, "<anonymous parameter 0>");
        r.f(purchasesError, "error");
        LogIntent logIntent = LogIntent.RC_ERROR;
        String str = String.format(RestoreStrings.RESTORING_PURCHASE_ERROR, Arrays.copyOf(new Object[]{this.$purchase, purchasesError}, 2));
        r.e(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        if (r.b(c0.j0(this.$sortedByTime), this.$purchase)) {
            this.this$0.dispatch(new AnonymousClass1(this.$callback, purchasesError));
        }
    }
}
