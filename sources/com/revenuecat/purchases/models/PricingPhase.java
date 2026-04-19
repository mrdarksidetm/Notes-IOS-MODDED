package com.revenuecat.purchases.models;

import ae.r;
import android.os.Parcel;
import android.os.Parcelable;
import com.amazon.a.a.o.b;
import com.revenuecat.purchases.utils.PriceExtensionsKt;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class PricingPhase implements Parcelable {
    public static final Parcelable.Creator<PricingPhase> CREATOR = new Creator();
    private final Integer billingCycleCount;
    private final Period billingPeriod;
    private final Price price;
    private final RecurrenceMode recurrenceMode;

    public static final class Creator implements Parcelable.Creator<PricingPhase> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PricingPhase createFromParcel(Parcel parcel) {
            r.f(parcel, "parcel");
            return new PricingPhase(Period.CREATOR.createFromParcel(parcel), RecurrenceMode.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), Price.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PricingPhase[] newArray(int i10) {
            return new PricingPhase[i10];
        }
    }

    public PricingPhase(Period period, RecurrenceMode recurrenceMode, Integer num, Price price) {
        r.f(period, "billingPeriod");
        r.f(recurrenceMode, "recurrenceMode");
        r.f(price, b.f7450x);
        this.billingPeriod = period;
        this.recurrenceMode = recurrenceMode;
        this.billingCycleCount = num;
        this.price = price;
    }

    public static /* synthetic */ PricingPhase copy$default(PricingPhase pricingPhase, Period period, RecurrenceMode recurrenceMode, Integer num, Price price, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            period = pricingPhase.billingPeriod;
        }
        if ((i10 & 2) != 0) {
            recurrenceMode = pricingPhase.recurrenceMode;
        }
        if ((i10 & 4) != 0) {
            num = pricingPhase.billingCycleCount;
        }
        if ((i10 & 8) != 0) {
            price = pricingPhase.price;
        }
        return pricingPhase.copy(period, recurrenceMode, num, price);
    }

    public static /* synthetic */ String formattedPriceInMonths$default(PricingPhase pricingPhase, Locale locale, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            locale = Locale.getDefault();
            r.e(locale, "getDefault()");
        }
        return pricingPhase.formattedPriceInMonths(locale);
    }

    public static /* synthetic */ Price pricePerMonth$default(PricingPhase pricingPhase, Locale locale, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            locale = Locale.getDefault();
            r.e(locale, "getDefault()");
        }
        return pricingPhase.pricePerMonth(locale);
    }

    public static /* synthetic */ Price pricePerWeek$default(PricingPhase pricingPhase, Locale locale, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            locale = Locale.getDefault();
            r.e(locale, "getDefault()");
        }
        return pricingPhase.pricePerWeek(locale);
    }

    public static /* synthetic */ Price pricePerYear$default(PricingPhase pricingPhase, Locale locale, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            locale = Locale.getDefault();
            r.e(locale, "getDefault()");
        }
        return pricingPhase.pricePerYear(locale);
    }

    public final Period component1() {
        return this.billingPeriod;
    }

    public final RecurrenceMode component2() {
        return this.recurrenceMode;
    }

    public final Integer component3() {
        return this.billingCycleCount;
    }

    public final Price component4() {
        return this.price;
    }

    public final PricingPhase copy(Period period, RecurrenceMode recurrenceMode, Integer num, Price price) {
        r.f(period, "billingPeriod");
        r.f(recurrenceMode, "recurrenceMode");
        r.f(price, b.f7450x);
        return new PricingPhase(period, recurrenceMode, num, price);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PricingPhase)) {
            return false;
        }
        PricingPhase pricingPhase = (PricingPhase) obj;
        return r.b(this.billingPeriod, pricingPhase.billingPeriod) && this.recurrenceMode == pricingPhase.recurrenceMode && r.b(this.billingCycleCount, pricingPhase.billingCycleCount) && r.b(this.price, pricingPhase.price);
    }

    public final String formattedPriceInMonths() {
        return formattedPriceInMonths$default(this, null, 1, null);
    }

    public final String formattedPriceInMonths(Locale locale) {
        r.f(locale, "locale");
        return pricePerMonth(locale).getFormatted();
    }

    public final Integer getBillingCycleCount() {
        return this.billingCycleCount;
    }

    public final Period getBillingPeriod() {
        return this.billingPeriod;
    }

    public final OfferPaymentMode getOfferPaymentMode() {
        if (this.recurrenceMode != RecurrenceMode.FINITE_RECURRING) {
            return null;
        }
        if (this.price.getAmountMicros() == 0) {
            return OfferPaymentMode.FREE_TRIAL;
        }
        Integer num = this.billingCycleCount;
        if (num != null && num.intValue() == 1) {
            return OfferPaymentMode.SINGLE_PAYMENT;
        }
        Integer num2 = this.billingCycleCount;
        if (num2 == null || num2.intValue() <= 1) {
            return null;
        }
        return OfferPaymentMode.DISCOUNTED_RECURRING_PAYMENT;
    }

    public final Price getPrice() {
        return this.price;
    }

    public final RecurrenceMode getRecurrenceMode() {
        return this.recurrenceMode;
    }

    public int hashCode() {
        int iHashCode = ((this.billingPeriod.hashCode() * 31) + this.recurrenceMode.hashCode()) * 31;
        Integer num = this.billingCycleCount;
        return ((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.price.hashCode();
    }

    public final Price pricePerMonth() {
        return pricePerMonth$default(this, null, 1, null);
    }

    public final Price pricePerMonth(Locale locale) {
        r.f(locale, "locale");
        return PriceExtensionsKt.pricePerMonth(this.price, this.billingPeriod, locale);
    }

    public final Price pricePerWeek() {
        return pricePerWeek$default(this, null, 1, null);
    }

    public final Price pricePerWeek(Locale locale) {
        r.f(locale, "locale");
        return PriceExtensionsKt.pricePerWeek(this.price, this.billingPeriod, locale);
    }

    public final Price pricePerYear() {
        return pricePerYear$default(this, null, 1, null);
    }

    public final Price pricePerYear(Locale locale) {
        r.f(locale, "locale");
        return PriceExtensionsKt.pricePerYear(this.price, this.billingPeriod, locale);
    }

    public String toString() {
        return "PricingPhase(billingPeriod=" + this.billingPeriod + ", recurrenceMode=" + this.recurrenceMode + ", billingCycleCount=" + this.billingCycleCount + ", price=" + this.price + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iIntValue;
        r.f(parcel, "out");
        this.billingPeriod.writeToParcel(parcel, i10);
        parcel.writeString(this.recurrenceMode.name());
        Integer num = this.billingCycleCount;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        this.price.writeToParcel(parcel, i10);
    }
}
