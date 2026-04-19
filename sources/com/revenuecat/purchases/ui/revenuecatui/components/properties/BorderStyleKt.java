package com.revenuecat.purchases.ui.revenuecatui.components.properties;

import ae.r;
import com.revenuecat.purchases.paywalls.components.properties.Border;
import t0.l;
import t0.o;
import w2.h;

/* JADX INFO: loaded from: classes2.dex */
public final class BorderStyleKt {
    public static final /* synthetic */ BorderStyle toBorderStyle(Border border, l lVar, int i10) {
        r.f(border, "<this>");
        lVar.e(2012762968);
        if (o.I()) {
            o.U(2012762968, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.properties.toBorderStyle (BorderStyle.kt:19)");
        }
        BorderStyle borderStyle = new BorderStyle(h.m((float) border.getWidth()), ColorStyleKt.toColorStyle(border.getColor(), lVar, 8), null);
        if (o.I()) {
            o.T();
        }
        lVar.K();
        return borderStyle;
    }
}
