package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: loaded from: classes.dex */
abstract class zzamo<T, B> {
    private static volatile int zza = 100;

    zzamo() {
    }

    abstract int zza(T t10);

    abstract B zza();

    abstract T zza(T t10, T t11);

    abstract void zza(B b10, int i10, int i11);

    abstract void zza(B b10, int i10, long j10);

    abstract void zza(B b10, int i10, zzaip zzaipVar);

    abstract void zza(B b10, int i10, T t10);

    abstract void zza(T t10, zzanf zzanfVar);

    abstract boolean zza(zzals zzalsVar);

    final boolean zza(B b10, zzals zzalsVar, int i10) throws zzakf {
        int iZzd = zzalsVar.zzd();
        int i11 = iZzd >>> 3;
        int i12 = iZzd & 7;
        if (i12 == 0) {
            zzb(b10, i11, zzalsVar.zzl());
            return true;
        }
        if (i12 == 1) {
            zza(b10, i11, zzalsVar.zzk());
            return true;
        }
        if (i12 == 2) {
            zza((Object) b10, i11, zzalsVar.zzp());
            return true;
        }
        if (i12 != 3) {
            if (i12 == 4) {
                return false;
            }
            if (i12 != 5) {
                throw zzakf.zza();
            }
            zza((Object) b10, i11, zzalsVar.zzf());
            return true;
        }
        B bZza = zza();
        int i13 = 4 | (i11 << 3);
        int i14 = i10 + 1;
        if (i14 >= zza) {
            throw zzakf.zzh();
        }
        while (zzalsVar.zzc() != Integer.MAX_VALUE && zza(bZza, zzalsVar, i14)) {
        }
        if (i13 != zzalsVar.zzd()) {
            throw zzakf.zzb();
        }
        zza(b10, i11, zze(bZza));
        return true;
    }

    abstract int zzb(T t10);

    abstract void zzb(B b10, int i10, long j10);

    abstract void zzb(T t10, zzanf zzanfVar);

    abstract void zzb(Object obj, B b10);

    abstract B zzc(Object obj);

    abstract void zzc(Object obj, T t10);

    abstract T zzd(Object obj);

    abstract T zze(B b10);

    abstract void zzf(Object obj);
}
