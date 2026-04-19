package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajy;

/* JADX INFO: loaded from: classes.dex */
public final class zzsz extends zzajy<zzsz, zza> implements zzale {
    private static final zzsz zzc;
    private static volatile zzalp<zzsz> zzd;
    private int zze;
    private int zzf;

    public static final class zza extends zzajy.zza<zzsz, zza> implements zzale {
        private zza() {
            super(zzsz.zzc);
        }

        public final zza zza(int i10) {
            zzh();
            ((zzsz) this.zza).zze = i10;
            return this;
        }
    }

    static {
        zzsz zzszVar = new zzsz();
        zzc = zzszVar;
        zzajy.zza((Class<zzsz>) zzsz.class, zzszVar);
    }

    private zzsz() {
    }

    public static zzsz zza(zzaip zzaipVar, zzajk zzajkVar) {
        return (zzsz) zzajy.zza(zzc, zzaipVar, zzajkVar);
    }

    public static zza zzc() {
        return zzc.zzm();
    }

    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajy
    protected final Object zza(int i10, Object obj, Object obj2) {
        switch (zztb.zza[i10 - 1]) {
            case 1:
                return new zzsz();
            case 2:
                return new zza();
            case 3:
                return zzajy.zza(zzc, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzalp<zzsz> zzcVar = zzd;
                if (zzcVar == null) {
                    synchronized (zzsz.class) {
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
