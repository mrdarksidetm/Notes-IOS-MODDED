package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzju;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public final class zzlq {
    public static final byte[] zza = zza(1, 0);
    public static final byte[] zzb;
    public static final byte[] zzc;
    public static final byte[] zzd;
    public static final byte[] zze;
    public static final byte[] zzf;
    public static final byte[] zzg;
    public static final byte[] zzh;
    public static final byte[] zzi;
    public static final byte[] zzj;
    public static final byte[] zzk;
    public static final byte[] zzl;
    private static final byte[] zzm;
    private static final byte[] zzn;
    private static final byte[] zzo;

    static {
        zza(1, 2);
        zzb = zza(2, 32);
        zzc = zza(2, 16);
        zzd = zza(2, 17);
        zze = zza(2, 18);
        zzf = zza(2, 1);
        zzg = zza(2, 2);
        zzh = zza(2, 3);
        zzi = zza(2, 1);
        zzj = zza(2, 2);
        zzk = zza(2, 3);
        zzl = new byte[0];
        Charset charset = zzpr.zza;
        zzm = "KEM".getBytes(charset);
        zzn = "HPKE".getBytes(charset);
        zzo = "HPKE-v1".getBytes(charset);
    }

    public static int zza(zzju.zzf zzfVar) throws GeneralSecurityException {
        if (zzfVar == zzju.zzf.zzd || zzfVar == zzju.zzf.zza) {
            return 32;
        }
        if (zzfVar == zzju.zzf.zzb) {
            return 48;
        }
        if (zzfVar == zzju.zzf.zzc) {
            return 66;
        }
        throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
    }

    private static byte[] zza(int i10, int i11) {
        if (i10 > 4 || i10 < 0) {
            throw new IllegalArgumentException("capacity must be between 0 and 4");
        }
        if (i11 < 0 || (i10 < 4 && i11 >= (1 << (i10 << 3)))) {
            throw new IllegalArgumentException("value too large");
        }
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) (i11 >> (((i10 - i12) - 1) * 8));
        }
        return bArr;
    }

    static byte[] zza(String str, byte[] bArr, byte[] bArr2) {
        return zzxv.zza(zzo, bArr2, str.getBytes(zzpr.zza), bArr);
    }

    static byte[] zza(String str, byte[] bArr, byte[] bArr2, int i10) {
        return zzxv.zza(zza(2, i10), zzo, bArr2, str.getBytes(zzpr.zza), bArr);
    }

    static byte[] zza(byte[] bArr) {
        return zzxv.zza(zzm, bArr);
    }

    static byte[] zza(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return zzxv.zza(zzn, bArr, bArr2, bArr3);
    }

    public static int zzb(zzju.zzf zzfVar) throws GeneralSecurityException {
        if (zzfVar == zzju.zzf.zzd) {
            return 32;
        }
        if (zzfVar == zzju.zzf.zza) {
            return 65;
        }
        if (zzfVar == zzju.zzf.zzb) {
            return 97;
        }
        if (zzfVar == zzju.zzf.zzc) {
            return 133;
        }
        throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
    }

    static zzya zzc(zzju.zzf zzfVar) throws GeneralSecurityException {
        if (zzfVar == zzju.zzf.zza) {
            return zzya.NIST_P256;
        }
        if (zzfVar == zzju.zzf.zzb) {
            return zzya.NIST_P384;
        }
        if (zzfVar == zzju.zzf.zzc) {
            return zzya.NIST_P521;
        }
        throw new GeneralSecurityException("Unrecognized NIST HPKE KEM identifier");
    }
}
