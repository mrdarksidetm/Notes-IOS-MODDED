package b9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = x8.b.K(parcel);
        ArrayList arrayListT = null;
        String strP = null;
        boolean zW = false;
        String strP2 = null;
        while (parcel.dataPosition() < iK) {
            int iB = x8.b.B(parcel);
            int iV = x8.b.v(iB);
            if (iV == 1) {
                arrayListT = x8.b.t(parcel, iB, t8.d.CREATOR);
            } else if (iV == 2) {
                zW = x8.b.w(parcel, iB);
            } else if (iV == 3) {
                strP2 = x8.b.p(parcel, iB);
            } else if (iV != 4) {
                x8.b.J(parcel, iB);
            } else {
                strP = x8.b.p(parcel, iB);
            }
        }
        x8.b.u(parcel, iK);
        return new a(arrayListT, zW, strP2, strP);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new a[i10];
    }
}
