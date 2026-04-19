package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class zzof {
    private static final zzof zza = (zzof) zzpp.zza(new zzpo() { // from class: com.google.android.gms.internal.firebase-auth-api.zzoe
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpo
        public final Object zza() {
            zzof zzofVar = new zzof();
            zzofVar.zza(zzmw.zza(new zzmy() { // from class: com.google.android.gms.internal.firebase-auth-api.zzoh
                @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmy
                public final zzpj zza(zzbp zzbpVar, zzcn zzcnVar) {
                    return ((zznc) zzbpVar).zza(zzcnVar);
                }
            }, zznc.class, zzpc.class));
            return zzofVar;
        }
    });
    private final AtomicReference<zzpi> zzb = new AtomicReference<>(new zzpl().zza());

    public static zzof zza() {
        return zza;
    }

    public final <SerializationT extends zzpj> zzbp zza(SerializationT serializationt, zzcn zzcnVar) {
        return this.zzb.get().zza(serializationt, zzcnVar);
    }

    public final <SerializationT extends zzpj> zzch zza(SerializationT serializationt) {
        return this.zzb.get().zza(serializationt);
    }

    public final <KeyT extends zzbp, SerializationT extends zzpj> SerializationT zza(KeyT keyt, Class<SerializationT> cls, zzcn zzcnVar) {
        return (SerializationT) this.zzb.get().zza(keyt, cls, zzcnVar);
    }

    public final <ParametersT extends zzch, SerializationT extends zzpj> SerializationT zza(ParametersT parameterst, Class<SerializationT> cls) {
        return (SerializationT) this.zzb.get().zza(parameterst, cls);
    }

    public final synchronized <SerializationT extends zzpj> void zza(zzms<SerializationT> zzmsVar) {
        this.zzb.set(new zzpl(this.zzb.get()).zza(zzmsVar).zza());
    }

    public final synchronized <KeyT extends zzbp, SerializationT extends zzpj> void zza(zzmw<KeyT, SerializationT> zzmwVar) {
        this.zzb.set(new zzpl(this.zzb.get()).zza(zzmwVar).zza());
    }

    public final synchronized <SerializationT extends zzpj> void zza(zzoj<SerializationT> zzojVar) {
        this.zzb.set(new zzpl(this.zzb.get()).zza(zzojVar).zza());
    }

    public final synchronized <ParametersT extends zzch, SerializationT extends zzpj> void zza(zzon<ParametersT, SerializationT> zzonVar) {
        this.zzb.set(new zzpl(this.zzb.get()).zza(zzonVar).zza());
    }

    public final <SerializationT extends zzpj> boolean zzb(SerializationT serializationt) {
        return this.zzb.get().zzb(serializationt);
    }

    public final <SerializationT extends zzpj> boolean zzc(SerializationT serializationt) {
        return this.zzb.get().zzc(serializationt);
    }
}
