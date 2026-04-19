package l9;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class t0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = x8.b.K(parcel);
        y yVar = null;
        a0 a0Var = null;
        byte[] bArrG = null;
        ArrayList arrayListT = null;
        Double dZ = null;
        ArrayList arrayListT2 = null;
        k kVar = null;
        Integer numE = null;
        e0 e0Var = null;
        String strP = null;
        d dVar = null;
        while (parcel.dataPosition() < iK) {
            int iB = x8.b.B(parcel);
            switch (x8.b.v(iB)) {
                case 2:
                    yVar = (y) x8.b.o(parcel, iB, y.CREATOR);
                    break;
                case 3:
                    a0Var = (a0) x8.b.o(parcel, iB, a0.CREATOR);
                    break;
                case 4:
                    bArrG = x8.b.g(parcel, iB);
                    break;
                case 5:
                    arrayListT = x8.b.t(parcel, iB, w.CREATOR);
                    break;
                case 6:
                    dZ = x8.b.z(parcel, iB);
                    break;
                case 7:
                    arrayListT2 = x8.b.t(parcel, iB, v.CREATOR);
                    break;
                case 8:
                    kVar = (k) x8.b.o(parcel, iB, k.CREATOR);
                    break;
                case 9:
                    numE = x8.b.E(parcel, iB);
                    break;
                case 10:
                    e0Var = (e0) x8.b.o(parcel, iB, e0.CREATOR);
                    break;
                case 11:
                    strP = x8.b.p(parcel, iB);
                    break;
                case 12:
                    dVar = (d) x8.b.o(parcel, iB, d.CREATOR);
                    break;
                default:
                    x8.b.J(parcel, iB);
                    break;
            }
        }
        x8.b.u(parcel, iK);
        return new u(yVar, a0Var, bArrG, arrayListT, dZ, arrayListT2, kVar, numE, e0Var, strP, dVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new u[i10];
    }
}
