package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzql extends zzks implements zzly {
    private static final zzql zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private zzkx zzg = zzks.zzw();
    private int zzh;
    private int zzi;

    static {
        zzql zzqlVar = new zzql();
        zzb = zzqlVar;
        zzks.zzF(zzql.class, zzqlVar);
    }

    private zzql() {
    }

    public static zzqj zzf() {
        return (zzqj) zzb.zzp();
    }

    static /* synthetic */ void zzi(zzql zzqlVar, String str) {
        str.getClass();
        zzqlVar.zzd |= 1;
        zzqlVar.zze = str;
    }

    static /* synthetic */ void zzj(zzql zzqlVar, String str) {
        str.getClass();
        zzqlVar.zzd |= 2;
        zzqlVar.zzf = str;
    }

    static /* synthetic */ void zzk(zzql zzqlVar, int i10) {
        zzqlVar.zzh = 2;
        zzqlVar.zzd |= 4;
    }

    @Override // com.google.android.recaptcha.internal.zzks
    protected final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzks.zzC(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003'\u0004᠌\u0002\u0005င\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", zzqk.zza, "zzi"});
        }
        if (i11 == 3) {
            return new zzql();
        }
        zzqi zzqiVar = null;
        if (i11 == 4) {
            return new zzqj(zzqiVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
