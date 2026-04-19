package com.revenuecat.purchases.ui.revenuecatui.composables;

import ae.r;
import ae.s;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Logger;
import md.i0;
import z5.b;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
final class RemoteImageKt$AsyncImage$1$1 extends s implements l<b.c.C0495b, i0> {
    public static final RemoteImageKt$AsyncImage$1$1 INSTANCE = new RemoteImageKt$AsyncImage$1$1();

    RemoteImageKt$AsyncImage$1$1() {
        super(1);
    }

    @Override // zd.l
    public /* bridge */ /* synthetic */ i0 invoke(b.c.C0495b c0495b) {
        invoke2(c0495b);
        return i0.f15558a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(b.c.C0495b c0495b) {
        r.f(c0495b, "errorState");
        Logger.INSTANCE.e("Error loading placeholder image", c0495b.d().c());
    }
}
