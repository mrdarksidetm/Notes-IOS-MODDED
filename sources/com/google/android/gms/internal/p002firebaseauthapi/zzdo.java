package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzdv;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class zzdo extends zzcu {
    private final zzdv zza;
    private final zzze zzb;
    private final zzzc zzc;
    private final Integer zzd;

    public static class zza {
        private zzdv zza;
        private zzze zzb;
        private Integer zzc;

        private zza() {
            this.zza = null;
            this.zzb = null;
            this.zzc = null;
        }

        public final zza zza(zzdv zzdvVar) {
            this.zza = zzdvVar;
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

        public final zzdo zza() throws GeneralSecurityException {
            zzzc zzzcVarZzb;
            zzdv zzdvVar = this.zza;
            if (zzdvVar == null || this.zzb == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (zzdvVar.zzc() != this.zzb.zza()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.zza.zza() && this.zzc == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.zza.zza() && this.zzc != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            if (this.zza.zzf() == zzdv.zzb.zzc) {
                zzzcVarZzb = zzog.zza;
            } else if (this.zza.zzf() == zzdv.zzb.zzb) {
                zzzcVarZzb = zzog.zza(this.zzc.intValue());
            } else {
                if (this.zza.zzf() != zzdv.zzb.zza) {
                    throw new IllegalStateException("Unknown AesGcmParameters.Variant: " + String.valueOf(this.zza.zzf()));
                }
                zzzcVarZzb = zzog.zzb(this.zzc.intValue());
            }
            return new zzdo(this.zza, this.zzb, zzzcVarZzb, this.zzc);
        }
    }

    private zzdo(zzdv zzdvVar, zzze zzzeVar, zzzc zzzcVar, Integer num) {
        this.zza = zzdvVar;
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

    public final zzdv zzc() {
        return this.zza;
    }

    public final zzzc zzd() {
        return this.zzc;
    }

    public final zzze zze() {
        return this.zzb;
    }
}
