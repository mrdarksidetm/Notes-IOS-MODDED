package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class zzdm extends zzcw {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final zza zzd;

    public static final class zza {
        public static final zza zza = new zza("TINK");
        public static final zza zzb = new zza("CRUNCHY");
        public static final zza zzc = new zza("NO_PREFIX");
        private final String zzd;

        private zza(String str) {
            this.zzd = str;
        }

        public final String toString() {
            return this.zzd;
        }
    }

    public static final class zzb {
        private Integer zza;
        private Integer zzb;
        private Integer zzc;
        private zza zzd;

        private zzb() {
            this.zza = null;
            this.zzb = null;
            this.zzc = null;
            this.zzd = zza.zzc;
        }

        public final zzb zza(int i10) throws GeneralSecurityException {
            if (i10 != 12 && i10 != 16) {
                throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i10)));
            }
            this.zzb = Integer.valueOf(i10);
            return this;
        }

        public final zzb zza(zza zzaVar) {
            this.zzd = zzaVar;
            return this;
        }

        public final zzdm zza() throws GeneralSecurityException {
            Integer num = this.zza;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.zzb == null) {
                throw new GeneralSecurityException("IV size is not set");
            }
            if (this.zzd == null) {
                throw new GeneralSecurityException("Variant is not set");
            }
            if (this.zzc != null) {
                return new zzdm(num.intValue(), this.zzb.intValue(), this.zzc.intValue(), this.zzd);
            }
            throw new GeneralSecurityException("Tag size is not set");
        }

        public final zzb zzb(int i10) throws InvalidAlgorithmParameterException {
            if (i10 != 16 && i10 != 24 && i10 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
            }
            this.zza = Integer.valueOf(i10);
            return this;
        }

        public final zzb zzc(int i10) {
            this.zzc = 16;
            return this;
        }
    }

    private zzdm(int i10, int i11, int i12, zza zzaVar) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = zzaVar;
    }

    public static zzb zze() {
        return new zzb();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzdm)) {
            return false;
        }
        zzdm zzdmVar = (zzdm) obj;
        return zzdmVar.zza == this.zza && zzdmVar.zzb == this.zzb && zzdmVar.zzc == this.zzc && zzdmVar.zzd == this.zzd;
    }

    public final int hashCode() {
        return Objects.hash(zzdm.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), this.zzd);
    }

    public final String toString() {
        return "AesEax Parameters (variant: " + String.valueOf(this.zzd) + ", " + this.zzb + "-byte IV, " + this.zzc + "-byte tag, and " + this.zza + "-byte key)";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzch
    public final boolean zza() {
        return this.zzd != zza.zzc;
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

    public final zza zzf() {
        return this.zzd;
    }
}
