package com.google.android.gms.internal.mlkit_common;

import ga.c;
import ga.d;
import ga.e;

/* JADX INFO: loaded from: classes.dex */
final class zzhd implements d {
    static final zzhd zza = new zzhd();
    private static final c zzb;
    private static final c zzc;
    private static final c zzd;
    private static final c zze;

    static {
        c.b bVarA = c.a("modelInfo");
        zzbj zzbjVar = new zzbj();
        zzbjVar.zza(1);
        zzb = bVarA.b(zzbjVar.zzb()).a();
        c.b bVarA2 = c.a("initialDownloadConditions");
        zzbj zzbjVar2 = new zzbj();
        zzbjVar2.zza(2);
        zzc = bVarA2.b(zzbjVar2.zzb()).a();
        c.b bVarA3 = c.a("updateDownloadConditions");
        zzbj zzbjVar3 = new zzbj();
        zzbjVar3.zza(3);
        zzd = bVarA3.b(zzbjVar3.zzb()).a();
        c.b bVarA4 = c.a("isModelUpdateEnabled");
        zzbj zzbjVar4 = new zzbj();
        zzbjVar4.zza(4);
        zze = bVarA4.b(zzbjVar4.zzb()).a();
    }

    private zzhd() {
    }

    @Override // ga.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        e eVar = (e) obj2;
        eVar.add(zzb, ((zznw) obj).zza());
        eVar.add(zzc, (Object) null);
        eVar.add(zzd, (Object) null);
        eVar.add(zze, (Object) null);
    }
}
