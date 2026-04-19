package com.revenuecat.purchases.ui.revenuecatui.composables;

import ae.s;
import md.i0;
import t0.k1;
import w2.d;
import w2.h;
import w2.p;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
final class TierSwitcherKt$TierSwitcher$2$1$1 extends s implements l<p, i0> {
    final /* synthetic */ d $density;
    final /* synthetic */ k1<h> $totalHeightRowDp$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TierSwitcherKt$TierSwitcher$2$1$1(d dVar, k1<h> k1Var) {
        super(1);
        this.$density = dVar;
        this.$totalHeightRowDp$delegate = k1Var;
    }

    @Override // zd.l
    public /* bridge */ /* synthetic */ i0 invoke(p pVar) {
        m191invokeozmzZPI(pVar.j());
        return i0.f15558a;
    }

    /* JADX INFO: renamed from: invoke-ozmzZPI, reason: not valid java name */
    public final void m191invokeozmzZPI(long j10) {
        TierSwitcherKt.TierSwitcher_UFBoNtE$lambda$6(this.$totalHeightRowDp$delegate, this.$density.l0(p.f(j10)));
    }
}
