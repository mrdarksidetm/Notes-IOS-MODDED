package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class zzdv extends zzcw {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final zzb zzd;

    public static final class zza {
        private Integer zza;
        private Integer zzb;
        private Integer zzc;
        private zzb zzd;

        private zza() {
            this.zza = null;
            this.zzb = null;
            this.zzc = null;
            this.zzd = zzb.zzc;
        }

        public final zza zza(int i10) {
            this.zzb = 12;
            return this;
        }

        public final zza zza(zzb zzbVar) {
            this.zzd = zzbVar;
            return this;
        }

        public final zzdv zza() throws GeneralSecurityException {
            Integer num = this.zza;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.zzd == null) {
                throw new GeneralSecurityException("Variant is not set");
            }
            if (this.zzb == null) {
                throw new GeneralSecurityException("IV size is not set");
            }
            if (this.zzc != null) {
                return new zzdv(num.intValue(), this.zzb.intValue(), this.zzc.intValue(), this.zzd);
            }
            throw new GeneralSecurityException("Tag size is not set");
        }

        public final zza zzb(int i10) throws InvalidAlgorithmParameterException {
            if (i10 != 16 && i10 != 24 && i10 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
            }
            this.zza = Integer.valueOf(i10);
            return this;
        }

        public final zza zzc(int i10) {
            this.zzc = 16;
            return this;
        }
    }

    public static final class zzb {
        public static final zzb zza = new zzb("TINK");
        public static final zzb zzb = new zzb("CRUNCHY");
        public static final zzb zzc = new zzb("NO_PREFIX");
        private final String zzd;

        private zzb(String str) {
            this.zzd = str;
        }

        public final String toString() {
            return this.zzd;
        }
    }

    private zzdv(int i10, int i11, int i12, zzb zzbVar) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = zzbVar;
    }

    public static zza zze() {
        return new zza();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzdv)) {
            return false;
        }
        zzdv zzdvVar = (zzdv) obj;
        return zzdvVar.zza == this.zza && zzdvVar.zzb == this.zzb && zzdvVar.zzc == this.zzc && zzdvVar.zzd == this.zzd;
    }

    public final int hashCode() {
        return Objects.hash(zzdv.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), this.zzd);
    }

    public final String toString() {
        return "AesGcm Parameters (variant: " + String.valueOf(this.zzd) + ", " + this.zzb + "-byte IV, " + this.zzc + "-byte tag, and " + this.zza + "-byte key)";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzch
    public final boolean zza() {
        return this.zzd != zzb.zzc;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        return this.zzc;
    }

    public final zzb zzf() {
        return this.zzd;
    }
}
