package l9;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class s1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = x8.b.K(parcel);
        byte[] bArrG = null;
        byte[] bArrG2 = null;
        byte[] bArrG3 = null;
        byte[] bArrG4 = null;
        byte[] bArrG5 = null;
        while (parcel.dataPosition() < iK) {
            int iB = x8.b.B(parcel);
            int iV = x8.b.v(iB);
            if (iV == 2) {
                bArrG = x8.b.g(parcel, iB);
            } else if (iV == 3) {
                bArrG2 = x8.b.g(parcel, iB);
            } else if (iV == 4) {
                bArrG3 = x8.b.g(parcel, iB);
            } else if (iV == 5) {
                bArrG4 = x8.b.g(parcel, iB);
            } else if (iV != 6) {
                x8.b.J(parcel, iB);
            } else {
                bArrG5 = x8.b.g(parcel, iB);
            }
        }
        x8.b.u(parcel, iK);
        return new g(bArrG, bArrG2, bArrG3, bArrG4, bArrG5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new g[i10];
    }
}
