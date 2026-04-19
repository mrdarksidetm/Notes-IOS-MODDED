package com.google.android.gms.internal.mlkit_vision_document_scanner;

import ga.c;
import ga.d;
import ga.e;

/* JADX INFO: loaded from: classes.dex */
final class zzhq implements d {
    static final zzhq zza = new zzhq();
    private static final c zzb;
    private static final c zzc;
    private static final c zzd;
    private static final c zze;

    static {
        c.b bVarA = c.a("durationMs");
        zzar zzarVar = new zzar();
        zzarVar.zza(1);
        zzb = bVarA.b(zzarVar.zzb()).a();
        c.b bVarA2 = c.a("errorCode");
        zzar zzarVar2 = new zzar();
        zzarVar2.zza(2);
        zzc = bVarA2.b(zzarVar2.zzb()).a();
        c.b bVarA3 = c.a("options");
        zzar zzarVar3 = new zzar();
        zzarVar3.zza(3);
        zzd = bVarA3.b(zzarVar3.zzb()).a();
        c.b bVarA4 = c.a("pageCount");
        zzar zzarVar4 = new zzar();
        zzarVar4.zza(4);
        zze = bVarA4.b(zzarVar4.zzb()).a();
    }

    private zzhq() {
    }

    @Override // ga.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zznw zznwVar = (zznw) obj;
        e eVar = (e) obj2;
        eVar.add(zzb, zznwVar.zzd());
        eVar.add(zzc, zznwVar.zzb());
        eVar.add(zzd, zznwVar.zza());
        eVar.add(zze, zznwVar.zzc());
    }
}
