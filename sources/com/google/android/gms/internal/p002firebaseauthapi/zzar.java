package com.google.android.gms.internal.p002firebaseauthapi;

import com.amazon.a.a.o.b.f;

/* JADX INFO: loaded from: classes.dex */
final class zzar {
    private final Object zza;
    private final Object zzb;
    private final Object zzc;

    zzar(Object obj, Object obj2, Object obj3) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = obj3;
    }

    final IllegalArgumentException zza() {
        return new IllegalArgumentException("Multiple entries with same key: " + String.valueOf(this.zza) + f.f7479b + String.valueOf(this.zzb) + " and " + String.valueOf(this.zza) + f.f7479b + String.valueOf(this.zzc));
    }
}
