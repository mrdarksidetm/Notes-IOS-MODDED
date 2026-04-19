package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: loaded from: classes.dex */
final class zzkq implements zzlh {
    private final int zza;

    zzkq(int i10) throws InvalidAlgorithmParameterException {
        if (i10 == 16 || i10 == 32) {
            this.zza = i10;
        } else {
            throw new InvalidAlgorithmParameterException("Unsupported key length: " + i10);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlh
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlh
    public final byte[] zza(byte[] bArr, byte[] bArr2, byte[] bArr3, int i10, byte[] bArr4) throws InvalidAlgorithmParameterException {
        if (bArr.length == this.zza) {
            return new zzhj(bArr).zza(bArr2, bArr3, i10, bArr4);
        }
        throw new InvalidAlgorithmParameterException("Unexpected key length: " + bArr.length);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlh
    public final int zzb() {
        return 12;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlh
    public final byte[] zzc() throws GeneralSecurityException {
        int i10 = this.zza;
        if (i10 == 16) {
            return zzlq.zzi;
        }
        if (i10 == 32) {
            return zzlq.zzj;
        }
        throw new GeneralSecurityException("Could not determine HPKE AEAD ID");
    }
}
