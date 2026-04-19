package com.google.android.gms.internal.mlkit_common;

/* JADX INFO: loaded from: classes.dex */
final class zzao extends zzag {
    private final zzaq zza;

    zzao(zzaq zzaqVar, int i10) {
        super(zzaqVar.size(), i10);
        this.zza = zzaqVar;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzag
    protected final Object zza(int i10) {
        return this.zza.get(i10);
    }
}
