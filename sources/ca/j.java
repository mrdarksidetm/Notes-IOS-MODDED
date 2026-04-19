package ca;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzagl;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements Parcelable.Creator<g> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ g createFromParcel(Parcel parcel) {
        int iK = x8.b.K(parcel);
        zzagl zzaglVar = null;
        e2 e2Var = null;
        String strP = null;
        String strP2 = null;
        ArrayList arrayListT = null;
        ArrayList<String> arrayListR = null;
        String strP3 = null;
        Boolean boolX = null;
        i iVar = null;
        ba.x1 x1Var = null;
        o0 o0Var = null;
        ArrayList arrayListT2 = null;
        boolean zW = false;
        while (parcel.dataPosition() < iK) {
            int iB = x8.b.B(parcel);
            switch (x8.b.v(iB)) {
                case 1:
                    zzaglVar = (zzagl) x8.b.o(parcel, iB, zzagl.CREATOR);
                    break;
                case 2:
                    e2Var = (e2) x8.b.o(parcel, iB, e2.CREATOR);
                    break;
                case 3:
                    strP = x8.b.p(parcel, iB);
                    break;
                case 4:
                    strP2 = x8.b.p(parcel, iB);
                    break;
                case 5:
                    arrayListT = x8.b.t(parcel, iB, e2.CREATOR);
                    break;
                case 6:
                    arrayListR = x8.b.r(parcel, iB);
                    break;
                case 7:
                    strP3 = x8.b.p(parcel, iB);
                    break;
                case 8:
                    boolX = x8.b.x(parcel, iB);
                    break;
                case 9:
                    iVar = (i) x8.b.o(parcel, iB, i.CREATOR);
                    break;
                case 10:
                    zW = x8.b.w(parcel, iB);
                    break;
                case 11:
                    x1Var = (ba.x1) x8.b.o(parcel, iB, ba.x1.CREATOR);
                    break;
                case 12:
                    o0Var = (o0) x8.b.o(parcel, iB, o0.CREATOR);
                    break;
                case 13:
                    arrayListT2 = x8.b.t(parcel, iB, ba.n1.CREATOR);
                    break;
                default:
                    x8.b.J(parcel, iB);
                    break;
            }
        }
        x8.b.u(parcel, iK);
        return new g(zzaglVar, e2Var, strP, strP2, arrayListT, arrayListR, strP3, boolX, iVar, zW, x1Var, o0Var, arrayListT2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ g[] newArray(int i10) {
        return new g[i10];
    }
}
