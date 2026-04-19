package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajy;

/* JADX INFO: loaded from: classes.dex */
public final class zzami extends zzajy<zzami, zza> implements zzale {
    private static final zzami zzc;
    private static volatile zzalp<zzami> zzd;
    private long zze;
    private int zzf;

    public static final class zza extends zzajy.zza<zzami, zza> implements zzale {
        private zza() {
            super(zzami.zzc);
        }

        public final zza zza(int i10) {
            if (!this.zza.zzu()) {
                zzi();
            }
            ((zzami) this.zza).zzf = i10;
            return this;
        }

        public final zza zza(long j10) {
            if (!this.zza.zzu()) {
                zzi();
            }
            ((zzami) this.zza).zze = j10;
            return this;
        }
    }

    static {
        zzami zzamiVar = new zzami();
        zzc = zzamiVar;
        zzajy.zza((Class<zzami>) zzami.class, zzamiVar);
    }

    private zzami() {
    }

    public static zza zzc() {
        return zzc.zzm();
    }

    public final int zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajy
    protected final Object zza(int i10, Object obj, Object obj2) {
        switch (zzamk.zza[i10 - 1]) {
            case 1:
                return new zzami();
            case 2:
                return new zza();
            case 3:
                return zzajy.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzalp<zzami> zzcVar = zzd;
                if (zzcVar == null) {
                    synchronized (zzami.class) {
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

    public final long zzb() {
        return this.zze;
    }
}
