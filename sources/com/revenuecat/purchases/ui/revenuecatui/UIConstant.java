package com.revenuecat.purchases.ui.revenuecatui;

import c0.d0;
import c0.i;
import c0.i1;
import c0.j;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import l1.j0;
import w2.h;

/* JADX INFO: loaded from: classes2.dex */
public final class UIConstant {
    public static final int defaultAnimationDurationMillis = 200;
    private static final float defaultHorizontalPadding;
    private static final float defaultVerticalSpacing;
    public static final float halfWeight = 0.5f;
    public static final float purchaseInProgressButtonOpacity = 0.4f;
    public static final UIConstant INSTANCE = new UIConstant();
    private static final float defaultCornerRadius = h.m(20);
    private static final float defaultPackageCornerRadius = h.m(16);
    private static final float defaultPackageBorderWidth = h.m((float) 1.5d);
    private static final i<j0> defaultColorAnimation = j.i(RCHTTPStatusCodes.UNSUCCESSFUL, 0, d0.d(), 2, null);
    private static final float iconButtonSize = h.m(48);

    static {
        float f10 = 12;
        defaultHorizontalPadding = h.m(f10);
        defaultVerticalSpacing = h.m(f10);
    }

    private UIConstant() {
    }

    public final <T> i1<T> defaultAnimation() {
        return j.i(200, 0, d0.e(), 2, null);
    }

    public final i<j0> getDefaultColorAnimation() {
        return defaultColorAnimation;
    }

    /* JADX INFO: renamed from: getDefaultCornerRadius-D9Ej5fM, reason: not valid java name */
    public final float m79getDefaultCornerRadiusD9Ej5fM() {
        return defaultCornerRadius;
    }

    /* JADX INFO: renamed from: getDefaultHorizontalPadding-D9Ej5fM, reason: not valid java name */
    public final float m80getDefaultHorizontalPaddingD9Ej5fM() {
        return defaultHorizontalPadding;
    }

    /* JADX INFO: renamed from: getDefaultPackageBorderWidth-D9Ej5fM, reason: not valid java name */
    public final float m81getDefaultPackageBorderWidthD9Ej5fM() {
        return defaultPackageBorderWidth;
    }

    /* JADX INFO: renamed from: getDefaultPackageCornerRadius-D9Ej5fM, reason: not valid java name */
    public final float m82getDefaultPackageCornerRadiusD9Ej5fM() {
        return defaultPackageCornerRadius;
    }

    /* JADX INFO: renamed from: getDefaultVerticalSpacing-D9Ej5fM, reason: not valid java name */
    public final float m83getDefaultVerticalSpacingD9Ej5fM() {
        return defaultVerticalSpacing;
    }

    /* JADX INFO: renamed from: getIconButtonSize-D9Ej5fM, reason: not valid java name */
    public final float m84getIconButtonSizeD9Ej5fM() {
        return iconButtonSize;
    }
}
