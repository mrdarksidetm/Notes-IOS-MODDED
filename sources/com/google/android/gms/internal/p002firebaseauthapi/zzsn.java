package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajy;

/* JADX INFO: loaded from: classes.dex */
public final class zzsn extends zzajy<zzsn, zza> implements zzale {
    private static final zzsn zzc;
    private static volatile zzalp<zzsn> zzd;
    private int zze;
    private int zzf;
    private zzst zzg;
    private zzaip zzh = zzaip.zza;

    public static final class zza extends zzajy.zza<zzsn, zza> implements zzale {
        private zza() {
            super(zzsn.zzc);
        }

        public final zza zza(zzaip zzaipVar) {
            zzh();
            zzsn.zza((zzsn) this.zza, zzaipVar);
            return this;
        }

        public final zza zza(zzst zzstVar) {
            zzh();
            zzsn.zza((zzsn) this.zza, zzstVar);
            return this;
        }
    }

    static {
        zzsn zzsnVar = new zzsn();
        zzc = zzsnVar;
        zzajy.zza((Class<zzsn>) zzsn.class, zzsnVar);
    }

    private zzsn() {
    }

    public static zzsn zza(zzaip zzaipVar, zzajk zzajkVar) {
        return (zzsn) zzajy.zza(zzc, zzaipVar, zzajkVar);
    }

    static /* synthetic */ void zza(zzsn zzsnVar, zzaip zzaipVar) {
        zzaipVar.getClass();
        zzsnVar.zzh = zzaipVar;
    }

    static /* synthetic */ void zza(zzsn zzsnVar, zzst zzstVar) {
        zzstVar.getClass();
        zzsnVar.zzg = zzstVar;
        zzsnVar.zze |= 1;
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    public static zzalp<zzsn> zzf() {
        return (zzalp) zzc.zza(zzajy.zzf.zzg, (Object) null, (Object) null);
    }

    public final int zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajy
    protected final Object zza(int i10, Object obj, Object obj2) {
        switch (zzsp.zza[i10 - 1]) {
            case 1:
                return new zzsn();
            case 2:
                return new zza();
            case 3:
                return zzajy.zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzalp<zzsn> zzcVar = zzd;
                if (zzcVar == null) {
                    synchronized (zzsn.class) {
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

    public final zzst zzd() {
        zzst zzstVar = this.zzg;
        return zzstVar == null ? zzst.zzd() : zzstVar;
    }

    public final zzaip zze() {
        return this.zzh;
    }
}
