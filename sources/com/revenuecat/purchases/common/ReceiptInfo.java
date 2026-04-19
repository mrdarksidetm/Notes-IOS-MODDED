package com.revenuecat.purchases.common;

import ae.j;
import ae.r;
import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.ReplacementMode;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.PricingPhase;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.SubscriptionOption;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import nd.c0;
import nd.u;
import nd.v;

/* JADX INFO: loaded from: classes2.dex */
public final class ReceiptInfo {
    private final String currency;
    private final String duration;
    private final PresentedOfferingContext presentedOfferingContext;
    private final Double price;
    private final List<PricingPhase> pricingPhases;
    private final List<String> productIDs;
    private final ReplacementMode replacementMode;
    private final StoreProduct storeProduct;
    private final SubscriptionOption subscriptionOption;
    private final String subscriptionOptionId;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ReceiptInfo(java.util.List<java.lang.String> r2, com.revenuecat.purchases.PresentedOfferingContext r3, java.lang.String r4, com.revenuecat.purchases.models.StoreProduct r5, java.lang.Double r6, java.lang.String r7, com.revenuecat.purchases.ReplacementMode r8) {
        /*
            r1 = this;
            java.lang.String r0 = "productIDs"
            ae.r.f(r2, r0)
            r1.<init>()
            r1.productIDs = r2
            r1.presentedOfferingContext = r3
            r1.subscriptionOptionId = r4
            r1.storeProduct = r5
            r1.price = r6
            r1.currency = r7
            r1.replacementMode = r8
            r2 = 0
            if (r5 == 0) goto L31
            com.revenuecat.purchases.models.Period r3 = r5.getPeriod()
            if (r3 == 0) goto L31
            java.lang.String r3 = r3.getIso8601()
            if (r3 == 0) goto L31
            int r4 = r3.length()
            if (r4 != 0) goto L2d
            r4 = 1
            goto L2e
        L2d:
            r4 = 0
        L2e:
            if (r4 != 0) goto L31
            goto L32
        L31:
            r3 = r2
        L32:
            r1.duration = r3
            if (r5 == 0) goto L5e
            com.revenuecat.purchases.models.SubscriptionOptions r3 = r5.getSubscriptionOptions()
            if (r3 == 0) goto L5e
            java.util.Iterator r3 = r3.iterator()
        L40:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L5a
            java.lang.Object r4 = r3.next()
            r5 = r4
            com.revenuecat.purchases.models.SubscriptionOption r5 = (com.revenuecat.purchases.models.SubscriptionOption) r5
            java.lang.String r5 = r5.getId()
            java.lang.String r6 = r1.subscriptionOptionId
            boolean r5 = ae.r.b(r5, r6)
            if (r5 == 0) goto L40
            goto L5b
        L5a:
            r4 = r2
        L5b:
            com.revenuecat.purchases.models.SubscriptionOption r4 = (com.revenuecat.purchases.models.SubscriptionOption) r4
            goto L5f
        L5e:
            r4 = r2
        L5f:
            r1.subscriptionOption = r4
            if (r4 == 0) goto L67
            java.util.List r2 = r4.getPricingPhases()
        L67:
            r1.pricingPhases = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revenuecat.purchases.common.ReceiptInfo.<init>(java.util.List, com.revenuecat.purchases.PresentedOfferingContext, java.lang.String, com.revenuecat.purchases.models.StoreProduct, java.lang.Double, java.lang.String, com.revenuecat.purchases.ReplacementMode):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ReceiptInfo(List list, PresentedOfferingContext presentedOfferingContext, String str, StoreProduct storeProduct, Double d10, String str2, ReplacementMode replacementMode, int i10, j jVar) {
        Price price;
        Price price2;
        PresentedOfferingContext presentedOfferingContext2 = (i10 & 2) != 0 ? null : presentedOfferingContext;
        String str3 = (i10 & 4) != 0 ? null : str;
        StoreProduct storeProduct2 = (i10 & 8) != 0 ? null : storeProduct;
        this(list, presentedOfferingContext2, str3, storeProduct2, (i10 & 16) != 0 ? (storeProduct2 == null || (price2 = storeProduct2.getPrice()) == null) ? null : Double.valueOf(price2.getAmountMicros() / 1000000.0d) : d10, (i10 & 32) != 0 ? (storeProduct2 == null || (price = storeProduct2.getPrice()) == null) ? null : price.getCurrencyCode() : str2, (i10 & 64) == 0 ? replacementMode : null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!r.b(ReceiptInfo.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        r.d(obj, "null cannot be cast to non-null type com.revenuecat.purchases.common.ReceiptInfo");
        ReceiptInfo receiptInfo = (ReceiptInfo) obj;
        return r.b(this.productIDs, receiptInfo.productIDs) && r.b(this.presentedOfferingContext, receiptInfo.presentedOfferingContext) && r.b(this.storeProduct, receiptInfo.storeProduct) && r.a(this.price, receiptInfo.price) && r.b(this.currency, receiptInfo.currency) && r.b(this.subscriptionOptionId, receiptInfo.subscriptionOptionId);
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getDuration() {
        return this.duration;
    }

    public final List<PlatformProductId> getPlatformProductIds$purchases_defaultsRelease() {
        PlatformProductId platformProductId;
        SubscriptionOption subscriptionOption = this.subscriptionOption;
        if (subscriptionOption == null || (platformProductId = ReceiptInfoKt.platformProductId(subscriptionOption)) == null) {
            StoreProduct storeProduct = this.storeProduct;
            platformProductId = storeProduct != null ? ReceiptInfoKt.platformProductId(storeProduct) : null;
        }
        List<String> list = this.productIDs;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!r.b((String) obj, platformProductId != null ? platformProductId.getProductId() : null)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(v.x(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new PlatformProductId((String) it.next()));
        }
        return c0.n0(arrayList2, u.q(platformProductId));
    }

    public final PresentedOfferingContext getPresentedOfferingContext() {
        return this.presentedOfferingContext;
    }

    public final Double getPrice() {
        return this.price;
    }

    public final List<PricingPhase> getPricingPhases() {
        return this.pricingPhases;
    }

    public final List<String> getProductIDs() {
        return this.productIDs;
    }

    public final ReplacementMode getReplacementMode() {
        return this.replacementMode;
    }

    public final StoreProduct getStoreProduct() {
        return this.storeProduct;
    }

    public final String getSubscriptionOptionId() {
        return this.subscriptionOptionId;
    }

    public int hashCode() {
        int iHashCode = this.productIDs.hashCode() * 31;
        PresentedOfferingContext presentedOfferingContext = this.presentedOfferingContext;
        int iHashCode2 = (iHashCode + (presentedOfferingContext != null ? presentedOfferingContext.hashCode() : 0)) * 31;
        StoreProduct storeProduct = this.storeProduct;
        int iHashCode3 = (iHashCode2 + (storeProduct != null ? storeProduct.hashCode() : 0)) * 31;
        String str = this.subscriptionOptionId;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "ReceiptInfo(productIDs='" + c0.h0(this.productIDs, null, null, null, 0, null, null, 63, null) + "', presentedOfferingContext=" + this.presentedOfferingContext + ", storeProduct=" + this.storeProduct + ", subscriptionOptionId=" + this.subscriptionOptionId + ", pricingPhases=" + this.pricingPhases + ", price=" + this.price + ", currency=" + this.currency + ", duration=" + this.duration + ')';
    }
}
