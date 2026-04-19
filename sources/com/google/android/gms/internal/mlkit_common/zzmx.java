package com.google.android.gms.internal.mlkit_common;

/* JADX INFO: loaded from: classes.dex */
public enum zzmx implements zzbl {
    UNKNOWN(0),
    TRANSLATE(1);

    private final int zzd;

    zzmx(int i10) {
        this.zzd = i10;
    }

    public static zzmx zzb(int i10) {
        for (zzmx zzmxVar : values()) {
            if (zzmxVar.zzd == i10) {
                return zzmxVar;
            }
        }
        return UNKNOWN;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzbl
    public final int zza() {
        return this.zzd;
    }
}
