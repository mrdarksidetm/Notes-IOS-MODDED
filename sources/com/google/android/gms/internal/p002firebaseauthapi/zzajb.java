package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzajb {
    private static volatile int zze = 100;
    int zza;
    int zzb;
    int zzc;
    zzajf zzd;

    private zzajb() {
        this.zzb = zze;
        this.zzc = a.e.API_PRIORITY_OTHER;
    }

    public static long zza(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    static zzajb zza(byte[] bArr, int i10, int i11, boolean z10) {
        zzaja zzajaVar = new zzaja(bArr, i10, i11, z10);
        try {
            zzajaVar.zza(i11);
            return zzajaVar;
        } catch (zzakf e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static int zze(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public abstract double zza();

    public abstract int zza(int i10);

    public abstract float zzb();

    public abstract void zzb(int i10);

    public abstract int zzc();

    public abstract void zzc(int i10);

    public abstract int zzd();

    public abstract boolean zzd(int i10);

    public abstract int zze();

    public abstract int zzf();

    public abstract int zzg();

    public abstract int zzh();

    public abstract int zzi();

    public abstract int zzj();

    public abstract long zzk();

    public abstract long zzl();

    abstract long zzm();

    public abstract long zzn();

    public abstract long zzo();

    public abstract long zzp();

    public abstract zzaip zzq();

    public abstract String zzr();

    public abstract String zzs();

    public abstract boolean zzt();

    public abstract boolean zzu();

    public final void zzv() throws zzakf {
        int iZzi;
        do {
            iZzi = zzi();
            if (iZzi == 0) {
                return;
            }
            int i10 = this.zza;
            if (i10 >= this.zzb) {
                throw zzakf.zzh();
            }
            this.zza = i10 + 1;
            this.zza--;
        } while (zzd(iZzi));
    }
}
