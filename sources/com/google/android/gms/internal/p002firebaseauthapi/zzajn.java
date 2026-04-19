package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: loaded from: classes.dex */
final class zzajn {
    private final Object zza;
    private final int zzb;

    zzajn(Object obj, int i10) {
        this.zza = obj;
        this.zzb = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzajn)) {
            return false;
        }
        zzajn zzajnVar = (zzajn) obj;
        return this.zza == zzajnVar.zza && this.zzb == zzajnVar.zzb;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * 65535) + this.zzb;
    }
}
