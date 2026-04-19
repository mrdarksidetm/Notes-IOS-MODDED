package com.google.android.gms.internal.mlkit_vision_document_scanner;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import x8.a;
import x8.c;

/* JADX INFO: loaded from: classes.dex */
public final class zzry extends a {
    public static final Parcelable.Creator<zzry> CREATOR = new zzrz();
    private final BitmapTeleporter zza;

    public zzry(BitmapTeleporter bitmapTeleporter) {
        this.zza = bitmapTeleporter;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.A(parcel, 1, this.zza, i10, false);
        c.b(parcel, iA);
    }

    public final BitmapTeleporter zza() {
        return this.zza;
    }
}
