package com.google.android.gms.internal.mlkit_common;

import ga.c;
import ga.d;

/* JADX INFO: loaded from: classes.dex */
final class zzkf implements d {
    static final zzkf zza = new zzkf();
    private static final c zzb;
    private static final c zzc;
    private static final c zzd;
    private static final c zze;
    private static final c zzf;
    private static final c zzg;
    private static final c zzh;
    private static final c zzi;
    private static final c zzj;
    private static final c zzk;
    private static final c zzl;
    private static final c zzm;

    static {
        c.b bVarA = c.a("deviceInfo");
        zzbj zzbjVar = new zzbj();
        zzbjVar.zza(1);
        zzb = bVarA.b(zzbjVar.zzb()).a();
        c.b bVarA2 = c.a("nnapiInfo");
        zzbj zzbjVar2 = new zzbj();
        zzbjVar2.zza(2);
        zzc = bVarA2.b(zzbjVar2.zzb()).a();
        c.b bVarA3 = c.a("gpuInfo");
        zzbj zzbjVar3 = new zzbj();
        zzbjVar3.zza(3);
        zzd = bVarA3.b(zzbjVar3.zzb()).a();
        c.b bVarA4 = c.a("pipelineIdentifier");
        zzbj zzbjVar4 = new zzbj();
        zzbjVar4.zza(4);
        zze = bVarA4.b(zzbjVar4.zzb()).a();
        c.b bVarA5 = c.a("acceptedConfigurations");
        zzbj zzbjVar5 = new zzbj();
        zzbjVar5.zza(5);
        zzf = bVarA5.b(zzbjVar5.zzb()).a();
        c.b bVarA6 = c.a("action");
        zzbj zzbjVar6 = new zzbj();
        zzbjVar6.zza(6);
        zzg = bVarA6.b(zzbjVar6.zzb()).a();
        c.b bVarA7 = c.a("status");
        zzbj zzbjVar7 = new zzbj();
        zzbjVar7.zza(7);
        zzh = bVarA7.b(zzbjVar7.zzb()).a();
        c.b bVarA8 = c.a("customErrors");
        zzbj zzbjVar8 = new zzbj();
        zzbjVar8.zza(8);
        zzi = bVarA8.b(zzbjVar8.zzb()).a();
        c.b bVarA9 = c.a("benchmarkStatus");
        zzbj zzbjVar9 = new zzbj();
        zzbjVar9.zza(9);
        zzj = bVarA9.b(zzbjVar9.zzb()).a();
        c.b bVarA10 = c.a("validationTestResult");
        zzbj zzbjVar10 = new zzbj();
        zzbjVar10.zza(10);
        zzk = bVarA10.b(zzbjVar10.zzb()).a();
        c.b bVarA11 = c.a("timestampUs");
        zzbj zzbjVar11 = new zzbj();
        zzbjVar11.zza(11);
        zzl = bVarA11.b(zzbjVar11.zzb()).a();
        c.b bVarA12 = c.a("elapsedUs");
        zzbj zzbjVar12 = new zzbj();
        zzbjVar12.zza(12);
        zzm = bVarA12.b(zzbjVar12.zzb()).a();
    }

    private zzkf() {
    }

    @Override // ga.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        throw null;
    }
}
