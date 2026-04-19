package m8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashSet;
import x8.b;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = x8.b.K(parcel);
        HashSet hashSet = new HashSet();
        int iD = 0;
        ArrayList arrayListT = null;
        e eVar = null;
        int iD2 = 0;
        while (parcel.dataPosition() < iK) {
            int iB = x8.b.B(parcel);
            int iV = x8.b.v(iB);
            int i10 = 1;
            if (iV != 1) {
                i10 = 2;
                if (iV != 2) {
                    i10 = 3;
                    if (iV != 3) {
                        i10 = 4;
                        if (iV != 4) {
                            x8.b.J(parcel, iB);
                        } else {
                            eVar = (e) x8.b.o(parcel, iB, e.CREATOR);
                        }
                    } else {
                        iD = x8.b.D(parcel, iB);
                    }
                } else {
                    arrayListT = x8.b.t(parcel, iB, g.CREATOR);
                }
            } else {
                iD2 = x8.b.D(parcel, iB);
            }
            hashSet.add(Integer.valueOf(i10));
        }
        if (parcel.dataPosition() == iK) {
            return new b(hashSet, iD2, arrayListT, iD, eVar);
        }
        throw new b.a("Overread allowed size end=" + iK, parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new b[i10];
    }
}
