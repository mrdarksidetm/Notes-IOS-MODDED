package com.revenuecat.purchases.ui.revenuecatui.components.image;

import ae.r;
import ae.s;
import androidx.compose.ui.e;
import com.revenuecat.purchases.ui.revenuecatui.components.modifier.OverlayKt;
import com.revenuecat.purchases.ui.revenuecatui.components.properties.ColorStyle;
import com.revenuecat.purchases.ui.revenuecatui.components.style.ImageComponentStyle;
import l1.m1;
import l1.t1;
import zd.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
public final class ImageComponentViewKt$ImageComponentView$1$1 extends s implements p<e, ColorStyle, e> {
    final /* synthetic */ ImageComponentStyle $style;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ImageComponentViewKt$ImageComponentView$1$1(ImageComponentStyle imageComponentStyle) {
        super(2);
        this.$style = imageComponentStyle;
    }

    @Override // zd.p
    public final e invoke(e eVar, ColorStyle colorStyle) {
        r.f(eVar, "$this$applyIfNotNull");
        r.f(colorStyle, "it");
        t1 shape = this.$style.getShape();
        if (shape == null) {
            shape = m1.a();
        }
        return OverlayKt.overlay(eVar, colorStyle, shape);
    }
}
