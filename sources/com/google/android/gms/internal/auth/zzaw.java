package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import x8.b;

/* JADX INFO: loaded from: classes.dex */
public final class zzaw implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = b.K(parcel);
        int iD = 0;
        String strP = null;
        int iD2 = 0;
        while (parcel.dataPosition() < iK) {
            int iB = b.B(parcel);
            int iV = b.v(iB);
            if (iV == 1) {
                iD = b.D(parcel, iB);
            } else if (iV == 2) {
                strP = b.p(parcel, iB);
            } else if (iV != 3) {
                b.J(parcel, iB);
            } else {
                iD2 = b.D(parcel, iB);
            }
        }
        b.u(parcel, iK);
        return new zzav(iD, strP, iD2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzav[i10];
    }
}
