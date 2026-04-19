package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajy;

/* JADX INFO: loaded from: classes.dex */
public final class zzsw extends zzajy<zzsw, zza> implements zzale {
    private static final zzsw zzc;
    private static volatile zzalp<zzsw> zzd;
    private int zze;
    private zzaip zzf = zzaip.zza;

    public static final class zza extends zzajy.zza<zzsw, zza> implements zzale {
        private zza() {
            super(zzsw.zzc);
        }

        public final zza zza(zzaip zzaipVar) {
            zzh();
            zzsw.zza((zzsw) this.zza, zzaipVar);
            return this;
        }
    }

    static {
        zzsw zzswVar = new zzsw();
        zzc = zzswVar;
        zzajy.zza((Class<zzsw>) zzsw.class, zzswVar);
    }

    private zzsw() {
    }

    public static zzsw zza(zzaip zzaipVar, zzajk zzajkVar) {
        return (zzsw) zzajy.zza(zzc, zzaipVar, zzajkVar);
    }

    static /* synthetic */ void zza(zzsw zzswVar, zzaip zzaipVar) {
        zzaipVar.getClass();
        zzswVar.zzf = zzaipVar;
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    public static zzalp<zzsw> zze() {
        return (zzalp) zzc.zza(zzajy.zzf.zzg, (Object) null, (Object) null);
    }

    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajy
    protected final Object zza(int i10, Object obj, Object obj2) {
        switch (zzsy.zza[i10 - 1]) {
            case 1:
                return new zzsw();
            case 2:
                return new zza();
            case 3:
                return zzajy.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzalp<zzsw> zzcVar = zzd;
                if (zzcVar == null) {
                    synchronized (zzsw.class) {
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
