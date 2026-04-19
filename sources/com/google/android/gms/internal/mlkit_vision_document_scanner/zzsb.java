package com.google.android.gms.internal.mlkit_vision_document_scanner;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import x8.b;

/* JADX INFO: loaded from: classes.dex */
public final class zzsb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = b.K(parcel);
        ArrayList arrayListT = null;
        while (parcel.dataPosition() < iK) {
            int iB = b.B(parcel);
            if (b.v(iB) != 1) {
                b.J(parcel, iB);
            } else {
                arrayListT = b.t(parcel, iB, zzry.CREATOR);
            }
        }
        b.u(parcel, iK);
        return new zzsa(arrayListT);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzsa[i10];
    }
}
