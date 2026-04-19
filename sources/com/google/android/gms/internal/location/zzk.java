package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import n9.o0;
import x8.b;

/* JADX INFO: loaded from: classes.dex */
public final class zzk implements Parcelable.Creator<zzj> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzj createFromParcel(Parcel parcel) {
        int iK = b.K(parcel);
        o0 o0Var = zzj.zzb;
        List<w8.b> listT = zzj.zza;
        String strP = null;
        while (parcel.dataPosition() < iK) {
            int iB = b.B(parcel);
            int iV = b.v(iB);
            if (iV == 1) {
                o0Var = (o0) b.o(parcel, iB, o0.CREATOR);
            } else if (iV == 2) {
                listT = b.t(parcel, iB, w8.b.CREATOR);
            } else if (iV != 3) {
                b.J(parcel, iB);
            } else {
                strP = b.p(parcel, iB);
            }
        }
        b.u(parcel, iK);
        return new zzj(o0Var, listT, strP);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzj[] newArray(int i10) {
        return new zzj[i10];
    }
}
