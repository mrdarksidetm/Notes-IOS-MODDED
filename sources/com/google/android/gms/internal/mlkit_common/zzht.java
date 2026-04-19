package com.google.android.gms.internal.mlkit_common;

import ga.c;
import ga.d;

/* JADX INFO: loaded from: classes.dex */
final class zzht implements d {
    static final zzht zza = new zzht();
    private static final c zzb;
    private static final c zzc;
    private static final c zzd;
    private static final c zze;
    private static final c zzf;
    private static final c zzg;

    static {
        c.b bVarA = c.a("totalStrokeCount");
        zzbj zzbjVar = new zzbj();
        zzbjVar.zza(1);
        zzb = bVarA.b(zzbjVar.zzb()).a();
        c.b bVarA2 = c.a("totalPointCount");
        zzbj zzbjVar2 = new zzbj();
        zzbjVar2.zza(2);
        zzc = bVarA2.b(zzbjVar2.zzb()).a();
        c.b bVarA3 = c.a("addedStrokeCount");
        zzbj zzbjVar3 = new zzbj();
        zzbjVar3.zza(3);
        zzd = bVarA3.b(zzbjVar3.zzb()).a();
        c.b bVarA4 = c.a("addedPointCount");
        zzbj zzbjVar4 = new zzbj();
        zzbjVar4.zza(4);
        zze = bVarA4.b(zzbjVar4.zzb()).a();
        c.b bVarA5 = c.a("removedStrokeCount");
        zzbj zzbjVar5 = new zzbj();
        zzbjVar5.zza(5);
        zzf = bVarA5.b(zzbjVar5.zzb()).a();
        c.b bVarA6 = c.a("removedPointCount");
        zzbj zzbjVar6 = new zzbj();
        zzbjVar6.zza(6);
        zzg = bVarA6.b(zzbjVar6.zzb()).a();
    }

    private zzht() {
    }

    @Override // ga.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        throw null;
    }
}
