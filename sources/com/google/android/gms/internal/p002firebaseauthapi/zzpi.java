package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzpi {
    private final Map<zzpn, zzmw<?, ?>> zza;
    private final Map<zzpk, zzms<?>> zzb;
    private final Map<zzpn, zzon<?, ?>> zzc;
    private final Map<zzpk, zzoj<?>> zzd;

    private zzpi(zzpl zzplVar) {
        this.zza = new HashMap(zzplVar.zza);
        this.zzb = new HashMap(zzplVar.zzb);
        this.zzc = new HashMap(zzplVar.zzc);
        this.zzd = new HashMap(zzplVar.zzd);
    }

    public final <SerializationT extends zzpj> zzbp zza(SerializationT serializationt, zzcn zzcnVar) throws GeneralSecurityException {
        zzpk zzpkVar = new zzpk(serializationt.getClass(), serializationt.zzc());
        if (this.zzb.containsKey(zzpkVar)) {
            return this.zzb.get(zzpkVar).zza(serializationt, zzcnVar);
        }
        throw new GeneralSecurityException("No Key Parser for requested key type " + String.valueOf(zzpkVar) + " available");
    }

    public final <SerializationT extends zzpj> zzch zza(SerializationT serializationt) throws GeneralSecurityException {
        zzpk zzpkVar = new zzpk(serializationt.getClass(), serializationt.zzc());
        if (this.zzd.containsKey(zzpkVar)) {
            return this.zzd.get(zzpkVar).zza(serializationt);
        }
        throw new GeneralSecurityException("No Parameters Parser for requested key type " + String.valueOf(zzpkVar) + " available");
    }

    public final <KeyT extends zzbp, SerializationT extends zzpj> SerializationT zza(KeyT keyt, Class<SerializationT> cls, zzcn zzcnVar) throws GeneralSecurityException {
        zzpn zzpnVar = new zzpn(keyt.getClass(), cls);
        if (this.zza.containsKey(zzpnVar)) {
            return (SerializationT) this.zza.get(zzpnVar).zza(keyt, zzcnVar);
        }
        throw new GeneralSecurityException("No Key serializer for " + String.valueOf(zzpnVar) + " available");
    }

    public final <ParametersT extends zzch, SerializationT extends zzpj> SerializationT zza(ParametersT parameterst, Class<SerializationT> cls) throws GeneralSecurityException {
        zzpn zzpnVar = new zzpn(parameterst.getClass(), cls);
        if (this.zzc.containsKey(zzpnVar)) {
            return (SerializationT) this.zzc.get(zzpnVar).zza(parameterst);
        }
        throw new GeneralSecurityException("No Key Format serializer for " + String.valueOf(zzpnVar) + " available");
    }

    public final <SerializationT extends zzpj> boolean zzb(SerializationT serializationt) {
        return this.zzb.containsKey(new zzpk(serializationt.getClass(), serializationt.zzc()));
    }

    public final <SerializationT extends zzpj> boolean zzc(SerializationT serializationt) {
        return this.zzd.containsKey(new zzpk(serializationt.getClass(), serializationt.zzc()));
    }
}
