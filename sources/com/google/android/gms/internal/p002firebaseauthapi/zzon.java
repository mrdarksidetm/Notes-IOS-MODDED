package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzch;
import com.google.android.gms.internal.p002firebaseauthapi.zzpj;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzon<ParametersT extends zzch, SerializationT extends zzpj> {
    private final Class<ParametersT> zza;
    private final Class<SerializationT> zzb;

    private zzon(Class<ParametersT> cls, Class<SerializationT> cls2) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static <ParametersT extends zzch, SerializationT extends zzpj> zzon<ParametersT, SerializationT> zza(zzop<ParametersT, SerializationT> zzopVar, Class<ParametersT> cls, Class<SerializationT> cls2) {
        return new zzom(cls, cls2, zzopVar);
    }

    public abstract SerializationT zza(ParametersT parameterst);

    public final Class<ParametersT> zza() {
        return this.zza;
    }

    public final Class<SerializationT> zzb() {
        return this.zzb;
    }
}
