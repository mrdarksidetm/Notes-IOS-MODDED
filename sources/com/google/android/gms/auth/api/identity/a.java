package com.google.android.gms.auth.api.identity;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = x8.b.K(parcel);
        boolean zW = false;
        boolean zW2 = false;
        boolean zW3 = false;
        ArrayList arrayListT = null;
        String strP = null;
        Account account = null;
        String strP2 = null;
        String strP3 = null;
        while (parcel.dataPosition() < iK) {
            int iB = x8.b.B(parcel);
            switch (x8.b.v(iB)) {
                case 1:
                    arrayListT = x8.b.t(parcel, iB, Scope.CREATOR);
                    break;
                case 2:
                    strP = x8.b.p(parcel, iB);
                    break;
                case 3:
                    zW = x8.b.w(parcel, iB);
                    break;
                case 4:
                    zW2 = x8.b.w(parcel, iB);
                    break;
                case 5:
                    account = (Account) x8.b.o(parcel, iB, Account.CREATOR);
                    break;
                case 6:
                    strP2 = x8.b.p(parcel, iB);
                    break;
                case 7:
                    strP3 = x8.b.p(parcel, iB);
                    break;
                case 8:
                    zW3 = x8.b.w(parcel, iB);
                    break;
                default:
                    x8.b.J(parcel, iB);
                    break;
            }
        }
        x8.b.u(parcel, iK);
        return new AuthorizationRequest(arrayListT, strP, zW, zW2, account, strP2, strP3, zW3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new AuthorizationRequest[i10];
    }
}
