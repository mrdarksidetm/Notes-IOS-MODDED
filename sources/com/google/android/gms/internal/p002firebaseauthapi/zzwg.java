package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajy;

/* JADX INFO: loaded from: classes.dex */
public final class zzwg extends zzajy<zzwg, zza> implements zzale {
    private static final zzwg zzc;
    private static volatile zzalp<zzwg> zzd;
    private int zze;
    private int zzf;
    private zzwj zzg;

    public static final class zza extends zzajy.zza<zzwg, zza> implements zzale {
        private zza() {
            super(zzwg.zzc);
        }

        public final zza zza(zzwj zzwjVar) {
            zzh();
            zzwg.zza((zzwg) this.zza, zzwjVar);
            return this;
        }
    }

    static {
        zzwg zzwgVar = new zzwg();
        zzc = zzwgVar;
        zzajy.zza((Class<zzwg>) zzwg.class, zzwgVar);
    }

    private zzwg() {
    }

    public static zzwg zza(zzaip zzaipVar, zzajk zzajkVar) {
        return (zzwg) zzajy.zza(zzc, zzaipVar, zzajkVar);
    }

    static /* synthetic */ void zza(zzwg zzwgVar, zzwj zzwjVar) {
        zzwjVar.getClass();
        zzwgVar.zzg = zzwjVar;
        zzwgVar.zze |= 1;
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    public static zzalp<zzwg> zze() {
        return (zzalp) zzc.zza(zzajy.zzf.zzg, (Object) null, (Object) null);
    }

    public final int zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajy
    protected final Object zza(int i10, Object obj, Object obj2) {
        switch (zzwi.zza[i10 - 1]) {
            case 1:
                return new zzwg();
            case 2:
                return new zza();
            case 3:
                return zzajy.zza(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzalp<zzwg> zzcVar = zzd;
                if (zzcVar == null) {
                    synchronized (zzwg.class) {
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

    public final zzwj zzd() {
        zzwj zzwjVar = this.zzg;
        return zzwjVar == null ? zzwj.zzc() : zzwjVar;
    }
}
