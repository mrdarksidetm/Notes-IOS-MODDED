package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class zzcg {
    private static final CopyOnWriteArrayList<zzcd> zza = new CopyOnWriteArrayList<>();

    public static zzcd zza(String str) throws GeneralSecurityException {
        for (zzcd zzcdVar : zza) {
            if (zzcdVar.zzb(str)) {
                return zzcdVar;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: " + str);
    }
}
