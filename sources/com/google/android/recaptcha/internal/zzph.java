package com.google.android.recaptcha.internal;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzph extends zzks implements zzly {
    private static final zzph zzb;
    private zzkz zzd = zzks.zzz();

    static {
        zzph zzphVar = new zzph();
        zzb = zzphVar;
        zzks.zzF(zzph.class, zzphVar);
    }

    private zzph() {
    }

    public static zzph zzg() {
        return zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzks
    protected final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzks.zzC(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"zzd"});
        }
        if (i11 == 3) {
            return new zzph();
        }
        zzpf zzpfVar = null;
        if (i11 == 4) {
            return new zzpg(zzpfVar);
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
