package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class zzer extends zzcw {
    private final String zza;
    private final zza zzb;

    public static final class zza {
        public static final zza zza = new zza("TINK");
        public static final zza zzb = new zza("NO_PREFIX");
        private final String zzc;

        private zza(String str) {
            this.zzc = str;
        }

        public final String toString() {
            return this.zzc;
        }
    }

    private zzer(String str, zza zzaVar) {
        this.zza = str;
        this.zzb = zzaVar;
    }

    public static zzer zza(String str, zza zzaVar) {
        return new zzer(str, zzaVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzer)) {
            return false;
        }
        zzer zzerVar = (zzer) obj;
        return zzerVar.zza.equals(this.zza) && zzerVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(zzer.class, this.zza, this.zzb);
    }

    public final String toString() {
        return "LegacyKmsAead Parameters (keyUri: " + this.zza + ", variant: " + String.valueOf(this.zzb) + ")";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzch
    public final boolean zza() {
        return this.zzb != zza.zzb;
    }

    public final zza zzb() {
        return this.zzb;
    }

    public final String zzc() {
        return this.zza;
    }
}
