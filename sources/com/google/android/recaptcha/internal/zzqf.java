package com.google.android.recaptcha.internal;

import java.io.InputStream;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzqf extends zzks implements zzly {
    private static final zzqf zzb;
    private int zzd;
    private long zzf;
    private int zzg;
    private String zze = "";
    private zzkz zzh = zzks.zzz();
    private zziv zzi = zziv.zzb;
    private String zzj = "";
    private String zzk = "";

    static {
        zzqf zzqfVar = new zzqf();
        zzb = zzqfVar;
        zzks.zzF(zzqf.class, zzqfVar);
    }

    private zzqf() {
    }

    public static zzqf zzi(InputStream inputStream) {
        return (zzqf) zzks.zzu(zzb, inputStream);
    }

    public final zziv zzf() {
        return this.zzi;
    }

    @Override // com.google.android.recaptcha.internal.zzks
    protected final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzks.zzC(zzb, "\u0000\u0007\u0000\u0001\u0001\b\u0007\u0000\u0001\u0000\u0001ለ\u0000\u0002ဂ\u0001\u0004ဌ\u0002\u0005\u001b\u0006ည\u0003\u0007ለ\u0004\bለ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", zzqh.class, "zzi", "zzj", "zzk"});
        }
        if (i11 == 3) {
            return new zzqf();
        }
        zzqb zzqbVar = null;
        if (i11 == 4) {
            return new zzqe(zzqbVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final String zzj() {
        return this.zze;
    }

    public final List zzk() {
        return this.zzh;
    }
}
