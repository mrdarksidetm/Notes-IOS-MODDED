package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.a;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class zzajd extends zzajb {
    private final InputStream zze;
    private final byte[] zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;

    private zzajd(InputStream inputStream, int i10) {
        super();
        this.zzl = a.e.API_PRIORITY_OTHER;
        zzakb.zza(inputStream, "input");
        this.zze = inputStream;
        this.zzf = new byte[4096];
        this.zzg = 0;
        this.zzi = 0;
        this.zzk = 0;
    }

    private static int zza(InputStream inputStream) throws zzakf {
        try {
            return inputStream.available();
        } catch (zzakf e10) {
            e10.zzk();
            throw e10;
        }
    }

    private static int zza(InputStream inputStream, byte[] bArr, int i10, int i11) throws zzakf {
        try {
            return inputStream.read(bArr, i10, i11);
        } catch (zzakf e10) {
            e10.zzk();
            throw e10;
        }
    }

    private static long zza(InputStream inputStream, long j10) throws zzakf {
        try {
            return inputStream.skip(j10);
        } catch (zzakf e10) {
            e10.zzk();
            throw e10;
        }
    }

    private final byte[] zza(int i10, boolean z10) throws IOException {
        byte[] bArrZzj = zzj(i10);
        if (bArrZzj != null) {
            return bArrZzj;
        }
        int i11 = this.zzi;
        int i12 = this.zzg;
        int length = i12 - i11;
        this.zzk += i12;
        this.zzi = 0;
        this.zzg = 0;
        List<byte[]> listZzf = zzf(i10 - length);
        byte[] bArr = new byte[i10];
        System.arraycopy(this.zzf, i11, bArr, 0, length);
        for (byte[] bArr2 : listZzf) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b0, code lost:
    
        if (r2[r0] >= 0) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final long zzaa() {
        /*
            r11 = this;
            int r0 = r11.zzi
            int r1 = r11.zzg
            if (r1 == r0) goto Lb8
            byte[] r2 = r11.zzf
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L12
            r11.zzi = r3
            long r0 = (long) r0
            return r0
        L12:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto Lb8
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L25
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
        L22:
            long r2 = (long) r0
            goto Lb5
        L25:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L36
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            long r0 = (long) r0
            r9 = r0
            r1 = r3
            r2 = r9
            goto Lb5
        L36:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L44
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L22
        L44:
            long r3 = (long) r0
            int r0 = r1 + 1
            r1 = r2[r1]
            long r5 = (long) r1
            r1 = 28
            long r5 = r5 << r1
            long r3 = r3 ^ r5
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L5b
            r1 = 266354560(0xfe03f80, double:1.315966377E-315)
        L57:
            long r2 = r3 ^ r1
            r1 = r0
            goto Lb5
        L5b:
            int r1 = r0 + 1
            r0 = r2[r0]
            long r7 = (long) r0
            r0 = 35
            long r7 = r7 << r0
            long r3 = r3 ^ r7
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L70
            r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
        L6d:
            long r2 = r3 ^ r5
            goto Lb5
        L70:
            int r0 = r1 + 1
            r1 = r2[r1]
            long r7 = (long) r1
            r1 = 42
            long r7 = r7 << r1
            long r3 = r3 ^ r7
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L83
            r1 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
            goto L57
        L83:
            int r1 = r0 + 1
            r0 = r2[r0]
            long r7 = (long) r0
            r0 = 49
            long r7 = r7 << r0
            long r3 = r3 ^ r7
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L96
            r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
            goto L6d
        L96:
            int r0 = r1 + 1
            r1 = r2[r1]
            long r7 = (long) r1
            r1 = 56
            long r7 = r7 << r1
            long r3 = r3 ^ r7
            r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
            long r3 = r3 ^ r7
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto Lb3
            int r1 = r0 + 1
            r0 = r2[r0]
            long r7 = (long) r0
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 < 0) goto Lb8
            goto Lb4
        Lb3:
            r1 = r0
        Lb4:
            r2 = r3
        Lb5:
            r11.zzi = r1
            return r2
        Lb8:
            long r0 = r11.zzm()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzajd.zzaa():long");
    }

    private final void zzab() {
        int i10 = this.zzg + this.zzh;
        this.zzg = i10;
        int i11 = this.zzk + i10;
        int i12 = this.zzl;
        if (i11 <= i12) {
            this.zzh = 0;
            return;
        }
        int i13 = i11 - i12;
        this.zzh = i13;
        this.zzg = i10 - i13;
    }

    private final List<byte[]> zzf(int i10) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i10 > 0) {
            int iMin = Math.min(i10, 4096);
            byte[] bArr = new byte[iMin];
            int i11 = 0;
            while (i11 < iMin) {
                int i12 = this.zze.read(bArr, i11, iMin - i11);
                if (i12 == -1) {
                    throw zzakf.zzj();
                }
                this.zzk += i12;
                i11 += i12;
            }
            i10 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    private final void zzg(int i10) throws zzakf {
        if (zzi(i10)) {
            return;
        }
        if (i10 <= (this.zzc - this.zzk) - this.zzi) {
            throw zzakf.zzj();
        }
        throw zzakf.zzi();
    }

    private final void zzh(int i10) throws zzakf {
        int i11 = this.zzg;
        int i12 = this.zzi;
        if (i10 <= i11 - i12 && i10 >= 0) {
            this.zzi = i12 + i10;
            return;
        }
        if (i10 < 0) {
            throw zzakf.zzf();
        }
        int i13 = this.zzk;
        int i14 = i13 + i12 + i10;
        int i15 = this.zzl;
        if (i14 > i15) {
            zzh((i15 - i13) - i12);
            throw zzakf.zzj();
        }
        this.zzk = i13 + i12;
        int i16 = i11 - i12;
        this.zzg = 0;
        this.zzi = 0;
        while (i16 < i10) {
            try {
                long j10 = i10 - i16;
                long jZza = zza(this.zze, j10);
                if (jZza >= 0 && jZza <= j10) {
                    if (jZza == 0) {
                        break;
                    } else {
                        i16 += (int) jZza;
                    }
                } else {
                    throw new IllegalStateException(String.valueOf(this.zze.getClass()) + "#skip returned invalid result: " + jZza + "\nThe InputStream implementation is buggy.");
                }
            } finally {
                this.zzk += i16;
                zzab();
            }
        }
        if (i16 >= i10) {
            return;
        }
        int i17 = this.zzg;
        int i18 = i17 - this.zzi;
        this.zzi = i17;
        while (true) {
            zzg(1);
            int i19 = i10 - i18;
            int i20 = this.zzg;
            if (i19 <= i20) {
                this.zzi = i19;
                return;
            } else {
                i18 += i20;
                this.zzi = i20;
            }
        }
    }

    private final boolean zzi(int i10) throws zzakf {
        do {
            int i11 = this.zzi;
            int i12 = i11 + i10;
            int i13 = this.zzg;
            if (i12 <= i13) {
                throw new IllegalStateException("refillBuffer() called when " + i10 + " bytes were already available in buffer");
            }
            int i14 = this.zzc;
            int i15 = this.zzk;
            if (i10 > (i14 - i15) - i11 || i15 + i11 + i10 > this.zzl) {
                return false;
            }
            if (i11 > 0) {
                if (i13 > i11) {
                    byte[] bArr = this.zzf;
                    System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
                }
                this.zzk += i11;
                this.zzg -= i11;
                this.zzi = 0;
            }
            InputStream inputStream = this.zze;
            byte[] bArr2 = this.zzf;
            int i16 = this.zzg;
            int iZza = zza(inputStream, bArr2, i16, Math.min(bArr2.length - i16, (this.zzc - this.zzk) - i16));
            if (iZza == 0 || iZza < -1 || iZza > this.zzf.length) {
                throw new IllegalStateException(String.valueOf(this.zze.getClass()) + "#read(byte[]) returned invalid result: " + iZza + "\nThe InputStream implementation is buggy.");
            }
            if (iZza <= 0) {
                return false;
            }
            this.zzg += iZza;
            zzab();
        } while (this.zzg < i10);
        return true;
    }

    private final byte[] zzj(int i10) throws zzakf {
        if (i10 == 0) {
            return zzakb.zzb;
        }
        if (i10 < 0) {
            throw zzakf.zzf();
        }
        int i11 = this.zzk;
        int i12 = this.zzi;
        int i13 = i11 + i12 + i10;
        if (i13 - this.zzc > 0) {
            throw zzakf.zzi();
        }
        int i14 = this.zzl;
        if (i13 > i14) {
            zzh((i14 - i11) - i12);
            throw zzakf.zzj();
        }
        int i15 = this.zzg - i12;
        int i16 = i10 - i15;
        if (i16 >= 4096 && i16 > zza(this.zze)) {
            return null;
        }
        byte[] bArr = new byte[i10];
        System.arraycopy(this.zzf, this.zzi, bArr, 0, i15);
        this.zzk += this.zzg;
        this.zzi = 0;
        this.zzg = 0;
        while (i15 < i10) {
            int iZza = zza(this.zze, bArr, i15, i10 - i15);
            if (iZza == -1) {
                throw zzakf.zzj();
            }
            this.zzk += iZza;
            i15 += iZza;
        }
        return bArr;
    }

    private final byte zzw() throws zzakf {
        if (this.zzi == this.zzg) {
            zzg(1);
        }
        byte[] bArr = this.zzf;
        int i10 = this.zzi;
        this.zzi = i10 + 1;
        return bArr[i10];
    }

    private final int zzx() throws zzakf {
        int i10 = this.zzi;
        if (this.zzg - i10 < 4) {
            zzg(4);
            i10 = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i10 + 4;
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0066, code lost:
    
        if (r2[r3] >= 0) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int zzy() {
        /*
            r5 = this;
            int r0 = r5.zzi
            int r1 = r5.zzg
            if (r1 == r0) goto L6b
            byte[] r2 = r5.zzf
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L11
            r5.zzi = r3
            return r0
        L11:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L6b
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L22
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L68
        L22:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L2f
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L2d:
            r1 = r3
            goto L68
        L2f:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L3d
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L68
        L3d:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L2d
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L68
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2d
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L68
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2d
            int r1 = r3 + 1
            r2 = r2[r3]
            if (r2 < 0) goto L6b
        L68:
            r5.zzi = r1
            return r0
        L6b:
            long r0 = r5.zzm()
            int r0 = (int) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzajd.zzy():int");
    }

    private final long zzz() throws zzakf {
        int i10 = this.zzi;
        if (this.zzg - i10 < 8) {
            zzg(8);
            i10 = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i10 + 8;
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final double zza() {
        return Double.longBitsToDouble(zzz());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final int zza(int i10) throws zzakf {
        if (i10 < 0) {
            throw zzakf.zzf();
        }
        int i11 = i10 + this.zzk + this.zzi;
        if (i11 < 0) {
            throw zzakf.zzg();
        }
        int i12 = this.zzl;
        if (i11 > i12) {
            throw zzakf.zzj();
        }
        this.zzl = i11;
        zzab();
        return i12;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final float zzb() {
        return Float.intBitsToFloat(zzx());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final void zzb(int i10) throws zzakf {
        if (this.zzj != i10) {
            throw zzakf.zzb();
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final int zzc() {
        return this.zzk + this.zzi;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final void zzc(int i10) {
        this.zzl = i10;
        zzab();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final int zzd() {
        return zzy();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final boolean zzd(int i10) throws zzakf {
        int i11 = i10 & 7;
        int i12 = 0;
        if (i11 == 0) {
            if (this.zzg - this.zzi < 10) {
                while (i12 < 10) {
                    if (zzw() < 0) {
                        i12++;
                    }
                }
                throw zzakf.zze();
            }
            while (i12 < 10) {
                byte[] bArr = this.zzf;
                int i13 = this.zzi;
                this.zzi = i13 + 1;
                if (bArr[i13] < 0) {
                    i12++;
                }
            }
            throw zzakf.zze();
            return true;
        }
        if (i11 == 1) {
            zzh(8);
            return true;
        }
        if (i11 == 2) {
            zzh(zzy());
            return true;
        }
        if (i11 == 3) {
            zzv();
            zzb(((i10 >>> 3) << 3) | 4);
            return true;
        }
        if (i11 == 4) {
            return false;
        }
        if (i11 != 5) {
            throw zzakf.zza();
        }
        zzh(4);
        return true;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final int zze() {
        return zzx();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final int zzf() {
        return zzy();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final int zzg() {
        return zzx();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final int zzh() {
        return zzajb.zze(zzy());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final int zzi() throws zzakf {
        if (zzt()) {
            this.zzj = 0;
            return 0;
        }
        int iZzy = zzy();
        this.zzj = iZzy;
        if ((iZzy >>> 3) != 0) {
            return iZzy;
        }
        throw zzakf.zzc();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final int zzj() {
        return zzy();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final long zzk() {
        return zzz();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final long zzl() {
        return zzaa();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    final long zzm() throws zzakf {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            byte bZzw = zzw();
            j10 |= ((long) (bZzw & 127)) << i10;
            if ((bZzw & 128) == 0) {
                return j10;
            }
        }
        throw zzakf.zze();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final long zzn() {
        return zzz();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final long zzo() {
        return zzajb.zza(zzaa());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final long zzp() {
        return zzaa();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final zzaip zzq() throws IOException {
        int iZzy = zzy();
        int i10 = this.zzg;
        int i11 = this.zzi;
        if (iZzy <= i10 - i11 && iZzy > 0) {
            zzaip zzaipVarZza = zzaip.zza(this.zzf, i11, iZzy);
            this.zzi += iZzy;
            return zzaipVarZza;
        }
        if (iZzy == 0) {
            return zzaip.zza;
        }
        if (iZzy < 0) {
            throw zzakf.zzf();
        }
        byte[] bArrZzj = zzj(iZzy);
        if (bArrZzj != null) {
            return zzaip.zza(bArrZzj);
        }
        int i12 = this.zzi;
        int i13 = this.zzg;
        int length = i13 - i12;
        this.zzk += i13;
        this.zzi = 0;
        this.zzg = 0;
        List<byte[]> listZzf = zzf(iZzy - length);
        byte[] bArr = new byte[iZzy];
        System.arraycopy(this.zzf, i12, bArr, 0, length);
        for (byte[] bArr2 : listZzf) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return zzaip.zzb(bArr);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final String zzr() throws zzakf {
        int iZzy = zzy();
        if (iZzy > 0) {
            int i10 = this.zzg;
            int i11 = this.zzi;
            if (iZzy <= i10 - i11) {
                String str = new String(this.zzf, i11, iZzy, zzakb.zza);
                this.zzi += iZzy;
                return str;
            }
        }
        if (iZzy == 0) {
            return "";
        }
        if (iZzy < 0) {
            throw zzakf.zzf();
        }
        if (iZzy > this.zzg) {
            return new String(zza(iZzy, false), zzakb.zza);
        }
        zzg(iZzy);
        String str2 = new String(this.zzf, this.zzi, iZzy, zzakb.zza);
        this.zzi += iZzy;
        return str2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final String zzs() throws IOException {
        byte[] bArrZza;
        int iZzy = zzy();
        int i10 = this.zzi;
        int i11 = this.zzg;
        if (iZzy <= i11 - i10 && iZzy > 0) {
            bArrZza = this.zzf;
            this.zzi = i10 + iZzy;
        } else {
            if (iZzy == 0) {
                return "";
            }
            if (iZzy < 0) {
                throw zzakf.zzf();
            }
            if (iZzy <= i11) {
                zzg(iZzy);
                bArrZza = this.zzf;
                this.zzi = iZzy;
            } else {
                bArrZza = zza(iZzy, false);
            }
            i10 = 0;
        }
        return zzamt.zzb(bArrZza, i10, iZzy);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final boolean zzt() {
        return this.zzi == this.zzg && !zzi(1);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final boolean zzu() {
        return zzaa() != 0;
    }
}
