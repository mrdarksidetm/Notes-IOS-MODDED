package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.a;
import com.google.android.gms.internal.p002firebaseauthapi.zzil;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class zzxp implements zzbg {
    private static final zzil.zza zza = zzil.zza.zza;
    private static final ThreadLocal<Cipher> zzb = new zzxo();
    private static final ThreadLocal<Cipher> zzc = new zzxr();
    private final byte[] zzd;
    private final byte[] zze;
    private final byte[] zzf;
    private final SecretKeySpec zzg;
    private final int zzh;

    private zzxp(byte[] bArr, int i10, byte[] bArr2) throws GeneralSecurityException {
        if (!zza.zza()) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i10 != 12 && i10 != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.zzh = i10;
        zzzb.zza(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.zzg = secretKeySpec;
        Cipher cipher = zzb.get();
        cipher.init(1, secretKeySpec);
        byte[] bArrZza = zza(cipher.doFinal(new byte[16]));
        this.zzd = bArrZza;
        this.zze = zza(bArrZza);
        this.zzf = bArr2;
    }

    public static zzbg zza(zzdh zzdhVar) throws GeneralSecurityException {
        if (!zza.zza()) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (zzdhVar.zzc().zzd() == 16) {
            return new zzxp(zzdhVar.zze().zza(zzbq.zza()), zzdhVar.zzc().zzb(), zzdhVar.zzd().zzb());
        }
        throw new GeneralSecurityException("AesEaxJce only supports 16 byte tag size, not " + zzdhVar.zzc().zzd());
    }

    private final byte[] zza(Cipher cipher, int i10, byte[] bArr, int i11, int i12) throws BadPaddingException, IllegalBlockSizeException, ShortBufferException {
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i10;
        if (i12 == 0) {
            zzc(bArr2, this.zzd);
            return cipher.doFinal(bArr2);
        }
        byte[] bArr3 = new byte[16];
        cipher.doFinal(bArr2, 0, 16, bArr3);
        int i13 = 0;
        while (true) {
            byte[] bArr4 = bArr2;
            bArr2 = bArr3;
            bArr3 = bArr4;
            if (i12 - i13 <= 16) {
                break;
            }
            for (int i14 = 0; i14 < 16; i14++) {
                bArr2[i14] = (byte) (bArr2[i14] ^ bArr[(i11 + i13) + i14]);
            }
            cipher.doFinal(bArr2, 0, 16, bArr3);
            i13 += 16;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i13 + i11, i11 + i12);
        if (bArrCopyOfRange.length == 16) {
            zzc(bArrCopyOfRange, this.zzd);
        } else {
            byte[] bArrCopyOf = Arrays.copyOf(this.zze, 16);
            for (int i15 = 0; i15 < bArrCopyOfRange.length; i15++) {
                bArrCopyOf[i15] = (byte) (bArrCopyOf[i15] ^ bArrCopyOfRange[i15]);
            }
            bArrCopyOf[bArrCopyOfRange.length] = (byte) (bArrCopyOf[bArrCopyOfRange.length] ^ 128);
            bArrCopyOfRange = bArrCopyOf;
        }
        zzc(bArr2, bArrCopyOfRange);
        cipher.doFinal(bArr2, 0, 16, bArr3);
        return bArr3;
    }

    private static byte[] zza(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i10 = 0;
        while (i10 < 15) {
            int i11 = i10 + 1;
            bArr2[i10] = (byte) ((bArr[i10] << 1) ^ ((bArr[i11] & 255) >>> 7));
            i10 = i11;
        }
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (bArr[15] << 1));
        return bArr2;
    }

    private static void zzc(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            bArr[i10] = (byte) (bArr[i10] ^ bArr2[i10]);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbg
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.zzf;
        int length2 = ((length - bArr3.length) - this.zzh) - 16;
        if (length2 < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!zzpr.zza(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        Cipher cipher = zzb.get();
        cipher.init(1, this.zzg);
        byte[] bArrZza = zza(cipher, 0, bArr, this.zzf.length, this.zzh);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArr4 = bArr2;
        byte[] bArrZza2 = zza(cipher, 1, bArr4, 0, bArr4.length);
        byte[] bArrZza3 = zza(cipher, 2, bArr, this.zzf.length + this.zzh, length2);
        int length3 = bArr.length - 16;
        byte b10 = 0;
        for (int i10 = 0; i10 < 16; i10++) {
            b10 = (byte) (b10 | (((bArr[length3 + i10] ^ bArrZza2[i10]) ^ bArrZza[i10]) ^ bArrZza3[i10]));
        }
        if (b10 != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher2 = zzc.get();
        cipher2.init(1, this.zzg, new IvParameterSpec(bArrZza));
        return cipher2.doFinal(bArr, this.zzf.length + this.zzh, length2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbg
    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.zzf;
        int length2 = a.e.API_PRIORITY_OTHER - bArr3.length;
        int i10 = this.zzh;
        if (length > (length2 - i10) - 16) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length + i10 + bArr.length + 16);
        byte[] bArrZza = zzpe.zza(this.zzh);
        System.arraycopy(bArrZza, 0, bArrCopyOf, this.zzf.length, this.zzh);
        Cipher cipher = zzb.get();
        cipher.init(1, this.zzg);
        byte[] bArrZza2 = zza(cipher, 0, bArrZza, 0, bArrZza.length);
        byte[] bArr4 = bArr2 == null ? new byte[0] : bArr2;
        byte[] bArrZza3 = zza(cipher, 1, bArr4, 0, bArr4.length);
        Cipher cipher2 = zzc.get();
        cipher2.init(1, this.zzg, new IvParameterSpec(bArrZza2));
        cipher2.doFinal(bArr, 0, bArr.length, bArrCopyOf, this.zzf.length + this.zzh);
        byte[] bArrZza4 = zza(cipher, 2, bArrCopyOf, this.zzf.length + this.zzh, bArr.length);
        int length3 = this.zzf.length + bArr.length + this.zzh;
        for (int i11 = 0; i11 < 16; i11++) {
            bArrCopyOf[length3 + i11] = (byte) ((bArrZza3[i11] ^ bArrZza2[i11]) ^ bArrZza4[i11]);
        }
        return bArrCopyOf;
    }
}
