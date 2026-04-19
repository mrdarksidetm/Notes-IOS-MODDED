package com.google.android.gms.internal.mlkit_common;

import ga.c;
import ga.d;
import ga.e;

/* JADX INFO: loaded from: classes.dex */
final class zzfv implements d {
    static final zzfv zza = new zzfv();
    private static final c zzb;
    private static final c zzc;
    private static final c zzd;

    static {
        c.b bVarA = c.a("modelType");
        zzbj zzbjVar = new zzbj();
        zzbjVar.zza(1);
        zzb = bVarA.b(zzbjVar.zzb()).a();
        c.b bVarA2 = c.a("isSuccessful");
        zzbj zzbjVar2 = new zzbj();
        zzbjVar2.zza(2);
        zzc = bVarA2.b(zzbjVar2.zzb()).a();
        c.b bVarA3 = c.a("modelName");
        zzbj zzbjVar3 = new zzbj();
        zzbjVar3.zza(3);
        zzd = bVarA3.b(zzbjVar3.zzb()).a();
    }

    private zzfv() {
    }

    @Override // ga.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzlz zzlzVar = (zzlz) obj;
        e eVar = (e) obj2;
        eVar.add(zzb, zzlzVar.zza());
        eVar.add(zzc, zzlzVar.zzb());
        eVar.add(zzd, (Object) null);
    }
}
