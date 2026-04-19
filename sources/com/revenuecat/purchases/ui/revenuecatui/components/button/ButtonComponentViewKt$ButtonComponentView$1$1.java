package com.revenuecat.purchases.ui.revenuecatui.components.button;

import ae.s;
import com.revenuecat.purchases.ui.revenuecatui.components.style.ButtonComponentStyle;
import md.i0;
import zd.a;

/* JADX INFO: loaded from: classes2.dex */
final class ButtonComponentViewKt$ButtonComponentView$1$1 extends s implements a<i0> {
    final /* synthetic */ ButtonComponentStyle $style;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ButtonComponentViewKt$ButtonComponentView$1$1(ButtonComponentStyle buttonComponentStyle) {
        super(0);
        this.$style = buttonComponentStyle;
    }

    @Override // zd.a
    public /* bridge */ /* synthetic */ i0 invoke() {
        invoke2();
        return i0.f15558a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$style.getActionHandler().invoke(this.$style.getAction());
    }
}
