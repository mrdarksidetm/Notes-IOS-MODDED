package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import x8.b;

/* JADX INFO: loaded from: classes.dex */
public final class zzbd implements Parcelable.Creator<zzbc> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzbc createFromParcel(Parcel parcel) {
        int iK = b.K(parcel);
        zzba zzbaVar = null;
        IBinder iBinderC = null;
        PendingIntent pendingIntent = null;
        IBinder iBinderC2 = null;
        IBinder iBinderC3 = null;
        int iD = 1;
        while (parcel.dataPosition() < iK) {
            int iB = b.B(parcel);
            switch (b.v(iB)) {
                case 1:
                    iD = b.D(parcel, iB);
                    break;
                case 2:
                    zzbaVar = (zzba) b.o(parcel, iB, zzba.CREATOR);
                    break;
                case 3:
                    iBinderC = b.C(parcel, iB);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) b.o(parcel, iB, PendingIntent.CREATOR);
                    break;
                case 5:
                    iBinderC2 = b.C(parcel, iB);
                    break;
                case 6:
                    iBinderC3 = b.C(parcel, iB);
                    break;
                default:
                    b.J(parcel, iB);
                    break;
            }
        }
        b.u(parcel, iK);
        return new zzbc(iD, zzbaVar, iBinderC, pendingIntent, iBinderC2, iBinderC3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzbc[] newArray(int i10) {
        return new zzbc[i10];
    }
}
