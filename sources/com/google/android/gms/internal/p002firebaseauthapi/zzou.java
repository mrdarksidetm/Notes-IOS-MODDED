package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzou {
    private final Map<zzox, zzor<?, ?>> zza;
    private final Map<Class<?>, zzpd<?, ?>> zzb;

    private zzou() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    private zzou(zzov zzovVar) {
        this.zza = new HashMap(zzovVar.zza);
        this.zzb = new HashMap(zzovVar.zzb);
    }

    public final <KeyT extends zzbp, PrimitiveT> zzou zza(zzor<KeyT, PrimitiveT> zzorVar) throws GeneralSecurityException {
        if (zzorVar == null) {
            throw new NullPointerException("primitive constructor must be non-null");
        }
        zzox zzoxVar = new zzox(zzorVar.zza(), zzorVar.zzb());
        if (this.zza.containsKey(zzoxVar)) {
            zzor<?, ?> zzorVar2 = this.zza.get(zzoxVar);
            if (!zzorVar2.equals(zzorVar) || !zzorVar.equals(zzorVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: " + String.valueOf(zzoxVar));
            }
        } else {
            this.zza.put(zzoxVar, zzorVar);
        }
        return this;
    }

    public final <InputPrimitiveT, WrapperPrimitiveT> zzou zza(zzpd<InputPrimitiveT, WrapperPrimitiveT> zzpdVar) throws GeneralSecurityException {
        if (zzpdVar == null) {
            throw new NullPointerException("wrapper must be non-null");
        }
        Class<WrapperPrimitiveT> clsZzb = zzpdVar.zzb();
        if (this.zzb.containsKey(clsZzb)) {
            zzpd<?, ?> zzpdVar2 = this.zzb.get(clsZzb);
            if (!zzpdVar2.equals(zzpdVar) || !zzpdVar.equals(zzpdVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type" + String.valueOf(clsZzb));
            }
        } else {
            this.zzb.put(clsZzb, zzpdVar);
        }
        return this;
    }

    public final zzov zza() {
        return new zzov(this);
    }
}
