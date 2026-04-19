package ca;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class o implements Parcelable.Creator<m> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ m createFromParcel(Parcel parcel) {
        int iK = x8.b.K(parcel);
        ArrayList arrayListT = null;
        r rVar = null;
        String strP = null;
        ba.x1 x1Var = null;
        g gVar = null;
        ArrayList arrayListT2 = null;
        while (parcel.dataPosition() < iK) {
            int iB = x8.b.B(parcel);
            switch (x8.b.v(iB)) {
                case 1:
                    arrayListT = x8.b.t(parcel, iB, ba.r0.CREATOR);
                    break;
                case 2:
                    rVar = (r) x8.b.o(parcel, iB, r.CREATOR);
                    break;
                case 3:
                    strP = x8.b.p(parcel, iB);
                    break;
                case 4:
                    x1Var = (ba.x1) x8.b.o(parcel, iB, ba.x1.CREATOR);
                    break;
                case 5:
                    gVar = (g) x8.b.o(parcel, iB, g.CREATOR);
                    break;
                case 6:
                    arrayListT2 = x8.b.t(parcel, iB, ba.x0.CREATOR);
                    break;
                default:
                    x8.b.J(parcel, iB);
                    break;
            }
        }
        x8.b.u(parcel, iK);
        return new m(arrayListT, rVar, strP, x1Var, gVar, arrayListT2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ m[] newArray(int i10) {
        return new m[i10];
    }
}
