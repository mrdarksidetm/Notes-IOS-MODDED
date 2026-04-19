package com.google.android.gms.internal.mlkit_common;

import ga.c;
import ga.d;

/* JADX INFO: loaded from: classes.dex */
final class zzki implements d {
    static final zzki zza = new zzki();
    private static final c zzb;
    private static final c zzc;
    private static final c zzd;
    private static final c zze;
    private static final c zzf;

    static {
        c.b bVarA = c.a("durationMs");
        zzbj zzbjVar = new zzbj();
        zzbjVar.zza(1);
        zzb = bVarA.b(zzbjVar.zzb()).a();
        c.b bVarA2 = c.a("handledErrors");
        zzbj zzbjVar2 = new zzbj();
        zzbjVar2.zza(2);
        zzc = bVarA2.b(zzbjVar2.zzb()).a();
        c.b bVarA3 = c.a("partiallyHandledErrors");
        zzbj zzbjVar3 = new zzbj();
        zzbjVar3.zza(3);
        zzd = bVarA3.b(zzbjVar3.zzb()).a();
        c.b bVarA4 = c.a("unhandledErrors");
        zzbj zzbjVar4 = new zzbj();
        zzbjVar4.zza(4);
        zze = bVarA4.b(zzbjVar4.zzb()).a();
        c.b bVarA5 = c.a("httpResponseCode");
        zzbj zzbjVar5 = new zzbj();
        zzbjVar5.zza(5);
        zzf = bVarA5.b(zzbjVar5.zzb()).a();
    }

    private zzki() {
    }

    @Override // ga.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        throw null;
    }
}
