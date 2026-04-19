package com.google.android.gms.internal.p002firebaseauthapi;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
final class zzmn {
    static final zzmn zza;
    BigInteger zzb;
    BigInteger zzc;
    BigInteger zzd;

    static {
        BigInteger bigInteger = BigInteger.ONE;
        zza = new zzmn(bigInteger, bigInteger, BigInteger.ZERO);
    }

    zzmn(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.zzb = bigInteger;
        this.zzc = bigInteger2;
        this.zzd = bigInteger3;
    }

    final boolean zza() {
        return this.zzd.equals(BigInteger.ZERO);
    }
}
