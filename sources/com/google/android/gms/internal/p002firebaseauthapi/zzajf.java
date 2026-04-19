package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.a;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class zzajf implements zzals {
    private final zzajb zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzajf(zzajb zzajbVar) {
        zzajb zzajbVar2 = (zzajb) zzakb.zza(zzajbVar, "input");
        this.zza = zzajbVar2;
        zzajbVar2.zzd = this;
    }

    public static zzajf zza(zzajb zzajbVar) {
        zzajf zzajfVar = zzajbVar.zzd;
        return zzajfVar != null ? zzajfVar : new zzajf(zzajbVar);
    }

    private final <T> T zza(zzalv<T> zzalvVar, zzajk zzajkVar) {
        T tZza = zzalvVar.zza();
        zzc(tZza, zzalvVar, zzajkVar);
        zzalvVar.zzd(tZza);
        return tZza;
    }

    private final Object zza(zzamw zzamwVar, Class<?> cls, zzajk zzajkVar) throws zzake {
        switch (zzaje.zza[zzamwVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(zzs());
            case 2:
                return zzp();
            case 3:
                return Double.valueOf(zza());
            case 4:
                return Integer.valueOf(zze());
            case 5:
                return Integer.valueOf(zzf());
            case 6:
                return Long.valueOf(zzk());
            case 7:
                return Float.valueOf(zzb());
            case 8:
                return Integer.valueOf(zzg());
            case 9:
                return Long.valueOf(zzl());
            case 10:
                zzb(2);
                return zzb(zzalr.zza().zza((Class) cls), zzajkVar);
            case 11:
                return Integer.valueOf(zzh());
            case 12:
                return Long.valueOf(zzm());
            case 13:
                return Integer.valueOf(zzi());
            case 14:
                return Long.valueOf(zzn());
            case 15:
                return zzr();
            case 16:
                return Integer.valueOf(zzj());
            case 17:
                return Long.valueOf(zzo());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    private final void zza(int i10) throws zzakf {
        if (this.zza.zzc() != i10) {
            throw zzakf.zzj();
        }
    }

    private final void zza(List<String> list, boolean z10) throws zzake {
        int iZzi;
        int iZzi2;
        if ((this.zzb & 7) != 2) {
            throw zzakf.zza();
        }
        if (!(list instanceof zzakn) || z10) {
            do {
                list.add(z10 ? zzr() : zzq());
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        zzakn zzaknVar = (zzakn) list;
        do {
            zzaknVar.zza(zzp());
            if (this.zza.zzt()) {
                return;
            } else {
                iZzi2 = this.zza.zzi();
            }
        } while (iZzi2 == this.zzb);
        this.zzd = iZzi2;
    }

    private final <T> T zzb(zzalv<T> zzalvVar, zzajk zzajkVar) throws zzakf {
        T tZza = zzalvVar.zza();
        zzd(tZza, zzalvVar, zzajkVar);
        zzalvVar.zzd(tZza);
        return tZza;
    }

    private final void zzb(int i10) throws zzake {
        if ((this.zzb & 7) != i10) {
            throw zzakf.zza();
        }
    }

    private static void zzc(int i10) throws zzakf {
        if ((i10 & 3) != 0) {
            throw zzakf.zzg();
        }
    }

    private final <T> void zzc(T t10, zzalv<T> zzalvVar, zzajk zzajkVar) {
        int i10 = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            zzalvVar.zza(t10, this, zzajkVar);
            if (this.zzb == this.zzc) {
            } else {
                throw zzakf.zzg();
            }
        } finally {
            this.zzc = i10;
        }
    }

    private static void zzd(int i10) throws zzakf {
        if ((i10 & 7) != 0) {
            throw zzakf.zzg();
        }
    }

    private final <T> void zzd(T t10, zzalv<T> zzalvVar, zzajk zzajkVar) throws zzakf {
        int iZzj = this.zza.zzj();
        zzajb zzajbVar = this.zza;
        if (zzajbVar.zza >= zzajbVar.zzb) {
            throw zzakf.zzh();
        }
        int iZza = zzajbVar.zza(iZzj);
        this.zza.zza++;
        zzalvVar.zza(t10, this, zzajkVar);
        this.zza.zzb(0);
        r5.zza--;
        this.zza.zzc(iZza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final double zza() throws zzake {
        zzb(1);
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final <T> void zza(T t10, zzalv<T> zzalvVar, zzajk zzajkVar) throws zzake {
        zzb(3);
        zzc(t10, zzalvVar, zzajkVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final void zza(List<Boolean> list) throws zzakf {
        int iZzi;
        int iZzi2;
        if (!(list instanceof zzain)) {
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    list.add(Boolean.valueOf(this.zza.zzu()));
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi = this.zza.zzi();
                    }
                } while (iZzi == this.zzb);
                this.zzd = iZzi;
                return;
            }
            if (i10 != 2) {
                throw zzakf.zza();
            }
            int iZzc = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Boolean.valueOf(this.zza.zzu()));
            } while (this.zza.zzc() < iZzc);
            zza(iZzc);
            return;
        }
        zzain zzainVar = (zzain) list;
        int i11 = this.zzb & 7;
        if (i11 == 0) {
            do {
                zzainVar.zza(this.zza.zzu());
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi2 = this.zza.zzi();
                }
            } while (iZzi2 == this.zzb);
            this.zzd = iZzi2;
            return;
        }
        if (i11 != 2) {
            throw zzakf.zza();
        }
        int iZzc2 = this.zza.zzc() + this.zza.zzj();
        do {
            zzainVar.zza(this.zza.zzu());
        } while (this.zza.zzc() < iZzc2);
        zza(iZzc2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    @Deprecated
    public final <T> void zza(List<T> list, zzalv<T> zzalvVar, zzajk zzajkVar) throws zzake {
        int iZzi;
        int i10 = this.zzb;
        if ((i10 & 7) != 3) {
            throw zzakf.zza();
        }
        do {
            list.add(zza(zzalvVar, zzajkVar));
            if (this.zza.zzt() || this.zzd != 0) {
                return;
            } else {
                iZzi = this.zza.zzi();
            }
        } while (iZzi == i10);
        this.zzd = iZzi;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
    
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <K, V> void zza(java.util.Map<K, V> r8, com.google.android.gms.internal.p002firebaseauthapi.zzakx<K, V> r9, com.google.android.gms.internal.p002firebaseauthapi.zzajk r10) throws com.google.android.gms.internal.p002firebaseauthapi.zzake {
        /*
            r7 = this;
            r0 = 2
            r7.zzb(r0)
            com.google.android.gms.internal.firebase-auth-api.zzajb r1 = r7.zza
            int r1 = r1.zzj()
            com.google.android.gms.internal.firebase-auth-api.zzajb r2 = r7.zza
            int r1 = r2.zza(r1)
            K r2 = r9.zzb
            V r3 = r9.zzd
        L14:
            int r4 = r7.zzc()     // Catch: java.lang.Throwable -> L64
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5b
            com.google.android.gms.internal.firebase-auth-api.zzajb r5 = r7.zza     // Catch: java.lang.Throwable -> L64
            boolean r5 = r5.zzt()     // Catch: java.lang.Throwable -> L64
            if (r5 != 0) goto L5b
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L46
            if (r4 == r0) goto L39
            boolean r4 = r7.zzt()     // Catch: com.google.android.gms.internal.p002firebaseauthapi.zzake -> L4e java.lang.Throwable -> L64
            if (r4 == 0) goto L33
            goto L14
        L33:
            com.google.android.gms.internal.firebase-auth-api.zzakf r4 = new com.google.android.gms.internal.firebase-auth-api.zzakf     // Catch: com.google.android.gms.internal.p002firebaseauthapi.zzake -> L4e java.lang.Throwable -> L64
            r4.<init>(r6)     // Catch: com.google.android.gms.internal.p002firebaseauthapi.zzake -> L4e java.lang.Throwable -> L64
            throw r4     // Catch: com.google.android.gms.internal.p002firebaseauthapi.zzake -> L4e java.lang.Throwable -> L64
        L39:
            com.google.android.gms.internal.firebase-auth-api.zzamw r4 = r9.zzc     // Catch: com.google.android.gms.internal.p002firebaseauthapi.zzake -> L4e java.lang.Throwable -> L64
            V r5 = r9.zzd     // Catch: com.google.android.gms.internal.p002firebaseauthapi.zzake -> L4e java.lang.Throwable -> L64
            java.lang.Class r5 = r5.getClass()     // Catch: com.google.android.gms.internal.p002firebaseauthapi.zzake -> L4e java.lang.Throwable -> L64
            java.lang.Object r3 = r7.zza(r4, r5, r10)     // Catch: com.google.android.gms.internal.p002firebaseauthapi.zzake -> L4e java.lang.Throwable -> L64
            goto L14
        L46:
            com.google.android.gms.internal.firebase-auth-api.zzamw r4 = r9.zza     // Catch: com.google.android.gms.internal.p002firebaseauthapi.zzake -> L4e java.lang.Throwable -> L64
            r5 = 0
            java.lang.Object r2 = r7.zza(r4, r5, r5)     // Catch: com.google.android.gms.internal.p002firebaseauthapi.zzake -> L4e java.lang.Throwable -> L64
            goto L14
        L4e:
            boolean r4 = r7.zzt()     // Catch: java.lang.Throwable -> L64
            if (r4 == 0) goto L55
            goto L14
        L55:
            com.google.android.gms.internal.firebase-auth-api.zzakf r8 = new com.google.android.gms.internal.firebase-auth-api.zzakf     // Catch: java.lang.Throwable -> L64
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L64
            throw r8     // Catch: java.lang.Throwable -> L64
        L5b:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L64
            com.google.android.gms.internal.firebase-auth-api.zzajb r8 = r7.zza
            r8.zzc(r1)
            return
        L64:
            r8 = move-exception
            com.google.android.gms.internal.firebase-auth-api.zzajb r9 = r7.zza
            r9.zzc(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002firebaseauthapi.zzajf.zza(java.util.Map, com.google.android.gms.internal.firebase-auth-api.zzakx, com.google.android.gms.internal.firebase-auth-api.zzajk):void");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final float zzb() throws zzake {
        zzb(5);
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final <T> void zzb(T t10, zzalv<T> zzalvVar, zzajk zzajkVar) throws zzakf {
        zzb(2);
        zzd(t10, zzalvVar, zzajkVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final void zzb(List<zzaip> list) throws zzake {
        int iZzi;
        if ((this.zzb & 7) != 2) {
            throw zzakf.zza();
        }
        do {
            list.add(zzp());
            if (this.zza.zzt()) {
                return;
            } else {
                iZzi = this.zza.zzi();
            }
        } while (iZzi == this.zzb);
        this.zzd = iZzi;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final <T> void zzb(List<T> list, zzalv<T> zzalvVar, zzajk zzajkVar) throws zzake {
        int iZzi;
        int i10 = this.zzb;
        if ((i10 & 7) != 2) {
            throw zzakf.zza();
        }
        do {
            list.add(zzb(zzalvVar, zzajkVar));
            if (this.zza.zzt() || this.zzd != 0) {
                return;
            } else {
                iZzi = this.zza.zzi();
            }
        } while (iZzi == i10);
        this.zzd = iZzi;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final int zzc() {
        int i10 = this.zzd;
        if (i10 != 0) {
            this.zzb = i10;
            this.zzd = 0;
        } else {
            this.zzb = this.zza.zzi();
        }
        int i11 = this.zzb;
        return (i11 == 0 || i11 == this.zzc) ? a.e.API_PRIORITY_OTHER : i11 >>> 3;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final void zzc(List<Double> list) throws zzakf {
        int iZzi;
        int iZzi2;
        if (!(list instanceof zzaji)) {
            int i10 = this.zzb & 7;
            if (i10 == 1) {
                do {
                    list.add(Double.valueOf(this.zza.zza()));
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi = this.zza.zzi();
                    }
                } while (iZzi == this.zzb);
                this.zzd = iZzi;
                return;
            }
            if (i10 != 2) {
                throw zzakf.zza();
            }
            int iZzj = this.zza.zzj();
            zzd(iZzj);
            int iZzc = this.zza.zzc() + iZzj;
            do {
                list.add(Double.valueOf(this.zza.zza()));
            } while (this.zza.zzc() < iZzc);
            return;
        }
        zzaji zzajiVar = (zzaji) list;
        int i11 = this.zzb & 7;
        if (i11 == 1) {
            do {
                zzajiVar.zza(this.zza.zza());
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi2 = this.zza.zzi();
                }
            } while (iZzi2 == this.zzb);
            this.zzd = iZzi2;
            return;
        }
        if (i11 != 2) {
            throw zzakf.zza();
        }
        int iZzj2 = this.zza.zzj();
        zzd(iZzj2);
        int iZzc2 = this.zza.zzc() + iZzj2;
        do {
            zzajiVar.zza(this.zza.zza());
        } while (this.zza.zzc() < iZzc2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final void zzd(List<Integer> list) throws zzakf {
        int iZzi;
        int iZzi2;
        if (!(list instanceof zzajz)) {
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzd()));
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi = this.zza.zzi();
                    }
                } while (iZzi == this.zzb);
                this.zzd = iZzi;
                return;
            }
            if (i10 != 2) {
                throw zzakf.zza();
            }
            int iZzc = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Integer.valueOf(this.zza.zzd()));
            } while (this.zza.zzc() < iZzc);
            zza(iZzc);
            return;
        }
        zzajz zzajzVar = (zzajz) list;
        int i11 = this.zzb & 7;
        if (i11 == 0) {
            do {
                zzajzVar.zzc(this.zza.zzd());
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi2 = this.zza.zzi();
                }
            } while (iZzi2 == this.zzb);
            this.zzd = iZzi2;
            return;
        }
        if (i11 != 2) {
            throw zzakf.zza();
        }
        int iZzc2 = this.zza.zzc() + this.zza.zzj();
        do {
            zzajzVar.zzc(this.zza.zzd());
        } while (this.zza.zzc() < iZzc2);
        zza(iZzc2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final int zze() throws zzake {
        zzb(0);
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final void zze(List<Integer> list) throws zzakf {
        int iZzi;
        int iZzi2;
        if (!(list instanceof zzajz)) {
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                int iZzj = this.zza.zzj();
                zzc(iZzj);
                int iZzc = this.zza.zzc() + iZzj;
                do {
                    list.add(Integer.valueOf(this.zza.zze()));
                } while (this.zza.zzc() < iZzc);
                return;
            }
            if (i10 != 5) {
                throw zzakf.zza();
            }
            do {
                list.add(Integer.valueOf(this.zza.zze()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        zzajz zzajzVar = (zzajz) list;
        int i11 = this.zzb & 7;
        if (i11 == 2) {
            int iZzj2 = this.zza.zzj();
            zzc(iZzj2);
            int iZzc2 = this.zza.zzc() + iZzj2;
            do {
                zzajzVar.zzc(this.zza.zze());
            } while (this.zza.zzc() < iZzc2);
            return;
        }
        if (i11 != 5) {
            throw zzakf.zza();
        }
        do {
            zzajzVar.zzc(this.zza.zze());
            if (this.zza.zzt()) {
                return;
            } else {
                iZzi2 = this.zza.zzi();
            }
        } while (iZzi2 == this.zzb);
        this.zzd = iZzi2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final int zzf() throws zzake {
        zzb(5);
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final void zzf(List<Long> list) throws zzakf {
        int iZzi;
        int iZzi2;
        if (!(list instanceof zzakr)) {
            int i10 = this.zzb & 7;
            if (i10 == 1) {
                do {
                    list.add(Long.valueOf(this.zza.zzk()));
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi = this.zza.zzi();
                    }
                } while (iZzi == this.zzb);
                this.zzd = iZzi;
                return;
            }
            if (i10 != 2) {
                throw zzakf.zza();
            }
            int iZzj = this.zza.zzj();
            zzd(iZzj);
            int iZzc = this.zza.zzc() + iZzj;
            do {
                list.add(Long.valueOf(this.zza.zzk()));
            } while (this.zza.zzc() < iZzc);
            return;
        }
        zzakr zzakrVar = (zzakr) list;
        int i11 = this.zzb & 7;
        if (i11 == 1) {
            do {
                zzakrVar.zza(this.zza.zzk());
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi2 = this.zza.zzi();
                }
            } while (iZzi2 == this.zzb);
            this.zzd = iZzi2;
            return;
        }
        if (i11 != 2) {
            throw zzakf.zza();
        }
        int iZzj2 = this.zza.zzj();
        zzd(iZzj2);
        int iZzc2 = this.zza.zzc() + iZzj2;
        do {
            zzakrVar.zza(this.zza.zzk());
        } while (this.zza.zzc() < iZzc2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final int zzg() throws zzake {
        zzb(0);
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final void zzg(List<Float> list) throws zzakf {
        int iZzi;
        int iZzi2;
        if (!(list instanceof zzajx)) {
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                int iZzj = this.zza.zzj();
                zzc(iZzj);
                int iZzc = this.zza.zzc() + iZzj;
                do {
                    list.add(Float.valueOf(this.zza.zzb()));
                } while (this.zza.zzc() < iZzc);
                return;
            }
            if (i10 != 5) {
                throw zzakf.zza();
            }
            do {
                list.add(Float.valueOf(this.zza.zzb()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        zzajx zzajxVar = (zzajx) list;
        int i11 = this.zzb & 7;
        if (i11 == 2) {
            int iZzj2 = this.zza.zzj();
            zzc(iZzj2);
            int iZzc2 = this.zza.zzc() + iZzj2;
            do {
                zzajxVar.zza(this.zza.zzb());
            } while (this.zza.zzc() < iZzc2);
            return;
        }
        if (i11 != 5) {
            throw zzakf.zza();
        }
        do {
            zzajxVar.zza(this.zza.zzb());
            if (this.zza.zzt()) {
                return;
            } else {
                iZzi2 = this.zza.zzi();
            }
        } while (iZzi2 == this.zzb);
        this.zzd = iZzi2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final int zzh() throws zzake {
        zzb(5);
        return this.zza.zzg();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final void zzh(List<Integer> list) throws zzakf {
        int iZzi;
        int iZzi2;
        if (!(list instanceof zzajz)) {
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzf()));
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi = this.zza.zzi();
                    }
                } while (iZzi == this.zzb);
                this.zzd = iZzi;
                return;
            }
            if (i10 != 2) {
                throw zzakf.zza();
            }
            int iZzc = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Integer.valueOf(this.zza.zzf()));
            } while (this.zza.zzc() < iZzc);
            zza(iZzc);
            return;
        }
        zzajz zzajzVar = (zzajz) list;
        int i11 = this.zzb & 7;
        if (i11 == 0) {
            do {
                zzajzVar.zzc(this.zza.zzf());
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi2 = this.zza.zzi();
                }
            } while (iZzi2 == this.zzb);
            this.zzd = iZzi2;
            return;
        }
        if (i11 != 2) {
            throw zzakf.zza();
        }
        int iZzc2 = this.zza.zzc() + this.zza.zzj();
        do {
            zzajzVar.zzc(this.zza.zzf());
        } while (this.zza.zzc() < iZzc2);
        zza(iZzc2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final int zzi() throws zzake {
        zzb(0);
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final void zzi(List<Long> list) throws zzakf {
        int iZzi;
        int iZzi2;
        if (!(list instanceof zzakr)) {
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    list.add(Long.valueOf(this.zza.zzl()));
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi = this.zza.zzi();
                    }
                } while (iZzi == this.zzb);
                this.zzd = iZzi;
                return;
            }
            if (i10 != 2) {
                throw zzakf.zza();
            }
            int iZzc = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Long.valueOf(this.zza.zzl()));
            } while (this.zza.zzc() < iZzc);
            zza(iZzc);
            return;
        }
        zzakr zzakrVar = (zzakr) list;
        int i11 = this.zzb & 7;
        if (i11 == 0) {
            do {
                zzakrVar.zza(this.zza.zzl());
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi2 = this.zza.zzi();
                }
            } while (iZzi2 == this.zzb);
            this.zzd = iZzi2;
            return;
        }
        if (i11 != 2) {
            throw zzakf.zza();
        }
        int iZzc2 = this.zza.zzc() + this.zza.zzj();
        do {
            zzakrVar.zza(this.zza.zzl());
        } while (this.zza.zzc() < iZzc2);
        zza(iZzc2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final int zzj() throws zzake {
        zzb(0);
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final void zzj(List<Integer> list) throws zzakf {
        int iZzi;
        int iZzi2;
        if (!(list instanceof zzajz)) {
            int i10 = this.zzb & 7;
            if (i10 == 2) {
                int iZzj = this.zza.zzj();
                zzc(iZzj);
                int iZzc = this.zza.zzc() + iZzj;
                do {
                    list.add(Integer.valueOf(this.zza.zzg()));
                } while (this.zza.zzc() < iZzc);
                return;
            }
            if (i10 != 5) {
                throw zzakf.zza();
            }
            do {
                list.add(Integer.valueOf(this.zza.zzg()));
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi = this.zza.zzi();
                }
            } while (iZzi == this.zzb);
            this.zzd = iZzi;
            return;
        }
        zzajz zzajzVar = (zzajz) list;
        int i11 = this.zzb & 7;
        if (i11 == 2) {
            int iZzj2 = this.zza.zzj();
            zzc(iZzj2);
            int iZzc2 = this.zza.zzc() + iZzj2;
            do {
                zzajzVar.zzc(this.zza.zzg());
            } while (this.zza.zzc() < iZzc2);
            return;
        }
        if (i11 != 5) {
            throw zzakf.zza();
        }
        do {
            zzajzVar.zzc(this.zza.zzg());
            if (this.zza.zzt()) {
                return;
            } else {
                iZzi2 = this.zza.zzi();
            }
        } while (iZzi2 == this.zzb);
        this.zzd = iZzi2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final long zzk() throws zzake {
        zzb(1);
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final void zzk(List<Long> list) throws zzakf {
        int iZzi;
        int iZzi2;
        if (!(list instanceof zzakr)) {
            int i10 = this.zzb & 7;
            if (i10 == 1) {
                do {
                    list.add(Long.valueOf(this.zza.zzn()));
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi = this.zza.zzi();
                    }
                } while (iZzi == this.zzb);
                this.zzd = iZzi;
                return;
            }
            if (i10 != 2) {
                throw zzakf.zza();
            }
            int iZzj = this.zza.zzj();
            zzd(iZzj);
            int iZzc = this.zza.zzc() + iZzj;
            do {
                list.add(Long.valueOf(this.zza.zzn()));
            } while (this.zza.zzc() < iZzc);
            return;
        }
        zzakr zzakrVar = (zzakr) list;
        int i11 = this.zzb & 7;
        if (i11 == 1) {
            do {
                zzakrVar.zza(this.zza.zzn());
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi2 = this.zza.zzi();
                }
            } while (iZzi2 == this.zzb);
            this.zzd = iZzi2;
            return;
        }
        if (i11 != 2) {
            throw zzakf.zza();
        }
        int iZzj2 = this.zza.zzj();
        zzd(iZzj2);
        int iZzc2 = this.zza.zzc() + iZzj2;
        do {
            zzakrVar.zza(this.zza.zzn());
        } while (this.zza.zzc() < iZzc2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final long zzl() throws zzake {
        zzb(0);
        return this.zza.zzl();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final void zzl(List<Integer> list) throws zzakf {
        int iZzi;
        int iZzi2;
        if (!(list instanceof zzajz)) {
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzh()));
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi = this.zza.zzi();
                    }
                } while (iZzi == this.zzb);
                this.zzd = iZzi;
                return;
            }
            if (i10 != 2) {
                throw zzakf.zza();
            }
            int iZzc = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Integer.valueOf(this.zza.zzh()));
            } while (this.zza.zzc() < iZzc);
            zza(iZzc);
            return;
        }
        zzajz zzajzVar = (zzajz) list;
        int i11 = this.zzb & 7;
        if (i11 == 0) {
            do {
                zzajzVar.zzc(this.zza.zzh());
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi2 = this.zza.zzi();
                }
            } while (iZzi2 == this.zzb);
            this.zzd = iZzi2;
            return;
        }
        if (i11 != 2) {
            throw zzakf.zza();
        }
        int iZzc2 = this.zza.zzc() + this.zza.zzj();
        do {
            zzajzVar.zzc(this.zza.zzh());
        } while (this.zza.zzc() < iZzc2);
        zza(iZzc2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final long zzm() throws zzake {
        zzb(1);
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final void zzm(List<Long> list) throws zzakf {
        int iZzi;
        int iZzi2;
        if (!(list instanceof zzakr)) {
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    list.add(Long.valueOf(this.zza.zzo()));
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi = this.zza.zzi();
                    }
                } while (iZzi == this.zzb);
                this.zzd = iZzi;
                return;
            }
            if (i10 != 2) {
                throw zzakf.zza();
            }
            int iZzc = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Long.valueOf(this.zza.zzo()));
            } while (this.zza.zzc() < iZzc);
            zza(iZzc);
            return;
        }
        zzakr zzakrVar = (zzakr) list;
        int i11 = this.zzb & 7;
        if (i11 == 0) {
            do {
                zzakrVar.zza(this.zza.zzo());
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi2 = this.zza.zzi();
                }
            } while (iZzi2 == this.zzb);
            this.zzd = iZzi2;
            return;
        }
        if (i11 != 2) {
            throw zzakf.zza();
        }
        int iZzc2 = this.zza.zzc() + this.zza.zzj();
        do {
            zzakrVar.zza(this.zza.zzo());
        } while (this.zza.zzc() < iZzc2);
        zza(iZzc2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final long zzn() throws zzake {
        zzb(0);
        return this.zza.zzo();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final void zzn(List<String> list) throws zzake {
        zza(list, false);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final long zzo() throws zzake {
        zzb(0);
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final void zzo(List<String> list) throws zzake {
        zza(list, true);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final zzaip zzp() throws zzake {
        zzb(2);
        return this.zza.zzq();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final void zzp(List<Integer> list) throws zzakf {
        int iZzi;
        int iZzi2;
        if (!(list instanceof zzajz)) {
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    list.add(Integer.valueOf(this.zza.zzj()));
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi = this.zza.zzi();
                    }
                } while (iZzi == this.zzb);
                this.zzd = iZzi;
                return;
            }
            if (i10 != 2) {
                throw zzakf.zza();
            }
            int iZzc = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Integer.valueOf(this.zza.zzj()));
            } while (this.zza.zzc() < iZzc);
            zza(iZzc);
            return;
        }
        zzajz zzajzVar = (zzajz) list;
        int i11 = this.zzb & 7;
        if (i11 == 0) {
            do {
                zzajzVar.zzc(this.zza.zzj());
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi2 = this.zza.zzi();
                }
            } while (iZzi2 == this.zzb);
            this.zzd = iZzi2;
            return;
        }
        if (i11 != 2) {
            throw zzakf.zza();
        }
        int iZzc2 = this.zza.zzc() + this.zza.zzj();
        do {
            zzajzVar.zzc(this.zza.zzj());
        } while (this.zza.zzc() < iZzc2);
        zza(iZzc2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final String zzq() throws zzake {
        zzb(2);
        return this.zza.zzr();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final void zzq(List<Long> list) throws zzakf {
        int iZzi;
        int iZzi2;
        if (!(list instanceof zzakr)) {
            int i10 = this.zzb & 7;
            if (i10 == 0) {
                do {
                    list.add(Long.valueOf(this.zza.zzp()));
                    if (this.zza.zzt()) {
                        return;
                    } else {
                        iZzi = this.zza.zzi();
                    }
                } while (iZzi == this.zzb);
                this.zzd = iZzi;
                return;
            }
            if (i10 != 2) {
                throw zzakf.zza();
            }
            int iZzc = this.zza.zzc() + this.zza.zzj();
            do {
                list.add(Long.valueOf(this.zza.zzp()));
            } while (this.zza.zzc() < iZzc);
            zza(iZzc);
            return;
        }
        zzakr zzakrVar = (zzakr) list;
        int i11 = this.zzb & 7;
        if (i11 == 0) {
            do {
                zzakrVar.zza(this.zza.zzp());
                if (this.zza.zzt()) {
                    return;
                } else {
                    iZzi2 = this.zza.zzi();
                }
            } while (iZzi2 == this.zzb);
            this.zzd = iZzi2;
            return;
        }
        if (i11 != 2) {
            throw zzakf.zza();
        }
        int iZzc2 = this.zza.zzc() + this.zza.zzj();
        do {
            zzakrVar.zza(this.zza.zzp());
        } while (this.zza.zzc() < iZzc2);
        zza(iZzc2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final String zzr() throws zzake {
        zzb(2);
        return this.zza.zzs();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final boolean zzs() throws zzake {
        zzb(0);
        return this.zza.zzu();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzals
    public final boolean zzt() {
        int i10;
        if (this.zza.zzt() || (i10 = this.zzb) == this.zzc) {
            return false;
        }
        return this.zza.zzd(i10);
    }
}
