package n9;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class p0 implements Parcelable.Creator<o0> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ o0 createFromParcel(Parcel parcel) {
        int iK = x8.b.K(parcel);
        boolean zW = true;
        long jF = 50;
        float fA = 0.0f;
        long jF2 = Long.MAX_VALUE;
        int iD = Integer.MAX_VALUE;
        while (parcel.dataPosition() < iK) {
            int iB = x8.b.B(parcel);
            int iV = x8.b.v(iB);
            if (iV == 1) {
                zW = x8.b.w(parcel, iB);
            } else if (iV == 2) {
                jF = x8.b.F(parcel, iB);
            } else if (iV == 3) {
                fA = x8.b.A(parcel, iB);
            } else if (iV == 4) {
                jF2 = x8.b.F(parcel, iB);
            } else if (iV != 5) {
                x8.b.J(parcel, iB);
            } else {
                iD = x8.b.D(parcel, iB);
            }
        }
        x8.b.u(parcel, iK);
        return new o0(zW, jF, fA, jF2, iD);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ o0[] newArray(int i10) {
        return new o0[i10];
    }
}
