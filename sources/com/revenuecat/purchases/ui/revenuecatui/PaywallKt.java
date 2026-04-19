package com.revenuecat.purchases.ui.revenuecatui;

import ae.r;
import ae.s;
import md.i0;
import t0.e2;
import t0.l;
import t0.o;
import t0.o2;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
public final class PaywallKt {

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.PaywallKt$Paywall$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements p<l, Integer, i0> {
        final /* synthetic */ int $$changed;
        final /* synthetic */ PaywallOptions $options;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PaywallOptions paywallOptions, int i10) {
            super(2);
            this.$options = paywallOptions;
            this.$$changed = i10;
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
            invoke(lVar, num.intValue());
            return i0.f15558a;
        }

        public final void invoke(l lVar, int i10) {
            PaywallKt.Paywall(this.$options, lVar, e2.a(this.$$changed | 1));
        }
    }

    public static final void Paywall(PaywallOptions paywallOptions, l lVar, int i10) {
        int i11;
        r.f(paywallOptions, "options");
        l lVarP = lVar.p(377521151);
        if ((i10 & 14) == 0) {
            i11 = (lVarP.N(paywallOptions) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && lVarP.s()) {
            lVarP.x();
        } else {
            if (o.I()) {
                o.U(377521151, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.Paywall (Paywall.kt:9)");
            }
            InternalPaywallKt.InternalPaywall(paywallOptions, null, lVarP, i11 & 14, 2);
            if (o.I()) {
                o.T();
            }
        }
        o2 o2VarV = lVarP.v();
        if (o2VarV == null) {
            return;
        }
        o2VarV.a(new AnonymousClass1(paywallOptions, i10));
    }
}
