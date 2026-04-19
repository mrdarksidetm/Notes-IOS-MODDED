package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: loaded from: classes.dex */
final class zzmb implements zzln {
    private final zzzc zza;
    private final zzzc zzb;

    private zzmb(byte[] bArr, byte[] bArr2) {
        this.zza = zzzc.zza(bArr);
        this.zzb = zzzc.zza(bArr2);
    }

    static zzmb zza(byte[] bArr) {
        return new zzmb(bArr, zzza.zza(bArr));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzln
    public final zzzc zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzln
    public final zzzc zzb() {
        return this.zzb;
    }
}
