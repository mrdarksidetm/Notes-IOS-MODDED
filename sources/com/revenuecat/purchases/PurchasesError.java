package com.revenuecat.purchases;

import ae.j;
import ae.r;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class PurchasesError implements Parcelable {
    public static final Parcelable.Creator<PurchasesError> CREATOR = new Creator();
    private final PurchasesErrorCode code;
    private final String message;
    private final String underlyingErrorMessage;

    public static final class Creator implements Parcelable.Creator<PurchasesError> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PurchasesError createFromParcel(Parcel parcel) {
            r.f(parcel, "parcel");
            return new PurchasesError(PurchasesErrorCode.valueOf(parcel.readString()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PurchasesError[] newArray(int i10) {
            return new PurchasesError[i10];
        }
    }

    public PurchasesError(PurchasesErrorCode purchasesErrorCode, String str) {
        r.f(purchasesErrorCode, "code");
        this.code = purchasesErrorCode;
        this.underlyingErrorMessage = str;
        this.message = purchasesErrorCode.getDescription();
    }

    public /* synthetic */ PurchasesError(PurchasesErrorCode purchasesErrorCode, String str, int i10, j jVar) {
        this(purchasesErrorCode, (i10 & 2) != 0 ? null : str);
    }

    public static /* synthetic */ void getMessage$annotations() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!r.b(PurchasesError.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        r.d(obj, "null cannot be cast to non-null type com.revenuecat.purchases.PurchasesError");
        PurchasesError purchasesError = (PurchasesError) obj;
        return this.code == purchasesError.code && r.b(this.underlyingErrorMessage, purchasesError.underlyingErrorMessage);
    }

    public final PurchasesErrorCode getCode() {
        return this.code;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getUnderlyingErrorMessage() {
        return this.underlyingErrorMessage;
    }

    public int hashCode() {
        int iHashCode = this.code.hashCode() * 31;
        String str = this.underlyingErrorMessage;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "PurchasesError(code=" + this.code + ", underlyingErrorMessage=" + this.underlyingErrorMessage + ", message='" + this.message + "')";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        r.f(parcel, "out");
        parcel.writeString(this.code.name());
        parcel.writeString(this.underlyingErrorMessage);
    }
}
