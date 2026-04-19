package com.google.android.gms.internal.p002firebaseauthapi;

import java.lang.Enum;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzmp<E extends Enum<E>, O> {
    private Map<E, O> zza;
    private Map<O, E> zzb;

    private zzmp() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    public final zzmm<E, O> zza() {
        return new zzmm<>(Collections.unmodifiableMap(this.zza), Collections.unmodifiableMap(this.zzb));
    }

    public final zzmp<E, O> zza(E e10, O o10) {
        this.zza.put(e10, o10);
        this.zzb.put(o10, e10);
        return this;
    }
}
