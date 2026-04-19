package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import x8.b;

/* JADX INFO: loaded from: classes.dex */
public final class zzba implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = b.K(parcel);
        String strP = null;
        int iD = 0;
        byte[] bArrG = null;
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
                bArrG = b.g(parcel, iB);
            }
        }
        b.u(parcel, iK);
        return new zzaz(iD, strP, bArrG);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzaz[i10];
    }
}
