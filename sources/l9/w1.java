package l9;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class w1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = x8.b.K(parcel);
        u uVar = null;
        Uri uri = null;
        byte[] bArrG = null;
        while (parcel.dataPosition() < iK) {
            int iB = x8.b.B(parcel);
            int iV = x8.b.v(iB);
            if (iV == 2) {
                uVar = (u) x8.b.o(parcel, iB, u.CREATOR);
            } else if (iV == 3) {
                uri = (Uri) x8.b.o(parcel, iB, Uri.CREATOR);
            } else if (iV != 4) {
                x8.b.J(parcel, iB);
            } else {
                bArrG = x8.b.g(parcel, iB);
            }
        }
        x8.b.u(parcel, iK);
        return new l(uVar, uri, bArrG);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new l[i10];
    }
}
