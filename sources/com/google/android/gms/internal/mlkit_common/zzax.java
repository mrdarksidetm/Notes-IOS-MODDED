package com.google.android.gms.internal.mlkit_common;

import java.util.AbstractMap;

/* JADX INFO: loaded from: classes.dex */
final class zzax extends zzaq {
    final /* synthetic */ zzay zza;

    zzax(zzay zzayVar) {
        this.zza = zzayVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        zzae.zza(i10, this.zza.zzc, "index");
        zzay zzayVar = this.zza;
        int i11 = i10 + i10;
        Object obj = zzayVar.zzb[i11];
        obj.getClass();
        Object obj2 = zzayVar.zzb[i11 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zzc;
    }
}
