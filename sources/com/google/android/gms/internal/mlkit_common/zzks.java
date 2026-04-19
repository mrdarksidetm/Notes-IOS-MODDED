package com.google.android.gms.internal.mlkit_common;

import ga.c;
import ga.d;
import ga.e;

/* JADX INFO: loaded from: classes.dex */
final class zzks implements d {
    static final zzks zza = new zzks();
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
    private static final c zzn;
    private static final c zzo;

    static {
        c.b bVarA = c.a("appId");
        zzbj zzbjVar = new zzbj();
        zzbjVar.zza(1);
        zzb = bVarA.b(zzbjVar.zzb()).a();
        c.b bVarA2 = c.a("appVersion");
        zzbj zzbjVar2 = new zzbj();
        zzbjVar2.zza(2);
        zzc = bVarA2.b(zzbjVar2.zzb()).a();
        c.b bVarA3 = c.a("firebaseProjectId");
        zzbj zzbjVar3 = new zzbj();
        zzbjVar3.zza(3);
        zzd = bVarA3.b(zzbjVar3.zzb()).a();
        c.b bVarA4 = c.a("mlSdkVersion");
        zzbj zzbjVar4 = new zzbj();
        zzbjVar4.zza(4);
        zze = bVarA4.b(zzbjVar4.zzb()).a();
        c.b bVarA5 = c.a("tfliteSchemaVersion");
        zzbj zzbjVar5 = new zzbj();
        zzbjVar5.zza(5);
        zzf = bVarA5.b(zzbjVar5.zzb()).a();
        c.b bVarA6 = c.a("gcmSenderId");
        zzbj zzbjVar6 = new zzbj();
        zzbjVar6.zza(6);
        zzg = bVarA6.b(zzbjVar6.zzb()).a();
        c.b bVarA7 = c.a("apiKey");
        zzbj zzbjVar7 = new zzbj();
        zzbjVar7.zza(7);
        zzh = bVarA7.b(zzbjVar7.zzb()).a();
        c.b bVarA8 = c.a("languages");
        zzbj zzbjVar8 = new zzbj();
        zzbjVar8.zza(8);
        zzi = bVarA8.b(zzbjVar8.zzb()).a();
        c.b bVarA9 = c.a("mlSdkInstanceId");
        zzbj zzbjVar9 = new zzbj();
        zzbjVar9.zza(9);
        zzj = bVarA9.b(zzbjVar9.zzb()).a();
        c.b bVarA10 = c.a("isClearcutClient");
        zzbj zzbjVar10 = new zzbj();
        zzbjVar10.zza(10);
        zzk = bVarA10.b(zzbjVar10.zzb()).a();
        c.b bVarA11 = c.a("isStandaloneMlkit");
        zzbj zzbjVar11 = new zzbj();
        zzbjVar11.zza(11);
        zzl = bVarA11.b(zzbjVar11.zzb()).a();
        c.b bVarA12 = c.a("isJsonLogging");
        zzbj zzbjVar12 = new zzbj();
        zzbjVar12.zza(12);
        zzm = bVarA12.b(zzbjVar12.zzb()).a();
        c.b bVarA13 = c.a("buildLevel");
        zzbj zzbjVar13 = new zzbj();
        zzbjVar13.zza(13);
        zzn = bVarA13.b(zzbjVar13.zzb()).a();
        c.b bVarA14 = c.a("optionalModuleVersion");
        zzbj zzbjVar14 = new zzbj();
        zzbjVar14.zza(14);
        zzo = bVarA14.b(zzbjVar14.zzb()).a();
    }

    private zzks() {
    }

    @Override // ga.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzrg zzrgVar = (zzrg) obj;
        e eVar = (e) obj2;
        eVar.add(zzb, zzrgVar.zzg());
        eVar.add(zzc, zzrgVar.zzh());
        eVar.add(zzd, (Object) null);
        eVar.add(zze, zzrgVar.zzj());
        eVar.add(zzf, zzrgVar.zzk());
        eVar.add(zzg, (Object) null);
        eVar.add(zzh, (Object) null);
        eVar.add(zzi, zzrgVar.zza());
        eVar.add(zzj, zzrgVar.zzi());
        eVar.add(zzk, zzrgVar.zzb());
        eVar.add(zzl, zzrgVar.zzd());
        eVar.add(zzm, zzrgVar.zzc());
        eVar.add(zzn, zzrgVar.zze());
        eVar.add(zzo, zzrgVar.zzf());
    }
}
