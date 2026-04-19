package com.revenuecat.purchases.ui.revenuecatui.components.stack;

import ae.r;
import ae.s;
import androidx.compose.ui.e;
import com.revenuecat.purchases.ui.revenuecatui.components.modifier.BorderKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.BorderStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.StackComponentStyle;
import zd.p;

/* JADX INFO: loaded from: classes2.dex */
final class StackComponentViewKt$StackComponentView$commonModifier$1$3 extends s implements p<e, BorderStyle, e> {
    final /* synthetic */ StackComponentStyle $style;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StackComponentViewKt$StackComponentView$commonModifier$1$3(StackComponentStyle stackComponentStyle) {
        super(2);
        this.$style = stackComponentStyle;
    }

    @Override // zd.p
    public final e invoke(e eVar, BorderStyle borderStyle) {
        r.f(eVar, "$this$applyIfNotNull");
        r.f(borderStyle, "it");
        return BorderKt.border(eVar, borderStyle, this.$style.getShape());
    }
}
