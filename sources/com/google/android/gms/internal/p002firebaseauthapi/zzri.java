package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzil;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class zzri implements zzqa {
    private static final zzil.zza zza = zzil.zza.zzb;

    public zzri(zzqd zzqdVar) throws GeneralSecurityException {
        if (!zza.zza()) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
    }
}
