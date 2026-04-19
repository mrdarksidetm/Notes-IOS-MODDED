package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes.dex */
final class zzdu {
    static int zza(byte[] bArr, int i10, zzdt zzdtVar) {
        int iZzh = zzh(bArr, i10, zzdtVar);
        int i11 = zzdtVar.zza;
        if (i11 < 0) {
            throw zzfb.zzc();
        }
        if (i11 > bArr.length - iZzh) {
            throw zzfb.zzf();
        }
        if (i11 == 0) {
            zzdtVar.zzc = zzef.zzb;
            return iZzh;
        }
        zzdtVar.zzc = zzef.zzk(bArr, iZzh, i11);
        return iZzh + i11;
    }

    static int zzb(byte[] bArr, int i10) {
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        return ((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    static int zzc(zzgi zzgiVar, byte[] bArr, int i10, int i11, int i12, zzdt zzdtVar) {
        Object objZzd = zzgiVar.zzd();
        int iZzl = zzl(objZzd, zzgiVar, bArr, i10, i11, i12, zzdtVar);
        zzgiVar.zze(objZzd);
        zzdtVar.zzc = objZzd;
        return iZzl;
    }

    static int zzd(zzgi zzgiVar, byte[] bArr, int i10, int i11, zzdt zzdtVar) {
        Object objZzd = zzgiVar.zzd();
        int iZzm = zzm(objZzd, zzgiVar, bArr, i10, i11, zzdtVar);
        zzgiVar.zze(objZzd);
        zzdtVar.zzc = objZzd;
        return iZzm;
    }

    static int zze(zzgi zzgiVar, int i10, byte[] bArr, int i11, int i12, zzez zzezVar, zzdt zzdtVar) {
        int iZzd = zzd(zzgiVar, bArr, i11, i12, zzdtVar);
        while (true) {
            zzezVar.add(zzdtVar.zzc);
            if (iZzd >= i12) {
                break;
            }
            int iZzh = zzh(bArr, iZzd, zzdtVar);
            if (i10 != zzdtVar.zza) {
                break;
            }
            iZzd = zzd(zzgiVar, bArr, iZzh, i12, zzdtVar);
        }
        return iZzd;
    }

    static int zzf(byte[] bArr, int i10, zzez zzezVar, zzdt zzdtVar) {
        zzew zzewVar = (zzew) zzezVar;
        int iZzh = zzh(bArr, i10, zzdtVar);
        int i11 = zzdtVar.zza + iZzh;
        while (iZzh < i11) {
            iZzh = zzh(bArr, iZzh, zzdtVar);
            zzewVar.zze(zzdtVar.zza);
        }
        if (iZzh == i11) {
            return iZzh;
        }
        throw zzfb.zzf();
    }

    static int zzg(int i10, byte[] bArr, int i11, int i12, zzha zzhaVar, zzdt zzdtVar) {
        if ((i10 >>> 3) == 0) {
            throw zzfb.zza();
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int iZzk = zzk(bArr, i11, zzdtVar);
            zzhaVar.zzh(i10, Long.valueOf(zzdtVar.zzb));
            return iZzk;
        }
        if (i13 == 1) {
            zzhaVar.zzh(i10, Long.valueOf(zzn(bArr, i11)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int iZzh = zzh(bArr, i11, zzdtVar);
            int i14 = zzdtVar.zza;
            if (i14 < 0) {
                throw zzfb.zzc();
            }
            if (i14 > bArr.length - iZzh) {
                throw zzfb.zzf();
            }
            zzhaVar.zzh(i10, i14 == 0 ? zzef.zzb : zzef.zzk(bArr, iZzh, i14));
            return iZzh + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw zzfb.zza();
            }
            zzhaVar.zzh(i10, Integer.valueOf(zzb(bArr, i11)));
            return i11 + 4;
        }
        int i15 = (i10 & (-8)) | 4;
        zzha zzhaVarZzd = zzha.zzd();
        int i16 = 0;
        while (true) {
            if (i11 >= i12) {
                break;
            }
            int iZzh2 = zzh(bArr, i11, zzdtVar);
            int i17 = zzdtVar.zza;
            i16 = i17;
            if (i17 == i15) {
                i11 = iZzh2;
                break;
            }
            int iZzg = zzg(i16, bArr, iZzh2, i12, zzhaVarZzd, zzdtVar);
            i16 = i17;
            i11 = iZzg;
        }
        if (i11 > i12 || i16 != i15) {
            throw zzfb.zzd();
        }
        zzhaVar.zzh(i10, zzhaVarZzd);
        return i11;
    }

    static int zzh(byte[] bArr, int i10, zzdt zzdtVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return zzi(b10, bArr, i11, zzdtVar);
        }
        zzdtVar.zza = b10;
        return i11;
    }

    static int zzi(int i10, byte[] bArr, int i11, zzdt zzdtVar) {
        int i12;
        int i13;
        byte b10 = bArr[i11];
        int i14 = i11 + 1;
        int i15 = i10 & 127;
        if (b10 < 0) {
            int i16 = i15 | ((b10 & 127) << 7);
            int i17 = i14 + 1;
            byte b11 = bArr[i14];
            if (b11 >= 0) {
                i12 = b11 << 14;
            } else {
                i15 = i16 | ((b11 & 127) << 14);
                i14 = i17 + 1;
                byte b12 = bArr[i17];
                if (b12 >= 0) {
                    i13 = b12 << 21;
                } else {
                    i16 = i15 | ((b12 & 127) << 21);
                    i17 = i14 + 1;
                    byte b13 = bArr[i14];
                    if (b13 >= 0) {
                        i12 = b13 << 28;
                    } else {
                        int i18 = i16 | ((b13 & 127) << 28);
                        while (true) {
                            int i19 = i17 + 1;
                            if (bArr[i17] >= 0) {
                                zzdtVar.zza = i18;
                                return i19;
                            }
                            i17 = i19;
                        }
                    }
                }
            }
            zzdtVar.zza = i16 | i12;
            return i17;
        }
        i13 = b10 << 7;
        zzdtVar.zza = i15 | i13;
        return i14;
    }

    static int zzj(int i10, byte[] bArr, int i11, int i12, zzez zzezVar, zzdt zzdtVar) {
        zzew zzewVar = (zzew) zzezVar;
        int iZzh = zzh(bArr, i11, zzdtVar);
        while (true) {
            zzewVar.zze(zzdtVar.zza);
            if (iZzh >= i12) {
                break;
            }
            int iZzh2 = zzh(bArr, iZzh, zzdtVar);
            if (i10 != zzdtVar.zza) {
                break;
            }
            iZzh = zzh(bArr, iZzh2, zzdtVar);
        }
        return iZzh;
    }

    static int zzk(byte[] bArr, int i10, zzdt zzdtVar) {
        long j10 = bArr[i10];
        int i11 = i10 + 1;
        if (j10 >= 0) {
            zzdtVar.zzb = j10;
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
            i12 = i14;
            b10 = b11;
        }
        zzdtVar.zzb = j11;
        return i12;
    }

    static int zzl(Object obj, zzgi zzgiVar, byte[] bArr, int i10, int i11, int i12, zzdt zzdtVar) {
        int iZzb = ((zzga) zzgiVar).zzb(obj, bArr, i10, i11, i12, zzdtVar);
        zzdtVar.zzc = obj;
        return iZzb;
    }

    static int zzm(Object obj, zzgi zzgiVar, byte[] bArr, int i10, int i11, zzdt zzdtVar) {
        int iZzi = i10 + 1;
        int i12 = bArr[i10];
        if (i12 < 0) {
            iZzi = zzi(i12, bArr, iZzi, zzdtVar);
            i12 = zzdtVar.zza;
        }
        int i13 = iZzi;
        if (i12 < 0 || i12 > i11 - i13) {
            throw zzfb.zzf();
        }
        int i14 = i12 + i13;
        zzgiVar.zzg(obj, bArr, i13, i14, zzdtVar);
        zzdtVar.zzc = obj;
        return i14;
    }

    static long zzn(byte[] bArr, int i10) {
        return (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48) | ((((long) bArr[i10 + 7]) & 255) << 56);
    }
}
