package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import n9.e0;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Parcelable.Creator<LocationAvailability> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationAvailability createFromParcel(Parcel parcel) {
        int iK = x8.b.K(parcel);
        int iD = 1;
        int iD2 = 1;
        int iD3 = 1000;
        long jF = 0;
        e0[] e0VarArr = null;
        while (parcel.dataPosition() < iK) {
            int iB = x8.b.B(parcel);
            int iV = x8.b.v(iB);
            if (iV == 1) {
                iD = x8.b.D(parcel, iB);
            } else if (iV == 2) {
                iD2 = x8.b.D(parcel, iB);
            } else if (iV == 3) {
                jF = x8.b.F(parcel, iB);
            } else if (iV == 4) {
                iD3 = x8.b.D(parcel, iB);
            } else if (iV != 5) {
                x8.b.J(parcel, iB);
            } else {
                e0VarArr = (e0[]) x8.b.s(parcel, iB, e0.CREATOR);
            }
        }
        x8.b.u(parcel, iK);
        return new LocationAvailability(iD3, iD, iD2, jF, e0VarArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationAvailability[] newArray(int i10) {
        return new LocationAvailability[i10];
    }
}
