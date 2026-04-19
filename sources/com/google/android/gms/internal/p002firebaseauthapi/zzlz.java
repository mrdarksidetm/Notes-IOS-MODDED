package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
final class zzlz implements zzln {
    private final zzzc zza;
    private final zzzc zzb;

    private zzlz(byte[] bArr, byte[] bArr2) {
        this.zza = zzzc.zza(bArr);
        this.zzb = zzzc.zza(bArr2);
    }

    static zzlz zza(byte[] bArr, byte[] bArr2, zzya zzyaVar) throws GeneralSecurityException {
        zzyb.zza(zzyb.zza(zzyaVar, zzyd.UNCOMPRESSED, bArr2), zzyb.zza(zzyaVar, bArr));
        return new zzlz(bArr, bArr2);
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
