package com.google.android.gms.common.data;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import x8.b;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = b.K(parcel);
        int iD = 0;
        ParcelFileDescriptor parcelFileDescriptor = null;
        int iD2 = 0;
        while (parcel.dataPosition() < iK) {
            int iB = b.B(parcel);
            int iV = b.v(iB);
            if (iV == 1) {
                iD = b.D(parcel, iB);
            } else if (iV == 2) {
                parcelFileDescriptor = (ParcelFileDescriptor) b.o(parcel, iB, ParcelFileDescriptor.CREATOR);
            } else if (iV != 3) {
                b.J(parcel, iB);
            } else {
                iD2 = b.D(parcel, iB);
            }
        }
        b.u(parcel, iK);
        return new BitmapTeleporter(iD, parcelFileDescriptor, iD2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new BitmapTeleporter[i10];
    }
}
