package m8;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashSet;
import x8.b;

/* JADX INFO: loaded from: classes.dex */
public final class j implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i10;
        int iK = x8.b.K(parcel);
        HashSet hashSet = new HashSet();
        int iD = 0;
        String strP = null;
        byte[] bArrG = null;
        PendingIntent pendingIntent = null;
        a aVar = null;
        int iD2 = 0;
        while (parcel.dataPosition() < iK) {
            int iB = x8.b.B(parcel);
            switch (x8.b.v(iB)) {
                case 1:
                    iD2 = x8.b.D(parcel, iB);
                    i10 = 1;
                    break;
                case 2:
                    strP = x8.b.p(parcel, iB);
                    i10 = 2;
                    break;
                case 3:
                    iD = x8.b.D(parcel, iB);
                    i10 = 3;
                    break;
                case 4:
                    bArrG = x8.b.g(parcel, iB);
                    i10 = 4;
                    break;
                case 5:
                    pendingIntent = (PendingIntent) x8.b.o(parcel, iB, PendingIntent.CREATOR);
                    i10 = 5;
                    break;
                case 6:
                    aVar = (a) x8.b.o(parcel, iB, a.CREATOR);
                    i10 = 6;
                    break;
                default:
                    x8.b.J(parcel, iB);
                    continue;
            }
            hashSet.add(Integer.valueOf(i10));
        }
        if (parcel.dataPosition() == iK) {
            return new i(hashSet, iD2, strP, iD, bArrG, pendingIntent, aVar);
        }
        throw new b.a("Overread allowed size end=" + iK, parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new i[i10];
    }
}
