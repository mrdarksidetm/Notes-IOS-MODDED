package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajy;

/* JADX INFO: loaded from: classes.dex */
public final class zzve extends zzajy<zzve, zza> implements zzale {
    private static final zzve zzc;
    private static volatile zzalp<zzve> zzd;
    private int zze;
    private zzvh zzf;

    public static final class zza extends zzajy.zza<zzve, zza> implements zzale {
        private zza() {
            super(zzve.zzc);
        }

        public final zza zza(zzvh zzvhVar) {
            zzh();
            zzve.zza((zzve) this.zza, zzvhVar);
            return this;
        }
    }

    static {
        zzve zzveVar = new zzve();
        zzc = zzveVar;
        zzajy.zza((Class<zzve>) zzve.class, zzveVar);
    }

    private zzve() {
    }

    public static zza zza() {
        return zzc.zzm();
    }

    public static zzve zza(zzaip zzaipVar, zzajk zzajkVar) {
        return (zzve) zzajy.zza(zzc, zzaipVar, zzajkVar);
    }

    static /* synthetic */ void zza(zzve zzveVar, zzvh zzvhVar) {
        zzvhVar.getClass();
        zzveVar.zzf = zzvhVar;
        zzveVar.zze |= 1;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajy
    protected final Object zza(int i10, Object obj, Object obj2) {
        switch (zzvg.zza[i10 - 1]) {
            case 1:
                return new zzve();
            case 2:
                return new zza();
            case 3:
                return zzajy.zza(zzc, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzalp<zzve> zzcVar = zzd;
                if (zzcVar == null) {
                    synchronized (zzve.class) {
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

    public final zzvh zzc() {
        zzvh zzvhVar = this.zzf;
        return zzvhVar == null ? zzvh.zzf() : zzvhVar;
    }
}
