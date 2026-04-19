package com.revenuecat.purchases.ui.revenuecatui.composables;

import ae.r;
import ae.s;
import d1.v;
import md.i0;
import w2.b;
import w2.c;
import y1.d0;
import y1.f0;
import y1.g0;
import y1.t0;
import zd.l;
import zd.q;

/* JADX INFO: loaded from: classes2.dex */
final class AdaptiveComposableKt$AdaptiveComposable$2$1$1$1$1 extends s implements q<g0, d0, b, f0> {
    final /* synthetic */ int $index;
    final /* synthetic */ v<Integer> $viewSizes;

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.composables.AdaptiveComposableKt$AdaptiveComposable$2$1$1$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements l<t0.a, i0> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(t0.a aVar) {
            invoke2(aVar);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(t0.a aVar) {
            r.f(aVar, "$this$layout");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdaptiveComposableKt$AdaptiveComposable$2$1$1$1$1(v<Integer> vVar, int i10) {
        super(3);
        this.$viewSizes = vVar;
        this.$index = i10;
    }

    @Override // zd.q
    public /* bridge */ /* synthetic */ f0 invoke(g0 g0Var, d0 d0Var, b bVar) {
        return m141invoke3p2s80s(g0Var, d0Var, bVar.t());
    }

    /* JADX INFO: renamed from: invoke-3p2s80s, reason: not valid java name */
    public final f0 m141invoke3p2s80s(g0 g0Var, d0 d0Var, long j10) {
        r.f(g0Var, "$this$layout");
        r.f(d0Var, "measurable");
        if (this.$viewSizes.get(this.$index).intValue() == 0) {
            this.$viewSizes.set(this.$index, Integer.valueOf(d0Var.I(c.b(0, 0, 0, 0, 15, null)).q0()));
        }
        return g0.z0(g0Var, 0, 0, null, AnonymousClass1.INSTANCE, 4, null);
    }
}
