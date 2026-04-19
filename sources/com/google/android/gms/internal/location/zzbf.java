package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import x8.b;

/* JADX INFO: loaded from: classes.dex */
public final class zzbf implements Parcelable.Creator<zzbe> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzbe createFromParcel(Parcel parcel) {
        int iK = b.K(parcel);
        double dY = 0.0d;
        double dY2 = 0.0d;
        int iD = 0;
        short sH = 0;
        int iD2 = 0;
        String strP = null;
        float fA = 0.0f;
        long jF = 0;
        int iD3 = -1;
        while (parcel.dataPosition() < iK) {
            int iB = b.B(parcel);
            switch (b.v(iB)) {
                case 1:
                    strP = b.p(parcel, iB);
                    break;
                case 2:
                    jF = b.F(parcel, iB);
                    break;
                case 3:
                    sH = b.H(parcel, iB);
                    break;
                case 4:
                    dY = b.y(parcel, iB);
                    break;
                case 5:
                    dY2 = b.y(parcel, iB);
                    break;
                case 6:
                    fA = b.A(parcel, iB);
                    break;
                case 7:
                    iD = b.D(parcel, iB);
                    break;
                case 8:
                    iD2 = b.D(parcel, iB);
                    break;
                case 9:
                    iD3 = b.D(parcel, iB);
                    break;
                default:
                    b.J(parcel, iB);
                    break;
            }
        }
        b.u(parcel, iK);
        return new zzbe(strP, iD, sH, dY, dY2, fA, jF, iD2, iD3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzbe[] newArray(int i10) {
        return new zzbe[i10];
    }
}
