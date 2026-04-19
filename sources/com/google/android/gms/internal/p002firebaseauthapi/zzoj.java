package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzpj;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzoj<SerializationT extends zzpj> {
    private final zzzc zza;
    private final Class<SerializationT> zzb;

    private zzoj(zzzc zzzcVar, Class<SerializationT> cls) {
        this.zza = zzzcVar;
        this.zzb = cls;
    }

    public static <SerializationT extends zzpj> zzoj<SerializationT> zza(zzol<SerializationT> zzolVar, zzzc zzzcVar, Class<SerializationT> cls) {
        return new zzoi(zzzcVar, cls, zzolVar);
    }

    public abstract zzch zza(SerializationT serializationt);

    public final zzzc zza() {
        return this.zza;
    }

    public final Class<SerializationT> zzb() {
        return this.zzb;
    }
}
