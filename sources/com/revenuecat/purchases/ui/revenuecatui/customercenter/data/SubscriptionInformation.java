package com.revenuecat.purchases.ui.revenuecatui.customercenter.data;

import ae.r;
import com.amazon.a.a.o.b;

/* JADX INFO: loaded from: classes2.dex */
public final class SubscriptionInformation {
    private final boolean active;
    private final String durationTitle;
    private final String expirationDateString;
    private final String price;
    private final String title;
    private final boolean willRenew;

    public SubscriptionInformation(String str, String str2, String str3, String str4, boolean z10, boolean z11) {
        r.f(str, b.S);
        r.f(str2, "durationTitle");
        r.f(str3, b.f7450x);
        this.title = str;
        this.durationTitle = str2;
        this.price = str3;
        this.expirationDateString = str4;
        this.willRenew = z10;
        this.active = z11;
    }

    public static /* synthetic */ SubscriptionInformation copy$default(SubscriptionInformation subscriptionInformation, String str, String str2, String str3, String str4, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = subscriptionInformation.title;
        }
        if ((i10 & 2) != 0) {
            str2 = subscriptionInformation.durationTitle;
        }
        String str5 = str2;
        if ((i10 & 4) != 0) {
            str3 = subscriptionInformation.price;
        }
        String str6 = str3;
        if ((i10 & 8) != 0) {
            str4 = subscriptionInformation.expirationDateString;
        }
        String str7 = str4;
        if ((i10 & 16) != 0) {
            z10 = subscriptionInformation.willRenew;
        }
        boolean z12 = z10;
        if ((i10 & 32) != 0) {
            z11 = subscriptionInformation.active;
        }
        return subscriptionInformation.copy(str, str5, str6, str7, z12, z11);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.durationTitle;
    }

    public final String component3() {
        return this.price;
    }

    public final String component4() {
        return this.expirationDateString;
    }

    public final boolean component5() {
        return this.willRenew;
    }

    public final boolean component6() {
        return this.active;
    }

    public final SubscriptionInformation copy(String str, String str2, String str3, String str4, boolean z10, boolean z11) {
        r.f(str, b.S);
        r.f(str2, "durationTitle");
        r.f(str3, b.f7450x);
        return new SubscriptionInformation(str, str2, str3, str4, z10, z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubscriptionInformation)) {
            return false;
        }
        SubscriptionInformation subscriptionInformation = (SubscriptionInformation) obj;
        return r.b(this.title, subscriptionInformation.title) && r.b(this.durationTitle, subscriptionInformation.durationTitle) && r.b(this.price, subscriptionInformation.price) && r.b(this.expirationDateString, subscriptionInformation.expirationDateString) && this.willRenew == subscriptionInformation.willRenew && this.active == subscriptionInformation.active;
    }

    public final boolean getActive() {
        return this.active;
    }

    public final String getDurationTitle() {
        return this.durationTitle;
    }

    public final String getExpirationDateString() {
        return this.expirationDateString;
    }

    public final String getPrice() {
        return this.price;
    }

    public final String getTitle() {
        return this.title;
    }

    public final boolean getWillRenew() {
        return this.willRenew;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v8, types: [int] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = ((((this.title.hashCode() * 31) + this.durationTitle.hashCode()) * 31) + this.price.hashCode()) * 31;
        String str = this.expirationDateString;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        boolean z10 = this.willRenew;
        ?? r12 = z10;
        if (z10) {
            r12 = 1;
        }
        int i10 = (iHashCode2 + r12) * 31;
        boolean z11 = this.active;
        return i10 + (z11 ? 1 : z11);
    }

    public String toString() {
        return "SubscriptionInformation(title=" + this.title + ", durationTitle=" + this.durationTitle + ", price=" + this.price + ", expirationDateString=" + this.expirationDateString + ", willRenew=" + this.willRenew + ", active=" + this.active + ')';
    }
}
