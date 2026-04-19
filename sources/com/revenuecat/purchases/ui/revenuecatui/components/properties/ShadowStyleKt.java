package com.revenuecat.purchases.ui.revenuecatui.components.properties;

import ae.r;
import com.revenuecat.purchases.paywalls.components.properties.Shadow;
import t0.l;
import t0.o;
import w2.h;

/* JADX INFO: loaded from: classes2.dex */
public final class ShadowStyleKt {
    public static final /* synthetic */ ShadowStyle toShadowStyle(Shadow shadow, l lVar, int i10) {
        r.f(shadow, "<this>");
        lVar.e(-309145408);
        if (o.I()) {
            o.U(-309145408, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.properties.toShadowStyle (ShadowStyle.kt:21)");
        }
        ShadowStyle shadowStyle = new ShadowStyle(ColorStyleKt.toColorStyle(shadow.getColor(), lVar, 8), h.m((float) shadow.getRadius()), h.m((float) shadow.getX()), h.m((float) shadow.getY()), null);
        if (o.I()) {
            o.T();
        }
        lVar.K();
        return shadowStyle;
    }
}
