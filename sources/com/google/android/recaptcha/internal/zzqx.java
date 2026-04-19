package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes2.dex */
public final class zzqx extends zzks implements zzly {
    private static final zzqx zzb;
    private String zzd = "";
    private String zze = "";

    static {
        zzqx zzqxVar = new zzqx();
        zzb = zzqxVar;
        zzks.zzF(zzqx.class, zzqxVar);
    }

    private zzqx() {
    }

    public static zzqw zzf() {
        return (zzqw) zzb.zzp();
    }

    static /* synthetic */ void zzi(zzqx zzqxVar, String str) {
        str.getClass();
        zzqxVar.zzd = str;
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
            return new zzqx();
        }
        zzqr zzqrVar = null;
        if (i11 == 4) {
            return new zzqw(zzqrVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
