package n9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class n0 implements Parcelable.Creator<d> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ d createFromParcel(Parcel parcel) {
        int iK = x8.b.K(parcel);
        ArrayList arrayListT = null;
        String strP = null;
        ArrayList arrayListT2 = null;
        String strP2 = null;
        while (parcel.dataPosition() < iK) {
            int iB = x8.b.B(parcel);
            int iV = x8.b.v(iB);
            if (iV == 1) {
                arrayListT = x8.b.t(parcel, iB, c.CREATOR);
            } else if (iV == 2) {
                strP = x8.b.p(parcel, iB);
            } else if (iV == 3) {
                arrayListT2 = x8.b.t(parcel, iB, w8.b.CREATOR);
            } else if (iV != 4) {
                x8.b.J(parcel, iB);
            } else {
                strP2 = x8.b.p(parcel, iB);
            }
        }
        x8.b.u(parcel, iK);
        return new d(arrayListT, strP, arrayListT2, strP2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ d[] newArray(int i10) {
        return new d[i10];
    }
}
