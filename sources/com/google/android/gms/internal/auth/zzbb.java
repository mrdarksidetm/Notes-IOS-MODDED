package com.google.android.gms.internal.auth;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import w8.m;
import x8.a;
import x8.c;

/* JADX INFO: loaded from: classes.dex */
public final class zzbb extends a {
    public static final Parcelable.Creator<zzbb> CREATOR = new zzbc();
    final int zza;
    public final String zzb;
    public final PendingIntent zzc;

    zzbb(int i10, String str, PendingIntent pendingIntent) {
        this.zza = 1;
        this.zzb = (String) m.k(str);
        this.zzc = (PendingIntent) m.k(pendingIntent);
    }

    public zzbb(String str, PendingIntent pendingIntent) {
        this(1, str, pendingIntent);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.s(parcel, 1, this.zza);
        c.C(parcel, 2, this.zzb, false);
        c.A(parcel, 3, this.zzc, i10, false);
        c.b(parcel, iA);
    }
}
