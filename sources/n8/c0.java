package n8;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class c0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = x8.b.K(parcel);
        String strP = null;
        String strP2 = null;
        String strP3 = null;
        String strP4 = null;
        Uri uri = null;
        String strP5 = null;
        String strP6 = null;
        String strP7 = null;
        l9.t tVar = null;
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
                    strP3 = x8.b.p(parcel, iB);
                    break;
                case 4:
                    strP4 = x8.b.p(parcel, iB);
                    break;
                case 5:
                    uri = (Uri) x8.b.o(parcel, iB, Uri.CREATOR);
                    break;
                case 6:
                    strP5 = x8.b.p(parcel, iB);
                    break;
                case 7:
                    strP6 = x8.b.p(parcel, iB);
                    break;
                case 8:
                    strP7 = x8.b.p(parcel, iB);
                    break;
                case 9:
                    tVar = (l9.t) x8.b.o(parcel, iB, l9.t.CREATOR);
                    break;
                default:
                    x8.b.J(parcel, iB);
                    break;
            }
        }
        x8.b.u(parcel, iK);
        return new l(strP, strP2, strP3, strP4, uri, strP5, strP6, strP7, tVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new l[i10];
    }
}
