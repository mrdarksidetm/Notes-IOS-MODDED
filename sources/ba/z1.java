package ba;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class z1 implements Parcelable.Creator<l> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ l createFromParcel(Parcel parcel) {
        int iK = x8.b.K(parcel);
        String strP = null;
        while (parcel.dataPosition() < iK) {
            int iB = x8.b.B(parcel);
            if (x8.b.v(iB) != 1) {
                x8.b.J(parcel, iB);
            } else {
                strP = x8.b.p(parcel, iB);
            }
        }
        x8.b.u(parcel, iK);
        return new l(strP);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ l[] newArray(int i10) {
        return new l[i10];
    }
}
