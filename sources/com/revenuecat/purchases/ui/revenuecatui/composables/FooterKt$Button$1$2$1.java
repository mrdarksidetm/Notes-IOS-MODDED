package com.revenuecat.purchases.ui.revenuecatui.composables;

import ae.r;
import ae.s;
import g2.v;
import g2.x;
import i2.d;
import md.i0;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
final class FooterKt$Button$1$2$1 extends s implements l<x, i0> {
    final /* synthetic */ String $firstText;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FooterKt$Button$1$2$1(String str) {
        super(1);
        this.$firstText = str;
    }

    @Override // zd.l
    public /* bridge */ /* synthetic */ i0 invoke(x xVar) {
        invoke2(xVar);
        return i0.f15558a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(x xVar) {
        r.f(xVar, "$this$semantics");
        v.C(xVar, new d(this.$firstText, null, null, 6, null));
    }
}
