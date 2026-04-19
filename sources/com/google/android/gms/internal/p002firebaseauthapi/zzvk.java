package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajy;

/* JADX INFO: loaded from: classes.dex */
public final class zzvk extends zzajy<zzvk, zza> implements zzale {
    private static final zzvk zzc;
    private static volatile zzalp<zzvk> zzd;
    private int zze;
    private int zzf;
    private zzvn zzg;
    private zzaip zzh = zzaip.zza;

    public static final class zza extends zzajy.zza<zzvk, zza> implements zzale {
        private zza() {
            super(zzvk.zzc);
        }

        public final zza zza(int i10) {
            zzh();
            ((zzvk) this.zza).zzf = 0;
            return this;
        }

        public final zza zza(zzaip zzaipVar) {
            zzh();
            zzvk.zza((zzvk) this.zza, zzaipVar);
            return this;
        }

        public final zza zza(zzvn zzvnVar) {
            zzh();
            zzvk.zza((zzvk) this.zza, zzvnVar);
            return this;
        }
    }

    static {
        zzvk zzvkVar = new zzvk();
        zzc = zzvkVar;
        zzajy.zza((Class<zzvk>) zzvk.class, zzvkVar);
    }

    private zzvk() {
    }

    public static zzvk zza(zzaip zzaipVar, zzajk zzajkVar) {
        return (zzvk) zzajy.zza(zzc, zzaipVar, zzajkVar);
    }

    static /* synthetic */ void zza(zzvk zzvkVar, zzaip zzaipVar) {
        zzaipVar.getClass();
        zzvkVar.zzh = zzaipVar;
    }

    static /* synthetic */ void zza(zzvk zzvkVar, zzvn zzvnVar) {
        zzvnVar.getClass();
        zzvkVar.zzg = zzvnVar;
        zzvkVar.zze |= 1;
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    public static zzalp<zzvk> zzf() {
        return (zzalp) zzc.zza(zzajy.zzf.zzg, (Object) null, (Object) null);
    }

    public final int zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajy
    protected final Object zza(int i10, Object obj, Object obj2) {
        switch (zzvm.zza[i10 - 1]) {
            case 1:
                return new zzvk();
            case 2:
                return new zza();
            case 3:
                return zzajy.zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzalp<zzvk> zzcVar = zzd;
                if (zzcVar == null) {
                    synchronized (zzvk.class) {
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

    public final zzvn zzd() {
        zzvn zzvnVar = this.zzg;
        return zzvnVar == null ? zzvn.zze() : zzvnVar;
    }

    public final zzaip zze() {
        return this.zzh;
    }
}
