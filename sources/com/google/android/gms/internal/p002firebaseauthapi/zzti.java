package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajy;

/* JADX INFO: loaded from: classes.dex */
public final class zzti extends zzajy<zzti, zza> implements zzale {
    private static final zzti zzc;
    private static volatile zzalp<zzti> zzd;
    private int zze;
    private zzaip zzf = zzaip.zza;

    public static final class zza extends zzajy.zza<zzti, zza> implements zzale {
        private zza() {
            super(zzti.zzc);
        }

        public final zza zza(zzaip zzaipVar) {
            zzh();
            zzti.zza((zzti) this.zza, zzaipVar);
            return this;
        }
    }

    static {
        zzti zztiVar = new zzti();
        zzc = zztiVar;
        zzajy.zza((Class<zzti>) zzti.class, zztiVar);
    }

    private zzti() {
    }

    public static zzti zza(zzaip zzaipVar, zzajk zzajkVar) {
        return (zzti) zzajy.zza(zzc, zzaipVar, zzajkVar);
    }

    static /* synthetic */ void zza(zzti zztiVar, zzaip zzaipVar) {
        zzaipVar.getClass();
        zztiVar.zzf = zzaipVar;
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    public static zzalp<zzti> zze() {
        return (zzalp) zzc.zza(zzajy.zzf.zzg, (Object) null, (Object) null);
    }

    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajy
    protected final Object zza(int i10, Object obj, Object obj2) {
        switch (zztk.zza[i10 - 1]) {
            case 1:
                return new zzti();
            case 2:
                return new zza();
            case 3:
                return zzajy.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzalp<zzti> zzcVar = zzd;
                if (zzcVar == null) {
                    synchronized (zzti.class) {
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
