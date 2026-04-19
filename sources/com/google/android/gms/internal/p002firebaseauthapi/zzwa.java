package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajy;
import com.google.android.gms.internal.p002firebaseauthapi.zzvq;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzwa extends zzajy<zzwa, zza> implements zzale {
    private static final zzwa zzc;
    private static volatile zzalp<zzwa> zzd;
    private int zze;
    private zzakc<zzb> zzf = zzajy.zzp();

    public static final class zza extends zzajy.zza<zzwa, zza> implements zzale {
        private zza() {
            super(zzwa.zzc);
        }

        public final zza zza(int i10) {
            zzh();
            ((zzwa) this.zza).zze = i10;
            return this;
        }

        public final zza zza(zzb zzbVar) {
            zzh();
            zzwa.zza((zzwa) this.zza, zzbVar);
            return this;
        }
    }

    public static final class zzb extends zzajy<zzb, zza> implements zzale {
        private static final zzb zzc;
        private static volatile zzalp<zzb> zzd;
        private int zze;
        private zzvq zzf;
        private int zzg;
        private int zzh;
        private int zzi;

        public static final class zza extends zzajy.zza<zzb, zza> implements zzale {
            private zza() {
                super(zzb.zzc);
            }

            public final zza zza(int i10) {
                zzh();
                ((zzb) this.zza).zzh = i10;
                return this;
            }

            public final zza zza(zzvq.zza zzaVar) {
                zzh();
                zzb.zza((zzb) this.zza, (zzvq) ((zzajy) zzaVar.zze()));
                return this;
            }

            public final zza zza(zzvq zzvqVar) {
                zzh();
                zzb.zza((zzb) this.zza, zzvqVar);
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
        }

        static {
            zzb zzbVar = new zzb();
            zzc = zzbVar;
            zzajy.zza((Class<zzb>) zzb.class, zzbVar);
        }

        private zzb() {
        }

        static /* synthetic */ void zza(zzb zzbVar, zzvq zzvqVar) {
            zzvqVar.getClass();
            zzbVar.zzf = zzvqVar;
            zzbVar.zze |= 1;
        }

        static /* synthetic */ void zza(zzb zzbVar, zzvv zzvvVar) {
            zzbVar.zzg = zzvvVar.zza();
        }

        static /* synthetic */ void zza(zzb zzbVar, zzws zzwsVar) {
            zzbVar.zzi = zzwsVar.zza();
        }

        public static zza zzd() {
            return zzc.zzm();
        }

        public final boolean e_() {
            return (this.zze & 1) != 0;
        }

        public final int zza() {
            return this.zzh;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajy
        protected final Object zza(int i10, Object obj, Object obj2) {
            switch (zzwc.zza[i10 - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza();
                case 3:
                    return zzajy.zza(zzc, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
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

        public final zzvq zzb() {
            zzvq zzvqVar = this.zzf;
            return zzvqVar == null ? zzvq.zzd() : zzvqVar;
        }

        public final zzvv zzc() {
            zzvv zzvvVarZza = zzvv.zza(this.zzg);
            return zzvvVarZza == null ? zzvv.UNRECOGNIZED : zzvvVarZza;
        }

        public final zzws zzf() {
            zzws zzwsVarZza = zzws.zza(this.zzi);
            return zzwsVarZza == null ? zzws.UNRECOGNIZED : zzwsVarZza;
        }
    }

    static {
        zzwa zzwaVar = new zzwa();
        zzc = zzwaVar;
        zzajy.zza((Class<zzwa>) zzwa.class, zzwaVar);
    }

    private zzwa() {
    }

    public static zzwa zza(InputStream inputStream, zzajk zzajkVar) {
        return (zzwa) zzajy.zza(zzc, inputStream, zzajkVar);
    }

    public static zzwa zza(byte[] bArr, zzajk zzajkVar) {
        return (zzwa) zzajy.zza(zzc, bArr, zzajkVar);
    }

    static /* synthetic */ void zza(zzwa zzwaVar, zzb zzbVar) {
        zzbVar.getClass();
        zzakc<zzb> zzakcVar = zzwaVar.zzf;
        if (!zzakcVar.zzc()) {
            zzwaVar.zzf = zzajy.zza(zzakcVar);
        }
        zzwaVar.zzf.add(zzbVar);
    }

    public static zza zzc() {
        return zzc.zzm();
    }

    public final int zza() {
        return this.zzf.size();
    }

    public final zzb zza(int i10) {
        return this.zzf.get(i10);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajy
    protected final Object zza(int i10, Object obj, Object obj2) {
        switch (zzwc.zza[i10 - 1]) {
            case 1:
                return new zzwa();
            case 2:
                return new zza();
            case 3:
                return zzajy.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", zzb.class});
            case 4:
                return zzc;
            case 5:
                zzalp<zzwa> zzcVar = zzd;
                if (zzcVar == null) {
                    synchronized (zzwa.class) {
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

    public final int zzb() {
        return this.zze;
    }

    public final List<zzb> zze() {
        return this.zzf;
    }
}
