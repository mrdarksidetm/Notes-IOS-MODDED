package com.google.android.gms.internal.auth;

import com.pichillilorenzo.flutter_inappwebview_android.R;
import java.lang.reflect.Field;
import java.util.Arrays;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
final class zzga<T> implements zzgi<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzhj.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzfx zzg;
    private final int[] zzh;
    private final int zzi;
    private final int zzj;
    private final zzfl zzk;
    private final zzgz zzl;
    private final zzem zzm;
    private final zzgc zzn;
    private final zzfs zzo;

    private zzga(int[] iArr, Object[] objArr, int i10, int i11, zzfx zzfxVar, int i12, boolean z10, int[] iArr2, int i13, int i14, zzgc zzgcVar, zzfl zzflVar, zzgz zzgzVar, zzem zzemVar, zzfs zzfsVar) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i10;
        this.zzf = i11;
        this.zzh = iArr2;
        this.zzi = i13;
        this.zzj = i14;
        this.zzn = zzgcVar;
        this.zzk = zzflVar;
        this.zzl = zzgzVar;
        this.zzm = zzemVar;
        this.zzg = zzfxVar;
        this.zzo = zzfsVar;
    }

    private final void zzA(Object obj, int i10, int i11) {
        zzhj.zzn(obj, zzl(i11) & 1048575, i10);
    }

    private final void zzB(Object obj, int i10, Object obj2) {
        zzb.putObject(obj, zzo(i10) & 1048575, obj2);
        zzz(obj, i10);
    }

    private final void zzC(Object obj, int i10, int i11, Object obj2) {
        zzb.putObject(obj, zzo(i11) & 1048575, obj2);
        zzA(obj, i10, i11);
    }

    private final boolean zzD(Object obj, Object obj2, int i10) {
        return zzE(obj, i10) == zzE(obj2, i10);
    }

    private final boolean zzE(Object obj, int i10) {
        int iZzl = zzl(i10);
        long j10 = iZzl & 1048575;
        if (j10 != 1048575) {
            return (zzhj.zzc(obj, j10) & (1 << (iZzl >>> 20))) != 0;
        }
        int iZzo = zzo(i10);
        long j11 = iZzo & 1048575;
        switch (zzn(iZzo)) {
            case 0:
                return Double.doubleToRawLongBits(zzhj.zza(obj, j11)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzhj.zzb(obj, j11)) != 0;
            case 2:
                return zzhj.zzd(obj, j11) != 0;
            case 3:
                return zzhj.zzd(obj, j11) != 0;
            case 4:
                return zzhj.zzc(obj, j11) != 0;
            case 5:
                return zzhj.zzd(obj, j11) != 0;
            case 6:
                return zzhj.zzc(obj, j11) != 0;
            case 7:
                return zzhj.zzt(obj, j11);
            case 8:
                Object objZzf = zzhj.zzf(obj, j11);
                if (objZzf instanceof String) {
                    return !((String) objZzf).isEmpty();
                }
                if (objZzf instanceof zzef) {
                    return !zzef.zzb.equals(objZzf);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzhj.zzf(obj, j11) != null;
            case 10:
                return !zzef.zzb.equals(zzhj.zzf(obj, j11));
            case 11:
                return zzhj.zzc(obj, j11) != 0;
            case 12:
                return zzhj.zzc(obj, j11) != 0;
            case 13:
                return zzhj.zzc(obj, j11) != 0;
            case 14:
                return zzhj.zzd(obj, j11) != 0;
            case 15:
                return zzhj.zzc(obj, j11) != 0;
            case 16:
                return zzhj.zzd(obj, j11) != 0;
            case 17:
                return zzhj.zzf(obj, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzF(Object obj, int i10, int i11, int i12, int i13) {
        return i11 == 1048575 ? zzE(obj, i10) : (i12 & i13) != 0;
    }

    private static boolean zzG(Object obj, int i10, zzgi zzgiVar) {
        return zzgiVar.zzi(zzhj.zzf(obj, i10 & 1048575));
    }

    private static boolean zzH(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof zzev) {
            return ((zzev) obj).zzm();
        }
        return true;
    }

    private final boolean zzI(Object obj, int i10, int i11) {
        return zzhj.zzc(obj, (long) (zzl(i11) & 1048575)) == i10;
    }

    static zzha zzc(Object obj) {
        zzev zzevVar = (zzev) obj;
        zzha zzhaVar = zzevVar.zzc;
        if (zzhaVar != zzha.zza()) {
            return zzhaVar;
        }
        zzha zzhaVarZzd = zzha.zzd();
        zzevVar.zzc = zzhaVarZzd;
        return zzhaVarZzd;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x026d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static com.google.android.gms.internal.auth.zzga zzj(java.lang.Class r30, com.google.android.gms.internal.auth.zzfu r31, com.google.android.gms.internal.auth.zzgc r32, com.google.android.gms.internal.auth.zzfl r33, com.google.android.gms.internal.auth.zzgz r34, com.google.android.gms.internal.auth.zzem r35, com.google.android.gms.internal.auth.zzfs r36) {
        /*
            Method dump skipped, instruction units count: 1005
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzga.zzj(java.lang.Class, com.google.android.gms.internal.auth.zzfu, com.google.android.gms.internal.auth.zzgc, com.google.android.gms.internal.auth.zzfl, com.google.android.gms.internal.auth.zzgz, com.google.android.gms.internal.auth.zzem, com.google.android.gms.internal.auth.zzfs):com.google.android.gms.internal.auth.zzga");
    }

    private static int zzk(Object obj, long j10) {
        return ((Integer) zzhj.zzf(obj, j10)).intValue();
    }

    private final int zzl(int i10) {
        return this.zzc[i10 + 2];
    }

    private final int zzm(int i10, int i11) {
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

    private static int zzn(int i10) {
        return (i10 >>> 20) & 255;
    }

    private final int zzo(int i10) {
        return this.zzc[i10 + 1];
    }

    private static long zzp(Object obj, long j10) {
        return ((Long) zzhj.zzf(obj, j10)).longValue();
    }

    private final zzey zzq(int i10) {
        int i11 = i10 / 3;
        return (zzey) this.zzd[i11 + i11 + 1];
    }

    private final zzgi zzr(int i10) {
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        zzgi zzgiVar = (zzgi) this.zzd[i12];
        if (zzgiVar != null) {
            return zzgiVar;
        }
        zzgi zzgiVarZzb = zzgf.zza().zzb((Class) this.zzd[i12 + 1]);
        this.zzd[i12] = zzgiVarZzb;
        return zzgiVarZzb;
    }

    private final Object zzs(int i10) {
        int i11 = i10 / 3;
        return this.zzd[i11 + i11];
    }

    private final Object zzt(Object obj, int i10) {
        zzgi zzgiVarZzr = zzr(i10);
        int iZzo = zzo(i10) & 1048575;
        if (!zzE(obj, i10)) {
            return zzgiVarZzr.zzd();
        }
        Object object = zzb.getObject(obj, iZzo);
        if (zzH(object)) {
            return object;
        }
        Object objZzd = zzgiVarZzr.zzd();
        if (object != null) {
            zzgiVarZzr.zzf(objZzd, object);
        }
        return objZzd;
    }

    private final Object zzu(Object obj, int i10, int i11) {
        zzgi zzgiVarZzr = zzr(i11);
        if (!zzI(obj, i10, i11)) {
            return zzgiVarZzr.zzd();
        }
        Object object = zzb.getObject(obj, zzo(i11) & 1048575);
        if (zzH(object)) {
            return object;
        }
        Object objZzd = zzgiVarZzr.zzd();
        if (object != null) {
            zzgiVarZzr.zzf(objZzd, object);
        }
        return objZzd;
    }

    private static Field zzv(Class cls, String str) {
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

    private static void zzw(Object obj) {
        if (!zzH(obj)) {
            throw new IllegalArgumentException("Mutating immutable message: ".concat(String.valueOf(obj)));
        }
    }

    private final void zzx(Object obj, Object obj2, int i10) {
        if (zzE(obj2, i10)) {
            int iZzo = zzo(i10) & 1048575;
            Unsafe unsafe = zzb;
            long j10 = iZzo;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + obj2.toString());
            }
            zzgi zzgiVarZzr = zzr(i10);
            if (!zzE(obj, i10)) {
                if (zzH(object)) {
                    Object objZzd = zzgiVarZzr.zzd();
                    zzgiVarZzr.zzf(objZzd, object);
                    unsafe.putObject(obj, j10, objZzd);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                zzz(obj, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzH(object2)) {
                Object objZzd2 = zzgiVarZzr.zzd();
                zzgiVarZzr.zzf(objZzd2, object2);
                unsafe.putObject(obj, j10, objZzd2);
                object2 = objZzd2;
            }
            zzgiVarZzr.zzf(object2, object);
        }
    }

    private final void zzy(Object obj, Object obj2, int i10) {
        int i11 = this.zzc[i10];
        if (zzI(obj2, i11, i10)) {
            int iZzo = zzo(i10) & 1048575;
            Unsafe unsafe = zzb;
            long j10 = iZzo;
            Object object = unsafe.getObject(obj2, j10);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.zzc[i10] + " is present but null: " + obj2.toString());
            }
            zzgi zzgiVarZzr = zzr(i10);
            if (!zzI(obj, i11, i10)) {
                if (zzH(object)) {
                    Object objZzd = zzgiVarZzr.zzd();
                    zzgiVarZzr.zzf(objZzd, object);
                    unsafe.putObject(obj, j10, objZzd);
                } else {
                    unsafe.putObject(obj, j10, object);
                }
                zzA(obj, i11, i10);
                return;
            }
            Object object2 = unsafe.getObject(obj, j10);
            if (!zzH(object2)) {
                Object objZzd2 = zzgiVarZzr.zzd();
                zzgiVarZzr.zzf(objZzd2, object2);
                unsafe.putObject(obj, j10, objZzd2);
                object2 = objZzd2;
            }
            zzgiVarZzr.zzf(object2, object);
        }
    }

    private final void zzz(Object obj, int i10) {
        int iZzl = zzl(i10);
        long j10 = 1048575 & iZzl;
        if (j10 == 1048575) {
            return;
        }
        zzhj.zzn(obj, j10, (1 << (iZzl >>> 20)) | zzhj.zzc(obj, j10));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f5 A[PHI: r3
  0x00f5: PHI (r3v12 java.lang.Object) = (r3v10 java.lang.Object), (r3v13 java.lang.Object) binds: [B:67:0x00f3, B:62:0x00e1] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.auth.zzgi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 480
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzga.zza(java.lang.Object):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:256:0x0609, code lost:
    
        if (r1 == 0) goto L257;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x060b, code lost:
    
        r12.add(com.google.android.gms.internal.auth.zzef.zzb);
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0611, code lost:
    
        r12.add(com.google.android.gms.internal.auth.zzef.zzk(r38, r0, r1));
        r0 = r0 + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0619, code lost:
    
        if (r0 >= r11) goto L685;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x061b, code lost:
    
        r1 = com.google.android.gms.internal.auth.zzdu.zzh(r38, r0, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x0621, code lost:
    
        if (r14 != r9.zza) goto L686;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x0623, code lost:
    
        r0 = com.google.android.gms.internal.auth.zzdu.zzh(r38, r1, r9);
        r1 = r9.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x0629, code lost:
    
        if (r1 < 0) goto L598;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x062d, code lost:
    
        if (r1 > (r38.length - r0)) goto L599;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x062f, code lost:
    
        if (r1 != 0) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0636, code lost:
    
        throw com.google.android.gms.internal.auth.zzfb.zzf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x063b, code lost:
    
        throw com.google.android.gms.internal.auth.zzfb.zzc();
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x063c, code lost:
    
        r1 = r0;
        r12 = r5;
        r7 = r13;
        r0 = r36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x0781, code lost:
    
        if (r5.zzb != 0) goto L349;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x0783, code lost:
    
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x0785, code lost:
    
        r8 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x0787, code lost:
    
        r12.zze(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x078a, code lost:
    
        if (r2 >= r40) goto L700;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x078c, code lost:
    
        r8 = com.google.android.gms.internal.auth.zzdu.zzh(r38, r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x0792, code lost:
    
        if (r14 != r5.zza) goto L701;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x0794, code lost:
    
        r2 = com.google.android.gms.internal.auth.zzdu.zzk(r38, r8, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x079c, code lost:
    
        if (r5.zzb == 0) goto L350;
     */
    /* JADX WARN: Code restructure failed: missing block: B:574:0x0619, code lost:
    
        r12.add(com.google.android.gms.internal.auth.zzef.zzk(r38, r0, r1));
        r0 = r0 + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:577:0x0787, code lost:
    
        r8 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x06ba  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0704  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x097f  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x0990  */
    /* JADX WARN: Removed duplicated region for block: B:614:0x0c2f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:616:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:655:0x0c43 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0215  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:266:0x062f -> B:257:0x060b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:299:0x06ca -> B:291:0x06a9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:319:0x0714 -> B:309:0x06eb). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:356:0x079c -> B:349:0x0783). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final int zzb(java.lang.Object r37, byte[] r38, int r39, int r40, int r41, com.google.android.gms.internal.auth.zzdt r42) throws com.google.android.gms.internal.auth.zzfb {
        /*
            Method dump skipped, instruction units count: 3420
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzga.zzb(java.lang.Object, byte[], int, int, int, com.google.android.gms.internal.auth.zzdt):int");
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final Object zzd() {
        return ((zzev) this.zzg).zzc();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0065  */
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
    @Override // com.google.android.gms.internal.auth.zzgi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zze(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = zzH(r8)
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = r8 instanceof com.google.android.gms.internal.auth.zzev
            r1 = 0
            if (r0 == 0) goto L1a
            r0 = r8
            com.google.android.gms.internal.auth.zzev r0 = (com.google.android.gms.internal.auth.zzev) r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0.zzl(r2)
            r0.zza = r1
            r0.zzj()
        L1a:
            int[] r0 = r7.zzc
            int r0 = r0.length
        L1d:
            if (r1 >= r0) goto L75
            int r2 = r7.zzo(r1)
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r2
            int r2 = zzn(r2)
            long r3 = (long) r3
            r5 = 9
            if (r2 == r5) goto L5f
            r5 = 60
            if (r2 == r5) goto L54
            r5 = 68
            if (r2 == r5) goto L54
            switch(r2) {
                case 17: goto L5f;
                case 18: goto L4e;
                case 19: goto L4e;
                case 20: goto L4e;
                case 21: goto L4e;
                case 22: goto L4e;
                case 23: goto L4e;
                case 24: goto L4e;
                case 25: goto L4e;
                case 26: goto L4e;
                case 27: goto L4e;
                case 28: goto L4e;
                case 29: goto L4e;
                case 30: goto L4e;
                case 31: goto L4e;
                case 32: goto L4e;
                case 33: goto L4e;
                case 34: goto L4e;
                case 35: goto L4e;
                case 36: goto L4e;
                case 37: goto L4e;
                case 38: goto L4e;
                case 39: goto L4e;
                case 40: goto L4e;
                case 41: goto L4e;
                case 42: goto L4e;
                case 43: goto L4e;
                case 44: goto L4e;
                case 45: goto L4e;
                case 46: goto L4e;
                case 47: goto L4e;
                case 48: goto L4e;
                case 49: goto L4e;
                case 50: goto L3c;
                default: goto L3b;
            }
        L3b:
            goto L72
        L3c:
            sun.misc.Unsafe r2 = com.google.android.gms.internal.auth.zzga.zzb
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L72
            r6 = r5
            com.google.android.gms.internal.auth.zzfr r6 = (com.google.android.gms.internal.auth.zzfr) r6
            r6.zzc()
            r2.putObject(r8, r3, r5)
            goto L72
        L4e:
            com.google.android.gms.internal.auth.zzfl r2 = r7.zzk
            r2.zza(r8, r3)
            goto L72
        L54:
            int[] r2 = r7.zzc
            r2 = r2[r1]
            boolean r2 = r7.zzI(r8, r2, r1)
            if (r2 == 0) goto L72
            goto L65
        L5f:
            boolean r2 = r7.zzE(r8, r1)
            if (r2 == 0) goto L72
        L65:
            com.google.android.gms.internal.auth.zzgi r2 = r7.zzr(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.auth.zzga.zzb
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zze(r3)
        L72:
            int r1 = r1 + 3
            goto L1d
        L75:
            com.google.android.gms.internal.auth.zzgz r0 = r7.zzl
            r0.zze(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzga.zze(java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    @Override // com.google.android.gms.internal.auth.zzgi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzf(java.lang.Object r7, java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzga.zzf(java.lang.Object, java.lang.Object):void");
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final void zzg(Object obj, byte[] bArr, int i10, int i11, zzdt zzdtVar) throws zzfb {
        zzb(obj, bArr, i10, i11, 0, zzdtVar);
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final boolean zzh(Object obj, Object obj2) {
        int length = this.zzc.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int iZzo = zzo(i10);
            long j10 = iZzo & 1048575;
            switch (zzn(iZzo)) {
                case 0:
                    if (!zzD(obj, obj2, i10) || Double.doubleToLongBits(zzhj.zza(obj, j10)) != Double.doubleToLongBits(zzhj.zza(obj2, j10))) {
                        return false;
                    }
                    break;
                    break;
                case 1:
                    if (!zzD(obj, obj2, i10) || Float.floatToIntBits(zzhj.zzb(obj, j10)) != Float.floatToIntBits(zzhj.zzb(obj2, j10))) {
                        return false;
                    }
                    break;
                    break;
                case 2:
                    if (!zzD(obj, obj2, i10) || zzhj.zzd(obj, j10) != zzhj.zzd(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 3:
                    if (!zzD(obj, obj2, i10) || zzhj.zzd(obj, j10) != zzhj.zzd(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 4:
                    if (!zzD(obj, obj2, i10) || zzhj.zzc(obj, j10) != zzhj.zzc(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 5:
                    if (!zzD(obj, obj2, i10) || zzhj.zzd(obj, j10) != zzhj.zzd(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 6:
                    if (!zzD(obj, obj2, i10) || zzhj.zzc(obj, j10) != zzhj.zzc(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 7:
                    if (!zzD(obj, obj2, i10) || zzhj.zzt(obj, j10) != zzhj.zzt(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 8:
                    if (!zzD(obj, obj2, i10) || !zzgk.zzf(zzhj.zzf(obj, j10), zzhj.zzf(obj2, j10))) {
                        return false;
                    }
                    break;
                    break;
                case 9:
                    if (!zzD(obj, obj2, i10) || !zzgk.zzf(zzhj.zzf(obj, j10), zzhj.zzf(obj2, j10))) {
                        return false;
                    }
                    break;
                    break;
                case 10:
                    if (!zzD(obj, obj2, i10) || !zzgk.zzf(zzhj.zzf(obj, j10), zzhj.zzf(obj2, j10))) {
                        return false;
                    }
                    break;
                    break;
                case 11:
                    if (!zzD(obj, obj2, i10) || zzhj.zzc(obj, j10) != zzhj.zzc(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 12:
                    if (!zzD(obj, obj2, i10) || zzhj.zzc(obj, j10) != zzhj.zzc(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 13:
                    if (!zzD(obj, obj2, i10) || zzhj.zzc(obj, j10) != zzhj.zzc(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 14:
                    if (!zzD(obj, obj2, i10) || zzhj.zzd(obj, j10) != zzhj.zzd(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 15:
                    if (!zzD(obj, obj2, i10) || zzhj.zzc(obj, j10) != zzhj.zzc(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 16:
                    if (!zzD(obj, obj2, i10) || zzhj.zzd(obj, j10) != zzhj.zzd(obj2, j10)) {
                        return false;
                    }
                    break;
                    break;
                case 17:
                    if (!zzD(obj, obj2, i10) || !zzgk.zzf(zzhj.zzf(obj, j10), zzhj.zzf(obj2, j10))) {
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
                    if (!zzgk.zzf(zzhj.zzf(obj, j10), zzhj.zzf(obj2, j10))) {
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
                    long jZzl = zzl(i10) & 1048575;
                    if (zzhj.zzc(obj, jZzl) != zzhj.zzc(obj2, jZzl) || !zzgk.zzf(zzhj.zzf(obj, j10), zzhj.zzf(obj2, j10))) {
                        return false;
                    }
                    break;
                    break;
            }
        }
        return this.zzl.zzb(obj).equals(this.zzl.zzb(obj2));
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x009b  */
    @Override // com.google.android.gms.internal.auth.zzgi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzi(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzga.zzi(java.lang.Object):boolean");
    }
}
