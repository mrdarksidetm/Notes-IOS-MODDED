package com.google.android.gms.internal.mlkit_common;

import ia.d;
import java.io.UnsupportedEncodingException;
import w8.m;

/* JADX INFO: loaded from: classes.dex */
public final class zzsv implements zzsj {
    private final zznh zza;
    private zzre zzb = new zzre();

    private zzsv(zznh zznhVar, int i10) {
        this.zza = zznhVar;
        zztg.zza();
    }

    public static zzsj zzf(zznh zznhVar) {
        return new zzsv(zznhVar, 0);
    }

    public static zzsj zzg() {
        return new zzsv(new zznh(), 0);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsj
    public final zzsj zza(zzng zzngVar) {
        this.zza.zzf(zzngVar);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsj
    public final zzsj zzb(zznn zznnVar) {
        this.zza.zzi(zznnVar);
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsj
    public final zzsj zzc(zzre zzreVar) {
        this.zzb = zzreVar;
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsj
    public final String zzd() {
        zzrg zzrgVarZzf = this.zza.zzk().zzf();
        return (zzrgVarZzf == null || zzaf.zzc(zzrgVarZzf.zzk())) ? "NA" : (String) m.k(zzrgVarZzf.zzk());
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzsj
    public final byte[] zze(int i10, boolean z10) {
        this.zzb.zzf(Boolean.valueOf(1 == (i10 ^ 1)));
        this.zzb.zze(Boolean.FALSE);
        this.zza.zzj(this.zzb.zzm());
        try {
            zztg.zza();
            if (i10 == 0) {
                return new d().i(zzlc.zza).j(true).h().b(this.zza.zzk()).getBytes("utf-8");
            }
            zznj zznjVarZzk = this.zza.zzk();
            zzbr zzbrVar = new zzbr();
            zzlc.zza.configure(zzbrVar);
            return zzbrVar.zza().zza(zznjVarZzk);
        } catch (UnsupportedEncodingException e10) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e10);
        }
    }
}
