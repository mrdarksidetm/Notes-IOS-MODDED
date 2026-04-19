package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import w8.m;
import x8.a;
import x8.c;

/* JADX INFO: loaded from: classes.dex */
public final class zzaz extends a {
    public static final Parcelable.Creator<zzaz> CREATOR = new zzba();
    final int zza;
    public final String zzb;
    public final byte[] zzc;

    zzaz(int i10, String str, byte[] bArr) {
        this.zza = 1;
        this.zzb = (String) m.k(str);
        this.zzc = (byte[]) m.k(bArr);
    }

    public zzaz(String str, byte[] bArr) {
        this(1, str, bArr);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.s(parcel, 1, this.zza);
        c.C(parcel, 2, this.zzb, false);
        c.k(parcel, 3, this.zzc, false);
        c.b(parcel, iA);
    }
}
