package com.google.android.gms.internal.mlkit_common;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import ga.c;
import ga.d;

/* JADX INFO: loaded from: classes.dex */
final class zzhh implements d {
    static final zzhh zza = new zzhh();
    private static final c zzb;
    private static final c zzc;
    private static final c zzd;
    private static final c zze;

    static {
        c.b bVarA = c.a("name");
        zzbj zzbjVar = new zzbj();
        zzbjVar.zza(1);
        zzb = bVarA.b(zzbjVar.zzb()).a();
        c.b bVarA2 = c.a("type");
        zzbj zzbjVar2 = new zzbj();
        zzbjVar2.zza(2);
        zzc = bVarA2.b(zzbjVar2.zzb()).a();
        c.b bVarA3 = c.a(DiagnosticsEntry.VERSION_KEY);
        zzbj zzbjVar3 = new zzbj();
        zzbjVar3.zza(3);
        zzd = bVarA3.b(zzbjVar3.zzb()).a();
        c.b bVarA4 = c.a("featureLevel");
        zzbj zzbjVar4 = new zzbj();
        zzbjVar4.zza(4);
        zze = bVarA4.b(zzbjVar4.zzb()).a();
    }

    private zzhh() {
    }

    @Override // ga.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        throw null;
    }
}
