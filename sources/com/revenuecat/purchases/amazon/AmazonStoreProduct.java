package com.revenuecat.purchases.amazon;

import ae.j;
import ae.r;
import com.amazon.a.a.o.b;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.amazon.AmazonPurchasingData;
import com.revenuecat.purchases.models.Period;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.models.SubscriptionOptions;
import java.util.Locale;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class AmazonStoreProduct implements StoreProduct {
    private final SubscriptionOption defaultOption;
    private final String description;
    private final Period freeTrialPeriod;
    private final String iconUrl;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final String f9089id;
    private final String name;
    private final JSONObject originalProductJSON;
    private final Period period;
    private final PresentedOfferingContext presentedOfferingContext;
    private final Price price;
    private final SubscriptionOptions subscriptionOptions;
    private final String title;
    private final ProductType type;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AmazonStoreProduct(String str, ProductType productType, String str2, String str3, Period period, Price price, SubscriptionOptions subscriptionOptions, SubscriptionOption subscriptionOption, String str4, Period period2, JSONObject jSONObject, String str5) {
        this(str, productType, str2, str2, str3, period, price, subscriptionOptions, subscriptionOption, str4, period2, jSONObject, str5 != null ? new PresentedOfferingContext(str5) : null);
        r.f(str, "id");
        r.f(productType, "type");
        r.f(str2, b.S);
        r.f(str3, b.f7429c);
        r.f(price, b.f7450x);
        r.f(str4, b.f7436j);
        r.f(jSONObject, "originalProductJSON");
    }

    public /* synthetic */ AmazonStoreProduct(String str, ProductType productType, String str2, String str3, Period period, Price price, SubscriptionOptions subscriptionOptions, SubscriptionOption subscriptionOption, String str4, Period period2, JSONObject jSONObject, String str5, int i10, j jVar) {
        this(str, productType, str2, str3, period, price, subscriptionOptions, subscriptionOption, str4, period2, jSONObject, (i10 & 2048) != 0 ? null : str5);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AmazonStoreProduct(String str, ProductType productType, String str2, String str3, String str4, Period period, Price price, SubscriptionOptions subscriptionOptions, SubscriptionOption subscriptionOption, String str5, Period period2, JSONObject jSONObject) {
        this(str, productType, str2, str3, str4, period, price, subscriptionOptions, subscriptionOption, str5, period2, jSONObject, null, 4096, null);
        r.f(str, "id");
        r.f(productType, "type");
        r.f(str2, "name");
        r.f(str3, b.S);
        r.f(str4, b.f7429c);
        r.f(price, b.f7450x);
        r.f(str5, b.f7436j);
        r.f(jSONObject, "originalProductJSON");
    }

    public AmazonStoreProduct(String str, ProductType productType, String str2, String str3, String str4, Period period, Price price, SubscriptionOptions subscriptionOptions, SubscriptionOption subscriptionOption, String str5, Period period2, JSONObject jSONObject, PresentedOfferingContext presentedOfferingContext) {
        r.f(str, "id");
        r.f(productType, "type");
        r.f(str2, "name");
        r.f(str3, b.S);
        r.f(str4, b.f7429c);
        r.f(price, b.f7450x);
        r.f(str5, b.f7436j);
        r.f(jSONObject, "originalProductJSON");
        this.f9089id = str;
        this.type = productType;
        this.name = str2;
        this.title = str3;
        this.description = str4;
        this.period = period;
        this.price = price;
        this.subscriptionOptions = subscriptionOptions;
        this.defaultOption = subscriptionOption;
        this.iconUrl = str5;
        this.freeTrialPeriod = period2;
        this.originalProductJSON = jSONObject;
        this.presentedOfferingContext = presentedOfferingContext;
    }

    public /* synthetic */ AmazonStoreProduct(String str, ProductType productType, String str2, String str3, String str4, Period period, Price price, SubscriptionOptions subscriptionOptions, SubscriptionOption subscriptionOption, String str5, Period period2, JSONObject jSONObject, PresentedOfferingContext presentedOfferingContext, int i10, j jVar) {
        this(str, productType, str2, str3, str4, period, price, subscriptionOptions, subscriptionOption, str5, period2, jSONObject, (i10 & 4096) != 0 ? null : presentedOfferingContext);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AmazonStoreProduct(String str, ProductType productType, String str2, String str3, String str4, Period period, Price price, SubscriptionOptions subscriptionOptions, SubscriptionOption subscriptionOption, String str5, Period period2, JSONObject jSONObject, String str6) {
        this(str, productType, str2, str3, str4, period, price, subscriptionOptions, subscriptionOption, str5, period2, jSONObject, new PresentedOfferingContext(str6));
        r.f(str, "id");
        r.f(productType, "type");
        r.f(str2, "name");
        r.f(str3, b.S);
        r.f(str4, b.f7429c);
        r.f(price, b.f7450x);
        r.f(str5, b.f7436j);
        r.f(jSONObject, "originalProductJSON");
        r.f(str6, "presentedOfferingIdentifier");
    }

    public static /* synthetic */ void getPresentedOfferingIdentifier$annotations() {
    }

    public static /* synthetic */ void getSku$annotations() {
    }

    public final String component1() {
        return this.f9089id;
    }

    public final String component10() {
        return this.iconUrl;
    }

    public final Period component11() {
        return this.freeTrialPeriod;
    }

    public final JSONObject component12() {
        return this.originalProductJSON;
    }

    public final PresentedOfferingContext component13() {
        return this.presentedOfferingContext;
    }

    public final ProductType component2() {
        return this.type;
    }

    public final String component3() {
        return this.name;
    }

    public final String component4() {
        return this.title;
    }

    public final String component5() {
        return this.description;
    }

    public final Period component6() {
        return this.period;
    }

    public final Price component7() {
        return this.price;
    }

    public final SubscriptionOptions component8() {
        return this.subscriptionOptions;
    }

    public final SubscriptionOption component9() {
        return this.defaultOption;
    }

    public final AmazonStoreProduct copy(String str, ProductType productType, String str2, String str3, String str4, Period period, Price price, SubscriptionOptions subscriptionOptions, SubscriptionOption subscriptionOption, String str5, Period period2, JSONObject jSONObject, PresentedOfferingContext presentedOfferingContext) {
        r.f(str, "id");
        r.f(productType, "type");
        r.f(str2, "name");
        r.f(str3, b.S);
        r.f(str4, b.f7429c);
        r.f(price, b.f7450x);
        r.f(str5, b.f7436j);
        r.f(jSONObject, "originalProductJSON");
        return new AmazonStoreProduct(str, productType, str2, str3, str4, period, price, subscriptionOptions, subscriptionOption, str5, period2, jSONObject, presentedOfferingContext);
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
        return new AmazonStoreProduct(getId(), getType(), getName(), getTitle(), getDescription(), getPeriod(), getPrice(), getSubscriptionOptions(), getDefaultOption(), this.iconUrl, this.freeTrialPeriod, this.originalProductJSON, presentedOfferingContext);
    }

    public boolean equals(Object obj) {
        return (obj instanceof AmazonStoreProduct) && r.b(new ComparableData(this), new ComparableData((AmazonStoreProduct) obj));
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public String formattedPricePerMonth(Locale locale) {
        return StoreProduct.DefaultImpls.formattedPricePerMonth(this, locale);
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public SubscriptionOption getDefaultOption() {
        return this.defaultOption;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public String getDescription() {
        return this.description;
    }

    public final Period getFreeTrialPeriod() {
        return this.freeTrialPeriod;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public String getId() {
        return this.f9089id;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public String getName() {
        return this.name;
    }

    public final JSONObject getOriginalProductJSON() {
        return this.originalProductJSON;
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
        PresentedOfferingContext presentedOfferingContext = getPresentedOfferingContext();
        if (presentedOfferingContext != null) {
            return presentedOfferingContext.getOfferingIdentifier();
        }
        return null;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public Price getPrice() {
        return this.price;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public AmazonPurchasingData getPurchasingData() {
        return new AmazonPurchasingData.Product(this);
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public String getSku() {
        return getId();
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
        return new ComparableData(this).hashCode();
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
        return "AmazonStoreProduct(id=" + this.f9089id + ", type=" + this.type + ", name=" + this.name + ", title=" + this.title + ", description=" + this.description + ", period=" + this.period + ", price=" + this.price + ", subscriptionOptions=" + this.subscriptionOptions + ", defaultOption=" + this.defaultOption + ", iconUrl=" + this.iconUrl + ", freeTrialPeriod=" + this.freeTrialPeriod + ", originalProductJSON=" + this.originalProductJSON + ", presentedOfferingContext=" + this.presentedOfferingContext + ')';
    }
}
