package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class zznp {
    private final zzbr zza;
    private final int zzb;
    private final String zzc;
    private final String zzd;

    private zznp(zzbr zzbrVar, int i10, String str, String str2) {
        this.zza = zzbrVar;
        this.zzb = i10;
        this.zzc = str;
        this.zzd = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zznp)) {
            return false;
        }
        zznp zznpVar = (zznp) obj;
        return this.zza == zznpVar.zza && this.zzb == zznpVar.zzb && this.zzc.equals(zznpVar.zzc) && this.zzd.equals(zznpVar.zzd);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, Integer.valueOf(this.zzb), this.zzc, this.zzd);
    }

    public final String toString() {
        return String.format("(status=%s, keyId=%s, keyType='%s', keyPrefix='%s')", this.zza, Integer.valueOf(this.zzb), this.zzc, this.zzd);
    }

    public final int zza() {
        return this.zzb;
    }
}
