package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.a;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = x8.b.K(parcel);
        String strP = null;
        int iD = 0;
        a.C0179a c0179a = null;
        while (parcel.dataPosition() < iK) {
            int iB = x8.b.B(parcel);
            int iV = x8.b.v(iB);
            if (iV == 1) {
                iD = x8.b.D(parcel, iB);
            } else if (iV == 2) {
                strP = x8.b.p(parcel, iB);
            } else if (iV != 3) {
                x8.b.J(parcel, iB);
            } else {
                c0179a = (a.C0179a) x8.b.o(parcel, iB, a.C0179a.CREATOR);
            }
        }
        x8.b.u(parcel, iK);
        return new g(iD, strP, c0179a);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new g[i10];
    }
}
