package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajy;

/* JADX INFO: loaded from: classes.dex */
public final class zztc extends zzajy<zztc, zza> implements zzale {
    private static final zztc zzc;
    private static volatile zzalp<zztc> zzd;
    private int zze;
    private zzaip zzf = zzaip.zza;

    public static final class zza extends zzajy.zza<zztc, zza> implements zzale {
        private zza() {
            super(zztc.zzc);
        }

        public final zza zza(zzaip zzaipVar) {
            zzh();
            zztc.zza((zztc) this.zza, zzaipVar);
            return this;
        }
    }

    static {
        zztc zztcVar = new zztc();
        zzc = zztcVar;
        zzajy.zza((Class<zztc>) zztc.class, zztcVar);
    }

    private zztc() {
    }

    public static zztc zza(zzaip zzaipVar, zzajk zzajkVar) {
        return (zztc) zzajy.zza(zzc, zzaipVar, zzajkVar);
    }

    static /* synthetic */ void zza(zztc zztcVar, zzaip zzaipVar) {
        zzaipVar.getClass();
        zztcVar.zzf = zzaipVar;
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    public static zzalp<zztc> zze() {
        return (zzalp) zzc.zza(zzajy.zzf.zzg, (Object) null, (Object) null);
    }

    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajy
    protected final Object zza(int i10, Object obj, Object obj2) {
        switch (zzte.zza[i10 - 1]) {
            case 1:
                return new zztc();
            case 2:
                return new zza();
            case 3:
                return zzajy.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzalp<zztc> zzcVar = zzd;
                if (zzcVar == null) {
                    synchronized (zztc.class) {
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

    public final zzaip zzd() {
        return this.zzf;
    }
}
