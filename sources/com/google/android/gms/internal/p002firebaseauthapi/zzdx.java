package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzec;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class zzdx extends zzcu {
    private final zzec zza;
    private final zzze zzb;
    private final zzzc zzc;
    private final Integer zzd;

    public static class zza {
        private zzec zza;
        private zzze zzb;
        private Integer zzc;

        private zza() {
            this.zza = null;
            this.zzb = null;
            this.zzc = null;
        }

        public final zza zza(zzec zzecVar) {
            this.zza = zzecVar;
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

        public final zzdx zza() throws GeneralSecurityException {
            zzzc zzzcVarZzb;
            zzec zzecVar = this.zza;
            if (zzecVar == null || this.zzb == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (zzecVar.zzb() != this.zzb.zza()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.zza.zza() && this.zzc == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.zza.zza() && this.zzc != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            if (this.zza.zzd() == zzec.zza.zzc) {
                zzzcVarZzb = zzog.zza;
            } else if (this.zza.zzd() == zzec.zza.zzb) {
                zzzcVarZzb = zzog.zza(this.zzc.intValue());
            } else {
                if (this.zza.zzd() != zzec.zza.zza) {
                    throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: " + String.valueOf(this.zza.zzd()));
                }
                zzzcVarZzb = zzog.zzb(this.zzc.intValue());
            }
            return new zzdx(this.zza, this.zzb, zzzcVarZzb, this.zzc);
        }
    }

    private zzdx(zzec zzecVar, zzze zzzeVar, zzzc zzzcVar, Integer num) {
        this.zza = zzecVar;
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

    public final zzec zzc() {
        return this.zza;
    }

    public final zzzc zzd() {
        return this.zzc;
    }

    public final zzze zze() {
        return this.zzb;
    }
}
