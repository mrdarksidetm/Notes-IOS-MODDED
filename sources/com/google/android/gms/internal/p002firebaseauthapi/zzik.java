package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class zzik implements zzbg {
    private static final byte[] zza = zzyt.zza("7a806c");
    private static final byte[] zzb = zzyt.zza("46bb91c3c5");
    private static final byte[] zzc = zzyt.zza("36864200e0eaf5284d884a0e77d31646");
    private static final byte[] zzd = zzyt.zza("bae8e37fc83441b16034566b");
    private static final byte[] zze = zzyt.zza("af60eb711bd85bc1e4d3e0a462e074eea428a8");
    private static final ThreadLocal<Cipher> zzf = new zzij();
    private final SecretKey zzg;
    private final byte[] zzh;

    private zzik(byte[] bArr, byte[] bArr2) throws InvalidAlgorithmParameterException {
        this.zzh = bArr2;
        zzzb.zza(bArr.length);
        this.zzg = new SecretKeySpec(bArr, "AES");
    }

    public static zzbg zza(zzdx zzdxVar) {
        return new zzik(zzdxVar.zze().zza(zzbq.zza()), zzdxVar.zzd().zzb());
    }

    private static AlgorithmParameterSpec zza(byte[] bArr, int i10, int i11) {
        return new GCMParameterSpec(128, bArr, 0, i11);
    }

    private static Cipher zza() throws GeneralSecurityException {
        Cipher cipher = zzf.get();
        if (cipher != null) {
            return cipher;
        }
        throw new GeneralSecurityException("AES GCM SIV cipher is not available or is invalid.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzb(Cipher cipher) {
        try {
            byte[] bArr = zzd;
            cipher.init(2, new SecretKeySpec(zzc, "AES"), zza(bArr, 0, bArr.length));
            cipher.updateAAD(zzb);
            byte[] bArr2 = zze;
            return MessageDigest.isEqual(cipher.doFinal(bArr2, 0, bArr2.length), zza);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    private final byte[] zzc(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Cipher cipherZza = zza();
        if (bArr.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        cipherZza.init(2, this.zzg, zza(bArr, 0, 12));
        if (bArr2 != null && bArr2.length != 0) {
            cipherZza.updateAAD(bArr2);
        }
        return cipherZza.doFinal(bArr, 12, bArr.length - 12);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbg
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzh;
        if (bArr3.length == 0) {
            return zzc(bArr, bArr2);
        }
        if (zzpr.zza(bArr3, bArr)) {
            return zzc(Arrays.copyOfRange(bArr, this.zzh.length, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbg
    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Cipher cipherZza = zza();
        if (bArr.length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[bArr.length + 12 + 16];
        byte[] bArrZza = zzpe.zza(12);
        System.arraycopy(bArrZza, 0, bArr3, 0, 12);
        cipherZza.init(1, this.zzg, zza(bArrZza, 0, bArrZza.length));
        if (bArr2 != null && bArr2.length != 0) {
            cipherZza.updateAAD(bArr2);
        }
        int iDoFinal = cipherZza.doFinal(bArr, 0, bArr.length, bArr3, 12);
        if (iDoFinal != bArr.length + 16) {
            throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(iDoFinal - bArr.length)));
        }
        byte[] bArr4 = this.zzh;
        return bArr4.length == 0 ? bArr3 : zzxv.zza(bArr4, bArr3);
    }
}
