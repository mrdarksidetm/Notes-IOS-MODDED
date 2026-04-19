package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.a;

/* JADX INFO: loaded from: classes.dex */
final class zzaja extends zzajb {
    private final byte[] zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;

    private zzaja(byte[] bArr, int i10, int i11, boolean z10) {
        super();
        this.zzk = a.e.API_PRIORITY_OTHER;
        this.zze = bArr;
        this.zzf = i11 + i10;
        this.zzh = i10;
        this.zzi = i10;
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
            int r0 = r11.zzh
            int r1 = r11.zzf
            if (r1 == r0) goto Lb8
            byte[] r2 = r11.zze
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L12
            r11.zzh = r3
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
            r11.zzh = r1
            return r2
        Lb8:
            long r0 = r11.zzm()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzaja.zzaa():long");
    }

    private final void zzab() {
        int i10 = this.zzf + this.zzg;
        this.zzf = i10;
        int i11 = i10 - this.zzi;
        int i12 = this.zzk;
        if (i11 <= i12) {
            this.zzg = 0;
            return;
        }
        int i13 = i11 - i12;
        this.zzg = i13;
        this.zzf = i10 - i13;
    }

    private final void zzf(int i10) throws zzakf {
        if (i10 >= 0) {
            int i11 = this.zzf;
            int i12 = this.zzh;
            if (i10 <= i11 - i12) {
                this.zzh = i12 + i10;
                return;
            }
        }
        if (i10 >= 0) {
            throw zzakf.zzj();
        }
        throw zzakf.zzf();
    }

    private final byte zzw() throws zzakf {
        int i10 = this.zzh;
        if (i10 == this.zzf) {
            throw zzakf.zzj();
        }
        byte[] bArr = this.zze;
        this.zzh = i10 + 1;
        return bArr[i10];
    }

    private final int zzx() throws zzakf {
        int i10 = this.zzh;
        if (this.zzf - i10 < 4) {
            throw zzakf.zzj();
        }
        byte[] bArr = this.zze;
        this.zzh = i10 + 4;
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
            int r0 = r5.zzh
            int r1 = r5.zzf
            if (r1 == r0) goto L6b
            byte[] r2 = r5.zze
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L11
            r5.zzh = r3
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
            r5.zzh = r1
            return r0
        L6b:
            long r0 = r5.zzm()
            int r0 = (int) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzaja.zzy():int");
    }

    private final long zzz() throws zzakf {
        int i10 = this.zzh;
        if (this.zzf - i10 < 8) {
            throw zzakf.zzj();
        }
        byte[] bArr = this.zze;
        this.zzh = i10 + 8;
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
        int iZzc = i10 + zzc();
        if (iZzc < 0) {
            throw zzakf.zzg();
        }
        int i11 = this.zzk;
        if (iZzc > i11) {
            throw zzakf.zzj();
        }
        this.zzk = iZzc;
        zzab();
        return i11;
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
        return this.zzh - this.zzi;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final void zzc(int i10) {
        this.zzk = i10;
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
            if (this.zzf - this.zzh < 10) {
                while (i12 < 10) {
                    if (zzw() < 0) {
                        i12++;
                    }
                }
                throw zzakf.zze();
            }
            while (i12 < 10) {
                byte[] bArr = this.zze;
                int i13 = this.zzh;
                this.zzh = i13 + 1;
                if (bArr[i13] < 0) {
                    i12++;
                }
            }
            throw zzakf.zze();
            return true;
        }
        if (i11 == 1) {
            zzf(8);
            return true;
        }
        if (i11 == 2) {
            zzf(zzy());
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
        zzf(4);
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

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.p002firebaseauthapi.zzaip zzq() throws com.google.android.gms.internal.p002firebaseauthapi.zzakf {
        /*
            r3 = this;
            int r0 = r3.zzy()
            if (r0 <= 0) goto L19
            int r1 = r3.zzf
            int r2 = r3.zzh
            int r1 = r1 - r2
            if (r0 > r1) goto L19
            byte[] r1 = r3.zze
            com.google.android.gms.internal.firebase-auth-api.zzaip r1 = com.google.android.gms.internal.p002firebaseauthapi.zzaip.zza(r1, r2, r0)
            int r2 = r3.zzh
            int r2 = r2 + r0
            r3.zzh = r2
            return r1
        L19:
            if (r0 != 0) goto L1e
            com.google.android.gms.internal.firebase-auth-api.zzaip r0 = com.google.android.gms.internal.p002firebaseauthapi.zzaip.zza
            return r0
        L1e:
            if (r0 <= 0) goto L31
            int r1 = r3.zzf
            int r2 = r3.zzh
            int r1 = r1 - r2
            if (r0 > r1) goto L31
            int r0 = r0 + r2
            r3.zzh = r0
            byte[] r1 = r3.zze
            byte[] r0 = java.util.Arrays.copyOfRange(r1, r2, r0)
            goto L37
        L31:
            if (r0 > 0) goto L41
            if (r0 != 0) goto L3c
            byte[] r0 = com.google.android.gms.internal.p002firebaseauthapi.zzakb.zzb
        L37:
            com.google.android.gms.internal.firebase-auth-api.zzaip r0 = com.google.android.gms.internal.p002firebaseauthapi.zzaip.zzb(r0)
            return r0
        L3c:
            com.google.android.gms.internal.firebase-auth-api.zzakf r0 = com.google.android.gms.internal.p002firebaseauthapi.zzakf.zzf()
            throw r0
        L41:
            com.google.android.gms.internal.firebase-auth-api.zzakf r0 = com.google.android.gms.internal.p002firebaseauthapi.zzakf.zzj()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzaja.zzq():com.google.android.gms.internal.firebase-auth-api.zzaip");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final String zzr() throws zzakf {
        int iZzy = zzy();
        if (iZzy > 0) {
            int i10 = this.zzf;
            int i11 = this.zzh;
            if (iZzy <= i10 - i11) {
                String str = new String(this.zze, i11, iZzy, zzakb.zza);
                this.zzh += iZzy;
                return str;
            }
        }
        if (iZzy == 0) {
            return "";
        }
        if (iZzy < 0) {
            throw zzakf.zzf();
        }
        throw zzakf.zzj();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final String zzs() throws zzakf {
        int iZzy = zzy();
        if (iZzy > 0) {
            int i10 = this.zzf;
            int i11 = this.zzh;
            if (iZzy <= i10 - i11) {
                String strZzb = zzamt.zzb(this.zze, i11, iZzy);
                this.zzh += iZzy;
                return strZzb;
            }
        }
        if (iZzy == 0) {
            return "";
        }
        if (iZzy <= 0) {
            throw zzakf.zzf();
        }
        throw zzakf.zzj();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final boolean zzt() {
        return this.zzh == this.zzf;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final boolean zzu() {
        return zzaa() != 0;
    }
}
