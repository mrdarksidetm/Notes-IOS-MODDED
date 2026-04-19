package com.revenuecat.purchases.ui.revenuecatui.extensions;

import ae.r;
import com.revenuecat.purchases.ui.revenuecatui.fonts.FontProvider;
import com.revenuecat.purchases.ui.revenuecatui.fonts.TypographyType;
import i2.g0;
import n2.t;
import q0.r0;

/* JADX INFO: loaded from: classes2.dex */
public final class TypographyExtensionsKt {
    public static final r0 copyWithFontProvider(r0 r0Var, FontProvider fontProvider) {
        r.f(r0Var, "<this>");
        r.f(fontProvider, "fontProvider");
        return r0Var.a(modifyFontIfNeeded(r0Var.e(), TypographyType.DISPLAY_LARGE, fontProvider), modifyFontIfNeeded(r0Var.f(), TypographyType.DISPLAY_MEDIUM, fontProvider), modifyFontIfNeeded(r0Var.g(), TypographyType.DISPLAY_SMALL, fontProvider), modifyFontIfNeeded(r0Var.h(), TypographyType.HEADLINE_LARGE, fontProvider), modifyFontIfNeeded(r0Var.i(), TypographyType.HEADLINE_MEDIUM, fontProvider), modifyFontIfNeeded(r0Var.j(), TypographyType.HEADLINE_SMALL, fontProvider), modifyFontIfNeeded(r0Var.n(), TypographyType.TITLE_LARGE, fontProvider), modifyFontIfNeeded(r0Var.o(), TypographyType.TITLE_MEDIUM, fontProvider), modifyFontIfNeeded(r0Var.p(), TypographyType.TITLE_SMALL, fontProvider), modifyFontIfNeeded(r0Var.b(), TypographyType.BODY_LARGE, fontProvider), modifyFontIfNeeded(r0Var.c(), TypographyType.BODY_MEDIUM, fontProvider), modifyFontIfNeeded(r0Var.d(), TypographyType.BODY_SMALL, fontProvider), modifyFontIfNeeded(r0Var.k(), TypographyType.LABEL_LARGE, fontProvider), modifyFontIfNeeded(r0Var.l(), TypographyType.LABEL_MEDIUM, fontProvider), modifyFontIfNeeded(r0Var.m(), TypographyType.LABEL_SMALL, fontProvider));
    }

    private static final g0 modifyFontIfNeeded(g0 g0Var, TypographyType typographyType, FontProvider fontProvider) {
        t font = fontProvider.getFont(typographyType);
        return font == null ? g0Var : g0Var.d((15204351 & 1) != 0 ? g0Var.f12368a.g() : 0L, (15204351 & 2) != 0 ? g0Var.f12368a.k() : 0L, (15204351 & 4) != 0 ? g0Var.f12368a.n() : null, (15204351 & 8) != 0 ? g0Var.f12368a.l() : null, (15204351 & 16) != 0 ? g0Var.f12368a.m() : null, (15204351 & 32) != 0 ? g0Var.f12368a.i() : font, (15204351 & 64) != 0 ? g0Var.f12368a.j() : null, (15204351 & 128) != 0 ? g0Var.f12368a.o() : 0L, (15204351 & 256) != 0 ? g0Var.f12368a.e() : null, (15204351 & 512) != 0 ? g0Var.f12368a.u() : null, (15204351 & 1024) != 0 ? g0Var.f12368a.p() : null, (15204351 & 2048) != 0 ? g0Var.f12368a.d() : 0L, (15204351 & 4096) != 0 ? g0Var.f12368a.s() : null, (15204351 & 8192) != 0 ? g0Var.f12368a.r() : null, (15204351 & 16384) != 0 ? g0Var.f12368a.h() : null, (15204351 & 32768) != 0 ? g0Var.f12369b.h() : 0, (15204351 & 65536) != 0 ? g0Var.f12369b.i() : 0, (15204351 & 131072) != 0 ? g0Var.f12369b.e() : 0L, (15204351 & 262144) != 0 ? g0Var.f12369b.j() : null, (15204351 & 524288) != 0 ? g0Var.f12370c : null, (15204351 & 1048576) != 0 ? g0Var.f12369b.f() : null, (15204351 & 2097152) != 0 ? g0Var.f12369b.d() : 0, (15204351 & 4194304) != 0 ? g0Var.f12369b.c() : 0, (15204351 & 8388608) != 0 ? g0Var.f12369b.k() : null);
    }
}
