package l9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class x0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = x8.b.K(parcel);
        byte[] bArrG = null;
        Double dZ = null;
        String strP = null;
        ArrayList arrayListT = null;
        Integer numE = null;
        e0 e0Var = null;
        String strP2 = null;
        d dVar = null;
        Long lG = null;
        while (parcel.dataPosition() < iK) {
            int iB = x8.b.B(parcel);
            switch (x8.b.v(iB)) {
                case 2:
                    bArrG = x8.b.g(parcel, iB);
                    break;
                case 3:
                    dZ = x8.b.z(parcel, iB);
                    break;
                case 4:
                    strP = x8.b.p(parcel, iB);
                    break;
                case 5:
                    arrayListT = x8.b.t(parcel, iB, v.CREATOR);
                    break;
                case 6:
                    numE = x8.b.E(parcel, iB);
                    break;
                case 7:
                    e0Var = (e0) x8.b.o(parcel, iB, e0.CREATOR);
                    break;
                case 8:
                    strP2 = x8.b.p(parcel, iB);
                    break;
                case 9:
                    dVar = (d) x8.b.o(parcel, iB, d.CREATOR);
                    break;
                case 10:
                    lG = x8.b.G(parcel, iB);
                    break;
                default:
                    x8.b.J(parcel, iB);
                    break;
            }
        }
        x8.b.u(parcel, iK);
        return new x(bArrG, dZ, strP, arrayListT, numE, e0Var, strP2, dVar, lG);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new x[i10];
    }
}
