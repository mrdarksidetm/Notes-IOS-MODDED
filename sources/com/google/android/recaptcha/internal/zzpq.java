package com.google.android.recaptcha.internal;

import java.io.InputStream;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzpq extends zzks implements zzly {
    private static final zzpq zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private zzky zzk = zzks.zzy();
    private zziv zzl = zziv.zzb;
    private String zzm = "";
    private zzps zzn;
    private zzpo zzo;

    static {
        zzpq zzpqVar = new zzpq();
        zzb = zzpqVar;
        zzks.zzF(zzpq.class, zzpqVar);
    }

    private zzpq() {
    }

    public static zzpq zzi(InputStream inputStream) {
        return (zzpq) zzks.zzu(zzb, inputStream);
    }

    public final String zzJ() {
        return this.zzh;
    }

    public final String zzK() {
        return this.zzg;
    }

    public final String zzL() {
        return this.zzi;
    }

    public final String zzM() {
        return this.zzj;
    }

    public final List zzN() {
        return this.zzk;
    }

    public final boolean zzO() {
        return (this.zzd & 256) != 0;
    }

    public final zziv zzf() {
        return this.zzl;
    }

    @Override // com.google.android.recaptcha.internal.zzks
    protected final Object zzh(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return zzks.zzC(zzb, "\u0000\u000b\u0000\u0001\u0001\f\u000b\u0000\u0001\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ለ\u0004\u0006ለ\u0005\u0007%\bည\u0006\tለ\u0007\u000bဉ\b\fဉ\t", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo"});
        }
        if (i11 == 3) {
            return new zzpq();
        }
        zzpk zzpkVar = null;
        if (i11 == 4) {
            return new zzpp(zzpkVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzps zzj() {
        zzps zzpsVar = this.zzn;
        return zzpsVar == null ? zzps.zzk() : zzpsVar;
    }

    public final String zzk() {
        return this.zzf;
    }
}
