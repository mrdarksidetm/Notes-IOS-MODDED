package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzil;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collection;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class zzxt implements zzbl {
    private static final zzil.zza zza = zzil.zza.zza;
    private static final Collection<Integer> zzb = Arrays.asList(64);
    private static final byte[] zzc = new byte[16];
    private static final ThreadLocal<Cipher> zzd = new zzxs();
    private final zzyv zze;
    private final byte[] zzf;
    private final byte[] zzg;

    private zzxt(byte[] bArr, zzzc zzzcVar) throws GeneralSecurityException {
        if (!zza.zza()) {
            throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
        }
        if (zzb.contains(Integer.valueOf(bArr.length))) {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length / 2);
            this.zzf = Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
            this.zze = new zzyv(bArrCopyOfRange);
            this.zzg = zzzcVar.zzb();
            return;
        }
        throw new InvalidKeyException("invalid key size: " + bArr.length + " bytes; key must have 64 bytes");
    }

    public static zzbl zza(zzio zzioVar) {
        return new zzxt(zzioVar.zze().zza(zzbq.zza()), zzioVar.zzd());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbl
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrZza;
        int length = bArr.length;
        byte[] bArr3 = this.zzg;
        if (length < bArr3.length + 16) {
            throw new GeneralSecurityException("Ciphertext too short.");
        }
        if (!zzpr.zza(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        Cipher cipher = zzd.get();
        byte[] bArr4 = this.zzg;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, bArr4.length, bArr4.length + 16);
        byte[] bArr5 = (byte[]) bArrCopyOfRange.clone();
        bArr5[8] = (byte) (bArr5[8] & 127);
        bArr5[12] = (byte) (bArr5[12] & 127);
        cipher.init(2, new SecretKeySpec(this.zzf, "AES"), new IvParameterSpec(bArr5));
        int length2 = this.zzg.length + 16;
        int length3 = bArr.length - length2;
        byte[] bArrDoFinal = cipher.doFinal(bArr, length2, length3);
        if (length3 == 0 && bArrDoFinal == null && zzyy.zza()) {
            bArrDoFinal = new byte[0];
        }
        byte[][] bArr6 = {bArr2, bArrDoFinal};
        byte[] bArrZza2 = this.zze.zza(zzc, 16);
        for (int i10 = 0; i10 <= 0; i10++) {
            byte[] bArr7 = bArr6[i10];
            if (bArr7 == null) {
                bArr7 = new byte[0];
            }
            bArrZza2 = zzxv.zza(zzrg.zzb(bArrZza2), this.zze.zza(bArr7, 16));
        }
        byte[] bArr8 = bArr6[1];
        if (bArr8.length < 16) {
            bArrZza = zzxv.zza(zzrg.zza(bArr8), zzrg.zzb(bArrZza2));
        } else {
            if (bArr8.length < bArrZza2.length) {
                throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
            }
            int length4 = bArr8.length - bArrZza2.length;
            bArrZza = Arrays.copyOf(bArr8, bArr8.length);
            for (int i11 = 0; i11 < bArrZza2.length; i11++) {
                int i12 = length4 + i11;
                bArrZza[i12] = (byte) (bArrZza[i12] ^ bArrZza2[i11]);
            }
        }
        if (MessageDigest.isEqual(bArrCopyOfRange, this.zze.zza(bArrZza, 16))) {
            return bArrDoFinal;
        }
        throw new AEADBadTagException("Integrity check failed.");
    }
}
