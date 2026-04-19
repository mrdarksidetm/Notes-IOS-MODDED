package ca;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class n0 implements Parcelable.Creator<o0> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ o0 createFromParcel(Parcel parcel) {
        int iK = x8.b.K(parcel);
        ArrayList arrayListT = null;
        ArrayList arrayListT2 = null;
        while (parcel.dataPosition() < iK) {
            int iB = x8.b.B(parcel);
            int iV = x8.b.v(iB);
            if (iV == 1) {
                arrayListT = x8.b.t(parcel, iB, ba.r0.CREATOR);
            } else if (iV != 2) {
                x8.b.J(parcel, iB);
            } else {
                arrayListT2 = x8.b.t(parcel, iB, ba.x0.CREATOR);
            }
        }
        x8.b.u(parcel, iK);
        return new o0(arrayListT, arrayListT2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ o0[] newArray(int i10) {
        return new o0[i10];
    }
}
