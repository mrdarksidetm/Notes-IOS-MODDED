package com.google.android.gms.internal.mlkit_vision_document_scanner;

import ga.c;
import ga.d;

/* JADX INFO: loaded from: classes.dex */
final class zziu implements d {
    static final zziu zza = new zziu();
    private static final c zzb;
    private static final c zzc;
    private static final c zzd;
    private static final c zze;
    private static final c zzf;

    static {
        c.b bVarA = c.a("detectorMode");
        zzar zzarVar = new zzar();
        zzarVar.zza(1);
        zzb = bVarA.b(zzarVar.zzb()).a();
        c.b bVarA2 = c.a("personDetectionMode");
        zzar zzarVar2 = new zzar();
        zzarVar2.zza(2);
        zzc = bVarA2.b(zzarVar2.zzb()).a();
        c.b bVarA3 = c.a("landmarkDetectionMode");
        zzar zzarVar3 = new zzar();
        zzarVar3.zza(3);
        zzd = bVarA3.b(zzarVar3.zzb()).a();
        c.b bVarA4 = c.a("preferredHardwareConfigs");
        zzar zzarVar4 = new zzar();
        zzarVar4.zza(4);
        zze = bVarA4.b(zzarVar4.zzb()).a();
        c.b bVarA5 = c.a("runConfig");
        zzar zzarVar5 = new zzar();
        zzarVar5.zza(5);
        zzf = bVarA5.b(zzarVar5.zzb()).a();
    }

    private zziu() {
    }

    @Override // ga.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        throw null;
    }
}
