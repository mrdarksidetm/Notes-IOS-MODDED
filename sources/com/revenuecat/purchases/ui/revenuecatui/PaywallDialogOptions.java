package com.revenuecat.purchases.ui.revenuecatui;

import ae.r;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.ui.revenuecatui.PaywallOptions;
import com.revenuecat.purchases.ui.revenuecatui.fonts.FontProvider;
import com.revenuecat.purchases.ui.revenuecatui.helpers.HelperFunctionsKt;
import md.i0;
import zd.a;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
public final class PaywallDialogOptions {
    public static final int $stable = 8;
    private final a<i0> dismissRequest;
    private final FontProvider fontProvider;
    private final PaywallListener listener;
    private final Offering offering;
    private final PurchaseLogic purchaseLogic;
    private final l<CustomerInfo, Boolean> shouldDisplayBlock;
    private final boolean shouldDisplayDismissButton;

    public static final class Builder {
        public static final int $stable = 8;
        private a<i0> dismissRequest;
        private FontProvider fontProvider;
        private PaywallListener listener;
        private Offering offering;
        private PurchaseLogic purchaseLogic;
        private l<? super CustomerInfo, Boolean> shouldDisplayBlock;
        private boolean shouldDisplayDismissButton = true;

        public final PaywallDialogOptions build() {
            return new PaywallDialogOptions(this);
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

        public final Offering getOffering$revenuecatui_defaultsRelease() {
            return this.offering;
        }

        public final PurchaseLogic getPurchaseLogic$revenuecatui_defaultsRelease() {
            return this.purchaseLogic;
        }

        public final l<CustomerInfo, Boolean> getShouldDisplayBlock$revenuecatui_defaultsRelease() {
            return this.shouldDisplayBlock;
        }

        public final boolean getShouldDisplayDismissButton$revenuecatui_defaultsRelease() {
            return this.shouldDisplayDismissButton;
        }

        public final Builder setCustomPurchaseLogic(PurchaseLogic purchaseLogic) {
            this.purchaseLogic = purchaseLogic;
            return this;
        }

        public final Builder setDismissRequest(a<i0> aVar) {
            r.f(aVar, "dismissRequest");
            this.dismissRequest = aVar;
            return this;
        }

        public final void setDismissRequest$revenuecatui_defaultsRelease(a<i0> aVar) {
            this.dismissRequest = aVar;
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

        public final Builder setOffering(Offering offering) {
            this.offering = offering;
            return this;
        }

        public final void setOffering$revenuecatui_defaultsRelease(Offering offering) {
            this.offering = offering;
        }

        public final void setPurchaseLogic$revenuecatui_defaultsRelease(PurchaseLogic purchaseLogic) {
            this.purchaseLogic = purchaseLogic;
        }

        public final Builder setRequiredEntitlementIdentifier(String str) {
            if (str != null) {
                this.shouldDisplayBlock = HelperFunctionsKt.shouldDisplayBlockForEntitlementIdentifier(str);
            }
            return this;
        }

        public final Builder setShouldDisplayBlock(l<? super CustomerInfo, Boolean> lVar) {
            this.shouldDisplayBlock = lVar;
            return this;
        }

        public final void setShouldDisplayBlock$revenuecatui_defaultsRelease(l<? super CustomerInfo, Boolean> lVar) {
            this.shouldDisplayBlock = lVar;
        }

        public final Builder setShouldDisplayDismissButton(boolean z10) {
            this.shouldDisplayDismissButton = z10;
            return this;
        }

        public final void setShouldDisplayDismissButton$revenuecatui_defaultsRelease(boolean z10) {
            this.shouldDisplayDismissButton = z10;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaywallDialogOptions(Builder builder) {
        this(builder.getShouldDisplayBlock$revenuecatui_defaultsRelease(), builder.getDismissRequest$revenuecatui_defaultsRelease(), builder.getOffering$revenuecatui_defaultsRelease(), builder.getShouldDisplayDismissButton$revenuecatui_defaultsRelease(), builder.getFontProvider$revenuecatui_defaultsRelease(), builder.getListener$revenuecatui_defaultsRelease(), builder.getPurchaseLogic$revenuecatui_defaultsRelease());
        r.f(builder, "builder");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PaywallDialogOptions(l<? super CustomerInfo, Boolean> lVar, a<i0> aVar, Offering offering, boolean z10, FontProvider fontProvider, PaywallListener paywallListener, PurchaseLogic purchaseLogic) {
        this.shouldDisplayBlock = lVar;
        this.dismissRequest = aVar;
        this.offering = offering;
        this.shouldDisplayDismissButton = z10;
        this.fontProvider = fontProvider;
        this.listener = paywallListener;
        this.purchaseLogic = purchaseLogic;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaywallDialogOptions copy$default(PaywallDialogOptions paywallDialogOptions, l lVar, a aVar, Offering offering, boolean z10, FontProvider fontProvider, PaywallListener paywallListener, PurchaseLogic purchaseLogic, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = paywallDialogOptions.shouldDisplayBlock;
        }
        if ((i10 & 2) != 0) {
            aVar = paywallDialogOptions.dismissRequest;
        }
        a aVar2 = aVar;
        if ((i10 & 4) != 0) {
            offering = paywallDialogOptions.offering;
        }
        Offering offering2 = offering;
        if ((i10 & 8) != 0) {
            z10 = paywallDialogOptions.shouldDisplayDismissButton;
        }
        boolean z11 = z10;
        if ((i10 & 16) != 0) {
            fontProvider = paywallDialogOptions.fontProvider;
        }
        FontProvider fontProvider2 = fontProvider;
        if ((i10 & 32) != 0) {
            paywallListener = paywallDialogOptions.listener;
        }
        PaywallListener paywallListener2 = paywallListener;
        if ((i10 & 64) != 0) {
            purchaseLogic = paywallDialogOptions.purchaseLogic;
        }
        return paywallDialogOptions.copy(lVar, aVar2, offering2, z11, fontProvider2, paywallListener2, purchaseLogic);
    }

    public final l<CustomerInfo, Boolean> component1() {
        return this.shouldDisplayBlock;
    }

    public final a<i0> component2() {
        return this.dismissRequest;
    }

    public final Offering component3() {
        return this.offering;
    }

    public final boolean component4() {
        return this.shouldDisplayDismissButton;
    }

    public final FontProvider component5() {
        return this.fontProvider;
    }

    public final PaywallListener component6() {
        return this.listener;
    }

    public final PurchaseLogic component7() {
        return this.purchaseLogic;
    }

    public final PaywallDialogOptions copy(l<? super CustomerInfo, Boolean> lVar, a<i0> aVar, Offering offering, boolean z10, FontProvider fontProvider, PaywallListener paywallListener, PurchaseLogic purchaseLogic) {
        return new PaywallDialogOptions(lVar, aVar, offering, z10, fontProvider, paywallListener, purchaseLogic);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaywallDialogOptions)) {
            return false;
        }
        PaywallDialogOptions paywallDialogOptions = (PaywallDialogOptions) obj;
        return r.b(this.shouldDisplayBlock, paywallDialogOptions.shouldDisplayBlock) && r.b(this.dismissRequest, paywallDialogOptions.dismissRequest) && r.b(this.offering, paywallDialogOptions.offering) && this.shouldDisplayDismissButton == paywallDialogOptions.shouldDisplayDismissButton && r.b(this.fontProvider, paywallDialogOptions.fontProvider) && r.b(this.listener, paywallDialogOptions.listener) && r.b(this.purchaseLogic, paywallDialogOptions.purchaseLogic);
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

    public final Offering getOffering() {
        return this.offering;
    }

    public final PurchaseLogic getPurchaseLogic() {
        return this.purchaseLogic;
    }

    public final l<CustomerInfo, Boolean> getShouldDisplayBlock() {
        return this.shouldDisplayBlock;
    }

    public final boolean getShouldDisplayDismissButton() {
        return this.shouldDisplayDismissButton;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    public int hashCode() {
        l<CustomerInfo, Boolean> lVar = this.shouldDisplayBlock;
        int iHashCode = (lVar == null ? 0 : lVar.hashCode()) * 31;
        a<i0> aVar = this.dismissRequest;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Offering offering = this.offering;
        int iHashCode3 = (iHashCode2 + (offering == null ? 0 : offering.hashCode())) * 31;
        boolean z10 = this.shouldDisplayDismissButton;
        ?? r22 = z10;
        if (z10) {
            r22 = 1;
        }
        int i10 = (iHashCode3 + r22) * 31;
        FontProvider fontProvider = this.fontProvider;
        int iHashCode4 = (i10 + (fontProvider == null ? 0 : fontProvider.hashCode())) * 31;
        PaywallListener paywallListener = this.listener;
        int iHashCode5 = (iHashCode4 + (paywallListener == null ? 0 : paywallListener.hashCode())) * 31;
        PurchaseLogic purchaseLogic = this.purchaseLogic;
        return iHashCode5 + (purchaseLogic != null ? purchaseLogic.hashCode() : 0);
    }

    public final PaywallOptions toPaywallOptions$revenuecatui_defaultsRelease(a<i0> aVar) {
        r.f(aVar, "dismissRequest");
        return new PaywallOptions.Builder(new PaywallDialogOptions$toPaywallOptions$1(aVar, this)).setOffering(this.offering).setShouldDisplayDismissButton(this.shouldDisplayDismissButton).setFontProvider(this.fontProvider).setListener(this.listener).setPurchaseLogic(this.purchaseLogic).build();
    }

    public String toString() {
        return "PaywallDialogOptions(shouldDisplayBlock=" + this.shouldDisplayBlock + ", dismissRequest=" + this.dismissRequest + ", offering=" + this.offering + ", shouldDisplayDismissButton=" + this.shouldDisplayDismissButton + ", fontProvider=" + this.fontProvider + ", listener=" + this.listener + ", purchaseLogic=" + this.purchaseLogic + ')';
    }
}
