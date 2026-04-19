package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
final class zzil {
    static int zza(byte[] bArr, int i10, zzik zzikVar) {
        int iZzi = zzi(bArr, i10, zzikVar);
        int i11 = zzikVar.zza;
        if (i11 < 0) {
            throw zzlc.zzf();
        }
        if (i11 > bArr.length - iZzi) {
            throw zzlc.zzi();
        }
        if (i11 == 0) {
            zzikVar.zzc = zziv.zzb;
            return iZzi;
        }
        zzikVar.zzc = zziv.zzk(bArr, iZzi, i11);
        return iZzi + i11;
    }

    static int zzb(byte[] bArr, int i10) {
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        return ((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    static int zzc(zzmk zzmkVar, byte[] bArr, int i10, int i11, int i12, zzik zzikVar) {
        Object objZze = zzmkVar.zze();
        int iZzm = zzm(objZze, zzmkVar, bArr, i10, i11, i12, zzikVar);
        zzmkVar.zzf(objZze);
        zzikVar.zzc = objZze;
        return iZzm;
    }

    static int zzd(zzmk zzmkVar, byte[] bArr, int i10, int i11, zzik zzikVar) {
        Object objZze = zzmkVar.zze();
        int iZzn = zzn(objZze, zzmkVar, bArr, i10, i11, zzikVar);
        zzmkVar.zzf(objZze);
        zzikVar.zzc = objZze;
        return iZzn;
    }

    static int zze(zzmk zzmkVar, int i10, byte[] bArr, int i11, int i12, zzkz zzkzVar, zzik zzikVar) {
        int iZzd = zzd(zzmkVar, bArr, i11, i12, zzikVar);
        while (true) {
            zzkzVar.add(zzikVar.zzc);
            if (iZzd >= i12) {
                break;
            }
            int iZzi = zzi(bArr, iZzd, zzikVar);
            if (i10 != zzikVar.zza) {
                break;
            }
            iZzd = zzd(zzmkVar, bArr, iZzi, i12, zzikVar);
        }
        return iZzd;
    }

    static int zzf(byte[] bArr, int i10, zzkz zzkzVar, zzik zzikVar) {
        zzkt zzktVar = (zzkt) zzkzVar;
        int iZzi = zzi(bArr, i10, zzikVar);
        int i11 = zzikVar.zza + iZzi;
        while (iZzi < i11) {
            iZzi = zzi(bArr, iZzi, zzikVar);
            zzktVar.zzh(zzikVar.zza);
        }
        if (iZzi == i11) {
            return iZzi;
        }
        throw zzlc.zzi();
    }

    static int zzg(byte[] bArr, int i10, zzik zzikVar) {
        int iZzi = zzi(bArr, i10, zzikVar);
        int i11 = zzikVar.zza;
        if (i11 < 0) {
            throw zzlc.zzf();
        }
        if (i11 == 0) {
            zzikVar.zzc = "";
            return iZzi;
        }
        zzikVar.zzc = new String(bArr, iZzi, i11, zzla.zza);
        return iZzi + i11;
    }

    static int zzh(int i10, byte[] bArr, int i11, int i12, zznc zzncVar, zzik zzikVar) {
        if ((i10 >>> 3) == 0) {
            throw zzlc.zzc();
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int iZzl = zzl(bArr, i11, zzikVar);
            zzncVar.zzj(i10, Long.valueOf(zzikVar.zzb));
            return iZzl;
        }
        if (i13 == 1) {
            zzncVar.zzj(i10, Long.valueOf(zzp(bArr, i11)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int iZzi = zzi(bArr, i11, zzikVar);
            int i14 = zzikVar.zza;
            if (i14 < 0) {
                throw zzlc.zzf();
            }
            if (i14 > bArr.length - iZzi) {
                throw zzlc.zzi();
            }
            zzncVar.zzj(i10, i14 == 0 ? zziv.zzb : zziv.zzk(bArr, iZzi, i14));
            return iZzi + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw zzlc.zzc();
            }
            zzncVar.zzj(i10, Integer.valueOf(zzb(bArr, i11)));
            return i11 + 4;
        }
        int i15 = (i10 & (-8)) | 4;
        zznc zzncVarZzf = zznc.zzf();
        int i16 = 0;
        while (true) {
            if (i11 >= i12) {
                break;
            }
            int iZzi2 = zzi(bArr, i11, zzikVar);
            int i17 = zzikVar.zza;
            i16 = i17;
            if (i17 == i15) {
                i11 = iZzi2;
                break;
            }
            int iZzh = zzh(i16, bArr, iZzi2, i12, zzncVarZzf, zzikVar);
            i16 = i17;
            i11 = iZzh;
        }
        if (i11 > i12 || i16 != i15) {
            throw zzlc.zzg();
        }
        zzncVar.zzj(i10, zzncVarZzf);
        return i11;
    }

    static int zzi(byte[] bArr, int i10, zzik zzikVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return zzj(b10, bArr, i11, zzikVar);
        }
        zzikVar.zza = b10;
        return i11;
    }

    static int zzj(int i10, byte[] bArr, int i11, zzik zzikVar) {
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
                                zzikVar.zza = i18;
                                return i19;
                            }
                            i17 = i19;
                        }
                    }
                }
            }
            zzikVar.zza = i16 | i12;
            return i17;
        }
        i13 = b10 << 7;
        zzikVar.zza = i15 | i13;
        return i14;
    }

    static int zzk(int i10, byte[] bArr, int i11, int i12, zzkz zzkzVar, zzik zzikVar) {
        zzkt zzktVar = (zzkt) zzkzVar;
        int iZzi = zzi(bArr, i11, zzikVar);
        while (true) {
            zzktVar.zzh(zzikVar.zza);
            if (iZzi >= i12) {
                break;
            }
            int iZzi2 = zzi(bArr, iZzi, zzikVar);
            if (i10 != zzikVar.zza) {
                break;
            }
            iZzi = zzi(bArr, iZzi2, zzikVar);
        }
        return iZzi;
    }

    static int zzl(byte[] bArr, int i10, zzik zzikVar) {
        long j10 = bArr[i10];
        int i11 = i10 + 1;
        if (j10 >= 0) {
            zzikVar.zzb = j10;
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
        zzikVar.zzb = j11;
        return i12;
    }

    static int zzm(Object obj, zzmk zzmkVar, byte[] bArr, int i10, int i11, int i12, zzik zzikVar) {
        int iZzc = ((zzma) zzmkVar).zzc(obj, bArr, i10, i11, i12, zzikVar);
        zzikVar.zzc = obj;
        return iZzc;
    }

    static int zzn(Object obj, zzmk zzmkVar, byte[] bArr, int i10, int i11, zzik zzikVar) {
        int iZzj = i10 + 1;
        int i12 = bArr[i10];
        if (i12 < 0) {
            iZzj = zzj(i12, bArr, iZzj, zzikVar);
            i12 = zzikVar.zza;
        }
        int i13 = iZzj;
        if (i12 < 0 || i12 > i11 - i13) {
            throw zzlc.zzi();
        }
        int i14 = i12 + i13;
        zzmkVar.zzi(obj, bArr, i13, i14, zzikVar);
        zzikVar.zzc = obj;
        return i14;
    }

    static int zzo(int i10, byte[] bArr, int i11, int i12, zzik zzikVar) {
        if ((i10 >>> 3) == 0) {
            throw zzlc.zzc();
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            return zzl(bArr, i11, zzikVar);
        }
        if (i13 == 1) {
            return i11 + 8;
        }
        if (i13 == 2) {
            return zzi(bArr, i11, zzikVar) + zzikVar.zza;
        }
        if (i13 != 3) {
            if (i13 == 5) {
                return i11 + 4;
            }
            throw zzlc.zzc();
        }
        int i14 = (i10 & (-8)) | 4;
        int i15 = 0;
        while (i11 < i12) {
            i11 = zzi(bArr, i11, zzikVar);
            i15 = zzikVar.zza;
            if (i15 == i14) {
                break;
            }
            i11 = zzo(i15, bArr, i11, i12, zzikVar);
        }
        if (i11 > i12 || i15 != i14) {
            throw zzlc.zzg();
        }
        return i11;
    }

    static long zzp(byte[] bArr, int i10) {
        return (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48) | ((((long) bArr[i10 + 7]) & 255) << 56);
    }
}
