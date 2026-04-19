package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajy;

/* JADX INFO: loaded from: classes.dex */
public final class zzse extends zzajy<zzse, zza> implements zzale {
    private static final zzse zzc;
    private static volatile zzalp<zzse> zzd;
    private int zze;
    private int zzf;
    private zzsk zzg;
    private zzaip zzh = zzaip.zza;

    public static final class zza extends zzajy.zza<zzse, zza> implements zzale {
        private zza() {
            super(zzse.zzc);
        }

        public final zza zza(zzaip zzaipVar) {
            zzh();
            zzse.zza((zzse) this.zza, zzaipVar);
            return this;
        }

        public final zza zza(zzsk zzskVar) {
            zzh();
            zzse.zza((zzse) this.zza, zzskVar);
            return this;
        }
    }

    static {
        zzse zzseVar = new zzse();
        zzc = zzseVar;
        zzajy.zza((Class<zzse>) zzse.class, zzseVar);
    }

    private zzse() {
    }

    static /* synthetic */ void zza(zzse zzseVar, zzaip zzaipVar) {
        zzaipVar.getClass();
        zzseVar.zzh = zzaipVar;
    }

    static /* synthetic */ void zza(zzse zzseVar, zzsk zzskVar) {
        zzskVar.getClass();
        zzseVar.zzg = zzskVar;
        zzseVar.zze |= 1;
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    public static zzse zzd() {
        return zzc;
    }

    public final int zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajy
    protected final Object zza(int i10, Object obj, Object obj2) {
        switch (zzsg.zza[i10 - 1]) {
            case 1:
                return new zzse();
            case 2:
                return new zza();
            case 3:
                return zzajy.zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzalp<zzse> zzcVar = zzd;
                if (zzcVar == null) {
                    synchronized (zzse.class) {
                        zzcVar = zzd;
                        if (zzcVar == null) {
                            zzcVar = new zzajy.zzc<>(zzc);
                            zzd = zzcVar;
                        }
                        break;
                    }
                }
                return zzcVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final zzsk zze() {
        zzsk zzskVar = this.zzg;
        return zzskVar == null ? zzsk.zzd() : zzskVar;
    }

    public final zzaip zzf() {
        return this.zzh;
    }
}
