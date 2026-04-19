package com.revenuecat.purchases.ui.revenuecatui.composables;

import w2.h;
import y1.f;

/* JADX INFO: loaded from: classes2.dex */
final class BackgroundUIConstants {
    public static final float blurAlpha = 0.7f;
    public static final int minSDKVersionSupportingBlur = 31;
    public static final BackgroundUIConstants INSTANCE = new BackgroundUIConstants();
    private static final float blurSize = h.m(60);
    private static final f contentScale = f.f23237a.a();

    private BackgroundUIConstants() {
    }

    /* JADX INFO: renamed from: getBlurSize-D9Ej5fM, reason: not valid java name */
    public final float m143getBlurSizeD9Ej5fM() {
        return blurSize;
    }

    public final f getContentScale() {
        return contentScale;
    }
}
