package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import x8.a;
import x8.c;

/* JADX INFO: loaded from: classes.dex */
public final class zzbw extends a {
    public static final Parcelable.Creator<zzbw> CREATOR = new zzbx();
    final int zza;
    String zzb;

    public zzbw() {
        this.zza = 1;
    }

    zzbw(int i10, String str) {
        this.zza = i10;
        this.zzb = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.s(parcel, 1, this.zza);
        c.C(parcel, 2, this.zzb, false);
        c.b(parcel, iA);
    }

    public final zzbw zza(String str) {
        this.zzb = str;
        return this;
    }
}
