package com.revenuecat.purchases.ui.revenuecatui.components.ktx;

import ae.r;
import com.revenuecat.purchases.paywalls.components.properties.ColorInfo;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import t0.l;
import t0.o;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ColorSchemeKt {
    public static final /* synthetic */ ColorInfo getColorsForCurrentTheme(ColorScheme colorScheme, l lVar, int i10) {
        ColorInfo light;
        r.f(colorScheme, "<this>");
        lVar.e(1507855460);
        if (o.I()) {
            o.U(1507855460, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.ktx.<get-colorsForCurrentTheme> (ColorScheme.kt:11)");
        }
        if (!d0.o.a(lVar, 0) || (light = colorScheme.getDark()) == null) {
            light = colorScheme.getLight();
        }
        if (o.I()) {
            o.T();
        }
        lVar.K();
        return light;
    }
}
