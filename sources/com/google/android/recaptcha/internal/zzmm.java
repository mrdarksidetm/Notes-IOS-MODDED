package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
final class zzmm {
    public static final /* synthetic */ int zza = 0;
    private static final Class zzb;
    private static final zznb zzc;
    private static final zznb zzd;

    static {
        Class<?> cls;
        Class<?> cls2;
        zznb zznbVar = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zzb = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                zznbVar = (zznb) cls2.getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable unused3) {
            }
        }
        zzc = zznbVar;
        zzd = new zznd();
    }

    public static void zzA(int i10, List list, zzno zznoVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznoVar.zzu(i10, list, z10);
    }

    public static void zzB(int i10, List list, zzno zznoVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznoVar.zzy(i10, list, z10);
    }

    public static void zzC(int i10, List list, zzno zznoVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznoVar.zzA(i10, list, z10);
    }

    public static void zzD(int i10, List list, zzno zznoVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznoVar.zzC(i10, list, z10);
    }

    public static void zzE(int i10, List list, zzno zznoVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznoVar.zzE(i10, list, z10);
    }

    public static void zzF(int i10, List list, zzno zznoVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznoVar.zzJ(i10, list, z10);
    }

    public static void zzG(int i10, List list, zzno zznoVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznoVar.zzL(i10, list, z10);
    }

    static boolean zzH(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    static int zza(List list) {
        int iZzy;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkt) {
            zzkt zzktVar = (zzkt) list;
            iZzy = 0;
            while (i10 < size) {
                iZzy += zzjg.zzy(zzktVar.zze(i10));
                i10++;
            }
        } else {
            iZzy = 0;
            while (i10 < size) {
                iZzy += zzjg.zzy(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return iZzy;
    }

    static int zzb(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzjg.zzx(i10 << 3) + 4);
    }

    static int zzc(List list) {
        return list.size() * 4;
    }

    static int zzd(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzjg.zzx(i10 << 3) + 8);
    }

    static int zze(List list) {
        return list.size() * 8;
    }

    static int zzf(List list) {
        int iZzy;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkt) {
            zzkt zzktVar = (zzkt) list;
            iZzy = 0;
            while (i10 < size) {
                iZzy += zzjg.zzy(zzktVar.zze(i10));
                i10++;
            }
        } else {
            iZzy = 0;
            while (i10 < size) {
                iZzy += zzjg.zzy(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return iZzy;
    }

    static int zzg(List list) {
        int iZzy;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzlm) {
            zzlm zzlmVar = (zzlm) list;
            iZzy = 0;
            while (i10 < size) {
                iZzy += zzjg.zzy(zzlmVar.zze(i10));
                i10++;
            }
        } else {
            iZzy = 0;
            while (i10 < size) {
                iZzy += zzjg.zzy(((Long) list.get(i10)).longValue());
                i10++;
            }
        }
        return iZzy;
    }

    static int zzh(int i10, Object obj, zzmk zzmkVar) {
        int i11 = i10 << 3;
        if (!(obj instanceof zzli)) {
            return zzjg.zzx(i11) + zzjg.zzv((zzlx) obj, zzmkVar);
        }
        int iZzx = zzjg.zzx(i11);
        int iZza = ((zzli) obj).zza();
        return iZzx + zzjg.zzx(iZza) + iZza;
    }

    static int zzi(List list) {
        int iZzx;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkt) {
            zzkt zzktVar = (zzkt) list;
            iZzx = 0;
            while (i10 < size) {
                int iZze = zzktVar.zze(i10);
                iZzx += zzjg.zzx((iZze >> 31) ^ (iZze + iZze));
                i10++;
            }
        } else {
            iZzx = 0;
            while (i10 < size) {
                int iIntValue = ((Integer) list.get(i10)).intValue();
                iZzx += zzjg.zzx((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i10++;
            }
        }
        return iZzx;
    }

    static int zzj(List list) {
        int iZzy;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzlm) {
            zzlm zzlmVar = (zzlm) list;
            iZzy = 0;
            while (i10 < size) {
                long jZze = zzlmVar.zze(i10);
                iZzy += zzjg.zzy((jZze >> 63) ^ (jZze + jZze));
                i10++;
            }
        } else {
            iZzy = 0;
            while (i10 < size) {
                long jLongValue = ((Long) list.get(i10)).longValue();
                iZzy += zzjg.zzy((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i10++;
            }
        }
        return iZzy;
    }

    static int zzk(List list) {
        int iZzx;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkt) {
            zzkt zzktVar = (zzkt) list;
            iZzx = 0;
            while (i10 < size) {
                iZzx += zzjg.zzx(zzktVar.zze(i10));
                i10++;
            }
        } else {
            iZzx = 0;
            while (i10 < size) {
                iZzx += zzjg.zzx(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return iZzx;
    }

    static int zzl(List list) {
        int iZzy;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzlm) {
            zzlm zzlmVar = (zzlm) list;
            iZzy = 0;
            while (i10 < size) {
                iZzy += zzjg.zzy(zzlmVar.zze(i10));
                i10++;
            }
        } else {
            iZzy = 0;
            while (i10 < size) {
                iZzy += zzjg.zzy(((Long) list.get(i10)).longValue());
                i10++;
            }
        }
        return iZzy;
    }

    public static zznb zzm() {
        return zzc;
    }

    public static zznb zzn() {
        return zzd;
    }

    static Object zzo(Object obj, int i10, List list, zzkw zzkwVar, Object obj2, zznb zznbVar) {
        if (zzkwVar == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int iIntValue = ((Integer) list.get(i12)).intValue();
                if (zzkwVar.zza(iIntValue)) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(iIntValue));
                    }
                    i11++;
                } else {
                    obj2 = zzp(obj, i10, iIntValue, obj2, zznbVar);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
                return obj2;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = ((Integer) it.next()).intValue();
                if (!zzkwVar.zza(iIntValue2)) {
                    obj2 = zzp(obj, i10, iIntValue2, obj2, zznbVar);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    static Object zzp(Object obj, int i10, int i11, Object obj2, zznb zznbVar) {
        if (obj2 == null) {
            obj2 = zznbVar.zzc(obj);
        }
        zznbVar.zzl(obj2, i10, i11);
        return obj2;
    }

    static void zzq(zzke zzkeVar, Object obj, Object obj2) {
        zzki zzkiVarZzb = zzkeVar.zzb(obj2);
        if (zzkiVarZzb.zza.isEmpty()) {
            return;
        }
        zzkeVar.zzc(obj).zzh(zzkiVarZzb);
    }

    static void zzr(zznb zznbVar, Object obj, Object obj2) {
        zznbVar.zzo(obj, zznbVar.zze(zznbVar.zzd(obj), zznbVar.zzd(obj2)));
    }

    public static void zzs(Class cls) {
        Class cls2;
        if (!zzks.class.isAssignableFrom(cls) && (cls2 = zzb) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zzt(int i10, List list, zzno zznoVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznoVar.zzc(i10, list, z10);
    }

    public static void zzu(int i10, List list, zzno zznoVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznoVar.zzg(i10, list, z10);
    }

    public static void zzv(int i10, List list, zzno zznoVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznoVar.zzj(i10, list, z10);
    }

    public static void zzw(int i10, List list, zzno zznoVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznoVar.zzl(i10, list, z10);
    }

    public static void zzx(int i10, List list, zzno zznoVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznoVar.zzn(i10, list, z10);
    }

    public static void zzy(int i10, List list, zzno zznoVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznoVar.zzp(i10, list, z10);
    }

    public static void zzz(int i10, List list, zzno zznoVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznoVar.zzs(i10, list, z10);
    }
}
