package n9;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class h0 implements Parcelable.Creator<g0> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ g0 createFromParcel(Parcel parcel) {
        int iK = x8.b.K(parcel);
        ArrayList<String> arrayListR = null;
        String strP = "";
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < iK) {
            int iB = x8.b.B(parcel);
            int iV = x8.b.v(iB);
            if (iV == 1) {
                arrayListR = x8.b.r(parcel, iB);
            } else if (iV == 2) {
                pendingIntent = (PendingIntent) x8.b.o(parcel, iB, PendingIntent.CREATOR);
            } else if (iV != 3) {
                x8.b.J(parcel, iB);
            } else {
                strP = x8.b.p(parcel, iB);
            }
        }
        x8.b.u(parcel, iK);
        return new g0(arrayListR, pendingIntent, strP);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ g0[] newArray(int i10) {
        return new g0[i10];
    }
}
