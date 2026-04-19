package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzqd extends zzks implements zzly {
    private static final zzqd zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";
    private zzpw zzl;

    static {
        zzqd zzqdVar = new zzqd();
        zzb = zzqdVar;
        zzks.zzF(zzqd.class, zzqdVar);
    }

    private zzqd() {
    }

    static /* synthetic */ void zzJ(zzqd zzqdVar, String str) {
        str.getClass();
        zzqdVar.zzd |= 32;
        zzqdVar.zzj = str;
    }

    static /* synthetic */ void zzK(zzqd zzqdVar, String str) {
        str.getClass();
        zzqdVar.zzd |= 64;
        zzqdVar.zzk = str;
    }

    static /* synthetic */ void zzL(zzqd zzqdVar, zzpw zzpwVar) {
        zzpwVar.getClass();
        zzqdVar.zzl = zzpwVar;
        zzqdVar.zzd |= 128;
    }

    static /* synthetic */ void zzM(zzqd zzqdVar, String str) {
        str.getClass();
        zzqdVar.zzd |= 2;
        zzqdVar.zzf = str;
    }

    static /* synthetic */ void zzN(zzqd zzqdVar, String str) {
        str.getClass();
        zzqdVar.zzd |= 4;
        zzqdVar.zzg = str;
    }

    public static zzqc zzf() {
        return (zzqc) zzb.zzp();
    }

    static /* synthetic */ void zzi(zzqd zzqdVar, String str) {
        str.getClass();
        zzqdVar.zzd |= 1;
        zzqdVar.zze = str;
    }

    static /* synthetic */ void zzj(zzqd zzqdVar, String str) {
        str.getClass();
        zzqdVar.zzd |= 8;
        zzqdVar.zzh = str;
    }

    static /* synthetic */ void zzk(zzqd zzqdVar, String str) {
        str.getClass();
        zzqdVar.zzd |= 16;
        zzqdVar.zzi = str;
    }

    @Override // com.google.android.recaptcha.internal.zzks
    protected final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzks.zzC(zzb, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ለ\u0004\u0006ለ\u0005\u0007ለ\u0006\bဉ\u0007", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i11 == 3) {
            return new zzqd();
        }
        zzqb zzqbVar = null;
        if (i11 == 4) {
            return new zzqc(zzqbVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
