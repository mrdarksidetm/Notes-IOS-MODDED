package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class zzay extends zzal {
    private final /* synthetic */ zzav zza;

    zzay(zzav zzavVar) {
        this.zza = zzavVar;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i10) {
        zzy.zza(i10, this.zza.zzc);
        int i11 = i10 * 2;
        Object obj = this.zza.zzb[i11];
        Objects.requireNonNull(obj);
        Object obj2 = this.zza.zzb[i11 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzak
    public final boolean zze() {
        return true;
    }
}
