package com.google.android.gms.internal.play_billing;

import com.pichillilorenzo.flutter_inappwebview_android.R;
import java.lang.reflect.Field;
import java.util.Arrays;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
final class zzef<T> implements zzeo<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzfp.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzec zzg;
    private final boolean zzh;
    private final int[] zzi;
    private final int zzj;
    private final int zzk;
    private final zzdq zzl;
    private final zzff zzm;
    private final zzce zzn;
    private final zzei zzo;
    private final zzdx zzp;

    private zzef(int[] iArr, Object[] objArr, int i10, int i11, zzec zzecVar, int i12, boolean z10, int[] iArr2, int i13, int i14, zzei zzeiVar, zzdq zzdqVar, zzff zzffVar, zzce zzceVar, zzdx zzdxVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i10;
        this.zzf = i11;
        boolean z11 = false;
        if (zzceVar != null && zzceVar.zzf(zzecVar)) {
            z11 = true;
        }
        this.zzh = z11;
        this.zzi = iArr2;
        this.zzj = i13;
        this.zzk = i14;
        this.zzo = zzeiVar;
        this.zzl = zzdqVar;
        this.zzm = zzffVar;
        this.zzn = zzceVar;
        this.zzg = zzecVar;
        this.zzp = zzdxVar;
    }

    private static void zzA(Object obj) {
        if (!zzL(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzB(Object obj, Object obj2, int i10) {
        if (zzI(obj2, i10)) {
            int iZzs = zzs(i10) & 1048575;
            Unsafe unsafe = zzb;
            long j10 = iZzs;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + obj2.toString());
            }
            zzeo zzeoVarZzv = zzv(i10);
            if (!zzI(obj, i10)) {
                if (zzL(object)) {
                    Object objZze = zzeoVarZzv.zze();
                    zzeoVarZzv.zzg(objZze, object);
                    unsafe.putObject(obj, j10, objZze);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                zzD(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzL(object2)) {
                Object objZze2 = zzeoVarZzv.zze();
                zzeoVarZzv.zzg(objZze2, object2);
                unsafe.putObject(obj, j10, objZze2);
                object2 = objZze2;
            }
            zzeoVarZzv.zzg(object2, object);
        }
    }

    private final void zzC(Object obj, Object obj2, int i10) {
        int i11 = this.zzc[i10];
        if (zzM(obj2, i11, i10)) {
            int iZzs = zzs(i10) & 1048575;
            Unsafe unsafe = zzb;
            long j10 = iZzs;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + obj2.toString());
            }
            zzeo zzeoVarZzv = zzv(i10);
            if (!zzM(obj, i11, i10)) {
                if (zzL(object)) {
                    Object objZze = zzeoVarZzv.zze();
                    zzeoVarZzv.zzg(objZze, object);
                    unsafe.putObject(obj, j10, objZze);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                zzE(obj, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzL(object2)) {
                Object objZze2 = zzeoVarZzv.zze();
                zzeoVarZzv.zzg(objZze2, object2);
                unsafe.putObject(obj, j10, objZze2);
                object2 = objZze2;
            }
            zzeoVarZzv.zzg(object2, object);
        }
    }

    private final void zzD(Object obj, int i10) {
        int iZzp = zzp(i10);
        long j10 = 1048575 & iZzp;
        if (j10 == 1048575) {
            return;
        }
        zzfp.zzq(obj, j10, (1 << (iZzp >>> 20)) | zzfp.zzc(obj, j10));
    }

    private final void zzE(Object obj, int i10, int i11) {
        zzfp.zzq(obj, zzp(i11) & 1048575, i10);
    }

    private final void zzF(Object obj, int i10, Object obj2) {
        zzb.putObject(obj, zzs(i10) & 1048575, obj2);
        zzD(obj, i10);
    }

    private final void zzG(Object obj, int i10, int i11, Object obj2) {
        zzb.putObject(obj, zzs(i11) & 1048575, obj2);
        zzE(obj, i10, i11);
    }

    private final boolean zzH(Object obj, Object obj2, int i10) {
        return zzI(obj, i10) == zzI(obj2, i10);
    }

    private final boolean zzI(Object obj, int i10) {
        int iZzp = zzp(i10);
        long j10 = iZzp & 1048575;
        if (j10 != 1048575) {
            return (zzfp.zzc(obj, j10) & (1 << (iZzp >>> 20))) != 0;
        }
        int iZzs = zzs(i10);
        long j11 = iZzs & 1048575;
        switch (zzr(iZzs)) {
            case 0:
                return Double.doubleToRawLongBits(zzfp.zza(obj, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzfp.zzb(obj, j11)) != 0;
            case 2:
                return zzfp.zzd(obj, j11) != 0;
            case 3:
                return zzfp.zzd(obj, j11) != 0;
            case 4:
                return zzfp.zzc(obj, j11) != 0;
            case 5:
                return zzfp.zzd(obj, j11) != 0;
            case 6:
                return zzfp.zzc(obj, j11) != 0;
            case 7:
                return zzfp.zzw(obj, j11);
            case 8:
                Object objZzf = zzfp.zzf(obj, j11);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzbq) {
                    return !zzbq.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzfp.zzf(obj, j11) != null;
            case 10:
                return !zzbq.zzb.equals(zzfp.zzf(obj, j11));
            case 11:
                return zzfp.zzc(obj, j11) != 0;
            case 12:
                return zzfp.zzc(obj, j11) != 0;
            case 13:
                return zzfp.zzc(obj, j11) != 0;
            case 14:
                return zzfp.zzd(obj, j11) != 0;
            case 15:
                return zzfp.zzc(obj, j11) != 0;
            case 16:
                return zzfp.zzd(obj, j11) != 0;
            case 17:
                return zzfp.zzf(obj, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzJ(Object obj, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? zzI(obj, i10) : (i12 & i13) != 0;
    }

    private static boolean zzK(Object obj, int i10, zzeo zzeoVar) {
        return zzeoVar.zzk(zzfp.zzf(obj, i10 & 1048575));
    }

    private static boolean zzL(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzcs) {
            return ((zzcs) obj).zzw();
        }
        return true;
    }

    private final boolean zzM(Object obj, int i10, int i11) {
        return zzfp.zzc(obj, (long) (zzp(i11) & 1048575)) == i10;
    }

    private static boolean zzN(Object obj, long j10) {
        return ((Boolean) zzfp.zzf(obj, j10)).booleanValue();
    }

    private static final void zzO(int i10, Object obj, zzfx zzfxVar) {
        if (obj instanceof String) {
            zzfxVar.zzG(i10, (String) obj);
        } else {
            zzfxVar.zzd(i10, (zzbq) obj);
        }
    }

    static zzfg zzd(Object obj) {
        zzcs zzcsVar = (zzcs) obj;
        zzfg zzfgVar = zzcsVar.zzc;
        if (zzfgVar != zzfg.zzc()) {
            return zzfgVar;
        }
        zzfg zzfgVarZzf = zzfg.zzf();
        zzcsVar.zzc = zzfgVarZzf;
        return zzfgVarZzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0282  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static com.google.android.gms.internal.play_billing.zzef zzl(java.lang.Class r33, com.google.android.gms.internal.play_billing.zzdz r34, com.google.android.gms.internal.play_billing.zzei r35, com.google.android.gms.internal.play_billing.zzdq r36, com.google.android.gms.internal.play_billing.zzff r37, com.google.android.gms.internal.play_billing.zzce r38, com.google.android.gms.internal.play_billing.zzdx r39) {
        /*
            Method dump skipped, instruction units count: 1030
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzef.zzl(java.lang.Class, com.google.android.gms.internal.play_billing.zzdz, com.google.android.gms.internal.play_billing.zzei, com.google.android.gms.internal.play_billing.zzdq, com.google.android.gms.internal.play_billing.zzff, com.google.android.gms.internal.play_billing.zzce, com.google.android.gms.internal.play_billing.zzdx):com.google.android.gms.internal.play_billing.zzef");
    }

    private static double zzm(Object obj, long j10) {
        return ((Double) zzfp.zzf(obj, j10)).doubleValue();
    }

    private static float zzn(Object obj, long j10) {
        return ((Float) zzfp.zzf(obj, j10)).floatValue();
    }

    private static int zzo(Object obj, long j10) {
        return ((Integer) zzfp.zzf(obj, j10)).intValue();
    }

    private final int zzp(int i10) {
        return this.zzc[i10 + 2];
    }

    private final int zzq(int i10, int i11) {
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

    private static int zzr(int i10) {
        return (i10 >>> 20) & 255;
    }

    private final int zzs(int i10) {
        return this.zzc[i10 + 1];
    }

    private static long zzt(Object obj, long j10) {
        return ((Long) zzfp.zzf(obj, j10)).longValue();
    }

    private final zzcw zzu(int i10) {
        int i11 = i10 / 3;
        return (zzcw) this.zzd[i11 + i11 + 1];
    }

    private final zzeo zzv(int i10) {
        Object[] objArr = this.zzd;
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        zzeo zzeoVar = (zzeo) objArr[i12];
        if (zzeoVar != null) {
            return zzeoVar;
        }
        zzeo zzeoVarZzb = zzel.zza().zzb((Class) objArr[i12 + 1]);
        this.zzd[i12] = zzeoVarZzb;
        return zzeoVarZzb;
    }

    private final Object zzw(int i10) {
        int i11 = i10 / 3;
        return this.zzd[i11 + i11];
    }

    private final Object zzx(Object obj, int i10) {
        zzeo zzeoVarZzv = zzv(i10);
        int iZzs = zzs(i10) & 1048575;
        if (!zzI(obj, i10)) {
            return zzeoVarZzv.zze();
        }
        Object object = zzb.getObject(obj, iZzs);
        if (zzL(object)) {
            return object;
        }
        Object objZze = zzeoVarZzv.zze();
        if (object != null) {
            zzeoVarZzv.zzg(objZze, object);
        }
        return objZze;
    }

    private final Object zzy(Object obj, int i10, int i11) {
        zzeo zzeoVarZzv = zzv(i11);
        if (!zzM(obj, i10, i11)) {
            return zzeoVarZzv.zze();
        }
        Object object = zzb.getObject(obj, zzs(i11) & 1048575);
        if (zzL(object)) {
            return object;
        }
        Object objZze = zzeoVarZzv.zze();
        if (object != null) {
            zzeoVarZzv.zzg(objZze, object);
        }
        return objZze;
    }

    private static Field zzz(Class cls, String str) {
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

    /* JADX WARN: Code restructure failed: missing block: B:244:0x0503, code lost:
    
        if ((r1 instanceof com.google.android.gms.internal.play_billing.zzbq) != false) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x0506, code lost:
    
        r0 = com.google.android.gms.internal.play_billing.zzby.zzw(r0);
        r1 = com.google.android.gms.internal.play_billing.zzby.zzv((java.lang.String) r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d0, code lost:
    
        if ((r1 instanceof com.google.android.gms.internal.play_billing.zzbq) != false) goto L236;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03cd  */
    /* JADX WARN: Type inference failed for: r0v141, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v204, types: [int] */
    /* JADX WARN: Type inference failed for: r0v213 */
    /* JADX WARN: Type inference failed for: r0v215 */
    /* JADX WARN: Type inference failed for: r0v216 */
    /* JADX WARN: Type inference failed for: r0v217 */
    /* JADX WARN: Type inference failed for: r0v218 */
    /* JADX WARN: Type inference failed for: r0v219 */
    /* JADX WARN: Type inference failed for: r0v220 */
    /* JADX WARN: Type inference failed for: r0v221 */
    /* JADX WARN: Type inference failed for: r0v222 */
    /* JADX WARN: Type inference failed for: r0v223 */
    /* JADX WARN: Type inference failed for: r0v224 */
    /* JADX WARN: Type inference failed for: r0v225 */
    /* JADX WARN: Type inference failed for: r0v226 */
    /* JADX WARN: Type inference failed for: r0v77, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v78, types: [com.google.android.gms.internal.play_billing.zzdk] */
    /* JADX WARN: Type inference failed for: r0v80, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v82, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v93 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v113 */
    /* JADX WARN: Type inference failed for: r1v116 */
    /* JADX WARN: Type inference failed for: r1v117 */
    /* JADX WARN: Type inference failed for: r1v119 */
    /* JADX WARN: Type inference failed for: r1v120 */
    /* JADX WARN: Type inference failed for: r1v121 */
    /* JADX WARN: Type inference failed for: r1v60, types: [int] */
    /* JADX WARN: Type inference failed for: r1v62 */
    /* JADX WARN: Type inference failed for: r1v74, types: [int] */
    /* JADX WARN: Type inference failed for: r1v78, types: [int] */
    /* JADX WARN: Type inference failed for: r2v27, types: [int] */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31, types: [int] */
    /* JADX WARN: Type inference failed for: r2v35, types: [int] */
    /* JADX WARN: Type inference failed for: r2v39, types: [int] */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v48, types: [int] */
    /* JADX WARN: Type inference failed for: r2v63 */
    /* JADX WARN: Type inference failed for: r2v64 */
    /* JADX WARN: Type inference failed for: r2v65 */
    /* JADX WARN: Type inference failed for: r2v66 */
    /* JADX WARN: Type inference failed for: r2v67 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22, types: [int] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25, types: [int] */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v34, types: [int] */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v41, types: [int] */
    /* JADX WARN: Type inference failed for: r3v46 */
    /* JADX WARN: Type inference failed for: r3v47 */
    /* JADX WARN: Type inference failed for: r3v48 */
    /* JADX WARN: Type inference failed for: r3v49 */
    /* JADX WARN: Type inference failed for: r3v50 */
    /* JADX WARN: Type inference failed for: r3v51 */
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
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v31, types: [int] */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v38, types: [int] */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v61 */
    /* JADX WARN: Type inference failed for: r4v62 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [int] */
    @Override // com.google.android.gms.internal.play_billing.zzeo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 1724
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzef.zza(java.lang.Object):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e2 A[PHI: r1 r2
  0x00e2: PHI (r1v14 int) = (r1v12 int), (r1v17 int) binds: [B:67:0x00e0, B:63:0x00cc] A[DONT_GENERATE, DONT_INLINE]
  0x00e2: PHI (r2v15 java.lang.Object) = (r2v12 java.lang.Object), (r2v16 java.lang.Object) binds: [B:67:0x00e0, B:63:0x00cc] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.play_billing.zzeo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzb(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 478
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzef.zzb(java.lang.Object):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:264:0x0655, code lost:
    
        if (r1 == 0) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0657, code lost:
    
        r13.add(com.google.android.gms.internal.play_billing.zzbq.zzb);
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x065d, code lost:
    
        r13.add(com.google.android.gms.internal.play_billing.zzbq.zzl(r37, r0, r1));
        r0 = r0 + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x0665, code lost:
    
        if (r0 >= r8) goto L705;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x0667, code lost:
    
        r1 = com.google.android.gms.internal.play_billing.zzbd.zzh(r37, r0, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x066d, code lost:
    
        if (r14 != r10.zza) goto L706;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x066f, code lost:
    
        r0 = com.google.android.gms.internal.play_billing.zzbd.zzh(r37, r1, r10);
        r1 = r10.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x0675, code lost:
    
        if (r1 < 0) goto L611;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x0679, code lost:
    
        if (r1 > (r37.length - r0)) goto L612;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x067b, code lost:
    
        if (r1 != 0) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x0682, code lost:
    
        throw com.google.android.gms.internal.play_billing.zzdc.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x0687, code lost:
    
        throw com.google.android.gms.internal.play_billing.zzdc.zzd();
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x0688, code lost:
    
        r1 = r0;
        r7 = r14;
        r0 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x07d3, code lost:
    
        if (r3.zzb != 0) goto L356;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x07d5, code lost:
    
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x07d7, code lost:
    
        r8 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x07d9, code lost:
    
        r13.zze(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x07dc, code lost:
    
        if (r2 >= r6) goto L719;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x07de, code lost:
    
        r8 = com.google.android.gms.internal.play_billing.zzbd.zzh(r37, r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x07e4, code lost:
    
        if (r7 != r3.zza) goto L720;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x07e6, code lost:
    
        r2 = com.google.android.gms.internal.play_billing.zzbd.zzk(r37, r8, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x07ee, code lost:
    
        if (r3.zzb == 0) goto L357;
     */
    /* JADX WARN: Code restructure failed: missing block: B:563:0x0c70, code lost:
    
        if (r6 == 1048575) goto L565;
     */
    /* JADX WARN: Code restructure failed: missing block: B:564:0x0c72, code lost:
    
        r33.putInt(r7, r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:565:0x0c78, code lost:
    
        r2 = r0.zzj;
     */
    /* JADX WARN: Code restructure failed: missing block: B:567:0x0c7c, code lost:
    
        if (r2 >= r0.zzk) goto L684;
     */
    /* JADX WARN: Code restructure failed: missing block: B:568:0x0c7e, code lost:
    
        r3 = r0.zzi;
        r5 = r0.zzc;
        r3 = r3[r2];
        r5 = r5[r3];
        r5 = com.google.android.gms.internal.play_billing.zzfp.zzf(r7, r0.zzs(r3) & 1048575);
     */
    /* JADX WARN: Code restructure failed: missing block: B:569:0x0c90, code lost:
    
        if (r5 != null) goto L571;
     */
    /* JADX WARN: Code restructure failed: missing block: B:572:0x0c97, code lost:
    
        if (r0.zzu(r3) != null) goto L685;
     */
    /* JADX WARN: Code restructure failed: missing block: B:573:0x0c99, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:574:0x0c9c, code lost:
    
        r5 = (com.google.android.gms.internal.play_billing.zzdw) r5;
        r1 = (com.google.android.gms.internal.play_billing.zzdv) r0.zzw(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:575:0x0ca4, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:577:0x0ca7, code lost:
    
        if (r8 != 0) goto L582;
     */
    /* JADX WARN: Code restructure failed: missing block: B:578:0x0ca9, code lost:
    
        if (r1 != r39) goto L580;
     */
    /* JADX WARN: Code restructure failed: missing block: B:581:0x0cb0, code lost:
    
        throw com.google.android.gms.internal.play_billing.zzdc.zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:582:0x0cb1, code lost:
    
        if (r1 > r39) goto L585;
     */
    /* JADX WARN: Code restructure failed: missing block: B:583:0x0cb3, code lost:
    
        if (r4 != r8) goto L585;
     */
    /* JADX WARN: Code restructure failed: missing block: B:584:0x0cb5, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:586:0x0cba, code lost:
    
        throw com.google.android.gms.internal.play_billing.zzdc.zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:587:0x0665, code lost:
    
        r13.add(com.google.android.gms.internal.play_billing.zzbq.zzl(r37, r0, r1));
        r0 = r0 + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:590:0x07d9, code lost:
    
        r8 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x070a  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0754  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x09d7 A[PHI: r0 r7 r8 r9 r11 r14 r33
  0x09d7: PHI (r0v32 com.google.android.gms.internal.play_billing.zzef<T>) = 
  (r0v1 com.google.android.gms.internal.play_billing.zzef<T>)
  (r0v1 com.google.android.gms.internal.play_billing.zzef<T>)
  (r0v1 com.google.android.gms.internal.play_billing.zzef<T>)
  (r0v1 com.google.android.gms.internal.play_billing.zzef<T>)
  (r0v29 com.google.android.gms.internal.play_billing.zzef<T>)
  (r0v30 com.google.android.gms.internal.play_billing.zzef<T>)
  (r0v1 com.google.android.gms.internal.play_billing.zzef<T>)
 binds: [B:445:0x0994, B:429:0x093a, B:412:0x08ec, B:339:0x078b, B:257:0x0638, B:289:0x06d0, B:188:0x04a3] A[DONT_GENERATE, DONT_INLINE]
  0x09d7: PHI (r7v29 int) = (r7v6 int), (r7v7 int), (r7v8 int), (r7v13 int), (r7v22 int), (r7v24 int), (r7v33 int) binds: [B:445:0x0994, B:429:0x093a, B:412:0x08ec, B:339:0x078b, B:257:0x0638, B:289:0x06d0, B:188:0x04a3] A[DONT_GENERATE, DONT_INLINE]
  0x09d7: PHI (r8v116 int) = (r8v54 int), (r8v55 int), (r8v56 int), (r8v84 int), (r8v107 int), (r8v109 int), (r8v120 int) binds: [B:445:0x0994, B:429:0x093a, B:412:0x08ec, B:339:0x078b, B:257:0x0638, B:289:0x06d0, B:188:0x04a3] A[DONT_GENERATE, DONT_INLINE]
  0x09d7: PHI (r9v80 com.google.android.gms.internal.play_billing.zzbc) = 
  (r9v38 com.google.android.gms.internal.play_billing.zzbc)
  (r9v39 com.google.android.gms.internal.play_billing.zzbc)
  (r9v40 com.google.android.gms.internal.play_billing.zzbc)
  (r9v53 com.google.android.gms.internal.play_billing.zzbc)
  (r9v73 com.google.android.gms.internal.play_billing.zzbc)
  (r9v75 com.google.android.gms.internal.play_billing.zzbc)
  (r9v82 com.google.android.gms.internal.play_billing.zzbc)
 binds: [B:445:0x0994, B:429:0x093a, B:412:0x08ec, B:339:0x078b, B:257:0x0638, B:289:0x06d0, B:188:0x04a3] A[DONT_GENERATE, DONT_INLINE]
  0x09d7: PHI (r11v32 int) = (r11v13 int), (r11v14 int), (r11v15 int), (r11v17 int), (r11v25 int), (r11v27 int), (r11v35 int) binds: [B:445:0x0994, B:429:0x093a, B:412:0x08ec, B:339:0x078b, B:257:0x0638, B:289:0x06d0, B:188:0x04a3] A[DONT_GENERATE, DONT_INLINE]
  0x09d7: PHI (r14v44 int) = (r14v18 int), (r14v19 int), (r14v20 int), (r14v22 int), (r14v34 int), (r14v36 int), (r14v46 int) binds: [B:445:0x0994, B:429:0x093a, B:412:0x08ec, B:339:0x078b, B:257:0x0638, B:289:0x06d0, B:188:0x04a3] A[DONT_GENERATE, DONT_INLINE]
  0x09d7: PHI (r33v32 sun.misc.Unsafe) = 
  (r33v7 sun.misc.Unsafe)
  (r33v8 sun.misc.Unsafe)
  (r33v9 sun.misc.Unsafe)
  (r33v14 sun.misc.Unsafe)
  (r33v25 sun.misc.Unsafe)
  (r33v27 sun.misc.Unsafe)
  (r33v34 sun.misc.Unsafe)
 binds: [B:445:0x0994, B:429:0x093a, B:412:0x08ec, B:339:0x078b, B:257:0x0638, B:289:0x06d0, B:188:0x04a3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:625:0x09da A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:628:0x0bf5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:631:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:672:0x09ec A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:673:0x0c08 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x020e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:274:0x067b -> B:265:0x0657). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:306:0x071a -> B:298:0x06f9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:326:0x0764 -> B:316:0x073b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:363:0x07ee -> B:356:0x07d5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final int zzc(java.lang.Object r36, byte[] r37, int r38, int r39, int r40, com.google.android.gms.internal.play_billing.zzbc r41) throws com.google.android.gms.internal.play_billing.zzdc {
        /*
            Method dump skipped, instruction units count: 3404
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzef.zzc(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.play_billing.zzbc):int");
    }

    @Override // com.google.android.gms.internal.play_billing.zzeo
    public final Object zze() {
        return ((zzcs) this.zzg).zzl();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
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
    @Override // com.google.android.gms.internal.play_billing.zzeo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzf(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzef.zzf(java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    @Override // com.google.android.gms.internal.play_billing.zzeo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzg(java.lang.Object r7, java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 414
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzef.zzg(java.lang.Object, java.lang.Object):void");
    }

    @Override // com.google.android.gms.internal.play_billing.zzeo
    public final void zzh(Object obj, byte[] bArr, int i10, int i11, zzbc zzbcVar) throws zzdc {
        zzc(obj, bArr, i10, i11, 0, zzbcVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    @Override // com.google.android.gms.internal.play_billing.zzeo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzi(java.lang.Object r24, com.google.android.gms.internal.play_billing.zzfx r25) {
        /*
            Method dump skipped, instruction units count: 1912
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzef.zzi(java.lang.Object, com.google.android.gms.internal.play_billing.zzfx):void");
    }

    @Override // com.google.android.gms.internal.play_billing.zzeo
    public final boolean zzj(Object obj, Object obj2) {
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int iZzs = zzs(i10);
            long j10 = iZzs & 1048575;
            switch (zzr(iZzs)) {
                case 0:
                    if (!zzH(obj, obj2, i10) || Double.doubleToLongBits(zzfp.zza(obj, j10)) != Double.doubleToLongBits(zzfp.zza(obj2, j10))) {
                        return false;
                    }
                    break;
                    break;
                case 1:
                    if (!zzH(obj, obj2, i10) || Float.floatToIntBits(zzfp.zzb(obj, j10)) != Float.floatToIntBits(zzfp.zzb(obj2, j10))) {
                        return false;
                    }
                    break;
                    break;
                case 2:
                    if (!zzH(obj, obj2, i10) || zzfp.zzd(obj, j10) != zzfp.zzd(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 3:
                    if (!zzH(obj, obj2, i10) || zzfp.zzd(obj, j10) != zzfp.zzd(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 4:
                    if (!zzH(obj, obj2, i10) || zzfp.zzc(obj, j10) != zzfp.zzc(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 5:
                    if (!zzH(obj, obj2, i10) || zzfp.zzd(obj, j10) != zzfp.zzd(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 6:
                    if (!zzH(obj, obj2, i10) || zzfp.zzc(obj, j10) != zzfp.zzc(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 7:
                    if (!zzH(obj, obj2, i10) || zzfp.zzw(obj, j10) != zzfp.zzw(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 8:
                    if (!zzH(obj, obj2, i10) || !zzeq.zzG(zzfp.zzf(obj, j10), zzfp.zzf(obj2, j10))) {
                        return false;
                    }
                    break;
                    break;
                case 9:
                    if (!zzH(obj, obj2, i10) || !zzeq.zzG(zzfp.zzf(obj, j10), zzfp.zzf(obj2, j10))) {
                        return false;
                    }
                    break;
                    break;
                case 10:
                    if (!zzH(obj, obj2, i10) || !zzeq.zzG(zzfp.zzf(obj, j10), zzfp.zzf(obj2, j10))) {
                        return false;
                    }
                    break;
                    break;
                case 11:
                    if (!zzH(obj, obj2, i10) || zzfp.zzc(obj, j10) != zzfp.zzc(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 12:
                    if (!zzH(obj, obj2, i10) || zzfp.zzc(obj, j10) != zzfp.zzc(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 13:
                    if (!zzH(obj, obj2, i10) || zzfp.zzc(obj, j10) != zzfp.zzc(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 14:
                    if (!zzH(obj, obj2, i10) || zzfp.zzd(obj, j10) != zzfp.zzd(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 15:
                    if (!zzH(obj, obj2, i10) || zzfp.zzc(obj, j10) != zzfp.zzc(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 16:
                    if (!zzH(obj, obj2, i10) || zzfp.zzd(obj, j10) != zzfp.zzd(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 17:
                    if (!zzH(obj, obj2, i10) || !zzeq.zzG(zzfp.zzf(obj, j10), zzfp.zzf(obj2, j10))) {
                        return false;
                    }
                    break;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                case 31:
                case 32:
                case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                case R.styleable.AppCompatTheme_alertDialogButtonGroupStyle /* 35 */:
                case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                case R.styleable.AppCompatTheme_alertDialogStyle /* 37 */:
                case R.styleable.AppCompatTheme_alertDialogTheme /* 38 */:
                case R.styleable.AppCompatTheme_autoCompleteTextViewStyle /* 39 */:
                case R.styleable.AppCompatTheme_borderlessButtonStyle /* 40 */:
                case R.styleable.AppCompatTheme_buttonBarButtonStyle /* 41 */:
                case R.styleable.AppCompatTheme_buttonBarNegativeButtonStyle /* 42 */:
                case R.styleable.AppCompatTheme_buttonBarNeutralButtonStyle /* 43 */:
                case R.styleable.AppCompatTheme_buttonBarPositiveButtonStyle /* 44 */:
                case R.styleable.AppCompatTheme_buttonBarStyle /* 45 */:
                case R.styleable.AppCompatTheme_buttonStyle /* 46 */:
                case R.styleable.AppCompatTheme_buttonStyleSmall /* 47 */:
                case R.styleable.AppCompatTheme_checkboxStyle /* 48 */:
                case R.styleable.AppCompatTheme_checkedTextViewStyle /* 49 */:
                case 50:
                    if (!zzeq.zzG(zzfp.zzf(obj, j10), zzfp.zzf(obj2, j10))) {
                        return false;
                    }
                    break;
                    break;
                case R.styleable.AppCompatTheme_colorBackgroundFloating /* 51 */:
                case R.styleable.AppCompatTheme_colorButtonNormal /* 52 */:
                case R.styleable.AppCompatTheme_colorControlActivated /* 53 */:
                case R.styleable.AppCompatTheme_colorControlHighlight /* 54 */:
                case R.styleable.AppCompatTheme_colorControlNormal /* 55 */:
                case R.styleable.AppCompatTheme_colorError /* 56 */:
                case R.styleable.AppCompatTheme_colorPrimary /* 57 */:
                case R.styleable.AppCompatTheme_colorPrimaryDark /* 58 */:
                case R.styleable.AppCompatTheme_colorSwitchThumbNormal /* 59 */:
                case R.styleable.AppCompatTheme_controlBackground /* 60 */:
                case R.styleable.AppCompatTheme_dialogCornerRadius /* 61 */:
                case R.styleable.AppCompatTheme_dialogPreferredPadding /* 62 */:
                case R.styleable.AppCompatTheme_dialogTheme /* 63 */:
                case R.styleable.AppCompatTheme_dividerHorizontal /* 64 */:
                case R.styleable.AppCompatTheme_dividerVertical /* 65 */:
                case R.styleable.AppCompatTheme_dropDownListViewStyle /* 66 */:
                case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /* 67 */:
                case R.styleable.AppCompatTheme_editTextBackground /* 68 */:
                    long jZzp = zzp(i10) & 1048575;
                    if (zzfp.zzc(obj, jZzp) != zzfp.zzc(obj2, jZzp) || !zzeq.zzG(zzfp.zzf(obj, j10), zzfp.zzf(obj2, j10))) {
                        return false;
                    }
                    break;
                    break;
            }
        }
        if (!this.zzm.zzd(obj).equals(this.zzm.zzd(obj2))) {
            return false;
        }
        if (this.zzh) {
            return this.zzn.zzb(obj).equals(this.zzn.zzb(obj2));
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x009b  */
    @Override // com.google.android.gms.internal.play_billing.zzeo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzk(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzef.zzk(java.lang.Object):boolean");
    }
}
