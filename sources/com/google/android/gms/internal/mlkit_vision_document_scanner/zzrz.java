package com.google.android.gms.internal.mlkit_vision_document_scanner;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import x8.b;

/* JADX INFO: loaded from: classes.dex */
public final class zzrz implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iK = b.K(parcel);
        BitmapTeleporter bitmapTeleporter = null;
        while (parcel.dataPosition() < iK) {
            int iB = b.B(parcel);
            if (b.v(iB) != 1) {
                b.J(parcel, iB);
            } else {
                bitmapTeleporter = (BitmapTeleporter) b.o(parcel, iB, BitmapTeleporter.CREATOR);
            }
        }
        b.u(parcel, iK);
        return new zzry(bitmapTeleporter);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzry[i10];
    }
}
