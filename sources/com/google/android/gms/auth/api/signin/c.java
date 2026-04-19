package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = x8.b.K(parcel);
        String strP = null;
        String strP2 = null;
        String strP3 = null;
        String strP4 = null;
        Uri uri = null;
        String strP5 = null;
        String strP6 = null;
        ArrayList arrayListT = null;
        String strP7 = null;
        String strP8 = null;
        long jF = 0;
        int iD = 0;
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
                    strP2 = x8.b.p(parcel, iB);
                    break;
                case 4:
                    strP3 = x8.b.p(parcel, iB);
                    break;
                case 5:
                    strP4 = x8.b.p(parcel, iB);
                    break;
                case 6:
                    uri = (Uri) x8.b.o(parcel, iB, Uri.CREATOR);
                    break;
                case 7:
                    strP5 = x8.b.p(parcel, iB);
                    break;
                case 8:
                    jF = x8.b.F(parcel, iB);
                    break;
                case 9:
                    strP6 = x8.b.p(parcel, iB);
                    break;
                case 10:
                    arrayListT = x8.b.t(parcel, iB, Scope.CREATOR);
                    break;
                case 11:
                    strP7 = x8.b.p(parcel, iB);
                    break;
                case 12:
                    strP8 = x8.b.p(parcel, iB);
                    break;
                default:
                    x8.b.J(parcel, iB);
                    break;
            }
        }
        x8.b.u(parcel, iK);
        return new GoogleSignInAccount(iD, strP, strP2, strP3, strP4, uri, strP5, jF, strP6, arrayListT, strP7, strP8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new GoogleSignInAccount[i10];
    }
}
