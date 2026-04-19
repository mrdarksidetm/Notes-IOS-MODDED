package n9;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class k0 implements Parcelable.Creator<j0> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ j0 createFromParcel(Parcel parcel) {
        int iK = x8.b.K(parcel);
        int iD = 0;
        int iD2 = 0;
        int iD3 = 0;
        int iD4 = 0;
        while (parcel.dataPosition() < iK) {
            int iB = x8.b.B(parcel);
            int iV = x8.b.v(iB);
            if (iV == 1) {
                iD = x8.b.D(parcel, iB);
            } else if (iV == 2) {
                iD2 = x8.b.D(parcel, iB);
            } else if (iV == 3) {
                iD3 = x8.b.D(parcel, iB);
            } else if (iV != 4) {
                x8.b.J(parcel, iB);
            } else {
                iD4 = x8.b.D(parcel, iB);
            }
        }
        x8.b.u(parcel, iK);
        return new j0(iD, iD2, iD3, iD4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ j0[] newArray(int i10) {
        return new j0[i10];
    }
}
