package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzqh extends zzks implements zzly {
    private static final zzqh zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        zzqh zzqhVar = new zzqh();
        zzb = zzqhVar;
        zzks.zzF(zzqh.class, zzqhVar);
    }

    private zzqh() {
    }

    public final String zzg() {
        return this.zze;
    }

    @Override // com.google.android.recaptcha.internal.zzks
    protected final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzks.zzC(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new zzqh();
        }
        zzqb zzqbVar = null;
        if (i11 == 4) {
            return new zzqg(zzqbVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final String zzi() {
        return this.zzf;
    }
}
