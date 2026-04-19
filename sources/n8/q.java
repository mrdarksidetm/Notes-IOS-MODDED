package n8;

import android.os.Parcel;
import android.os.Parcelable;
import n8.b;

/* JADX INFO: loaded from: classes.dex */
public final class q implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = x8.b.K(parcel);
        boolean zW = false;
        int iD = 0;
        b.e eVar = null;
        b.C0362b c0362b = null;
        String strP = null;
        b.d dVar = null;
        b.c cVar = null;
        while (parcel.dataPosition() < iK) {
            int iB = x8.b.B(parcel);
            switch (x8.b.v(iB)) {
                case 1:
                    eVar = (b.e) x8.b.o(parcel, iB, b.e.CREATOR);
                    break;
                case 2:
                    c0362b = (b.C0362b) x8.b.o(parcel, iB, b.C0362b.CREATOR);
                    break;
                case 3:
                    strP = x8.b.p(parcel, iB);
                    break;
                case 4:
                    zW = x8.b.w(parcel, iB);
                    break;
                case 5:
                    iD = x8.b.D(parcel, iB);
                    break;
                case 6:
                    dVar = (b.d) x8.b.o(parcel, iB, b.d.CREATOR);
                    break;
                case 7:
                    cVar = (b.c) x8.b.o(parcel, iB, b.c.CREATOR);
                    break;
                default:
                    x8.b.J(parcel, iB);
                    break;
            }
        }
        x8.b.u(parcel, iK);
        return new b(eVar, c0362b, strP, zW, iD, dVar, cVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new b[i10];
    }
}
