package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzpb extends zzks implements zzly {
    private static final zzpb zzb;
    private int zzd;
    private zzog zzf;
    private zzoa zzg;
    private zzoj zzh;
    private String zze = "";
    private String zzi = "";
    private String zzj = "";

    static {
        zzpb zzpbVar = new zzpb();
        zzb = zzpbVar;
        zzks.zzF(zzpb.class, zzpbVar);
    }

    private zzpb() {
    }

    static /* synthetic */ void zzJ(zzpb zzpbVar, zzoa zzoaVar) {
        zzoaVar.getClass();
        zzpbVar.zzg = zzoaVar;
        zzpbVar.zzd |= 2;
    }

    public static zzpa zzf() {
        return (zzpa) zzb.zzp();
    }

    static /* synthetic */ void zzi(zzpb zzpbVar, String str) {
        str.getClass();
        zzpbVar.zze = str;
    }

    static /* synthetic */ void zzj(zzpb zzpbVar, String str) {
        str.getClass();
        zzpbVar.zzi = str;
    }

    static /* synthetic */ void zzk(zzpb zzpbVar, String str) {
        str.getClass();
        zzpbVar.zzj = str;
    }

    @Override // com.google.android.recaptcha.internal.zzks
    protected final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzks.zzC(zzb, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005Ȉ\u0006Ȉ", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i11 == 3) {
            return new zzpb();
        }
        zzoz zzozVar = null;
        if (i11 == 4) {
            return new zzpa(zzozVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
