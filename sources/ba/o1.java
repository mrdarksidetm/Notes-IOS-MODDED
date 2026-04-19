package ba;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class o1 implements Parcelable.Creator<o0> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ o0 createFromParcel(Parcel parcel) {
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
            } else if (iV == 4) {
                strP3 = x8.b.p(parcel, iB);
            } else if (iV == 5) {
                zW = x8.b.w(parcel, iB);
            } else if (iV != 6) {
                x8.b.J(parcel, iB);
            } else {
                strP4 = x8.b.p(parcel, iB);
            }
        }
        x8.b.u(parcel, iK);
        return new o0(strP, strP2, strP3, zW, strP4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ o0[] newArray(int i10) {
        return new o0[i10];
    }
}
