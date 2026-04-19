package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
final class zzalg<T> implements zzalv<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzamp.zzb();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzalc zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final int[] zzk;
    private final int zzl;
    private final int zzm;
    private final zzalk zzn;
    private final zzakm zzo;
    private final zzamo<?, ?> zzp;
    private final zzajm<?> zzq;
    private final zzakz zzr;

    private zzalg(int[] iArr, Object[] objArr, int i10, int i11, zzalc zzalcVar, boolean z10, int[] iArr2, int i12, int i13, zzalk zzalkVar, zzakm zzakmVar, zzamo<?, ?> zzamoVar, zzajm<?> zzajmVar, zzakz zzakzVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i10;
        this.zzf = i11;
        this.zzi = zzalcVar instanceof zzajy;
        this.zzh = zzajmVar != null && zzajmVar.zza(zzalcVar);
        this.zzj = false;
        this.zzk = iArr2;
        this.zzl = i12;
        this.zzm = i13;
        this.zzn = zzalkVar;
        this.zzo = zzakmVar;
        this.zzp = zzamoVar;
        this.zzq = zzajmVar;
        this.zzg = zzalcVar;
        this.zzr = zzakzVar;
    }

    private static <T> double zza(T t10, long j10) {
        return ((Double) zzamp.zze(t10, j10)).doubleValue();
    }

    private final int zza(int i10) {
        if (i10 < this.zze || i10 > this.zzf) {
            return -1;
        }
        return zza(i10, 0);
    }

    private final int zza(int i10, int i11) {
        int length = (this.zzc.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = this.zzc[i13];
            if (i10 == i14) {
                return i13;
            }
            if (i10 < i14) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    private static int zza(byte[] bArr, int i10, int i11, zzamw zzamwVar, Class<?> cls, zzaik zzaikVar) {
        int iZzd;
        Object objValueOf;
        Object objValueOf2;
        Object objValueOf3;
        int iZze;
        long jZza;
        switch (zzalj.zza[zzamwVar.ordinal()]) {
            case 1:
                iZzd = zzail.zzd(bArr, i10, zzaikVar);
                objValueOf = Boolean.valueOf(zzaikVar.zzb != 0);
                zzaikVar.zzc = objValueOf;
                return iZzd;
            case 2:
                return zzail.zza(bArr, i10, zzaikVar);
            case 3:
                objValueOf2 = Double.valueOf(zzail.zza(bArr, i10));
                zzaikVar.zzc = objValueOf2;
                return i10 + 8;
            case 4:
            case 5:
                objValueOf3 = Integer.valueOf(zzail.zzc(bArr, i10));
                zzaikVar.zzc = objValueOf3;
                return i10 + 4;
            case 6:
            case 7:
                objValueOf2 = Long.valueOf(zzail.zzd(bArr, i10));
                zzaikVar.zzc = objValueOf2;
                return i10 + 8;
            case 8:
                objValueOf3 = Float.valueOf(zzail.zzb(bArr, i10));
                zzaikVar.zzc = objValueOf3;
                return i10 + 4;
            case 9:
            case 10:
            case 11:
                iZzd = zzail.zzc(bArr, i10, zzaikVar);
                iZze = zzaikVar.zza;
                objValueOf = Integer.valueOf(iZze);
                zzaikVar.zzc = objValueOf;
                return iZzd;
            case 12:
            case 13:
                iZzd = zzail.zzd(bArr, i10, zzaikVar);
                jZza = zzaikVar.zzb;
                objValueOf = Long.valueOf(jZza);
                zzaikVar.zzc = objValueOf;
                return iZzd;
            case 14:
                return zzail.zza(zzalr.zza().zza((Class) cls), bArr, i10, i11, zzaikVar);
            case 15:
                iZzd = zzail.zzc(bArr, i10, zzaikVar);
                iZze = zzajb.zze(zzaikVar.zza);
                objValueOf = Integer.valueOf(iZze);
                zzaikVar.zzc = objValueOf;
                return iZzd;
            case 16:
                iZzd = zzail.zzd(bArr, i10, zzaikVar);
                jZza = zzajb.zza(zzaikVar.zzb);
                objValueOf = Long.valueOf(jZza);
                zzaikVar.zzc = objValueOf;
                return iZzd;
            case 17:
                return zzail.zzb(bArr, i10, zzaikVar);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x038f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static <T> com.google.android.gms.internal.p002firebaseauthapi.zzalg<T> zza(java.lang.Class<T> r33, com.google.android.gms.internal.p002firebaseauthapi.zzala r34, com.google.android.gms.internal.p002firebaseauthapi.zzalk r35, com.google.android.gms.internal.p002firebaseauthapi.zzakm r36, com.google.android.gms.internal.p002firebaseauthapi.zzamo<?, ?> r37, com.google.android.gms.internal.p002firebaseauthapi.zzajm<?> r38, com.google.android.gms.internal.p002firebaseauthapi.zzakz r39) {
        /*
            Method dump skipped, instruction units count: 1042
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzalg.zza(java.lang.Class, com.google.android.gms.internal.firebase-auth-api.zzala, com.google.android.gms.internal.firebase-auth-api.zzalk, com.google.android.gms.internal.firebase-auth-api.zzakm, com.google.android.gms.internal.firebase-auth-api.zzamo, com.google.android.gms.internal.firebase-auth-api.zzajm, com.google.android.gms.internal.firebase-auth-api.zzakz):com.google.android.gms.internal.firebase-auth-api.zzalg");
    }

    private final <K, V, UT, UB> UB zza(int i10, int i11, Map<K, V> map, zzakd zzakdVar, UB ub2, zzamo<UT, UB> zzamoVar, Object obj) {
        zzakx<?, ?> zzakxVarZza = this.zzr.zza(zzf(i10));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!zzakdVar.zza(((Integer) next.getValue()).intValue())) {
                if (ub2 == null) {
                    ub2 = zzamoVar.zzc(obj);
                }
                zzaiu zzaiuVarZzc = zzaip.zzc(zzaku.zza(zzakxVarZza, next.getKey(), next.getValue()));
                try {
                    zzaku.zza(zzaiuVarZzc.zzb(), zzakxVarZza, next.getKey(), next.getValue());
                    zzamoVar.zza(ub2, i11, zzaiuVarZzc.zza());
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return ub2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object zza(T t10, int i10) {
        zzalv zzalvVarZze = zze(i10);
        long jZzc = zzc(i10) & 1048575;
        if (!zzc((Object) t10, i10)) {
            return zzalvVarZze.zza();
        }
        Object object = zzb.getObject(t10, jZzc);
        if (zzg(object)) {
            return object;
        }
        Object objZza = zzalvVarZze.zza();
        if (object != null) {
            zzalvVarZze.zza(objZza, object);
        }
        return objZza;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object zza(T t10, int i10, int i11) {
        zzalv zzalvVarZze = zze(i11);
        if (!zzc(t10, i10, i11)) {
            return zzalvVarZze.zza();
        }
        Object object = zzb.getObject(t10, zzc(i11) & 1048575);
        if (zzg(object)) {
            return object;
        }
        Object objZza = zzalvVarZze.zza();
        if (object != null) {
            zzalvVarZze.zza(objZza, object);
        }
        return objZza;
    }

    private final <UT, UB> UB zza(Object obj, int i10, UB ub2, zzamo<UT, UB> zzamoVar, Object obj2) {
        zzakd zzakdVarZzd;
        int i11 = this.zzc[i10];
        Object objZze = zzamp.zze(obj, zzc(i10) & 1048575);
        return (objZze == null || (zzakdVarZzd = zzd(i10)) == null) ? ub2 : (UB) zza(i10, i11, this.zzr.zze(objZze), zzakdVarZzd, ub2, zzamoVar, obj2);
    }

    private static Field zza(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private static void zza(int i10, Object obj, zzanf zzanfVar) {
        if (obj instanceof String) {
            zzanfVar.zza(i10, (String) obj);
        } else {
            zzanfVar.zza(i10, (zzaip) obj);
        }
    }

    private static <UT, UB> void zza(zzamo<UT, UB> zzamoVar, T t10, zzanf zzanfVar) {
        zzamoVar.zzb(zzamoVar.zzd(t10), zzanfVar);
    }

    private final <K, V> void zza(zzanf zzanfVar, int i10, Object obj, int i11) {
        if (obj != null) {
            zzanfVar.zza(i10, this.zzr.zza(zzf(i11)), this.zzr.zzd(obj));
        }
    }

    private final void zza(T t10, int i10, int i11, Object obj) {
        zzb.putObject(t10, zzc(i11) & 1048575, obj);
        zzb(t10, i10, i11);
    }

    private final void zza(Object obj, int i10, zzals zzalsVar) {
        long j10;
        Object objZzp;
        if (zzg(i10)) {
            j10 = i10 & 1048575;
            objZzp = zzalsVar.zzr();
        } else {
            int i11 = i10 & 1048575;
            if (this.zzi) {
                j10 = i11;
                objZzp = zzalsVar.zzq();
            } else {
                j10 = i11;
                objZzp = zzalsVar.zzp();
            }
        }
        zzamp.zza(obj, j10, objZzp);
    }

    private final void zza(T t10, int i10, Object obj) {
        zzb.putObject(t10, zzc(i10) & 1048575, obj);
        zzb((Object) t10, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zza(T t10, T t11, int i10) {
        if (zzc((Object) t11, i10)) {
            long jZzc = zzc(i10) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(t11, jZzc);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + String.valueOf(t11));
            }
            zzalv zzalvVarZze = zze(i10);
            if (!zzc((Object) t10, i10)) {
                if (zzg(object)) {
                    Object objZza = zzalvVarZze.zza();
                    zzalvVarZze.zza(objZza, object);
                    unsafe.putObject(t10, jZzc, objZza);
                } else {
                    unsafe.putObject(t10, jZzc, object);
                }
                zzb((Object) t10, i10);
                return;
            }
            Object object2 = unsafe.getObject(t10, jZzc);
            if (!zzg(object2)) {
                Object objZza2 = zzalvVarZze.zza();
                zzalvVarZze.zza(objZza2, object2);
                unsafe.putObject(t10, jZzc, objZza2);
                object2 = objZza2;
            }
            zzalvVarZze.zza(object2, object);
        }
    }

    private final boolean zza(T t10, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? zzc((Object) t10, i10) : (i12 & i13) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean zza(Object obj, int i10, zzalv zzalvVar) {
        return zzalvVar.zze(zzamp.zze(obj, i10 & 1048575));
    }

    private static <T> float zzb(T t10, long j10) {
        return ((Float) zzamp.zze(t10, j10)).floatValue();
    }

    private final int zzb(int i10) {
        return this.zzc[i10 + 2];
    }

    private final void zzb(T t10, int i10) {
        int iZzb = zzb(i10);
        long j10 = 1048575 & iZzb;
        if (j10 == 1048575) {
            return;
        }
        zzamp.zza((Object) t10, j10, (1 << (iZzb >>> 20)) | zzamp.zzc(t10, j10));
    }

    private final void zzb(T t10, int i10, int i11) {
        zzamp.zza((Object) t10, zzb(i11) & 1048575, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void zzb(T t10, T t11, int i10) {
        int i11 = this.zzc[i10];
        if (zzc(t11, i11, i10)) {
            long jZzc = zzc(i10) & 1048575;
            Unsafe unsafe = zzb;
            Object object = unsafe.getObject(t11, jZzc);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + String.valueOf(t11));
            }
            zzalv zzalvVarZze = zze(i10);
            if (!zzc(t10, i11, i10)) {
                if (zzg(object)) {
                    Object objZza = zzalvVarZze.zza();
                    zzalvVarZze.zza(objZza, object);
                    unsafe.putObject(t10, jZzc, objZza);
                } else {
                    unsafe.putObject(t10, jZzc, object);
                }
                zzb(t10, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(t10, jZzc);
            if (!zzg(object2)) {
                Object objZza2 = zzalvVarZze.zza();
                zzalvVarZze.zza(objZza2, object2);
                unsafe.putObject(t10, jZzc, objZza2);
                object2 = objZza2;
            }
            zzalvVarZze.zza(object2, object);
        }
    }

    private final int zzc(int i10) {
        return this.zzc[i10 + 1];
    }

    private static <T> int zzc(T t10, long j10) {
        return ((Integer) zzamp.zze(t10, j10)).intValue();
    }

    static zzamn zzc(Object obj) {
        zzajy zzajyVar = (zzajy) obj;
        zzamn zzamnVar = zzajyVar.zzb;
        if (zzamnVar != zzamn.zzc()) {
            return zzamnVar;
        }
        zzamn zzamnVarZzd = zzamn.zzd();
        zzajyVar.zzb = zzamnVarZzd;
        return zzamnVarZzd;
    }

    private final boolean zzc(T t10, int i10) {
        int iZzb = zzb(i10);
        long j10 = iZzb & 1048575;
        if (j10 != 1048575) {
            return (zzamp.zzc(t10, j10) & (1 << (iZzb >>> 20))) != 0;
        }
        int iZzc = zzc(i10);
        long j11 = iZzc & 1048575;
        switch ((iZzc & 267386880) >>> 20) {
            case 0:
                return Double.doubleToRawLongBits(zzamp.zza(t10, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzamp.zzb(t10, j11)) != 0;
            case 2:
                return zzamp.zzd(t10, j11) != 0;
            case 3:
                return zzamp.zzd(t10, j11) != 0;
            case 4:
                return zzamp.zzc(t10, j11) != 0;
            case 5:
                return zzamp.zzd(t10, j11) != 0;
            case 6:
                return zzamp.zzc(t10, j11) != 0;
            case 7:
                return zzamp.zzh(t10, j11);
            case 8:
                Object objZze = zzamp.zze(t10, j11);
                if (objZze instanceof String) {
                    return !((String) objZze).isEmpty();
                }
                if (objZze instanceof zzaip) {
                    return !zzaip.zza.equals(objZze);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzamp.zze(t10, j11) != null;
            case 10:
                return !zzaip.zza.equals(zzamp.zze(t10, j11));
            case 11:
                return zzamp.zzc(t10, j11) != 0;
            case 12:
                return zzamp.zzc(t10, j11) != 0;
            case 13:
                return zzamp.zzc(t10, j11) != 0;
            case 14:
                return zzamp.zzd(t10, j11) != 0;
            case 15:
                return zzamp.zzc(t10, j11) != 0;
            case 16:
                return zzamp.zzd(t10, j11) != 0;
            case 17:
                return zzamp.zze(t10, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzc(T t10, int i10, int i11) {
        return zzamp.zzc(t10, (long) (zzb(i11) & 1048575)) == i10;
    }

    private final boolean zzc(T t10, T t11, int i10) {
        return zzc((Object) t10, i10) == zzc((Object) t11, i10);
    }

    private static <T> long zzd(T t10, long j10) {
        return ((Long) zzamp.zze(t10, j10)).longValue();
    }

    private final zzakd zzd(int i10) {
        return (zzakd) this.zzd[((i10 / 3) << 1) + 1];
    }

    private final zzalv zze(int i10) {
        int i11 = (i10 / 3) << 1;
        zzalv zzalvVar = (zzalv) this.zzd[i11];
        if (zzalvVar != null) {
            return zzalvVar;
        }
        zzalv<T> zzalvVarZza = zzalr.zza().zza((Class) this.zzd[i11 + 1]);
        this.zzd[i11] = zzalvVarZza;
        return zzalvVarZza;
    }

    private static <T> boolean zze(T t10, long j10) {
        return ((Boolean) zzamp.zze(t10, j10)).booleanValue();
    }

    private final Object zzf(int i10) {
        return this.zzd[(i10 / 3) << 1];
    }

    private static void zzf(Object obj) {
        if (zzg(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + String.valueOf(obj));
    }

    private static boolean zzg(int i10) {
        return (i10 & 536870912) != 0;
    }

    private static boolean zzg(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzajy) {
            return ((zzajy) obj).zzu();
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0254 A[PHI: r0
  0x0254: PHI (r0v163 int) = 
  (r0v126 int)
  (r0v129 int)
  (r0v132 int)
  (r0v135 int)
  (r0v138 int)
  (r0v141 int)
  (r0v144 int)
  (r0v147 int)
  (r0v150 int)
  (r0v153 int)
  (r0v156 int)
  (r0v159 int)
  (r0v162 int)
  (r0v166 int)
 binds: [B:120:0x0252, B:117:0x0245, B:114:0x0238, B:111:0x022b, B:108:0x021e, B:105:0x0211, B:102:0x0204, B:99:0x01f7, B:96:0x01e9, B:93:0x01db, B:90:0x01cd, B:87:0x01bf, B:84:0x01b1, B:81:0x01a3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r0v229 */
    /* JADX WARN: Type inference failed for: r0v231 */
    /* JADX WARN: Type inference failed for: r0v232 */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [int] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v2, types: [int] */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v25 */
    /* JADX WARN: Type inference failed for: r15v26 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r1v44 */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.google.android.gms.internal.firebase-auth-api.zzalw, com.google.android.gms.internal.firebase-auth-api.zzalw<T extends com.google.android.gms.internal.firebase-auth-api.zzajt<T>, java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(T r19) {
        /*
            Method dump skipped, instruction units count: 1492
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzalg.zza(java.lang.Object):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:185:0x0574, code lost:
    
        if (r1 == 0) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0576, code lost:
    
        r12.add(com.google.android.gms.internal.p002firebaseauthapi.zzaip.zza);
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x057c, code lost:
    
        r12.add(com.google.android.gms.internal.p002firebaseauthapi.zzaip.zza(r14, r0, r1));
        r0 = r0 + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0584, code lost:
    
        if (r0 >= r9) goto L671;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0586, code lost:
    
        r1 = com.google.android.gms.internal.p002firebaseauthapi.zzail.zzc(r14, r0, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x058c, code lost:
    
        if (r15 != r13.zza) goto L672;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x058e, code lost:
    
        r0 = com.google.android.gms.internal.p002firebaseauthapi.zzail.zzc(r14, r1, r13);
        r1 = r13.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0594, code lost:
    
        if (r1 < 0) goto L575;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0598, code lost:
    
        if (r1 > (r14.length - r0)) goto L576;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x059a, code lost:
    
        if (r1 != 0) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x05a1, code lost:
    
        throw com.google.android.gms.internal.p002firebaseauthapi.zzakf.zzj();
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x05a6, code lost:
    
        throw com.google.android.gms.internal.p002firebaseauthapi.zzakf.zzf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x06da, code lost:
    
        if (r10.zzb != 0) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x06dc, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x06de, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x06e0, code lost:
    
        r12.zza(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x06e3, code lost:
    
        if (r0 >= r2) goto L685;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x06e5, code lost:
    
        r5 = com.google.android.gms.internal.p002firebaseauthapi.zzail.zzc(r14, r0, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x06eb, code lost:
    
        if (r15 != r10.zza) goto L686;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x06ed, code lost:
    
        r0 = com.google.android.gms.internal.p002firebaseauthapi.zzail.zzd(r14, r5, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x06f5, code lost:
    
        if (r10.zzb == 0) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x0a39, code lost:
    
        throw com.google.android.gms.internal.p002firebaseauthapi.zzakf.zzj();
     */
    /* JADX WARN: Code restructure failed: missing block: B:551:0x0584, code lost:
    
        r12.add(com.google.android.gms.internal.p002firebaseauthapi.zzaip.zza(r14, r0, r1));
        r0 = r0 + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:554:0x06e0, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0617  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x065f  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x08e9 A[PHI: r7 r8 r9 r10 r11 r13 r15
  0x08e9: PHI (r7v108 int) = (r7v45 int), (r7v46 int), (r7v47 int), (r7v76 int), (r7v91 int), (r7v109 int) binds: [B:382:0x08c8, B:362:0x0868, B:341:0x080c, B:209:0x05de, B:259:0x0699, B:132:0x042f] A[DONT_GENERATE, DONT_INLINE]
  0x08e9: PHI (r8v90 int) = (r8v45 int), (r8v46 int), (r8v47 int), (r8v67 int), (r8v77 int), (r8v91 int) binds: [B:382:0x08c8, B:362:0x0868, B:341:0x080c, B:209:0x05de, B:259:0x0699, B:132:0x042f] A[DONT_GENERATE, DONT_INLINE]
  0x08e9: PHI (r9v69 int) = (r9v34 int), (r9v35 int), (r9v36 int), (r9v51 int), (r9v59 int), (r9v70 int) binds: [B:382:0x08c8, B:362:0x0868, B:341:0x080c, B:209:0x05de, B:259:0x0699, B:132:0x042f] A[DONT_GENERATE, DONT_INLINE]
  0x08e9: PHI (r10v51 com.google.android.gms.internal.firebase-auth-api.zzaik) = 
  (r10v22 com.google.android.gms.internal.firebase-auth-api.zzaik)
  (r10v23 com.google.android.gms.internal.firebase-auth-api.zzaik)
  (r10v24 com.google.android.gms.internal.firebase-auth-api.zzaik)
  (r10v35 com.google.android.gms.internal.firebase-auth-api.zzaik)
  (r10v42 com.google.android.gms.internal.firebase-auth-api.zzaik)
  (r10v52 com.google.android.gms.internal.firebase-auth-api.zzaik)
 binds: [B:382:0x08c8, B:362:0x0868, B:341:0x080c, B:209:0x05de, B:259:0x0699, B:132:0x042f] A[DONT_GENERATE, DONT_INLINE]
  0x08e9: PHI (r11v67 int) = (r11v37 int), (r11v38 int), (r11v39 int), (r11v50 int), (r11v57 int), (r11v68 int) binds: [B:382:0x08c8, B:362:0x0868, B:341:0x080c, B:209:0x05de, B:259:0x0699, B:132:0x042f] A[DONT_GENERATE, DONT_INLINE]
  0x08e9: PHI (r13v67 sun.misc.Unsafe) = 
  (r13v40 sun.misc.Unsafe)
  (r13v41 sun.misc.Unsafe)
  (r13v42 sun.misc.Unsafe)
  (r13v50 sun.misc.Unsafe)
  (r13v56 sun.misc.Unsafe)
  (r13v68 sun.misc.Unsafe)
 binds: [B:382:0x08c8, B:362:0x0868, B:341:0x080c, B:209:0x05de, B:259:0x0699, B:132:0x042f] A[DONT_GENERATE, DONT_INLINE]
  0x08e9: PHI (r15v35 int) = (r15v7 int), (r15v8 int), (r15v9 int), (r15v18 int), (r15v25 int), (r15v36 int) binds: [B:382:0x08c8, B:362:0x0868, B:341:0x080c, B:209:0x05de, B:259:0x0699, B:132:0x042f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:518:0x0cad  */
    /* JADX WARN: Removed duplicated region for block: B:593:0x08ff A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:599:0x0d1f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:641:0x08ec A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:195:0x059a -> B:186:0x0576). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:225:0x0627 -> B:217:0x0606). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:245:0x066f -> B:235:0x0646). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:283:0x06f5 -> B:276:0x06dc). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final int zza(T r31, byte[] r32, int r33, int r34, int r35, com.google.android.gms.internal.p002firebaseauthapi.zzaik r36) throws com.google.android.gms.internal.p002firebaseauthapi.zzakf {
        /*
            Method dump skipped, instruction units count: 3594
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzalg.zza(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.firebase-auth-api.zzaik):int");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    public final T zza() {
        return (T) this.zzn.zza(this.zzg);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:182:0x05b5 A[Catch: all -> 0x026f, TryCatch #8 {all -> 0x026f, blocks: (B:170:0x0586, B:180:0x05b0, B:182:0x05b5, B:183:0x05ba, B:52:0x00ce, B:53:0x00db, B:54:0x00e0, B:56:0x00fb, B:55:0x00ee, B:57:0x00ff, B:58:0x010d, B:59:0x011b, B:61:0x0125, B:64:0x012c, B:65:0x0132, B:66:0x013c, B:67:0x014a, B:68:0x0154, B:69:0x0163, B:71:0x016c, B:72:0x017a, B:73:0x0189, B:74:0x0198, B:75:0x01a7, B:76:0x01b6, B:77:0x01c5, B:78:0x01d4, B:79:0x01e3, B:81:0x01f3, B:85:0x0214, B:82:0x01fd, B:84:0x0205, B:86:0x0225, B:87:0x0237, B:88:0x0245, B:89:0x0253, B:90:0x0261), top: B:208:0x0586 }] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x05eb A[LOOP:3: B:198:0x05e7->B:200:0x05eb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x05ff  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x05c0 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(T r18, com.google.android.gms.internal.p002firebaseauthapi.zzals r19, com.google.android.gms.internal.p002firebaseauthapi.zzajk r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1682
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzalg.zza(java.lang.Object, com.google.android.gms.internal.firebase-auth-api.zzals, com.google.android.gms.internal.firebase-auth-api.zzajk):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:112:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(T r24, com.google.android.gms.internal.p002firebaseauthapi.zzanf r25) {
        /*
            Method dump skipped, instruction units count: 3176
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzalg.zza(java.lang.Object, com.google.android.gms.internal.firebase-auth-api.zzanf):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(T r7, T r8) {
        /*
            Method dump skipped, instruction units count: 404
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzalg.zza(java.lang.Object, java.lang.Object):void");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    public final void zza(T t10, byte[] bArr, int i10, int i11, zzaik zzaikVar) throws zzakf {
        zza(t10, bArr, i10, i11, 0, zzaikVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e2 A[PHI: r3
  0x00e2: PHI (r3v13 java.lang.Object) = (r3v11 java.lang.Object), (r3v14 java.lang.Object) binds: [B:67:0x00e0, B:62:0x00ce] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzb(T r9) {
        /*
            Method dump skipped, instruction units count: 476
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzalg.zzb(java.lang.Object):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01b2  */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzb(T r10, T r11) {
        /*
            Method dump skipped, instruction units count: 626
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzalg.zzb(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to find switch 'out' block (already processed)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.calcSwitchOut(SwitchRegionMaker.java:217)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:68)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:125)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:102)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzd(T r8) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzalg.zzd(java.lang.Object):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00dd  */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23, types: [com.google.android.gms.internal.firebase-auth-api.zzalv] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.google.android.gms.internal.firebase-auth-api.zzalv] */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zze(T r19) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzalg.zze(java.lang.Object):boolean");
    }
}
