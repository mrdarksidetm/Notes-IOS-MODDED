package ba;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class q1 implements Parcelable.Creator<r0> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ r0 createFromParcel(Parcel parcel) {
        int iK = x8.b.K(parcel);
        String strP = null;
        String strP2 = null;
        String strP3 = null;
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
                strP3 = x8.b.p(parcel, iB);
            }
        }
        x8.b.u(parcel, iK);
        return new r0(strP, strP2, jF, strP3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ r0[] newArray(int i10) {
        return new r0[i10];
    }
}
