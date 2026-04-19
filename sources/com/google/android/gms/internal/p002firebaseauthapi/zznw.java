package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zznw {
    private static final zznw zza = new zznw();
    private final Map<Class<? extends zzch>, zznz<? extends zzch>> zzb = new HashMap();

    public static zznw zza() {
        return zza;
    }

    public final synchronized <ParametersT extends zzch> void zza(zznz<ParametersT> zznzVar, Class<ParametersT> cls) {
        zznz<? extends zzch> zznzVar2 = this.zzb.get(cls);
        if (zznzVar2 != null && !zznzVar2.equals(zznzVar)) {
            throw new GeneralSecurityException("Different key creator for parameters class already inserted");
        }
        this.zzb.put(cls, zznzVar);
    }
}
