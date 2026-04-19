package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = x8.b.K(parcel);
        String strP = "";
        GoogleSignInAccount googleSignInAccount = null;
        String strP2 = "";
        while (parcel.dataPosition() < iK) {
            int iB = x8.b.B(parcel);
            int iV = x8.b.v(iB);
            if (iV == 4) {
                strP = x8.b.p(parcel, iB);
            } else if (iV == 7) {
                googleSignInAccount = (GoogleSignInAccount) x8.b.o(parcel, iB, GoogleSignInAccount.CREATOR);
            } else if (iV != 8) {
                x8.b.J(parcel, iB);
            } else {
                strP2 = x8.b.p(parcel, iB);
            }
        }
        x8.b.u(parcel, iK);
        return new SignInAccount(strP, googleSignInAccount, strP2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new SignInAccount[i10];
    }
}
