package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class i implements Parcelable.Creator<LocationResult> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationResult createFromParcel(Parcel parcel) {
        int iK = x8.b.K(parcel);
        List<Location> listT = LocationResult.f8715b;
        while (parcel.dataPosition() < iK) {
            int iB = x8.b.B(parcel);
            if (x8.b.v(iB) != 1) {
                x8.b.J(parcel, iB);
            } else {
                listT = x8.b.t(parcel, iB, Location.CREATOR);
            }
        }
        x8.b.u(parcel, iK);
        return new LocationResult(listT);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationResult[] newArray(int i10) {
        return new LocationResult[i10];
    }
}
