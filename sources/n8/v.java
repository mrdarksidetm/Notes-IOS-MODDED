package n8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import n8.b;

/* JADX INFO: loaded from: classes.dex */
public final class v implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = x8.b.K(parcel);
        boolean zW = false;
        boolean zW2 = false;
        boolean zW3 = false;
        String strP = null;
        String strP2 = null;
        String strP3 = null;
        ArrayList<String> arrayListR = null;
        while (parcel.dataPosition() < iK) {
            int iB = x8.b.B(parcel);
            switch (x8.b.v(iB)) {
                case 1:
                    zW = x8.b.w(parcel, iB);
                    break;
                case 2:
                    strP = x8.b.p(parcel, iB);
                    break;
                case 3:
                    strP2 = x8.b.p(parcel, iB);
                    break;
                case 4:
                    zW2 = x8.b.w(parcel, iB);
                    break;
                case 5:
                    strP3 = x8.b.p(parcel, iB);
                    break;
                case 6:
                    arrayListR = x8.b.r(parcel, iB);
                    break;
                case 7:
                    zW3 = x8.b.w(parcel, iB);
                    break;
                default:
                    x8.b.J(parcel, iB);
                    break;
            }
        }
        x8.b.u(parcel, iK);
        return new b.C0362b(zW, strP, strP2, zW2, strP3, arrayListR, zW3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new b.C0362b[i10];
    }
}
