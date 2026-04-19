package l9;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class v1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = x8.b.K(parcel);
        String strP = null;
        Boolean boolX = null;
        String strP2 = null;
        String strP3 = null;
        while (parcel.dataPosition() < iK) {
            int iB = x8.b.B(parcel);
            int iV = x8.b.v(iB);
            if (iV == 2) {
                strP = x8.b.p(parcel, iB);
            } else if (iV == 3) {
                boolX = x8.b.x(parcel, iB);
            } else if (iV == 4) {
                strP2 = x8.b.p(parcel, iB);
            } else if (iV != 5) {
                x8.b.J(parcel, iB);
            } else {
                strP3 = x8.b.p(parcel, iB);
            }
        }
        x8.b.u(parcel, iK);
        return new k(strP, boolX, strP2, strP3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new k[i10];
    }
}
