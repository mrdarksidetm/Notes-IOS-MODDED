package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzpj;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzms<SerializationT extends zzpj> {
    private final zzzc zza;
    private final Class<SerializationT> zzb;

    private zzms(zzzc zzzcVar, Class<SerializationT> cls) {
        this.zza = zzzcVar;
        this.zzb = cls;
    }

    public static <SerializationT extends zzpj> zzms<SerializationT> zza(zzmu<SerializationT> zzmuVar, zzzc zzzcVar, Class<SerializationT> cls) {
        return new zzmv(zzzcVar, cls, zzmuVar);
    }

    public abstract zzbp zza(SerializationT serializationt, zzcn zzcnVar);

    public final zzzc zza() {
        return this.zza;
    }

    public final Class<SerializationT> zzb() {
        return this.zzb;
    }
}
