package l9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class c2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = x8.b.K(parcel);
        ArrayList arrayListT = null;
        while (parcel.dataPosition() < iK) {
            int iB = x8.b.B(parcel);
            if (x8.b.v(iB) != 1) {
                x8.b.J(parcel, iB);
            } else {
                arrayListT = x8.b.t(parcel, iB, z1.CREATOR);
            }
        }
        x8.b.u(parcel, iK);
        return new b2(arrayListT);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new b2[i10];
    }
}
