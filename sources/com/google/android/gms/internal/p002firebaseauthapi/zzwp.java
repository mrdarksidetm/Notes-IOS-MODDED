package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajy;

/* JADX INFO: loaded from: classes.dex */
public final class zzwp extends zzajy<zzwp, zza> implements zzale {
    private static final zzwp zzc;
    private static volatile zzalp<zzwp> zzd;
    private int zze;
    private String zzf = "";
    private zzvu zzg;

    public static final class zza extends zzajy.zza<zzwp, zza> implements zzale {
        private zza() {
            super(zzwp.zzc);
        }

        public final zza zza(zzvu zzvuVar) {
            zzh();
            zzwp.zza((zzwp) this.zza, zzvuVar);
            return this;
        }

        public final zza zza(String str) {
            zzh();
            zzwp.zza((zzwp) this.zza, str);
            return this;
        }
    }

    static {
        zzwp zzwpVar = new zzwp();
        zzc = zzwpVar;
        zzajy.zza((Class<zzwp>) zzwp.class, zzwpVar);
    }

    private zzwp() {
    }

    public static zzwp zza(zzaip zzaipVar, zzajk zzajkVar) {
        return (zzwp) zzajy.zza(zzc, zzaipVar, zzajkVar);
    }

    static /* synthetic */ void zza(zzwp zzwpVar, zzvu zzvuVar) {
        zzvuVar.getClass();
        zzwpVar.zzg = zzvuVar;
        zzwpVar.zze |= 1;
    }

    static /* synthetic */ void zza(zzwp zzwpVar, String str) {
        str.getClass();
        zzwpVar.zzf = str;
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    public static zzwp zzd() {
        return zzc;
    }

    public final zzvu zza() {
        zzvu zzvuVar = this.zzg;
        return zzvuVar == null ? zzvu.zzc() : zzvuVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajy
    protected final Object zza(int i10, Object obj, Object obj2) {
        switch (zzwr.zza[i10 - 1]) {
            case 1:
                return new zzwp();
            case 2:
                return new zza();
            case 3:
                return zzajy.zza(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzalp<zzwp> zzcVar = zzd;
                if (zzcVar == null) {
                    synchronized (zzwp.class) {
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

    public final String zze() {
        return this.zzf;
    }
}
