package n9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class b0 implements Parcelable.Creator<l> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ l createFromParcel(Parcel parcel) {
        int iK = x8.b.K(parcel);
        boolean zW = false;
        ArrayList arrayListT = null;
        z zVar = null;
        boolean zW2 = false;
        while (parcel.dataPosition() < iK) {
            int iB = x8.b.B(parcel);
            int iV = x8.b.v(iB);
            if (iV == 1) {
                arrayListT = x8.b.t(parcel, iB, LocationRequest.CREATOR);
            } else if (iV == 2) {
                zW = x8.b.w(parcel, iB);
            } else if (iV == 3) {
                zW2 = x8.b.w(parcel, iB);
            } else if (iV != 5) {
                x8.b.J(parcel, iB);
            } else {
                zVar = (z) x8.b.o(parcel, iB, z.CREATOR);
            }
        }
        x8.b.u(parcel, iK);
        return new l(arrayListT, zW, zW2, zVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ l[] newArray(int i10) {
        return new l[i10];
    }
}
