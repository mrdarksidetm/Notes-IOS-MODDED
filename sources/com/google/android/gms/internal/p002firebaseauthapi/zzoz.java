package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzoz<P> {
    private final Map<zzzc, List<zzpb<P>>> zza;
    private final zzpb<P> zzb;
    private final Class<P> zzc;
    private final zzng zzd;

    private zzoz(Map<zzzc, List<zzpb<P>>> map, List<zzpb<P>> list, zzpb<P> zzpbVar, zzng zzngVar, Class<P> cls) {
        this.zza = map;
        this.zzb = zzpbVar;
        this.zzc = cls;
        this.zzd = zzngVar;
    }

    public static <P> zzoy<P> zza(Class<P> cls) {
        return new zzoy<>(cls);
    }

    public final zzng zza() {
        return this.zzd;
    }

    public final List<zzpb<P>> zza(byte[] bArr) {
        List<zzpb<P>> list = this.zza.get(zzzc.zza(bArr));
        return list != null ? list : Collections.emptyList();
    }

    public final zzpb<P> zzb() {
        return this.zzb;
    }

    public final Class<P> zzc() {
        return this.zzc;
    }

    public final Collection<List<zzpb<P>>> zzd() {
        return this.zza.values();
    }

    public final List<zzpb<P>> zze() {
        return zza(zzbj.zza);
    }

    public final boolean zzf() {
        return !this.zzd.zza().isEmpty();
    }
}
