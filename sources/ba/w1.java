package ba;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzahr;

/* JADX INFO: loaded from: classes2.dex */
public final class w1 implements Parcelable.Creator<x1> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ x1 createFromParcel(Parcel parcel) {
        int iK = x8.b.K(parcel);
        String strP = null;
        String strP2 = null;
        String strP3 = null;
        zzahr zzahrVar = null;
        String strP4 = null;
        String strP5 = null;
        String strP6 = null;
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
                    zzahrVar = (zzahr) x8.b.o(parcel, iB, zzahr.CREATOR);
                    break;
                case 5:
                    strP4 = x8.b.p(parcel, iB);
                    break;
                case 6:
                    strP5 = x8.b.p(parcel, iB);
                    break;
                case 7:
                    strP6 = x8.b.p(parcel, iB);
                    break;
                default:
                    x8.b.J(parcel, iB);
                    break;
            }
        }
        x8.b.u(parcel, iK);
        return new x1(strP, strP2, strP3, zzahrVar, strP4, strP5, strP6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ x1[] newArray(int i10) {
        return new x1[i10];
    }
}
