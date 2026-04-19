package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajy;

/* JADX INFO: loaded from: classes.dex */
public final class zzud extends zzajy<zzud, zza> implements zzale {
    private static final zzud zzc;
    private static volatile zzalp<zzud> zzd;
    private int zze;
    private zzum zzf;
    private zztx zzg;
    private int zzh;

    public static final class zza extends zzajy.zza<zzud, zza> implements zzale {
        private zza() {
            super(zzud.zzc);
        }

        public final zza zza(zztu zztuVar) {
            zzh();
            zzud.zza((zzud) this.zza, zztuVar);
            return this;
        }

        public final zza zza(zztx zztxVar) {
            zzh();
            zzud.zza((zzud) this.zza, zztxVar);
            return this;
        }

        public final zza zza(zzum zzumVar) {
            zzh();
            zzud.zza((zzud) this.zza, zzumVar);
            return this;
        }
    }

    static {
        zzud zzudVar = new zzud();
        zzc = zzudVar;
        zzajy.zza((Class<zzud>) zzud.class, zzudVar);
    }

    private zzud() {
    }

    static /* synthetic */ void zza(zzud zzudVar, zztu zztuVar) {
        zzudVar.zzh = zztuVar.zza();
    }

    static /* synthetic */ void zza(zzud zzudVar, zztx zztxVar) {
        zztxVar.getClass();
        zzudVar.zzg = zztxVar;
        zzudVar.zze |= 2;
    }

    static /* synthetic */ void zza(zzud zzudVar, zzum zzumVar) {
        zzumVar.getClass();
        zzudVar.zzf = zzumVar;
        zzudVar.zze |= 1;
    }

    public static zza zzc() {
        return zzc.zzm();
    }

    public static zzud zze() {
        return zzc;
    }

    public final zztu zza() {
        zztu zztuVarZza = zztu.zza(this.zzh);
        return zztuVarZza == null ? zztu.UNRECOGNIZED : zztuVarZza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajy
    protected final Object zza(int i10, Object obj, Object obj2) {
        switch (zzuc.zza[i10 - 1]) {
            case 1:
                return new zzud();
            case 2:
                return new zza();
            case 3:
                return zzajy.zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzalp<zzud> zzcVar = zzd;
                if (zzcVar == null) {
                    synchronized (zzud.class) {
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

    public final zztx zzb() {
        zztx zztxVar = this.zzg;
        return zztxVar == null ? zztx.zzc() : zztxVar;
    }

    public final zzum zzf() {
        zzum zzumVar = this.zzf;
        return zzumVar == null ? zzum.zzc() : zzumVar;
    }
}
