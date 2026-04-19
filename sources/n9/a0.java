package n9;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class a0 implements Parcelable.Creator<z> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ z createFromParcel(Parcel parcel) {
        int iK = x8.b.K(parcel);
        String strP = "";
        String strP2 = "";
        String strP3 = strP2;
        while (parcel.dataPosition() < iK) {
            int iB = x8.b.B(parcel);
            int iV = x8.b.v(iB);
            if (iV == 1) {
                strP2 = x8.b.p(parcel, iB);
            } else if (iV == 2) {
                strP3 = x8.b.p(parcel, iB);
            } else if (iV != 5) {
                x8.b.J(parcel, iB);
            } else {
                strP = x8.b.p(parcel, iB);
            }
        }
        x8.b.u(parcel, iK);
        return new z(strP, strP2, strP3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ z[] newArray(int i10) {
        return new z[i10];
    }
}
