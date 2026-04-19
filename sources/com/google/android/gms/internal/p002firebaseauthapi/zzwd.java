package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajy;

/* JADX INFO: loaded from: classes.dex */
public final class zzwd extends zzajy<zzwd, zza> implements zzale {
    private static final zzwd zzc;
    private static volatile zzalp<zzwd> zzd;
    private int zze;
    private zzakc<zzb> zzf = zzajy.zzp();

    public static final class zza extends zzajy.zza<zzwd, zza> implements zzale {
        private zza() {
            super(zzwd.zzc);
        }

        public final zza zza(int i10) {
            zzh();
            ((zzwd) this.zza).zze = i10;
            return this;
        }

        public final zza zza(zzb zzbVar) {
            zzh();
            zzwd.zza((zzwd) this.zza, zzbVar);
            return this;
        }
    }

    public static final class zzb extends zzajy<zzb, zza> implements zzale {
        private static final zzb zzc;
        private static volatile zzalp<zzb> zzd;
        private String zze = "";
        private int zzf;
        private int zzg;
        private int zzh;

        public static final class zza extends zzajy.zza<zzb, zza> implements zzale {
            private zza() {
                super(zzb.zzc);
            }

            public final zza zza(int i10) {
                zzh();
                ((zzb) this.zza).zzg = i10;
                return this;
            }

            public final zza zza(zzvv zzvvVar) {
                zzh();
                zzb.zza((zzb) this.zza, zzvvVar);
                return this;
            }

            public final zza zza(zzws zzwsVar) {
                zzh();
                zzb.zza((zzb) this.zza, zzwsVar);
                return this;
            }

            public final zza zza(String str) {
                zzh();
                zzb.zza((zzb) this.zza, str);
                return this;
            }
        }

        static {
            zzb zzbVar = new zzb();
            zzc = zzbVar;
            zzajy.zza((Class<zzb>) zzb.class, zzbVar);
        }

        private zzb() {
        }

        public static zza zza() {
            return zzc.zzm();
        }

        static /* synthetic */ void zza(zzb zzbVar, zzvv zzvvVar) {
            zzbVar.zzf = zzvvVar.zza();
        }

        static /* synthetic */ void zza(zzb zzbVar, zzws zzwsVar) {
            zzbVar.zzh = zzwsVar.zza();
        }

        static /* synthetic */ void zza(zzb zzbVar, String str) {
            str.getClass();
            zzbVar.zze = str;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajy
        protected final Object zza(int i10, Object obj, Object obj2) {
            switch (zzwf.zza[i10 - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza();
                case 3:
                    return zzajy.zza(zzc, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
                case 4:
                    return zzc;
                case 5:
                    zzalp<zzb> zzcVar = zzd;
                    if (zzcVar == null) {
                        synchronized (zzb.class) {
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

    static {
        zzwd zzwdVar = new zzwd();
        zzc = zzwdVar;
        zzajy.zza((Class<zzwd>) zzwd.class, zzwdVar);
    }

    private zzwd() {
    }

    public static zza zza() {
        return zzc.zzm();
    }

    static /* synthetic */ void zza(zzwd zzwdVar, zzb zzbVar) {
        zzbVar.getClass();
        zzakc<zzb> zzakcVar = zzwdVar.zzf;
        if (!zzakcVar.zzc()) {
            zzwdVar.zzf = zzajy.zza(zzakcVar);
        }
        zzwdVar.zzf.add(zzbVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajy
    protected final Object zza(int i10, Object obj, Object obj2) {
        switch (zzwf.zza[i10 - 1]) {
            case 1:
                return new zzwd();
            case 2:
                return new zza();
            case 3:
                return zzajy.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", zzb.class});
            case 4:
                return zzc;
            case 5:
                zzalp<zzwd> zzcVar = zzd;
                if (zzcVar == null) {
                    synchronized (zzwd.class) {
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
