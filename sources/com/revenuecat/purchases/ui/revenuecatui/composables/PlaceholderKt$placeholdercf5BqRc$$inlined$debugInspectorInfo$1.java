package com.revenuecat.purchases.ui.revenuecatui.composables;

import ae.s;
import b2.w0;
import l1.j0;
import l1.t1;
import md.i0;
import zd.l;

/* JADX INFO: renamed from: com.revenuecat.purchases.ui.revenuecatui.composables.PlaceholderKt$placeholder-cf5BqRc$$inlined$debugInspectorInfo$1, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class PlaceholderKt$placeholdercf5BqRc$$inlined$debugInspectorInfo$1 extends s implements l<w0, i0> {
    final /* synthetic */ long $color$inlined;
    final /* synthetic */ PlaceholderHighlight $highlight$inlined;
    final /* synthetic */ t1 $shape$inlined;
    final /* synthetic */ boolean $visible$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaceholderKt$placeholdercf5BqRc$$inlined$debugInspectorInfo$1(boolean z10, long j10, PlaceholderHighlight placeholderHighlight, t1 t1Var) {
        super(1);
        this.$visible$inlined = z10;
        this.$color$inlined = j10;
        this.$highlight$inlined = placeholderHighlight;
        this.$shape$inlined = t1Var;
    }

    @Override // zd.l
    public /* bridge */ /* synthetic */ i0 invoke(w0 w0Var) {
        invoke2(w0Var);
        return i0.f15558a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(w0 w0Var) {
        w0Var.b("placeholder");
        w0Var.c(Boolean.valueOf(this.$visible$inlined));
        w0Var.a().c("visible", Boolean.valueOf(this.$visible$inlined));
        w0Var.a().c("color", j0.m(this.$color$inlined));
        w0Var.a().c("highlight", this.$highlight$inlined);
        w0Var.a().c("shape", this.$shape$inlined);
    }
}
