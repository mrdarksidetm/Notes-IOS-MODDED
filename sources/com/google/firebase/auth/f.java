package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.b;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements Parcelable.Creator<b.a> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ b.a createFromParcel(Parcel parcel) {
        int iK = x8.b.K(parcel);
        while (parcel.dataPosition() < iK) {
            int iB = x8.b.B(parcel);
            x8.b.v(iB);
            x8.b.J(parcel, iB);
        }
        x8.b.u(parcel, iK);
        return new b.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ b.a[] newArray(int i10) {
        return new b.a[i10];
    }
}
