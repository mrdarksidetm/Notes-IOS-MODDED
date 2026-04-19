package n8;

import android.os.Parcel;
import android.os.Parcelable;
import n8.b;

/* JADX INFO: loaded from: classes.dex */
public final class y implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = x8.b.K(parcel);
        boolean zW = false;
        while (parcel.dataPosition() < iK) {
            int iB = x8.b.B(parcel);
            if (x8.b.v(iB) != 1) {
                x8.b.J(parcel, iB);
            } else {
                zW = x8.b.w(parcel, iB);
            }
        }
        x8.b.u(parcel, iK);
        return new b.e(zW);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new b.e[i10];
    }
}
