package com.google.android.gms.internal.mlkit_common;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class zzaz extends zzau {
    private final transient zzat zza;
    private final transient zzaq zzb;

    zzaz(zzat zzatVar, zzaq zzaqVar) {
        this.zza = zzatVar;
        this.zzb = zzaqVar;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzam, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzau, com.google.android.gms.internal.mlkit_common.zzam, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.zzb.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzam
    final int zza(Object[] objArr, int i10) {
        return this.zzb.zza(objArr, 0);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzau, com.google.android.gms.internal.mlkit_common.zzam
    /* JADX INFO: renamed from: zzd */
    public final zzbd iterator() {
        return this.zzb.listIterator(0);
    }
}
