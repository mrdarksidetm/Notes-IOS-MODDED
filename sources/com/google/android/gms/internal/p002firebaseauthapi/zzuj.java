package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajy;

/* JADX INFO: loaded from: classes.dex */
public final class zzuj extends zzajy<zzuj, zza> implements zzale {
    private static final zzuj zzc;
    private static volatile zzalp<zzuj> zzd;
    private int zze;
    private int zzf;
    private zzud zzg;
    private zzaip zzh;
    private zzaip zzi;

    public static final class zza extends zzajy.zza<zzuj, zza> implements zzale {
        private zza() {
            super(zzuj.zzc);
        }

        public final zza zza(int i10) {
            zzh();
            ((zzuj) this.zza).zzf = 0;
            return this;
        }

        public final zza zza(zzaip zzaipVar) {
            zzh();
            zzuj.zza((zzuj) this.zza, zzaipVar);
            return this;
        }

        public final zza zza(zzud zzudVar) {
            zzh();
            zzuj.zza((zzuj) this.zza, zzudVar);
            return this;
        }

        public final zza zzb(zzaip zzaipVar) {
            zzh();
            zzuj.zzb((zzuj) this.zza, zzaipVar);
            return this;
        }
    }

    static {
        zzuj zzujVar = new zzuj();
        zzc = zzujVar;
        zzajy.zza((Class<zzuj>) zzuj.class, zzujVar);
    }

    private zzuj() {
        zzaip zzaipVar = zzaip.zza;
        this.zzh = zzaipVar;
        this.zzi = zzaipVar;
    }

    public static zzuj zza(zzaip zzaipVar, zzajk zzajkVar) {
        return (zzuj) zzajy.zza(zzc, zzaipVar, zzajkVar);
    }

    static /* synthetic */ void zza(zzuj zzujVar, zzaip zzaipVar) {
        zzaipVar.getClass();
        zzujVar.zzh = zzaipVar;
    }

    static /* synthetic */ void zza(zzuj zzujVar, zzud zzudVar) {
        zzudVar.getClass();
        zzujVar.zzg = zzudVar;
        zzujVar.zze |= 1;
    }

    static /* synthetic */ void zzb(zzuj zzujVar, zzaip zzaipVar) {
        zzaipVar.getClass();
        zzujVar.zzi = zzaipVar;
    }

    public static zza zzc() {
        return zzc.zzm();
    }

    public static zzuj zze() {
        return zzc;
    }

    public static zzalp<zzuj> zzh() {
        return (zzalp) zzc.zza(zzajy.zzf.zzg, (Object) null, (Object) null);
    }

    public final zzaip b_() {
        return this.zzi;
    }

    public final int zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajy
    protected final Object zza(int i10, Object obj, Object obj2) {
        switch (zzui.zza[i10 - 1]) {
            case 1:
                return new zzuj();
            case 2:
                return new zza();
            case 3:
                return zzajy.zza(zzc, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                zzalp<zzuj> zzcVar = zzd;
                if (zzcVar == null) {
                    synchronized (zzuj.class) {
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

    public final zzud zzb() {
        zzud zzudVar = this.zzg;
        return zzudVar == null ? zzud.zze() : zzudVar;
    }

    public final zzaip zzf() {
        return this.zzh;
    }
}
