package n9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.location.zzbe;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class s implements Parcelable.Creator<h> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ h createFromParcel(Parcel parcel) {
        int iK = x8.b.K(parcel);
        ArrayList arrayListT = null;
        int iD = 0;
        String strP = "";
        String strP2 = null;
        while (parcel.dataPosition() < iK) {
            int iB = x8.b.B(parcel);
            int iV = x8.b.v(iB);
            if (iV == 1) {
                arrayListT = x8.b.t(parcel, iB, zzbe.CREATOR);
            } else if (iV == 2) {
                iD = x8.b.D(parcel, iB);
            } else if (iV == 3) {
                strP = x8.b.p(parcel, iB);
            } else if (iV != 4) {
                x8.b.J(parcel, iB);
            } else {
                strP2 = x8.b.p(parcel, iB);
            }
        }
        x8.b.u(parcel, iK);
        return new h(arrayListT, iD, strP, strP2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ h[] newArray(int i10) {
        return new h[i10];
    }
}
