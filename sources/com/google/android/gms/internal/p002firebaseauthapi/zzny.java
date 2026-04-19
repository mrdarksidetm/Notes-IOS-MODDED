package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class zzny {
    private static final zzny zza = new zzny();
    private static final zzob zzb = new zzob();
    private final AtomicReference<zznl> zzc = new AtomicReference<>();

    public static zzny zzb() {
        return zza;
    }

    public final zznl zza() {
        zznl zznlVar = this.zzc.get();
        return zznlVar == null ? zzb : zznlVar;
    }
}
