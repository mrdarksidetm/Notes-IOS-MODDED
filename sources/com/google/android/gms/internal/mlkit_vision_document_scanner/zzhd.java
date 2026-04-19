package com.google.android.gms.internal.mlkit_vision_document_scanner;

import ga.c;
import ga.d;

/* JADX INFO: loaded from: classes.dex */
final class zzhd implements d {
    static final zzhd zza = new zzhd();
    private static final c zzb;
    private static final c zzc;

    static {
        c.b bVarA = c.a("handwritingRecognitionStrategy");
        zzar zzarVar = new zzar();
        zzarVar.zza(1);
        zzb = bVarA.b(zzarVar.zzb()).a();
        c.b bVarA2 = c.a("recognitionSchedulingStrategy");
        zzar zzarVar2 = new zzar();
        zzarVar2.zza(2);
        zzc = bVarA2.b(zzarVar2.zzb()).a();
    }

    private zzhd() {
    }

    @Override // ga.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        throw null;
    }
}
