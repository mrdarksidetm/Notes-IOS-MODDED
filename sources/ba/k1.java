package ba;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class k1 implements Parcelable.Creator<f0> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ f0 createFromParcel(Parcel parcel) {
        int iK = x8.b.K(parcel);
        String strP = null;
        String strP2 = null;
        while (parcel.dataPosition() < iK) {
            int iB = x8.b.B(parcel);
            int iV = x8.b.v(iB);
            if (iV == 1) {
                strP = x8.b.p(parcel, iB);
            } else if (iV != 2) {
                x8.b.J(parcel, iB);
            } else {
                strP2 = x8.b.p(parcel, iB);
            }
        }
        x8.b.u(parcel, iK);
        return new f0(strP, strP2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ f0[] newArray(int i10) {
        return new f0[i10];
    }
}
