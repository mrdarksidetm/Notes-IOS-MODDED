package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajy;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class zzvx extends zzajy<zzvx, zza> implements zzale {
    private static final zzvx zzc;
    private static volatile zzalp<zzvx> zzd;
    private int zzg;
    private boolean zzh;
    private String zze = "";
    private String zzf = "";
    private String zzi = "";

    public static final class zza extends zzajy.zza<zzvx, zza> implements zzale {
        private zza() {
            super(zzvx.zzc);
        }
    }

    static {
        zzvx zzvxVar = new zzvx();
        zzc = zzvxVar;
        zzajy.zza((Class<zzvx>) zzvx.class, zzvxVar);
    }

    private zzvx() {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajy
    protected final Object zza(int i10, Object obj, Object obj2) {
        switch (zzvz.zza[i10 - 1]) {
            case 1:
                return new zzvx();
            case 2:
                return new zza();
            case 3:
                return zzajy.zza(zzc, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                zzalp<zzvx> zzcVar = zzd;
                if (zzcVar == null) {
                    synchronized (zzvx.class) {
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
