package w8;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class q0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = x8.b.K(parcel);
        boolean zW = false;
        boolean zW2 = false;
        int iD = 0;
        o oVar = null;
        int[] iArrK = null;
        int[] iArrK2 = null;
        while (parcel.dataPosition() < iK) {
            int iB = x8.b.B(parcel);
            switch (x8.b.v(iB)) {
                case 1:
                    oVar = (o) x8.b.o(parcel, iB, o.CREATOR);
                    break;
                case 2:
                    zW = x8.b.w(parcel, iB);
                    break;
                case 3:
                    zW2 = x8.b.w(parcel, iB);
                    break;
                case 4:
                    iArrK = x8.b.k(parcel, iB);
                    break;
                case 5:
                    iD = x8.b.D(parcel, iB);
                    break;
                case 6:
                    iArrK2 = x8.b.k(parcel, iB);
                    break;
                default:
                    x8.b.J(parcel, iB);
                    break;
            }
        }
        x8.b.u(parcel, iK);
        return new d(oVar, zW, zW2, iArrK, iD, iArrK2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new d[i10];
    }
}
