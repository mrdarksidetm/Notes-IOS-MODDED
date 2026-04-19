package com.google.android.gms.internal.mlkit_common;

import ga.c;
import ga.d;
import ga.e;

/* JADX INFO: loaded from: classes.dex */
final class zzgv implements d {
    static final zzgv zza = new zzgv();
    private static final c zzb;

    static {
        c.b bVarA = c.a("api");
        zzbj zzbjVar = new zzbj();
        zzbjVar.zza(1);
        zzb = bVarA.b(zzbjVar.zzb()).a();
    }

    private zzgv() {
    }

    @Override // ga.d
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        ((e) obj2).add(zzb, ((zzna) obj).zza());
    }
}
