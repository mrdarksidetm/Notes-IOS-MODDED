package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzdm;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class zzdh extends zzcu {
    private final zzdm zza;
    private final zzze zzb;
    private final zzzc zzc;
    private final Integer zzd;

    public static class zza {
        private zzdm zza;
        private zzze zzb;
        private Integer zzc;

        private zza() {
            this.zza = null;
            this.zzb = null;
            this.zzc = null;
        }

        public final zza zza(zzdm zzdmVar) {
            this.zza = zzdmVar;
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

        public final zzdh zza() throws GeneralSecurityException {
            zzzc zzzcVarZzb;
            zzdm zzdmVar = this.zza;
            if (zzdmVar == null || this.zzb == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (zzdmVar.zzc() != this.zzb.zza()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.zza.zza() && this.zzc == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.zza.zza() && this.zzc != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            if (this.zza.zzf() == zzdm.zza.zzc) {
                zzzcVarZzb = zzog.zza;
            } else if (this.zza.zzf() == zzdm.zza.zzb) {
                zzzcVarZzb = zzog.zza(this.zzc.intValue());
            } else {
                if (this.zza.zzf() != zzdm.zza.zza) {
                    throw new IllegalStateException("Unknown AesEaxParameters.Variant: " + String.valueOf(this.zza.zzf()));
                }
                zzzcVarZzb = zzog.zzb(this.zzc.intValue());
            }
            return new zzdh(this.zza, this.zzb, zzzcVarZzb, this.zzc);
        }
    }

    private zzdh(zzdm zzdmVar, zzze zzzeVar, zzzc zzzcVar, Integer num) {
        this.zza = zzdmVar;
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

    public final zzdm zzc() {
        return this.zza;
    }

    public final zzzc zzd() {
        return this.zzc;
    }

    public final zzze zze() {
        return this.zzb;
    }
}
