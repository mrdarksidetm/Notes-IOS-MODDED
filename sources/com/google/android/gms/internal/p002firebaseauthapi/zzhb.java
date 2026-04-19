package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes.dex */
final class zzhb extends ThreadLocal<Cipher> {
    zzhb() {
    }

    private static Cipher zza() {
        try {
            Cipher cipherZza = zzyf.zza.zza("ChaCha20-Poly1305");
            if (zzhc.zzb(cipherZza)) {
                return cipherZza;
            }
            return null;
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ Cipher initialValue() {
        return zza();
    }
}
