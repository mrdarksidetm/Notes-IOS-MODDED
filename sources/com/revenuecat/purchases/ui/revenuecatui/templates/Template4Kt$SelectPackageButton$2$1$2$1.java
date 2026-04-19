package com.revenuecat.purchases.ui.revenuecatui.templates;

import ae.r;
import ae.s;
import g2.v;
import g2.x;
import i2.d;
import md.i0;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
final class Template4Kt$SelectPackageButton$2$1$2$1 extends s implements l<x, i0> {
    final /* synthetic */ String $discountText;
    final /* synthetic */ boolean $isSelected;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Template4Kt$SelectPackageButton$2$1$2$1(boolean z10, String str) {
        super(1);
        this.$isSelected = z10;
        this.$discountText = str;
    }

    @Override // zd.l
    public /* bridge */ /* synthetic */ i0 invoke(x xVar) {
        invoke2(xVar);
        return i0.f15558a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(x xVar) {
        r.f(xVar, "$this$semantics");
        v.z(xVar, this.$isSelected);
        String str = this.$discountText;
        if (str != null) {
            v.C(xVar, new d(str, null, null, 6, null));
        }
    }
}
