package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzbp;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzor<KeyT extends zzbp, PrimitiveT> {
    private final Class<KeyT> zza;
    private final Class<PrimitiveT> zzb;

    private zzor(Class<KeyT> cls, Class<PrimitiveT> cls2) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static <KeyT extends zzbp, PrimitiveT> zzor<KeyT, PrimitiveT> zza(zzot<KeyT, PrimitiveT> zzotVar, Class<KeyT> cls, Class<PrimitiveT> cls2) {
        return new zzoq(cls, cls2, zzotVar);
    }

    public final Class<KeyT> zza() {
        return this.zza;
    }

    public abstract PrimitiveT zza(KeyT keyt);

    public final Class<PrimitiveT> zzb() {
        return this.zzb;
    }
}
