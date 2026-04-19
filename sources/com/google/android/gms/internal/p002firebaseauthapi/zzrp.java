package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajy;

/* JADX INFO: loaded from: classes.dex */
public final class zzrp extends zzajy<zzrp, zza> implements zzale {
    private static final zzrp zzc;
    private static volatile zzalp<zzrp> zzd;
    private int zze;
    private int zzf;
    private zzaip zzg = zzaip.zza;
    private zzrv zzh;

    public static final class zza extends zzajy.zza<zzrp, zza> implements zzale {
        private zza() {
            super(zzrp.zzc);
        }

        public final zza zza(zzaip zzaipVar) {
            zzh();
            zzrp.zza((zzrp) this.zza, zzaipVar);
            return this;
        }

        public final zza zza(zzrv zzrvVar) {
            zzh();
            zzrp.zza((zzrp) this.zza, zzrvVar);
            return this;
        }
    }

    static {
        zzrp zzrpVar = new zzrp();
        zzc = zzrpVar;
        zzajy.zza((Class<zzrp>) zzrp.class, zzrpVar);
    }

    private zzrp() {
    }

    public static zzrp zza(zzaip zzaipVar, zzajk zzajkVar) {
        return (zzrp) zzajy.zza(zzc, zzaipVar, zzajkVar);
    }

    static /* synthetic */ void zza(zzrp zzrpVar, zzaip zzaipVar) {
        zzaipVar.getClass();
        zzrpVar.zzg = zzaipVar;
    }

    static /* synthetic */ void zza(zzrp zzrpVar, zzrv zzrvVar) {
        zzrvVar.getClass();
        zzrpVar.zzh = zzrvVar;
        zzrpVar.zze |= 1;
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    public static zzalp<zzrp> zzf() {
        return (zzalp) zzc.zza(zzajy.zzf.zzg, (Object) null, (Object) null);
    }

    public final int zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajy
    protected final Object zza(int i10, Object obj, Object obj2) {
        switch (zzrr.zza[i10 - 1]) {
            case 1:
                return new zzrp();
            case 2:
                return new zza();
            case 3:
                return zzajy.zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzalp<zzrp> zzcVar = zzd;
                if (zzcVar == null) {
                    synchronized (zzrp.class) {
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

    public final zzrv zzd() {
        zzrv zzrvVar = this.zzh;
        return zzrvVar == null ? zzrv.zzd() : zzrvVar;
    }

    public final zzaip zze() {
        return this.zzg;
    }
}
