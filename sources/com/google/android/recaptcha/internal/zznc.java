package com.google.android.recaptcha.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zznc {
    private static final zznc zza = new zznc(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zznc() {
        this(0, new int[8], new Object[8], true);
    }

    private zznc(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.zze = -1;
        this.zzb = i10;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z10;
    }

    public static zznc zzc() {
        return zza;
    }

    static zznc zze(zznc zzncVar, zznc zzncVar2) {
        int i10 = zzncVar.zzb + zzncVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzncVar.zzc, i10);
        System.arraycopy(zzncVar2.zzc, 0, iArrCopyOf, zzncVar.zzb, zzncVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzncVar.zzd, i10);
        System.arraycopy(zzncVar2.zzd, 0, objArrCopyOf, zzncVar.zzb, zzncVar2.zzb);
        return new zznc(i10, iArrCopyOf, objArrCopyOf, true);
    }

    static zznc zzf() {
        return new zznc(0, new int[8], new Object[8], true);
    }

    private final void zzm(int i10) {
        int[] iArr = this.zzc;
        if (i10 > iArr.length) {
            int i11 = this.zzb;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i10);
            this.zzd = Arrays.copyOf(this.zzd, i10);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zznc)) {
            return false;
        }
        zznc zzncVar = (zznc) obj;
        int i10 = this.zzb;
        if (i10 == zzncVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzncVar.zzc;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzncVar.zzd;
                    int i12 = this.zzb;
                    for (int i13 = 0; i13 < i12; i13++) {
                        if (objArr[i13].equals(objArr2[i13])) {
                        }
                    }
                    return true;
                }
                if (iArr[i11] != iArr2[i11]) {
                    break;
                }
                i11++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzb;
        int i11 = i10 + 527;
        int[] iArr = this.zzc;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = ((i11 * 31) + i12) * 31;
        Object[] objArr = this.zzd;
        int i15 = this.zzb;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }

    public final int zza() {
        int iZzx;
        int iZzy;
        int iZzx2;
        int i10 = this.zze;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.zzb; i12++) {
            int i13 = this.zzc[i12];
            int i14 = i13 >>> 3;
            int i15 = i13 & 7;
            if (i15 != 0) {
                if (i15 == 1) {
                    ((Long) this.zzd[i12]).longValue();
                    iZzx2 = zzjg.zzx(i14 << 3) + 8;
                } else if (i15 == 2) {
                    int i16 = i14 << 3;
                    zziv zzivVar = (zziv) this.zzd[i12];
                    int iZzx3 = zzjg.zzx(i16);
                    int iZzd = zzivVar.zzd();
                    iZzx2 = iZzx3 + zzjg.zzx(iZzd) + iZzd;
                } else if (i15 == 3) {
                    int iZzx4 = zzjg.zzx(i14 << 3);
                    iZzx = iZzx4 + iZzx4;
                    iZzy = ((zznc) this.zzd[i12]).zza();
                } else {
                    if (i15 != 5) {
                        throw new IllegalStateException(zzlc.zza());
                    }
                    ((Integer) this.zzd[i12]).intValue();
                    iZzx2 = zzjg.zzx(i14 << 3) + 4;
                }
                i11 += iZzx2;
            } else {
                int i17 = i14 << 3;
                long jLongValue = ((Long) this.zzd[i12]).longValue();
                iZzx = zzjg.zzx(i17);
                iZzy = zzjg.zzy(jLongValue);
            }
            iZzx2 = iZzx + iZzy;
            i11 += iZzx2;
        }
        this.zze = i11;
        return i11;
    }

    public final int zzb() {
        int i10 = this.zze;
        if (i10 != -1) {
            return i10;
        }
        int iZzx = 0;
        for (int i11 = 0; i11 < this.zzb; i11++) {
            int i12 = this.zzc[i11] >>> 3;
            zziv zzivVar = (zziv) this.zzd[i11];
            int iZzx2 = zzjg.zzx(8);
            int iZzx3 = zzjg.zzx(16) + zzjg.zzx(i12);
            int iZzx4 = zzjg.zzx(24);
            int iZzd = zzivVar.zzd();
            iZzx += iZzx2 + iZzx2 + iZzx3 + iZzx4 + zzjg.zzx(iZzd) + iZzd;
        }
        this.zze = iZzx;
        return iZzx;
    }

    final zznc zzd(zznc zzncVar) {
        if (zzncVar.equals(zza)) {
            return this;
        }
        zzg();
        int i10 = this.zzb + zzncVar.zzb;
        zzm(i10);
        System.arraycopy(zzncVar.zzc, 0, this.zzc, this.zzb, zzncVar.zzb);
        System.arraycopy(zzncVar.zzd, 0, this.zzd, this.zzb, zzncVar.zzb);
        this.zzb = i10;
        return this;
    }

    final void zzg() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzh() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    final void zzi(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.zzb; i11++) {
            zzlz.zzb(sb2, i10, String.valueOf(this.zzc[i11] >>> 3), this.zzd[i11]);
        }
    }

    final void zzj(int i10, Object obj) {
        zzg();
        zzm(this.zzb + 1);
        int[] iArr = this.zzc;
        int i11 = this.zzb;
        iArr[i11] = i10;
        this.zzd[i11] = obj;
        this.zzb = i11 + 1;
    }

    final void zzk(zzno zznoVar) {
        for (int i10 = 0; i10 < this.zzb; i10++) {
            zznoVar.zzw(this.zzc[i10] >>> 3, this.zzd[i10]);
        }
    }

    public final void zzl(zzno zznoVar) {
        if (this.zzb != 0) {
            for (int i10 = 0; i10 < this.zzb; i10++) {
                int i11 = this.zzc[i10];
                Object obj = this.zzd[i10];
                int i12 = i11 & 7;
                int i13 = i11 >>> 3;
                if (i12 == 0) {
                    zznoVar.zzt(i13, ((Long) obj).longValue());
                } else if (i12 == 1) {
                    zznoVar.zzm(i13, ((Long) obj).longValue());
                } else if (i12 == 2) {
                    zznoVar.zzd(i13, (zziv) obj);
                } else if (i12 == 3) {
                    zznoVar.zzF(i13);
                    ((zznc) obj).zzl(zznoVar);
                    zznoVar.zzh(i13);
                } else {
                    if (i12 != 5) {
                        throw new RuntimeException(zzlc.zza());
                    }
                    zznoVar.zzk(i13, ((Integer) obj).intValue());
                }
            }
        }
    }
}
