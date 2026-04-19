package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class zzkt implements zzlh {
    zzkt() {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlh
    public final int zza() {
        return 32;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlh
    public final byte[] zza(byte[] bArr, byte[] bArr2, byte[] bArr3, int i10, byte[] bArr4) throws InvalidAlgorithmParameterException {
        if (bArr.length != 32) {
            throw new InvalidAlgorithmParameterException("Unexpected key length: 32");
        }
        if (zzhq.zza()) {
            return zzhq.zza(bArr).zza(bArr2, bArr3, i10, bArr4);
        }
        return new zzho(bArr).zza(bArr2, Arrays.copyOfRange(bArr3, i10, bArr3.length), bArr4);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlh
    public final int zzb() {
        return 12;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlh
    public final byte[] zzc() {
        return zzlq.zzk;
    }
}
