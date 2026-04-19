package com.revenuecat.purchases.models;

import ae.j;
import ae.r;
import com.android.billingclient.api.h;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.models.GooglePurchasingData;
import com.revenuecat.purchases.models.SubscriptionOption;
import java.util.List;
import je.v;

/* JADX INFO: loaded from: classes2.dex */
public final class GoogleSubscriptionOption implements SubscriptionOption {
    private final String basePlanId;
    private final GoogleInstallmentsInfo installmentsInfo;
    private final String offerId;
    private final String offerToken;
    private final PresentedOfferingContext presentedOfferingContext;
    private final List<PricingPhase> pricingPhases;
    private final h productDetails;
    private final String productId;
    private final List<String> tags;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GoogleSubscriptionOption(GoogleSubscriptionOption googleSubscriptionOption, PresentedOfferingContext presentedOfferingContext) {
        this(googleSubscriptionOption.productId, googleSubscriptionOption.basePlanId, googleSubscriptionOption.offerId, googleSubscriptionOption.getPricingPhases(), googleSubscriptionOption.getTags(), googleSubscriptionOption.productDetails, googleSubscriptionOption.offerToken, presentedOfferingContext, googleSubscriptionOption.getInstallmentsInfo());
        r.f(googleSubscriptionOption, "subscriptionOption");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GoogleSubscriptionOption(String str, String str2, String str3, List<PricingPhase> list, List<String> list2, h hVar, String str4) {
        this(str, str2, str3, list, list2, hVar, str4, null, null, 384, null);
        r.f(str, "productId");
        r.f(str2, "basePlanId");
        r.f(list, "pricingPhases");
        r.f(list2, "tags");
        r.f(hVar, "productDetails");
        r.f(str4, "offerToken");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GoogleSubscriptionOption(String str, String str2, String str3, List<PricingPhase> list, List<String> list2, h hVar, String str4, PresentedOfferingContext presentedOfferingContext) {
        this(str, str2, str3, list, list2, hVar, str4, presentedOfferingContext, null, 256, null);
        r.f(str, "productId");
        r.f(str2, "basePlanId");
        r.f(list, "pricingPhases");
        r.f(list2, "tags");
        r.f(hVar, "productDetails");
        r.f(str4, "offerToken");
    }

    public GoogleSubscriptionOption(String str, String str2, String str3, List<PricingPhase> list, List<String> list2, h hVar, String str4, PresentedOfferingContext presentedOfferingContext, GoogleInstallmentsInfo googleInstallmentsInfo) {
        r.f(str, "productId");
        r.f(str2, "basePlanId");
        r.f(list, "pricingPhases");
        r.f(list2, "tags");
        r.f(hVar, "productDetails");
        r.f(str4, "offerToken");
        this.productId = str;
        this.basePlanId = str2;
        this.offerId = str3;
        this.pricingPhases = list;
        this.tags = list2;
        this.productDetails = hVar;
        this.offerToken = str4;
        this.presentedOfferingContext = presentedOfferingContext;
        this.installmentsInfo = googleInstallmentsInfo;
    }

    public /* synthetic */ GoogleSubscriptionOption(String str, String str2, String str3, List list, List list2, h hVar, String str4, PresentedOfferingContext presentedOfferingContext, GoogleInstallmentsInfo googleInstallmentsInfo, int i10, j jVar) {
        this(str, str2, str3, list, list2, hVar, str4, (i10 & 128) != 0 ? null : presentedOfferingContext, (i10 & 256) != 0 ? null : googleInstallmentsInfo);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GoogleSubscriptionOption(String str, String str2, String str3, List<PricingPhase> list, List<String> list2, h hVar, String str4, String str5) {
        this(str, str2, str3, list, list2, hVar, str4, new PresentedOfferingContext(str5), null, 256, null);
        r.f(str, "productId");
        r.f(str2, "basePlanId");
        r.f(list, "pricingPhases");
        r.f(list2, "tags");
        r.f(hVar, "productDetails");
        r.f(str4, "offerToken");
        r.f(str5, "presentedOfferingId");
    }

    public static /* synthetic */ void getPresentedOfferingIdentifier$annotations() {
    }

    public final String component1() {
        return this.productId;
    }

    public final String component2() {
        return this.basePlanId;
    }

    public final String component3() {
        return this.offerId;
    }

    public final List<PricingPhase> component4() {
        return this.pricingPhases;
    }

    public final List<String> component5() {
        return this.tags;
    }

    public final h component6() {
        return this.productDetails;
    }

    public final String component7() {
        return this.offerToken;
    }

    public final PresentedOfferingContext component8() {
        return this.presentedOfferingContext;
    }

    public final GoogleInstallmentsInfo component9() {
        return this.installmentsInfo;
    }

    public final GoogleSubscriptionOption copy(String str, String str2, String str3, List<PricingPhase> list, List<String> list2, h hVar, String str4, PresentedOfferingContext presentedOfferingContext, GoogleInstallmentsInfo googleInstallmentsInfo) {
        r.f(str, "productId");
        r.f(str2, "basePlanId");
        r.f(list, "pricingPhases");
        r.f(list2, "tags");
        r.f(hVar, "productDetails");
        r.f(str4, "offerToken");
        return new GoogleSubscriptionOption(str, str2, str3, list, list2, hVar, str4, presentedOfferingContext, googleInstallmentsInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GoogleSubscriptionOption)) {
            return false;
        }
        GoogleSubscriptionOption googleSubscriptionOption = (GoogleSubscriptionOption) obj;
        return r.b(this.productId, googleSubscriptionOption.productId) && r.b(this.basePlanId, googleSubscriptionOption.basePlanId) && r.b(this.offerId, googleSubscriptionOption.offerId) && r.b(this.pricingPhases, googleSubscriptionOption.pricingPhases) && r.b(this.tags, googleSubscriptionOption.tags) && r.b(this.productDetails, googleSubscriptionOption.productDetails) && r.b(this.offerToken, googleSubscriptionOption.offerToken) && r.b(this.presentedOfferingContext, googleSubscriptionOption.presentedOfferingContext) && r.b(this.installmentsInfo, googleSubscriptionOption.installmentsInfo);
    }

    public final String getBasePlanId() {
        return this.basePlanId;
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public Period getBillingPeriod() {
        return SubscriptionOption.DefaultImpls.getBillingPeriod(this);
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public PricingPhase getFreePhase() {
        return SubscriptionOption.DefaultImpls.getFreePhase(this);
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public PricingPhase getFullPricePhase() {
        return SubscriptionOption.DefaultImpls.getFullPricePhase(this);
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public String getId() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.basePlanId);
        String str2 = this.offerId;
        if (str2 == null || v.v(str2)) {
            str = "";
        } else {
            str = ':' + this.offerId;
        }
        sb2.append(str);
        return sb2.toString();
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public GoogleInstallmentsInfo getInstallmentsInfo() {
        return this.installmentsInfo;
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public PricingPhase getIntroPhase() {
        return SubscriptionOption.DefaultImpls.getIntroPhase(this);
    }

    public final String getOfferId() {
        return this.offerId;
    }

    public final String getOfferToken() {
        return this.offerToken;
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public PresentedOfferingContext getPresentedOfferingContext() {
        return this.presentedOfferingContext;
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public String getPresentedOfferingIdentifier() {
        PresentedOfferingContext presentedOfferingContext = getPresentedOfferingContext();
        if (presentedOfferingContext != null) {
            return presentedOfferingContext.getOfferingIdentifier();
        }
        return null;
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public List<PricingPhase> getPricingPhases() {
        return this.pricingPhases;
    }

    public final h getProductDetails() {
        return this.productDetails;
    }

    public final String getProductId() {
        return this.productId;
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public PurchasingData getPurchasingData() {
        return new GooglePurchasingData.Subscription(this.productId, getId(), this.productDetails, this.offerToken);
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public List<String> getTags() {
        return this.tags;
    }

    public int hashCode() {
        int iHashCode = ((this.productId.hashCode() * 31) + this.basePlanId.hashCode()) * 31;
        String str = this.offerId;
        int iHashCode2 = (((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.pricingPhases.hashCode()) * 31) + this.tags.hashCode()) * 31) + this.productDetails.hashCode()) * 31) + this.offerToken.hashCode()) * 31;
        PresentedOfferingContext presentedOfferingContext = this.presentedOfferingContext;
        int iHashCode3 = (iHashCode2 + (presentedOfferingContext == null ? 0 : presentedOfferingContext.hashCode())) * 31;
        GoogleInstallmentsInfo googleInstallmentsInfo = this.installmentsInfo;
        return iHashCode3 + (googleInstallmentsInfo != null ? googleInstallmentsInfo.hashCode() : 0);
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public boolean isBasePlan() {
        return SubscriptionOption.DefaultImpls.isBasePlan(this);
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public boolean isPrepaid() {
        return SubscriptionOption.DefaultImpls.isPrepaid(this);
    }

    public String toString() {
        return "GoogleSubscriptionOption(productId=" + this.productId + ", basePlanId=" + this.basePlanId + ", offerId=" + this.offerId + ", pricingPhases=" + this.pricingPhases + ", tags=" + this.tags + ", productDetails=" + this.productDetails + ", offerToken=" + this.offerToken + ", presentedOfferingContext=" + this.presentedOfferingContext + ", installmentsInfo=" + this.installmentsInfo + ')';
    }
}
