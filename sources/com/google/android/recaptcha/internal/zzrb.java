package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzrb extends zzks implements zzly {
    private static final zzrb zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        zzrb zzrbVar = new zzrb();
        zzb = zzrbVar;
        zzks.zzF(zzrb.class, zzrbVar);
    }

    private zzrb() {
    }

    public static zzrb zzg(byte[] bArr) {
        return (zzrb) zzks.zzv(zzb, bArr);
    }

    @Override // com.google.android.recaptcha.internal.zzks
    protected final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzks.zzC(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new zzrb();
        }
        zzqr zzqrVar = null;
        if (i11 == 4) {
            return new zzra(zzqrVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzrc zzi() {
        zzrc zzrcVarZzb = zzrc.zzb(this.zzf);
        return zzrcVarZzb == null ? zzrc.UNRECOGNIZED : zzrcVarZzb;
    }
}
