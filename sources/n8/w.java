package n8;

import android.os.Parcel;
import android.os.Parcelable;
import n8.b;

/* JADX INFO: loaded from: classes.dex */
public final class w implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = x8.b.K(parcel);
        String strP = null;
        boolean zW = false;
        while (parcel.dataPosition() < iK) {
            int iB = x8.b.B(parcel);
            int iV = x8.b.v(iB);
            if (iV == 1) {
                zW = x8.b.w(parcel, iB);
            } else if (iV != 2) {
                x8.b.J(parcel, iB);
            } else {
                strP = x8.b.p(parcel, iB);
            }
        }
        x8.b.u(parcel, iK);
        return new b.c(zW, strP);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new b.c[i10];
    }
}
