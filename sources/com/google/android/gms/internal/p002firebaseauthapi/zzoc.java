package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class zzoc {
    private static zzoc zza = new zzoc();
    private final AtomicReference<zzov> zzb = new AtomicReference<>(new zzou().zza());

    zzoc() {
    }

    public static zzoc zza() {
        return zza;
    }

    public final <WrapperPrimitiveT> Class<?> zza(Class<WrapperPrimitiveT> cls) {
        return this.zzb.get().zza((Class<?>) cls);
    }

    public final <KeyT extends zzbp, PrimitiveT> PrimitiveT zza(KeyT keyt, Class<PrimitiveT> cls) {
        return (PrimitiveT) this.zzb.get().zza(keyt, cls);
    }

    public final <InputPrimitiveT, WrapperPrimitiveT> WrapperPrimitiveT zza(zzoz<InputPrimitiveT> zzozVar, Class<WrapperPrimitiveT> cls) {
        return (WrapperPrimitiveT) this.zzb.get().zza(zzozVar, cls);
    }

    public final synchronized <KeyT extends zzbp, PrimitiveT> void zza(zzor<KeyT, PrimitiveT> zzorVar) {
        this.zzb.set(zzov.zza(this.zzb.get()).zza(zzorVar).zza());
    }

    public final synchronized <InputPrimitiveT, WrapperPrimitiveT> void zza(zzpd<InputPrimitiveT, WrapperPrimitiveT> zzpdVar) {
        this.zzb.set(zzov.zza(this.zzb.get()).zza(zzpdVar).zza());
    }
}
