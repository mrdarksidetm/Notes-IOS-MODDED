package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajy;

/* JADX INFO: loaded from: classes.dex */
public final class zzwm extends zzajy<zzwm, zza> implements zzale {
    private static final zzwm zzc;
    private static volatile zzalp<zzwm> zzd;
    private int zze;
    private int zzf;
    private zzwp zzg;

    public static final class zza extends zzajy.zza<zzwm, zza> implements zzale {
        private zza() {
            super(zzwm.zzc);
        }

        public final zza zza(zzwp zzwpVar) {
            zzh();
            zzwm.zza((zzwm) this.zza, zzwpVar);
            return this;
        }
    }

    static {
        zzwm zzwmVar = new zzwm();
        zzc = zzwmVar;
        zzajy.zza((Class<zzwm>) zzwm.class, zzwmVar);
    }

    private zzwm() {
    }

    public static zzwm zza(zzaip zzaipVar, zzajk zzajkVar) {
        return (zzwm) zzajy.zza(zzc, zzaipVar, zzajkVar);
    }

    static /* synthetic */ void zza(zzwm zzwmVar, zzwp zzwpVar) {
        zzwpVar.getClass();
        zzwmVar.zzg = zzwpVar;
        zzwmVar.zze |= 1;
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    public static zzalp<zzwm> zze() {
        return (zzalp) zzc.zza(zzajy.zzf.zzg, (Object) null, (Object) null);
    }

    public final int zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajy
    protected final Object zza(int i10, Object obj, Object obj2) {
        switch (zzwo.zza[i10 - 1]) {
            case 1:
                return new zzwm();
            case 2:
                return new zza();
            case 3:
                return zzajy.zza(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzalp<zzwm> zzcVar = zzd;
                if (zzcVar == null) {
                    synchronized (zzwm.class) {
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

    public final zzwp zzd() {
        zzwp zzwpVar = this.zzg;
        return zzwpVar == null ? zzwp.zzd() : zzwpVar;
    }
}
