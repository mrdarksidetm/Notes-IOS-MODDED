package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzht {
    private static long zza(byte[] bArr, int i10) {
        return ((long) (((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16))) & 4294967295L;
    }

    private static long zza(byte[] bArr, int i10, int i11) {
        return (zza(bArr, i10) >> i11) & 67108863;
    }

    private static void zza(byte[] bArr, long j10, int i10) {
        int i11 = 0;
        while (i11 < 4) {
            bArr[i10 + i11] = (byte) (255 & j10);
            i11++;
            j10 >>= 8;
        }
    }

    public static byte[] zza(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("The key length in bytes must be 32.");
        }
        long jZza = zza(bArr, 0, 0) & 67108863;
        int i10 = 3;
        long jZza2 = zza(bArr, 3, 2) & 67108611;
        long jZza3 = zza(bArr, 6, 4) & 67092735;
        long jZza4 = zza(bArr, 9, 6) & 66076671;
        long jZza5 = zza(bArr, 12, 8) & 1048575;
        long j10 = jZza2 * 5;
        long j11 = jZza3 * 5;
        long j12 = jZza4 * 5;
        long j13 = jZza5 * 5;
        int i11 = 17;
        byte[] bArr3 = new byte[17];
        long j14 = 0;
        int i12 = 0;
        long j15 = 0;
        long j16 = 0;
        long j17 = 0;
        long j18 = 0;
        while (i12 < bArr2.length) {
            int iMin = Math.min(16, bArr2.length - i12);
            System.arraycopy(bArr2, i12, bArr3, 0, iMin);
            bArr3[iMin] = 1;
            if (iMin != 16) {
                Arrays.fill(bArr3, iMin + 1, i11, (byte) 0);
            }
            long jZza6 = j18 + zza(bArr3, 0, 0);
            long jZza7 = j14 + zza(bArr3, i10, 2);
            long jZza8 = j15 + zza(bArr3, 6, 4);
            long jZza9 = j16 + zza(bArr3, 9, 6);
            long jZza10 = j17 + (zza(bArr3, 12, 8) | ((long) (bArr3[16] << 24)));
            long j19 = (jZza6 * jZza) + (jZza7 * j13) + (jZza8 * j12) + (jZza9 * j11) + (jZza10 * j10);
            long j20 = (jZza6 * jZza2) + (jZza7 * jZza) + (jZza8 * j13) + (jZza9 * j12) + (jZza10 * j11);
            long j21 = (jZza6 * jZza3) + (jZza7 * jZza2) + (jZza8 * jZza) + (jZza9 * j13) + (jZza10 * j12);
            long j22 = (jZza6 * jZza4) + (jZza7 * jZza3) + (jZza8 * jZza2) + (jZza9 * jZza) + (jZza10 * j13);
            long j23 = j20 + (j19 >> 26);
            long j24 = j21 + (j23 >> 26);
            long j25 = j22 + (j24 >> 26);
            long j26 = (jZza6 * jZza5) + (jZza7 * jZza4) + (jZza8 * jZza3) + (jZza9 * jZza2) + (jZza10 * jZza) + (j25 >> 26);
            long j27 = (j19 & 67108863) + ((j26 >> 26) * 5);
            j14 = (j23 & 67108863) + (j27 >> 26);
            i12 += 16;
            j15 = j24 & 67108863;
            j16 = j25 & 67108863;
            j17 = j26 & 67108863;
            i11 = 17;
            i10 = 3;
            j18 = j27 & 67108863;
        }
        long j28 = j15 + (j14 >> 26);
        long j29 = j28 & 67108863;
        long j30 = j16 + (j28 >> 26);
        long j31 = j30 & 67108863;
        long j32 = j17 + (j30 >> 26);
        long j33 = j32 & 67108863;
        long j34 = j18 + ((j32 >> 26) * 5);
        long j35 = j34 & 67108863;
        long j36 = (j14 & 67108863) + (j34 >> 26);
        long j37 = j35 + 5;
        long j38 = j37 & 67108863;
        long j39 = (j37 >> 26) + j36;
        long j40 = j29 + (j39 >> 26);
        long j41 = j31 + (j40 >> 26);
        long j42 = (j33 + (j41 >> 26)) - 67108864;
        long j43 = j42 >> 63;
        long j44 = ~j43;
        long j45 = (j36 & j43) | (j39 & 67108863 & j44);
        long j46 = (j29 & j43) | (j40 & 67108863 & j44);
        long j47 = (j31 & j43) | (j41 & 67108863 & j44);
        long j48 = ((j45 << 26) | (j35 & j43) | (j38 & j44)) & 4294967295L;
        long j49 = ((j45 >> 6) | (j46 << 20)) & 4294967295L;
        long j50 = ((j46 >> 12) | (j47 << 14)) & 4294967295L;
        long j51 = ((((j42 & j44) | (j33 & j43)) << 8) | (j47 >> 18)) & 4294967295L;
        long jZza11 = j48 + zza(bArr, 16);
        long j52 = jZza11 & 4294967295L;
        long jZza12 = j49 + zza(bArr, 20) + (jZza11 >> 32);
        long jZza13 = j50 + zza(bArr, 24) + (jZza12 >> 32);
        long jZza14 = (j51 + zza(bArr, 28) + (jZza13 >> 32)) & 4294967295L;
        byte[] bArr4 = new byte[16];
        zza(bArr4, j52, 0);
        zza(bArr4, jZza12 & 4294967295L, 4);
        zza(bArr4, jZza13 & 4294967295L, 8);
        zza(bArr4, jZza14, 12);
        return bArr4;
    }
}
