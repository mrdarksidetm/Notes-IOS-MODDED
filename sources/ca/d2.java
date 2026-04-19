package ca;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class d2 implements Parcelable.Creator<a2> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a2 createFromParcel(Parcel parcel) {
        int iK = x8.b.K(parcel);
        String strP = null;
        boolean zW = false;
        String strP2 = null;
        while (parcel.dataPosition() < iK) {
            int iB = x8.b.B(parcel);
            int iV = x8.b.v(iB);
            if (iV == 1) {
                strP = x8.b.p(parcel, iB);
            } else if (iV == 2) {
                strP2 = x8.b.p(parcel, iB);
            } else if (iV != 3) {
                x8.b.J(parcel, iB);
            } else {
                zW = x8.b.w(parcel, iB);
            }
        }
        x8.b.u(parcel, iK);
        return new a2(strP, strP2, zW);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a2[] newArray(int i10) {
        return new a2[i10];
    }
}
