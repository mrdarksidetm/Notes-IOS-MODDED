package com.revenuecat.purchases.ui.revenuecatui.composables;

import ae.r;
import ae.s;
import com.revenuecat.purchases.ui.revenuecatui.helpers.Logger;
import md.i0;
import t0.k1;
import z5.b;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
final class RemoteImageKt$Image$2$1 extends s implements l<b.c.C0495b, i0> {
    final /* synthetic */ k1<Boolean> $useCache$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RemoteImageKt$Image$2$1(k1<Boolean> k1Var) {
        super(1);
        this.$useCache$delegate = k1Var;
    }

    @Override // zd.l
    public /* bridge */ /* synthetic */ i0 invoke(b.c.C0495b c0495b) {
        invoke2(c0495b);
        return i0.f15558a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(b.c.C0495b c0495b) {
        r.f(c0495b, "it");
        Logger.INSTANCE.w("Image failed to load. Will try again disabling cache");
        RemoteImageKt.Image$lambda$3(this.$useCache$delegate, false);
    }
}
