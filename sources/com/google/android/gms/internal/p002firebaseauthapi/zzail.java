package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajy;

/* JADX INFO: loaded from: classes.dex */
final class zzail {
    private static volatile int zza = 100;

    static double zza(byte[] bArr, int i10) {
        return Double.longBitsToDouble(zzd(bArr, i10));
    }

    static int zza(int i10, byte[] bArr, int i11, int i12, zzaik zzaikVar) {
        if ((i10 >>> 3) == 0) {
            throw zzakf.zzc();
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            return zzd(bArr, i11, zzaikVar);
        }
        if (i13 == 1) {
            return i11 + 8;
        }
        if (i13 == 2) {
            return zzc(bArr, i11, zzaikVar) + zzaikVar.zza;
        }
        if (i13 != 3) {
            if (i13 == 5) {
                return i11 + 4;
            }
            throw zzakf.zzc();
        }
        int i14 = (i10 & (-8)) | 4;
        int i15 = 0;
        while (i11 < i12) {
            i11 = zzc(bArr, i11, zzaikVar);
            i15 = zzaikVar.zza;
            if (i15 == i14) {
                break;
            }
            i11 = zza(i15, bArr, i11, i12, zzaikVar);
        }
        if (i11 > i12 || i15 != i14) {
            throw zzakf.zzg();
        }
        return i11;
    }

    static int zza(int i10, byte[] bArr, int i11, int i12, zzakc<?> zzakcVar, zzaik zzaikVar) {
        zzajz zzajzVar = (zzajz) zzakcVar;
        int iZzc = zzc(bArr, i11, zzaikVar);
        while (true) {
            zzajzVar.zzc(zzaikVar.zza);
            if (iZzc >= i12) {
                break;
            }
            int iZzc2 = zzc(bArr, iZzc, zzaikVar);
            if (i10 != zzaikVar.zza) {
                break;
            }
            iZzc = zzc(bArr, iZzc2, zzaikVar);
        }
        return iZzc;
    }

    static int zza(int i10, byte[] bArr, int i11, int i12, zzamn zzamnVar, zzaik zzaikVar) {
        if ((i10 >>> 3) == 0) {
            throw zzakf.zzc();
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int iZzd = zzd(bArr, i11, zzaikVar);
            zzamnVar.zza(i10, Long.valueOf(zzaikVar.zzb));
            return iZzd;
        }
        if (i13 == 1) {
            zzamnVar.zza(i10, Long.valueOf(zzd(bArr, i11)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int iZzc = zzc(bArr, i11, zzaikVar);
            int i14 = zzaikVar.zza;
            if (i14 < 0) {
                throw zzakf.zzf();
            }
            if (i14 > bArr.length - iZzc) {
                throw zzakf.zzj();
            }
            zzamnVar.zza(i10, i14 == 0 ? zzaip.zza : zzaip.zza(bArr, iZzc, i14));
            return iZzc + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw zzakf.zzc();
            }
            zzamnVar.zza(i10, Integer.valueOf(zzc(bArr, i11)));
            return i11 + 4;
        }
        zzamn zzamnVarZzd = zzamn.zzd();
        int i15 = (i10 & (-8)) | 4;
        int i16 = 0;
        int i17 = zzaikVar.zze + 1;
        zzaikVar.zze = i17;
        zza(i17);
        while (true) {
            if (i11 >= i12) {
                break;
            }
            int iZzc2 = zzc(bArr, i11, zzaikVar);
            int i18 = zzaikVar.zza;
            i16 = i18;
            if (i18 == i15) {
                i11 = iZzc2;
                break;
            }
            int iZza = zza(i16, bArr, iZzc2, i12, zzamnVarZzd, zzaikVar);
            i16 = i18;
            i11 = iZza;
        }
        zzaikVar.zze--;
        if (i11 > i12 || i16 != i15) {
            throw zzakf.zzg();
        }
        zzamnVar.zza(i10, zzamnVarZzd);
        return i11;
    }

    static int zza(int i10, byte[] bArr, int i11, int i12, Object obj, zzalc zzalcVar, zzamo<zzamn, zzamn> zzamoVar, zzaik zzaikVar) {
        if (zzaikVar.zzd.zza(zzalcVar, i10 >>> 3) == null) {
            return zza(i10, bArr, i11, i12, zzalg.zzc(obj), zzaikVar);
        }
        zzajy.zzb zzbVar = (zzajy.zzb) obj;
        zzbVar.zza();
        zzajr<zzajy.zze> zzajrVar = zzbVar.zzc;
        throw new NoSuchMethodError();
    }

    static int zza(int i10, byte[] bArr, int i11, zzaik zzaikVar) {
        int i12;
        int i13;
        int i14 = i10 & 127;
        int i15 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 < 0) {
            int i16 = i14 | ((b10 & 127) << 7);
            int i17 = i15 + 1;
            byte b11 = bArr[i15];
            if (b11 >= 0) {
                i12 = b11 << 14;
            } else {
                i14 = i16 | ((b11 & 127) << 14);
                i15 = i17 + 1;
                byte b12 = bArr[i17];
                if (b12 >= 0) {
                    i13 = b12 << 21;
                } else {
                    i16 = i14 | ((b12 & 127) << 21);
                    i17 = i15 + 1;
                    byte b13 = bArr[i15];
                    if (b13 >= 0) {
                        i12 = b13 << 28;
                    } else {
                        int i18 = i16 | ((b13 & 127) << 28);
                        while (true) {
                            int i19 = i17 + 1;
                            if (bArr[i17] >= 0) {
                                zzaikVar.zza = i18;
                                return i19;
                            }
                            i17 = i19;
                        }
                    }
                }
            }
            zzaikVar.zza = i16 | i12;
            return i17;
        }
        i13 = b10 << 7;
        zzaikVar.zza = i14 | i13;
        return i15;
    }

    static int zza(zzalv zzalvVar, int i10, byte[] bArr, int i11, int i12, zzakc<?> zzakcVar, zzaik zzaikVar) {
        int i13 = (i10 & (-8)) | 4;
        int iZza = zza(zzalvVar, bArr, i11, i12, i13, zzaikVar);
        while (true) {
            zzakcVar.add(zzaikVar.zzc);
            if (iZza >= i12) {
                break;
            }
            int iZzc = zzc(bArr, iZza, zzaikVar);
            if (i10 != zzaikVar.zza) {
                break;
            }
            iZza = zza(zzalvVar, bArr, iZzc, i12, i13, zzaikVar);
        }
        return iZza;
    }

    private static int zza(zzalv zzalvVar, byte[] bArr, int i10, int i11, int i12, zzaik zzaikVar) {
        Object objZza = zzalvVar.zza();
        int iZza = zza(objZza, zzalvVar, bArr, i10, i11, i12, zzaikVar);
        zzalvVar.zzd(objZza);
        zzaikVar.zzc = objZza;
        return iZza;
    }

    static int zza(zzalv zzalvVar, byte[] bArr, int i10, int i11, zzaik zzaikVar) {
        Object objZza = zzalvVar.zza();
        int iZza = zza(objZza, zzalvVar, bArr, i10, i11, zzaikVar);
        zzalvVar.zzd(objZza);
        zzaikVar.zzc = objZza;
        return iZza;
    }

    static int zza(Object obj, zzalv zzalvVar, byte[] bArr, int i10, int i11, int i12, zzaik zzaikVar) {
        zzalg zzalgVar = (zzalg) zzalvVar;
        int i13 = zzaikVar.zze + 1;
        zzaikVar.zze = i13;
        zza(i13);
        int iZza = zzalgVar.zza(obj, bArr, i10, i11, i12, zzaikVar);
        zzaikVar.zze--;
        zzaikVar.zzc = obj;
        return iZza;
    }

    static int zza(Object obj, zzalv zzalvVar, byte[] bArr, int i10, int i11, zzaik zzaikVar) {
        int iZza = i10 + 1;
        int i12 = bArr[i10];
        if (i12 < 0) {
            iZza = zza(i12, bArr, iZza, zzaikVar);
            i12 = zzaikVar.zza;
        }
        int i13 = iZza;
        if (i12 < 0 || i12 > i11 - i13) {
            throw zzakf.zzj();
        }
        int i14 = zzaikVar.zze + 1;
        zzaikVar.zze = i14;
        zza(i14);
        int i15 = i12 + i13;
        zzalvVar.zza(obj, bArr, i13, i15, zzaikVar);
        zzaikVar.zze--;
        zzaikVar.zzc = obj;
        return i15;
    }

    static int zza(byte[] bArr, int i10, zzaik zzaikVar) {
        int iZzc = zzc(bArr, i10, zzaikVar);
        int i11 = zzaikVar.zza;
        if (i11 < 0) {
            throw zzakf.zzf();
        }
        if (i11 > bArr.length - iZzc) {
            throw zzakf.zzj();
        }
        if (i11 == 0) {
            zzaikVar.zzc = zzaip.zza;
            return iZzc;
        }
        zzaikVar.zzc = zzaip.zza(bArr, iZzc, i11);
        return iZzc + i11;
    }

    static int zza(byte[] bArr, int i10, zzakc<?> zzakcVar, zzaik zzaikVar) {
        zzajz zzajzVar = (zzajz) zzakcVar;
        int iZzc = zzc(bArr, i10, zzaikVar);
        int i11 = zzaikVar.zza + iZzc;
        while (iZzc < i11) {
            iZzc = zzc(bArr, iZzc, zzaikVar);
            zzajzVar.zzc(zzaikVar.zza);
        }
        if (iZzc == i11) {
            return iZzc;
        }
        throw zzakf.zzj();
    }

    private static void zza(int i10) throws zzakf {
        if (i10 >= zza) {
            throw zzakf.zzh();
        }
    }

    static float zzb(byte[] bArr, int i10) {
        return Float.intBitsToFloat(zzc(bArr, i10));
    }

    static int zzb(zzalv<?> zzalvVar, int i10, byte[] bArr, int i11, int i12, zzakc<?> zzakcVar, zzaik zzaikVar) {
        int iZza = zza(zzalvVar, bArr, i11, i12, zzaikVar);
        while (true) {
            zzakcVar.add(zzaikVar.zzc);
            if (iZza >= i12) {
                break;
            }
            int iZzc = zzc(bArr, iZza, zzaikVar);
            if (i10 != zzaikVar.zza) {
                break;
            }
            iZza = zza(zzalvVar, bArr, iZzc, i12, zzaikVar);
        }
        return iZza;
    }

    static int zzb(byte[] bArr, int i10, zzaik zzaikVar) {
        int iZzc = zzc(bArr, i10, zzaikVar);
        int i11 = zzaikVar.zza;
        if (i11 < 0) {
            throw zzakf.zzf();
        }
        if (i11 == 0) {
            zzaikVar.zzc = "";
            return iZzc;
        }
        zzaikVar.zzc = zzamt.zzb(bArr, iZzc, i11);
        return iZzc + i11;
    }

    static int zzc(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    static int zzc(byte[] bArr, int i10, zzaik zzaikVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return zza(b10, bArr, i11, zzaikVar);
        }
        zzaikVar.zza = b10;
        return i11;
    }

    static int zzd(byte[] bArr, int i10, zzaik zzaikVar) {
        int i11 = i10 + 1;
        long j10 = bArr[i10];
        if (j10 >= 0) {
            zzaikVar.zzb = j10;
            return i11;
        }
        int i12 = i11 + 1;
        byte b10 = bArr[i11];
        long j11 = (j10 & 127) | (((long) (b10 & 127)) << 7);
        int i13 = 7;
        while (b10 < 0) {
            int i14 = i12 + 1;
            byte b11 = bArr[i12];
            i13 += 7;
            j11 |= ((long) (b11 & 127)) << i13;
            b10 = b11;
            i12 = i14;
        }
        zzaikVar.zzb = j11;
        return i12;
    }

    static long zzd(byte[] bArr, int i10) {
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
    }
}
