package com.google.android.gms.internal.mlkit_vision_document_scanner;

import ga.c;
import ga.d;

/* JADX INFO: loaded from: classes.dex */
final class zziw implements d {
    static final zziw zza = new zziw();
    private static final c zzb;
    private static final c zzc;
    private static final c zzd;

    static {
        c.b bVarA = c.a("detectorMode");
        zzar zzarVar = new zzar();
        zzarVar.zza(1);
        zzb = bVarA.b(zzarVar.zzb()).a();
        c.b bVarA2 = c.a("streamModeSmoothingRatio");
        zzar zzarVar2 = new zzar();
        zzarVar2.zza(2);
        zzc = bVarA2.b(zzarVar2.zzb()).a();
        c.b bVarA3 = c.a("rawSizeMaskEnabled");
        zzar zzarVar3 = new zzar();
        zzarVar3.zza(3);
        zzd = bVarA3.b(zzarVar3.zzb()).a();
    }

    private zziw() {
    }

    @Override // ga.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        throw null;
    }
}
