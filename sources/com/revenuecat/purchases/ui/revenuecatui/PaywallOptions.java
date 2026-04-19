package com.revenuecat.purchases.ui.revenuecatui;

import ae.j;
import ae.r;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.ui.revenuecatui.OfferingSelection;
import com.revenuecat.purchases.ui.revenuecatui.fonts.FontProvider;
import md.i0;
import zd.a;

/* JADX INFO: loaded from: classes2.dex */
public final class PaywallOptions {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final int hashMultiplier = 31;
    private final String dataHash;
    private final a<i0> dismissRequest;
    private final FontProvider fontProvider;
    private final PaywallListener listener;
    private final PaywallMode mode;
    private final OfferingSelection offeringSelection;
    private final PurchaseLogic purchaseLogic;
    private final boolean shouldDisplayDismissButton;

    public static final class Builder {
        public static final int $stable = 8;
        private final a<i0> dismissRequest;
        private FontProvider fontProvider;
        private PaywallListener listener;
        private PaywallMode mode;
        private OfferingSelection offeringSelection;
        private PurchaseLogic purchaseLogic;
        private boolean shouldDisplayDismissButton;

        public Builder(a<i0> aVar) {
            r.f(aVar, "dismissRequest");
            this.dismissRequest = aVar;
            this.offeringSelection = OfferingSelection.None.INSTANCE;
            this.mode = PaywallMode.Companion.getDefault();
        }

        public final PaywallOptions build() {
            return new PaywallOptions(this);
        }

        public final a<i0> getDismissRequest$revenuecatui_defaultsRelease() {
            return this.dismissRequest;
        }

        public final FontProvider getFontProvider$revenuecatui_defaultsRelease() {
            return this.fontProvider;
        }

        public final PaywallListener getListener$revenuecatui_defaultsRelease() {
            return this.listener;
        }

        public final PaywallMode getMode$revenuecatui_defaultsRelease() {
            return this.mode;
        }

        public final OfferingSelection getOfferingSelection$revenuecatui_defaultsRelease() {
            return this.offeringSelection;
        }

        public final PurchaseLogic getPurchaseLogic$revenuecatui_defaultsRelease() {
            return this.purchaseLogic;
        }

        public final boolean getShouldDisplayDismissButton$revenuecatui_defaultsRelease() {
            return this.shouldDisplayDismissButton;
        }

        public final Builder setFontProvider(FontProvider fontProvider) {
            this.fontProvider = fontProvider;
            return this;
        }

        public final void setFontProvider$revenuecatui_defaultsRelease(FontProvider fontProvider) {
            this.fontProvider = fontProvider;
        }

        public final Builder setListener(PaywallListener paywallListener) {
            this.listener = paywallListener;
            return this;
        }

        public final void setListener$revenuecatui_defaultsRelease(PaywallListener paywallListener) {
            this.listener = paywallListener;
        }

        public final Builder setMode$revenuecatui_defaultsRelease(PaywallMode paywallMode) {
            r.f(paywallMode, "mode");
            this.mode = paywallMode;
            return this;
        }

        /* JADX INFO: renamed from: setMode$revenuecatui_defaultsRelease, reason: collision with other method in class */
        public final void m78setMode$revenuecatui_defaultsRelease(PaywallMode paywallMode) {
            r.f(paywallMode, "<set-?>");
            this.mode = paywallMode;
        }

        public final Builder setOffering(Offering offering) {
            this.offeringSelection = offering != null ? new OfferingSelection.OfferingType(offering) : OfferingSelection.None.INSTANCE;
            return this;
        }

        public final Builder setOfferingId$revenuecatui_defaultsRelease(String str) {
            this.offeringSelection = str != null ? new OfferingSelection.OfferingId(str) : OfferingSelection.None.INSTANCE;
            return this;
        }

        public final void setOfferingSelection$revenuecatui_defaultsRelease(OfferingSelection offeringSelection) {
            r.f(offeringSelection, "<set-?>");
            this.offeringSelection = offeringSelection;
        }

        public final Builder setPurchaseLogic(PurchaseLogic purchaseLogic) {
            this.purchaseLogic = purchaseLogic;
            return this;
        }

        public final void setPurchaseLogic$revenuecatui_defaultsRelease(PurchaseLogic purchaseLogic) {
            this.purchaseLogic = purchaseLogic;
        }

        public final Builder setShouldDisplayDismissButton(boolean z10) {
            this.shouldDisplayDismissButton = z10;
            return this;
        }

        public final void setShouldDisplayDismissButton$revenuecatui_defaultsRelease(boolean z10) {
            this.shouldDisplayDismissButton = z10;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }
    }

    public PaywallOptions(OfferingSelection offeringSelection, boolean z10, FontProvider fontProvider, PaywallListener paywallListener, PurchaseLogic purchaseLogic, PaywallMode paywallMode, a<i0> aVar) {
        r.f(offeringSelection, "offeringSelection");
        r.f(paywallMode, "mode");
        r.f(aVar, "dismissRequest");
        this.offeringSelection = offeringSelection;
        this.shouldDisplayDismissButton = z10;
        this.fontProvider = fontProvider;
        this.listener = paywallListener;
        this.purchaseLogic = purchaseLogic;
        this.mode = paywallMode;
        this.dismissRequest = aVar;
        String offeringIdentifier = offeringSelection.getOfferingIdentifier();
        this.dataHash = String.valueOf(((((offeringIdentifier != null ? offeringIdentifier.hashCode() : 0) * 31) + Boolean.hashCode(z10)) * 31) + paywallMode.hashCode());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaywallOptions(Builder builder) {
        this(builder.getOfferingSelection$revenuecatui_defaultsRelease(), builder.getShouldDisplayDismissButton$revenuecatui_defaultsRelease(), builder.getFontProvider$revenuecatui_defaultsRelease(), builder.getListener$revenuecatui_defaultsRelease(), builder.getPurchaseLogic$revenuecatui_defaultsRelease(), builder.getMode$revenuecatui_defaultsRelease(), builder.getDismissRequest$revenuecatui_defaultsRelease());
        r.f(builder, "builder");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaywallOptions copy$default(PaywallOptions paywallOptions, OfferingSelection offeringSelection, boolean z10, FontProvider fontProvider, PaywallListener paywallListener, PurchaseLogic purchaseLogic, PaywallMode paywallMode, a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            offeringSelection = paywallOptions.offeringSelection;
        }
        if ((i10 & 2) != 0) {
            z10 = paywallOptions.shouldDisplayDismissButton;
        }
        boolean z11 = z10;
        if ((i10 & 4) != 0) {
            fontProvider = paywallOptions.fontProvider;
        }
        FontProvider fontProvider2 = fontProvider;
        if ((i10 & 8) != 0) {
            paywallListener = paywallOptions.listener;
        }
        PaywallListener paywallListener2 = paywallListener;
        if ((i10 & 16) != 0) {
            purchaseLogic = paywallOptions.purchaseLogic;
        }
        PurchaseLogic purchaseLogic2 = purchaseLogic;
        if ((i10 & 32) != 0) {
            paywallMode = paywallOptions.mode;
        }
        PaywallMode paywallMode2 = paywallMode;
        if ((i10 & 64) != 0) {
            aVar = paywallOptions.dismissRequest;
        }
        return paywallOptions.copy(offeringSelection, z11, fontProvider2, paywallListener2, purchaseLogic2, paywallMode2, aVar);
    }

    public final OfferingSelection component1$revenuecatui_defaultsRelease() {
        return this.offeringSelection;
    }

    public final boolean component2$revenuecatui_defaultsRelease() {
        return this.shouldDisplayDismissButton;
    }

    public final FontProvider component3() {
        return this.fontProvider;
    }

    public final PaywallListener component4() {
        return this.listener;
    }

    public final PurchaseLogic component5() {
        return this.purchaseLogic;
    }

    public final PaywallMode component6$revenuecatui_defaultsRelease() {
        return this.mode;
    }

    public final a<i0> component7() {
        return this.dismissRequest;
    }

    public final PaywallOptions copy(OfferingSelection offeringSelection, boolean z10, FontProvider fontProvider, PaywallListener paywallListener, PurchaseLogic purchaseLogic, PaywallMode paywallMode, a<i0> aVar) {
        r.f(offeringSelection, "offeringSelection");
        r.f(paywallMode, "mode");
        r.f(aVar, "dismissRequest");
        return new PaywallOptions(offeringSelection, z10, fontProvider, paywallListener, purchaseLogic, paywallMode, aVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaywallOptions)) {
            return false;
        }
        PaywallOptions paywallOptions = (PaywallOptions) obj;
        return r.b(this.offeringSelection, paywallOptions.offeringSelection) && this.shouldDisplayDismissButton == paywallOptions.shouldDisplayDismissButton && r.b(this.fontProvider, paywallOptions.fontProvider) && r.b(this.listener, paywallOptions.listener) && r.b(this.purchaseLogic, paywallOptions.purchaseLogic) && this.mode == paywallOptions.mode && r.b(this.dismissRequest, paywallOptions.dismissRequest);
    }

    public final String getDataHash$revenuecatui_defaultsRelease() {
        return this.dataHash;
    }

    public final a<i0> getDismissRequest() {
        return this.dismissRequest;
    }

    public final FontProvider getFontProvider() {
        return this.fontProvider;
    }

    public final PaywallListener getListener() {
        return this.listener;
    }

    public final PaywallMode getMode$revenuecatui_defaultsRelease() {
        return this.mode;
    }

    public final OfferingSelection getOfferingSelection$revenuecatui_defaultsRelease() {
        return this.offeringSelection;
    }

    public final PurchaseLogic getPurchaseLogic() {
        return this.purchaseLogic;
    }

    public final boolean getShouldDisplayDismissButton$revenuecatui_defaultsRelease() {
        return this.shouldDisplayDismissButton;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    public int hashCode() {
        int iHashCode = this.offeringSelection.hashCode() * 31;
        boolean z10 = this.shouldDisplayDismissButton;
        ?? r12 = z10;
        if (z10) {
            r12 = 1;
        }
        int i10 = (iHashCode + r12) * 31;
        FontProvider fontProvider = this.fontProvider;
        int iHashCode2 = (i10 + (fontProvider == null ? 0 : fontProvider.hashCode())) * 31;
        PaywallListener paywallListener = this.listener;
        int iHashCode3 = (iHashCode2 + (paywallListener == null ? 0 : paywallListener.hashCode())) * 31;
        PurchaseLogic purchaseLogic = this.purchaseLogic;
        return ((((iHashCode3 + (purchaseLogic != null ? purchaseLogic.hashCode() : 0)) * 31) + this.mode.hashCode()) * 31) + this.dismissRequest.hashCode();
    }

    public String toString() {
        return "PaywallOptions(offeringSelection=" + this.offeringSelection + ", shouldDisplayDismissButton=" + this.shouldDisplayDismissButton + ", fontProvider=" + this.fontProvider + ", listener=" + this.listener + ", purchaseLogic=" + this.purchaseLogic + ", mode=" + this.mode + ", dismissRequest=" + this.dismissRequest + ')';
    }
}
