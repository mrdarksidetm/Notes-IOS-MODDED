package ba;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class m1 implements Parcelable.Creator<n1> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ n1 createFromParcel(Parcel parcel) {
        int iK = x8.b.K(parcel);
        String strP = null;
        String strP2 = null;
        String strP3 = null;
        while (parcel.dataPosition() < iK) {
            int iB = x8.b.B(parcel);
            int iV = x8.b.v(iB);
            if (iV == 1) {
                strP = x8.b.p(parcel, iB);
            } else if (iV == 2) {
                strP2 = x8.b.p(parcel, iB);
            } else if (iV != 3) {
                x8.b.J(parcel, iB);
            } else {
                strP3 = x8.b.p(parcel, iB);
            }
        }
        x8.b.u(parcel, iK);
        return new n1(strP, strP2, strP3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ n1[] newArray(int i10) {
        return new n1[i10];
    }
}
