package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
abstract class zznb {
    zznb() {
    }

    abstract int zza(Object obj);

    abstract int zzb(Object obj);

    abstract Object zzc(Object obj);

    abstract Object zzd(Object obj);

    abstract Object zze(Object obj, Object obj2);

    abstract Object zzf();

    abstract Object zzg(Object obj);

    abstract void zzh(Object obj, int i10, int i11);

    abstract void zzi(Object obj, int i10, long j10);

    abstract void zzj(Object obj, int i10, Object obj2);

    abstract void zzk(Object obj, int i10, zziv zzivVar);

    abstract void zzl(Object obj, int i10, long j10);

    abstract void zzm(Object obj);

    abstract void zzn(Object obj, Object obj2);

    abstract void zzo(Object obj, Object obj2);

    abstract void zzp(Object obj, zzno zznoVar);

    abstract void zzq(Object obj, zzno zznoVar);

    final boolean zzr(Object obj, zzmj zzmjVar) throws zzlc {
        int iZzd = zzmjVar.zzd();
        int i10 = iZzd >>> 3;
        int i11 = iZzd & 7;
        if (i11 == 0) {
            zzl(obj, i10, zzmjVar.zzl());
            return true;
        }
        if (i11 == 1) {
            zzi(obj, i10, zzmjVar.zzk());
            return true;
        }
        if (i11 == 2) {
            zzk(obj, i10, zzmjVar.zzp());
            return true;
        }
        if (i11 != 3) {
            if (i11 == 4) {
                return false;
            }
            if (i11 != 5) {
                throw zzlc.zza();
            }
            zzh(obj, i10, zzmjVar.zzf());
            return true;
        }
        Object objZzf = zzf();
        int i12 = i10 << 3;
        while (zzmjVar.zzc() != Integer.MAX_VALUE && zzr(objZzf, zzmjVar)) {
        }
        if ((4 | i12) != zzmjVar.zzd()) {
            throw zzlc.zzb();
        }
        zzg(objZzf);
        zzj(obj, i10, objZzf);
        return true;
    }

    abstract boolean zzs(zzmj zzmjVar);
}
