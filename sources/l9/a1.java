package l9;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class a1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = x8.b.K(parcel);
        byte[] bArrG = null;
        String strP = null;
        String strP2 = null;
        String strP3 = null;
        while (parcel.dataPosition() < iK) {
            int iB = x8.b.B(parcel);
            int iV = x8.b.v(iB);
            if (iV == 2) {
                bArrG = x8.b.g(parcel, iB);
            } else if (iV == 3) {
                strP = x8.b.p(parcel, iB);
            } else if (iV == 4) {
                strP2 = x8.b.p(parcel, iB);
            } else if (iV != 5) {
                x8.b.J(parcel, iB);
            } else {
                strP3 = x8.b.p(parcel, iB);
            }
        }
        x8.b.u(parcel, iK);
        return new a0(bArrG, strP, strP2, strP3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new a0[i10];
    }
}
