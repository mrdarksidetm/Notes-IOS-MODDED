package com.google.android.gms.internal.mlkit_vision_document_scanner;

/* JADX INFO: loaded from: classes.dex */
public final class zzrv {
    private static zzru zza;

    public static synchronized zzrk zza(zzrf zzrfVar) {
        if (zza == null) {
            zza = new zzru(null);
        }
        return (zzrk) zza.get(zzrfVar);
    }

    public static synchronized zzrk zzb(String str) {
        return zza(zzrf.zzd("play-services-mlkit-document-scanner").zzd());
    }
}
