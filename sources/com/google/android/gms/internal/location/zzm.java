package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import x8.b;

/* JADX INFO: loaded from: classes.dex */
public final class zzm implements Parcelable.Creator<zzl> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzl createFromParcel(Parcel parcel) {
        int iK = b.K(parcel);
        zzj zzjVar = null;
        int iD = 1;
        IBinder iBinderC = null;
        IBinder iBinderC2 = null;
        while (parcel.dataPosition() < iK) {
            int iB = b.B(parcel);
            int iV = b.v(iB);
            if (iV == 1) {
                iD = b.D(parcel, iB);
            } else if (iV == 2) {
                zzjVar = (zzj) b.o(parcel, iB, zzj.CREATOR);
            } else if (iV == 3) {
                iBinderC = b.C(parcel, iB);
            } else if (iV != 4) {
                b.J(parcel, iB);
            } else {
                iBinderC2 = b.C(parcel, iB);
            }
        }
        b.u(parcel, iK);
        return new zzl(iD, zzjVar, iBinderC, iBinderC2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzl[] newArray(int i10) {
        return new zzl[i10];
    }
}
