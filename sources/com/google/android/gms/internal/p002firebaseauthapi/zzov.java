package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzov {
    private final Map<zzox, zzor<?, ?>> zza;
    private final Map<Class<?>, zzpd<?, ?>> zzb;

    private zzov(zzou zzouVar) {
        this.zza = new HashMap(zzouVar.zza);
        this.zzb = new HashMap(zzouVar.zzb);
    }

    public static zzou zza(zzov zzovVar) {
        return new zzou(zzovVar);
    }

    public final Class<?> zza(Class<?> cls) throws GeneralSecurityException {
        if (this.zzb.containsKey(cls)) {
            return this.zzb.get(cls).zza();
        }
        throw new GeneralSecurityException("No input primitive class for " + String.valueOf(cls) + " available");
    }

    public final <KeyT extends zzbp, PrimitiveT> PrimitiveT zza(KeyT keyt, Class<PrimitiveT> cls) throws GeneralSecurityException {
        zzox zzoxVar = new zzox(keyt.getClass(), cls);
        if (this.zza.containsKey(zzoxVar)) {
            return (PrimitiveT) this.zza.get(zzoxVar).zza(keyt);
        }
        throw new GeneralSecurityException("No PrimitiveConstructor for " + String.valueOf(zzoxVar) + " available");
    }

    public final <InputPrimitiveT, WrapperPrimitiveT> WrapperPrimitiveT zza(zzoz<InputPrimitiveT> zzozVar, Class<WrapperPrimitiveT> cls) throws GeneralSecurityException {
        if (!this.zzb.containsKey(cls)) {
            throw new GeneralSecurityException("No wrapper found for " + String.valueOf(cls));
        }
        zzpd<?, ?> zzpdVar = this.zzb.get(cls);
        if (zzozVar.zzc().equals(zzpdVar.zza()) && zzpdVar.zza().equals(zzozVar.zzc())) {
            return (WrapperPrimitiveT) zzpdVar.zza(zzozVar);
        }
        throw new GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
    }
}
