package ca;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class q implements Parcelable.Creator<r> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ r createFromParcel(Parcel parcel) {
        int iK = x8.b.K(parcel);
        String strP = null;
        String strP2 = null;
        ArrayList arrayListT = null;
        ArrayList arrayListT2 = null;
        g gVar = null;
        while (parcel.dataPosition() < iK) {
            int iB = x8.b.B(parcel);
            int iV = x8.b.v(iB);
            if (iV == 1) {
                strP = x8.b.p(parcel, iB);
            } else if (iV == 2) {
                strP2 = x8.b.p(parcel, iB);
            } else if (iV == 3) {
                arrayListT = x8.b.t(parcel, iB, ba.r0.CREATOR);
            } else if (iV == 4) {
                arrayListT2 = x8.b.t(parcel, iB, ba.x0.CREATOR);
            } else if (iV != 5) {
                x8.b.J(parcel, iB);
            } else {
                gVar = (g) x8.b.o(parcel, iB, g.CREATOR);
            }
        }
        x8.b.u(parcel, iK);
        return new r(strP, strP2, arrayListT, arrayListT2, gVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ r[] newArray(int i10) {
        return new r[i10];
    }
}
