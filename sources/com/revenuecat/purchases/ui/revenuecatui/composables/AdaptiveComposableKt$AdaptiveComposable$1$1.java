package com.revenuecat.purchases.ui.revenuecatui.composables;

import ae.s;
import md.i0;
import t0.k1;
import w2.p;
import y1.r;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
final class AdaptiveComposableKt$AdaptiveComposable$1$1 extends s implements l<r, i0> {
    final /* synthetic */ k1<Integer> $maxSize$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdaptiveComposableKt$AdaptiveComposable$1$1(k1<Integer> k1Var) {
        super(1);
        this.$maxSize$delegate = k1Var;
    }

    @Override // zd.l
    public /* bridge */ /* synthetic */ i0 invoke(r rVar) {
        invoke2(rVar);
        return i0.f15558a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(r rVar) {
        ae.r.f(rVar, "coordinates");
        if (p.g(rVar.a()) != AdaptiveComposableKt.AdaptiveComposable$lambda$1(this.$maxSize$delegate)) {
            AdaptiveComposableKt.AdaptiveComposable$lambda$2(this.$maxSize$delegate, p.g(rVar.a()));
        }
    }
}
