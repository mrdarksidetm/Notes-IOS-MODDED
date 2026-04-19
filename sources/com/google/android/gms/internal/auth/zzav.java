package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import w8.m;
import x8.a;
import x8.c;

/* JADX INFO: loaded from: classes.dex */
public final class zzav extends a {
    public static final Parcelable.Creator<zzav> CREATOR = new zzaw();
    final int zza;
    public final String zzb;
    public final int zzc;

    zzav(int i10, String str, int i11) {
        this.zza = 1;
        this.zzb = (String) m.k(str);
        this.zzc = i11;
    }

    public zzav(String str, int i10) {
        this(1, str, i10);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.s(parcel, 1, this.zza);
        c.C(parcel, 2, this.zzb, false);
        c.s(parcel, 3, this.zzc);
        c.b(parcel, iA);
    }
}
