package com.google.android.gms.internal.mlkit_common;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzau extends zzam implements Set {
    private transient zzaq zza;

    zzau() {
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return zzbc.zza(this);
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzam, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: zzd */
    public abstract zzbd iterator();

    public final zzaq zzf() {
        zzaq zzaqVar = this.zza;
        if (zzaqVar != null) {
            return zzaqVar;
        }
        zzaq zzaqVarZzg = zzg();
        this.zza = zzaqVarZzg;
        return zzaqVarZzg;
    }

    zzaq zzg() {
        Object[] array = toArray();
        int i10 = zzaq.zzd;
        return zzaq.zzg(array, array.length);
    }
}
