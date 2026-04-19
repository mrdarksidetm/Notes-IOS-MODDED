package com.revenuecat.purchases.ui.revenuecatui.activity;

import ae.j;
import ae.r;
import android.os.Parcel;
import android.os.Parcelable;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.PurchasesError;

/* JADX INFO: loaded from: classes2.dex */
public abstract class PaywallResult implements Parcelable {
    public static final int $stable = 0;

    public static final class Cancelled extends PaywallResult {
        public static final int $stable = 0;
        public static final Cancelled INSTANCE = new Cancelled();
        public static final Parcelable.Creator<Cancelled> CREATOR = new Creator();

        public static final class Creator implements Parcelable.Creator<Cancelled> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Cancelled createFromParcel(Parcel parcel) {
                r.f(parcel, "parcel");
                parcel.readInt();
                return Cancelled.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Cancelled[] newArray(int i10) {
                return new Cancelled[i10];
            }
        }

        private Cancelled() {
            super(null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            r.f(parcel, "out");
            parcel.writeInt(1);
        }
    }

    public static final class Error extends PaywallResult {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Error> CREATOR = new Creator();
        private final PurchasesError error;

        public static final class Creator implements Parcelable.Creator<Error> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Error createFromParcel(Parcel parcel) {
                r.f(parcel, "parcel");
                return new Error((PurchasesError) parcel.readParcelable(Error.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Error[] newArray(int i10) {
                return new Error[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(PurchasesError purchasesError) {
            super(null);
            r.f(purchasesError, "error");
            this.error = purchasesError;
        }

        public static /* synthetic */ Error copy$default(Error error, PurchasesError purchasesError, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                purchasesError = error.error;
            }
            return error.copy(purchasesError);
        }

        public final PurchasesError component1() {
            return this.error;
        }

        public final Error copy(PurchasesError purchasesError) {
            r.f(purchasesError, "error");
            return new Error(purchasesError);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && r.b(this.error, ((Error) obj).error);
        }

        public final PurchasesError getError() {
            return this.error;
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.error + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            r.f(parcel, "out");
            parcel.writeParcelable(this.error, i10);
        }
    }

    public static final class Purchased extends PaywallResult {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Purchased> CREATOR = new Creator();
        private final CustomerInfo customerInfo;

        public static final class Creator implements Parcelable.Creator<Purchased> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Purchased createFromParcel(Parcel parcel) {
                r.f(parcel, "parcel");
                return new Purchased((CustomerInfo) parcel.readParcelable(Purchased.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Purchased[] newArray(int i10) {
                return new Purchased[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Purchased(CustomerInfo customerInfo) {
            super(null);
            r.f(customerInfo, "customerInfo");
            this.customerInfo = customerInfo;
        }

        public static /* synthetic */ Purchased copy$default(Purchased purchased, CustomerInfo customerInfo, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                customerInfo = purchased.customerInfo;
            }
            return purchased.copy(customerInfo);
        }

        public final CustomerInfo component1() {
            return this.customerInfo;
        }

        public final Purchased copy(CustomerInfo customerInfo) {
            r.f(customerInfo, "customerInfo");
            return new Purchased(customerInfo);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Purchased) && r.b(this.customerInfo, ((Purchased) obj).customerInfo);
        }

        public final CustomerInfo getCustomerInfo() {
            return this.customerInfo;
        }

        public int hashCode() {
            return this.customerInfo.hashCode();
        }

        public String toString() {
            return "Purchased(customerInfo=" + this.customerInfo + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            r.f(parcel, "out");
            parcel.writeParcelable(this.customerInfo, i10);
        }
    }

    public static final class Restored extends PaywallResult {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Restored> CREATOR = new Creator();
        private final CustomerInfo customerInfo;

        public static final class Creator implements Parcelable.Creator<Restored> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Restored createFromParcel(Parcel parcel) {
                r.f(parcel, "parcel");
                return new Restored((CustomerInfo) parcel.readParcelable(Restored.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Restored[] newArray(int i10) {
                return new Restored[i10];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Restored(CustomerInfo customerInfo) {
            super(null);
            r.f(customerInfo, "customerInfo");
            this.customerInfo = customerInfo;
        }

        public static /* synthetic */ Restored copy$default(Restored restored, CustomerInfo customerInfo, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                customerInfo = restored.customerInfo;
            }
            return restored.copy(customerInfo);
        }

        public final CustomerInfo component1() {
            return this.customerInfo;
        }

        public final Restored copy(CustomerInfo customerInfo) {
            r.f(customerInfo, "customerInfo");
            return new Restored(customerInfo);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Restored) && r.b(this.customerInfo, ((Restored) obj).customerInfo);
        }

        public final CustomerInfo getCustomerInfo() {
            return this.customerInfo;
        }

        public int hashCode() {
            return this.customerInfo.hashCode();
        }

        public String toString() {
            return "Restored(customerInfo=" + this.customerInfo + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            r.f(parcel, "out");
            parcel.writeParcelable(this.customerInfo, i10);
        }
    }

    private PaywallResult() {
    }

    public /* synthetic */ PaywallResult(j jVar) {
        this();
    }
}
