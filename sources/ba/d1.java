package ba;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class d1 implements Parcelable.Creator<e> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ e createFromParcel(Parcel parcel) {
        int iK = x8.b.K(parcel);
        boolean zW = false;
        boolean zW2 = false;
        int iD = 0;
        String strP = null;
        String strP2 = null;
        String strP3 = null;
        String strP4 = null;
        String strP5 = null;
        String strP6 = null;
        String strP7 = null;
        String strP8 = null;
        while (parcel.dataPosition() < iK) {
            int iB = x8.b.B(parcel);
            switch (x8.b.v(iB)) {
                case 1:
                    strP = x8.b.p(parcel, iB);
                    break;
                case 2:
                    strP2 = x8.b.p(parcel, iB);
                    break;
                case 3:
                    strP3 = x8.b.p(parcel, iB);
                    break;
                case 4:
                    strP4 = x8.b.p(parcel, iB);
                    break;
                case 5:
                    zW = x8.b.w(parcel, iB);
                    break;
                case 6:
                    strP5 = x8.b.p(parcel, iB);
                    break;
                case 7:
                    zW2 = x8.b.w(parcel, iB);
                    break;
                case 8:
                    strP6 = x8.b.p(parcel, iB);
                    break;
                case 9:
                    iD = x8.b.D(parcel, iB);
                    break;
                case 10:
                    strP7 = x8.b.p(parcel, iB);
                    break;
                case 11:
                    strP8 = x8.b.p(parcel, iB);
                    break;
                default:
                    x8.b.J(parcel, iB);
                    break;
            }
        }
        x8.b.u(parcel, iK);
        return new e(strP, strP2, strP3, strP4, zW, strP5, zW2, strP6, iD, strP7, strP8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ e[] newArray(int i10) {
        return new e[i10];
    }
}
