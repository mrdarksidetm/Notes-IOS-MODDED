package com.revenuecat.purchases.ui.revenuecatui;

import ae.r;
import ae.s;
import androidx.compose.foundation.c;
import androidx.compose.ui.e;
import i1.g;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
final class InternalPaywallKt$LoadedPaywall$2$1 extends s implements l<e, e> {
    final /* synthetic */ long $backgroundColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InternalPaywallKt$LoadedPaywall$2$1(long j10) {
        super(1);
        this.$backgroundColor = j10;
    }

    @Override // zd.l
    public final e invoke(e eVar) {
        r.f(eVar, "$this$conditional");
        e.a aVar = e.f2662a;
        UIConstant uIConstant = UIConstant.INSTANCE;
        return c.d(g.a(aVar, l0.g.e(uIConstant.m79getDefaultCornerRadiusD9Ej5fM(), uIConstant.m79getDefaultCornerRadiusD9Ej5fM(), 0.0f, 0.0f, 12, null)), this.$backgroundColor, null, 2, null);
    }
}
