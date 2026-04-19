package com.google.android.recaptcha.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzhz {
    private static final zzhz zza = new zzhw("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
    private static final zzhz zzb = new zzhw("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');

    static {
        new zzhy("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
        new zzhy("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
        zzhv zzhvVar = new zzhv("base16()", "0123456789ABCDEF".toCharArray());
        new zzhy(zzhvVar, null);
        char[] cArr = new char[512];
        zzgx.zza(zzhvVar.zzf.length == 16);
        for (int i10 = 0; i10 < 256; i10++) {
            cArr[i10] = zzhvVar.zza(i10 >>> 4);
            cArr[i10 | 256] = zzhvVar.zza(i10 & 15);
        }
    }

    zzhz() {
    }

    public static zzhz zzg() {
        return zza;
    }

    public static zzhz zzh() {
        return zzb;
    }

    abstract int zza(byte[] bArr, CharSequence charSequence);

    abstract void zzb(Appendable appendable, byte[] bArr, int i10, int i11);

    abstract int zzc(int i10);

    abstract int zzd(int i10);

    CharSequence zze(CharSequence charSequence) {
        throw null;
    }

    public final String zzi(byte[] bArr, int i10, int i11) {
        zzgx.zzd(0, i11, bArr.length);
        StringBuilder sb2 = new StringBuilder(zzd(i11));
        try {
            zzb(sb2, bArr, 0, i11);
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public final byte[] zzj(CharSequence charSequence) {
        try {
            CharSequence charSequenceZze = zze(charSequence);
            int iZzc = zzc(charSequenceZze.length());
            byte[] bArr = new byte[iZzc];
            int iZza = zza(bArr, charSequenceZze);
            if (iZza == iZzc) {
                return bArr;
            }
            byte[] bArr2 = new byte[iZza];
            System.arraycopy(bArr, 0, bArr2, 0, iZza);
            return bArr2;
        } catch (zzhx e10) {
            throw new IllegalArgumentException(e10);
        }
    }
}
