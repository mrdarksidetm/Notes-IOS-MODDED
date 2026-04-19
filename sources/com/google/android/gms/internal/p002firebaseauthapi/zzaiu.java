package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: loaded from: classes.dex */
final class zzaiu {
    private final zzajg zza;
    private final byte[] zzb;

    private zzaiu(int i10) {
        byte[] bArr = new byte[i10];
        this.zzb = bArr;
        this.zza = zzajg.zzb(bArr);
    }

    public final zzaip zza() {
        this.zza.zzb();
        return new zzaiw(this.zzb);
    }

    public final zzajg zzb() {
        return this.zza;
    }
}
