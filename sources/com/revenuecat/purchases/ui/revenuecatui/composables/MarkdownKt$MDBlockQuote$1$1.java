package com.revenuecat.purchases.ui.revenuecatui.composables;

import ae.r;
import ae.s;
import k1.g;
import md.i0;
import n1.f;
import w2.h;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
final class MarkdownKt$MDBlockQuote$1$1 extends s implements l<f, i0> {
    final /* synthetic */ long $color;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MarkdownKt$MDBlockQuote$1$1(long j10) {
        super(1);
        this.$color = j10;
    }

    @Override // zd.l
    public /* bridge */ /* synthetic */ i0 invoke(f fVar) {
        invoke2(fVar);
        return i0.f15558a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(f fVar) {
        r.f(fVar, "$this$drawBehind");
        float f10 = 12;
        f.D(fVar, this.$color, g.a(h.m(f10), 0.0f), g.a(h.m(f10), k1.l.g(fVar.c())), 2.0f, 0, null, 0.0f, null, 0, 496, null);
    }
}
