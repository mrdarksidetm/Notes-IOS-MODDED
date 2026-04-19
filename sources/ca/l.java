package ca;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements Parcelable.Creator<i> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ i createFromParcel(Parcel parcel) {
        int iK = x8.b.K(parcel);
        long jF = 0;
        long jF2 = 0;
        while (parcel.dataPosition() < iK) {
            int iB = x8.b.B(parcel);
            int iV = x8.b.v(iB);
            if (iV == 1) {
                jF = x8.b.F(parcel, iB);
            } else if (iV != 2) {
                x8.b.J(parcel, iB);
            } else {
                jF2 = x8.b.F(parcel, iB);
            }
        }
        x8.b.u(parcel, iK);
        return new i(jF, jF2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ i[] newArray(int i10) {
        return new i[i10];
    }
}
