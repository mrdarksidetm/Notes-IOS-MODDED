package m8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = x8.b.K(parcel);
        ArrayList<String> arrayListR = null;
        ArrayList<String> arrayListR2 = null;
        ArrayList<String> arrayListR3 = null;
        ArrayList<String> arrayListR4 = null;
        ArrayList<String> arrayListR5 = null;
        int iD = 0;
        while (parcel.dataPosition() < iK) {
            int iB = x8.b.B(parcel);
            switch (x8.b.v(iB)) {
                case 1:
                    iD = x8.b.D(parcel, iB);
                    break;
                case 2:
                    arrayListR = x8.b.r(parcel, iB);
                    break;
                case 3:
                    arrayListR2 = x8.b.r(parcel, iB);
                    break;
                case 4:
                    arrayListR3 = x8.b.r(parcel, iB);
                    break;
                case 5:
                    arrayListR4 = x8.b.r(parcel, iB);
                    break;
                case 6:
                    arrayListR5 = x8.b.r(parcel, iB);
                    break;
                default:
                    x8.b.J(parcel, iB);
                    break;
            }
        }
        x8.b.u(parcel, iK);
        return new e(iD, arrayListR, arrayListR2, arrayListR3, arrayListR4, arrayListR5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new e[i10];
    }
}
