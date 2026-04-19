package com.revenuecat.purchases.ui.revenuecatui.templates;

import ae.s;
import com.revenuecat.purchases.ui.revenuecatui.data.PaywallState;
import h0.h;
import md.i0;
import t0.e2;
import t0.l;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
final class Template3Kt$Features$3 extends s implements p<l, Integer, i0> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ float $spacing;
    final /* synthetic */ PaywallState.Loaded.Legacy $state;
    final /* synthetic */ h $this_Features;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Template3Kt$Features$3(h hVar, PaywallState.Loaded.Legacy legacy, float f10, int i10) {
        super(2);
        this.$this_Features = hVar;
        this.$state = legacy;
        this.$spacing = f10;
        this.$$changed = i10;
    }

    @Override // zd.p
    public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
        invoke(lVar, num.intValue());
        return i0.f15558a;
    }

    public final void invoke(l lVar, int i10) {
        Template3Kt.m261FeaturesTDGSqEk(this.$this_Features, this.$state, this.$spacing, lVar, e2.a(this.$$changed | 1));
    }
}
