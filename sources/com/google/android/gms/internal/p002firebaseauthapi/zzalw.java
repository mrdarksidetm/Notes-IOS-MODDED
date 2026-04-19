package com.google.android.gms.internal.p002firebaseauthapi;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
class zzalw<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    private Object[] zza;
    private int zzb;
    private Map<K, V> zzc;
    private boolean zzd;
    private volatile zzamc zze;
    private Map<K, V> zzf;

    private zzalw() {
        this.zzc = Collections.emptyMap();
        this.zzf = Collections.emptyMap();
    }

    private final int zza(K k10) {
        int i10 = this.zzb - 1;
        if (i10 >= 0) {
            int iCompareTo = k10.compareTo((Comparable) ((zzama) this.zza[i10]).getKey());
            if (iCompareTo > 0) {
                return -(i10 + 2);
            }
            if (iCompareTo == 0) {
                return i10;
            }
        }
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) / 2;
            int iCompareTo2 = k10.compareTo((Comparable) ((zzama) this.zza[i12]).getKey());
            if (iCompareTo2 < 0) {
                i10 = i12 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i12;
                }
                i11 = i12 + 1;
            }
        }
        return -(i11 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V zzb(int i10) {
        zzg();
        V v10 = (V) ((zzama) this.zza[i10]).getValue();
        Object[] objArr = this.zza;
        System.arraycopy(objArr, i10 + 1, objArr, i10, (this.zzb - i10) - 1);
        this.zzb--;
        if (!this.zzc.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = zzf().entrySet().iterator();
            this.zza[this.zzb] = new zzama(this, it.next());
            this.zzb++;
            it.remove();
        }
        return v10;
    }

    private final SortedMap<K, V> zzf() {
        zzg();
        if (this.zzc.isEmpty() && !(this.zzc instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.zzc = treeMap;
            this.zzf = treeMap.descendingMap();
        }
        return (SortedMap) this.zzc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzg() {
        if (this.zzd) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        zzg();
        if (this.zzb != 0) {
            this.zza = null;
            this.zzb = 0;
        }
        if (this.zzc.isEmpty()) {
            return;
        }
        this.zzc.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return zza(comparable) >= 0 || this.zzc.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.zze == null) {
            this.zze = new zzamc(this);
        }
        return this.zze;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        Object objEntrySet;
        Object objEntrySet2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzalw)) {
            return super.equals(obj);
        }
        zzalw zzalwVar = (zzalw) obj;
        int size = size();
        if (size != zzalwVar.size()) {
            return false;
        }
        int i10 = this.zzb;
        if (i10 != zzalwVar.zzb) {
            objEntrySet = entrySet();
            objEntrySet2 = zzalwVar.entrySet();
        } else {
            for (int i11 = 0; i11 < i10; i11++) {
                if (!zza(i11).equals(zzalwVar.zza(i11))) {
                    return false;
                }
            }
            if (i10 == size) {
                return true;
            }
            objEntrySet = this.zzc;
            objEntrySet2 = zzalwVar.zzc;
        }
        return objEntrySet.equals(objEntrySet2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iZza = zza(comparable);
        return iZza >= 0 ? (V) ((zzama) this.zza[iZza]).getValue() : this.zzc.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int i10 = this.zzb;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode += this.zza[i11].hashCode();
        }
        return this.zzc.size() > 0 ? iHashCode + this.zzc.hashCode() : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        zzg();
        Comparable comparable = (Comparable) obj;
        int iZza = zza(comparable);
        if (iZza >= 0) {
            return zzb(iZza);
        }
        if (this.zzc.isEmpty()) {
            return null;
        }
        return this.zzc.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.zzb + this.zzc.size();
    }

    public final int zza() {
        return this.zzb;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final V put(K k10, V v10) {
        zzg();
        int iZza = zza(k10);
        if (iZza >= 0) {
            return (V) ((zzama) this.zza[iZza]).setValue(v10);
        }
        zzg();
        if (this.zza == null) {
            this.zza = new Object[16];
        }
        int i10 = -(iZza + 1);
        if (i10 >= 16) {
            return zzf().put(k10, v10);
        }
        int i11 = this.zzb;
        if (i11 == 16) {
            zzama zzamaVar = (zzama) this.zza[15];
            this.zzb = i11 - 1;
            zzf().put((Comparable) zzamaVar.getKey(), zzamaVar.getValue());
        }
        Object[] objArr = this.zza;
        System.arraycopy(objArr, i10, objArr, i10 + 1, (objArr.length - i10) - 1);
        this.zza[i10] = new zzama(this, k10, v10);
        this.zzb++;
        return null;
    }

    public final Map.Entry<K, V> zza(int i10) {
        if (i10 < this.zzb) {
            return (zzama) this.zza[i10];
        }
        throw new ArrayIndexOutOfBoundsException(i10);
    }

    public final Iterable<Map.Entry<K, V>> zzb() {
        return this.zzc.isEmpty() ? Collections.emptySet() : this.zzc.entrySet();
    }

    final Set<Map.Entry<K, V>> zzc() {
        return new zzamb(this);
    }

    public void zzd() {
        if (this.zzd) {
            return;
        }
        this.zzc = this.zzc.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.zzc);
        this.zzf = this.zzf.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.zzf);
        this.zzd = true;
    }

    public final boolean zze() {
        return this.zzd;
    }
}
