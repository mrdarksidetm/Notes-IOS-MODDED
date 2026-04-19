package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = x8.b.K(parcel);
        int iD = 0;
        boolean zW = false;
        boolean zW2 = false;
        boolean zW3 = false;
        ArrayList arrayListT = null;
        Account account = null;
        String strP = null;
        String strP2 = null;
        ArrayList arrayListT2 = null;
        String strP3 = null;
        while (parcel.dataPosition() < iK) {
            int iB = x8.b.B(parcel);
            switch (x8.b.v(iB)) {
                case 1:
                    iD = x8.b.D(parcel, iB);
                    break;
                case 2:
                    arrayListT = x8.b.t(parcel, iB, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) x8.b.o(parcel, iB, Account.CREATOR);
                    break;
                case 4:
                    zW = x8.b.w(parcel, iB);
                    break;
                case 5:
                    zW2 = x8.b.w(parcel, iB);
                    break;
                case 6:
                    zW3 = x8.b.w(parcel, iB);
                    break;
                case 7:
                    strP = x8.b.p(parcel, iB);
                    break;
                case 8:
                    strP2 = x8.b.p(parcel, iB);
                    break;
                case 9:
                    arrayListT2 = x8.b.t(parcel, iB, r8.a.CREATOR);
                    break;
                case 10:
                    strP3 = x8.b.p(parcel, iB);
                    break;
                default:
                    x8.b.J(parcel, iB);
                    break;
            }
        }
        x8.b.u(parcel, iK);
        return new GoogleSignInOptions(iD, arrayListT, account, zW, zW2, zW3, strP, strP2, arrayListT2, strP3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new GoogleSignInOptions[i10];
    }
}
