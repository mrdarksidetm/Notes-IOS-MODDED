package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
final class zzalx {
    private static final zzamo<?, ?> zza = new zzamq();

    static int zza(int i10, Object obj, zzalv<?> zzalvVar) {
        return obj instanceof zzakk ? zzajg.zzb(i10, (zzakk) obj) : zzajg.zzb(i10, (zzalc) obj, zzalvVar);
    }

    static int zza(int i10, List<zzaip> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzi = size * zzajg.zzi(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            iZzi += zzajg.zza(list.get(i11));
        }
        return iZzi;
    }

    static int zza(int i10, List<zzalc> list, zzalv<?> zzalvVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZza = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iZza += zzajg.zza(i10, list.get(i11), zzalvVar);
        }
        return iZza;
    }

    static int zza(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzajg.zza(i10, true);
    }

    static int zza(List<?> list) {
        return list.size();
    }

    public static zzamo<?, ?> zza() {
        return zza;
    }

    static <UT, UB> UB zza(Object obj, int i10, int i11, UB ub2, zzamo<UT, UB> zzamoVar) {
        if (ub2 == null) {
            ub2 = zzamoVar.zzc(obj);
        }
        zzamoVar.zzb(ub2, i10, i11);
        return ub2;
    }

    static <UT, UB> UB zza(Object obj, int i10, List<Integer> list, zzakd zzakdVar, UB ub2, zzamo<UT, UB> zzamoVar) {
        if (zzakdVar == null) {
            return ub2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int iIntValue = list.get(i12).intValue();
                if (zzakdVar.zza(iIntValue)) {
                    if (i12 != i11) {
                        list.set(i11, Integer.valueOf(iIntValue));
                    }
                    i11++;
                } else {
                    ub2 = (UB) zza(obj, i10, iIntValue, ub2, zzamoVar);
                }
            }
            if (i11 != size) {
                list.subList(i11, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = it.next().intValue();
                if (!zzakdVar.zza(iIntValue2)) {
                    ub2 = (UB) zza(obj, i10, iIntValue2, ub2, zzamoVar);
                    it.remove();
                }
            }
        }
        return ub2;
    }

    public static void zza(int i10, List<zzaip> list, zzanf zzanfVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanfVar.zza(i10, list);
    }

    public static void zza(int i10, List<?> list, zzanf zzanfVar, zzalv<?> zzalvVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanfVar.zza(i10, list, (zzalv) zzalvVar);
    }

    public static void zza(int i10, List<Boolean> list, zzanf zzanfVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanfVar.zza(i10, list, z10);
    }

    static <T, FT extends zzajt<FT>> void zza(zzajm<FT> zzajmVar, T t10, T t11) {
        zzajr<T> zzajrVarZza = zzajmVar.zza(t11);
        if (zzajrVarZza.zza.isEmpty()) {
            return;
        }
        zzajmVar.zzb(t10).zza((zzajr) zzajrVarZza);
    }

    static <T> void zza(zzakz zzakzVar, T t10, T t11, long j10) {
        zzamp.zza(t10, j10, zzakzVar.zza(zzamp.zze(t10, j10), zzamp.zze(t11, j10)));
    }

    static <T, UT, UB> void zza(zzamo<UT, UB> zzamoVar, T t10, T t11) {
        zzamoVar.zzc(t10, zzamoVar.zza(zzamoVar.zzd(t10), zzamoVar.zzd(t11)));
    }

    public static void zza(Class<?> cls) {
        zzajy.class.isAssignableFrom(cls);
    }

    static boolean zza(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static int zzb(int i10, List<?> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int iZzi = zzajg.zzi(i10) * size;
        if (list instanceof zzakn) {
            zzakn zzaknVar = (zzakn) list;
            while (i11 < size) {
                Object objZza = zzaknVar.zza(i11);
                iZzi += objZza instanceof zzaip ? zzajg.zza((zzaip) objZza) : zzajg.zza((String) objZza);
                i11++;
            }
        } else {
            while (i11 < size) {
                Object obj = list.get(i11);
                iZzi += obj instanceof zzaip ? zzajg.zza((zzaip) obj) : zzajg.zza((String) obj);
                i11++;
            }
        }
        return iZzi;
    }

    static int zzb(int i10, List<?> list, zzalv<?> zzalvVar) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzi = zzajg.zzi(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            iZzi += obj instanceof zzakk ? zzajg.zza((zzakk) obj) : zzajg.zza((zzalc) obj, zzalvVar);
        }
        return iZzi;
    }

    static int zzb(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzb(list) + (size * zzajg.zzi(i10));
    }

    static int zzb(List<Integer> list) {
        int iZzc;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzajz) {
            zzajz zzajzVar = (zzajz) list;
            iZzc = 0;
            while (i10 < size) {
                iZzc += zzajg.zzc(zzajzVar.zzb(i10));
                i10++;
            }
        } else {
            iZzc = 0;
            while (i10 < size) {
                iZzc += zzajg.zzc(list.get(i10).intValue());
                i10++;
            }
        }
        return iZzc;
    }

    public static void zzb(int i10, List<String> list, zzanf zzanfVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanfVar.zzb(i10, list);
    }

    public static void zzb(int i10, List<?> list, zzanf zzanfVar, zzalv<?> zzalvVar) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanfVar.zzb(i10, list, (zzalv) zzalvVar);
    }

    public static void zzb(int i10, List<Double> list, zzanf zzanfVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanfVar.zzb(i10, list, z10);
    }

    static int zzc(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzajg.zzc(i10, 0);
    }

    static int zzc(List<?> list) {
        return list.size() << 2;
    }

    public static void zzc(int i10, List<Integer> list, zzanf zzanfVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanfVar.zzc(i10, list, z10);
    }

    static int zzd(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzajg.zza(i10, 0L);
    }

    static int zzd(List<?> list) {
        return list.size() << 3;
    }

    public static void zzd(int i10, List<Integer> list, zzanf zzanfVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanfVar.zzd(i10, list, z10);
    }

    static int zze(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zze(list) + (size * zzajg.zzi(i10));
    }

    static int zze(List<Integer> list) {
        int iZze;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzajz) {
            zzajz zzajzVar = (zzajz) list;
            iZze = 0;
            while (i10 < size) {
                iZze += zzajg.zze(zzajzVar.zzb(i10));
                i10++;
            }
        } else {
            iZze = 0;
            while (i10 < size) {
                iZze += zzajg.zze(list.get(i10).intValue());
                i10++;
            }
        }
        return iZze;
    }

    public static void zze(int i10, List<Long> list, zzanf zzanfVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanfVar.zze(i10, list, z10);
    }

    static int zzf(int i10, List<Long> list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        return zzf(list) + (list.size() * zzajg.zzi(i10));
    }

    static int zzf(List<Long> list) {
        int iZzd;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzakr) {
            zzakr zzakrVar = (zzakr) list;
            iZzd = 0;
            while (i10 < size) {
                iZzd += zzajg.zzd(zzakrVar.zzb(i10));
                i10++;
            }
        } else {
            iZzd = 0;
            while (i10 < size) {
                iZzd += zzajg.zzd(list.get(i10).longValue());
                i10++;
            }
        }
        return iZzd;
    }

    public static void zzf(int i10, List<Float> list, zzanf zzanfVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanfVar.zzf(i10, list, z10);
    }

    static int zzg(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzg(list) + (size * zzajg.zzi(i10));
    }

    static int zzg(List<Integer> list) {
        int iZzh;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzajz) {
            zzajz zzajzVar = (zzajz) list;
            iZzh = 0;
            while (i10 < size) {
                iZzh += zzajg.zzh(zzajzVar.zzb(i10));
                i10++;
            }
        } else {
            iZzh = 0;
            while (i10 < size) {
                iZzh += zzajg.zzh(list.get(i10).intValue());
                i10++;
            }
        }
        return iZzh;
    }

    public static void zzg(int i10, List<Integer> list, zzanf zzanfVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanfVar.zzg(i10, list, z10);
    }

    static int zzh(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzh(list) + (size * zzajg.zzi(i10));
    }

    static int zzh(List<Long> list) {
        int iZzf;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzakr) {
            zzakr zzakrVar = (zzakr) list;
            iZzf = 0;
            while (i10 < size) {
                iZzf += zzajg.zzf(zzakrVar.zzb(i10));
                i10++;
            }
        } else {
            iZzf = 0;
            while (i10 < size) {
                iZzf += zzajg.zzf(list.get(i10).longValue());
                i10++;
            }
        }
        return iZzf;
    }

    public static void zzh(int i10, List<Long> list, zzanf zzanfVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanfVar.zzh(i10, list, z10);
    }

    static int zzi(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzi(list) + (size * zzajg.zzi(i10));
    }

    static int zzi(List<Integer> list) {
        int iZzj;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzajz) {
            zzajz zzajzVar = (zzajz) list;
            iZzj = 0;
            while (i10 < size) {
                iZzj += zzajg.zzj(zzajzVar.zzb(i10));
                i10++;
            }
        } else {
            iZzj = 0;
            while (i10 < size) {
                iZzj += zzajg.zzj(list.get(i10).intValue());
                i10++;
            }
        }
        return iZzj;
    }

    public static void zzi(int i10, List<Integer> list, zzanf zzanfVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanfVar.zzi(i10, list, z10);
    }

    static int zzj(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzj(list) + (size * zzajg.zzi(i10));
    }

    static int zzj(List<Long> list) {
        int iZzg;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzakr) {
            zzakr zzakrVar = (zzakr) list;
            iZzg = 0;
            while (i10 < size) {
                iZzg += zzajg.zzg(zzakrVar.zzb(i10));
                i10++;
            }
        } else {
            iZzg = 0;
            while (i10 < size) {
                iZzg += zzajg.zzg(list.get(i10).longValue());
                i10++;
            }
        }
        return iZzg;
    }

    public static void zzj(int i10, List<Long> list, zzanf zzanfVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanfVar.zzj(i10, list, z10);
    }

    public static void zzk(int i10, List<Integer> list, zzanf zzanfVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanfVar.zzk(i10, list, z10);
    }

    public static void zzl(int i10, List<Long> list, zzanf zzanfVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanfVar.zzl(i10, list, z10);
    }

    public static void zzm(int i10, List<Integer> list, zzanf zzanfVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanfVar.zzm(i10, list, z10);
    }

    public static void zzn(int i10, List<Long> list, zzanf zzanfVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzanfVar.zzn(i10, list, z10);
    }
}
