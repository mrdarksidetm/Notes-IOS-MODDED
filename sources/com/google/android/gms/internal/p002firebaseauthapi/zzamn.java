package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zzamn {
    private static final zzamn zza = new zzamn(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzamn() {
        this(0, new int[8], new Object[8], true);
    }

    private zzamn(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.zze = -1;
        this.zzb = i10;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z10;
    }

    static zzamn zza(zzamn zzamnVar, zzamn zzamnVar2) {
        int i10 = zzamnVar.zzb + zzamnVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzamnVar.zzc, i10);
        System.arraycopy(zzamnVar2.zzc, 0, iArrCopyOf, zzamnVar.zzb, zzamnVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzamnVar.zzd, i10);
        System.arraycopy(zzamnVar2.zzd, 0, objArrCopyOf, zzamnVar.zzb, zzamnVar2.zzb);
        return new zzamn(i10, iArrCopyOf, objArrCopyOf, true);
    }

    private final void zza(int i10) {
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

    private static void zza(int i10, Object obj, zzanf zzanfVar) {
        int i11 = i10 >>> 3;
        int i12 = i10 & 7;
        if (i12 == 0) {
            zzanfVar.zzb(i11, ((Long) obj).longValue());
            return;
        }
        if (i12 == 1) {
            zzanfVar.zza(i11, ((Long) obj).longValue());
            return;
        }
        if (i12 == 2) {
            zzanfVar.zza(i11, (zzaip) obj);
            return;
        }
        if (i12 != 3) {
            if (i12 != 5) {
                throw new RuntimeException(zzakf.zza());
            }
            zzanfVar.zzb(i11, ((Integer) obj).intValue());
        } else if (zzanfVar.zza() == 1) {
            zzanfVar.zzb(i11);
            ((zzamn) obj).zzb(zzanfVar);
            zzanfVar.zza(i11);
        } else {
            zzanfVar.zza(i11);
            ((zzamn) obj).zzb(zzanfVar);
            zzanfVar.zzb(i11);
        }
    }

    public static zzamn zzc() {
        return zza;
    }

    static zzamn zzd() {
        return new zzamn();
    }

    private final void zzf() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzamn)) {
            return false;
        }
        zzamn zzamnVar = (zzamn) obj;
        int i10 = this.zzb;
        if (i10 == zzamnVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzamnVar.zzc;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    z10 = true;
                    break;
                }
                if (iArr[i11] != iArr2[i11]) {
                    z10 = false;
                    break;
                }
                i11++;
            }
            if (z10) {
                Object[] objArr = this.zzd;
                Object[] objArr2 = zzamnVar.zzd;
                int i12 = this.zzb;
                int i13 = 0;
                while (true) {
                    if (i13 >= i12) {
                        z11 = true;
                        break;
                    }
                    if (!objArr[i13].equals(objArr2[i13])) {
                        z11 = false;
                        break;
                    }
                    i13++;
                }
                if (z11) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzb;
        int i11 = (i10 + 527) * 31;
        int[] iArr = this.zzc;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = (i11 + i12) * 31;
        Object[] objArr = this.zzd;
        int i15 = this.zzb;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }

    public final int zza() {
        int iZze;
        int i10 = this.zze;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.zzb; i12++) {
            int i13 = this.zzc[i12];
            int i14 = i13 >>> 3;
            int i15 = i13 & 7;
            if (i15 == 0) {
                iZze = zzajg.zze(i14, ((Long) this.zzd[i12]).longValue());
            } else if (i15 == 1) {
                iZze = zzajg.zza(i14, ((Long) this.zzd[i12]).longValue());
            } else if (i15 == 2) {
                iZze = zzajg.zza(i14, (zzaip) this.zzd[i12]);
            } else if (i15 == 3) {
                iZze = (zzajg.zzi(i14) << 1) + ((zzamn) this.zzd[i12]).zza();
            } else {
                if (i15 != 5) {
                    throw new IllegalStateException(zzakf.zza());
                }
                iZze = zzajg.zzc(i14, ((Integer) this.zzd[i12]).intValue());
            }
            i11 += iZze;
        }
        this.zze = i11;
        return i11;
    }

    final zzamn zza(zzamn zzamnVar) {
        if (zzamnVar.equals(zza)) {
            return this;
        }
        zzf();
        int i10 = this.zzb + zzamnVar.zzb;
        zza(i10);
        System.arraycopy(zzamnVar.zzc, 0, this.zzc, this.zzb, zzamnVar.zzb);
        System.arraycopy(zzamnVar.zzd, 0, this.zzd, this.zzb, zzamnVar.zzb);
        this.zzb = i10;
        return this;
    }

    final void zza(int i10, Object obj) {
        zzf();
        zza(this.zzb + 1);
        int[] iArr = this.zzc;
        int i11 = this.zzb;
        iArr[i11] = i10;
        this.zzd[i11] = obj;
        this.zzb = i11 + 1;
    }

    final void zza(zzanf zzanfVar) {
        if (zzanfVar.zza() == 2) {
            for (int i10 = this.zzb - 1; i10 >= 0; i10--) {
                zzanfVar.zza(this.zzc[i10] >>> 3, this.zzd[i10]);
            }
            return;
        }
        for (int i11 = 0; i11 < this.zzb; i11++) {
            zzanfVar.zza(this.zzc[i11] >>> 3, this.zzd[i11]);
        }
    }

    final void zza(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.zzb; i11++) {
            zzalh.zza(sb2, i10, String.valueOf(this.zzc[i11] >>> 3), this.zzd[i11]);
        }
    }

    public final int zzb() {
        int i10 = this.zze;
        if (i10 != -1) {
            return i10;
        }
        int iZzb = 0;
        for (int i11 = 0; i11 < this.zzb; i11++) {
            iZzb += zzajg.zzb(this.zzc[i11] >>> 3, (zzaip) this.zzd[i11]);
        }
        this.zze = iZzb;
        return iZzb;
    }

    public final void zzb(zzanf zzanfVar) {
        if (this.zzb == 0) {
            return;
        }
        if (zzanfVar.zza() == 1) {
            for (int i10 = 0; i10 < this.zzb; i10++) {
                zza(this.zzc[i10], this.zzd[i10], zzanfVar);
            }
            return;
        }
        for (int i11 = this.zzb - 1; i11 >= 0; i11--) {
            zza(this.zzc[i11], this.zzd[i11], zzanfVar);
        }
    }

    public final void zze() {
        if (this.zzf) {
            this.zzf = false;
        }
    }
}
