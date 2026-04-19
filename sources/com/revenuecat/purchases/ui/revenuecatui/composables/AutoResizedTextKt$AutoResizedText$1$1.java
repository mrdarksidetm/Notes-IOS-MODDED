package com.revenuecat.purchases.ui.revenuecatui.composables;

import ae.r;
import ae.s;
import md.i0;
import n1.c;
import t0.k1;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
final class AutoResizedTextKt$AutoResizedText$1$1 extends s implements l<c, i0> {
    final /* synthetic */ k1<Boolean> $shouldDraw$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AutoResizedTextKt$AutoResizedText$1$1(k1<Boolean> k1Var) {
        super(1);
        this.$shouldDraw$delegate = k1Var;
    }

    @Override // zd.l
    public /* bridge */ /* synthetic */ i0 invoke(c cVar) {
        invoke2(cVar);
        return i0.f15558a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(c cVar) {
        r.f(cVar, "$this$drawWithContent");
        if (AutoResizedTextKt.AutoResizedText_W72HBGU$lambda$4(this.$shouldDraw$delegate)) {
            cVar.u1();
        }
    }
}
