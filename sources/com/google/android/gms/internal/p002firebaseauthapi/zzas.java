package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzas<K, V> {
    zzar zza;
    private Object[] zzb;
    private int zzc;

    public zzas() {
        this(4);
    }

    zzas(int i10) {
        this.zzb = new Object[i10 * 2];
        this.zzc = 0;
    }

    private final void zza(int i10) {
        int i11 = i10 << 1;
        Object[] objArr = this.zzb;
        if (i11 > objArr.length) {
            this.zzb = Arrays.copyOf(objArr, zzam.zza(objArr.length, i11));
        }
    }

    public final zzap<K, V> zza() {
        zzar zzarVar = this.zza;
        if (zzarVar != null) {
            throw zzarVar.zza();
        }
        zzaw zzawVarZza = zzaw.zza(this.zzc, this.zzb, this);
        zzar zzarVar2 = this.zza;
        if (zzarVar2 == null) {
            return zzawVarZza;
        }
        throw zzarVar2.zza();
    }

    public final zzas<K, V> zza(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        if (iterable instanceof Collection) {
            zza(this.zzc + ((Collection) iterable).size());
        }
        for (Map.Entry<? extends K, ? extends V> entry : iterable) {
            K key = entry.getKey();
            V value = entry.getValue();
            zza(this.zzc + 1);
            zzai.zza(key, value);
            Object[] objArr = this.zzb;
            int i10 = this.zzc;
            objArr[i10 * 2] = key;
            objArr[(i10 * 2) + 1] = value;
            this.zzc = i10 + 1;
        }
        return this;
    }
}
