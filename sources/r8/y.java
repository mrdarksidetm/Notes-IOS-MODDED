package r8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class y implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = x8.b.K(parcel);
        String strP = null;
        GoogleSignInOptions googleSignInOptions = null;
        while (parcel.dataPosition() < iK) {
            int iB = x8.b.B(parcel);
            int iV = x8.b.v(iB);
            if (iV == 2) {
                strP = x8.b.p(parcel, iB);
            } else if (iV != 5) {
                x8.b.J(parcel, iB);
            } else {
                googleSignInOptions = (GoogleSignInOptions) x8.b.o(parcel, iB, GoogleSignInOptions.CREATOR);
            }
        }
        x8.b.u(parcel, iK);
        return new SignInConfiguration(strP, googleSignInOptions);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new SignInConfiguration[i10];
    }
}
