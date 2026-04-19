package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzmz extends zzks implements zzly {
    private static final zzmz zzb;
    private long zzd;
    private int zze;

    static {
        zzmz zzmzVar = new zzmz();
        zzb = zzmzVar;
        zzks.zzF(zzmz.class, zzmzVar);
    }

    private zzmz() {
    }

    public static zzmy zzi() {
        return (zzmy) zzb.zzp();
    }

    public final int zzf() {
        return this.zze;
    }

    public final long zzg() {
        return this.zzd;
    }

    @Override // com.google.android.recaptcha.internal.zzks
    protected final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new zzmi(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new zzmz();
        }
        zzmx zzmxVar = null;
        if (i11 == 4) {
            return new zzmy(zzmxVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
