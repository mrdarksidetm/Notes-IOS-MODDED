package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajy;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class zzuo extends zzajy<zzuo, zza> implements zzale {
    private static final zzuo zzc;
    private static volatile zzalp<zzuo> zzd;
    private int zze;
    private zzaip zzf = zzaip.zza;
    private zzwd zzg;

    public static final class zza extends zzajy.zza<zzuo, zza> implements zzale {
        private zza() {
            super(zzuo.zzc);
        }

        public final zza zza() {
            zzh();
            zzuo.zza((zzuo) this.zza);
            return this;
        }

        public final zza zza(zzaip zzaipVar) {
            zzh();
            zzuo.zza((zzuo) this.zza, zzaipVar);
            return this;
        }

        public final zza zza(zzwd zzwdVar) {
            zzh();
            zzuo.zza((zzuo) this.zza, zzwdVar);
            return this;
        }
    }

    static {
        zzuo zzuoVar = new zzuo();
        zzc = zzuoVar;
        zzajy.zza((Class<zzuo>) zzuo.class, zzuoVar);
    }

    private zzuo() {
    }

    public static zza zza() {
        return zzc.zzm();
    }

    public static zzuo zza(InputStream inputStream, zzajk zzajkVar) {
        return (zzuo) zzajy.zza(zzc, inputStream, zzajkVar);
    }

    static /* synthetic */ void zza(zzuo zzuoVar) {
        zzuoVar.zzg = null;
        zzuoVar.zze &= -2;
    }

    static /* synthetic */ void zza(zzuo zzuoVar, zzaip zzaipVar) {
        zzaipVar.getClass();
        zzuoVar.zzf = zzaipVar;
    }

    static /* synthetic */ void zza(zzuo zzuoVar, zzwd zzwdVar) {
        zzwdVar.getClass();
        zzuoVar.zzg = zzwdVar;
        zzuoVar.zze |= 1;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajy
    protected final Object zza(int i10, Object obj, Object obj2) {
        switch (zzuq.zza[i10 - 1]) {
            case 1:
                return new zzuo();
            case 2:
                return new zza();
            case 3:
                return zzajy.zza(zzc, "\u0000\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003ဉ\u0000", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzalp<zzuo> zzcVar = zzd;
                if (zzcVar == null) {
                    synchronized (zzuo.class) {
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

    public final zzaip zzc() {
        return this.zzf;
    }
}
