package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajy;

/* JADX INFO: loaded from: classes.dex */
public final class zztx extends zzajy<zztx, zza> implements zzale {
    private static final zztx zzc;
    private static volatile zzalp<zztx> zzd;
    private int zze;
    private zzvu zzf;

    public static final class zza extends zzajy.zza<zztx, zza> implements zzale {
        private zza() {
            super(zztx.zzc);
        }

        public final zza zza(zzvu zzvuVar) {
            zzh();
            zztx.zza((zztx) this.zza, zzvuVar);
            return this;
        }
    }

    static {
        zztx zztxVar = new zztx();
        zzc = zztxVar;
        zzajy.zza((Class<zztx>) zztx.class, zztxVar);
    }

    private zztx() {
    }

    public static zza zza() {
        return zzc.zzm();
    }

    static /* synthetic */ void zza(zztx zztxVar, zzvu zzvuVar) {
        zzvuVar.getClass();
        zztxVar.zzf = zzvuVar;
        zztxVar.zze |= 1;
    }

    public static zztx zzc() {
        return zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajy
    protected final Object zza(int i10, Object obj, Object obj2) {
        switch (zztw.zza[i10 - 1]) {
            case 1:
                return new zztx();
            case 2:
                return new zza();
            case 3:
                return zzajy.zza(zzc, "\u0000\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzalp<zztx> zzcVar = zzd;
                if (zzcVar == null) {
                    synchronized (zztx.class) {
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

    public final zzvu zzd() {
        zzvu zzvuVar = this.zzf;
        return zzvuVar == null ? zzvu.zzc() : zzvuVar;
    }
}
