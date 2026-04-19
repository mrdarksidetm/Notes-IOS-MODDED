package com.google.android.recaptcha.internal;

import com.pichillilorenzo.flutter_inappwebview_android.R;
import java.lang.reflect.Field;
import java.util.Arrays;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
final class zzma<T> implements zzmk<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzni.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzlx zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zznb zzm;
    private final zzke zzn;

    private zzma(int[] iArr, Object[] objArr, int i10, int i11, zzlx zzlxVar, int i12, boolean z10, int[] iArr2, int i13, int i14, zzmd zzmdVar, zzlk zzlkVar, zznb zznbVar, zzke zzkeVar, zzls zzlsVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i10;
        this.zzf = i11;
        this.zzi = zzlxVar instanceof zzks;
        boolean z11 = false;
        if (zzkeVar != null && zzkeVar.zzj(zzlxVar)) {
            z11 = true;
        }
        this.zzh = z11;
        this.zzj = iArr2;
        this.zzk = i13;
        this.zzl = i14;
        this.zzm = zznbVar;
        this.zzn = zzkeVar;
        this.zzg = zzlxVar;
    }

    private final Object zzA(Object obj, int i10) {
        zzmk zzmkVarZzx = zzx(i10);
        int iZzu = zzu(i10) & 1048575;
        if (!zzN(obj, i10)) {
            return zzmkVarZzx.zze();
        }
        Object object = zzb.getObject(obj, iZzu);
        if (zzQ(object)) {
            return object;
        }
        Object objZze = zzmkVarZzx.zze();
        if (object != null) {
            zzmkVarZzx.zzg(objZze, object);
        }
        return objZze;
    }

    private final Object zzB(Object obj, int i10, int i11) {
        zzmk zzmkVarZzx = zzx(i11);
        if (!zzR(obj, i10, i11)) {
            return zzmkVarZzx.zze();
        }
        Object object = zzb.getObject(obj, zzu(i11) & 1048575);
        if (zzQ(object)) {
            return object;
        }
        Object objZze = zzmkVarZzx.zze();
        if (object != null) {
            zzmkVarZzx.zzg(objZze, object);
        }
        return objZze;
    }

    private static Field zzC(Class cls, String str) {
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

    private static void zzD(Object obj) {
        if (!zzQ(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzE(Object obj, Object obj2, int i10) {
        if (zzN(obj2, i10)) {
            int iZzu = zzu(i10) & 1048575;
            Unsafe unsafe = zzb;
            long j10 = iZzu;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + obj2.toString());
            }
            zzmk zzmkVarZzx = zzx(i10);
            if (!zzN(obj, i10)) {
                if (zzQ(object)) {
                    Object objZze = zzmkVarZzx.zze();
                    zzmkVarZzx.zzg(objZze, object);
                    unsafe.putObject(obj, j10, objZze);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                zzH(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzQ(object2)) {
                Object objZze2 = zzmkVarZzx.zze();
                zzmkVarZzx.zzg(objZze2, object2);
                unsafe.putObject(obj, j10, objZze2);
                object2 = objZze2;
            }
            zzmkVarZzx.zzg(object2, object);
        }
    }

    private final void zzF(Object obj, Object obj2, int i10) {
        int i11 = this.zzc[i10];
        if (zzR(obj2, i11, i10)) {
            int iZzu = zzu(i10) & 1048575;
            Unsafe unsafe = zzb;
            long j10 = iZzu;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + obj2.toString());
            }
            zzmk zzmkVarZzx = zzx(i10);
            if (!zzR(obj, i11, i10)) {
                if (zzQ(object)) {
                    Object objZze = zzmkVarZzx.zze();
                    zzmkVarZzx.zzg(objZze, object);
                    unsafe.putObject(obj, j10, objZze);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                zzI(obj, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzQ(object2)) {
                Object objZze2 = zzmkVarZzx.zze();
                zzmkVarZzx.zzg(objZze2, object2);
                unsafe.putObject(obj, j10, objZze2);
                object2 = objZze2;
            }
            zzmkVarZzx.zzg(object2, object);
        }
    }

    private final void zzG(Object obj, int i10, zzmj zzmjVar) {
        zzni.zzs(obj, i10 & 1048575, zzM(i10) ? zzmjVar.zzs() : this.zzi ? zzmjVar.zzr() : zzmjVar.zzp());
    }

    private final void zzH(Object obj, int i10) {
        int iZzr = zzr(i10);
        long j10 = 1048575 & iZzr;
        if (j10 == 1048575) {
            return;
        }
        zzni.zzq(obj, j10, (1 << (iZzr >>> 20)) | zzni.zzc(obj, j10));
    }

    private final void zzI(Object obj, int i10, int i11) {
        zzni.zzq(obj, zzr(i11) & 1048575, i10);
    }

    private final void zzJ(Object obj, int i10, Object obj2) {
        zzb.putObject(obj, zzu(i10) & 1048575, obj2);
        zzH(obj, i10);
    }

    private final void zzK(Object obj, int i10, int i11, Object obj2) {
        zzb.putObject(obj, zzu(i11) & 1048575, obj2);
        zzI(obj, i10, i11);
    }

    private final boolean zzL(Object obj, Object obj2, int i10) {
        return zzN(obj, i10) == zzN(obj2, i10);
    }

    private static boolean zzM(int i10) {
        return (i10 & 536870912) != 0;
    }

    private final boolean zzN(Object obj, int i10) {
        int iZzr = zzr(i10);
        long j10 = iZzr & 1048575;
        if (j10 != 1048575) {
            return (zzni.zzc(obj, j10) & (1 << (iZzr >>> 20))) != 0;
        }
        int iZzu = zzu(i10);
        long j11 = iZzu & 1048575;
        switch (zzt(iZzu)) {
            case 0:
                return Double.doubleToRawLongBits(zzni.zza(obj, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzni.zzb(obj, j11)) != 0;
            case 2:
                return zzni.zzd(obj, j11) != 0;
            case 3:
                return zzni.zzd(obj, j11) != 0;
            case 4:
                return zzni.zzc(obj, j11) != 0;
            case 5:
                return zzni.zzd(obj, j11) != 0;
            case 6:
                return zzni.zzc(obj, j11) != 0;
            case 7:
                return zzni.zzw(obj, j11);
            case 8:
                Object objZzf = zzni.zzf(obj, j11);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zziv) {
                    return !zziv.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzni.zzf(obj, j11) != null;
            case 10:
                return !zziv.zzb.equals(zzni.zzf(obj, j11));
            case 11:
                return zzni.zzc(obj, j11) != 0;
            case 12:
                return zzni.zzc(obj, j11) != 0;
            case 13:
                return zzni.zzc(obj, j11) != 0;
            case 14:
                return zzni.zzd(obj, j11) != 0;
            case 15:
                return zzni.zzc(obj, j11) != 0;
            case 16:
                return zzni.zzd(obj, j11) != 0;
            case 17:
                return zzni.zzf(obj, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzO(Object obj, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? zzN(obj, i10) : (i12 & i13) != 0;
    }

    private static boolean zzP(Object obj, int i10, zzmk zzmkVar) {
        return zzmkVar.zzl(zzni.zzf(obj, i10 & 1048575));
    }

    private static boolean zzQ(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzks) {
            return ((zzks) obj).zzI();
        }
        return true;
    }

    private final boolean zzR(Object obj, int i10, int i11) {
        return zzni.zzc(obj, (long) (zzr(i11) & 1048575)) == i10;
    }

    private static boolean zzS(Object obj, long j10) {
        return ((Boolean) zzni.zzf(obj, j10)).booleanValue();
    }

    private static final void zzT(int i10, Object obj, zzno zznoVar) {
        if (obj instanceof String) {
            zznoVar.zzG(i10, (String) obj);
        } else {
            zznoVar.zzd(i10, (zziv) obj);
        }
    }

    static zznc zzd(Object obj) {
        zzks zzksVar = (zzks) obj;
        zznc zzncVar = zzksVar.zzc;
        if (zzncVar != zznc.zzc()) {
            return zzncVar;
        }
        zznc zzncVarZzf = zznc.zzf();
        zzksVar.zzc = zzncVarZzf;
        return zzncVarZzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0282  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static com.google.android.recaptcha.internal.zzma zzm(java.lang.Class r33, com.google.android.recaptcha.internal.zzlu r34, com.google.android.recaptcha.internal.zzmd r35, com.google.android.recaptcha.internal.zzlk r36, com.google.android.recaptcha.internal.zznb r37, com.google.android.recaptcha.internal.zzke r38, com.google.android.recaptcha.internal.zzls r39) {
        /*
            Method dump skipped, instruction units count: 1030
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzma.zzm(java.lang.Class, com.google.android.recaptcha.internal.zzlu, com.google.android.recaptcha.internal.zzmd, com.google.android.recaptcha.internal.zzlk, com.google.android.recaptcha.internal.zznb, com.google.android.recaptcha.internal.zzke, com.google.android.recaptcha.internal.zzls):com.google.android.recaptcha.internal.zzma");
    }

    private static double zzn(Object obj, long j10) {
        return ((Double) zzni.zzf(obj, j10)).doubleValue();
    }

    private static float zzo(Object obj, long j10) {
        return ((Float) zzni.zzf(obj, j10)).floatValue();
    }

    private static int zzp(Object obj, long j10) {
        return ((Integer) zzni.zzf(obj, j10)).intValue();
    }

    private final int zzq(int i10) {
        if (i10 < this.zze || i10 > this.zzf) {
            return -1;
        }
        return zzs(i10, 0);
    }

    private final int zzr(int i10) {
        return this.zzc[i10 + 2];
    }

    private final int zzs(int i10, int i11) {
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

    private static int zzt(int i10) {
        return (i10 >>> 20) & 255;
    }

    private final int zzu(int i10) {
        return this.zzc[i10 + 1];
    }

    private static long zzv(Object obj, long j10) {
        return ((Long) zzni.zzf(obj, j10)).longValue();
    }

    private final zzkw zzw(int i10) {
        int i11 = i10 / 3;
        return (zzkw) this.zzd[i11 + i11 + 1];
    }

    private final zzmk zzx(int i10) {
        Object[] objArr = this.zzd;
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        zzmk zzmkVar = (zzmk) objArr[i12];
        if (zzmkVar != null) {
            return zzmkVar;
        }
        zzmk zzmkVarZzb = zzmg.zza().zzb((Class) objArr[i12 + 1]);
        this.zzd[i12] = zzmkVarZzb;
        return zzmkVarZzb;
    }

    private final Object zzy(Object obj, int i10, Object obj2, zznb zznbVar, Object obj3) {
        int i11 = this.zzc[i10];
        Object objZzf = zzni.zzf(obj, zzu(i10) & 1048575);
        if (objZzf == null || zzw(i10) == null) {
            return obj2;
        }
        throw null;
    }

    private final Object zzz(int i10) {
        int i11 = i10 / 3;
        return this.zzd[i11 + i11];
    }

    /* JADX WARN: Code restructure failed: missing block: B:244:0x0503, code lost:
    
        if ((r1 instanceof com.google.android.recaptcha.internal.zziv) != false) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x0506, code lost:
    
        r0 = com.google.android.recaptcha.internal.zzjg.zzx(r0);
        r1 = com.google.android.recaptcha.internal.zzjg.zzw((java.lang.String) r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d0, code lost:
    
        if ((r1 instanceof com.google.android.recaptcha.internal.zziv) != false) goto L236;
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
    @Override // com.google.android.recaptcha.internal.zzmk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 1724
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzma.zza(java.lang.Object):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e2 A[PHI: r1 r2
  0x00e2: PHI (r1v14 int) = (r1v12 int), (r1v17 int) binds: [B:67:0x00e0, B:63:0x00cc] A[DONT_GENERATE, DONT_INLINE]
  0x00e2: PHI (r2v15 java.lang.Object) = (r2v12 java.lang.Object), (r2v16 java.lang.Object) binds: [B:67:0x00e0, B:63:0x00cc] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.recaptcha.internal.zzmk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzb(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 478
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzma.zzb(java.lang.Object):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0504, code lost:
    
        if (r1 == 0) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0506, code lost:
    
        r13.add(com.google.android.recaptcha.internal.zziv.zzb);
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x050c, code lost:
    
        r13.add(com.google.android.recaptcha.internal.zziv.zzk(r34, r0, r1));
        r0 = r0 + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0514, code lost:
    
        if (r0 >= r7) goto L650;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0516, code lost:
    
        r1 = com.google.android.recaptcha.internal.zzil.zzi(r34, r0, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x051c, code lost:
    
        if (r24 != r12.zza) goto L651;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x051e, code lost:
    
        r0 = com.google.android.recaptcha.internal.zzil.zzi(r34, r1, r12);
        r1 = r12.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0524, code lost:
    
        if (r1 < 0) goto L570;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0528, code lost:
    
        if (r1 > (r34.length - r0)) goto L571;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x052a, code lost:
    
        if (r1 != 0) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0531, code lost:
    
        throw com.google.android.recaptcha.internal.zzlc.zzi();
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0536, code lost:
    
        throw com.google.android.recaptcha.internal.zzlc.zzf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0537, code lost:
    
        r14 = r0;
        r8 = r12;
        r12 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x066b, code lost:
    
        if (r1.zzb != 0) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x066d, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x066f, code lost:
    
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x0671, code lost:
    
        r13.zze(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x0674, code lost:
    
        if (r8 >= r7) goto L665;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x0676, code lost:
    
        r9 = com.google.android.recaptcha.internal.zzil.zzi(r34, r8, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x067c, code lost:
    
        if (r2 != r1.zza) goto L666;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x067e, code lost:
    
        r8 = com.google.android.recaptcha.internal.zzil.zzl(r34, r9, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x0686, code lost:
    
        if (r1.zzb == 0) goto L286;
     */
    /* JADX WARN: Code restructure failed: missing block: B:529:0x0be8, code lost:
    
        if (r5 == r11) goto L531;
     */
    /* JADX WARN: Code restructure failed: missing block: B:530:0x0bea, code lost:
    
        r30.putInt(r7, r5, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:531:0x0bf0, code lost:
    
        r10 = r12.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:533:0x0bf5, code lost:
    
        if (r10 >= r12.zzl) goto L641;
     */
    /* JADX WARN: Code restructure failed: missing block: B:534:0x0bf7, code lost:
    
        zzy(r33, r12.zzj[r10], null, r12.zzm, r33);
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:536:0x0c0c, code lost:
    
        if (r9 != 0) goto L541;
     */
    /* JADX WARN: Code restructure failed: missing block: B:537:0x0c0e, code lost:
    
        if (r6 != r36) goto L539;
     */
    /* JADX WARN: Code restructure failed: missing block: B:540:0x0c15, code lost:
    
        throw com.google.android.recaptcha.internal.zzlc.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:541:0x0c16, code lost:
    
        if (r6 > r36) goto L544;
     */
    /* JADX WARN: Code restructure failed: missing block: B:542:0x0c18, code lost:
    
        if (r8 != r9) goto L544;
     */
    /* JADX WARN: Code restructure failed: missing block: B:543:0x0c1a, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:545:0x0c1f, code lost:
    
        throw com.google.android.recaptcha.internal.zzlc.zzg();
     */
    /* JADX WARN: Code restructure failed: missing block: B:546:0x0514, code lost:
    
        r13.add(com.google.android.recaptcha.internal.zziv.zzk(r34, r0, r1));
        r0 = r0 + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:549:0x0671, code lost:
    
        r9 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:230:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x05ee  */
    /* JADX WARN: Removed duplicated region for block: B:584:0x0867 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:587:0x0aac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:629:0x087b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:632:0x0ac1 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:203:0x052a -> B:194:0x0506). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:234:0x05b4 -> B:226:0x0593). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:254:0x05fe -> B:244:0x05d5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:292:0x0686 -> B:285:0x066d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final int zzc(java.lang.Object r33, byte[] r34, int r35, int r36, int r37, com.google.android.recaptcha.internal.zzik r38) throws com.google.android.recaptcha.internal.zzlc {
        /*
            Method dump skipped, instruction units count: 3288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzma.zzc(java.lang.Object, byte[], int, int, int, com.google.android.recaptcha.internal.zzik):int");
    }

    @Override // com.google.android.recaptcha.internal.zzmk
    public final Object zze() {
        return ((zzks) this.zzg).zzt();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006a  */
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
    @Override // com.google.android.recaptcha.internal.zzmk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzf(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzma.zzf(java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    @Override // com.google.android.recaptcha.internal.zzmk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzg(java.lang.Object r9, java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 454
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzma.zzg(java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:178:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0591 A[LOOP:2: B:185:0x058d->B:187:0x0591, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:221:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.recaptcha.internal.zzmk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzh(java.lang.Object r18, com.google.android.recaptcha.internal.zzmj r19, com.google.android.recaptcha.internal.zzkd r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1592
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzma.zzh(java.lang.Object, com.google.android.recaptcha.internal.zzmj, com.google.android.recaptcha.internal.zzkd):void");
    }

    @Override // com.google.android.recaptcha.internal.zzmk
    public final void zzi(Object obj, byte[] bArr, int i10, int i11, zzik zzikVar) throws zzlc {
        zzc(obj, bArr, i10, i11, 0, zzikVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0024  */
    @Override // com.google.android.recaptcha.internal.zzmk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzj(java.lang.Object r24, com.google.android.recaptcha.internal.zzno r25) throws com.google.android.recaptcha.internal.zzje {
        /*
            Method dump skipped, instruction units count: 1912
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzma.zzj(java.lang.Object, com.google.android.recaptcha.internal.zzno):void");
    }

    @Override // com.google.android.recaptcha.internal.zzmk
    public final boolean zzk(Object obj, Object obj2) {
        for (int i10 = 0; i10 < this.zzc.length; i10 += 3) {
            int iZzu = zzu(i10);
            long j10 = iZzu & 1048575;
            switch (zzt(iZzu)) {
                case 0:
                    if (!zzL(obj, obj2, i10) || Double.doubleToLongBits(zzni.zza(obj, j10)) != Double.doubleToLongBits(zzni.zza(obj2, j10))) {
                        return false;
                    }
                    break;
                    break;
                case 1:
                    if (!zzL(obj, obj2, i10) || Float.floatToIntBits(zzni.zzb(obj, j10)) != Float.floatToIntBits(zzni.zzb(obj2, j10))) {
                        return false;
                    }
                    break;
                    break;
                case 2:
                    if (!zzL(obj, obj2, i10) || zzni.zzd(obj, j10) != zzni.zzd(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 3:
                    if (!zzL(obj, obj2, i10) || zzni.zzd(obj, j10) != zzni.zzd(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 4:
                    if (!zzL(obj, obj2, i10) || zzni.zzc(obj, j10) != zzni.zzc(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 5:
                    if (!zzL(obj, obj2, i10) || zzni.zzd(obj, j10) != zzni.zzd(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 6:
                    if (!zzL(obj, obj2, i10) || zzni.zzc(obj, j10) != zzni.zzc(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 7:
                    if (!zzL(obj, obj2, i10) || zzni.zzw(obj, j10) != zzni.zzw(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 8:
                    if (!zzL(obj, obj2, i10) || !zzmm.zzH(zzni.zzf(obj, j10), zzni.zzf(obj2, j10))) {
                        return false;
                    }
                    break;
                    break;
                case 9:
                    if (!zzL(obj, obj2, i10) || !zzmm.zzH(zzni.zzf(obj, j10), zzni.zzf(obj2, j10))) {
                        return false;
                    }
                    break;
                    break;
                case 10:
                    if (!zzL(obj, obj2, i10) || !zzmm.zzH(zzni.zzf(obj, j10), zzni.zzf(obj2, j10))) {
                        return false;
                    }
                    break;
                    break;
                case 11:
                    if (!zzL(obj, obj2, i10) || zzni.zzc(obj, j10) != zzni.zzc(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 12:
                    if (!zzL(obj, obj2, i10) || zzni.zzc(obj, j10) != zzni.zzc(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 13:
                    if (!zzL(obj, obj2, i10) || zzni.zzc(obj, j10) != zzni.zzc(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 14:
                    if (!zzL(obj, obj2, i10) || zzni.zzd(obj, j10) != zzni.zzd(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 15:
                    if (!zzL(obj, obj2, i10) || zzni.zzc(obj, j10) != zzni.zzc(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 16:
                    if (!zzL(obj, obj2, i10) || zzni.zzd(obj, j10) != zzni.zzd(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 17:
                    if (!zzL(obj, obj2, i10) || !zzmm.zzH(zzni.zzf(obj, j10), zzni.zzf(obj2, j10))) {
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
                    if (!zzmm.zzH(zzni.zzf(obj, j10), zzni.zzf(obj2, j10))) {
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
                    long jZzr = zzr(i10) & 1048575;
                    if (zzni.zzc(obj, jZzr) != zzni.zzc(obj2, jZzr) || !zzmm.zzH(zzni.zzf(obj, j10), zzni.zzf(obj2, j10))) {
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
    @Override // com.google.android.recaptcha.internal.zzmk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzl(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzma.zzl(java.lang.Object):boolean");
    }
}
