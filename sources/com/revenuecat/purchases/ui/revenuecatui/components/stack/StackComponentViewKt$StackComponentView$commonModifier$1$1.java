package com.revenuecat.purchases.ui.revenuecatui.components.stack;

import ae.r;
import ae.s;
import androidx.compose.ui.e;
import com.revenuecat.purchases.ui.revenuecatui.components.modifier.ShadowKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ShadowStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.StackComponentStyle;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
final class StackComponentViewKt$StackComponentView$commonModifier$1$1 extends s implements p<e, ShadowStyle, e> {
    final /* synthetic */ StackComponentStyle $style;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StackComponentViewKt$StackComponentView$commonModifier$1$1(StackComponentStyle stackComponentStyle) {
        super(2);
        this.$style = stackComponentStyle;
    }

    @Override // zd.p
    public final e invoke(e eVar, ShadowStyle shadowStyle) {
        r.f(eVar, "$this$applyIfNotNull");
        r.f(shadowStyle, "it");
        return ShadowKt.shadow(eVar, shadowStyle, this.$style.getShape());
    }
}
