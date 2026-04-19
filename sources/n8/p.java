package n8;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class p implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = x8.b.K(parcel);
        String strP = null;
        String strP2 = null;
        String strP3 = null;
        ArrayList<String> arrayListR = null;
        GoogleSignInAccount googleSignInAccount = null;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < iK) {
            int iB = x8.b.B(parcel);
            switch (x8.b.v(iB)) {
                case 1:
                    strP = x8.b.p(parcel, iB);
                    break;
                case 2:
                    strP2 = x8.b.p(parcel, iB);
                    break;
                case 3:
                    strP3 = x8.b.p(parcel, iB);
                    break;
                case 4:
                    arrayListR = x8.b.r(parcel, iB);
                    break;
                case 5:
                    googleSignInAccount = (GoogleSignInAccount) x8.b.o(parcel, iB, GoogleSignInAccount.CREATOR);
                    break;
                case 6:
                    pendingIntent = (PendingIntent) x8.b.o(parcel, iB, PendingIntent.CREATOR);
                    break;
                default:
                    x8.b.J(parcel, iB);
                    break;
            }
        }
        x8.b.u(parcel, iK);
        return new a(strP, strP2, strP3, arrayListR, googleSignInAccount, pendingIntent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new a[i10];
    }
}
