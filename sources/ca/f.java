package ca;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements Parcelable.Creator<e2> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ e2 createFromParcel(Parcel parcel) {
        int iK = x8.b.K(parcel);
        String strP = null;
        String strP2 = null;
        String strP3 = null;
        String strP4 = null;
        String strP5 = null;
        String strP6 = null;
        String strP7 = null;
        boolean zW = false;
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
                    strP5 = x8.b.p(parcel, iB);
                    break;
                case 4:
                    strP4 = x8.b.p(parcel, iB);
                    break;
                case 5:
                    strP3 = x8.b.p(parcel, iB);
                    break;
                case 6:
                    strP6 = x8.b.p(parcel, iB);
                    break;
                case 7:
                    zW = x8.b.w(parcel, iB);
                    break;
                case 8:
                    strP7 = x8.b.p(parcel, iB);
                    break;
                default:
                    x8.b.J(parcel, iB);
                    break;
            }
        }
        x8.b.u(parcel, iK);
        return new e2(strP, strP2, strP3, strP4, strP5, strP6, zW, strP7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ e2[] newArray(int i10) {
        return new e2[i10];
    }
}
