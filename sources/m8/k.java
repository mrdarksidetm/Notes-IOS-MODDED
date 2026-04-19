package m8;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class k implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = x8.b.K(parcel);
        int iD = 0;
        boolean zW = false;
        boolean zW2 = false;
        long jF = 0;
        while (parcel.dataPosition() < iK) {
            int iB = x8.b.B(parcel);
            int iV = x8.b.v(iB);
            if (iV == 1) {
                iD = x8.b.D(parcel, iB);
            } else if (iV == 2) {
                zW = x8.b.w(parcel, iB);
            } else if (iV == 3) {
                jF = x8.b.F(parcel, iB);
            } else if (iV != 4) {
                x8.b.J(parcel, iB);
            } else {
                zW2 = x8.b.w(parcel, iB);
            }
        }
        x8.b.u(parcel, iK);
        return new a(iD, zW, jF, zW2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new a[i10];
    }
}
