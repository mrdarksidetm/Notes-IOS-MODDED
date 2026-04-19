package com.google.android.gms.internal.mlkit_vision_document_scanner;

/* JADX INFO: loaded from: classes.dex */
public final class zzrw {
    private static zzrw zza;

    private zzrw() {
    }

    public static synchronized zzrw zza() {
        if (zza == null) {
            zza = new zzrw();
        }
        return zza;
    }
}
