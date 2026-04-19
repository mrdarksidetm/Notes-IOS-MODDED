package com.revenuecat.purchases.ui.revenuecatui.composables;

import ae.r;
import ae.s;
import i2.d0;
import md.i0;
import t0.k1;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
final class MarkdownKt$MarkdownText$3$1 extends s implements l<d0, i0> {
    final /* synthetic */ k1<d0> $layoutResult;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MarkdownKt$MarkdownText$3$1(k1<d0> k1Var) {
        super(1);
        this.$layoutResult = k1Var;
    }

    @Override // zd.l
    public /* bridge */ /* synthetic */ i0 invoke(d0 d0Var) {
        invoke2(d0Var);
        return i0.f15558a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d0 d0Var) {
        r.f(d0Var, "it");
        this.$layoutResult.setValue(d0Var);
    }
}
