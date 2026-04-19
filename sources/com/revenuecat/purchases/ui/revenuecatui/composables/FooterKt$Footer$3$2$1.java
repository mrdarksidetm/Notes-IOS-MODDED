package com.revenuecat.purchases.ui.revenuecatui.composables;

import ae.r;
import ae.s;
import android.content.Context;
import java.net.URL;
import md.i0;
import zd.a;

/* JADX INFO: loaded from: classes2.dex */
final class FooterKt$Footer$3$2$1 extends s implements a<i0> {
    final /* synthetic */ Context $context;
    final /* synthetic */ URL $it;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FooterKt$Footer$3$2$1(Context context, URL url) {
        super(0);
        this.$context = context;
        this.$it = url;
    }

    @Override // zd.a
    public /* bridge */ /* synthetic */ i0 invoke() {
        invoke2();
        return i0.f15558a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Context context = this.$context;
        r.e(context, "context");
        FooterKt.openURL(context, this.$it);
    }
}
