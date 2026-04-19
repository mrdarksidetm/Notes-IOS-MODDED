package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class zzkx implements zzkw {
    private final zziv zza;
    private final int zzb;

    public zzkx(zziv zzivVar) {
        this.zza = zzivVar;
        this.zzb = zzivVar.zzb();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzkw
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzkw
    public final byte[] zza(byte[] bArr, byte[] bArr2, int i10) throws GeneralSecurityException {
        if (bArr2.length < i10) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        return zzxt.zza(zzio.zzb().zza(this.zza).zza(zzze.zza(bArr, zzbq.zza())).zza()).zza(Arrays.copyOfRange(bArr2, i10, bArr2.length), zzks.zza);
    }
}
