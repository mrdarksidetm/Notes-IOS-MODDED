package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzpo extends zzks implements zzly {
    private static final zzpo zzb;
    private zziv zzd = zziv.zzb;

    static {
        zzpo zzpoVar = new zzpo();
        zzb = zzpoVar;
        zzks.zzF(zzpo.class, zzpoVar);
    }

    private zzpo() {
    }

    @Override // com.google.android.recaptcha.internal.zzks
    protected final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzks.zzC(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"zzd"});
        }
        if (i11 == 3) {
            return new zzpo();
        }
        zzpk zzpkVar = null;
        if (i11 == 4) {
            return new zzpn(zzpkVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
