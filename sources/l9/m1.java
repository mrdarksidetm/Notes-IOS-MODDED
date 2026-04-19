package l9;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class m1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = x8.b.K(parcel);
        r rVar = null;
        b2 b2Var = null;
        f0 f0Var = null;
        h2 h2Var = null;
        k0 k0Var = null;
        m0 m0Var = null;
        d2 d2Var = null;
        p0 p0Var = null;
        s sVar = null;
        r0 r0Var = null;
        while (parcel.dataPosition() < iK) {
            int iB = x8.b.B(parcel);
            switch (x8.b.v(iB)) {
                case 2:
                    rVar = (r) x8.b.o(parcel, iB, r.CREATOR);
                    break;
                case 3:
                    b2Var = (b2) x8.b.o(parcel, iB, b2.CREATOR);
                    break;
                case 4:
                    f0Var = (f0) x8.b.o(parcel, iB, f0.CREATOR);
                    break;
                case 5:
                    h2Var = (h2) x8.b.o(parcel, iB, h2.CREATOR);
                    break;
                case 6:
                    k0Var = (k0) x8.b.o(parcel, iB, k0.CREATOR);
                    break;
                case 7:
                    m0Var = (m0) x8.b.o(parcel, iB, m0.CREATOR);
                    break;
                case 8:
                    d2Var = (d2) x8.b.o(parcel, iB, d2.CREATOR);
                    break;
                case 9:
                    p0Var = (p0) x8.b.o(parcel, iB, p0.CREATOR);
                    break;
                case 10:
                    sVar = (s) x8.b.o(parcel, iB, s.CREATOR);
                    break;
                case 11:
                    r0Var = (r0) x8.b.o(parcel, iB, r0.CREATOR);
                    break;
                default:
                    x8.b.J(parcel, iB);
                    break;
            }
        }
        x8.b.u(parcel, iK);
        return new d(rVar, b2Var, f0Var, h2Var, k0Var, m0Var, d2Var, p0Var, sVar, r0Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new d[i10];
    }
}
