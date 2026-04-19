package com.revenuecat.purchases;

import ae.s;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class CustomerInfo$activeSubscriptions$2 extends s implements zd.a<Set<? extends String>> {
    final /* synthetic */ CustomerInfo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CustomerInfo$activeSubscriptions$2(CustomerInfo customerInfo) {
        super(0);
        this.this$0 = customerInfo;
    }

    @Override // zd.a
    public final Set<? extends String> invoke() {
        CustomerInfo customerInfo = this.this$0;
        return customerInfo.activeIdentifiers(customerInfo.getAllExpirationDatesByProduct());
    }
}
