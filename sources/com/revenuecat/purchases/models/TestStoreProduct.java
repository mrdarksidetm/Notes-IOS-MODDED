package com.revenuecat.purchases.models;

import ae.j;
import ae.r;
import com.amazon.a.a.o.b;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.models.Period;
import com.revenuecat.purchases.models.StoreProduct;
import java.util.Locale;
import nd.t;
import nd.u;

/* JADX INFO: loaded from: classes2.dex */
public final class TestStoreProduct implements StoreProduct {
    private final String description;
    private final Period freeTrialPeriod;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final String f9111id;
    private final Price introPrice;
    private final String name;
    private final Period period;
    private final Price price;
    private final String title;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TestStoreProduct(String str, String str2, String str3, Price price, Period period, Period period2, Price price2) {
        this(str, str2, str2, str3, price, period, period2, price2);
        r.f(str, "id");
        r.f(str2, b.S);
        r.f(str3, b.f7429c);
        r.f(price, b.f7450x);
    }

    public /* synthetic */ TestStoreProduct(String str, String str2, String str3, Price price, Period period, Period period2, Price price2, int i10, j jVar) {
        this(str, str2, str3, price, period, (i10 & 32) != 0 ? null : period2, (i10 & 64) != 0 ? null : price2);
    }

    public TestStoreProduct(String str, String str2, String str3, String str4, Price price, Period period, Period period2, Price price2) {
        r.f(str, "id");
        r.f(str2, "name");
        r.f(str3, b.S);
        r.f(str4, b.f7429c);
        r.f(price, b.f7450x);
        this.f9111id = str;
        this.name = str2;
        this.title = str3;
        this.description = str4;
        this.price = price;
        this.period = period;
        this.freeTrialPeriod = period2;
        this.introPrice = price2;
    }

    public /* synthetic */ TestStoreProduct(String str, String str2, String str3, String str4, Price price, Period period, Period period2, Price price2, int i10, j jVar) {
        this(str, str2, str3, str4, price, period, (i10 & 64) != 0 ? null : period2, (i10 & 128) != 0 ? null : price2);
    }

    private final SubscriptionOptions buildSubscriptionOptions() {
        if (getPeriod() == null) {
            return null;
        }
        Period period = this.freeTrialPeriod;
        PricingPhase pricingPhase = period != null ? new PricingPhase(period, RecurrenceMode.FINITE_RECURRING, 1, new Price("Free", 0L, getPrice().getCurrencyCode())) : null;
        Price price = this.introPrice;
        PricingPhase pricingPhase2 = price != null ? new PricingPhase(new Period(1, Period.Unit.MONTH, "P1M"), RecurrenceMode.FINITE_RECURRING, 1, price) : null;
        PricingPhase pricingPhase3 = new PricingPhase(getPeriod(), RecurrenceMode.INFINITE_RECURRING, null, getPrice());
        TestSubscriptionOption[] testSubscriptionOptionArr = new TestSubscriptionOption[2];
        testSubscriptionOptionArr[0] = this.freeTrialPeriod != null || pricingPhase2 != null ? new TestSubscriptionOption(getId(), u.r(pricingPhase, pricingPhase2, pricingPhase3), null, null, null, null, 60, null) : null;
        testSubscriptionOptionArr[1] = new TestSubscriptionOption(getId(), t.d(pricingPhase3), null, null, null, null, 60, null);
        return new SubscriptionOptions(u.r(testSubscriptionOptionArr));
    }

    private final Period component7() {
        return this.freeTrialPeriod;
    }

    private final Price component8() {
        return this.introPrice;
    }

    public static /* synthetic */ void getPresentedOfferingIdentifier$annotations() {
    }

    public final String component1() {
        return this.f9111id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.description;
    }

    public final Price component5() {
        return this.price;
    }

    public final Period component6() {
        return this.period;
    }

    public final TestStoreProduct copy(String str, String str2, String str3, String str4, Price price, Period period, Period period2, Price price2) {
        r.f(str, "id");
        r.f(str2, "name");
        r.f(str3, b.S);
        r.f(str4, b.f7429c);
        r.f(price, b.f7450x);
        return new TestStoreProduct(str, str2, str3, str4, price, period, period2, price2);
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public StoreProduct copyWithOfferingId(String str) {
        r.f(str, "offeringId");
        return copyWithPresentedOfferingContext(new PresentedOfferingContext(str));
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public StoreProduct copyWithPresentedOfferingContext(PresentedOfferingContext presentedOfferingContext) {
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TestStoreProduct)) {
            return false;
        }
        TestStoreProduct testStoreProduct = (TestStoreProduct) obj;
        return r.b(this.f9111id, testStoreProduct.f9111id) && r.b(this.name, testStoreProduct.name) && r.b(this.title, testStoreProduct.title) && r.b(this.description, testStoreProduct.description) && r.b(this.price, testStoreProduct.price) && r.b(this.period, testStoreProduct.period) && r.b(this.freeTrialPeriod, testStoreProduct.freeTrialPeriod) && r.b(this.introPrice, testStoreProduct.introPrice);
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public String formattedPricePerMonth(Locale locale) {
        return StoreProduct.DefaultImpls.formattedPricePerMonth(this, locale);
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public SubscriptionOption getDefaultOption() {
        SubscriptionOptions subscriptionOptions = getSubscriptionOptions();
        if (subscriptionOptions != null) {
            return subscriptionOptions.getDefaultOffer();
        }
        return null;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public String getDescription() {
        return this.description;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public String getId() {
        return this.f9111id;
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
        return null;
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
    public PurchasingData getPurchasingData() {
        return new PurchasingData() { // from class: com.revenuecat.purchases.models.TestStoreProduct$purchasingData$1
            @Override // com.revenuecat.purchases.models.PurchasingData
            public String getProductId() {
                return this.this$0.getId();
            }

            @Override // com.revenuecat.purchases.models.PurchasingData
            public ProductType getProductType() {
                return this.this$0.getType();
            }
        };
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public String getSku() {
        return getId();
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public SubscriptionOptions getSubscriptionOptions() {
        return buildSubscriptionOptions();
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public String getTitle() {
        return this.title;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public ProductType getType() {
        return getPeriod() == null ? ProductType.INAPP : ProductType.SUBS;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.f9111id.hashCode() * 31) + this.name.hashCode()) * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + this.price.hashCode()) * 31;
        Period period = this.period;
        int iHashCode2 = (iHashCode + (period == null ? 0 : period.hashCode())) * 31;
        Period period2 = this.freeTrialPeriod;
        int iHashCode3 = (iHashCode2 + (period2 == null ? 0 : period2.hashCode())) * 31;
        Price price = this.introPrice;
        return iHashCode3 + (price != null ? price.hashCode() : 0);
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
        return "TestStoreProduct(id=" + this.f9111id + ", name=" + this.name + ", title=" + this.title + ", description=" + this.description + ", price=" + this.price + ", period=" + this.period + ", freeTrialPeriod=" + this.freeTrialPeriod + ", introPrice=" + this.introPrice + ')';
    }
}
