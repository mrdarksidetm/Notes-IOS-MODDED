package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzei;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class zzee extends zzcu {
    private final zzei zza;
    private final zzze zzb;
    private final zzzc zzc;
    private final Integer zzd;

    private zzee(zzei zzeiVar, zzze zzzeVar, zzzc zzzcVar, Integer num) {
        this.zza = zzeiVar;
        this.zzb = zzzeVar;
        this.zzc = zzzcVar;
        this.zzd = num;
    }

    public static zzee zza(zzei.zza zzaVar, zzze zzzeVar, Integer num) throws GeneralSecurityException {
        zzzc zzzcVarZzb;
        zzei.zza zzaVar2 = zzei.zza.zzc;
        if (zzaVar != zzaVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + String.valueOf(zzaVar) + " the value of idRequirement must be non-null");
        }
        if (zzaVar == zzaVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzzeVar.zza() != 32) {
            throw new GeneralSecurityException("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + zzzeVar.zza());
        }
        zzei zzeiVarZza = zzei.zza(zzaVar);
        if (zzeiVarZza.zzb() == zzaVar2) {
            zzzcVarZzb = zzog.zza;
        } else if (zzeiVarZza.zzb() == zzei.zza.zzb) {
            zzzcVarZzb = zzog.zza(num.intValue());
        } else {
            if (zzeiVarZza.zzb() != zzei.zza.zza) {
                throw new IllegalStateException("Unknown Variant: " + String.valueOf(zzeiVarZza.zzb()));
            }
            zzzcVarZzb = zzog.zzb(num.intValue());
        }
        return new zzee(zzeiVarZza, zzzeVar, zzzcVarZzb, num);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbp
    public final Integer zza() {
        return this.zzd;
    }

    public final zzei zzb() {
        return this.zza;
    }

    public final zzzc zzc() {
        return this.zzc;
    }

    public final zzze zzd() {
        return this.zzb;
    }
}
