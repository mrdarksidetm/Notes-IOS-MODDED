package com.google.android.gms.internal.fido;

import java.math.RoundingMode;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class zzcd {
    final int zza;
    final int zzb;
    final int zzc;
    final int zzd;
    private final String zze;
    private final char[] zzf;
    private final byte[] zzg;
    private final boolean zzh;

    /* JADX WARN: Illegal instructions before constructor call */
    zzcd(String str, char[] cArr) {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i10 = 0; i10 < cArr.length; i10++) {
            char c10 = cArr[i10];
            boolean z10 = true;
            zzap.zzd(c10 < 128, "Non-ASCII character: %s", c10);
            if (bArr[c10] != -1) {
                z10 = false;
            }
            zzap.zzd(z10, "Duplicate character: %s", c10);
            bArr[c10] = (byte) i10;
        }
        this(str, cArr, bArr, false);
    }

    private zzcd(String str, char[] cArr, byte[] bArr, boolean z10) {
        this.zze = str;
        cArr.getClass();
        this.zzf = cArr;
        try {
            int length = cArr.length;
            int iZzb = zzcj.zzb(length, RoundingMode.UNNECESSARY);
            this.zzb = iZzb;
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iZzb);
            int i10 = 1 << (3 - iNumberOfTrailingZeros);
            this.zzc = i10;
            this.zzd = iZzb >> iNumberOfTrailingZeros;
            this.zza = length - 1;
            this.zzg = bArr;
            boolean[] zArr = new boolean[i10];
            for (int i11 = 0; i11 < this.zzd; i11++) {
                zArr[zzcj.zza(i11 * 8, this.zzb, RoundingMode.CEILING)] = true;
            }
            this.zzh = z10;
        } catch (ArithmeticException e10) {
            throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e10);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzcd) {
            zzcd zzcdVar = (zzcd) obj;
            if (this.zzh == zzcdVar.zzh && Arrays.equals(this.zzf, zzcdVar.zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zzf) + (true != this.zzh ? 1237 : 1231);
    }

    public final String toString() {
        return this.zze;
    }

    final char zza(int i10) {
        return this.zzf[i10];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v15 */
    final zzcd zzb() {
        int i10;
        boolean z10;
        for (char c10 : this.zzf) {
            if (zzad.zza(c10)) {
                char[] cArr = this.zzf;
                int length = cArr.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        z10 = false;
                        break;
                    }
                    char c11 = cArr[i11];
                    if (c11 >= 'A' && c11 <= 'Z') {
                        z10 = true;
                        break;
                    }
                    i11++;
                }
                if (!(!z10)) {
                    throw new IllegalStateException("Cannot call upperCase() on a mixed-case alphabet");
                }
                char[] cArr2 = new char[this.zzf.length];
                int i12 = 0;
                while (true) {
                    char[] cArr3 = this.zzf;
                    if (i12 >= cArr3.length) {
                        break;
                    }
                    char c12 = cArr3[i12];
                    if (zzad.zza(c12)) {
                        c12 ^= 32;
                    }
                    cArr2[i12] = (char) c12;
                    i12++;
                }
                zzcd zzcdVar = new zzcd(this.zze.concat(".upperCase()"), cArr2);
                if (!this.zzh || zzcdVar.zzh) {
                    return zzcdVar;
                }
                byte[] bArr = zzcdVar.zzg;
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                for (i10 = 65; i10 <= 90; i10++) {
                    int i13 = i10 | 32;
                    byte[] bArr2 = zzcdVar.zzg;
                    byte b10 = bArr2[i10];
                    byte b11 = bArr2[i13];
                    if (b10 == -1) {
                        bArrCopyOf[i10] = b11;
                    } else {
                        char c13 = (char) i10;
                        char c14 = (char) i13;
                        if (b11 != -1) {
                            throw new IllegalStateException(zzaq.zza("Can't ignoreCase() since '%s' and '%s' encode different values", Character.valueOf(c13), Character.valueOf(c14)));
                        }
                        bArrCopyOf[i13] = b10;
                    }
                }
                return new zzcd(zzcdVar.zze.concat(".ignoreCase()"), zzcdVar.zzf, bArrCopyOf, true);
            }
        }
        return this;
    }

    public final boolean zzc(char c10) {
        byte[] bArr = this.zzg;
        return bArr.length > 61 && bArr[61] != -1;
    }
}
