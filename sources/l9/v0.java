package l9;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.common.Transport;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class v0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = x8.b.K(parcel);
        String strP = null;
        byte[] bArrG = null;
        ArrayList arrayListT = null;
        while (parcel.dataPosition() < iK) {
            int iB = x8.b.B(parcel);
            int iV = x8.b.v(iB);
            if (iV == 2) {
                strP = x8.b.p(parcel, iB);
            } else if (iV == 3) {
                bArrG = x8.b.g(parcel, iB);
            } else if (iV != 4) {
                x8.b.J(parcel, iB);
            } else {
                arrayListT = x8.b.t(parcel, iB, Transport.CREATOR);
            }
        }
        x8.b.u(parcel, iK);
        return new v(strP, bArrG, arrayListT);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new v[i10];
    }
}
