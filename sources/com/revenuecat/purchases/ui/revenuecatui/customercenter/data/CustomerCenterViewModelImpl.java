package com.revenuecat.purchases.ui.revenuecatui.customercenter.data;

import ae.j;
import ae.r;
import androidx.lifecycle.w;
import androidx.lifecycle.x;
import com.revenuecat.purchases.ui.revenuecatui.customercenter.data.CustomerCenterState;
import com.revenuecat.purchases.ui.revenuecatui.data.PurchasesType;
import oe.b0;
import oe.f0;
import oe.g;

/* JADX INFO: loaded from: classes2.dex */
public final class CustomerCenterViewModelImpl extends w implements CustomerCenterViewModel {
    public static final Companion Companion = new Companion(null);
    private static final long STOP_FLOW_TIMEOUT = 5000;
    private final PurchasesType purchases;
    private final f0<CustomerCenterState> state;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }
    }

    public CustomerCenterViewModelImpl(PurchasesType purchasesType) {
        r.f(purchasesType, "purchases");
        this.purchases = purchasesType;
        this.state = g.s(g.o(new CustomerCenterViewModelImpl$state$1(this, null)), x.a(this), b0.a.b(b0.f16466a, 5000L, 0L, 2, null), CustomerCenterState.Loading.INSTANCE);
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.customercenter.data.CustomerCenterViewModel
    public f0<CustomerCenterState> getState() {
        return this.state;
    }
}
