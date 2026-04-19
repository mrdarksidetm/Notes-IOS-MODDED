package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzdv;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes.dex */
final class zzku implements zzkw {
    private final int zza;

    public zzku(zzdv zzdvVar) throws GeneralSecurityException {
        if (zzdvVar.zzb() != 12) {
            throw new GeneralSecurityException("invalid IV size");
        }
        if (zzdvVar.zzd() != 16) {
            throw new GeneralSecurityException("invalid tag size");
        }
        if (zzdvVar.zzf() != zzdv.zzb.zzc) {
            throw new GeneralSecurityException("invalid variant");
        }
        this.zza = zzdvVar.zzc();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzkw
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzkw
    public final byte[] zza(byte[] bArr, byte[] bArr2, int i10) throws GeneralSecurityException {
        if (bArr2.length < i10) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (bArr.length != this.zza) {
            throw new GeneralSecurityException("invalid key size");
        }
        SecretKey secretKeyZzb = zzgo.zzb(bArr);
        int i11 = i10 + 12;
        if (bArr2.length < i11 + 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        AlgorithmParameterSpec algorithmParameterSpecZza = zzgo.zza(bArr2, i10, 12);
        Cipher cipherZza = zzgo.zza();
        cipherZza.init(2, secretKeyZzb, algorithmParameterSpecZza);
        return cipherZza.doFinal(bArr2, i11, (bArr2.length - i10) - 12);
    }
}
