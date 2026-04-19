package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzvq;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
final class zznd<P> extends zzna<P> implements zzcj<P> {
    protected zznd(String str, Class<P> cls, zzalp<? extends zzalc> zzalpVar) {
        super(str, cls, zzvq.zzb.ASYMMETRIC_PRIVATE, zzalpVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcj
    public final zzvq zzc(zzaip zzaipVar) throws GeneralSecurityException {
        Object objZza = zzof.zza().zza(zzpc.zza(this.zza, zzaipVar, this.zzb, zzws.RAW, null), zzbq.zza());
        if (!(objZza instanceof zzck)) {
            throw new GeneralSecurityException("Key not private key");
        }
        zzpc zzpcVar = (zzpc) zzof.zza().zza(((zzck) objZza).zzb(), zzpc.class, zzbq.zza());
        return (zzvq) ((zzajy) zzvq.zza().zza(zzpcVar.zzf()).zza(zzpcVar.zzd()).zza(zzpcVar.zza()).zze());
    }
}
