package com.google.android.gms.internal.mlkit_vision_document_scanner;

/* JADX INFO: loaded from: classes.dex */
public enum zzlo implements zzat {
    FORMAT_UNKNOWN(0),
    FORMAT_JPEG(1),
    FORMAT_PDF(2);

    private final int zze;

    zzlo(int i10) {
        this.zze = i10;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_document_scanner.zzat
    public final int zza() {
        return this.zze;
    }
}
