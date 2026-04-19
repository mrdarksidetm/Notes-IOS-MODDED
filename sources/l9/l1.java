package l9;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class l1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = x8.b.K(parcel);
        g0 g0Var = null;
        o1 o1Var = null;
        f fVar = null;
        q1 q1Var = null;
        while (parcel.dataPosition() < iK) {
            int iB = x8.b.B(parcel);
            int iV = x8.b.v(iB);
            if (iV == 1) {
                g0Var = (g0) x8.b.o(parcel, iB, g0.CREATOR);
            } else if (iV == 2) {
                o1Var = (o1) x8.b.o(parcel, iB, o1.CREATOR);
            } else if (iV == 3) {
                fVar = (f) x8.b.o(parcel, iB, f.CREATOR);
            } else if (iV != 4) {
                x8.b.J(parcel, iB);
            } else {
                q1Var = (q1) x8.b.o(parcel, iB, q1.CREATOR);
            }
        }
        x8.b.u(parcel, iK);
        return new e(g0Var, o1Var, fVar, q1Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new e[i10];
    }
}
