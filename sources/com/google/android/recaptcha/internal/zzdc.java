package com.google.android.recaptcha.internal;

import ae.j;
import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdc {
    private final String zza;
    private String zzb;
    private String zzc;
    private final Context zzd;
    private final zzdg zze;
    private String zzf;
    private Integer zzg;

    private zzdc(zzdc zzdcVar) {
        this(zzdcVar.zza, zzdcVar.zzb, zzdcVar.zzc, zzdcVar.zzd, zzdcVar.zze);
        this.zzf = zzdcVar.zzf;
        this.zzg = zzdcVar.zzg;
    }

    private zzdc(String str, String str2, String str3, Context context, zzdg zzdgVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = context;
        this.zze = zzdgVar;
    }

    public /* synthetic */ zzdc(String str, String str2, String str3, Context context, zzdg zzdgVar, j jVar) {
        this(str, str2, str3, context, zzdgVar);
    }

    public final zzdc zza() {
        return new zzdc(this);
    }

    public final zzdc zzb(int i10) {
        this.zzg = Integer.valueOf(i10);
        return this;
    }

    public final zzdc zzc(String str) {
        this.zzf = str;
        return this;
    }

    public final String zzd() {
        return this.zzc;
    }

    public final void zze(zzre zzreVar) {
        this.zze.zza(zzreVar);
    }

    public final zzdf zzf(int i10) {
        String str = this.zzb;
        String str2 = this.zzc;
        String str3 = this.zzf;
        zzbw zzbwVar = new zzbw();
        Context context = this.zzd;
        Integer num = this.zzg;
        return new zzdf(i10, this.zza, str, str2, str3, null, this.zze, zzbwVar, context, num);
    }
}
