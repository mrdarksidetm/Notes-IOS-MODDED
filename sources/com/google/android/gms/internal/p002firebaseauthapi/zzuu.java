package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajy;

/* JADX INFO: loaded from: classes.dex */
public final class zzuu extends zzajy<zzuu, zza> implements zzale {
    private static final zzuu zzc;
    private static volatile zzalp<zzuu> zzd;
    private int zze;
    private int zzf;
    private zzva zzg;
    private zzaip zzh = zzaip.zza;

    public static final class zza extends zzajy.zza<zzuu, zza> implements zzale {
        private zza() {
            super(zzuu.zzc);
        }

        public final zza zza(zzaip zzaipVar) {
            zzh();
            zzuu.zza((zzuu) this.zza, zzaipVar);
            return this;
        }

        public final zza zza(zzva zzvaVar) {
            zzh();
            zzuu.zza((zzuu) this.zza, zzvaVar);
            return this;
        }
    }

    static {
        zzuu zzuuVar = new zzuu();
        zzc = zzuuVar;
        zzajy.zza((Class<zzuu>) zzuu.class, zzuuVar);
    }

    private zzuu() {
    }

    public static zzalp<zzuu> c_() {
        return (zzalp) zzc.zza(zzajy.zzf.zzg, (Object) null, (Object) null);
    }

    public static zzuu zza(zzaip zzaipVar, zzajk zzajkVar) {
        return (zzuu) zzajy.zza(zzc, zzaipVar, zzajkVar);
    }

    static /* synthetic */ void zza(zzuu zzuuVar, zzaip zzaipVar) {
        zzaipVar.getClass();
        zzuuVar.zzh = zzaipVar;
    }

    static /* synthetic */ void zza(zzuu zzuuVar, zzva zzvaVar) {
        zzvaVar.getClass();
        zzuuVar.zzg = zzvaVar;
        zzuuVar.zze |= 1;
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    public static zzuu zzd() {
        return zzc;
    }

    public final int zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajy
    protected final Object zza(int i10, Object obj, Object obj2) {
        switch (zzut.zza[i10 - 1]) {
            case 1:
                return new zzuu();
            case 2:
                return new zza();
            case 3:
                return zzajy.zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzalp<zzuu> zzcVar = zzd;
                if (zzcVar == null) {
                    synchronized (zzuu.class) {
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

    public final zzva zze() {
        zzva zzvaVar = this.zzg;
        return zzvaVar == null ? zzva.zze() : zzvaVar;
    }

    public final zzaip zzf() {
        return this.zzh;
    }
}
