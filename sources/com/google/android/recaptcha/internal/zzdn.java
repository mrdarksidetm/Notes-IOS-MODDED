package com.google.android.recaptcha.internal;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdn {
    public static final zzoy zza(zzbt zzbtVar, zzbt zzbtVar2) {
        zzox zzoxVarZzf = zzoy.zzf();
        zzoxVarZzf.zzp(zznr.zzb(zzbtVar.zzb()));
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        zzoxVarZzf.zzq(zznp.zza(zzbtVar.zza(timeUnit)));
        zzoxVarZzf.zzd(zznr.zzb(zzbtVar2.zzb()));
        zzoxVarZzf.zze(zznp.zza(zzbtVar2.zza(timeUnit)));
        return (zzoy) zzoxVarZzf.zzj();
    }
}
