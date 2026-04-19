package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzqa extends zzks implements zzly {
    private static final zzqa zzb;
    private int zzd;
    private String zze = "";

    static {
        zzqa zzqaVar = new zzqa();
        zzb = zzqaVar;
        zzks.zzF(zzqa.class, zzqaVar);
    }

    private zzqa() {
    }

    public static zzpz zzf() {
        return (zzpz) zzb.zzp();
    }

    static /* synthetic */ void zzi(zzqa zzqaVar, String str) {
        str.getClass();
        zzqaVar.zzd |= 1;
        zzqaVar.zze = str;
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
            return new zzqa();
        }
        zzpk zzpkVar = null;
        if (i11 == 4) {
            return new zzpz(zzpkVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
