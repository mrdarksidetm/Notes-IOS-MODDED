package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
final class zzaio extends zzaiq {
    private int zza = 0;
    private final int zzb;
    private final /* synthetic */ zzaip zzc;

    zzaio(zzaip zzaipVar) {
        this.zzc = zzaipVar;
        this.zzb = zzaipVar.zzb();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza < this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaiv
    public final byte zza() {
        int i10 = this.zza;
        if (i10 >= this.zzb) {
            throw new NoSuchElementException();
        }
        this.zza = i10 + 1;
        return this.zzc.zzb(i10);
    }
}
