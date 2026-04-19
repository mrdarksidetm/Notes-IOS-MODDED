package com.revenuecat.purchases.ui.revenuecatui.templates;

import ae.s;
import androidx.compose.ui.e;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import md.i0;
import t0.e2;
import t0.l;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
final class Template2Kt$Title$1 extends s implements p<l, Integer, i0> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ e $childModifier;
    final /* synthetic */ PaywallState.Loaded.Legacy $state;
    final /* synthetic */ int $textAlign;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Template2Kt$Title$1(PaywallState.Loaded.Legacy legacy, e eVar, int i10, int i11, int i12) {
        super(2);
        this.$state = legacy;
        this.$childModifier = eVar;
        this.$textAlign = i10;
        this.$$changed = i11;
        this.$$default = i12;
    }

    @Override // zd.p
    public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
        invoke(lVar, num.intValue());
        return i0.f15558a;
    }

    public final void invoke(l lVar, int i10) {
        Template2Kt.m255Title8iNrtrE(this.$state, this.$childModifier, this.$textAlign, lVar, e2.a(this.$$changed | 1), this.$$default);
    }
}
