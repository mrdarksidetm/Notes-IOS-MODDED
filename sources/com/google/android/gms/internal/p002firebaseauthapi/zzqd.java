package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzqk;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class zzqd extends zzqo {
    private final zzqk zza;
    private final zzze zzb;
    private final zzzc zzc;
    private final Integer zzd;

    public static class zza {
        private zzqk zza;
        private zzze zzb;
        private Integer zzc;

        private zza() {
            this.zza = null;
            this.zzb = null;
            this.zzc = null;
        }

        public final zza zza(zzqk zzqkVar) {
            this.zza = zzqkVar;
            return this;
        }

        public final zza zza(zzze zzzeVar) {
            this.zzb = zzzeVar;
            return this;
        }

        public final zza zza(Integer num) {
            this.zzc = num;
            return this;
        }

        public final zzqd zza() throws GeneralSecurityException {
            zzzc zzzcVarZza;
            zzqk zzqkVar = this.zza;
            if (zzqkVar == null || this.zzb == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (zzqkVar.zzc() != this.zzb.zza()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.zza.zza() && this.zzc == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.zza.zza() && this.zzc != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            if (this.zza.zzf() == zzqk.zzb.zzd) {
                zzzcVarZza = zzog.zza;
            } else if (this.zza.zzf() == zzqk.zzb.zzc || this.zza.zzf() == zzqk.zzb.zzb) {
                zzzcVarZza = zzog.zza(this.zzc.intValue());
            } else {
                if (this.zza.zzf() != zzqk.zzb.zza) {
                    throw new IllegalStateException("Unknown HmacParameters.Variant: " + String.valueOf(this.zza.zzf()));
                }
                zzzcVarZza = zzog.zzb(this.zzc.intValue());
            }
            return new zzqd(this.zza, this.zzb, zzzcVarZza, this.zzc);
        }
    }

    private zzqd(zzqk zzqkVar, zzze zzzeVar, zzzc zzzcVar, Integer num) {
        this.zza = zzqkVar;
        this.zzb = zzzeVar;
        this.zzc = zzzcVar;
        this.zzd = num;
    }

    public static zza zzb() {
        return new zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbp
    public final Integer zza() {
        return this.zzd;
    }

    public final zzqk zzc() {
        return this.zza;
    }

    public final zzzc zzd() {
        return this.zzc;
    }

    public final zzze zze() {
        return this.zzb;
    }
}
