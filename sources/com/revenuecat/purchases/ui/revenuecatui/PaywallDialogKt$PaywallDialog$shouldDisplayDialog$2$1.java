package com.revenuecat.purchases.ui.revenuecatui;

import ae.s;
import com.revenuecat.purchases.CustomerInfo;
import t0.k1;
import t0.k3;
import zd.a;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
final class PaywallDialogKt$PaywallDialog$shouldDisplayDialog$2$1 extends s implements a<k1<Boolean>> {
    final /* synthetic */ l<CustomerInfo, Boolean> $shouldDisplayBlock;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PaywallDialogKt$PaywallDialog$shouldDisplayDialog$2$1(l<? super CustomerInfo, Boolean> lVar) {
        super(0);
        this.$shouldDisplayBlock = lVar;
    }

    @Override // zd.a
    public final k1<Boolean> invoke() {
        return k3.e(Boolean.valueOf(this.$shouldDisplayBlock == null), null, 2, null);
    }
}
