package com.google.android.gms.internal.p002firebaseauthapi;

import java.lang.Enum;
import java.security.GeneralSecurityException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzmm<E extends Enum<E>, O> {
    private final Map<E, O> zza;
    private final Map<O, E> zzb;

    private zzmm(Map<E, O> map, Map<O, E> map2) {
        this.zza = map;
        this.zzb = map2;
    }

    public static <E extends Enum<E>, O> zzmp<E, O> zza() {
        return new zzmp<>();
    }

    public final E zza(O o10) throws GeneralSecurityException {
        E e10 = this.zzb.get(o10);
        if (e10 != null) {
            return e10;
        }
        throw new GeneralSecurityException("Unable to convert object enum: " + String.valueOf(o10));
    }

    public final O zza(E e10) throws GeneralSecurityException {
        O o10 = this.zza.get(e10);
        if (o10 != null) {
            return o10;
        }
        throw new GeneralSecurityException("Unable to convert proto enum: " + String.valueOf(e10));
    }
}
