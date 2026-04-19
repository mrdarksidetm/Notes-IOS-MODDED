package com.revenuecat.purchases.ui.revenuecatui.views;

import ae.s;
import com.revenuecat.purchases.ui.revenuecatui.PaywallFooterKt;
import com.revenuecat.purchases.ui.revenuecatui.PaywallOptions;
import md.i0;
import t0.k1;
import t0.l;
import t0.o;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
final class PaywallFooterView$init$2$1 extends s implements p<l, Integer, i0> {
    final /* synthetic */ PaywallFooterView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaywallFooterView$init$2$1(PaywallFooterView paywallFooterView) {
        super(2);
        this.this$0 = paywallFooterView;
    }

    private static final PaywallOptions invoke$lambda$1(k1<PaywallOptions> k1Var) {
        return k1Var.getValue();
    }

    @Override // zd.p
    public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
        invoke(lVar, num.intValue());
        return i0.f15558a;
    }

    public final void invoke(l lVar, int i10) {
        if ((i10 & 11) == 2 && lVar.s()) {
            lVar.x();
            return;
        }
        if (o.I()) {
            o.U(2089623926, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.views.PaywallFooterView.init.<anonymous>.<anonymous> (PaywallFooterView.kt:128)");
        }
        PaywallFooterView paywallFooterView = this.this$0;
        lVar.e(-492369756);
        Object objF = lVar.f();
        if (objF == l.f20813a.a()) {
            objF = paywallFooterView.paywallOptionsState;
            lVar.E(objF);
        }
        lVar.K();
        PaywallFooterKt.PaywallFooter(invoke$lambda$1((k1) objF), this.this$0.initialCondensed, null, lVar, 0, 4);
        if (o.I()) {
            o.T();
        }
    }
}
