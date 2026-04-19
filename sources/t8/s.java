package t8;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class s implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = x8.b.K(parcel);
        long jF = -1;
        int iD = 0;
        String strP = null;
        while (parcel.dataPosition() < iK) {
            int iB = x8.b.B(parcel);
            int iV = x8.b.v(iB);
            if (iV == 1) {
                strP = x8.b.p(parcel, iB);
            } else if (iV == 2) {
                iD = x8.b.D(parcel, iB);
            } else if (iV != 3) {
                x8.b.J(parcel, iB);
            } else {
                jF = x8.b.F(parcel, iB);
            }
        }
        x8.b.u(parcel, iK);
        return new d(strP, iD, jF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new d[i10];
    }
}
