package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class zzgo {
    private static final ThreadLocal<Cipher> zza = new zzgn();

    public static AlgorithmParameterSpec zza(byte[] bArr) {
        return zza(bArr, 0, bArr.length);
    }

    public static AlgorithmParameterSpec zza(byte[] bArr, int i10, int i11) {
        Integer numZzb = zzpr.zzb();
        return (numZzb == null || numZzb.intValue() > 19) ? new GCMParameterSpec(128, bArr, i10, i11) : new IvParameterSpec(bArr, i10, i11);
    }

    public static Cipher zza() {
        return zza.get();
    }

    public static SecretKey zzb(byte[] bArr) throws InvalidAlgorithmParameterException {
        zzzb.zza(bArr.length);
        return new SecretKeySpec(bArr, "AES");
    }
}
