package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import w8.m;
import x8.a;
import x8.c;

/* JADX INFO: loaded from: classes.dex */
public final class zzax extends a {
    public static final Parcelable.Creator<zzax> CREATOR = new zzay();
    final int zza;
    public final String zzb;

    zzax(int i10, String str) {
        this.zza = 1;
        this.zzb = (String) m.k(str);
    }

    public zzax(String str) {
        this(1, str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.s(parcel, 1, this.zza);
        c.C(parcel, 2, this.zzb, false);
        c.b(parcel, iA);
    }
}
