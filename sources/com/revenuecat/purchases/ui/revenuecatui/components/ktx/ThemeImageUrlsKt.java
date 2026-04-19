package com.revenuecat.purchases.ui.revenuecatui.components.ktx;

import ae.r;
import com.revenuecat.purchases.paywalls.components.properties.ImageUrls;
import com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls;
import t0.l;
import t0.o;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ThemeImageUrlsKt {
    public static final ImageUrls getUrlsForCurrentTheme(ThemeImageUrls themeImageUrls, l lVar, int i10) {
        ImageUrls light;
        r.f(themeImageUrls, "<this>");
        if (o.I()) {
            o.U(154958320, i10, -1, "com.revenuecat.purchases.ui.revenuecatui.components.ktx.<get-urlsForCurrentTheme> (ThemeImageUrls.kt:12)");
        }
        if (!d0.o.a(lVar, 0) || (light = themeImageUrls.getDark()) == null) {
            light = themeImageUrls.getLight();
        }
        if (o.I()) {
            o.T();
        }
        return light;
    }
}
