package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
final class zzbd {
    static int zza(byte[] bArr, int i10, zzbc zzbcVar) {
        int iZzh = zzh(bArr, i10, zzbcVar);
        int i11 = zzbcVar.zza;
        if (i11 < 0) {
            throw zzdc.zzd();
        }
        if (i11 > bArr.length - iZzh) {
            throw zzdc.zzg();
        }
        if (i11 == 0) {
            zzbcVar.zzc = zzbq.zzb;
            return iZzh;
        }
        zzbcVar.zzc = zzbq.zzl(bArr, iZzh, i11);
        return iZzh + i11;
    }

    static int zzb(byte[] bArr, int i10) {
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        return ((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    static int zzc(zzeo zzeoVar, byte[] bArr, int i10, int i11, int i12, zzbc zzbcVar) {
        Object objZze = zzeoVar.zze();
        int iZzl = zzl(objZze, zzeoVar, bArr, i10, i11, i12, zzbcVar);
        zzeoVar.zzf(objZze);
        zzbcVar.zzc = objZze;
        return iZzl;
    }

    static int zzd(zzeo zzeoVar, byte[] bArr, int i10, int i11, zzbc zzbcVar) {
        Object objZze = zzeoVar.zze();
        int iZzm = zzm(objZze, zzeoVar, bArr, i10, i11, zzbcVar);
        zzeoVar.zzf(objZze);
        zzbcVar.zzc = objZze;
        return iZzm;
    }

    static int zze(zzeo zzeoVar, int i10, byte[] bArr, int i11, int i12, zzcz zzczVar, zzbc zzbcVar) {
        int iZzd = zzd(zzeoVar, bArr, i11, i12, zzbcVar);
        while (true) {
            zzczVar.add(zzbcVar.zzc);
            if (iZzd >= i12) {
                break;
            }
            int iZzh = zzh(bArr, iZzd, zzbcVar);
            if (i10 != zzbcVar.zza) {
                break;
            }
            iZzd = zzd(zzeoVar, bArr, iZzh, i12, zzbcVar);
        }
        return iZzd;
    }

    static int zzf(byte[] bArr, int i10, zzcz zzczVar, zzbc zzbcVar) {
        zzct zzctVar = (zzct) zzczVar;
        int iZzh = zzh(bArr, i10, zzbcVar);
        int i11 = zzbcVar.zza + iZzh;
        while (iZzh < i11) {
            iZzh = zzh(bArr, iZzh, zzbcVar);
            zzctVar.zzg(zzbcVar.zza);
        }
        if (iZzh == i11) {
            return iZzh;
        }
        throw zzdc.zzg();
    }

    static int zzg(int i10, byte[] bArr, int i11, int i12, zzfg zzfgVar, zzbc zzbcVar) {
        if ((i10 >>> 3) == 0) {
            throw zzdc.zzb();
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int iZzk = zzk(bArr, i11, zzbcVar);
            zzfgVar.zzj(i10, Long.valueOf(zzbcVar.zzb));
            return iZzk;
        }
        if (i13 == 1) {
            zzfgVar.zzj(i10, Long.valueOf(zzn(bArr, i11)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int iZzh = zzh(bArr, i11, zzbcVar);
            int i14 = zzbcVar.zza;
            if (i14 < 0) {
                throw zzdc.zzd();
            }
            if (i14 > bArr.length - iZzh) {
                throw zzdc.zzg();
            }
            zzfgVar.zzj(i10, i14 == 0 ? zzbq.zzb : zzbq.zzl(bArr, iZzh, i14));
            return iZzh + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw zzdc.zzb();
            }
            zzfgVar.zzj(i10, Integer.valueOf(zzb(bArr, i11)));
            return i11 + 4;
        }
        int i15 = (i10 & (-8)) | 4;
        zzfg zzfgVarZzf = zzfg.zzf();
        int i16 = 0;
        while (true) {
            if (i11 >= i12) {
                break;
            }
            int iZzh2 = zzh(bArr, i11, zzbcVar);
            int i17 = zzbcVar.zza;
            i16 = i17;
            if (i17 == i15) {
                i11 = iZzh2;
                break;
            }
            int iZzg = zzg(i16, bArr, iZzh2, i12, zzfgVarZzf, zzbcVar);
            i16 = i17;
            i11 = iZzg;
        }
        if (i11 > i12 || i16 != i15) {
            throw zzdc.zze();
        }
        zzfgVar.zzj(i10, zzfgVarZzf);
        return i11;
    }

    static int zzh(byte[] bArr, int i10, zzbc zzbcVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return zzi(b10, bArr, i11, zzbcVar);
        }
        zzbcVar.zza = b10;
        return i11;
    }

    static int zzi(int i10, byte[] bArr, int i11, zzbc zzbcVar) {
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
                                zzbcVar.zza = i18;
                                return i19;
                            }
                            i17 = i19;
                        }
                    }
                }
            }
            zzbcVar.zza = i16 | i12;
            return i17;
        }
        i13 = b10 << 7;
        zzbcVar.zza = i15 | i13;
        return i14;
    }

    static int zzj(int i10, byte[] bArr, int i11, int i12, zzcz zzczVar, zzbc zzbcVar) {
        zzct zzctVar = (zzct) zzczVar;
        int iZzh = zzh(bArr, i11, zzbcVar);
        while (true) {
            zzctVar.zzg(zzbcVar.zza);
            if (iZzh >= i12) {
                break;
            }
            int iZzh2 = zzh(bArr, iZzh, zzbcVar);
            if (i10 != zzbcVar.zza) {
                break;
            }
            iZzh = zzh(bArr, iZzh2, zzbcVar);
        }
        return iZzh;
    }

    static int zzk(byte[] bArr, int i10, zzbc zzbcVar) {
        long j10 = bArr[i10];
        int i11 = i10 + 1;
        if (j10 >= 0) {
            zzbcVar.zzb = j10;
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
        zzbcVar.zzb = j11;
        return i12;
    }

    static int zzl(Object obj, zzeo zzeoVar, byte[] bArr, int i10, int i11, int i12, zzbc zzbcVar) {
        int iZzc = ((zzef) zzeoVar).zzc(obj, bArr, i10, i11, i12, zzbcVar);
        zzbcVar.zzc = obj;
        return iZzc;
    }

    static int zzm(Object obj, zzeo zzeoVar, byte[] bArr, int i10, int i11, zzbc zzbcVar) {
        int iZzi = i10 + 1;
        int i12 = bArr[i10];
        if (i12 < 0) {
            iZzi = zzi(i12, bArr, iZzi, zzbcVar);
            i12 = zzbcVar.zza;
        }
        int i13 = iZzi;
        if (i12 < 0 || i12 > i11 - i13) {
            throw zzdc.zzg();
        }
        int i14 = i12 + i13;
        zzeoVar.zzh(obj, bArr, i13, i14, zzbcVar);
        zzbcVar.zzc = obj;
        return i14;
    }

    static long zzn(byte[] bArr, int i10) {
        return (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48) | ((((long) bArr[i10 + 7]) & 255) << 56);
    }
}
