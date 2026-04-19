package a9;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = x8.b.K(parcel);
        Long lG = null;
        Long lG2 = null;
        int iD = 0;
        int iD2 = 0;
        int iD3 = 0;
        while (parcel.dataPosition() < iK) {
            int iB = x8.b.B(parcel);
            int iV = x8.b.v(iB);
            if (iV == 1) {
                iD = x8.b.D(parcel, iB);
            } else if (iV == 2) {
                iD2 = x8.b.D(parcel, iB);
            } else if (iV == 3) {
                lG = x8.b.G(parcel, iB);
            } else if (iV == 4) {
                lG2 = x8.b.G(parcel, iB);
            } else if (iV != 5) {
                x8.b.J(parcel, iB);
            } else {
                iD3 = x8.b.D(parcel, iB);
            }
        }
        x8.b.u(parcel, iK);
        return new h(iD, iD2, lG, lG2, iD3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new h[i10];
    }
}
