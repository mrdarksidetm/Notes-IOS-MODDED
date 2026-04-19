package p9;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class m implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = x8.b.K(parcel);
        t8.b bVar = null;
        int iD = 0;
        com.google.android.gms.common.internal.i iVar = null;
        while (parcel.dataPosition() < iK) {
            int iB = x8.b.B(parcel);
            int iV = x8.b.v(iB);
            if (iV == 1) {
                iD = x8.b.D(parcel, iB);
            } else if (iV == 2) {
                bVar = (t8.b) x8.b.o(parcel, iB, t8.b.CREATOR);
            } else if (iV != 3) {
                x8.b.J(parcel, iB);
            } else {
                iVar = (com.google.android.gms.common.internal.i) x8.b.o(parcel, iB, com.google.android.gms.common.internal.i.CREATOR);
            }
        }
        x8.b.u(parcel, iK);
        return new l(iD, bVar, iVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new l[i10];
    }
}
