package com.revenuecat.purchases.ui.revenuecatui.templates;

import ae.r;
import ae.s;
import androidx.compose.foundation.layout.p;
import androidx.compose.ui.e;
import w2.h;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
final class Template1Kt$HeaderImage$1$1$2$1 extends s implements l<e, e> {
    final /* synthetic */ int $screenHeight;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Template1Kt$HeaderImage$1$1$2$1(int i10) {
        super(1);
        this.$screenHeight = i10;
    }

    @Override // zd.l
    public final e invoke(e eVar) {
        r.f(eVar, "$this$conditional");
        return p.h(p.g(eVar, 0.0f, 1, null), h.m(h.m(this.$screenHeight) / 2.0f));
    }
}
