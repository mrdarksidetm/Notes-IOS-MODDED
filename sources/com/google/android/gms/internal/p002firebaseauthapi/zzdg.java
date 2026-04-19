package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class zzdg extends zzcw {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private final zzb zze;
    private final zzc zzf;

    public static final class zza {
        private Integer zza;
        private Integer zzb;
        private Integer zzc;
        private Integer zzd;
        private zzc zze;
        private zzb zzf;

        private zza() {
            this.zza = null;
            this.zzb = null;
            this.zzc = null;
            this.zzd = null;
            this.zze = null;
            this.zzf = zzb.zzc;
        }

        public final zza zza(int i10) throws InvalidAlgorithmParameterException {
            if (i10 != 16 && i10 != 24 && i10 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i10)));
            }
            this.zza = Integer.valueOf(i10);
            return this;
        }

        public final zza zza(zzb zzbVar) {
            this.zzf = zzbVar;
            return this;
        }

        public final zza zza(zzc zzcVar) {
            this.zze = zzcVar;
            return this;
        }

        public final zzdg zza() throws GeneralSecurityException {
            if (this.zza == null) {
                throw new GeneralSecurityException("AES key size is not set");
            }
            if (this.zzb == null) {
                throw new GeneralSecurityException("HMAC key size is not set");
            }
            if (this.zzc == null) {
                throw new GeneralSecurityException("iv size is not set");
            }
            Integer num = this.zzd;
            if (num == null) {
                throw new GeneralSecurityException("tag size is not set");
            }
            if (this.zze == null) {
                throw new GeneralSecurityException("hash type is not set");
            }
            if (this.zzf == null) {
                throw new GeneralSecurityException("variant is not set");
            }
            int iIntValue = num.intValue();
            zzc zzcVar = this.zze;
            if (zzcVar == zzc.zza) {
                if (iIntValue > 20) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", Integer.valueOf(iIntValue)));
                }
            } else if (zzcVar == zzc.zzb) {
                if (iIntValue > 28) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", Integer.valueOf(iIntValue)));
                }
            } else if (zzcVar == zzc.zzc) {
                if (iIntValue > 32) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", Integer.valueOf(iIntValue)));
                }
            } else if (zzcVar == zzc.zzd) {
                if (iIntValue > 48) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", Integer.valueOf(iIntValue)));
                }
            } else {
                if (zzcVar != zzc.zze) {
                    throw new GeneralSecurityException("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
                }
                if (iIntValue > 64) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", Integer.valueOf(iIntValue)));
                }
            }
            return new zzdg(this.zza.intValue(), this.zzb.intValue(), this.zzc.intValue(), this.zzd.intValue(), this.zzf, this.zze);
        }

        public final zza zzb(int i10) throws InvalidAlgorithmParameterException {
            if (i10 < 16) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", Integer.valueOf(i10)));
            }
            this.zzb = Integer.valueOf(i10);
            return this;
        }

        public final zza zzc(int i10) throws GeneralSecurityException {
            if (i10 < 12 || i10 > 16) {
                throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", Integer.valueOf(i10)));
            }
            this.zzc = Integer.valueOf(i10);
            return this;
        }

        public final zza zzd(int i10) throws GeneralSecurityException {
            if (i10 < 10) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i10)));
            }
            this.zzd = Integer.valueOf(i10);
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

    public static final class zzc {
        public static final zzc zza = new zzc("SHA1");
        public static final zzc zzb = new zzc("SHA224");
        public static final zzc zzc = new zzc("SHA256");
        public static final zzc zzd = new zzc("SHA384");
        public static final zzc zze = new zzc("SHA512");
        private final String zzf;

        private zzc(String str) {
            this.zzf = str;
        }

        public final String toString() {
            return this.zzf;
        }
    }

    private zzdg(int i10, int i11, int i12, int i13, zzb zzbVar, zzc zzcVar) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = i13;
        this.zze = zzbVar;
        this.zzf = zzcVar;
    }

    public static zza zzf() {
        return new zza();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzdg)) {
            return false;
        }
        zzdg zzdgVar = (zzdg) obj;
        return zzdgVar.zza == this.zza && zzdgVar.zzb == this.zzb && zzdgVar.zzc == this.zzc && zzdgVar.zzd == this.zzd && zzdgVar.zze == this.zze && zzdgVar.zzf == this.zzf;
    }

    public final int hashCode() {
        return Objects.hash(zzdg.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd), this.zze, this.zzf);
    }

    public final String toString() {
        return "AesCtrHmacAead Parameters (variant: " + String.valueOf(this.zze) + ", hashType: " + String.valueOf(this.zzf) + ", " + this.zzc + "-byte IV, and " + this.zzd + "-byte tags, and " + this.zza + "-byte AES key, and " + this.zzb + "-byte HMAC key)";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzch
    public final boolean zza() {
        return this.zze != zzb.zzc;
    }

    public final int zzb() {
        return this.zza;
    }

    public final int zzc() {
        return this.zzb;
    }

    public final int zzd() {
        return this.zzc;
    }

    public final int zze() {
        return this.zzd;
    }

    public final zzc zzg() {
        return this.zzf;
    }

    public final zzb zzh() {
        return this.zze;
    }
}
