package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import x8.b;

/* JADX INFO: loaded from: classes.dex */
public final class zzago implements Parcelable.Creator<zzagl> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzagl createFromParcel(Parcel parcel) {
        int iK = b.K(parcel);
        String strP = null;
        String strP2 = null;
        Long lG = null;
        String strP3 = null;
        Long lG2 = null;
        while (parcel.dataPosition() < iK) {
            int iB = b.B(parcel);
            int iV = b.v(iB);
            if (iV == 2) {
                strP = b.p(parcel, iB);
            } else if (iV == 3) {
                strP2 = b.p(parcel, iB);
            } else if (iV == 4) {
                lG = b.G(parcel, iB);
            } else if (iV == 5) {
                strP3 = b.p(parcel, iB);
            } else if (iV != 6) {
                b.J(parcel, iB);
            } else {
                lG2 = b.G(parcel, iB);
            }
        }
        b.u(parcel, iK);
        return new zzagl(strP, strP2, lG, strP3, lG2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzagl[] newArray(int i10) {
        return new zzagl[i10];
    }
}
