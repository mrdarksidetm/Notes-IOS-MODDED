package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = x8.b.K(parcel);
        String strP = null;
        t8.b bVar = null;
        int iD = 0;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < iK) {
            int iB = x8.b.B(parcel);
            int iV = x8.b.v(iB);
            if (iV == 1) {
                iD = x8.b.D(parcel, iB);
            } else if (iV == 2) {
                strP = x8.b.p(parcel, iB);
            } else if (iV == 3) {
                pendingIntent = (PendingIntent) x8.b.o(parcel, iB, PendingIntent.CREATOR);
            } else if (iV != 4) {
                x8.b.J(parcel, iB);
            } else {
                bVar = (t8.b) x8.b.o(parcel, iB, t8.b.CREATOR);
            }
        }
        x8.b.u(parcel, iK);
        return new Status(iD, strP, pendingIntent, bVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new Status[i10];
    }
}
