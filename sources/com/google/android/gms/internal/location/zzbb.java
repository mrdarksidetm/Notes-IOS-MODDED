package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.List;
import x8.b;

/* JADX INFO: loaded from: classes.dex */
public final class zzbb implements Parcelable.Creator<zzba> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzba createFromParcel(Parcel parcel) {
        int iK = b.K(parcel);
        List<w8.b> listT = zzba.zza;
        LocationRequest locationRequest = null;
        String strP = null;
        String strP2 = null;
        String strP3 = null;
        boolean zW = false;
        boolean zW2 = false;
        boolean zW3 = false;
        boolean zW4 = false;
        boolean zW5 = false;
        long jF = Long.MAX_VALUE;
        while (parcel.dataPosition() < iK) {
            int iB = b.B(parcel);
            int iV = b.v(iB);
            if (iV != 1) {
                switch (iV) {
                    case 5:
                        listT = b.t(parcel, iB, w8.b.CREATOR);
                        break;
                    case 6:
                        strP = b.p(parcel, iB);
                        break;
                    case 7:
                        zW = b.w(parcel, iB);
                        break;
                    case 8:
                        zW2 = b.w(parcel, iB);
                        break;
                    case 9:
                        zW3 = b.w(parcel, iB);
                        break;
                    case 10:
                        strP2 = b.p(parcel, iB);
                        break;
                    case 11:
                        zW4 = b.w(parcel, iB);
                        break;
                    case 12:
                        zW5 = b.w(parcel, iB);
                        break;
                    case 13:
                        strP3 = b.p(parcel, iB);
                        break;
                    case 14:
                        jF = b.F(parcel, iB);
                        break;
                    default:
                        b.J(parcel, iB);
                        break;
                }
            } else {
                locationRequest = (LocationRequest) b.o(parcel, iB, LocationRequest.CREATOR);
            }
        }
        b.u(parcel, iK);
        return new zzba(locationRequest, listT, strP, zW, zW2, zW3, strP2, zW4, zW5, strP3, jF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzba[] newArray(int i10) {
        return new zzba[i10];
    }
}
