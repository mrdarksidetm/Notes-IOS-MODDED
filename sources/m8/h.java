package m8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashSet;
import x8.b;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = x8.b.K(parcel);
        HashSet hashSet = new HashSet();
        int iD = 0;
        i iVar = null;
        String strP = null;
        String strP2 = null;
        String strP3 = null;
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
                            i10 = 5;
                            if (iV != 5) {
                                x8.b.J(parcel, iB);
                            } else {
                                strP3 = x8.b.p(parcel, iB);
                            }
                        } else {
                            strP2 = x8.b.p(parcel, iB);
                        }
                    } else {
                        strP = x8.b.p(parcel, iB);
                    }
                } else {
                    iVar = (i) x8.b.o(parcel, iB, i.CREATOR);
                }
            } else {
                iD = x8.b.D(parcel, iB);
            }
            hashSet.add(Integer.valueOf(i10));
        }
        if (parcel.dataPosition() == iK) {
            return new g(hashSet, iD, iVar, strP, strP2, strP3);
        }
        throw new b.a("Overread allowed size end=" + iK, parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new g[i10];
    }
}
