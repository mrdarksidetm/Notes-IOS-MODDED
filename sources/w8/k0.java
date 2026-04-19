package w8;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* JADX INFO: loaded from: classes.dex */
public final class k0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = x8.b.K(parcel);
        int iD = 0;
        Account account = null;
        GoogleSignInAccount googleSignInAccount = null;
        int iD2 = 0;
        while (parcel.dataPosition() < iK) {
            int iB = x8.b.B(parcel);
            int iV = x8.b.v(iB);
            if (iV == 1) {
                iD = x8.b.D(parcel, iB);
            } else if (iV == 2) {
                account = (Account) x8.b.o(parcel, iB, Account.CREATOR);
            } else if (iV == 3) {
                iD2 = x8.b.D(parcel, iB);
            } else if (iV != 4) {
                x8.b.J(parcel, iB);
            } else {
                googleSignInAccount = (GoogleSignInAccount) x8.b.o(parcel, iB, GoogleSignInAccount.CREATOR);
            }
        }
        x8.b.u(parcel, iK);
        return new j0(iD, account, iD2, googleSignInAccount);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new j0[i10];
    }
}
