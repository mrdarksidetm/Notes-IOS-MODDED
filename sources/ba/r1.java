package ba;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class r1 implements Parcelable.Creator<s0> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ s0 createFromParcel(Parcel parcel) {
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
        return new s0(strP);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ s0[] newArray(int i10) {
        return new s0[i10];
    }
}
