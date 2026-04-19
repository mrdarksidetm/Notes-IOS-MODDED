package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzft;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class zzfp extends zzcu {
    private final zzft zza;
    private final zzze zzb;
    private final zzzc zzc;
    private final Integer zzd;

    private zzfp(zzft zzftVar, zzze zzzeVar, zzzc zzzcVar, Integer num) {
        this.zza = zzftVar;
        this.zzb = zzzeVar;
        this.zzc = zzzcVar;
        this.zzd = num;
    }

    public static zzfp zza(zzft zzftVar, zzze zzzeVar, Integer num) throws GeneralSecurityException {
        zzzc zzzcVarZzb;
        zzft.zza zzaVarZzc = zzftVar.zzc();
        zzft.zza zzaVar = zzft.zza.zzb;
        if (zzaVarZzc != zzaVar && num == null) {
            throw new GeneralSecurityException("For given Variant " + String.valueOf(zzftVar.zzc()) + " the value of idRequirement must be non-null");
        }
        if (zzftVar.zzc() == zzaVar && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzzeVar.zza() != 32) {
            throw new GeneralSecurityException("XAesGcmKey key must be constructed with key of length 32 bytes, not " + zzzeVar.zza());
        }
        if (zzftVar.zzc() == zzaVar) {
            zzzcVarZzb = zzog.zza;
        } else {
            if (zzftVar.zzc() != zzft.zza.zza) {
                throw new IllegalStateException("Unknown Variant: " + String.valueOf(zzftVar.zzc()));
            }
            zzzcVarZzb = zzog.zzb(num.intValue());
        }
        return new zzfp(zzftVar, zzzeVar, zzzcVarZzb, num);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbp
    public final Integer zza() {
        return this.zzd;
    }

    public final zzft zzb() {
        return this.zza;
    }

    public final zzzc zzc() {
        return this.zzc;
    }

    public final zzze zzd() {
        return this.zzb;
    }
}
