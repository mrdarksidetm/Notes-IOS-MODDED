package com.google.android.gms.internal.p002firebaseauthapi;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public final class zzzf {
    private final BigInteger zza;

    private zzzf(BigInteger bigInteger) {
        this.zza = bigInteger;
    }

    public static zzzf zza(BigInteger bigInteger, zzcn zzcnVar) {
        if (zzcnVar != null) {
            return new zzzf(bigInteger);
        }
        throw new NullPointerException("SecretKeyAccess required");
    }

    public final BigInteger zza(zzcn zzcnVar) {
        if (zzcnVar != null) {
            return this.zza;
        }
        throw new NullPointerException("SecretKeyAccess required");
    }
}
