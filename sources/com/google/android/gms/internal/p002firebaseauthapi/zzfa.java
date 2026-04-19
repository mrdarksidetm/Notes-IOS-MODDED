package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class zzfa extends zzcw {
    private final zzb zza;
    private final String zzb;
    private final zzc zzc;
    private final zzcw zzd;

    public static class zza {
        private zzb zza;
        private String zzb;
        private zzc zzc;
        private zzcw zzd;

        private zza() {
        }

        public final zza zza(zzcw zzcwVar) {
            this.zzd = zzcwVar;
            return this;
        }

        public final zza zza(zzb zzbVar) {
            this.zza = zzbVar;
            return this;
        }

        public final zza zza(zzc zzcVar) {
            this.zzc = zzcVar;
            return this;
        }

        public final zza zza(String str) {
            this.zzb = str;
            return this;
        }

        public final zzfa zza() throws GeneralSecurityException {
            if (this.zza == null) {
                this.zza = zzb.zzb;
            }
            if (this.zzb == null) {
                throw new GeneralSecurityException("kekUri must be set");
            }
            if (this.zzc == null) {
                throw new GeneralSecurityException("dekParsingStrategy must be set");
            }
            zzcw zzcwVar = this.zzd;
            if (zzcwVar == null) {
                throw new GeneralSecurityException("dekParametersForNewKeys must be set");
            }
            if (zzcwVar.zza()) {
                throw new GeneralSecurityException("dekParametersForNewKeys must not have ID Requirements");
            }
            zzc zzcVar = this.zzc;
            zzcw zzcwVar2 = this.zzd;
            boolean z10 = true;
            if ((!zzcVar.equals(zzc.zza) || !(zzcwVar2 instanceof zzdv)) && ((!zzcVar.equals(zzc.zzc) || !(zzcwVar2 instanceof zzei)) && ((!zzcVar.equals(zzc.zzb) || !(zzcwVar2 instanceof zzga)) && ((!zzcVar.equals(zzc.zzd) || !(zzcwVar2 instanceof zzdg)) && ((!zzcVar.equals(zzc.zze) || !(zzcwVar2 instanceof zzdm)) && (!zzcVar.equals(zzc.zzf) || !(zzcwVar2 instanceof zzec))))))) {
                z10 = false;
            }
            if (z10) {
                return new zzfa(this.zza, this.zzb, this.zzc, this.zzd);
            }
            throw new GeneralSecurityException("Cannot use parsing strategy " + this.zzc.toString() + " when new keys are picked according to " + String.valueOf(this.zzd) + ".");
        }
    }

    public static final class zzb {
        public static final zzb zza = new zzb("TINK");
        public static final zzb zzb = new zzb("NO_PREFIX");
        private final String zzc;

        private zzb(String str) {
            this.zzc = str;
        }

        public final String toString() {
            return this.zzc;
        }
    }

    public static final class zzc {
        public static final zzc zza = new zzc("ASSUME_AES_GCM");
        public static final zzc zzb = new zzc("ASSUME_XCHACHA20POLY1305");
        public static final zzc zzc = new zzc("ASSUME_CHACHA20POLY1305");
        public static final zzc zzd = new zzc("ASSUME_AES_CTR_HMAC");
        public static final zzc zze = new zzc("ASSUME_AES_EAX");
        public static final zzc zzf = new zzc("ASSUME_AES_GCM_SIV");
        private final String zzg;

        private zzc(String str) {
            this.zzg = str;
        }

        public final String toString() {
            return this.zzg;
        }
    }

    private zzfa(zzb zzbVar, String str, zzc zzcVar, zzcw zzcwVar) {
        this.zza = zzbVar;
        this.zzb = str;
        this.zzc = zzcVar;
        this.zzd = zzcwVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzfa)) {
            return false;
        }
        zzfa zzfaVar = (zzfa) obj;
        return zzfaVar.zzc.equals(this.zzc) && zzfaVar.zzd.equals(this.zzd) && zzfaVar.zzb.equals(this.zzb) && zzfaVar.zza.equals(this.zza);
    }

    public final int hashCode() {
        return Objects.hash(zzfa.class, this.zzb, this.zzc, this.zzd, this.zza);
    }

    public final String toString() {
        return "LegacyKmsEnvelopeAead Parameters (kekUri: " + this.zzb + ", dekParsingStrategy: " + String.valueOf(this.zzc) + ", dekParametersForNewKeys: " + String.valueOf(this.zzd) + ", variant: " + String.valueOf(this.zza) + ")";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzch
    public final boolean zza() {
        return this.zza != zzb.zzb;
    }

    public final zzcw zzb() {
        return this.zzd;
    }

    public final zzb zzc() {
        return this.zza;
    }

    public final String zzd() {
        return this.zzb;
    }
}
