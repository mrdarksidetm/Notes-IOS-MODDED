package com.revenuecat.purchases.models;

import ae.j;
import ae.r;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.models.SubscriptionOption;
import java.util.List;
import nd.u;

/* JADX INFO: loaded from: classes2.dex */
final class TestSubscriptionOption implements SubscriptionOption {
    private final String basePlanId;
    private final InstallmentsInfo installmentsInfo;
    private final PresentedOfferingContext presentedOfferingContext;
    private final List<PricingPhase> pricingPhases;
    private final String productIdentifier;
    private final List<String> tags;

    public TestSubscriptionOption(String str, List<PricingPhase> list, String str2, List<String> list2, PresentedOfferingContext presentedOfferingContext, InstallmentsInfo installmentsInfo) {
        r.f(str, "productIdentifier");
        r.f(list, "pricingPhases");
        r.f(str2, "basePlanId");
        r.f(list2, "tags");
        r.f(presentedOfferingContext, "presentedOfferingContext");
        this.productIdentifier = str;
        this.pricingPhases = list;
        this.basePlanId = str2;
        this.tags = list2;
        this.presentedOfferingContext = presentedOfferingContext;
        this.installmentsInfo = installmentsInfo;
    }

    public /* synthetic */ TestSubscriptionOption(String str, List list, String str2, List list2, PresentedOfferingContext presentedOfferingContext, InstallmentsInfo installmentsInfo, int i10, j jVar) {
        this(str, list, (i10 & 4) != 0 ? "testBasePlanId" : str2, (i10 & 8) != 0 ? u.m() : list2, (i10 & 16) != 0 ? new PresentedOfferingContext("offering") : presentedOfferingContext, (i10 & 32) != 0 ? null : installmentsInfo);
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
        if (getPricingPhases().size() == 1) {
            return this.basePlanId;
        }
        return this.basePlanId + ":testOfferId";
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public InstallmentsInfo getInstallmentsInfo() {
        return this.installmentsInfo;
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public PricingPhase getIntroPhase() {
        return SubscriptionOption.DefaultImpls.getIntroPhase(this);
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public PresentedOfferingContext getPresentedOfferingContext() {
        return this.presentedOfferingContext;
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public String getPresentedOfferingIdentifier() {
        return getPresentedOfferingContext().getOfferingIdentifier();
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public List<PricingPhase> getPricingPhases() {
        return this.pricingPhases;
    }

    public final String getProductIdentifier() {
        return this.productIdentifier;
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public PurchasingData getPurchasingData() {
        return new PurchasingData() { // from class: com.revenuecat.purchases.models.TestSubscriptionOption$purchasingData$1
            @Override // com.revenuecat.purchases.models.PurchasingData
            public String getProductId() {
                return this.this$0.getProductIdentifier();
            }

            @Override // com.revenuecat.purchases.models.PurchasingData
            public ProductType getProductType() {
                return ProductType.SUBS;
            }
        };
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public List<String> getTags() {
        return this.tags;
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public boolean isBasePlan() {
        return SubscriptionOption.DefaultImpls.isBasePlan(this);
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public boolean isPrepaid() {
        return SubscriptionOption.DefaultImpls.isPrepaid(this);
    }
}
