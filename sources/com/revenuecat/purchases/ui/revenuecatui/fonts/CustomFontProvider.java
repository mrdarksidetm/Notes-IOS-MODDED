package com.revenuecat.purchases.ui.revenuecatui.fonts;

import ae.r;
import n2.t;

/* JADX INFO: loaded from: classes2.dex */
public final class CustomFontProvider implements FontProvider {
    public static final int $stable = 0;
    private final t fontFamily;

    public CustomFontProvider(t tVar) {
        r.f(tVar, "fontFamily");
        this.fontFamily = tVar;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.fonts.FontProvider
    public t getFont(TypographyType typographyType) {
        r.f(typographyType, "type");
        return this.fontFamily;
    }
}
