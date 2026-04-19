package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzjk extends zzko {
    private static final zzjk zzd;
    private int zze;
    private boolean zzf;
    private zzjs zzg;
    private boolean zzh;
    private byte zzj = 2;
    private zzkz zzi = zzmh.zze();

    static {
        zzjk zzjkVar = new zzjk();
        zzd = zzjkVar;
        zzks.zzF(zzjk.class, zzjkVar);
    }

    private zzjk() {
    }

    public static zzjk zzg() {
        return zzd;
    }

    @Override // com.google.android.recaptcha.internal.zzks
    protected final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return Byte.valueOf(this.zzj);
        }
        if (i11 == 2) {
            return new zzmi(zzd, "\u0001\u0004\u0000\u0001\u0001ϧ\u0004\u0000\u0001\u0002\u0001ဇ\u0000\u0002ᐉ\u0001\u0003ဇ\u0002ϧЛ", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", zzjw.class});
        }
        if (i11 == 3) {
            return new zzjk();
        }
        zzji zzjiVar = null;
        if (i11 == 4) {
            return new zzjj(zzjiVar);
        }
        if (i11 == 5) {
            return zzd;
        }
        this.zzj = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
