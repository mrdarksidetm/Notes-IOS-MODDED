package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajy;

/* JADX INFO: loaded from: classes.dex */
public final class zzva extends zzajy<zzva, zza> implements zzale {
    private static final zzva zzc;
    private static volatile zzalp<zzva> zzd;
    private int zze;
    private int zzf;

    public static final class zza extends zzajy.zza<zzva, zza> implements zzale {
        private zza() {
            super(zzva.zzc);
        }

        public final zza zza(int i10) {
            zzh();
            ((zzva) this.zza).zzf = i10;
            return this;
        }

        public final zza zza(zzur zzurVar) {
            zzh();
            zzva.zza((zzva) this.zza, zzurVar);
            return this;
        }
    }

    static {
        zzva zzvaVar = new zzva();
        zzc = zzvaVar;
        zzajy.zza((Class<zzva>) zzva.class, zzvaVar);
    }

    private zzva() {
    }

    static /* synthetic */ void zza(zzva zzvaVar, zzur zzurVar) {
        zzvaVar.zze = zzurVar.zza();
    }

    public static zza zzc() {
        return zzc.zzm();
    }

    public static zzva zze() {
        return zzc;
    }

    public final int zza() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajy
    protected final Object zza(int i10, Object obj, Object obj2) {
        switch (zzuz.zza[i10 - 1]) {
            case 1:
                return new zzva();
            case 2:
                return new zza();
            case 3:
                return zzajy.zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzalp<zzva> zzcVar = zzd;
                if (zzcVar == null) {
                    synchronized (zzva.class) {
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

    public final zzur zzb() {
        zzur zzurVarZza = zzur.zza(this.zze);
        return zzurVarZza == null ? zzur.UNRECOGNIZED : zzurVarZza;
    }
}
