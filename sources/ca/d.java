package ca;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements Parcelable.Creator<c2> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ c2 createFromParcel(Parcel parcel) {
        int iK = x8.b.K(parcel);
        g gVar = null;
        a2 a2Var = null;
        ba.x1 x1Var = null;
        while (parcel.dataPosition() < iK) {
            int iB = x8.b.B(parcel);
            int iV = x8.b.v(iB);
            if (iV == 1) {
                gVar = (g) x8.b.o(parcel, iB, g.CREATOR);
            } else if (iV == 2) {
                a2Var = (a2) x8.b.o(parcel, iB, a2.CREATOR);
            } else if (iV != 3) {
                x8.b.J(parcel, iB);
            } else {
                x1Var = (ba.x1) x8.b.o(parcel, iB, ba.x1.CREATOR);
            }
        }
        x8.b.u(parcel, iK);
        return new c2(gVar, a2Var, x1Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ c2[] newArray(int i10) {
        return new c2[i10];
    }
}
