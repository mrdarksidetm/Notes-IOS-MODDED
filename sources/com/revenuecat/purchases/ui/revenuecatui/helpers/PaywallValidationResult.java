package com.revenuecat.purchases.ui.revenuecatui.helpers;

import ae.j;
import ae.r;
import com.revenuecat.purchases.paywalls.PaywallData;
import com.revenuecat.purchases.ui.revenuecatui.data.processed.PaywallTemplate;
import com.revenuecat.purchases.ui.revenuecatui.errors.PaywallValidationError;

/* JADX INFO: loaded from: classes2.dex */
public final class PaywallValidationResult {
    private final PaywallData displayablePaywall;
    private final PaywallValidationError error;
    private final PaywallTemplate template;

    public PaywallValidationResult(PaywallData paywallData, PaywallTemplate paywallTemplate, PaywallValidationError paywallValidationError) {
        r.f(paywallData, "displayablePaywall");
        r.f(paywallTemplate, "template");
        this.displayablePaywall = paywallData;
        this.template = paywallTemplate;
        this.error = paywallValidationError;
    }

    public /* synthetic */ PaywallValidationResult(PaywallData paywallData, PaywallTemplate paywallTemplate, PaywallValidationError paywallValidationError, int i10, j jVar) {
        this(paywallData, paywallTemplate, (i10 & 4) != 0 ? null : paywallValidationError);
    }

    public static /* synthetic */ PaywallValidationResult copy$default(PaywallValidationResult paywallValidationResult, PaywallData paywallData, PaywallTemplate paywallTemplate, PaywallValidationError paywallValidationError, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            paywallData = paywallValidationResult.displayablePaywall;
        }
        if ((i10 & 2) != 0) {
            paywallTemplate = paywallValidationResult.template;
        }
        if ((i10 & 4) != 0) {
            paywallValidationError = paywallValidationResult.error;
        }
        return paywallValidationResult.copy(paywallData, paywallTemplate, paywallValidationError);
    }

    public final PaywallData component1() {
        return this.displayablePaywall;
    }

    public final PaywallTemplate component2() {
        return this.template;
    }

    public final PaywallValidationError component3() {
        return this.error;
    }

    public final PaywallValidationResult copy(PaywallData paywallData, PaywallTemplate paywallTemplate, PaywallValidationError paywallValidationError) {
        r.f(paywallData, "displayablePaywall");
        r.f(paywallTemplate, "template");
        return new PaywallValidationResult(paywallData, paywallTemplate, paywallValidationError);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaywallValidationResult)) {
            return false;
        }
        PaywallValidationResult paywallValidationResult = (PaywallValidationResult) obj;
        return r.b(this.displayablePaywall, paywallValidationResult.displayablePaywall) && this.template == paywallValidationResult.template && r.b(this.error, paywallValidationResult.error);
    }

    public final PaywallData getDisplayablePaywall() {
        return this.displayablePaywall;
    }

    public final PaywallValidationError getError() {
        return this.error;
    }

    public final PaywallTemplate getTemplate() {
        return this.template;
    }

    public int hashCode() {
        int iHashCode = ((this.displayablePaywall.hashCode() * 31) + this.template.hashCode()) * 31;
        PaywallValidationError paywallValidationError = this.error;
        return iHashCode + (paywallValidationError == null ? 0 : paywallValidationError.hashCode());
    }

    public String toString() {
        return "PaywallValidationResult(displayablePaywall=" + this.displayablePaywall + ", template=" + this.template + ", error=" + this.error + ')';
    }
}
