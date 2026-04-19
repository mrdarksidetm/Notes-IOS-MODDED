package com.google.android.gms.internal.mlkit_vision_document_scanner;

import ga.c;
import ga.d;
import ga.e;

/* JADX INFO: loaded from: classes.dex */
final class zzka implements d {
    static final zzka zza = new zzka();
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
        zzar zzarVar = new zzar();
        zzarVar.zza(1);
        zzb = bVarA.b(zzarVar.zzb()).a();
        c.b bVarA2 = c.a("appVersion");
        zzar zzarVar2 = new zzar();
        zzarVar2.zza(2);
        zzc = bVarA2.b(zzarVar2.zzb()).a();
        c.b bVarA3 = c.a("firebaseProjectId");
        zzar zzarVar3 = new zzar();
        zzarVar3.zza(3);
        zzd = bVarA3.b(zzarVar3.zzb()).a();
        c.b bVarA4 = c.a("mlSdkVersion");
        zzar zzarVar4 = new zzar();
        zzarVar4.zza(4);
        zze = bVarA4.b(zzarVar4.zzb()).a();
        c.b bVarA5 = c.a("tfliteSchemaVersion");
        zzar zzarVar5 = new zzar();
        zzarVar5.zza(5);
        zzf = bVarA5.b(zzarVar5.zzb()).a();
        c.b bVarA6 = c.a("gcmSenderId");
        zzar zzarVar6 = new zzar();
        zzarVar6.zza(6);
        zzg = bVarA6.b(zzarVar6.zzb()).a();
        c.b bVarA7 = c.a("apiKey");
        zzar zzarVar7 = new zzar();
        zzarVar7.zza(7);
        zzh = bVarA7.b(zzarVar7.zzb()).a();
        c.b bVarA8 = c.a("languages");
        zzar zzarVar8 = new zzar();
        zzarVar8.zza(8);
        zzi = bVarA8.b(zzarVar8.zzb()).a();
        c.b bVarA9 = c.a("mlSdkInstanceId");
        zzar zzarVar9 = new zzar();
        zzarVar9.zza(9);
        zzj = bVarA9.b(zzarVar9.zzb()).a();
        c.b bVarA10 = c.a("isClearcutClient");
        zzar zzarVar10 = new zzar();
        zzarVar10.zza(10);
        zzk = bVarA10.b(zzarVar10.zzb()).a();
        c.b bVarA11 = c.a("isStandaloneMlkit");
        zzar zzarVar11 = new zzar();
        zzarVar11.zza(11);
        zzl = bVarA11.b(zzarVar11.zzb()).a();
        c.b bVarA12 = c.a("isJsonLogging");
        zzar zzarVar12 = new zzar();
        zzarVar12.zza(12);
        zzm = bVarA12.b(zzarVar12.zzb()).a();
        c.b bVarA13 = c.a("buildLevel");
        zzar zzarVar13 = new zzar();
        zzarVar13.zza(13);
        zzn = bVarA13.b(zzarVar13.zzb()).a();
        c.b bVarA14 = c.a("optionalModuleVersion");
        zzar zzarVar14 = new zzar();
        zzarVar14.zza(14);
        zzo = bVarA14.b(zzarVar14.zzb()).a();
    }

    private zzka() {
    }

    @Override // ga.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzqe zzqeVar = (zzqe) obj;
        e eVar = (e) obj2;
        eVar.add(zzb, zzqeVar.zzg());
        eVar.add(zzc, zzqeVar.zzh());
        eVar.add(zzd, (Object) null);
        eVar.add(zze, zzqeVar.zzj());
        eVar.add(zzf, zzqeVar.zzk());
        eVar.add(zzg, (Object) null);
        eVar.add(zzh, (Object) null);
        eVar.add(zzi, zzqeVar.zza());
        eVar.add(zzj, zzqeVar.zzi());
        eVar.add(zzk, zzqeVar.zzb());
        eVar.add(zzl, zzqeVar.zzd());
        eVar.add(zzm, zzqeVar.zzc());
        eVar.add(zzn, zzqeVar.zze());
        eVar.add(zzo, zzqeVar.zzf());
    }
}
