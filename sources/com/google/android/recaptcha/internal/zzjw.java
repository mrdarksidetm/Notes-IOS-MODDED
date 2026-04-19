package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzjw extends zzks implements zzly {
    private static final zzjw zzb;
    private int zzd;
    private long zzg;
    private long zzh;
    private double zzi;
    private byte zzl = 2;
    private zzkz zze = zzmh.zze();
    private String zzf = "";
    private zziv zzj = zziv.zzb;
    private String zzk = "";

    static {
        zzjw zzjwVar = new zzjw();
        zzb = zzjwVar;
        zzks.zzF(zzjw.class, zzjwVar);
    }

    private zzjw() {
    }

    @Override // com.google.android.recaptcha.internal.zzks
    protected final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzl);
        }
        if (i11 == 2) {
            return new zzmi(zzb, "\u0001\u0007\u0000\u0001\u0002\b\u0007\u0000\u0001\u0001\u0002Л\u0003ဈ\u0000\u0004ဃ\u0001\u0005ဂ\u0002\u0006က\u0003\u0007ည\u0004\bဈ\u0005", new Object[]{"zzd", "zze", zzjv.class, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i11 == 3) {
            return new zzjw();
        }
        zzji zzjiVar = null;
        if (i11 == 4) {
            return new zzjt(zzjiVar);
        }
        if (i11 == 5) {
            return zzb;
        }
        this.zzl = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
