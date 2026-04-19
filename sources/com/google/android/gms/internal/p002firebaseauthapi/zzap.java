package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzap<K, V> implements Serializable, Map<K, V> {
    private transient zzau<Map.Entry<K, V>> zza;
    private transient zzau<K> zzb;
    private transient zzak<V> zzc;

    zzap() {
    }

    public static <K, V> zzap<K, V> zza(Map<? extends K, ? extends V> map) {
        if ((map instanceof zzap) && !(map instanceof SortedMap)) {
            zzap<K, V> zzapVar = (zzap) map;
            zzapVar.zzd();
            return zzapVar;
        }
        Set<Map.Entry<? extends K, ? extends V>> setEntrySet = map.entrySet();
        zzas zzasVar = new zzas(setEntrySet instanceof Collection ? setEntrySet.size() : 4);
        zzasVar.zza(setEntrySet);
        return zzasVar.zza();
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return ((zzak) values()).contains(obj);
    }

    @Override // java.util.Map
    public /* synthetic */ Set entrySet() {
        zzau<Map.Entry<K, V>> zzauVar = this.zza;
        if (zzauVar != null) {
            return zzauVar;
        }
        zzau<Map.Entry<K, V>> zzauVarZzb = zzb();
        this.zza = zzauVarZzb;
        return zzauVarZzb;
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public abstract V get(Object obj);

    @Override // java.util.Map
    public final V getOrDefault(Object obj, V v10) {
        V v11 = get(obj);
        return v11 != null ? v11 : v10;
    }

    @Override // java.util.Map
    public int hashCode() {
        return zzaz.zza((zzau) entrySet());
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public /* synthetic */ Set keySet() {
        zzau<K> zzauVar = this.zzb;
        if (zzauVar != null) {
            return zzauVar;
        }
        zzau<K> zzauVarZzc = zzc();
        this.zzb = zzauVarZzc;
        return zzauVarZzc;
    }

    @Override // java.util.Map
    @Deprecated
    public final V put(K k10, V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        int size = size();
        zzai.zza(size, "size");
        StringBuilder sb2 = new StringBuilder((int) Math.min(((long) size) << 3, 1073741824L));
        sb2.append('{');
        boolean z10 = true;
        for (Map.Entry<K, V> entry : entrySet()) {
            if (!z10) {
                sb2.append(", ");
            }
            z10 = false;
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
        }
        sb2.append('}');
        return sb2.toString();
    }

    @Override // java.util.Map
    public /* synthetic */ Collection values() {
        zzak<V> zzakVar = this.zzc;
        if (zzakVar != null) {
            return zzakVar;
        }
        zzak<V> zzakVarZza = zza();
        this.zzc = zzakVarZza;
        return zzakVarZza;
    }

    abstract zzak<V> zza();

    abstract zzau<Map.Entry<K, V>> zzb();

    abstract zzau<K> zzc();

    abstract boolean zzd();
}
