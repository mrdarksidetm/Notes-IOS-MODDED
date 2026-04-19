package com.revenuecat.purchases.models;

import ae.j;
import ae.r;
import android.os.Parcel;
import android.os.Parcelable;
import com.revenuecat.purchases.ReplacementMode;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes2.dex */
public enum GoogleReplacementMode implements ReplacementMode {
    WITHOUT_PRORATION(3),
    WITH_TIME_PRORATION(1),
    CHARGE_FULL_PRICE(5),
    CHARGE_PRORATED_PRICE(2),
    DEFERRED(6);

    public static final CREATOR CREATOR = new CREATOR(null);
    private final int playBillingClientMode;

    public static final class CREATOR implements Parcelable.Creator<GoogleReplacementMode> {
        private CREATOR() {
        }

        public /* synthetic */ CREATOR(j jVar) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public GoogleReplacementMode createFromParcel(Parcel parcel) {
            r.f(parcel, "in");
            String string = parcel.readString();
            if (string != null) {
                return GoogleReplacementMode.valueOf(string);
            }
            return null;
        }

        public final GoogleReplacementMode fromPlayBillingClientMode(Integer num) {
            if (num == null) {
                return null;
            }
            num.intValue();
            for (GoogleReplacementMode googleReplacementMode : GoogleReplacementMode.values()) {
                if (num.intValue() == googleReplacementMode.getPlayBillingClientMode()) {
                    return googleReplacementMode;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public GoogleReplacementMode[] newArray(int i10) {
            return new GoogleReplacementMode[i10];
        }
    }

    GoogleReplacementMode(int i10) {
        this.playBillingClientMode = i10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.revenuecat.purchases.ReplacementMode
    public /* bridge */ /* synthetic */ String getName() {
        return name();
    }

    public final int getPlayBillingClientMode() {
        return this.playBillingClientMode;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        r.f(parcel, "out");
        parcel.writeString(name());
    }
}
