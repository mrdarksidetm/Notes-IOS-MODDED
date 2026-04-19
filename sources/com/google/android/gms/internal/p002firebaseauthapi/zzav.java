package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class zzav<K, V> extends zzau<Map.Entry<K, V>> {
    private final transient zzap<K, V> zza;
    private final transient Object[] zzb;
    private final transient int zzc;

    zzav(zzap<K, V> zzapVar, Object[] objArr, int i10, int i11) {
        this.zza = zzapVar;
        this.zzb = objArr;
        this.zzc = i11;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzak, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.zza.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzau, com.google.android.gms.internal.p002firebaseauthapi.zzak, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzak
    final int zza(Object[] objArr, int i10) {
        return zzc().zza(objArr, i10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzak
    /* JADX INFO: renamed from: zzd */
    public final zzbc<Map.Entry<K, V>> iterator() {
        return (zzbc) zzc().iterator();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzak
    final boolean zze() {
        return true;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzau
    final zzal<Map.Entry<K, V>> zzg() {
        return new zzay(this);
    }
}
