package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajy;

/* JADX INFO: loaded from: classes.dex */
public final class zzux extends zzajy<zzux, zza> implements zzale {
    private static final zzux zzc;
    private static volatile zzalp<zzux> zzd;
    private int zze;
    private zzva zzf;
    private int zzg;
    private int zzh;

    public static final class zza extends zzajy.zza<zzux, zza> implements zzale {
        private zza() {
            super(zzux.zzc);
        }

        public final zza zza(int i10) {
            zzh();
            ((zzux) this.zza).zzg = i10;
            return this;
        }

        public final zza zza(zzva zzvaVar) {
            zzh();
            zzux.zza((zzux) this.zza, zzvaVar);
            return this;
        }
    }

    static {
        zzux zzuxVar = new zzux();
        zzc = zzuxVar;
        zzajy.zza((Class<zzux>) zzux.class, zzuxVar);
    }

    private zzux() {
    }

    public static zzux zza(zzaip zzaipVar, zzajk zzajkVar) {
        return (zzux) zzajy.zza(zzc, zzaipVar, zzajkVar);
    }

    static /* synthetic */ void zza(zzux zzuxVar, zzva zzvaVar) {
        zzvaVar.getClass();
        zzuxVar.zzf = zzvaVar;
        zzuxVar.zze |= 1;
    }

    public static zza zzc() {
        return zzc.zzm();
    }

    public static zzux zze() {
        return zzc;
    }

    public final int zza() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajy
    protected final Object zza(int i10, Object obj, Object obj2) {
        switch (zzuw.zza[i10 - 1]) {
            case 1:
                return new zzux();
            case 2:
                return new zza();
            case 3:
                return zzajy.zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzalp<zzux> zzcVar = zzd;
                if (zzcVar == null) {
                    synchronized (zzux.class) {
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
        return this.zzh;
    }

    public final zzva zzf() {
        zzva zzvaVar = this.zzf;
        return zzvaVar == null ? zzva.zze() : zzvaVar;
    }
}
