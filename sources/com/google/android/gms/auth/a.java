package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = x8.b.K(parcel);
        int iD = 0;
        boolean zW = false;
        boolean zW2 = false;
        String strP = null;
        Long lG = null;
        ArrayList<String> arrayListR = null;
        String strP2 = null;
        while (parcel.dataPosition() < iK) {
            int iB = x8.b.B(parcel);
            switch (x8.b.v(iB)) {
                case 1:
                    iD = x8.b.D(parcel, iB);
                    break;
                case 2:
                    strP = x8.b.p(parcel, iB);
                    break;
                case 3:
                    lG = x8.b.G(parcel, iB);
                    break;
                case 4:
                    zW = x8.b.w(parcel, iB);
                    break;
                case 5:
                    zW2 = x8.b.w(parcel, iB);
                    break;
                case 6:
                    arrayListR = x8.b.r(parcel, iB);
                    break;
                case 7:
                    strP2 = x8.b.p(parcel, iB);
                    break;
                default:
                    x8.b.J(parcel, iB);
                    break;
            }
        }
        x8.b.u(parcel, iK);
        return new TokenData(iD, strP, lG, zW, zW2, arrayListR, strP2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new TokenData[i10];
    }
}
