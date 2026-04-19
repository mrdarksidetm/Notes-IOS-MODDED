package com.google.android.recaptcha.internal;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhb extends zzhf implements Serializable {
    final int zza;
    private final Queue zzb;

    private zzhb(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(zzha.zza("maxSize (%s) must >= 0", Integer.valueOf(i10)));
        }
        this.zzb = new ArrayDeque(i10);
        this.zza = i10;
    }

    public static zzhb zza(int i10) {
        return new zzhb(i10);
    }

    @Override // com.google.android.recaptcha.internal.zzhd, java.util.Collection, java.util.Queue
    public final boolean add(Object obj) {
        obj.getClass();
        if (this.zza == 0) {
            return true;
        }
        if (size() == this.zza) {
            this.zzb.remove();
        }
        this.zzb.add(obj);
        return true;
    }

    @Override // com.google.android.recaptcha.internal.zzhd, java.util.Collection
    public final boolean addAll(Collection collection) {
        Iterator it;
        int size = collection.size();
        if (size >= this.zza) {
            clear();
            int i10 = size - this.zza;
            zzgx.zzb(i10 >= 0, "number to skip cannot be negative");
            it = new zzhh(collection, i10).iterator();
        } else {
            it = collection.iterator();
        }
        return zzhi.zza(this, it);
    }

    @Override // com.google.android.recaptcha.internal.zzhf, java.util.Queue
    public final boolean offer(Object obj) {
        add(obj);
        return true;
    }

    @Override // com.google.android.recaptcha.internal.zzhd, com.google.android.recaptcha.internal.zzhe
    protected final /* synthetic */ Object zzb() {
        return this.zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzhf, com.google.android.recaptcha.internal.zzhd
    protected final /* synthetic */ Collection zzc() {
        return this.zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzhf
    protected final Queue zzd() {
        return this.zzb;
    }
}
