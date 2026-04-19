package com.revenuecat.purchases.ui.revenuecatui.views;

import ae.j;
import ae.r;
import com.revenuecat.purchases.ui.revenuecatui.R;
import com.revenuecat.purchases.ui.revenuecatui.fonts.FontProvider;
import java.util.Map;
import md.x;
import nd.r0;

/* JADX INFO: loaded from: classes2.dex */
public final class PaywallViewAttributesReader {
    public static final Companion Companion = new Companion(null);
    public static final boolean DEFAULT_CONDENSED = false;
    private static final Map<int[], Map<Companion.Attributes, Integer>> styleablesByStyleSet;

    public static final class Companion {

        private enum Attributes {
            OfferingId,
            ShouldDisplayDismissButton,
            FontFamily
        }

        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0081  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.revenuecat.purchases.ui.revenuecatui.views.PaywallViewAttributesReader.PaywallViewAttributes parseAttributes(android.content.Context r7, android.util.AttributeSet r8, int[] r9) {
            /*
                Method dump skipped, instruction units count: 213
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.ui.revenuecatui.views.PaywallViewAttributesReader.Companion.parseAttributes(android.content.Context, android.util.AttributeSet, int[]):com.revenuecat.purchases.ui.revenuecatui.views.PaywallViewAttributesReader$PaywallViewAttributes");
        }
    }

    public static final class PaywallViewAttributes {
        public static final int $stable = 8;
        private final Boolean condensed;
        private final FontProvider fontProvider;
        private final String offeringId;
        private final Boolean shouldDisplayDismissButton;

        public PaywallViewAttributes(String str, FontProvider fontProvider, Boolean bool, Boolean bool2) {
            this.offeringId = str;
            this.fontProvider = fontProvider;
            this.shouldDisplayDismissButton = bool;
            this.condensed = bool2;
        }

        public static /* synthetic */ PaywallViewAttributes copy$default(PaywallViewAttributes paywallViewAttributes, String str, FontProvider fontProvider, Boolean bool, Boolean bool2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = paywallViewAttributes.offeringId;
            }
            if ((i10 & 2) != 0) {
                fontProvider = paywallViewAttributes.fontProvider;
            }
            if ((i10 & 4) != 0) {
                bool = paywallViewAttributes.shouldDisplayDismissButton;
            }
            if ((i10 & 8) != 0) {
                bool2 = paywallViewAttributes.condensed;
            }
            return paywallViewAttributes.copy(str, fontProvider, bool, bool2);
        }

        public final String component1() {
            return this.offeringId;
        }

        public final FontProvider component2() {
            return this.fontProvider;
        }

        public final Boolean component3() {
            return this.shouldDisplayDismissButton;
        }

        public final Boolean component4() {
            return this.condensed;
        }

        public final PaywallViewAttributes copy(String str, FontProvider fontProvider, Boolean bool, Boolean bool2) {
            return new PaywallViewAttributes(str, fontProvider, bool, bool2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PaywallViewAttributes)) {
                return false;
            }
            PaywallViewAttributes paywallViewAttributes = (PaywallViewAttributes) obj;
            return r.b(this.offeringId, paywallViewAttributes.offeringId) && r.b(this.fontProvider, paywallViewAttributes.fontProvider) && r.b(this.shouldDisplayDismissButton, paywallViewAttributes.shouldDisplayDismissButton) && r.b(this.condensed, paywallViewAttributes.condensed);
        }

        public final Boolean getCondensed() {
            return this.condensed;
        }

        public final FontProvider getFontProvider() {
            return this.fontProvider;
        }

        public final String getOfferingId() {
            return this.offeringId;
        }

        public final Boolean getShouldDisplayDismissButton() {
            return this.shouldDisplayDismissButton;
        }

        public int hashCode() {
            String str = this.offeringId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            FontProvider fontProvider = this.fontProvider;
            int iHashCode2 = (iHashCode + (fontProvider == null ? 0 : fontProvider.hashCode())) * 31;
            Boolean bool = this.shouldDisplayDismissButton;
            int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.condensed;
            return iHashCode3 + (bool2 != null ? bool2.hashCode() : 0);
        }

        public String toString() {
            return "PaywallViewAttributes(offeringId=" + this.offeringId + ", fontProvider=" + this.fontProvider + ", shouldDisplayDismissButton=" + this.shouldDisplayDismissButton + ", condensed=" + this.condensed + ')';
        }
    }

    static {
        int[] iArr = R.styleable.PaywallView;
        Companion.Attributes attributes = Companion.Attributes.OfferingId;
        Companion.Attributes attributes2 = Companion.Attributes.FontFamily;
        styleablesByStyleSet = r0.h(x.a(iArr, r0.h(x.a(attributes, Integer.valueOf(R.styleable.PaywallView_offeringIdentifier)), x.a(Companion.Attributes.ShouldDisplayDismissButton, Integer.valueOf(R.styleable.PaywallView_shouldDisplayDismissButton)), x.a(attributes2, Integer.valueOf(R.styleable.PaywallView_android_fontFamily)))), x.a(R.styleable.PaywallFooterView, r0.h(x.a(attributes, Integer.valueOf(R.styleable.PaywallFooterView_offeringIdentifier)), x.a(attributes2, Integer.valueOf(R.styleable.PaywallFooterView_android_fontFamily)))));
    }
}
