package com.revenuecat.purchases.models;

import ae.j;
import ae.r;
import com.amazon.a.a.o.b;
import com.android.billingclient.api.h;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.models.GooglePurchasingData;
import com.revenuecat.purchases.models.StoreProduct;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import nd.c0;

/* JADX INFO: loaded from: classes2.dex */
public final class GoogleStoreProduct implements StoreProduct {
    private final String basePlanId;
    private final SubscriptionOption defaultOption;
    private final String description;
    private final String name;
    private final Period period;
    private final PresentedOfferingContext presentedOfferingContext;
    private final String presentedOfferingIdentifier;
    private final Price price;
    private final h productDetails;
    private final String productId;
    private final SubscriptionOptions subscriptionOptions;
    private final String title;
    private final ProductType type;

    private GoogleStoreProduct(GoogleStoreProduct googleStoreProduct, SubscriptionOption subscriptionOption, SubscriptionOptions subscriptionOptions, PresentedOfferingContext presentedOfferingContext) {
        this(googleStoreProduct.productId, googleStoreProduct.basePlanId, googleStoreProduct.getType(), googleStoreProduct.getPrice(), googleStoreProduct.getName(), googleStoreProduct.getTitle(), googleStoreProduct.getDescription(), googleStoreProduct.getPeriod(), subscriptionOptions, subscriptionOption, googleStoreProduct.productDetails, presentedOfferingContext);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GoogleStoreProduct(String str, String str2, ProductType productType, Price price, String str3, String str4, Period period, SubscriptionOptions subscriptionOptions, SubscriptionOption subscriptionOption, h hVar, String str5) {
        this(str, str2, productType, price, str3, str3, str4, period, subscriptionOptions, subscriptionOption, hVar, str5 != null ? new PresentedOfferingContext(str5) : null);
        r.f(str, "productId");
        r.f(productType, "type");
        r.f(price, b.f7450x);
        r.f(str3, b.S);
        r.f(str4, b.f7429c);
        r.f(hVar, "productDetails");
    }

    public /* synthetic */ GoogleStoreProduct(String str, String str2, ProductType productType, Price price, String str3, String str4, Period period, SubscriptionOptions subscriptionOptions, SubscriptionOption subscriptionOption, h hVar, String str5, int i10, j jVar) {
        this(str, str2, productType, price, str3, str4, period, subscriptionOptions, subscriptionOption, hVar, (i10 & 1024) != 0 ? null : str5);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GoogleStoreProduct(String str, String str2, ProductType productType, Price price, String str3, String str4, String str5, Period period, SubscriptionOptions subscriptionOptions, SubscriptionOption subscriptionOption, h hVar) {
        this(str, str2, productType, price, str3, str4, str5, period, subscriptionOptions, subscriptionOption, hVar, null, null, 6144, null);
        r.f(str, "productId");
        r.f(productType, "type");
        r.f(price, b.f7450x);
        r.f(str3, "name");
        r.f(str4, b.S);
        r.f(str5, b.f7429c);
        r.f(hVar, "productDetails");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GoogleStoreProduct(String str, String str2, ProductType productType, Price price, String str3, String str4, String str5, Period period, SubscriptionOptions subscriptionOptions, SubscriptionOption subscriptionOption, h hVar, PresentedOfferingContext presentedOfferingContext) {
        this(str, str2, productType, price, str3, str4, str5, period, subscriptionOptions, subscriptionOption, hVar, presentedOfferingContext != null ? presentedOfferingContext.getOfferingIdentifier() : null, presentedOfferingContext);
        r.f(str, "productId");
        r.f(productType, "type");
        r.f(price, b.f7450x);
        r.f(str3, "name");
        r.f(str4, b.S);
        r.f(str5, b.f7429c);
        r.f(hVar, "productDetails");
    }

    public /* synthetic */ GoogleStoreProduct(String str, String str2, ProductType productType, Price price, String str3, String str4, String str5, Period period, SubscriptionOptions subscriptionOptions, SubscriptionOption subscriptionOption, h hVar, PresentedOfferingContext presentedOfferingContext, int i10, j jVar) {
        this(str, str2, productType, price, str3, str4, str5, period, subscriptionOptions, subscriptionOption, hVar, (i10 & 2048) != 0 ? null : presentedOfferingContext);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GoogleStoreProduct(String str, String str2, ProductType productType, Price price, String str3, String str4, String str5, Period period, SubscriptionOptions subscriptionOptions, SubscriptionOption subscriptionOption, h hVar, String str6) {
        this(str, str2, productType, price, str3, str4, str5, period, subscriptionOptions, subscriptionOption, hVar, str6, null, 4096, null);
        r.f(str, "productId");
        r.f(productType, "type");
        r.f(price, b.f7450x);
        r.f(str3, "name");
        r.f(str4, b.S);
        r.f(str5, b.f7429c);
        r.f(hVar, "productDetails");
    }

    public GoogleStoreProduct(String str, String str2, ProductType productType, Price price, String str3, String str4, String str5, Period period, SubscriptionOptions subscriptionOptions, SubscriptionOption subscriptionOption, h hVar, String str6, PresentedOfferingContext presentedOfferingContext) {
        r.f(str, "productId");
        r.f(productType, "type");
        r.f(price, b.f7450x);
        r.f(str3, "name");
        r.f(str4, b.S);
        r.f(str5, b.f7429c);
        r.f(hVar, "productDetails");
        this.productId = str;
        this.basePlanId = str2;
        this.type = productType;
        this.price = price;
        this.name = str3;
        this.title = str4;
        this.description = str5;
        this.period = period;
        this.subscriptionOptions = subscriptionOptions;
        this.defaultOption = subscriptionOption;
        this.productDetails = hVar;
        this.presentedOfferingIdentifier = str6;
        this.presentedOfferingContext = presentedOfferingContext;
    }

    public /* synthetic */ GoogleStoreProduct(String str, String str2, ProductType productType, Price price, String str3, String str4, String str5, Period period, SubscriptionOptions subscriptionOptions, SubscriptionOption subscriptionOption, h hVar, String str6, PresentedOfferingContext presentedOfferingContext, int i10, j jVar) {
        this(str, str2, productType, price, str3, str4, str5, period, subscriptionOptions, subscriptionOption, hVar, (i10 & 2048) != 0 ? null : str6, (i10 & 4096) != 0 ? null : presentedOfferingContext);
    }

    public static /* synthetic */ void getPresentedOfferingIdentifier$annotations() {
    }

    public static /* synthetic */ void getSku$annotations() {
    }

    public final String component1() {
        return this.productId;
    }

    public final SubscriptionOption component10() {
        return this.defaultOption;
    }

    public final h component11() {
        return this.productDetails;
    }

    public final String component12() {
        return this.presentedOfferingIdentifier;
    }

    public final PresentedOfferingContext component13() {
        return this.presentedOfferingContext;
    }

    public final String component2() {
        return this.basePlanId;
    }

    public final ProductType component3() {
        return this.type;
    }

    public final Price component4() {
        return this.price;
    }

    public final String component5() {
        return this.name;
    }

    public final String component6() {
        return this.title;
    }

    public final String component7() {
        return this.description;
    }

    public final Period component8() {
        return this.period;
    }

    public final SubscriptionOptions component9() {
        return this.subscriptionOptions;
    }

    public final GoogleStoreProduct copy(String str, String str2, ProductType productType, Price price, String str3, String str4, String str5, Period period, SubscriptionOptions subscriptionOptions, SubscriptionOption subscriptionOption, h hVar, String str6, PresentedOfferingContext presentedOfferingContext) {
        r.f(str, "productId");
        r.f(productType, "type");
        r.f(price, b.f7450x);
        r.f(str3, "name");
        r.f(str4, b.S);
        r.f(str5, b.f7429c);
        r.f(hVar, "productDetails");
        return new GoogleStoreProduct(str, str2, productType, price, str3, str4, str5, period, subscriptionOptions, subscriptionOption, hVar, str6, presentedOfferingContext);
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public StoreProduct copyWithOfferingId(String str) {
        PresentedOfferingContext presentedOfferingContext;
        r.f(str, "offeringId");
        PresentedOfferingContext presentedOfferingContext2 = getPresentedOfferingContext();
        if (presentedOfferingContext2 == null || (presentedOfferingContext = PresentedOfferingContext.copy$default(presentedOfferingContext2, str, null, null, 6, null)) == null) {
            presentedOfferingContext = new PresentedOfferingContext(str);
        }
        return copyWithPresentedOfferingContext(presentedOfferingContext);
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public StoreProduct copyWithPresentedOfferingContext(PresentedOfferingContext presentedOfferingContext) {
        ArrayList arrayList;
        SubscriptionOptions subscriptionOptions = getSubscriptionOptions();
        if (subscriptionOptions != null) {
            arrayList = new ArrayList();
            for (SubscriptionOption subscriptionOption : subscriptionOptions) {
                GoogleSubscriptionOption googleSubscriptionOption = subscriptionOption instanceof GoogleSubscriptionOption ? (GoogleSubscriptionOption) subscriptionOption : null;
                GoogleSubscriptionOption googleSubscriptionOption2 = googleSubscriptionOption != null ? new GoogleSubscriptionOption(googleSubscriptionOption, presentedOfferingContext) : null;
                if (googleSubscriptionOption2 != null) {
                    arrayList.add(googleSubscriptionOption2);
                }
            }
        } else {
            arrayList = null;
        }
        SubscriptionOption defaultOption = getDefaultOption();
        GoogleSubscriptionOption googleSubscriptionOption3 = defaultOption instanceof GoogleSubscriptionOption ? (GoogleSubscriptionOption) defaultOption : null;
        return new GoogleStoreProduct(this, googleSubscriptionOption3 != null ? new GoogleSubscriptionOption(googleSubscriptionOption3, presentedOfferingContext) : null, arrayList != null ? new SubscriptionOptions(arrayList) : null, presentedOfferingContext);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GoogleStoreProduct)) {
            return false;
        }
        GoogleStoreProduct googleStoreProduct = (GoogleStoreProduct) obj;
        return r.b(this.productId, googleStoreProduct.productId) && r.b(this.basePlanId, googleStoreProduct.basePlanId) && this.type == googleStoreProduct.type && r.b(this.price, googleStoreProduct.price) && r.b(this.name, googleStoreProduct.name) && r.b(this.title, googleStoreProduct.title) && r.b(this.description, googleStoreProduct.description) && r.b(this.period, googleStoreProduct.period) && r.b(this.subscriptionOptions, googleStoreProduct.subscriptionOptions) && r.b(this.defaultOption, googleStoreProduct.defaultOption) && r.b(this.productDetails, googleStoreProduct.productDetails) && r.b(this.presentedOfferingIdentifier, googleStoreProduct.presentedOfferingIdentifier) && r.b(this.presentedOfferingContext, googleStoreProduct.presentedOfferingContext);
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public String formattedPricePerMonth(Locale locale) {
        SubscriptionOption basePlan;
        List<PricingPhase> pricingPhases;
        PricingPhase pricingPhase;
        r.f(locale, "locale");
        SubscriptionOptions subscriptionOptions = getSubscriptionOptions();
        if (subscriptionOptions == null || (basePlan = subscriptionOptions.getBasePlan()) == null || (pricingPhases = basePlan.getPricingPhases()) == null || (pricingPhase = (PricingPhase) c0.j0(pricingPhases)) == null) {
            return null;
        }
        return pricingPhase.formattedPriceInMonths(locale);
    }

    public final String getBasePlanId() {
        return this.basePlanId;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public SubscriptionOption getDefaultOption() {
        return this.defaultOption;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public String getDescription() {
        return this.description;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public String getId() {
        if (this.basePlanId != null) {
            String str = this.productId + ':' + this.basePlanId;
            if (str != null) {
                return str;
            }
        }
        return this.productId;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public String getName() {
        return this.name;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public Period getPeriod() {
        return this.period;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public PresentedOfferingContext getPresentedOfferingContext() {
        return this.presentedOfferingContext;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public String getPresentedOfferingIdentifier() {
        return this.presentedOfferingIdentifier;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public Price getPrice() {
        return this.price;
    }

    public final h getProductDetails() {
        return this.productDetails;
    }

    public final String getProductId() {
        return this.productId;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public PurchasingData getPurchasingData() {
        return (getType() != ProductType.SUBS || getDefaultOption() == null) ? new GooglePurchasingData.InAppProduct(getId(), this.productDetails) : getDefaultOption().getPurchasingData();
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public String getSku() {
        return this.productId;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public SubscriptionOptions getSubscriptionOptions() {
        return this.subscriptionOptions;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public String getTitle() {
        return this.title;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public ProductType getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.productId.hashCode() * 31;
        String str = this.basePlanId;
        int iHashCode2 = (((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.type.hashCode()) * 31) + this.price.hashCode()) * 31) + this.name.hashCode()) * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31;
        Period period = this.period;
        int iHashCode3 = (iHashCode2 + (period == null ? 0 : period.hashCode())) * 31;
        SubscriptionOptions subscriptionOptions = this.subscriptionOptions;
        int iHashCode4 = (iHashCode3 + (subscriptionOptions == null ? 0 : subscriptionOptions.hashCode())) * 31;
        SubscriptionOption subscriptionOption = this.defaultOption;
        int iHashCode5 = (((iHashCode4 + (subscriptionOption == null ? 0 : subscriptionOption.hashCode())) * 31) + this.productDetails.hashCode()) * 31;
        String str2 = this.presentedOfferingIdentifier;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        PresentedOfferingContext presentedOfferingContext = this.presentedOfferingContext;
        return iHashCode6 + (presentedOfferingContext != null ? presentedOfferingContext.hashCode() : 0);
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public Price pricePerMonth(Locale locale) {
        return StoreProduct.DefaultImpls.pricePerMonth(this, locale);
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public Price pricePerWeek(Locale locale) {
        return StoreProduct.DefaultImpls.pricePerWeek(this, locale);
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public Price pricePerYear(Locale locale) {
        return StoreProduct.DefaultImpls.pricePerYear(this, locale);
    }

    public String toString() {
        return "GoogleStoreProduct(productId=" + this.productId + ", basePlanId=" + this.basePlanId + ", type=" + this.type + ", price=" + this.price + ", name=" + this.name + ", title=" + this.title + ", description=" + this.description + ", period=" + this.period + ", subscriptionOptions=" + this.subscriptionOptions + ", defaultOption=" + this.defaultOption + ", productDetails=" + this.productDetails + ", presentedOfferingIdentifier=" + this.presentedOfferingIdentifier + ", presentedOfferingContext=" + this.presentedOfferingContext + ')';
    }
}
