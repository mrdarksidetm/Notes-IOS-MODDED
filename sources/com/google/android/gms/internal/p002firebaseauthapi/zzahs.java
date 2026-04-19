package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import x8.b;

/* JADX INFO: loaded from: classes.dex */
public final class zzahs implements Parcelable.Creator<zzahp> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzahp createFromParcel(Parcel parcel) {
        int iK = b.K(parcel);
        while (parcel.dataPosition() < iK) {
            int iB = b.B(parcel);
            b.v(iB);
            b.J(parcel, iB);
        }
        b.u(parcel, iK);
        return new zzahp();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzahp[] newArray(int i10) {
        return new zzahp[i10];
    }
}
