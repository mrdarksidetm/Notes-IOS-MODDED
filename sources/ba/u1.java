package ba;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class u1 implements Parcelable.Creator<c1> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ c1 createFromParcel(Parcel parcel) {
        int iK = x8.b.K(parcel);
        boolean zW = false;
        String strP = null;
        String strP2 = null;
        boolean zW2 = false;
        while (parcel.dataPosition() < iK) {
            int iB = x8.b.B(parcel);
            int iV = x8.b.v(iB);
            if (iV == 2) {
                strP = x8.b.p(parcel, iB);
            } else if (iV == 3) {
                strP2 = x8.b.p(parcel, iB);
            } else if (iV == 4) {
                zW = x8.b.w(parcel, iB);
            } else if (iV != 5) {
                x8.b.J(parcel, iB);
            } else {
                zW2 = x8.b.w(parcel, iB);
            }
        }
        x8.b.u(parcel, iK);
        return new c1(strP, strP2, zW, zW2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ c1[] newArray(int i10) {
        return new c1[i10];
    }
}
