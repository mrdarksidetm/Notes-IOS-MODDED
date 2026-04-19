package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzwa;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzoy<P> {
    private final Class<P> zza;
    private Map<zzzc, List<zzpb<P>>> zzb;
    private final List<zzpb<P>> zzc;
    private zzpb<P> zzd;
    private zzng zze;

    private zzoy(Class<P> cls) {
        this.zzb = new HashMap();
        this.zzc = new ArrayList();
        this.zza = cls;
        this.zze = zzng.zza;
    }

    private final zzoy<P> zza(P p10, zzbp zzbpVar, zzwa.zzb zzbVar, boolean z10) throws GeneralSecurityException {
        if (this.zzb == null) {
            throw new IllegalStateException("addEntry cannot be called after build");
        }
        if (p10 == null) {
            throw new NullPointerException("`fullPrimitive` must not be null");
        }
        if (zzbVar.zzc() != zzvv.ENABLED) {
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
        zzpb<P> zzpbVar = new zzpb<>(p10, zzzc.zza(zzbj.zza(zzbVar)), zzbVar.zzc(), zzbVar.zzf(), zzbVar.zza(), zzbVar.zzb().zzf(), zzbpVar);
        Map<zzzc, List<zzpb<P>>> map = this.zzb;
        List<zzpb<P>> list = this.zzc;
        ArrayList arrayList = new ArrayList();
        arrayList.add(zzpbVar);
        List<zzpb<P>> listPut = map.put(((zzpb) zzpbVar).zzb, Collections.unmodifiableList(arrayList));
        if (listPut != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(listPut);
            arrayList2.add(zzpbVar);
            map.put(((zzpb) zzpbVar).zzb, Collections.unmodifiableList(arrayList2));
        }
        list.add(zzpbVar);
        if (z10) {
            if (this.zzd != null) {
                throw new IllegalStateException("you cannot set two primary primitives");
            }
            this.zzd = zzpbVar;
        }
        return this;
    }

    public final zzoy<P> zza(zzng zzngVar) {
        if (this.zzb == null) {
            throw new IllegalStateException("setAnnotations cannot be called after build");
        }
        this.zze = zzngVar;
        return this;
    }

    public final zzoy<P> zza(P p10, zzbp zzbpVar, zzwa.zzb zzbVar) {
        return zza(p10, zzbpVar, zzbVar, false);
    }

    public final zzoz<P> zza() {
        Map<zzzc, List<zzpb<P>>> map = this.zzb;
        if (map == null) {
            throw new IllegalStateException("build cannot be called twice");
        }
        zzoz<P> zzozVar = new zzoz<>(map, this.zzc, this.zzd, this.zze, this.zza);
        this.zzb = null;
        return zzozVar;
    }

    public final zzoy<P> zzb(P p10, zzbp zzbpVar, zzwa.zzb zzbVar) {
        return zza(p10, zzbpVar, zzbVar, true);
    }
}
