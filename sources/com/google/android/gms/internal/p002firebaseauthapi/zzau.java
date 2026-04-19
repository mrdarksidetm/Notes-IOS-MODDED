package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzau<E> extends zzak<E> implements Set<E> {
    private transient zzal<E> zza;

    zzau() {
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return zzaz.zza(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return zzaz.zza(this);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzak, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzak
    public zzal<E> zzc() {
        zzal<E> zzalVar = this.zza;
        if (zzalVar != null) {
            return zzalVar;
        }
        zzal<E> zzalVarZzg = zzg();
        this.zza = zzalVarZzg;
        return zzalVarZzg;
    }

    zzal<E> zzg() {
        return zzal.zza(toArray());
    }
}
