package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import x8.b;

/* JADX INFO: loaded from: classes.dex */
public final class zzab implements Parcelable.Creator<zzaa> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzaa createFromParcel(Parcel parcel) {
        int iK = b.K(parcel);
        Status status = null;
        while (parcel.dataPosition() < iK) {
            int iB = b.B(parcel);
            if (b.v(iB) != 1) {
                b.J(parcel, iB);
            } else {
                status = (Status) b.o(parcel, iB, Status.CREATOR);
            }
        }
        b.u(parcel, iK);
        return new zzaa(status);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ zzaa[] newArray(int i10) {
        return new zzaa[i10];
    }
}
