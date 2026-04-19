package com.revenuecat.purchases;

import ae.s;
import com.revenuecat.purchases.interfaces.UpdatedCustomerInfoListener;
import md.i0;

/* JADX INFO: loaded from: classes2.dex */
final class CustomerInfoUpdateHandler$notifyListeners$2$2 extends s implements zd.a<i0> {
    final /* synthetic */ CustomerInfo $customerInfo;
    final /* synthetic */ UpdatedCustomerInfoListener $listener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CustomerInfoUpdateHandler$notifyListeners$2$2(UpdatedCustomerInfoListener updatedCustomerInfoListener, CustomerInfo customerInfo) {
        super(0);
        this.$listener = updatedCustomerInfoListener;
        this.$customerInfo = customerInfo;
    }

    @Override // zd.a
    public /* bridge */ /* synthetic */ i0 invoke() {
        invoke2();
        return i0.f15558a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$listener.onReceived(this.$customerInfo);
    }
}
