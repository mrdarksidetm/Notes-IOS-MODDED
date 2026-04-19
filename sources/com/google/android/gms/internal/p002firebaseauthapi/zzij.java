package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* JADX INFO: loaded from: classes.dex */
final class zzij extends ThreadLocal<Cipher> {
    zzij() {
    }

    private static Cipher zza() {
        try {
            Cipher cipherZza = zzyf.zza.zza("AES/GCM-SIV/NoPadding");
            if (zzik.zzb(cipherZza)) {
                return cipherZza;
            }
            return null;
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ Cipher initialValue() {
        return zza();
    }
}
