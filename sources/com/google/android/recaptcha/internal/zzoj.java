package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzoj extends zzks implements zzly {
    private static final zzoj zzb;
    private String zzd = "";
    private String zze = "";

    static {
        zzoj zzojVar = new zzoj();
        zzb = zzojVar;
        zzks.zzF(zzoj.class, zzojVar);
    }

    private zzoj() {
    }

    @Override // com.google.android.recaptcha.internal.zzks
    protected final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzks.zzC(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new zzoj();
        }
        zzoh zzohVar = null;
        if (i11 == 4) {
            return new zzoi(zzohVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
