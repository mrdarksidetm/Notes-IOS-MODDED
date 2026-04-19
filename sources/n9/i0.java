package n9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class i0 implements Parcelable.Creator<q> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ q createFromParcel(Parcel parcel) {
        int iK = x8.b.K(parcel);
        ArrayList arrayListT = null;
        int iD = 0;
        while (parcel.dataPosition() < iK) {
            int iB = x8.b.B(parcel);
            int iV = x8.b.v(iB);
            if (iV == 1) {
                arrayListT = x8.b.t(parcel, iB, j0.CREATOR);
            } else if (iV != 2) {
                x8.b.J(parcel, iB);
            } else {
                iD = x8.b.D(parcel, iB);
            }
        }
        x8.b.u(parcel, iK);
        return new q(arrayListT, iD);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ q[] newArray(int i10) {
        return new q[i10];
    }
}
