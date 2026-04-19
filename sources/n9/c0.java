package n9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public final class c0 implements Parcelable.Creator<m> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ m createFromParcel(Parcel parcel) {
        int iK = x8.b.K(parcel);
        Status status = null;
        n nVar = null;
        while (parcel.dataPosition() < iK) {
            int iB = x8.b.B(parcel);
            int iV = x8.b.v(iB);
            if (iV == 1) {
                status = (Status) x8.b.o(parcel, iB, Status.CREATOR);
            } else if (iV != 2) {
                x8.b.J(parcel, iB);
            } else {
                nVar = (n) x8.b.o(parcel, iB, n.CREATOR);
            }
        }
        x8.b.u(parcel, iK);
        return new m(status, nVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ m[] newArray(int i10) {
        return new m[i10];
    }
}
