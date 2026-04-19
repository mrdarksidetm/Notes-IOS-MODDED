package com.revenuecat.purchases.ui.revenuecatui.composables;

import ae.s;
import androidx.compose.ui.e;
import md.i0;
import t0.e2;
import t0.l;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
final class PaywallIconKt$PaywallIcon$1 extends s implements p<l, Integer, i0> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ PaywallIconName $icon;
    final /* synthetic */ e $modifier;
    final /* synthetic */ long $tintColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaywallIconKt$PaywallIcon$1(PaywallIconName paywallIconName, e eVar, long j10, int i10, int i11) {
        super(2);
        this.$icon = paywallIconName;
        this.$modifier = eVar;
        this.$tintColor = j10;
        this.$$changed = i10;
        this.$$default = i11;
    }

    @Override // zd.p
    public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
        invoke(lVar, num.intValue());
        return i0.f15558a;
    }

    public final void invoke(l lVar, int i10) {
        PaywallIconKt.m179PaywallIconFNF3uiM(this.$icon, this.$modifier, this.$tintColor, lVar, e2.a(this.$$changed | 1), this.$$default);
    }
}
