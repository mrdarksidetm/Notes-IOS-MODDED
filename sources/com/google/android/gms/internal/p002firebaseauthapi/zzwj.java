package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajy;

/* JADX INFO: loaded from: classes.dex */
public final class zzwj extends zzajy<zzwj, zza> implements zzale {
    private static final zzwj zzc;
    private static volatile zzalp<zzwj> zzd;
    private String zze = "";

    public static final class zza extends zzajy.zza<zzwj, zza> implements zzale {
        private zza() {
            super(zzwj.zzc);
        }

        public final zza zza(String str) {
            zzh();
            zzwj.zza((zzwj) this.zza, str);
            return this;
        }
    }

    static {
        zzwj zzwjVar = new zzwj();
        zzc = zzwjVar;
        zzajy.zza((Class<zzwj>) zzwj.class, zzwjVar);
    }

    private zzwj() {
    }

    public static zza zza() {
        return zzc.zzm();
    }

    public static zzwj zza(zzaip zzaipVar, zzajk zzajkVar) {
        return (zzwj) zzajy.zza(zzc, zzaipVar, zzajkVar);
    }

    static /* synthetic */ void zza(zzwj zzwjVar, String str) {
        str.getClass();
        zzwjVar.zze = str;
    }

    public static zzwj zzc() {
        return zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajy
    protected final Object zza(int i10, Object obj, Object obj2) {
        switch (zzwl.zza[i10 - 1]) {
            case 1:
                return new zzwj();
            case 2:
                return new zza();
            case 3:
                return zzajy.zza(zzc, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zze"});
            case 4:
                return zzc;
            case 5:
                zzalp<zzwj> zzcVar = zzd;
                if (zzcVar == null) {
                    synchronized (zzwj.class) {
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

    public final String zzd() {
        return this.zze;
    }
}
