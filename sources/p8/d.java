package p8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = x8.b.K(parcel);
        int iD = 0;
        int iD2 = 0;
        String strP = null;
        byte[] bArrG = null;
        Bundle bundleF = null;
        long jF = 0;
        while (parcel.dataPosition() < iK) {
            int iB = x8.b.B(parcel);
            int iV = x8.b.v(iB);
            if (iV == 1) {
                strP = x8.b.p(parcel, iB);
            } else if (iV == 2) {
                iD2 = x8.b.D(parcel, iB);
            } else if (iV == 3) {
                jF = x8.b.F(parcel, iB);
            } else if (iV == 4) {
                bArrG = x8.b.g(parcel, iB);
            } else if (iV == 5) {
                bundleF = x8.b.f(parcel, iB);
            } else if (iV != 1000) {
                x8.b.J(parcel, iB);
            } else {
                iD = x8.b.D(parcel, iB);
            }
        }
        x8.b.u(parcel, iK);
        return new b(iD, strP, iD2, jF, bArrG, bundleF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new b[i10];
    }
}
