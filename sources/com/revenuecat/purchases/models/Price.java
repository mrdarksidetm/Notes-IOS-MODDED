package com.revenuecat.purchases.models;

import ae.r;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class Price implements Parcelable {
    public static final Parcelable.Creator<Price> CREATOR = new Creator();
    private final long amountMicros;
    private final String currencyCode;
    private final String formatted;

    public static final class Creator implements Parcelable.Creator<Price> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Price createFromParcel(Parcel parcel) {
            r.f(parcel, "parcel");
            return new Price(parcel.readString(), parcel.readLong(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Price[] newArray(int i10) {
            return new Price[i10];
        }
    }

    public Price(String str, long j10, String str2) {
        r.f(str, "formatted");
        r.f(str2, "currencyCode");
        this.formatted = str;
        this.amountMicros = j10;
        this.currencyCode = str2;
    }

    public static /* synthetic */ Price copy$default(Price price, String str, long j10, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = price.formatted;
        }
        if ((i10 & 2) != 0) {
            j10 = price.amountMicros;
        }
        if ((i10 & 4) != 0) {
            str2 = price.currencyCode;
        }
        return price.copy(str, j10, str2);
    }

    public final String component1() {
        return this.formatted;
    }

    public final long component2() {
        return this.amountMicros;
    }

    public final String component3() {
        return this.currencyCode;
    }

    public final Price copy(String str, long j10, String str2) {
        r.f(str, "formatted");
        r.f(str2, "currencyCode");
        return new Price(str, j10, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Price)) {
            return false;
        }
        Price price = (Price) obj;
        return r.b(this.formatted, price.formatted) && this.amountMicros == price.amountMicros && r.b(this.currencyCode, price.currencyCode);
    }

    public final long getAmountMicros() {
        return this.amountMicros;
    }

    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    public final String getFormatted() {
        return this.formatted;
    }

    public int hashCode() {
        return (((this.formatted.hashCode() * 31) + Long.hashCode(this.amountMicros)) * 31) + this.currencyCode.hashCode();
    }

    public String toString() {
        return "Price(formatted=" + this.formatted + ", amountMicros=" + this.amountMicros + ", currencyCode=" + this.currencyCode + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        r.f(parcel, "out");
        parcel.writeString(this.formatted);
        parcel.writeLong(this.amountMicros);
        parcel.writeString(this.currencyCode);
    }
}
