package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class zzpk {
    private final Class<? extends zzpj> zza;
    private final zzzc zzb;

    private zzpk(Class<? extends zzpj> cls, zzzc zzzcVar) {
        this.zza = cls;
        this.zzb = zzzcVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzpk)) {
            return false;
        }
        zzpk zzpkVar = (zzpk) obj;
        return zzpkVar.zza.equals(this.zza) && zzpkVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        return this.zza.getSimpleName() + ", object identifier: " + String.valueOf(this.zzb);
    }
}
