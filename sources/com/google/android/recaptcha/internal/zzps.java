package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzps extends zzks implements zzly {
    private static final zzps zzb;
    private zziv zzd;
    private String zze;
    private long zzf;
    private zziv zzg;
    private String zzh;
    private String zzi;

    static {
        zzps zzpsVar = new zzps();
        zzb = zzpsVar;
        zzks.zzF(zzps.class, zzpsVar);
    }

    private zzps() {
        zziv zzivVar = zziv.zzb;
        this.zzd = zzivVar;
        this.zze = "";
        this.zzg = zzivVar;
        this.zzh = "";
        this.zzi = "";
    }

    public static zzps zzk() {
        return zzb;
    }

    public final String zzJ() {
        return this.zze;
    }

    public final long zzf() {
        return this.zzf;
    }

    public final zziv zzg() {
        return this.zzg;
    }

    @Override // com.google.android.recaptcha.internal.zzks
    protected final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzks.zzC(zzb, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\n\u0002Ȉ\u0003\u0002\u0004\n\u0005Ȉ\u0006Ȉ", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new zzps();
        }
        zzpk zzpkVar = null;
        if (i11 == 4) {
            return new zzpr(zzpkVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final zziv zzi() {
        return this.zzd;
    }
}
