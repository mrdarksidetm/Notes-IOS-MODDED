package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class i implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = x8.b.K(parcel);
        ArrayList arrayListT = null;
        int iD = 0;
        String strP = null;
        while (parcel.dataPosition() < iK) {
            int iB = x8.b.B(parcel);
            int iV = x8.b.v(iB);
            if (iV == 1) {
                iD = x8.b.D(parcel, iB);
            } else if (iV == 2) {
                arrayListT = x8.b.t(parcel, iB, f.CREATOR);
            } else if (iV != 3) {
                x8.b.J(parcel, iB);
            } else {
                strP = x8.b.p(parcel, iB);
            }
        }
        x8.b.u(parcel, iK);
        return new h(iD, arrayListT, strP);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new h[i10];
    }
}
