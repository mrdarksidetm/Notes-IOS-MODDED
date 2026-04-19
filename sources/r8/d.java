package r8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = x8.b.K(parcel);
        int iD = 0;
        Bundle bundleF = null;
        int iD2 = 0;
        while (parcel.dataPosition() < iK) {
            int iB = x8.b.B(parcel);
            int iV = x8.b.v(iB);
            if (iV == 1) {
                iD = x8.b.D(parcel, iB);
            } else if (iV == 2) {
                iD2 = x8.b.D(parcel, iB);
            } else if (iV != 3) {
                x8.b.J(parcel, iB);
            } else {
                bundleF = x8.b.f(parcel, iB);
            }
        }
        x8.b.u(parcel, iK);
        return new a(iD, iD2, bundleF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new a[i10];
    }
}
