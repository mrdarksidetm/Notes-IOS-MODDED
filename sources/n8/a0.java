package n8;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class a0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = x8.b.K(parcel);
        m mVar = null;
        int iD = 0;
        String strP = null;
        while (parcel.dataPosition() < iK) {
            int iB = x8.b.B(parcel);
            int iV = x8.b.v(iB);
            if (iV == 1) {
                mVar = (m) x8.b.o(parcel, iB, m.CREATOR);
            } else if (iV == 2) {
                strP = x8.b.p(parcel, iB);
            } else if (iV != 3) {
                x8.b.J(parcel, iB);
            } else {
                iD = x8.b.D(parcel, iB);
            }
        }
        x8.b.u(parcel, iK);
        return new i(mVar, strP, iD);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new i[i10];
    }
}
