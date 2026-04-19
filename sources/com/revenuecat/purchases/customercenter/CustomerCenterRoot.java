package com.revenuecat.purchases.customercenter;

import ae.j;
import ae.r;
import af.j1;
import af.z0;
import we.b;

/* JADX INFO: loaded from: classes2.dex */
public final class CustomerCenterRoot {
    public static final Companion Companion = new Companion(null);
    private final CustomerCenterConfigData customerCenter;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final b<CustomerCenterRoot> serializer() {
            return CustomerCenterRoot$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CustomerCenterRoot(int i10, CustomerCenterConfigData customerCenterConfigData, j1 j1Var) {
        if (1 != (i10 & 1)) {
            z0.a(i10, 1, CustomerCenterRoot$$serializer.INSTANCE.getDescriptor());
        }
        this.customerCenter = customerCenterConfigData;
    }

    public CustomerCenterRoot(CustomerCenterConfigData customerCenterConfigData) {
        r.f(customerCenterConfigData, "customerCenter");
        this.customerCenter = customerCenterConfigData;
    }

    public static /* synthetic */ void getCustomerCenter$annotations() {
    }

    public final CustomerCenterConfigData getCustomerCenter() {
        return this.customerCenter;
    }
}
