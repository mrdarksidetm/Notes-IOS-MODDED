package com.google.android.gms.internal.mlkit_vision_document_scanner;

import com.google.android.gms.common.api.a;

/* JADX INFO: loaded from: classes.dex */
public final class zzlm {
    private Integer zza;
    private zzln zzb;
    private Boolean zzc;
    private Boolean zzd;
    private Boolean zze;
    private Boolean zzf;
    private zzad zzg;
    private Boolean zzh;
    private Boolean zzi;
    private Boolean zzj;
    private Boolean zzk;
    private Integer zzl;

    public final zzlm zzb(zzln zzlnVar) {
        this.zzb = zzlnVar;
        return this;
    }

    public final zzlm zzc(Boolean bool) {
        this.zzk = bool;
        return this;
    }

    public final zzlm zzd(Boolean bool) {
        this.zzf = bool;
        return this;
    }

    public final zzlm zze(Boolean bool) {
        this.zzc = bool;
        return this;
    }

    public final zzlm zzf(Boolean bool) {
        this.zzd = bool;
        return this;
    }

    public final zzlm zzg(Integer num) {
        this.zza = Integer.valueOf(num.intValue() & a.e.API_PRIORITY_OTHER);
        return this;
    }

    public final zzlm zzh(Boolean bool) {
        this.zze = bool;
        return this;
    }

    public final zzlm zzi(Boolean bool) {
        this.zzh = bool;
        return this;
    }

    public final zzlm zzj(Integer num) {
        this.zzl = num;
        return this;
    }

    public final zzlm zzk(zzad zzadVar) {
        this.zzg = zzadVar;
        return this;
    }

    public final zzlm zzl(Boolean bool) {
        this.zzi = bool;
        return this;
    }

    public final zzlm zzm(Boolean bool) {
        this.zzj = bool;
        return this;
    }

    public final zzlq zzo() {
        return new zzlq(this, null);
    }
}
