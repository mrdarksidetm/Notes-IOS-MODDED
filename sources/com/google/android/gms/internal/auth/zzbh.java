package com.google.android.gms.internal.auth;

import android.os.IBinder;
import android.os.Parcel;
import p8.b;

/* JADX INFO: loaded from: classes.dex */
public final class zzbh extends zza {
    zzbh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.internal.IAuthService");
    }

    public final void zzd(zzbg zzbgVar) {
        Parcel parcelZza = zza();
        zzc.zzd(parcelZza, zzbgVar);
        zzc(3, parcelZza);
    }

    public final void zze(zzbg zzbgVar, b bVar) {
        Parcel parcelZza = zza();
        zzc.zzd(parcelZza, zzbgVar);
        zzc.zzc(parcelZza, bVar);
        zzc(1, parcelZza);
    }
}
