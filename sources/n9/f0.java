package n9;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class f0 implements Parcelable.Creator<e0> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ e0 createFromParcel(Parcel parcel) {
        int iK = x8.b.K(parcel);
        long jF = -1;
        long jF2 = -1;
        int iD = 1;
        int iD2 = 1;
        while (parcel.dataPosition() < iK) {
            int iB = x8.b.B(parcel);
            int iV = x8.b.v(iB);
            if (iV == 1) {
                iD = x8.b.D(parcel, iB);
            } else if (iV == 2) {
                iD2 = x8.b.D(parcel, iB);
            } else if (iV == 3) {
                jF = x8.b.F(parcel, iB);
            } else if (iV != 4) {
                x8.b.J(parcel, iB);
            } else {
                jF2 = x8.b.F(parcel, iB);
            }
        }
        x8.b.u(parcel, iK);
        return new e0(iD, iD2, jF, jF2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ e0[] newArray(int i10) {
        return new e0[i10];
    }
}
