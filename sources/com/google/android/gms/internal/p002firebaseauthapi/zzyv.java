package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzil;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class zzyv implements zzrq {
    private static final zzil.zza zza = zzil.zza.zza;
    private static final ThreadLocal<Cipher> zzb = new zzyu();
    private final SecretKey zzc;
    private byte[] zzd;
    private byte[] zze;

    public zzyv(byte[] bArr) throws GeneralSecurityException {
        zzzb.zza(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.zzc = secretKeySpec;
        Cipher cipherZza = zza();
        cipherZza.init(1, secretKeySpec);
        byte[] bArrZzb = zzrg.zzb(cipherZza.doFinal(new byte[16]));
        this.zzd = bArrZzb;
        this.zze = zzrg.zzb(bArrZzb);
    }

    private static Cipher zza() throws GeneralSecurityException {
        if (zza.zza()) {
            return zzb.get();
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    private static void zza(byte[] bArr, byte[] bArr2, int i10, byte[] bArr3) {
        for (int i11 = 0; i11 < 16; i11++) {
            bArr3[i11] = (byte) (bArr[i11] ^ bArr2[i11 + i10]);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzrq
    public final byte[] zza(byte[] bArr, int i10) throws GeneralSecurityException {
        if (i10 > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        Cipher cipherZza = zza();
        cipherZza.init(1, this.zzc);
        int length = bArr.length;
        int i11 = length == 0 ? 1 : ((length - 1) / 16) + 1;
        byte[] bArrZza = (i11 << 4) == bArr.length ? zzxv.zza(bArr, (i11 - 1) << 4, this.zzd, 0, 16) : zzxv.zza(zzrg.zza(Arrays.copyOfRange(bArr, (i11 - 1) << 4, bArr.length)), this.zze);
        byte[] bArr2 = new byte[16];
        byte[] bArr3 = new byte[16];
        for (int i12 = 0; i12 < i11 - 1; i12++) {
            zza(bArr2, bArr, i12 << 4, bArr3);
            if (cipherZza.doFinal(bArr3, 0, 16, bArr2) != 16) {
                throw new IllegalStateException("Cipher didn't write full block");
            }
        }
        zza(bArr2, bArrZza, 0, bArr3);
        if (cipherZza.doFinal(bArr3, 0, 16, bArr2) == 16) {
            return 16 == i10 ? bArr2 : Arrays.copyOf(bArr2, i10);
        }
        throw new IllegalStateException("Cipher didn't write full block");
    }
}
