package ba;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzahp;

/* JADX INFO: loaded from: classes2.dex */
public final class s1 implements Parcelable.Creator<x0> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ x0 createFromParcel(Parcel parcel) {
        int iK = x8.b.K(parcel);
        String strP = null;
        String strP2 = null;
        zzahp zzahpVar = null;
        long jF = 0;
        while (parcel.dataPosition() < iK) {
            int iB = x8.b.B(parcel);
            int iV = x8.b.v(iB);
            if (iV == 1) {
                strP = x8.b.p(parcel, iB);
            } else if (iV == 2) {
                strP2 = x8.b.p(parcel, iB);
            } else if (iV == 3) {
                jF = x8.b.F(parcel, iB);
            } else if (iV != 4) {
                x8.b.J(parcel, iB);
            } else {
                zzahpVar = (zzahp) x8.b.o(parcel, iB, zzahp.CREATOR);
            }
        }
        x8.b.u(parcel, iK);
        return new x0(strP, strP2, jF, zzahpVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ x0[] newArray(int i10) {
        return new x0[i10];
    }
}
