package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.a;
import com.google.android.gms.internal.p002firebaseauthapi.zzil;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class zzib implements zzbg {
    private static final zzil.zza zza = zzil.zza.zza;
    private final byte[] zzb;
    private final byte[] zzc;

    private zzib(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!zza.zza()) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        if (!zza()) {
            throw new GeneralSecurityException("JCE does not support algorithm: ChaCha20-Poly1305");
        }
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.zzb = bArr;
        this.zzc = bArr2;
    }

    public static zzbg zza(zzfv zzfvVar) {
        return new zzib(zzfvVar.zzd().zza(zzbq.zza()), zzfvVar.zzc().zzb());
    }

    public static boolean zza() {
        return zzhc.zza() != null;
    }

    private static byte[] zza(byte[] bArr) {
        byte[] bArr2 = new byte[12];
        System.arraycopy(bArr, 16, bArr2, 4, 8);
        return bArr2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbg
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        int length = bArr.length;
        byte[] bArr3 = this.zzc;
        if (length < bArr3.length + 24 + 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!zzpr.zza(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = new byte[24];
        System.arraycopy(bArr, this.zzc.length, bArr4, 0, 24);
        SecretKeySpec secretKeySpec = new SecretKeySpec(zzhk.zza(this.zzb, bArr4), "ChaCha20");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(zza(bArr4));
        Cipher cipherZza = zzhc.zza();
        cipherZza.init(2, secretKeySpec, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipherZza.updateAAD(bArr2);
        }
        byte[] bArr5 = this.zzc;
        return cipherZza.doFinal(bArr, bArr5.length + 24, (bArr.length - bArr5.length) - 24);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbg
    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("plaintext is null");
        }
        byte[] bArrZza = zzpe.zza(24);
        SecretKeySpec secretKeySpec = new SecretKeySpec(zzhk.zza(this.zzb, bArrZza), "ChaCha20");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(zza(bArrZza));
        Cipher cipherZza = zzhc.zza();
        cipherZza.init(1, secretKeySpec, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipherZza.updateAAD(bArr2);
        }
        int outputSize = cipherZza.getOutputSize(bArr.length);
        byte[] bArr3 = this.zzc;
        if (outputSize > (a.e.API_PRIORITY_OTHER - bArr3.length) - 24) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length + 24 + outputSize);
        System.arraycopy(bArrZza, 0, bArrCopyOf, this.zzc.length, 24);
        if (cipherZza.doFinal(bArr, 0, bArr.length, bArrCopyOf, this.zzc.length + 24) == outputSize) {
            return bArrCopyOf;
        }
        throw new GeneralSecurityException("not enough data written");
    }
}
