package com.google.android.gms.internal.mlkit_common;

import ga.c;
import ga.d;

/* JADX INFO: loaded from: classes.dex */
final class zzdy implements d {
    static final zzdy zza = new zzdy();
    private static final c zzb;
    private static final c zzc;
    private static final c zzd;

    static {
        c.b bVarA = c.a("errorCode");
        zzbj zzbjVar = new zzbj();
        zzbjVar.zza(1);
        zzb = bVarA.b(zzbjVar.zzb()).a();
        c.b bVarA2 = c.a("imageInfo");
        zzbj zzbjVar2 = new zzbj();
        zzbjVar2.zza(2);
        zzc = bVarA2.b(zzbjVar2.zzb()).a();
        c.b bVarA3 = c.a("isColdCall");
        zzbj zzbjVar3 = new zzbj();
        zzbjVar3.zza(3);
        zzd = bVarA3.b(zzbjVar3.zzb()).a();
    }

    private zzdy() {
    }

    @Override // ga.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        throw null;
    }
}
