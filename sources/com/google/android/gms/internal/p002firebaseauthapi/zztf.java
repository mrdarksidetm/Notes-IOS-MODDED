package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajy;

/* JADX INFO: loaded from: classes.dex */
public final class zztf extends zzajy<zztf, zza> implements zzale {
    private static final zztf zzc;
    private static volatile zzalp<zztf> zzd;
    private int zze;
    private int zzf;

    public static final class zza extends zzajy.zza<zztf, zza> implements zzale {
        private zza() {
            super(zztf.zzc);
        }

        public final zza zza(int i10) {
            zzh();
            ((zztf) this.zza).zze = i10;
            return this;
        }
    }

    static {
        zztf zztfVar = new zztf();
        zzc = zztfVar;
        zzajy.zza((Class<zztf>) zztf.class, zztfVar);
    }

    private zztf() {
    }

    public static zztf zza(zzaip zzaipVar, zzajk zzajkVar) {
        return (zztf) zzajy.zza(zzc, zzaipVar, zzajkVar);
    }

    public static zza zzc() {
        return zzc.zzm();
    }

    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajy
    protected final Object zza(int i10, Object obj, Object obj2) {
        switch (zzth.zza[i10 - 1]) {
            case 1:
                return new zztf();
            case 2:
                return new zza();
            case 3:
                return zzajy.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzf", "zze"});
            case 4:
                return zzc;
            case 5:
                zzalp<zztf> zzcVar = zzd;
                if (zzcVar == null) {
                    synchronized (zztf.class) {
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

    public final int zzb() {
        return this.zzf;
    }
}
