package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: loaded from: classes.dex */
public final class zzze {
    private final zzzc zza;

    private zzze(zzzc zzzcVar) {
        this.zza = zzzcVar;
    }

    public static zzze zza(int i10) {
        return new zzze(zzzc.zza(zzpe.zza(i10)));
    }

    public static zzze zza(byte[] bArr, zzcn zzcnVar) {
        if (zzcnVar != null) {
            return new zzze(zzzc.zza(bArr));
        }
        throw new NullPointerException("SecretKeyAccess required");
    }

    public final int zza() {
        return this.zza.zza();
    }

    public final byte[] zza(zzcn zzcnVar) {
        if (zzcnVar != null) {
            return this.zza.zzb();
        }
        throw new NullPointerException("SecretKeyAccess required");
    }
}
