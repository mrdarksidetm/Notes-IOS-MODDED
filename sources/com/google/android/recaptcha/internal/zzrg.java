package com.google.android.recaptcha.internal;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzrg extends zzks implements zzly {
    private static final zzrg zzb;
    private zzkz zzd = zzks.zzz();

    static {
        zzrg zzrgVar = new zzrg();
        zzb = zzrgVar;
        zzks.zzF(zzrg.class, zzrgVar);
    }

    private zzrg() {
    }

    public static zzrg zzg(byte[] bArr) {
        return (zzrg) zzks.zzv(zzb, bArr);
    }

    @Override // com.google.android.recaptcha.internal.zzks
    protected final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzks.zzC(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zzrs.class});
        }
        if (i11 == 3) {
            return new zzrg();
        }
        zzqr zzqrVar = null;
        if (i11 == 4) {
            return new zzrf(zzqrVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final List zzi() {
        return this.zzd;
    }
}
