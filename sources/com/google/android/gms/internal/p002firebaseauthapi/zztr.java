package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajy;

/* JADX INFO: loaded from: classes.dex */
public final class zztr extends zzajy<zztr, zza> implements zzale {
    private static final zztr zzc;
    private static volatile zzalp<zztr> zzd;

    public static final class zza extends zzajy.zza<zztr, zza> implements zzale {
        private zza() {
            super(zztr.zzc);
        }
    }

    static {
        zztr zztrVar = new zztr();
        zzc = zztrVar;
        zzajy.zza((Class<zztr>) zztr.class, zztrVar);
    }

    private zztr() {
    }

    public static zztr zza(zzaip zzaipVar, zzajk zzajkVar) {
        return (zztr) zzajy.zza(zzc, zzaipVar, zzajkVar);
    }

    public static zztr zzb() {
        return zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajy
    protected final Object zza(int i10, Object obj, Object obj2) {
        switch (zztt.zza[i10 - 1]) {
            case 1:
                return new zztr();
            case 2:
                return new zza();
            case 3:
                return zzajy.zza(zzc, "\u0000\u0000", (Object[]) null);
            case 4:
                return zzc;
            case 5:
                zzalp<zztr> zzcVar = zzd;
                if (zzcVar == null) {
                    synchronized (zztr.class) {
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
