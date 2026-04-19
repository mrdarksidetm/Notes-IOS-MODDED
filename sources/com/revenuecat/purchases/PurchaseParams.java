package com.revenuecat.purchases;

import ae.r;
import android.app.Activity;
import com.revenuecat.purchases.models.GoogleReplacementMode;
import com.revenuecat.purchases.models.PurchasingData;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.models.TestStoreProduct;

/* JADX INFO: loaded from: classes2.dex */
public final class PurchaseParams {
    private final Activity activity;
    private final Builder builder;
    private final GoogleReplacementMode googleReplacementMode;
    private final Boolean isPersonalizedPrice;
    private final String oldProductId;
    private PresentedOfferingContext presentedOfferingContext;
    private final PurchasingData purchasingData;

    public static class Builder {
        private final Activity activity;
        private GoogleReplacementMode googleReplacementMode;
        private Boolean isPersonalizedPrice;
        private String oldProductId;
        private PresentedOfferingContext presentedOfferingContext;
        private final StoreProduct product;
        private final PurchasingData purchasingData;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(Activity activity, Package r42) {
            this(activity, r42.getProduct().getPurchasingData(), r42.getPresentedOfferingContext(), r42.getProduct());
            r.f(activity, "activity");
            r.f(r42, "packageToPurchase");
        }

        private Builder(Activity activity, PurchasingData purchasingData, PresentedOfferingContext presentedOfferingContext, StoreProduct storeProduct) {
            this.activity = activity;
            this.purchasingData = purchasingData;
            this.presentedOfferingContext = presentedOfferingContext;
            this.product = storeProduct;
            this.googleReplacementMode = GoogleReplacementMode.WITHOUT_PRORATION;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(Activity activity, StoreProduct storeProduct) {
            this(activity, storeProduct.getPurchasingData(), storeProduct.getPresentedOfferingContext(), storeProduct);
            r.f(activity, "activity");
            r.f(storeProduct, "storeProduct");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(Activity activity, SubscriptionOption subscriptionOption) {
            this(activity, subscriptionOption.getPurchasingData(), subscriptionOption.getPresentedOfferingContext(), null);
            r.f(activity, "activity");
            r.f(subscriptionOption, "subscriptionOption");
        }

        private final void ensureNoTestProduct(StoreProduct storeProduct) throws PurchasesException {
            if (storeProduct instanceof TestStoreProduct) {
                throw new PurchasesException(new PurchasesError(PurchasesErrorCode.ProductNotAvailableForPurchaseError, "Cannot purchase " + storeProduct));
            }
        }

        public PurchaseParams build() throws PurchasesException {
            StoreProduct storeProduct = this.product;
            if (storeProduct != null) {
                ensureNoTestProduct(storeProduct);
            }
            return new PurchaseParams(this);
        }

        public final /* synthetic */ Activity getActivity$purchases_defaultsRelease() {
            return this.activity;
        }

        public final /* synthetic */ GoogleReplacementMode getGoogleReplacementMode$purchases_defaultsRelease() {
            return this.googleReplacementMode;
        }

        public final /* synthetic */ String getOldProductId$purchases_defaultsRelease() {
            return this.oldProductId;
        }

        public final /* synthetic */ PresentedOfferingContext getPresentedOfferingContext$purchases_defaultsRelease() {
            return this.presentedOfferingContext;
        }

        public final /* synthetic */ StoreProduct getProduct$purchases_defaultsRelease() {
            return this.product;
        }

        public final /* synthetic */ PurchasingData getPurchasingData$purchases_defaultsRelease() {
            return this.purchasingData;
        }

        public final Builder googleReplacementMode(GoogleReplacementMode googleReplacementMode) {
            r.f(googleReplacementMode, "googleReplacementMode");
            this.googleReplacementMode = googleReplacementMode;
            return this;
        }

        public final Builder isPersonalizedPrice(boolean z10) {
            this.isPersonalizedPrice = Boolean.valueOf(z10);
            return this;
        }

        public final /* synthetic */ Boolean isPersonalizedPrice$purchases_defaultsRelease() {
            return this.isPersonalizedPrice;
        }

        public final Builder oldProductId(String str) {
            r.f(str, "oldProductId");
            this.oldProductId = str;
            return this;
        }

        public final Builder presentedOfferingContext(PresentedOfferingContext presentedOfferingContext) {
            r.f(presentedOfferingContext, "presentedOfferingContext");
            this.presentedOfferingContext = presentedOfferingContext;
            return this;
        }

        public final /* synthetic */ void setGoogleReplacementMode$purchases_defaultsRelease(GoogleReplacementMode googleReplacementMode) {
            r.f(googleReplacementMode, "<set-?>");
            this.googleReplacementMode = googleReplacementMode;
        }

        public final /* synthetic */ void setOldProductId$purchases_defaultsRelease(String str) {
            this.oldProductId = str;
        }

        public final /* synthetic */ void setPersonalizedPrice$purchases_defaultsRelease(Boolean bool) {
            this.isPersonalizedPrice = bool;
        }

        public final void setPresentedOfferingContext$purchases_defaultsRelease(PresentedOfferingContext presentedOfferingContext) {
            this.presentedOfferingContext = presentedOfferingContext;
        }
    }

    public PurchaseParams(Builder builder) {
        r.f(builder, "builder");
        this.builder = builder;
        this.isPersonalizedPrice = builder.isPersonalizedPrice$purchases_defaultsRelease();
        this.oldProductId = builder.getOldProductId$purchases_defaultsRelease();
        this.googleReplacementMode = builder.getGoogleReplacementMode$purchases_defaultsRelease();
        this.purchasingData = builder.getPurchasingData$purchases_defaultsRelease();
        this.activity = builder.getActivity$purchases_defaultsRelease();
        this.presentedOfferingContext = builder.getPresentedOfferingContext$purchases_defaultsRelease();
    }

    public static /* synthetic */ PurchaseParams copy$default(PurchaseParams purchaseParams, Builder builder, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            builder = purchaseParams.builder;
        }
        return purchaseParams.copy(builder);
    }

    public final Builder component1() {
        return this.builder;
    }

    public final PurchaseParams copy(Builder builder) {
        r.f(builder, "builder");
        return new PurchaseParams(builder);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PurchaseParams) && r.b(this.builder, ((PurchaseParams) obj).builder);
    }

    public final /* synthetic */ Activity getActivity$purchases_defaultsRelease() {
        return this.activity;
    }

    public final Builder getBuilder() {
        return this.builder;
    }

    public final GoogleReplacementMode getGoogleReplacementMode() {
        return this.googleReplacementMode;
    }

    public final String getOldProductId() {
        return this.oldProductId;
    }

    public final /* synthetic */ PresentedOfferingContext getPresentedOfferingContext$purchases_defaultsRelease() {
        return this.presentedOfferingContext;
    }

    public final /* synthetic */ PurchasingData getPurchasingData$purchases_defaultsRelease() {
        return this.purchasingData;
    }

    public int hashCode() {
        return this.builder.hashCode();
    }

    public final Boolean isPersonalizedPrice() {
        return this.isPersonalizedPrice;
    }

    public final void setPresentedOfferingContext$purchases_defaultsRelease(PresentedOfferingContext presentedOfferingContext) {
        this.presentedOfferingContext = presentedOfferingContext;
    }

    public String toString() {
        return "PurchaseParams(builder=" + this.builder + ')';
    }
}
