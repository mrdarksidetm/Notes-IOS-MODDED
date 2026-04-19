package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzpu extends zzks implements zzly {
    private static final zzpu zzb;
    private int zzd;
    private String zze = "";

    static {
        zzpu zzpuVar = new zzpu();
        zzb = zzpuVar;
        zzks.zzF(zzpu.class, zzpuVar);
    }

    private zzpu() {
    }

    public static zzpt zzf() {
        return (zzpt) zzb.zzp();
    }

    static /* synthetic */ void zzi(zzpu zzpuVar, String str) {
        zzpuVar.zzd |= 1;
        zzpuVar.zze = str;
    }

    @Override // com.google.android.recaptcha.internal.zzks
    protected final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzks.zzC(zzb, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new zzpu();
        }
        zzpk zzpkVar = null;
        if (i11 == 4) {
            return new zzpt(zzpkVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
