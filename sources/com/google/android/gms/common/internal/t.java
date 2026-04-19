package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class t implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = x8.b.K(parcel);
        Bundle bundleF = null;
        w8.d dVar = null;
        int iD = 0;
        t8.d[] dVarArr = null;
        while (parcel.dataPosition() < iK) {
            int iB = x8.b.B(parcel);
            int iV = x8.b.v(iB);
            if (iV == 1) {
                bundleF = x8.b.f(parcel, iB);
            } else if (iV == 2) {
                dVarArr = (t8.d[]) x8.b.s(parcel, iB, t8.d.CREATOR);
            } else if (iV == 3) {
                iD = x8.b.D(parcel, iB);
            } else if (iV != 4) {
                x8.b.J(parcel, iB);
            } else {
                dVar = (w8.d) x8.b.o(parcel, iB, w8.d.CREATOR);
            }
        }
        x8.b.u(parcel, iK);
        return new s(bundleF, dVarArr, iD, dVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new s[i10];
    }
}
