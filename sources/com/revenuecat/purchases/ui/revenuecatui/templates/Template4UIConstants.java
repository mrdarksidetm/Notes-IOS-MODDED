package com.revenuecat.purchases.ui.revenuecatui.templates;

import w2.h;

/* JADX INFO: loaded from: classes2.dex */
final class Template4UIConstants {
    private static final float checkmarkPadding;
    private static final float discountVerticalPadding;
    public static final float maxPackagesToDisplay = 3.0f;
    private static final float packageButtonContentVerticalSpacing;
    private static final float packageHorizontalSpacing;
    public static final Template4UIConstants INSTANCE = new Template4UIConstants();
    private static final float packagesHorizontalPadding = h.m(24);
    private static final float checkmarkSize = h.m(18);

    static {
        float f10 = 4;
        packageButtonContentVerticalSpacing = h.m(f10);
        float f11 = 8;
        packageHorizontalSpacing = h.m(f11);
        checkmarkPadding = h.m(f11);
        discountVerticalPadding = h.m(f10);
    }

    private Template4UIConstants() {
    }

    /* JADX INFO: renamed from: getCheckmarkPadding-D9Ej5fM, reason: not valid java name */
    public final float m271getCheckmarkPaddingD9Ej5fM() {
        return checkmarkPadding;
    }

    /* JADX INFO: renamed from: getCheckmarkSize-D9Ej5fM, reason: not valid java name */
    public final float m272getCheckmarkSizeD9Ej5fM() {
        return checkmarkSize;
    }

    /* JADX INFO: renamed from: getDiscountVerticalPadding-D9Ej5fM, reason: not valid java name */
    public final float m273getDiscountVerticalPaddingD9Ej5fM() {
        return discountVerticalPadding;
    }

    /* JADX INFO: renamed from: getPackageButtonContentVerticalSpacing-D9Ej5fM, reason: not valid java name */
    public final float m274getPackageButtonContentVerticalSpacingD9Ej5fM() {
        return packageButtonContentVerticalSpacing;
    }

    /* JADX INFO: renamed from: getPackageHorizontalSpacing-D9Ej5fM, reason: not valid java name */
    public final float m275getPackageHorizontalSpacingD9Ej5fM() {
        return packageHorizontalSpacing;
    }

    /* JADX INFO: renamed from: getPackagesHorizontalPadding-D9Ej5fM, reason: not valid java name */
    public final float m276getPackagesHorizontalPaddingD9Ej5fM() {
        return packagesHorizontalPadding;
    }
}
