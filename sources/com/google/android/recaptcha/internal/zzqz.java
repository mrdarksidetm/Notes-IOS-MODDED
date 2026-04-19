package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzqz extends zzks implements zzly {
    private static final zzqz zzb;
    private int zzd;

    static {
        zzqz zzqzVar = new zzqz();
        zzb = zzqzVar;
        zzks.zzF(zzqz.class, zzqzVar);
    }

    private zzqz() {
    }

    public static zzqz zzg(byte[] bArr) {
        return (zzqz) zzks.zzv(zzb, bArr);
    }

    @Override // com.google.android.recaptcha.internal.zzks
    protected final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzks.zzC(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"zzd"});
        }
        if (i11 == 3) {
            return new zzqz();
        }
        zzqr zzqrVar = null;
        if (i11 == 4) {
            return new zzqy(zzqrVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzrc zzi() {
        zzrc zzrcVarZzb = zzrc.zzb(this.zzd);
        return zzrcVarZzb == null ? zzrc.UNRECOGNIZED : zzrcVarZzb;
    }
}
