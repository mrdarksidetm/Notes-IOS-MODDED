package com.revenuecat.purchases.ui.revenuecatui.composables;

import ae.r;
import ae.s;
import androidx.compose.ui.e;
import b1.c;
import g2.x;
import h0.g0;
import java.util.ArrayList;
import md.i0;
import nd.c0;
import t0.l;
import t0.o;
import zd.q;

/* JADX INFO: loaded from: classes2.dex */
final class FooterKt$Button$1$3 extends s implements q<g0, l, Integer, i0> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ e $childModifier;
    final /* synthetic */ long $color;
    final /* synthetic */ int[] $texts;

    /* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.composables.FooterKt$Button$1$3$1, reason: invalid class name */
    static final class AnonymousClass1 extends s implements zd.l<x, i0> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(x xVar) {
            invoke2(xVar);
            return i0.f15558a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(x xVar) {
            r.f(xVar, "$this$clearAndSetSemantics");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FooterKt$Button$1$3(int[] iArr, e eVar, long j10, int i10) {
        super(3);
        this.$texts = iArr;
        this.$childModifier = eVar;
        this.$color = j10;
        this.$$dirty = i10;
    }

    @Override // zd.q
    public /* bridge */ /* synthetic */ i0 invoke(g0 g0Var, l lVar, Integer num) {
        invoke(g0Var, lVar, num.intValue());
        return i0.f15558a;
    }

    public final void invoke(g0 g0Var, l lVar, int i10) {
        r.f(g0Var, "$this$TextButton");
        int i11 = (i10 & 14) == 0 ? i10 | (lVar.N(g0Var) ? 4 : 2) : i10;
        if ((i11 & 91) == 18 && lVar.s()) {
            lVar.x();
            return;
        }
        if (o.I()) {
            o.U(365963733, i11, -1, "com.revenuecat.purchases.ui.revenuecatui.composables.Button.<anonymous>.<anonymous> (Footer.kt:213)");
        }
        e eVarA = g2.o.a(e.f2662a, AnonymousClass1.INSTANCE);
        int[] iArr = this.$texts;
        e eVar = this.$childModifier;
        long j10 = this.$color;
        int i12 = this.$$dirty;
        ArrayList arrayList = new ArrayList(iArr.length);
        int length = iArr.length;
        int i13 = 0;
        while (i13 < length) {
            ArrayList arrayList2 = arrayList;
            arrayList2.add(c.b(lVar, -1943754282, true, new FooterKt$Button$1$3$2$1(iArr[i13], eVar, j10, i12)));
            i13++;
            arrayList = arrayList2;
            eVarA = eVarA;
            length = length;
            iArr = iArr;
        }
        e eVar2 = eVarA;
        ArrayList arrayList3 = arrayList;
        int[] iArr2 = this.$texts;
        e eVar3 = this.$childModifier;
        long j11 = this.$color;
        int i14 = this.$$dirty;
        ArrayList arrayList4 = new ArrayList(iArr2.length);
        int i15 = 0;
        for (int length2 = iArr2.length; i15 < length2; length2 = length2) {
            ArrayList arrayList5 = arrayList4;
            arrayList5.add(c.b(lVar, 1301841013, true, new FooterKt$Button$1$3$3$1(iArr2[i15], eVar3, j11, i14)));
            i15++;
            arrayList4 = arrayList5;
        }
        AdaptiveComposableKt.AdaptiveComposable(g0Var, eVar2, c0.n0(arrayList3, arrayList4), lVar, (i11 & 14) | 512, 0);
        if (o.I()) {
            o.T();
        }
    }
}
