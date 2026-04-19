package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: loaded from: classes.dex */
final class zzams {
    static /* synthetic */ void zza(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i10) throws zzakf {
        if (zza(b11) || (((b10 << 28) + (b11 + 112)) >> 30) != 0 || zza(b12) || zza(b13)) {
            throw zzakf.zzd();
        }
        int i11 = ((b10 & 7) << 18) | ((b11 & 63) << 12) | ((b12 & 63) << 6) | (b13 & 63);
        cArr[i10] = (char) ((i11 >>> 10) + 55232);
        cArr[i10 + 1] = (char) ((i11 & 1023) + 56320);
    }

    static /* synthetic */ void zza(byte b10, byte b11, byte b12, char[] cArr, int i10) throws zzakf {
        if (zza(b11) || ((b10 == -32 && b11 < -96) || ((b10 == -19 && b11 >= -96) || zza(b12)))) {
            throw zzakf.zzd();
        }
        cArr[i10] = (char) (((b10 & 15) << 12) | ((b11 & 63) << 6) | (b12 & 63));
    }

    static /* synthetic */ void zza(byte b10, byte b11, char[] cArr, int i10) throws zzakf {
        if (b10 < -62 || zza(b11)) {
            throw zzakf.zzd();
        }
        cArr[i10] = (char) (((b10 & 31) << 6) | (b11 & 63));
    }

    static /* synthetic */ void zza(byte b10, char[] cArr, int i10) {
        cArr[i10] = (char) b10;
    }

    private static boolean zza(byte b10) {
        return b10 > -65;
    }
}
