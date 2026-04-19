package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Parcelable.Creator<LocationRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationRequest createFromParcel(Parcel parcel) {
        int iK = x8.b.K(parcel);
        boolean zW = false;
        boolean zW2 = false;
        int iD = 102;
        long jF = 3600000;
        long jF2 = 600000;
        long jF3 = Long.MAX_VALUE;
        int iD2 = Integer.MAX_VALUE;
        float fA = 0.0f;
        long jF4 = 0;
        while (parcel.dataPosition() < iK) {
            int iB = x8.b.B(parcel);
            switch (x8.b.v(iB)) {
                case 1:
                    iD = x8.b.D(parcel, iB);
                    break;
                case 2:
                    jF = x8.b.F(parcel, iB);
                    break;
                case 3:
                    jF2 = x8.b.F(parcel, iB);
                    break;
                case 4:
                    zW = x8.b.w(parcel, iB);
                    break;
                case 5:
                    jF3 = x8.b.F(parcel, iB);
                    break;
                case 6:
                    iD2 = x8.b.D(parcel, iB);
                    break;
                case 7:
                    fA = x8.b.A(parcel, iB);
                    break;
                case 8:
                    jF4 = x8.b.F(parcel, iB);
                    break;
                case 9:
                    zW2 = x8.b.w(parcel, iB);
                    break;
                default:
                    x8.b.J(parcel, iB);
                    break;
            }
        }
        x8.b.u(parcel, iK);
        return new LocationRequest(iD, jF, jF2, zW, jF3, iD2, fA, jF4, zW2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationRequest[] newArray(int i10) {
        return new LocationRequest[i10];
    }
}
