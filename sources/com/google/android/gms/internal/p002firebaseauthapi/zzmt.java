package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzil;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class zzmt {
    private static final Logger zza = Logger.getLogger(zzmt.class.getName());
    private static final zzmt zzb = new zzmt();
    private ConcurrentMap<String, zzbs<?>> zzc = new ConcurrentHashMap();
    private ConcurrentMap<String, Boolean> zzd = new ConcurrentHashMap();

    public static zzmt zza() {
        return zzb;
    }

    private final synchronized void zza(zzbs<?> zzbsVar, boolean z10, boolean z11) {
        String strZzb = zzbsVar.zzb();
        if (z11 && this.zzd.containsKey(strZzb) && !this.zzd.get(strZzb).booleanValue()) {
            throw new GeneralSecurityException("New keys are already disallowed for key type " + strZzb);
        }
        zzbs<?> zzbsVar2 = this.zzc.get(strZzb);
        if (zzbsVar2 != null && !zzbsVar2.getClass().equals(zzbsVar.getClass())) {
            zza.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type " + strZzb);
            throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", strZzb, zzbsVar2.getClass().getName(), zzbsVar.getClass().getName()));
        }
        this.zzc.putIfAbsent(strZzb, zzbsVar);
        this.zzd.put(strZzb, Boolean.valueOf(z11));
    }

    private final synchronized zzbs<?> zzc(String str) {
        if (!this.zzc.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type " + str);
        }
        return this.zzc.get(str);
    }

    public final zzbs<?> zza(String str) {
        return zzc(str);
    }

    public final <P> zzbs<P> zza(String str, Class<P> cls) throws GeneralSecurityException {
        zzbs<P> zzbsVar = (zzbs<P>) zzc(str);
        if (zzbsVar.zza().equals(cls)) {
            return zzbsVar;
        }
        throw new GeneralSecurityException("Primitive type " + cls.getName() + " not supported by key manager of type " + String.valueOf(zzbsVar.getClass()) + ", which only supports: " + String.valueOf(zzbsVar.zza()));
    }

    public final synchronized <P> void zza(zzbs<P> zzbsVar, zzil.zza zzaVar, boolean z10) {
        if (!zzaVar.zza()) {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
        zza((zzbs<?>) zzbsVar, false, z10);
    }

    public final synchronized <P> void zza(zzbs<P> zzbsVar, boolean z10) {
        zza(zzbsVar, zzil.zza.zza, z10);
    }

    public final boolean zzb(String str) {
        return this.zzd.get(str).booleanValue();
    }
}
