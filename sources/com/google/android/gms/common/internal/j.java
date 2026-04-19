package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class j implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = x8.b.K(parcel);
        IBinder iBinderC = null;
        t8.b bVar = null;
        int iD = 0;
        boolean zW = false;
        boolean zW2 = false;
        while (parcel.dataPosition() < iK) {
            int iB = x8.b.B(parcel);
            int iV = x8.b.v(iB);
            if (iV == 1) {
                iD = x8.b.D(parcel, iB);
            } else if (iV == 2) {
                iBinderC = x8.b.C(parcel, iB);
            } else if (iV == 3) {
                bVar = (t8.b) x8.b.o(parcel, iB, t8.b.CREATOR);
            } else if (iV == 4) {
                zW = x8.b.w(parcel, iB);
            } else if (iV != 5) {
                x8.b.J(parcel, iB);
            } else {
                zW2 = x8.b.w(parcel, iB);
            }
        }
        x8.b.u(parcel, iK);
        return new i(iD, iBinderC, bVar, zW, zW2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new i[i10];
    }
}
