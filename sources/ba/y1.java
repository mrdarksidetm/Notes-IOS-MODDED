package ba;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class y1 implements Parcelable.Creator<j> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ j createFromParcel(Parcel parcel) {
        int iK = x8.b.K(parcel);
        String strP = null;
        String strP2 = null;
        String strP3 = null;
        String strP4 = null;
        boolean zW = false;
        while (parcel.dataPosition() < iK) {
            int iB = x8.b.B(parcel);
            int iV = x8.b.v(iB);
            if (iV == 1) {
                strP = x8.b.p(parcel, iB);
            } else if (iV == 2) {
                strP2 = x8.b.p(parcel, iB);
            } else if (iV == 3) {
                strP3 = x8.b.p(parcel, iB);
            } else if (iV == 4) {
                strP4 = x8.b.p(parcel, iB);
            } else if (iV != 5) {
                x8.b.J(parcel, iB);
            } else {
                zW = x8.b.w(parcel, iB);
            }
        }
        x8.b.u(parcel, iK);
        return new j(strP, strP2, strP3, strP4, zW);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ j[] newArray(int i10) {
        return new j[i10];
    }
}
