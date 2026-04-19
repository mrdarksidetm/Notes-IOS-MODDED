package com.google.android.gms.internal.mlkit_vision_document_scanner;

import ga.c;
import ga.d;
import ga.e;

/* JADX INFO: loaded from: classes.dex */
final class zzfl implements d {
    static final zzfl zza = new zzfl();
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
        c.b bVarA = c.a("initialImageUriCount");
        zzar zzarVar = new zzar();
        zzarVar.zza(1);
        zzb = bVarA.b(zzarVar.zzb()).a();
        c.b bVarA2 = c.a("defaultCaptureMode");
        zzar zzarVar2 = new zzar();
        zzarVar2.zza(2);
        zzc = bVarA2.b(zzarVar2.zzb()).a();
        c.b bVarA3 = c.a("flashModeChangeAllowed");
        zzar zzarVar3 = new zzar();
        zzarVar3.zza(3);
        zzd = bVarA3.b(zzarVar3.zzb()).a();
        c.b bVarA4 = c.a("galleryImportAllowed");
        zzar zzarVar4 = new zzar();
        zzarVar4.zza(4);
        zze = bVarA4.b(zzarVar4.zzb()).a();
        c.b bVarA5 = c.a("multiPageAllowed");
        zzar zzarVar5 = new zzar();
        zzarVar5.zza(5);
        zzf = bVarA5.b(zzarVar5.zzb()).a();
        c.b bVarA6 = c.a("filterAllowed");
        zzar zzarVar6 = new zzar();
        zzarVar6.zza(6);
        zzg = bVarA6.b(zzarVar6.zzb()).a();
        c.b bVarA7 = c.a("targetResolutionWidth");
        zzar zzarVar7 = new zzar();
        zzarVar7.zza(7);
        zzh = bVarA7.b(zzarVar7.zzb()).a();
        c.b bVarA8 = c.a("targetResolutionHeight");
        zzar zzarVar8 = new zzar();
        zzarVar8.zza(8);
        zzi = bVarA8.b(zzarVar8.zzb()).a();
        c.b bVarA9 = c.a("resultFormats");
        zzar zzarVar9 = new zzar();
        zzarVar9.zza(9);
        zzj = bVarA9.b(zzarVar9.zzb()).a();
        c.b bVarA10 = c.a("pageEditListenerSet");
        zzar zzarVar10 = new zzar();
        zzarVar10.zza(10);
        zzk = bVarA10.b(zzarVar10.zzb()).a();
        c.b bVarA11 = c.a("shadowRemovalAllowed");
        zzar zzarVar11 = new zzar();
        zzarVar11.zza(11);
        zzl = bVarA11.b(zzarVar11.zzb()).a();
        c.b bVarA12 = c.a("stainRemovalAllowed");
        zzar zzarVar12 = new zzar();
        zzarVar12.zza(12);
        zzm = bVarA12.b(zzarVar12.zzb()).a();
        c.b bVarA13 = c.a("enableAllNewFeaturesByDefault");
        zzar zzarVar13 = new zzar();
        zzarVar13.zza(13);
        zzn = bVarA13.b(zzarVar13.zzb()).a();
        c.b bVarA14 = c.a("pageLimitMax");
        zzar zzarVar14 = new zzar();
        zzarVar14.zza(14);
        zzo = bVarA14.b(zzarVar14.zzb()).a();
    }

    private zzfl() {
    }

    @Override // ga.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzlq zzlqVar = (zzlq) obj;
        e eVar = (e) obj2;
        eVar.add(zzb, zzlqVar.zzk());
        eVar.add(zzc, zzlqVar.zzb());
        eVar.add(zzd, zzlqVar.zze());
        eVar.add(zze, zzlqVar.zzf());
        eVar.add(zzf, zzlqVar.zzg());
        eVar.add(zzg, zzlqVar.zzd());
        eVar.add(zzh, (Object) null);
        eVar.add(zzi, (Object) null);
        eVar.add(zzj, zzlqVar.zza());
        eVar.add(zzk, zzlqVar.zzh());
        eVar.add(zzl, zzlqVar.zzi());
        eVar.add(zzm, zzlqVar.zzj());
        eVar.add(zzn, zzlqVar.zzc());
        eVar.add(zzo, zzlqVar.zzl());
    }
}
