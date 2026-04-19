package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajy;

/* JADX INFO: loaded from: classes.dex */
public final class zzsk extends zzajy<zzsk, zza> implements zzale {
    private static final zzsk zzc;
    private static volatile zzalp<zzsk> zzd;
    private int zze;

    public static final class zza extends zzajy.zza<zzsk, zza> implements zzale {
        private zza() {
            super(zzsk.zzc);
        }

        public final zza zza(int i10) {
            zzh();
            ((zzsk) this.zza).zze = i10;
            return this;
        }
    }

    static {
        zzsk zzskVar = new zzsk();
        zzc = zzskVar;
        zzajy.zza((Class<zzsk>) zzsk.class, zzskVar);
    }

    private zzsk() {
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    public static zzsk zzd() {
        return zzc;
    }

    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajy
    protected final Object zza(int i10, Object obj, Object obj2) {
        switch (zzsm.zza[i10 - 1]) {
            case 1:
                return new zzsk();
            case 2:
                return new zza();
            case 3:
                return zzajy.zza(zzc, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
            case 4:
                return zzc;
            case 5:
                zzalp<zzsk> zzcVar = zzd;
                if (zzcVar == null) {
                    synchronized (zzsk.class) {
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
}
