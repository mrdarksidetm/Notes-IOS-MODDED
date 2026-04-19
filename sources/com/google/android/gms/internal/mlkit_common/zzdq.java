package com.google.android.gms.internal.mlkit_common;

import ga.c;
import ga.d;

/* JADX INFO: loaded from: classes.dex */
final class zzdq implements d {
    static final zzdq zza = new zzdq();
    private static final c zzb;
    private static final c zzc;
    private static final c zzd;
    private static final c zze;
    private static final c zzf;
    private static final c zzg;
    private static final c zzh;

    static {
        c.b bVarA = c.a("errorCode");
        zzbj zzbjVar = new zzbj();
        zzbjVar.zza(1);
        zzb = bVarA.b(zzbjVar.zzb()).a();
        c.b bVarA2 = c.a("hasResult");
        zzbj zzbjVar2 = new zzbj();
        zzbjVar2.zza(2);
        zzc = bVarA2.b(zzbjVar2.zzb()).a();
        c.b bVarA3 = c.a("isColdCall");
        zzbj zzbjVar3 = new zzbj();
        zzbjVar3.zza(3);
        zzd = bVarA3.b(zzbjVar3.zzb()).a();
        c.b bVarA4 = c.a("imageInfo");
        zzbj zzbjVar4 = new zzbj();
        zzbjVar4.zza(4);
        zze = bVarA4.b(zzbjVar4.zzb()).a();
        c.b bVarA5 = c.a("options");
        zzbj zzbjVar5 = new zzbj();
        zzbjVar5.zza(5);
        zzf = bVarA5.b(zzbjVar5.zzb()).a();
        c.b bVarA6 = c.a("detectedBarcodeFormats");
        zzbj zzbjVar6 = new zzbj();
        zzbjVar6.zza(6);
        zzg = bVarA6.b(zzbjVar6.zzb()).a();
        c.b bVarA7 = c.a("detectedBarcodeValueTypes");
        zzbj zzbjVar7 = new zzbj();
        zzbjVar7.zza(7);
        zzh = bVarA7.b(zzbjVar7.zzb()).a();
    }

    private zzdq() {
    }

    @Override // ga.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        throw null;
    }
}
