package com.revenuecat.purchases;

import ae.s;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import nd.c0;
import pd.b;

/* JADX INFO: loaded from: classes2.dex */
final class CustomerInfo$latestExpirationDate$2 extends s implements zd.a<Date> {
    final /* synthetic */ CustomerInfo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CustomerInfo$latestExpirationDate$2(CustomerInfo customerInfo) {
        super(0);
        this.this$0 = customerInfo;
    }

    @Override // zd.a
    public final Date invoke() {
        List listU0 = c0.u0(this.this$0.getAllExpirationDatesByProduct().values(), new Comparator() { // from class: com.revenuecat.purchases.CustomerInfo$latestExpirationDate$2$invoke$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return b.a((Date) t10, (Date) t11);
            }
        });
        if (listU0.isEmpty()) {
            listU0 = null;
        }
        if (listU0 != null) {
            return (Date) c0.j0(listU0);
        }
        return null;
    }
}
