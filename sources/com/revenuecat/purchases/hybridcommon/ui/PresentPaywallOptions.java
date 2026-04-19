package com.revenuecat.purchases.hybridcommon.ui;

import ae.j;
import ae.r;
import com.revenuecat.purchases.hybridcommon.ui.PaywallSource;
import com.revenuecat.purchases.ui.revenuecatui.fonts.PaywallFontFamily;

/* JADX INFO: loaded from: classes2.dex */
public final class PresentPaywallOptions {
    private final PaywallFontFamily fontFamily;
    private final PaywallResultListener paywallResultListener;
    private final PaywallSource paywallSource;
    private final String requiredEntitlementIdentifier;
    private final Boolean shouldDisplayDismissButton;

    public PresentPaywallOptions() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PresentPaywallOptions(PaywallSource paywallSource) {
        this(paywallSource, null, null, null, null, 30, null);
        r.f(paywallSource, "paywallSource");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PresentPaywallOptions(PaywallSource paywallSource, String str) {
        this(paywallSource, str, null, null, null, 28, null);
        r.f(paywallSource, "paywallSource");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PresentPaywallOptions(PaywallSource paywallSource, String str, PaywallResultListener paywallResultListener) {
        this(paywallSource, str, paywallResultListener, null, null, 24, null);
        r.f(paywallSource, "paywallSource");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PresentPaywallOptions(PaywallSource paywallSource, String str, PaywallResultListener paywallResultListener, Boolean bool) {
        this(paywallSource, str, paywallResultListener, bool, null, 16, null);
        r.f(paywallSource, "paywallSource");
    }

    public PresentPaywallOptions(PaywallSource paywallSource, String str, PaywallResultListener paywallResultListener, Boolean bool, PaywallFontFamily paywallFontFamily) {
        r.f(paywallSource, "paywallSource");
        this.paywallSource = paywallSource;
        this.requiredEntitlementIdentifier = str;
        this.paywallResultListener = paywallResultListener;
        this.shouldDisplayDismissButton = bool;
        this.fontFamily = paywallFontFamily;
    }

    public /* synthetic */ PresentPaywallOptions(PaywallSource paywallSource, String str, PaywallResultListener paywallResultListener, Boolean bool, PaywallFontFamily paywallFontFamily, int i10, j jVar) {
        this((i10 & 1) != 0 ? PaywallSource.DefaultOffering.INSTANCE : paywallSource, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : paywallResultListener, (i10 & 8) != 0 ? null : bool, (i10 & 16) == 0 ? paywallFontFamily : null);
    }

    public static /* synthetic */ PresentPaywallOptions copy$default(PresentPaywallOptions presentPaywallOptions, PaywallSource paywallSource, String str, PaywallResultListener paywallResultListener, Boolean bool, PaywallFontFamily paywallFontFamily, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            paywallSource = presentPaywallOptions.paywallSource;
        }
        if ((i10 & 2) != 0) {
            str = presentPaywallOptions.requiredEntitlementIdentifier;
        }
        String str2 = str;
        if ((i10 & 4) != 0) {
            paywallResultListener = presentPaywallOptions.paywallResultListener;
        }
        PaywallResultListener paywallResultListener2 = paywallResultListener;
        if ((i10 & 8) != 0) {
            bool = presentPaywallOptions.shouldDisplayDismissButton;
        }
        Boolean bool2 = bool;
        if ((i10 & 16) != 0) {
            paywallFontFamily = presentPaywallOptions.fontFamily;
        }
        return presentPaywallOptions.copy(paywallSource, str2, paywallResultListener2, bool2, paywallFontFamily);
    }

    public final PaywallSource component1() {
        return this.paywallSource;
    }

    public final String component2() {
        return this.requiredEntitlementIdentifier;
    }

    public final PaywallResultListener component3() {
        return this.paywallResultListener;
    }

    public final Boolean component4() {
        return this.shouldDisplayDismissButton;
    }

    public final PaywallFontFamily component5() {
        return this.fontFamily;
    }

    public final PresentPaywallOptions copy(PaywallSource paywallSource, String str, PaywallResultListener paywallResultListener, Boolean bool, PaywallFontFamily paywallFontFamily) {
        r.f(paywallSource, "paywallSource");
        return new PresentPaywallOptions(paywallSource, str, paywallResultListener, bool, paywallFontFamily);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PresentPaywallOptions)) {
            return false;
        }
        PresentPaywallOptions presentPaywallOptions = (PresentPaywallOptions) obj;
        return r.b(this.paywallSource, presentPaywallOptions.paywallSource) && r.b(this.requiredEntitlementIdentifier, presentPaywallOptions.requiredEntitlementIdentifier) && r.b(this.paywallResultListener, presentPaywallOptions.paywallResultListener) && r.b(this.shouldDisplayDismissButton, presentPaywallOptions.shouldDisplayDismissButton) && r.b(this.fontFamily, presentPaywallOptions.fontFamily);
    }

    public final PaywallFontFamily getFontFamily() {
        return this.fontFamily;
    }

    public final PaywallResultListener getPaywallResultListener() {
        return this.paywallResultListener;
    }

    public final PaywallSource getPaywallSource() {
        return this.paywallSource;
    }

    public final String getRequiredEntitlementIdentifier() {
        return this.requiredEntitlementIdentifier;
    }

    public final Boolean getShouldDisplayDismissButton() {
        return this.shouldDisplayDismissButton;
    }

    public int hashCode() {
        int iHashCode = this.paywallSource.hashCode() * 31;
        String str = this.requiredEntitlementIdentifier;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        PaywallResultListener paywallResultListener = this.paywallResultListener;
        int iHashCode3 = (iHashCode2 + (paywallResultListener == null ? 0 : paywallResultListener.hashCode())) * 31;
        Boolean bool = this.shouldDisplayDismissButton;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        PaywallFontFamily paywallFontFamily = this.fontFamily;
        return iHashCode4 + (paywallFontFamily != null ? paywallFontFamily.hashCode() : 0);
    }

    public String toString() {
        return "PresentPaywallOptions(paywallSource=" + this.paywallSource + ", requiredEntitlementIdentifier=" + this.requiredEntitlementIdentifier + ", paywallResultListener=" + this.paywallResultListener + ", shouldDisplayDismissButton=" + this.shouldDisplayDismissButton + ", fontFamily=" + this.fontFamily + ')';
    }
}
