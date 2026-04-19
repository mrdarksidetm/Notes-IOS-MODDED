package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajy;

/* JADX INFO: loaded from: classes.dex */
public final class zzug extends zzajy<zzug, zza> implements zzale {
    private static final zzug zzc;
    private static volatile zzalp<zzug> zzd;
    private int zze;
    private int zzf;
    private zzuj zzg;
    private zzaip zzh = zzaip.zza;

    public static final class zza extends zzajy.zza<zzug, zza> implements zzale {
        private zza() {
            super(zzug.zzc);
        }

        public final zza zza(int i10) {
            zzh();
            ((zzug) this.zza).zzf = 0;
            return this;
        }

        public final zza zza(zzaip zzaipVar) {
            zzh();
            zzug.zza((zzug) this.zza, zzaipVar);
            return this;
        }

        public final zza zza(zzuj zzujVar) {
            zzh();
            zzug.zza((zzug) this.zza, zzujVar);
            return this;
        }
    }

    static {
        zzug zzugVar = new zzug();
        zzc = zzugVar;
        zzajy.zza((Class<zzug>) zzug.class, zzugVar);
    }

    private zzug() {
    }

    public static zzug zza(zzaip zzaipVar, zzajk zzajkVar) {
        return (zzug) zzajy.zza(zzc, zzaipVar, zzajkVar);
    }

    static /* synthetic */ void zza(zzug zzugVar, zzaip zzaipVar) {
        zzaipVar.getClass();
        zzugVar.zzh = zzaipVar;
    }

    static /* synthetic */ void zza(zzug zzugVar, zzuj zzujVar) {
        zzujVar.getClass();
        zzugVar.zzg = zzujVar;
        zzugVar.zze |= 1;
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    public static zzalp<zzug> zzf() {
        return (zzalp) zzc.zza(zzajy.zzf.zzg, (Object) null, (Object) null);
    }

    public final int zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajy
    protected final Object zza(int i10, Object obj, Object obj2) {
        switch (zzuf.zza[i10 - 1]) {
            case 1:
                return new zzug();
            case 2:
                return new zza();
            case 3:
                return zzajy.zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzalp<zzug> zzcVar = zzd;
                if (zzcVar == null) {
                    synchronized (zzug.class) {
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

    public final zzuj zzd() {
        zzuj zzujVar = this.zzg;
        return zzujVar == null ? zzuj.zze() : zzujVar;
    }

    public final zzaip zze() {
        return this.zzh;
    }
}
