package w8;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class e0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = x8.b.K(parcel);
        long jF = 0;
        long jF2 = 0;
        String strP = null;
        String strP2 = null;
        int iD = 0;
        int iD2 = 0;
        int iD3 = 0;
        int iD4 = 0;
        int iD5 = -1;
        while (parcel.dataPosition() < iK) {
            int iB = x8.b.B(parcel);
            switch (x8.b.v(iB)) {
                case 1:
                    iD = x8.b.D(parcel, iB);
                    break;
                case 2:
                    iD2 = x8.b.D(parcel, iB);
                    break;
                case 3:
                    iD3 = x8.b.D(parcel, iB);
                    break;
                case 4:
                    jF = x8.b.F(parcel, iB);
                    break;
                case 5:
                    jF2 = x8.b.F(parcel, iB);
                    break;
                case 6:
                    strP = x8.b.p(parcel, iB);
                    break;
                case 7:
                    strP2 = x8.b.p(parcel, iB);
                    break;
                case 8:
                    iD4 = x8.b.D(parcel, iB);
                    break;
                case 9:
                    iD5 = x8.b.D(parcel, iB);
                    break;
                default:
                    x8.b.J(parcel, iB);
                    break;
            }
        }
        x8.b.u(parcel, iK);
        return new j(iD, iD2, iD3, jF, jF2, strP, strP2, iD4, iD5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new j[i10];
    }
}
