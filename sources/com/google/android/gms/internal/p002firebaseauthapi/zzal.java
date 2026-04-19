package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzal<E> extends zzak<E> implements List<E>, RandomAccess {
    private static final zzbb<Object> zza = new zzan(zzat.zza, 0);

    zzal() {
    }

    public static <E> zzal<E> zza(E e10, E e11, E e12, E e13, E e14, E e15, E e16, E e17) {
        return zzb(e10, e11, e12, e13, e14, e15, e16, e17);
    }

    public static <E> zzal<E> zza(Collection<? extends E> collection) {
        if (!(collection instanceof zzak)) {
            return zzb(collection.toArray());
        }
        zzal<E> zzalVarZzc = ((zzak) collection).zzc();
        if (!zzalVarZzc.zze()) {
            return zzalVarZzc;
        }
        Object[] array = zzalVarZzc.toArray();
        return zzb(array, array.length);
    }

    static <E> zzal<E> zza(Object[] objArr) {
        return zzb(objArr, objArr.length);
    }

    private static <E> zzal<E> zzb(Object... objArr) {
        int length = objArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (objArr[i10] == null) {
                throw new NullPointerException("at index " + i10);
            }
        }
        return zzb(objArr, objArr.length);
    }

    static <E> zzal<E> zzb(Object[] objArr, int i10) {
        return i10 == 0 ? (zzal<E>) zzat.zza : new zzat(objArr, i10);
    }

    public static <E> zzao<E> zzg() {
        return new zzao<>();
    }

    public static <E> zzal<E> zzh() {
        return (zzal<E>) zzat.zza;
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i10, E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzak, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == zzy.zza(this)) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i10 = 0; i10 < size; i10++) {
                        if (zzr.zza(get(i10), list.get(i10))) {
                        }
                    }
                    return true;
                }
                int size2 = size();
                Iterator<E> it = list.iterator();
                int i11 = 0;
                while (true) {
                    if (i11 < size2) {
                        if (!it.hasNext()) {
                            break;
                        }
                        E e10 = get(i11);
                        i11++;
                        if (!zzr.zza(e10, it.next())) {
                            break;
                        }
                    } else if (!it.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = ~(~((i10 * 31) + get(i11).hashCode()));
        }
        return i10;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (obj.equals(get(i10))) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzak, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public /* synthetic */ ListIterator listIterator() {
        return (zzbb) listIterator(0);
    }

    @Override // java.util.List
    public /* synthetic */ ListIterator listIterator(int i10) {
        zzy.zzb(i10, size());
        return isEmpty() ? zza : new zzan(this, i10);
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i10, E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzak
    int zza(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public zzal<E> subList(int i10, int i11) {
        zzy.zza(i10, i11, size());
        int i12 = i11 - i10;
        return i12 == size() ? this : i12 == 0 ? (zzal<E>) zzat.zza : new zzaq(this, i10, i12);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzak
    @Deprecated
    public final zzal<E> zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzak
    /* JADX INFO: renamed from: zzd */
    public final zzbc<E> iterator() {
        return (zzbb) listIterator();
    }
}
