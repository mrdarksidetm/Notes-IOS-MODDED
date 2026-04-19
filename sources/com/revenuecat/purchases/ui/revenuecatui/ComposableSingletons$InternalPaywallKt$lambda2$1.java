package com.revenuecat.purchases.ui.revenuecatui;

import ae.s;
import f2.c;
import md.i0;
import q0.v;
import t0.l;
import t0.o;
import zd.p;

/* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.ComposableSingletons$InternalPaywallKt$lambda-2$1, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
final class ComposableSingletons$InternalPaywallKt$lambda2$1 extends s implements p<l, Integer, i0> {
    public static final ComposableSingletons$InternalPaywallKt$lambda2$1 INSTANCE = new ComposableSingletons$InternalPaywallKt$lambda2$1();

    ComposableSingletons$InternalPaywallKt$lambda2$1() {
        super(2);
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
            o.U(-193524574, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.ComposableSingletons$InternalPaywallKt.lambda-2.<anonymous> (InternalPaywall.kt:243)");
        }
        v.a(c.d(R.drawable.error, lVar, 0), null, null, 0L, lVar, 56, 12);
        if (o.I()) {
            o.T();
        }
    }
}
