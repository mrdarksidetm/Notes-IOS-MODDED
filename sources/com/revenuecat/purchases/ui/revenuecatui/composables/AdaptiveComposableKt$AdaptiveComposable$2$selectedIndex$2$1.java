package com.revenuecat.purchases.ui.revenuecatui.composables;

import ae.s;
import d1.v;
import t0.k1;
import zd.a;

/* JADX INFO: loaded from: classes2.dex */
final class AdaptiveComposableKt$AdaptiveComposable$2$selectedIndex$2$1 extends s implements a<Integer> {
    final /* synthetic */ k1<Integer> $maxSize$delegate;
    final /* synthetic */ v<Integer> $viewSizes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdaptiveComposableKt$AdaptiveComposable$2$selectedIndex$2$1(v<Integer> vVar, k1<Integer> k1Var) {
        super(0);
        this.$viewSizes = vVar;
        this.$maxSize$delegate = k1Var;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // zd.a
    public final Integer invoke() {
        int size = this.$viewSizes.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.$viewSizes.get(i10).intValue() <= AdaptiveComposableKt.AdaptiveComposable$lambda$1(this.$maxSize$delegate)) {
                return Integer.valueOf(i10);
            }
        }
        return 0;
    }
}
