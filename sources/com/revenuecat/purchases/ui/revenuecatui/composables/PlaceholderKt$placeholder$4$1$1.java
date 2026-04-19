package com.revenuecat.purchases.ui.revenuecatui.composables;

import a2.l1;
import ae.s;
import k1.m;
import l1.b0;
import l1.b1;
import l1.d1;
import l1.t1;
import md.i0;
import n1.c;
import t0.k1;
import t0.p3;
import w2.r;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
final class PlaceholderKt$placeholder$4$1$1 extends s implements l<c, i0> {
    final /* synthetic */ long $color;
    final /* synthetic */ p3<Float> $contentAlpha$delegate;
    final /* synthetic */ PlaceholderHighlight $highlight;
    final /* synthetic */ k1<Float> $highlightProgress$delegate;
    final /* synthetic */ l1<r> $lastLayoutDirection;
    final /* synthetic */ l1<b1> $lastOutline;
    final /* synthetic */ l1<k1.l> $lastSize;
    final /* synthetic */ d1 $paint;
    final /* synthetic */ p3<Float> $placeholderAlpha$delegate;
    final /* synthetic */ t1 $shape;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlaceholderKt$placeholder$4$1$1(d1 d1Var, l1<b1> l1Var, t1 t1Var, long j10, PlaceholderHighlight placeholderHighlight, l1<r> l1Var2, l1<k1.l> l1Var3, p3<Float> p3Var, p3<Float> p3Var2, k1<Float> k1Var) {
        super(1);
        this.$paint = d1Var;
        this.$lastOutline = l1Var;
        this.$shape = t1Var;
        this.$color = j10;
        this.$highlight = placeholderHighlight;
        this.$lastLayoutDirection = l1Var2;
        this.$lastSize = l1Var3;
        this.$contentAlpha$delegate = p3Var;
        this.$placeholderAlpha$delegate = p3Var2;
        this.$highlightProgress$delegate = k1Var;
    }

    @Override // zd.l
    public /* bridge */ /* synthetic */ i0 invoke(c cVar) {
        invoke2(cVar);
        return i0.f15558a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(c cVar) {
        ae.r.f(cVar, "$this$drawWithContent");
        float fInvoke$lambda$11 = PlaceholderKt$placeholder$4.invoke$lambda$11(this.$contentAlpha$delegate);
        if (0.01f <= fInvoke$lambda$11 && fInvoke$lambda$11 <= 0.99f) {
            this.$paint.b(PlaceholderKt$placeholder$4.invoke$lambda$11(this.$contentAlpha$delegate));
            d1 d1Var = this.$paint;
            b0 b0VarD = cVar.M0().d();
            b0VarD.n(m.c(cVar.c()), d1Var);
            cVar.u1();
            b0VarD.p();
        } else if (PlaceholderKt$placeholder$4.invoke$lambda$11(this.$contentAlpha$delegate) >= 0.99f) {
            cVar.u1();
        }
        float fInvoke$lambda$9 = PlaceholderKt$placeholder$4.invoke$lambda$9(this.$placeholderAlpha$delegate);
        if (0.01f <= fInvoke$lambda$9 && fInvoke$lambda$9 <= 0.99f) {
            this.$paint.b(PlaceholderKt$placeholder$4.invoke$lambda$9(this.$placeholderAlpha$delegate));
            d1 d1Var2 = this.$paint;
            l1<b1> l1Var = this.$lastOutline;
            t1 t1Var = this.$shape;
            long j10 = this.$color;
            PlaceholderHighlight placeholderHighlight = this.$highlight;
            l1<r> l1Var2 = this.$lastLayoutDirection;
            l1<k1.l> l1Var3 = this.$lastSize;
            k1<Float> k1Var = this.$highlightProgress$delegate;
            b0 b0VarD2 = cVar.M0().d();
            b0VarD2.n(m.c(cVar.c()), d1Var2);
            l1Var.b(PlaceholderKt.m181drawPlaceholderhpmOzss(cVar, t1Var, j10, placeholderHighlight, PlaceholderKt$placeholder$4.invoke$lambda$4(k1Var), l1Var.a(), l1Var2.a(), l1Var3.a()));
            b0VarD2.p();
        } else if (PlaceholderKt$placeholder$4.invoke$lambda$9(this.$placeholderAlpha$delegate) >= 0.99f) {
            this.$lastOutline.b(PlaceholderKt.m181drawPlaceholderhpmOzss(cVar, this.$shape, this.$color, this.$highlight, PlaceholderKt$placeholder$4.invoke$lambda$4(this.$highlightProgress$delegate), this.$lastOutline.a(), this.$lastLayoutDirection.a(), this.$lastSize.a()));
        }
        this.$lastSize.b(k1.l.c(cVar.c()));
        this.$lastLayoutDirection.b(cVar.getLayoutDirection());
    }
}
