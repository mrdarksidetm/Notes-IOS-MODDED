package n9;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class l0 implements Parcelable.Creator<c> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ c createFromParcel(Parcel parcel) {
        int iK = x8.b.K(parcel);
        int iD = 0;
        int iD2 = 0;
        while (parcel.dataPosition() < iK) {
            int iB = x8.b.B(parcel);
            int iV = x8.b.v(iB);
            if (iV == 1) {
                iD = x8.b.D(parcel, iB);
            } else if (iV != 2) {
                x8.b.J(parcel, iB);
            } else {
                iD2 = x8.b.D(parcel, iB);
            }
        }
        x8.b.u(parcel, iK);
        return new c(iD, iD2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ c[] newArray(int i10) {
        return new c[i10];
    }
}
