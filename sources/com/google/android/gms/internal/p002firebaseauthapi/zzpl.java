package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzpl {
    private final Map<zzpn, zzmw<?, ?>> zza;
    private final Map<zzpk, zzms<?>> zzb;
    private final Map<zzpn, zzon<?, ?>> zzc;
    private final Map<zzpk, zzoj<?>> zzd;

    public zzpl() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
        this.zzc = new HashMap();
        this.zzd = new HashMap();
    }

    public zzpl(zzpi zzpiVar) {
        this.zza = new HashMap(zzpiVar.zza);
        this.zzb = new HashMap(zzpiVar.zzb);
        this.zzc = new HashMap(zzpiVar.zzc);
        this.zzd = new HashMap(zzpiVar.zzd);
    }

    public final zzpi zza() {
        return new zzpi(this);
    }

    public final <SerializationT extends zzpj> zzpl zza(zzms<SerializationT> zzmsVar) throws GeneralSecurityException {
        zzpk zzpkVar = new zzpk(zzmsVar.zzb(), zzmsVar.zza());
        if (this.zzb.containsKey(zzpkVar)) {
            zzms<?> zzmsVar2 = this.zzb.get(zzpkVar);
            if (!zzmsVar2.equals(zzmsVar) || !zzmsVar.equals(zzmsVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + String.valueOf(zzpkVar));
            }
        } else {
            this.zzb.put(zzpkVar, zzmsVar);
        }
        return this;
    }

    public final <KeyT extends zzbp, SerializationT extends zzpj> zzpl zza(zzmw<KeyT, SerializationT> zzmwVar) throws GeneralSecurityException {
        zzpn zzpnVar = new zzpn(zzmwVar.zza(), zzmwVar.zzb());
        if (this.zza.containsKey(zzpnVar)) {
            zzmw<?, ?> zzmwVar2 = this.zza.get(zzpnVar);
            if (!zzmwVar2.equals(zzmwVar) || !zzmwVar.equals(zzmwVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + String.valueOf(zzpnVar));
            }
        } else {
            this.zza.put(zzpnVar, zzmwVar);
        }
        return this;
    }

    public final <SerializationT extends zzpj> zzpl zza(zzoj<SerializationT> zzojVar) throws GeneralSecurityException {
        zzpk zzpkVar = new zzpk(zzojVar.zzb(), zzojVar.zza());
        if (this.zzd.containsKey(zzpkVar)) {
            zzoj<?> zzojVar2 = this.zzd.get(zzpkVar);
            if (!zzojVar2.equals(zzojVar) || !zzojVar.equals(zzojVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + String.valueOf(zzpkVar));
            }
        } else {
            this.zzd.put(zzpkVar, zzojVar);
        }
        return this;
    }

    public final <ParametersT extends zzch, SerializationT extends zzpj> zzpl zza(zzon<ParametersT, SerializationT> zzonVar) throws GeneralSecurityException {
        zzpn zzpnVar = new zzpn(zzonVar.zza(), zzonVar.zzb());
        if (this.zzc.containsKey(zzpnVar)) {
            zzon<?, ?> zzonVar2 = this.zzc.get(zzpnVar);
            if (!zzonVar2.equals(zzonVar) || !zzonVar.equals(zzonVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + String.valueOf(zzpnVar));
            }
        } else {
            this.zzc.put(zzpnVar, zzonVar);
        }
        return this;
    }
}
