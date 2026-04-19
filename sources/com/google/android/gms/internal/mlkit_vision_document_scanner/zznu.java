package com.google.android.gms.internal.mlkit_vision_document_scanner;

import com.google.android.gms.common.api.a;

/* JADX INFO: loaded from: classes.dex */
public final class zznu {
    private Long zza;
    private zzmk zzb;
    private zzlq zzc;
    private Integer zzd;

    public final zznu zzc(Long l10) {
        this.zza = Long.valueOf(l10.longValue() & Long.MAX_VALUE);
        return this;
    }

    public final zznu zzd(zzmk zzmkVar) {
        this.zzb = zzmkVar;
        return this;
    }

    public final zznu zze(zzlq zzlqVar) {
        this.zzc = zzlqVar;
        return this;
    }

    public final zznu zzf(Integer num) {
        this.zzd = Integer.valueOf(num.intValue() & a.e.API_PRIORITY_OTHER);
        return this;
    }

    public final zznw zzg() {
        return new zznw(this, null);
    }
}
