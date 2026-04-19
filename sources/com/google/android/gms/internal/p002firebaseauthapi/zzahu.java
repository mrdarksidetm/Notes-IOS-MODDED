package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import x8.b;

/* JADX INFO: loaded from: classes.dex */
public final class zzahu implements Parcelable.Creator<zzahr> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzahr createFromParcel(Parcel parcel) {
        int iK = b.K(parcel);
        boolean zW = false;
        boolean zW2 = false;
        boolean zW3 = false;
        String strP = null;
        String strP2 = null;
        String strP3 = null;
        String strP4 = null;
        String strP5 = null;
        String strP6 = null;
        String strP7 = null;
        String strP8 = null;
        String strP9 = null;
        String strP10 = null;
        String strP11 = null;
        String strP12 = null;
        String strP13 = null;
        while (parcel.dataPosition() < iK) {
            int iB = b.B(parcel);
            switch (b.v(iB)) {
                case 2:
                    strP = b.p(parcel, iB);
                    break;
                case 3:
                    strP2 = b.p(parcel, iB);
                    break;
                case 4:
                    strP3 = b.p(parcel, iB);
                    break;
                case 5:
                    strP4 = b.p(parcel, iB);
                    break;
                case 6:
                    strP5 = b.p(parcel, iB);
                    break;
                case 7:
                    strP6 = b.p(parcel, iB);
                    break;
                case 8:
                    strP7 = b.p(parcel, iB);
                    break;
                case 9:
                    strP8 = b.p(parcel, iB);
                    break;
                case 10:
                    zW = b.w(parcel, iB);
                    break;
                case 11:
                    zW2 = b.w(parcel, iB);
                    break;
                case 12:
                    strP9 = b.p(parcel, iB);
                    break;
                case 13:
                    strP10 = b.p(parcel, iB);
                    break;
                case 14:
                    strP11 = b.p(parcel, iB);
                    break;
                case 15:
                    strP12 = b.p(parcel, iB);
                    break;
                case 16:
                    zW3 = b.w(parcel, iB);
                    break;
                case 17:
                    strP13 = b.p(parcel, iB);
                    break;
                default:
                    b.J(parcel, iB);
                    break;
            }
        }
        b.u(parcel, iK);
        return new zzahr(strP, strP2, strP3, strP4, strP5, strP6, strP7, strP8, zW, zW2, strP9, strP10, strP11, strP12, zW3, strP13);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzahr[] newArray(int i10) {
        return new zzahr[i10];
    }
}
