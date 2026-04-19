package l9;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class u0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = x8.b.K(parcel);
        String strP = null;
        String strP2 = null;
        byte[] bArrG = null;
        h hVar = null;
        g gVar = null;
        i iVar = null;
        e eVar = null;
        String strP3 = null;
        while (parcel.dataPosition() < iK) {
            int iB = x8.b.B(parcel);
            switch (x8.b.v(iB)) {
                case 1:
                    strP = x8.b.p(parcel, iB);
                    break;
                case 2:
                    strP2 = x8.b.p(parcel, iB);
                    break;
                case 3:
                    bArrG = x8.b.g(parcel, iB);
                    break;
                case 4:
                    hVar = (h) x8.b.o(parcel, iB, h.CREATOR);
                    break;
                case 5:
                    gVar = (g) x8.b.o(parcel, iB, g.CREATOR);
                    break;
                case 6:
                    iVar = (i) x8.b.o(parcel, iB, i.CREATOR);
                    break;
                case 7:
                    eVar = (e) x8.b.o(parcel, iB, e.CREATOR);
                    break;
                case 8:
                    strP3 = x8.b.p(parcel, iB);
                    break;
                default:
                    x8.b.J(parcel, iB);
                    break;
            }
        }
        x8.b.u(parcel, iK);
        return new t(strP, strP2, bArrG, hVar, gVar, iVar, eVar, strP3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new t[i10];
    }
}
