package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajy;

/* JADX INFO: loaded from: classes.dex */
public final class zzvu extends zzajy<zzvu, zza> implements zzale {
    private static final zzvu zzc;
    private static volatile zzalp<zzvu> zzd;
    private String zze = "";
    private zzaip zzf = zzaip.zza;
    private int zzg;

    public static final class zza extends zzajy.zza<zzvu, zza> implements zzale {
        private zza() {
            super(zzvu.zzc);
        }

        public final zza zza(zzaip zzaipVar) {
            zzh();
            zzvu.zza((zzvu) this.zza, zzaipVar);
            return this;
        }

        public final zza zza(zzws zzwsVar) {
            zzh();
            zzvu.zza((zzvu) this.zza, zzwsVar);
            return this;
        }

        public final zza zza(String str) {
            zzh();
            zzvu.zza((zzvu) this.zza, str);
            return this;
        }
    }

    static {
        zzvu zzvuVar = new zzvu();
        zzc = zzvuVar;
        zzajy.zza((Class<zzvu>) zzvu.class, zzvuVar);
    }

    private zzvu() {
    }

    public static zza zza() {
        return zzc.zzm();
    }

    public static zza zza(zzvu zzvuVar) {
        return zzc.zzm().zza(zzvuVar);
    }

    public static zzvu zza(byte[] bArr, zzajk zzajkVar) {
        return (zzvu) zzajy.zza(zzc, bArr, zzajkVar);
    }

    static /* synthetic */ void zza(zzvu zzvuVar, zzaip zzaipVar) {
        zzaipVar.getClass();
        zzvuVar.zzf = zzaipVar;
    }

    static /* synthetic */ void zza(zzvu zzvuVar, zzws zzwsVar) {
        zzvuVar.zzg = zzwsVar.zza();
    }

    static /* synthetic */ void zza(zzvu zzvuVar, String str) {
        str.getClass();
        zzvuVar.zze = str;
    }

    public static zzvu zzc() {
        return zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajy
    protected final Object zza(int i10, Object obj, Object obj2) {
        switch (zzvw.zza[i10 - 1]) {
            case 1:
                return new zzvu();
            case 2:
                return new zza();
            case 3:
                return zzajy.zza(zzc, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzalp<zzvu> zzcVar = zzd;
                if (zzcVar == null) {
                    synchronized (zzvu.class) {
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

    public final zzws zzd() {
        zzws zzwsVarZza = zzws.zza(this.zzg);
        return zzwsVarZza == null ? zzws.UNRECOGNIZED : zzwsVarZza;
    }

    public final zzaip zze() {
        return this.zzf;
    }

    public final String zzf() {
        return this.zze;
    }
}
