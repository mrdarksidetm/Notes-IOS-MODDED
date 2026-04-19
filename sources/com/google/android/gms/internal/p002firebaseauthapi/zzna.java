package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzvq;

/* JADX INFO: loaded from: classes.dex */
public class zzna<P> implements zzbs<P> {
    final String zza;
    final zzvq.zzb zzb;
    private final Class<P> zzc;

    zzna(String str, Class<P> cls, zzvq.zzb zzbVar, zzalp<? extends zzalc> zzalpVar) {
        this.zza = str;
        this.zzc = cls;
        this.zzb = zzbVar;
    }

    public static <P> zzbs<P> zza(String str, Class<P> cls, zzvq.zzb zzbVar, zzalp<? extends zzalc> zzalpVar) {
        return new zzna(str, cls, zzbVar, zzalpVar);
    }

    public static <P> zzcj<P> zza(String str, Class<P> cls, zzalp<? extends zzalc> zzalpVar) {
        return new zznd(str, cls, zzalpVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbs
    public final zzvq zza(zzaip zzaipVar) {
        zzpc zzpcVar = (zzpc) zzof.zza().zza(zznv.zza().zza(zzof.zza().zza(zzpf.zza((zzvu) ((zzajy) zzvu.zza().zza(this.zza).zza(zzaipVar).zza(zzws.RAW).zze()))), (Integer) null), zzpc.class, zzbq.zza());
        return (zzvq) ((zzajy) zzvq.zza().zza(zzpcVar.zzf()).zza(zzpcVar.zzd()).zza(zzpcVar.zza()).zze());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbs
    public final Class<P> zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbs
    public final P zzb(zzaip zzaipVar) {
        return (P) zzoc.zza().zza(zzof.zza().zza(zzpc.zza(this.zza, zzaipVar, this.zzb, zzws.RAW, null), zzbq.zza()), this.zzc);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbs
    public final String zzb() {
        return this.zza;
    }
}
