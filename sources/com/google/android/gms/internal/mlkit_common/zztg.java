package com.google.android.gms.internal.mlkit_common;

/* JADX INFO: loaded from: classes.dex */
public final class zztg {
    private static zztg zza;

    private zztg() {
    }

    public static synchronized zztg zza() {
        if (zza == null) {
            zza = new zztg();
        }
        return zza;
    }

    public static void zzb() {
        zztf.zza();
    }
}
