package com.revenuecat.purchases.ui.revenuecatui.fonts;

import ae.r;

/* JADX INFO: loaded from: classes2.dex */
public final class CustomParcelizableFontProvider implements ParcelizableFontProvider {
    public static final int $stable = 8;
    private final PaywallFontFamily fontFamily;

    public CustomParcelizableFontProvider(PaywallFontFamily paywallFontFamily) {
        r.f(paywallFontFamily, "fontFamily");
        this.fontFamily = paywallFontFamily;
    }

    @Override // com.revenuecat.purchases.ui.revenuecatui.fonts.ParcelizableFontProvider
    public PaywallFontFamily getFont(TypographyType typographyType) {
        r.f(typographyType, "type");
        return this.fontFamily;
    }
}
