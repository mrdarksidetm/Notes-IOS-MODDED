package com.google.android.gms.internal.mlkit_common;

/* JADX INFO: loaded from: classes.dex */
public enum zznq implements zzbl {
    SOURCE_UNKNOWN(0),
    APP_ASSET(1),
    LOCAL(2),
    CLOUD(3),
    SDK_BUILT_IN(4),
    URI(5);

    private final int zzh;

    zznq(int i10) {
        this.zzh = i10;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzbl
    public final int zza() {
        return this.zzh;
    }
}
