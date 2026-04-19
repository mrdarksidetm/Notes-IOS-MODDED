package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes.dex */
public final class zzpe {
    private static final ThreadLocal<SecureRandom> zza = new zzph();

    static /* synthetic */ SecureRandom zza() {
        SecureRandom secureRandomZzb = zzb();
        secureRandomZzb.nextLong();
        return secureRandomZzb;
    }

    public static byte[] zza(int i10) {
        byte[] bArr = new byte[i10];
        zza.get().nextBytes(bArr);
        return bArr;
    }

    private static SecureRandom zzb() {
        Provider providerZza = zzmi.zza();
        if (providerZza != null) {
            try {
                return SecureRandom.getInstance("SHA1PRNG", providerZza);
            } catch (GeneralSecurityException unused) {
            }
        }
        Provider providerZzb = zzmi.zzb();
        if (providerZzb != null) {
            try {
                return SecureRandom.getInstance("SHA1PRNG", providerZzb);
            } catch (GeneralSecurityException unused2) {
            }
        }
        return new SecureRandom();
    }
}
