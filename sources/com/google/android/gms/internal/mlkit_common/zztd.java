package com.google.android.gms.internal.mlkit_common;

/* JADX INFO: loaded from: classes.dex */
public final class zztd {
    private static zztc zza;

    public static synchronized zzss zza(zzsm zzsmVar) {
        if (zza == null) {
            zza = new zztc(null);
        }
        return (zzss) zza.get(zzsmVar);
    }

    public static synchronized zzss zzb(String str) {
        return zza(zzsm.zzd("common").zzd());
    }
}
