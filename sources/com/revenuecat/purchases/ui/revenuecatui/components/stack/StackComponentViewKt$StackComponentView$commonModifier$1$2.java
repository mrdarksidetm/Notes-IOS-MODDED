package com.revenuecat.purchases.ui.revenuecatui.components.stack;

import ae.r;
import ae.s;
import androidx.compose.ui.e;
import com.revenuecat.purchases.ui.revenuecatui.components.modifier.BackgroundKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BackgroundStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.StackComponentStyle;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
final class StackComponentViewKt$StackComponentView$commonModifier$1$2 extends s implements p<e, BackgroundStyle, e> {
    final /* synthetic */ StackComponentStyle $style;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StackComponentViewKt$StackComponentView$commonModifier$1$2(StackComponentStyle stackComponentStyle) {
        super(2);
        this.$style = stackComponentStyle;
    }

    @Override // zd.p
    public final e invoke(e eVar, BackgroundStyle backgroundStyle) {
        r.f(eVar, "$this$applyIfNotNull");
        r.f(backgroundStyle, "it");
        return BackgroundKt.background(eVar, backgroundStyle, this.$style.getShape());
    }
}
