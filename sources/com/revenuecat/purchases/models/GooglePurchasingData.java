package com.revenuecat.purchases.models;

import ae.j;
import ae.r;
import com.android.billingclient.api.h;
import com.revenuecat.purchases.ProductType;
import md.q;

/* JADX INFO: loaded from: classes2.dex */
public abstract class GooglePurchasingData implements PurchasingData {

    public static final class InAppProduct extends GooglePurchasingData {
        private final h productDetails;
        private final String productId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InAppProduct(String str, h hVar) {
            super(null);
            r.f(str, "productId");
            r.f(hVar, "productDetails");
            this.productId = str;
            this.productDetails = hVar;
        }

        public static /* synthetic */ InAppProduct copy$default(InAppProduct inAppProduct, String str, h hVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = inAppProduct.productId;
            }
            if ((i10 & 2) != 0) {
                hVar = inAppProduct.productDetails;
            }
            return inAppProduct.copy(str, hVar);
        }

        public final String component1() {
            return this.productId;
        }

        public final h component2() {
            return this.productDetails;
        }

        public final InAppProduct copy(String str, h hVar) {
            r.f(str, "productId");
            r.f(hVar, "productDetails");
            return new InAppProduct(str, hVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InAppProduct)) {
                return false;
            }
            InAppProduct inAppProduct = (InAppProduct) obj;
            return r.b(this.productId, inAppProduct.productId) && r.b(this.productDetails, inAppProduct.productDetails);
        }

        public final h getProductDetails() {
            return this.productDetails;
        }

        @Override // com.revenuecat.purchases.models.PurchasingData
        public String getProductId() {
            return this.productId;
        }

        public int hashCode() {
            return (this.productId.hashCode() * 31) + this.productDetails.hashCode();
        }

        public String toString() {
            return "InAppProduct(productId=" + this.productId + ", productDetails=" + this.productDetails + ')';
        }
    }

    public static final class Subscription extends GooglePurchasingData {
        private final String optionId;
        private final h productDetails;
        private final String productId;
        private final String token;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Subscription(String str, String str2, h hVar, String str3) {
            super(null);
            r.f(str, "productId");
            r.f(str2, "optionId");
            r.f(hVar, "productDetails");
            r.f(str3, "token");
            this.productId = str;
            this.optionId = str2;
            this.productDetails = hVar;
            this.token = str3;
        }

        public static /* synthetic */ Subscription copy$default(Subscription subscription, String str, String str2, h hVar, String str3, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = subscription.productId;
            }
            if ((i10 & 2) != 0) {
                str2 = subscription.optionId;
            }
            if ((i10 & 4) != 0) {
                hVar = subscription.productDetails;
            }
            if ((i10 & 8) != 0) {
                str3 = subscription.token;
            }
            return subscription.copy(str, str2, hVar, str3);
        }

        public final String component1() {
            return this.productId;
        }

        public final String component2() {
            return this.optionId;
        }

        public final h component3() {
            return this.productDetails;
        }

        public final String component4() {
            return this.token;
        }

        public final Subscription copy(String str, String str2, h hVar, String str3) {
            r.f(str, "productId");
            r.f(str2, "optionId");
            r.f(hVar, "productDetails");
            r.f(str3, "token");
            return new Subscription(str, str2, hVar, str3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Subscription)) {
                return false;
            }
            Subscription subscription = (Subscription) obj;
            return r.b(this.productId, subscription.productId) && r.b(this.optionId, subscription.optionId) && r.b(this.productDetails, subscription.productDetails) && r.b(this.token, subscription.token);
        }

        public final String getOptionId() {
            return this.optionId;
        }

        public final h getProductDetails() {
            return this.productDetails;
        }

        @Override // com.revenuecat.purchases.models.PurchasingData
        public String getProductId() {
            return this.productId;
        }

        public final String getToken() {
            return this.token;
        }

        public int hashCode() {
            return (((((this.productId.hashCode() * 31) + this.optionId.hashCode()) * 31) + this.productDetails.hashCode()) * 31) + this.token.hashCode();
        }

        public String toString() {
            return "Subscription(productId=" + this.productId + ", optionId=" + this.optionId + ", productDetails=" + this.productDetails + ", token=" + this.token + ')';
        }
    }

    private GooglePurchasingData() {
    }

    public /* synthetic */ GooglePurchasingData(j jVar) {
        this();
    }

    @Override // com.revenuecat.purchases.models.PurchasingData
    public ProductType getProductType() {
        if (this instanceof InAppProduct) {
            return ProductType.INAPP;
        }
        if (this instanceof Subscription) {
            return ProductType.SUBS;
        }
        throw new q();
    }
}
