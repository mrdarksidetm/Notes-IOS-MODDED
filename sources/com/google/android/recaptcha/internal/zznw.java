package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zznw extends zzks implements zzly {
    private static final zznw zzb;
    private int zzd;
    private zzka zze;
    private int zzf;

    static {
        zznw zznwVar = new zznw();
        zzb = zznwVar;
        zzks.zzF(zznw.class, zznwVar);
    }

    private zznw() {
    }

    @Override // com.google.android.recaptcha.internal.zzks
    protected final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzks.zzC(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0004", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new zznw();
        }
        zznu zznuVar = null;
        if (i11 == 4) {
            return new zznv(zznuVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
