package com.revenuecat.purchases.ui.revenuecatui.data.processed;

import ae.r;
import com.revenuecat.purchases.paywalls.PaywallColor;
import com.revenuecat.purchases.paywalls.PaywallData;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.TemplateConfiguration;
import l1.j0;
import l1.l0;

/* JADX INFO: loaded from: classes2.dex */
public final class ColorsFactory {
    public static final ColorsFactory INSTANCE = new ColorsFactory();

    private ColorsFactory() {
    }

    public final TemplateConfiguration.Colors create(PaywallData.Configuration.Colors colors) {
        r.f(colors, "paywallDataColors");
        int colorInt = colors.getBackground().getColorInt();
        int colorInt2 = colors.getText1().getColorInt();
        PaywallColor text2 = colors.getText2();
        int colorInt3 = text2 != null ? text2.getColorInt() : colorInt2;
        PaywallColor text3 = colors.getText3();
        int colorInt4 = text3 != null ? text3.getColorInt() : colorInt3;
        int colorInt5 = colors.getCallToActionBackground().getColorInt();
        int colorInt6 = colors.getCallToActionForeground().getColorInt();
        PaywallColor callToActionSecondaryBackground = colors.getCallToActionSecondaryBackground();
        Integer numValueOf = callToActionSecondaryBackground != null ? Integer.valueOf(callToActionSecondaryBackground.getColorInt()) : null;
        PaywallColor accent1 = colors.getAccent1();
        int colorInt7 = accent1 != null ? accent1.getColorInt() : colorInt6;
        PaywallColor accent2 = colors.getAccent2();
        int colorInt8 = accent2 != null ? accent2.getColorInt() : colorInt7;
        PaywallColor accent3 = colors.getAccent3();
        int colorInt9 = accent3 != null ? accent3.getColorInt() : colorInt8;
        PaywallColor closeButton = colors.getCloseButton();
        Integer numValueOf2 = closeButton != null ? Integer.valueOf(closeButton.getColorInt()) : null;
        PaywallColor tierControlBackground = colors.getTierControlBackground();
        Integer numValueOf3 = tierControlBackground != null ? Integer.valueOf(tierControlBackground.getColorInt()) : null;
        PaywallColor tierControlForeground = colors.getTierControlForeground();
        Integer numValueOf4 = tierControlForeground != null ? Integer.valueOf(tierControlForeground.getColorInt()) : null;
        PaywallColor tierControlSelectedBackground = colors.getTierControlSelectedBackground();
        Integer numValueOf5 = tierControlSelectedBackground != null ? Integer.valueOf(tierControlSelectedBackground.getColorInt()) : null;
        PaywallColor tierControlSelectedForeground = colors.getTierControlSelectedForeground();
        Integer numValueOf6 = tierControlSelectedForeground != null ? Integer.valueOf(tierControlSelectedForeground.getColorInt()) : null;
        return new TemplateConfiguration.Colors(l0.b(colorInt), l0.b(colorInt2), l0.b(colorInt3), l0.b(colorInt4), l0.b(colorInt5), l0.b(colorInt6), numValueOf != null ? j0.m(l0.b(numValueOf.intValue())) : null, l0.b(colorInt7), l0.b(colorInt8), l0.b(colorInt9), numValueOf2 != null ? j0.m(l0.b(numValueOf2.intValue())) : null, numValueOf3 != null ? j0.m(l0.b(numValueOf3.intValue())) : null, numValueOf4 != null ? j0.m(l0.b(numValueOf4.intValue())) : null, numValueOf5 != null ? j0.m(l0.b(numValueOf5.intValue())) : null, numValueOf6 != null ? j0.m(l0.b(numValueOf6.intValue())) : null, null);
    }
}
