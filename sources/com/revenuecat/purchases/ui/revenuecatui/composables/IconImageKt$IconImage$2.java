package com.revenuecat.purchases.ui.revenuecatui.composables;

import ae.s;
import android.net.Uri;
import androidx.compose.ui.e;
import md.i0;
import t0.e2;
import t0.l;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
final class IconImageKt$IconImage$2 extends s implements p<l, Integer, i0> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ e $childModifier;
    final /* synthetic */ float $iconCornerRadius;
    final /* synthetic */ float $maxWidth;
    final /* synthetic */ Uri $uri;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IconImageKt$IconImage$2(Uri uri, float f10, float f11, e eVar, int i10, int i11) {
        super(2);
        this.$uri = uri;
        this.$maxWidth = f10;
        this.$iconCornerRadius = f11;
        this.$childModifier = eVar;
        this.$$changed = i10;
        this.$$default = i11;
    }

    @Override // zd.p
    public /* bridge */ /* synthetic */ i0 invoke(l lVar, Integer num) {
        invoke(lVar, num.intValue());
        return i0.f15558a;
    }

    public final void invoke(l lVar, int i10) {
        IconImageKt.m153IconImagedjqsMU(this.$uri, this.$maxWidth, this.$iconCornerRadius, this.$childModifier, lVar, e2.a(this.$$changed | 1), this.$$default);
    }
}
