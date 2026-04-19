package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;

/* JADX INFO: loaded from: classes.dex */
public final class zzme {
    public static zzbg zza(String str) {
        return new zzmd(str, zza());
    }

    private static KeyStore zza() throws GeneralSecurityException {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            return keyStore;
        } catch (IOException e10) {
            throw new GeneralSecurityException(e10);
        }
    }

    public static boolean zzb(String str) {
        return zza().containsAlias(str);
    }
}
