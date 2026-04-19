package com.revenuecat.purchases.ui.revenuecatui;

import ae.r;
import ae.s;
import f2.f;
import h0.g0;
import md.i0;
import q0.q0;
import t0.l;
import t0.o;
import u2.i;
import zd.q;

/* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.ComposableSingletons$InternalPaywallKt$lambda-1$1, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
final class ComposableSingletons$InternalPaywallKt$lambda1$1 extends s implements q<g0, l, Integer, i0> {
    public static final ComposableSingletons$InternalPaywallKt$lambda1$1 INSTANCE = new ComposableSingletons$InternalPaywallKt$lambda1$1();

    ComposableSingletons$InternalPaywallKt$lambda1$1() {
        super(3);
    }

    @Override // zd.q
    public /* bridge */ /* synthetic */ i0 invoke(g0 g0Var, l lVar, Integer num) {
        invoke(g0Var, lVar, num.intValue());
        return i0.f15558a;
    }

    public final void invoke(g0 g0Var, l lVar, int i10) {
        r.f(g0Var, "$this$TextButton");
        if ((i10 & 81) == 16 && lVar.s()) {
            lVar.x();
            return;
        }
        if (o.I()) {
            o.U(-1021915876, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.ComposableSingletons$InternalPaywallKt.lambda-1.<anonymous> (InternalPaywall.kt:236)");
        }
        q0.b(f.a(R.string.OK, lVar, 0), null, 0L, 0L, null, null, null, 0L, null, i.h(i.f21560b.a()), 0L, 0, false, 0, 0, null, null, lVar, 0, 0, 130558);
        if (o.I()) {
            o.T();
        }
    }
}
