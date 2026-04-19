package l9;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class u1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = x8.b.K(parcel);
        int iD = 0;
        String strP = null;
        int iD2 = 0;
        while (parcel.dataPosition() < iK) {
            int iB = x8.b.B(parcel);
            int iV = x8.b.v(iB);
            if (iV == 2) {
                iD = x8.b.D(parcel, iB);
            } else if (iV == 3) {
                strP = x8.b.p(parcel, iB);
            } else if (iV != 4) {
                x8.b.J(parcel, iB);
            } else {
                iD2 = x8.b.D(parcel, iB);
            }
        }
        x8.b.u(parcel, iK);
        return new i(iD, strP, iD2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new i[i10];
    }
}
