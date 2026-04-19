package p8;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = x8.b.K(parcel);
        int iD = 0;
        int iD2 = 0;
        int iD3 = 0;
        PendingIntent pendingIntent = null;
        Bundle bundleF = null;
        byte[] bArrG = null;
        while (parcel.dataPosition() < iK) {
            int iB = x8.b.B(parcel);
            int iV = x8.b.v(iB);
            if (iV == 1) {
                iD2 = x8.b.D(parcel, iB);
            } else if (iV == 2) {
                pendingIntent = (PendingIntent) x8.b.o(parcel, iB, PendingIntent.CREATOR);
            } else if (iV == 3) {
                iD3 = x8.b.D(parcel, iB);
            } else if (iV == 4) {
                bundleF = x8.b.f(parcel, iB);
            } else if (iV == 5) {
                bArrG = x8.b.g(parcel, iB);
            } else if (iV != 1000) {
                x8.b.J(parcel, iB);
            } else {
                iD = x8.b.D(parcel, iB);
            }
        }
        x8.b.u(parcel, iK);
        return new c(iD, iD2, pendingIntent, iD3, bundleF, bArrG);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new c[i10];
    }
}
