package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: loaded from: classes.dex */
final class zzan<E> extends zzaf<E> {
    private final zzal<E> zza;

    zzan(zzal<E> zzalVar, int i10) {
        super(zzalVar.size(), i10);
        this.zza = zzalVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaf
    protected final E zza(int i10) {
        return this.zza.get(i10);
    }
}
