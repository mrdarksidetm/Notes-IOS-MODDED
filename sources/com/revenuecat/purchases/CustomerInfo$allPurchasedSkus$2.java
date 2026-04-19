package com.revenuecat.purchases;

import ae.s;
import com.revenuecat.purchases.models.Transaction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import nd.c0;
import nd.v;
import nd.z0;

/* JADX INFO: loaded from: classes2.dex */
final class CustomerInfo$allPurchasedSkus$2 extends s implements zd.a<Set<? extends String>> {
    final /* synthetic */ CustomerInfo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CustomerInfo$allPurchasedSkus$2(CustomerInfo customerInfo) {
        super(0);
        this.this$0 = customerInfo;
    }

    @Override // zd.a
    public final Set<? extends String> invoke() {
        List<Transaction> nonSubscriptionTransactions = this.this$0.getNonSubscriptionTransactions();
        ArrayList arrayList = new ArrayList(v.x(nonSubscriptionTransactions, 10));
        Iterator<T> it = nonSubscriptionTransactions.iterator();
        while (it.hasNext()) {
            arrayList.add(((Transaction) it.next()).getProductIdentifier());
        }
        return z0.f(c0.H0(arrayList), this.this$0.getAllExpirationDatesByProduct().keySet());
    }
}
